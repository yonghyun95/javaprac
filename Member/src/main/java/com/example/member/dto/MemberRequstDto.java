package com.example.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRequstDto { // 넘겨받은 값

    private String name;
    private String email;
    private String pw;

}