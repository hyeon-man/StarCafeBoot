package kr.ac.kopo.starcafe_boot.product;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

import static kr.ac.kopo.starcafe_boot.entity.QProductEntity.productEntity;


@Repository
public class ProductQueryRepository {
    private final JPAQueryFactory queryFactory;

    public ProductQueryRepository(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public List<ProductEntity> findByName(String name) {


        return queryFactory.selectFrom(productEntity)
                .where(productEntity.name.eq(name))
                .fetch();


    }
}
