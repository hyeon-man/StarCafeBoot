package kr.ac.kopo.starcafe_boot.product;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.vo.ProductVo;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> list();

    void delete(Long id);

    void save(ProductVo vo);

    Optional<ProductEntity> selectOne(Long id);

    void updateSave(int id, ProductVo vo);
}
