package kr.ac.kopo.starcafe_boot.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class MemberVo {

    private Long memberNum;
    private String id;
    private String pass;
    private String name;

}
