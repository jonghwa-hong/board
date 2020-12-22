package com.zzzonga.board.mapper;

import com.zzzonga.board.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public MemberDTO selectMember(MemberDTO memberDTO);

}
