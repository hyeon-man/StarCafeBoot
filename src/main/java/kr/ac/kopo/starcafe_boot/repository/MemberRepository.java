package kr.ac.kopo.starcafe_boot.repository;

import kr.ac.kopo.starcafe_boot.entity.MemberEntity;
import kr.ac.kopo.starcafe_boot.vo.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    @Query("select id, pass, memberNum, name from MemberEntity where id = :id and pass = pass")
    MemberVo findByMemberId(String id, int pass);
}
