package com.zzzonga.board.controller;

import com.zzzonga.board.domain.MemberDTO;
import com.zzzonga.board.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@SessionAttributes({"member"})
@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/login")
    public String showLogin(Model model, MemberDTO memberDTO, SessionStatus sessionStatus) {

        return "loginForm";
    }

    @PostMapping("/loginPost")
    public String doLogin(@ModelAttribute MemberDTO memberDTO,
                          Model model, SessionStatus sessionStatus,
                          RedirectAttributes attributes) {
        MemberDTO member = memberService.login(memberDTO);

        if (member != null) {
            model.addAttribute("member", member);
            return "/board/board";
        }

        sessionStatus.setComplete();

        attributes.addFlashAttribute("error", "사용자의 ID 혹은 패스워드가 일치하지 않습니다.");

        return "redirect:/login";
    }

    @GetMapping("/selectAllMember")
    @ResponseBody
    public String findAllUser() {
        List<MemberDTO> memberDTOList = memberService.selectAllUser();
        memberDTOList.forEach(c -> log.info(c.toString()));
        return memberDTOList.toString();
    }
}
