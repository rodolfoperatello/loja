package br.com.bicycleshop.bicycleshop.repository;

import br.com.bicycleshop.bicycleshop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Long, ProductEntity> {

    Optional<ProductEntity> findProductById(Long id);
}
