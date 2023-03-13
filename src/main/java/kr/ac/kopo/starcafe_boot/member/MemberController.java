package kr.ac.kopo.starcafe_boot.member;

import kr.ac.kopo.starcafe_boot.entity.MemberEntity;
import kr.ac.kopo.starcafe_boot.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    final MemberService service;
    public MemberController(MemberService service) {
        this.service = service;
    }

    @PostMapping("/api/member/save")
    public String saveMember(MemberVo member){
        service.saveMember(member);

        return "success";
    }

    @PostMapping("/api/member/delete")
    public  ResponseEntity<Void> deleteMember(int memberNum){
        service.memberDelete(memberNum);
        System.out.println(ResponseEntity.noContent().build());
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/api/member/information")
    public ResponseEntity<Void> getInformation(int memberNum){
        service.getInformation(memberNum);

        return ResponseEntity.noContent().build();
    }

    @PostMapping("/api/member/updateMember")
    public ResponseEntity<Void> udtMember(int memberNum, MemberVo vo){
        service.udtMember(memberNum, vo);

        return ResponseEntity.noContent().build();
    }
}
