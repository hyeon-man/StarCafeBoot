package kr.ac.kopo.starcafe_boot.member;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import kr.ac.kopo.starcafe_boot.entity.MemberEntity;
import kr.ac.kopo.starcafe_boot.entity.QMemberEntity;
import kr.ac.kopo.starcafe_boot.querydsl.QueryDSlConfig;
import kr.ac.kopo.starcafe_boot.vo.MemberVo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Member;
import java.util.List;


@SpringBootTest
class MemberTest {

    @Autowired
    MemberController controller;
    @Autowired
    JPAQueryFactory queryFactory;

    List<MemberVo> memberList;

    MemberVo vo = MemberVo.builder()
            .memberNum(22L)
            .id("test")
            .pass("test")
            .name("test")
            .build();




    @Test
    @DisplayName("회원 가입")
    public void signin() {
        controller.saveMember(vo);
        System.out.println(vo);
    }


    @Test
    @DisplayName("회원 삭제")
    public void withdrawal() {

        controller.deleteMember(22);
    }

    @Test
    @DisplayName("회원 정보 조회")
    public void getInformation() {

        controller.getInformation(22);
    }

    @Test
    @DisplayName("회원 정보 수정")
    public void memberUpdateInform() {
        controller.udtMember(22, vo);
    }

    @Test
    @DisplayName("회원 정보 DSL")
    public void findAll() {

        QMemberEntity qMemberEntity = QMemberEntity.memberEntity;
        List<MemberEntity> entities = queryFactory.selectFrom(qMemberEntity)
                .where(qMemberEntity.name.eq("test"))
                .fetch();

        System.out.println(entities);
    }

}