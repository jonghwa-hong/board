package com.zzzonga.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class TestController {

    @GetMapping("/login")
    public String login() {
        log.info("assdasd");
        return "loginForm";
    }
}
