package com.walnut.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("index")
@Api(tags = "测试")
public class TestController {


    @GetMapping("/test1")
    @ApiOperation(value = "测试1")
    public String testGet(){
        log.info("test get");
        return "test get";
    }

    @PostMapping("/test2")
    @ApiOperation(value = "测试2")
    public String testPost(){
        log.info("test post");
        return "test post";
    }
}
