package com.jenkins.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/24 11:03
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 **/
@RestController
public class JenkinsController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, This is Jenkins Test";
    }
}
