package com.zhou.medical.log.controller;


import com.zhou.medical.common.entity.Pager;
import com.zhou.medical.log.annotation.SystemServiceLog;
import com.zhou.medical.log.entity.RequestLog;
import com.zhou.medical.log.service.RequestLogService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/requestLog")
public class RequestLogController {
    @Resource
    RequestLogService requestLogService;

    @RequestMapping(value = "findSysLogPage")
    @SystemServiceLog("requestLog-findSysLogPage")
    Pager<RequestLog> findSysLogPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                     @RequestParam(value = "rows", defaultValue = "10") Integer rows,
                                     @RequestParam(value = "createTimeBeforeStr", defaultValue = "1970-01-01 00:00:00") String createTimeBeforeStr ,
                                     @RequestParam(value = "createTimeAfterStr", defaultValue = "2025-01-01 00:00:00") String createTimeAfterStr ,
                                     @RequestBody RequestLog requestLog){
        return  requestLogService.findByConditionLike(requestLog,createTimeBeforeStr,createTimeAfterStr, page,rows);
    }
}
