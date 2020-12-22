package com.zzzonga.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

    private int idxMember;
    private String memberId;
    private String memberPw;
    private String memberName;
}
