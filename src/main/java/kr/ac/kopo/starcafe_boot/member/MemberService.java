package kr.ac.kopo.starcafe_boot.member;

import kr.ac.kopo.starcafe_boot.entity.MemberEntity;

public interface MemberService {
    MemberEntity signin(MemberEntity member);

    void login(MemberEntity member);
}
