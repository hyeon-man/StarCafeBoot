package kr.ac.kopo.starcafe_boot.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberVo {

    private Long memberNum;
    private String id;
    private int pass;
    private String name;

}
