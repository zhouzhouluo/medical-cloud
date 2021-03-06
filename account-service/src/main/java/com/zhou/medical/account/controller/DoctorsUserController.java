package com.zhou.medical.account.controller;

import com.zhou.medical.account.service.IDoctorsUserService;
import com.zhou.medical.common.entity.Pager;
import com.zhou.medical.common.entity.account.DoctorsUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/doctorsUser")
public class DoctorsUserController {


    @Resource
    IDoctorsUserService doctorsUserService;

    @RequestMapping(value = "findPage")
    Pager<DoctorsUser> findPage(@RequestParam("mapperId") String mapperId,
                                @RequestParam(value = "page", defaultValue = "1") Integer page,
                                @RequestParam(value = "rows", defaultValue = "10") Integer rows,
                                @RequestBody Map<String, Object> map) {
        return doctorsUserService.getList(mapperId, page, rows, map);
    }

    @RequestMapping(value = "findById")
    DoctorsUser findById(@RequestParam("mapperId") String mapperId, @RequestParam("id") Integer id) {
        return doctorsUserService.findById(mapperId, id);
    }

    @RequestMapping(value = "insert")
    Integer insert(@RequestBody DoctorsUser doctorsUser) {
        return doctorsUserService.insert(doctorsUser);
    }

    @RequestMapping(value = "update")
    Integer update(@RequestParam("mapperId") String mapperId, @RequestBody DoctorsUser doctorsUser) {
        return doctorsUserService.update(mapperId, doctorsUser);
    }

    @RequestMapping(value = "delete")
    Integer delete(@RequestParam("mapperId") String mapperId, @RequestBody DoctorsUser doctorsUser) {
        return doctorsUserService.delete(mapperId, doctorsUser);
    }

    @RequestMapping(value = "findByParam")
    DoctorsUser findByParam(@RequestParam("mapperId") String mapperId, @RequestParam("phone") String phone) {
        return doctorsUserService.findByParam(mapperId,phone);
    }
}
