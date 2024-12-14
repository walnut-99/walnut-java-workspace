package com.walnut.demo.user.controller;


import com.walnut.demo.user.entity.EricUser;
import com.walnut.demo.user.service.IEricUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
public class EricUserController {

    @Autowired
    private IEricUserService ericUserService;

    @GetMapping("/list")
    public List<EricUser> index() {
        return ericUserService.list();
    }

}
