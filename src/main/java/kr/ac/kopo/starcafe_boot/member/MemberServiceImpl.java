package kr.ac.kopo.starcafe_boot.member;

import kr.ac.kopo.starcafe_boot.entity.MemberEntity;
import kr.ac.kopo.starcafe_boot.repository.MemberRepository;
import kr.ac.kopo.starcafe_boot.vo.MemberVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class MemberServiceImpl implements MemberService{
    final MemberRepository repository;
    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public MemberEntity signin(MemberEntity member) {

        return repository.save(member);
    }

    @Override
    public void login(MemberEntity member) {
        MemberVo memberVo = repository.findByMemberId(member.getId(), member.getPass());

    }
}
