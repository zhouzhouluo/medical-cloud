package com.zhou.medical.manager.api.system;

import com.zhou.medical.common.controller.BaseController;
import com.zhou.medical.common.entity.MessageCode;
import com.zhou.medical.common.entity.Pager;
import com.zhou.medical.common.entity.Results;
import com.zhou.medical.common.entity.health.ScienceArticle;
import com.zhou.medical.common.entity.health.ScienceColumn;
import com.zhou.medical.common.util.FileFilterUtils;
import com.zhou.medical.common.util.UploadFilesUtils;
import com.zhou.medical.log.annotation.SystemControllerLog;
import com.zhou.medical.manager.client.health.ScienceArticleFeignClient;
import com.zhou.medical.manager.client.health.ScienceColumnFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author zhouzhou
 *
 */
@Controller
@RequestMapping("/sys/scienceArticle")
public class SystemScienceArticleController extends BaseController {

	@Resource
	private ScienceColumnFeignClient scienceColumnFeignClient;

	@Resource
	private ScienceArticleFeignClient scienceArticleFeignClient;


	/**
	 * 用户管理页
	 *
	 * @return
	 */
	@SystemControllerLog("管理页面")
	@RequestMapping(value = "/manager", method = RequestMethod.GET)
	public String manager(Model model) {
		List<ScienceColumn> scienceColumnList = scienceColumnFeignClient.getList("selectAll", new ScienceColumn());
		model.addAttribute("scienceColumnList", scienceColumnList);
		return "/sys/science/scienceArticle";
	}

	/**
	 * 用户管理页
	 *
	 * @return
	 */
	@RequestMapping(value = "/findUserPage")
	@ResponseBody
	@SystemControllerLog("查找健康科普文章信息")
	public Map<String, Object> findUserPage(HttpServletResponse response, Integer columnId, String keyword,
                                            @RequestParam(value = "page", defaultValue = "1") Long page,
                                            @RequestParam(value = "rows", defaultValue = "10") Long rows) {
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			if (StringUtils.isNotBlank(keyword)) {
				// java : 字符解码
				keyword = java.net.URLDecoder.decode(keyword, "UTF-8");
				// map.put("keyword", keyword);
				Pager<ScienceArticle> scienceArticlePage = scienceArticleFeignClient.selectKeyWordBySys("selectKeyWordBySys",
						getPageIndex(page), getPageSize(rows), keyword);
				map.put("total", scienceArticlePage.getTotalCount());
				map.put("rows", scienceArticlePage.getList());
			} else {
				// map.put("columnId", columnId);
				Pager<ScienceArticle> scienceArticlePage;
				if (columnId == null || columnId == 0) {
					scienceArticlePage = scienceArticleFeignClient.getPager("getAll", getPageIndex(page), getPageSize(rows),
							0);
				} else {
					scienceArticlePage = scienceArticleFeignClient.getPager("getByColumnId", getPageIndex(page),
							getPageSize(rows), columnId);
				}

				map.put("total", scienceArticlePage.getTotalCount());
				map.put("rows", scienceArticlePage.getList());
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put("total", 0);
			map.put("rows", "");
		}

		return map;
	}

	/**
	 * 
	 * @Title: queryPage @Description: TODO @param @param model @param @param
	 *         id @param @return 设定文件 @return String 返回类型 @throws
	 */
	@SystemControllerLog("详情页面")
	@RequestMapping(value = "/queryPage", method = RequestMethod.GET)
	public String queryPage(Model model, int id) {
		ScienceArticle scienceArticle = scienceArticleFeignClient.findById("selectByPrimaryKey", id);
		model.addAttribute("scienceArticle", scienceArticle);
		ScienceColumn scienceColumn = scienceColumnFeignClient.findById("selectByPrimaryKey", scienceArticle.getColumnId());
		model.addAttribute("scienceColumn", scienceColumn);
		return "/sys/science/scienceArticleQuery";
	}

	/**
	 * 
	 * @Title: delete @Description: TODO @param @param request @param @param
	 *         id @param @return 设定文件 @return Results<Map<String,Object>>
	 *         返回类型 @throws
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	@SystemControllerLog("删除健康科普文章")
	public Results<Map<String, Object>> delete(HttpServletRequest request, int id) {
		Results<Map<String, Object>> results = new Results<Map<String, Object>>();

		ScienceArticle scienceArticle = scienceArticleFeignClient.findById("selectByPrimaryKey", id);

		if (scienceArticle == null) {
			results.setCode(MessageCode.CODE_404);
			results.setMessage(MessageCode.MESSAGE_404);
			return results;
		}

		try {

			scienceArticleFeignClient.delete("deleteByPrimaryKey", scienceArticle);
			results.setCode(MessageCode.CODE_200);
			results.setMessage(MessageCode.MESSAGE_200);

			return results;
		} catch (Exception e) {
			// TODO: handle exception
			results.setCode(MessageCode.CODE_404);
			results.setMessage(e.getMessage());
			return results;
		}
	}

	@SystemControllerLog("添加页面")
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String addPage(Model model) {
		List<ScienceColumn> scienceColumnList = scienceColumnFeignClient.getList("selectAll", new ScienceColumn());
		model.addAttribute("scienceColumnList", scienceColumnList);
		return "/sys/science/scienceArticleAdd";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	@SystemControllerLog("增加文章")
	public Results<Map<String, Object>> add(HttpServletRequest request, ScienceArticle scienceArticle_,
                                            MultipartFile file) {
		Results<Map<String, Object>> results = new Results<Map<String, Object>>();

		ScienceArticle scienceArticle = scienceArticleFeignClient.findByParam("selectByTitle", scienceArticle_.getTitle());

		if (scienceArticle != null) {
			results.setCode(MessageCode.CODE_405);
			results.setMessage(MessageCode.MESSAGE_405);
			return results;
		}

		try {

			if (!file.isEmpty() && !FileFilterUtils.isMediaFileType(file.getOriginalFilename())) {
				results.setCode(MessageCode.CODE_404);
				results.setMessage("不支持该文件格式上传");
				return results;
			} else if (file.isEmpty()) {
				results.setCode(MessageCode.CODE_404);
				results.setMessage("封面图片不能为空");
				return results;
			}

			String prefix = "scienceArticle_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_";
			String fileUrl = "";
			if (!file.isEmpty()) {
				fileUrl = UploadFilesUtils.saveFile(null,request, file, prefix); // 保存图片
			}

			scienceArticle_.setArticleUrl(scienceArticle_.getArticleUrl().trim());
			scienceArticle_.setCreatetime(new Date());
			scienceArticle_.setImageUrl(fileUrl);
			scienceArticle_.setSource(scienceArticle_.getSource().trim());
			scienceArticle_.setSubheading(scienceArticle_.getSubheading().trim());
			scienceArticle_.setTitle(scienceArticle_.getTitle().trim());
			scienceArticle_.setFlag(0);
			scienceArticleFeignClient.insert(scienceArticle_);

			results.setCode(MessageCode.CODE_200);
			results.setMessage(MessageCode.MESSAGE_200);

			return results;
		} catch (Exception e) {
			// TODO: handle exception
			results.setCode(MessageCode.CODE_404);
			results.setMessage(e.getMessage());
			return results;
		}
	}

	@SystemControllerLog("健康科普编辑页面")
	@RequestMapping(value = "/editPage", method = RequestMethod.GET)
	public String editPage(Model model, int id) {
		ScienceArticle scienceArticle = scienceArticleFeignClient.findById("selectByPrimaryKey", id);
		model.addAttribute("scienceArticle", scienceArticle);
		ScienceColumn scienceColumn = scienceColumnFeignClient.findById("selectByPrimaryKey", scienceArticle.getColumnId());
		model.addAttribute("scienceColumn", scienceColumn);
		
		List<ScienceColumn> scienceColumnList = scienceColumnFeignClient.getList("selectAll", new ScienceColumn());
		model.addAttribute("scienceColumnList", scienceColumnList);
		
		return "/sys/science/scienceArticleEdit";
	}

	@RequestMapping("/edit")
	@ResponseBody
	public Results<Map<String, Object>> edit(ScienceArticle scienceArticle_, Integer columnId2, HttpServletRequest request,
                                             MultipartFile file) {
		Results<Map<String, Object>> result = new Results<Map<String, Object>>();
		try {
			
			if (!file.isEmpty() && !FileFilterUtils.isMediaFileType(file.getOriginalFilename())) {
				result.setCode(MessageCode.CODE_404);
				result.setMessage("不支持该文件格式上传");
				return result;
			} else if (file.isEmpty()) {
				result.setCode(MessageCode.CODE_404);
				result.setMessage("封面图片不能为空");
				return result;
			}
			
			ScienceArticle scienceArticle = new ScienceArticle();
			String prefix = "scienceArticle_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_";
			String fileUrl = "";
			if (!file.isEmpty()) {
				fileUrl = UploadFilesUtils.saveFile(null,request, file, prefix); // 保存图片
				scienceArticle.setImageUrl(fileUrl);
			}else {
				scienceArticle.setImageUrl(scienceArticle_.getImageUrl().trim());
			}
			
			scienceArticle.setArticleUrl(scienceArticle_.getArticleUrl());
			if (columnId2==null||columnId2==0) {
				scienceArticle.setColumnId(scienceArticle_.getColumnId());
			}else {
				scienceArticle.setColumnId(columnId2);
			}
			scienceArticle.setId(scienceArticle_.getId());
			scienceArticle.setSource(scienceArticle_.getSource());
			scienceArticle.setSubheading(scienceArticle_.getSubheading());
			scienceArticle.setTitle(scienceArticle_.getTitle());
			scienceArticle.setUpdatetime(new Date());

			scienceArticleFeignClient.update("updateByPrimaryKeySelective", scienceArticle);

			result.setCode(MessageCode.CODE_200);
			result.setMessage("成功");
			return result;
		} catch (RuntimeException e) {
			result.setCode(MessageCode.CODE_404);
			result.setMessage(e.getMessage());
			return result;
		}
	}
	
	
	@RequestMapping("/reject")
	@ResponseBody
	@SystemControllerLog("拒绝审核科普文章")	
	public Results<Map<String, Object>> reject(int id) {
		Results<Map<String, Object>> result = new Results<Map<String, Object>>();
		try {
			ScienceArticle scienceArticle = scienceArticleFeignClient.findById("selectByPrimaryKey", id);
			scienceArticle.setFlag(0);
			scienceArticle.setUpdatetime(new Date());
			scienceArticleFeignClient.update("updateByPrimaryKey", scienceArticle);
			result.setCode(MessageCode.CODE_200);
			result.setMessage("成功");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(MessageCode.CODE_404);
			result.setMessage(e.getMessage());
			return result;
		}
	}
	
	
	@RequestMapping("/pass")
	@ResponseBody
	@SystemControllerLog("通过审核科普文章")
	public Results<Map<String, Object>> pass(int id, Model model) {
		Results<Map<String, Object>> result = new Results<Map<String, Object>>();
		try {
			ScienceArticle scienceArticle = scienceArticleFeignClient.findById("selectByPrimaryKey", id);
			
			scienceArticle.setFlag(1);
			scienceArticle.setUpdatetime(new Date());
			scienceArticleFeignClient.update("updateByPrimaryKey", scienceArticle);
			result.setCode(MessageCode.CODE_200);
			result.setMessage("成功");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(MessageCode.CODE_404);
			result.setMessage(e.getMessage());
			return result;
		}
	}
}
