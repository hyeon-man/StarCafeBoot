package kr.ac.kopo.starcafe_boot.product;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.repository.ProductRepository;
import kr.ac.kopo.starcafe_boot.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
    final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductEntity> list() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(ProductVo vo) {

        ProductEntity entity = ProductEntity
                .builder()
                .name(vo.getName())
                .category(vo.getCategory())
                .price(vo.getPrice())
                .status(vo.getStatus())
                .build();

        repository.save(entity);

        log.info("세이브 완료", entity);
    }
}
