package kr.ac.kopo.starcafe_boot.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductVo {
    private Long id;
    private String name;
    private int price;
    private int status;
    private int category;

    public ProductVo(Long id, String name, int price, int status, int category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.category = category;
    }
}
