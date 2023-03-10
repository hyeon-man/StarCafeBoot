package kr.ac.kopo.starcafe_boot.entity;


import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
@Builder

@Table(name = "Product")
public class ProductEntity {

    @Id
    @GeneratedValue(generator = "auto")
    @Column(name = "PRODUCT_ID")
    private Long id;

    @Column
    private String name;

    @Column
    private int category;

    @Column
    private int price;

    @Column
    private int status;

    public ProductEntity(Long id, String name, int category, int price, int status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.status = status;
    }

}
