package com.zzzonga.board.service;

import com.zzzonga.board.domain.MemberDTO;
import com.zzzonga.board.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService{

    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public List<MemberDTO> selectAllUser() {
        return memberMapper.selectAllMember();
    }

    @Override
    public MemberDTO login(MemberDTO memberDTO) {
        System.out.println(memberDTO.toString());
        return memberMapper.selectCheckMember(memberDTO);
    }
}
