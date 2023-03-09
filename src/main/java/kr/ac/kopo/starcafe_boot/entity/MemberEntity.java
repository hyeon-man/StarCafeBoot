package kr.ac.kopo.starcafe_boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Builder
public class MemberEntity {

    @Id
    @Column(name = "member_Num")
    @GeneratedValue
    private Long memberNum;
    @Column
    private String id;

    @Column
    private int pass;

    @Column
    private String name;

    public MemberEntity(Long memberNum, String id, int pass, String name) {
        this.memberNum = memberNum;
        this.id = id;
        this.pass = pass;
        this.name = name;
    }
}
