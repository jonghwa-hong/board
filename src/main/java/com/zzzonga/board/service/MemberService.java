package com.zzzonga.board.service;

import com.zzzonga.board.domain.MemberDTO;

import java.util.List;

public interface MemberService {

    MemberDTO login(MemberDTO memberDTO);

    List<MemberDTO> selectAllUser();
}
