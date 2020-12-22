package com.zzzonga.board.service;

import com.zzzonga.board.domain.MemberDTO;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    MemberDTO login();
}
