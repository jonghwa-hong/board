package com.zzzonga.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/interceptor")
    @ResponseBody
    public String inter() {
        return "interceptor";
    }

    @GetMapping("/interceptor1")
    @ResponseBody
    public String inter1() {
        return "interceptor";
    }

    @GetMapping("/interceptor2")
    @ResponseBody
    public String inter2() {
        return "interceptor";
    }
}
