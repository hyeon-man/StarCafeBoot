package kr.ac.kopo.starcafe_boot;

import jakarta.persistence.Entity;
import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.repository.ProductRepository;
import kr.ac.kopo.starcafe_boot.vo.ProductVo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
@Rollback(value = false)
class StarCafeBootApplicationTests {

    @Test
    void contextLoads() {
    }


}
