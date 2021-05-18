package br.com.bicycleshop.bicycleshop.repository;

import br.com.bicycleshop.bicycleshop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
