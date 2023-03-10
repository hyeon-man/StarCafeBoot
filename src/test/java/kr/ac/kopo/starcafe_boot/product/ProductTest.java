package kr.ac.kopo.starcafe_boot.product;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.repository.ProductRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductTest {
    @Autowired
    ProductRepository repository;
    ProductEntity entity = ProductEntity.builder()
            .name("iceAmericano")
            .status(1)
            .category(1)
            .price(3000)
            .build();
    Long id = 1L;

    @Test
    @DisplayName("제품 저장 테스트")
    void save() {
        repository.save(entity);
    }

    @Test
    @DisplayName("제품 삭제 테스트")
    void delete() {
        repository.save(entity);
        repository.deleteById(entity.getId());
    }

    @Test
    @DisplayName("제품 한 개 검색")
    void selectOne() {
        System.out.println(repository.findById(id));
    }

}