package com.kevin.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 */
@RestController
@Api(value = "测试", tags = "测试操作 API", protocols = "http")
@RequestMapping("/swagger")
public class HelloController {

    @ApiOperation(value = "查询测试swagger", notes = "")
    @GetMapping("/hello")
    public String hello() {
        return "swagger-test";
    }
}
