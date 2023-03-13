package kr.ac.kopo.starcafe_boot.member;

import jakarta.persistence.Entity;
import kr.ac.kopo.starcafe_boot.entity.MemberEntity;
import kr.ac.kopo.starcafe_boot.repository.MemberRepository;
import kr.ac.kopo.starcafe_boot.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    final MemberRepository repository;

    public MemberServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveMember(MemberVo vo) {

        System.out.println("vo값     " + vo);

        MemberEntity entity = MemberEntity
                .builder()
                .name(vo.getName())
                .pass(vo.getPass())
                .id(vo.getId())
                .build();

        repository.save(entity);
    }

    @Override
    public void memberDelete(int memberNum) {


        repository.deleteById((long) memberNum);
    }

    @Override
    public void getInformation(int memberNum) {

        Optional<MemberEntity> entity = repository.findById((long) memberNum);

        System.out.println(entity);
    }

    @Override
    public void udtMember(int memberNum, MemberVo vo) {

//        PageRequest request = PageRequest.of(0,3);
//        repository.findAll(request);

        Optional<MemberEntity> entity = repository.findById((long) memberNum);

        if (entity.isPresent()) {
            MemberEntity entity1 = entity.get();
            entity1.setName(vo.getName());
            System.out.println(entity1);
            repository.save(entity1);
        } else{
            System.out.println("존재하지 않는 회원");
        }
    }


}
