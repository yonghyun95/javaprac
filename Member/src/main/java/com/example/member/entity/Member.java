package com.example.member.entity;

import com.example.member.dto.MemberRequstDto;
import com.example.member.dto.MemberResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pw;

    public Member(MemberRequstDto memberRequstDto) {
        this.name = memberRequstDto.getName();
        this.email = memberRequstDto.getEmail();
        this.pw = memberRequstDto.getPw();
    }
}
