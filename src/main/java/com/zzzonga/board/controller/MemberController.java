package com.zzzonga.board.controller;

import com.zzzonga.board.mapper.MemberMapper;
import com.zzzonga.board.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String showLogin() {
        return "loginForm";
    }
    @PostMapping("/loginPost")
    public String doLogin() {
        memberService.login();
        return "ok";
    }
}
