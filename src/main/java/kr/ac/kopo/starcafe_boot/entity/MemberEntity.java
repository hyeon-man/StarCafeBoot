package kr.ac.kopo.starcafe_boot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ValueGenerationType;

@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@Builder

@Table(name = "Member")
public class MemberEntity {

    @Id
    @GeneratedValue(generator = "auto")
    @Column(name = "memberNum")
    private int memberNum;

    @Column(name = "memberId")
    private String id;

    @Column(name = "memberPass")
    private String pass;

    private String passValidate;


    /**
     * // 비밀번호 검증 메소드
     *
     * @param entity 비밀번호 검증
     */
    public void passValidate(MemberEntity entity) {
        if (entity.getPass() != entity.getPassValidate()) {
            System.out.println("비밀번호가 일치하지 않습니다.");
        } else {
            System.out.println("비밀번호가 일치합니다.");
        }

    }

    public MemberEntity(int memberNum, String id, String pass, String passValidate) {
        this.memberNum = memberNum;
        this.id = id;
        this.pass = pass;
        this.passValidate = passValidate;
    }
}
