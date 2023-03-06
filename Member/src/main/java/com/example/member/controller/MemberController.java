package com.example.member.controller;

import com.example.member.Service.MemberService;
import com.example.member.dto.MemberRequstDto;
import com.example.member.dto.MemberResponseDto;
import com.example.member.entity.Member;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


     //* 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     @GetMapping("/")
     public ModelAndView home() {
         return new ModelAndView("index");
     }
     @PostMapping("/member")
     public Member creatMember(@RequestBody MemberRequstDto memberRequstDto){
         return memberService.createMember(memberRequstDto);
     }
    @GetMapping("/member/{id}")
    public MemberResponseDto getMemberInfo(@PathVariable Long id, @RequestBody MemberResponseDto memberResponseDto){
        {
            return
        }
    }
     // 회원의 전체 목록을 조회하는 API
    @GetMapping("/member")
    public List<MemberResponseDto> getMemberList(){
         return MemberService.getMembers();
//    }
}