package kr.ac.kopo.starcafe_boot.root;

import kr.ac.kopo.starcafe_boot.entity.ProductEntity;
import kr.ac.kopo.starcafe_boot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class RootServiceImpl implements RootService {

    final ProductRepository repository;

    public RootServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void dummyCreate() {
        for (int i = 1; i <= 50; i++) {
            ProductEntity entity = ProductEntity.builder()
                    .name("IceAmericano" + i)
                    .status(i)
                    .category(i)
                    .price(i + 3000)
                    .build();

            repository.save(entity);
        }

        List<ProductEntity> list = repository.findAll();

        System.out.println(list);
    }
}
