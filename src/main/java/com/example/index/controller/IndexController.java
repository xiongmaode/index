package com.example.index.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String index(){
        log.info("进入导航页，时间：{}",new Date());
        return "index/login";
    }

}
