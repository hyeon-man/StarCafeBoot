package kr.ac.kopo.starcafe_boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity(name = "member_JPA")
public class MemberEntity {

    @Id
    @Column(name = "memberNum")
    @GeneratedValue(generator = "auto")
    private Long memberNum;

    @Column(name = "id")
    private String id;

    @Column(name = "pass")
    private String pass;

    @Column(name = "name")
    private String name;

}
