package com.zzzonga.board.service;

import com.zzzonga.board.domain.MemberDTO;
import com.zzzonga.board.mapper.MemberMapper;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public MemberDTO login() {
        return null;
    }
}
