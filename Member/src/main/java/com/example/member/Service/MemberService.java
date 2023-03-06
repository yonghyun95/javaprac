package com.example.member.Service;

import com.example.member.dto.MemberRequstDto;
import com.example.member.entity.Member;
import com.example.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public Member createMember(MemberRequstDto memberRequstDto) {
        Member member = new Member(memberRequstDto);
        memberRepository.save(member);
        return member;
    }


//    @Transactional
//    public MemberResponseDto findMember() {
//        Member member = memberRepository.findById(id).orElseThrow(
//                () -> new NullPointerException("회원 상세 조회 실패")
//        );
//        member.update(MemberResponseDto);
//        return member.getId();
//    }

}