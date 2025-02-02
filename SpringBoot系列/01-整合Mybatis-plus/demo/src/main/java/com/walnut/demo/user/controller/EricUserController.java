package com.walnut.demo.user.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.walnut.demo.user.entity.EricUser;
import com.walnut.demo.user.service.IEricUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author walnut
 * @since 2024-12-14
 */
@RestController
@RequestMapping("/user/eric-user")
@Api(tags = "用户管理")
public class EricUserController {

    @Autowired
    private IEricUserService ericUserService;

    @PostMapping("/list")
    @ApiOperation(value = "用户列表")
    public List<EricUser> list(@RequestBody EricUser ericUser){
        return ericUserService.list();
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增用户")
    public Boolean add(@RequestBody EricUser ericUser){
        return ericUserService.save(ericUser);
    }

    @PostMapping("/addBatch")
    @ApiOperation(value = "批量新增用户")
    public Boolean addBatch(@RequestBody List<EricUser> ericUsers) {
        return ericUserService.saveBatch(ericUsers);
    }

    @PostMapping("/saveOrUpdateBatch")
    @ApiOperation(value = "批量保存或更新用户")
    public Boolean saveOrUpdateBatch(@RequestBody List<EricUser> ericUsers) {
        return ericUserService.saveOrUpdateBatch(ericUsers);
    }









}
