package br.com.bicycleshop.bicycleshop.service;

import br.com.bicycleshop.bicycleshop.controller.response.ProductResponse;
import br.com.bicycleshop.bicycleshop.entity.ProductEntity;
import br.com.bicycleshop.bicycleshop.exceptions.ProductNotFoundException;
import br.com.bicycleshop.bicycleshop.mapper.ProductMapper;
import br.com.bicycleshop.bicycleshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse findProductById(Long id) {
        ProductEntity productEntity = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Produto não encontrado"));
        return ProductMapper.toResponse(productEntity);
    }

    public List<ProductResponse> findAll(Pageable pageable) {
        List<ProductEntity> productEntityList = productRepository.findAll();
        return productEntityList.stream().map(ProductMapper::toResponse).collect(Collectors.toList());
    }
}
