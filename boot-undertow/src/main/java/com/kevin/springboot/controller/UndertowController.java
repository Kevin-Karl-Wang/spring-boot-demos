package com.kevin.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 */
@Slf4j
@RestController
public class UndertowController {

    @GetMapping("/undertow/hello")
    public String hello(){
        log.info("start with undertow");
        return "start with undertow";
    }
}
