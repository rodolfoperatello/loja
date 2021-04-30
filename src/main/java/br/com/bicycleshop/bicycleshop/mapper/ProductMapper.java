package br.com.bicycleshop.bicycleshop.mapper;

import br.com.bicycleshop.bicycleshop.controller.response.ProductResponse;
import br.com.bicycleshop.bicycleshop.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public static ProductResponse toResponse(final ProductEntity productEntity){
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(productEntity.getId());
        productResponse.setName(productEntity.getName());
        productResponse.setPrice(productEntity.getPrice());

        return productResponse;
    }
}
