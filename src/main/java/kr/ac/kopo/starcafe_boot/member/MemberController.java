package kr.ac.kopo.starcafe_boot.member;

import kr.ac.kopo.starcafe_boot.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/member")
public class MemberController {

    final MemberService service;
    public MemberController(MemberService service) {
        this.service = service;
    }

    @RequestMapping("/signin")
    public void signin(MemberEntity member) {

            member.setMemberNum(1L);
            member.setName("admin");
            member.setPass(12333);

    service.signin(member);
    }

    @RequestMapping("/login")
    public void login(MemberEntity member){
        int a;

        service.login(member);
    }
}
