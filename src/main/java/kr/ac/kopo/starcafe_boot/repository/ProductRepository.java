package kr.ac.kopo.starcafe_boot.repository;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    Optional<ProductEntity> findById(Long id);
    List<ProductEntity> findAll();
}
