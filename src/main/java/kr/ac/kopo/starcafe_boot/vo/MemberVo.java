package kr.ac.kopo.starcafe_boot.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class MemberVo {

    private Long memberNum;
    private String id;
    private String pass;
    private String name;

}
