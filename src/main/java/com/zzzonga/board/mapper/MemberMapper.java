package com.zzzonga.board.mapper;

import com.zzzonga.board.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public MemberDTO selectCheckMember(MemberDTO memberDTO);

    public List<MemberDTO> selectAllMember();
}
