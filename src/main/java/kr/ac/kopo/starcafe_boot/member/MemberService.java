package kr.ac.kopo.starcafe_boot.member;

import kr.ac.kopo.starcafe_boot.vo.MemberVo;

public interface MemberService {
    void saveMember(MemberVo member);

    void memberDelete(int memberNum);

    void getInformation(int memberNum);

    void udtMember(int memberNum, MemberVo vo);
}
