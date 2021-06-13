package br.com.bicycleshop.bicycleshop.controller;

import br.com.bicycleshop.bicycleshop.controller.response.ProductResponse;
import br.com.bicycleshop.bicycleshop.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAllProducts(@RequestParam final Pageable pageable) {
        return ResponseEntity.ok().body(productService.findAll(pageable));
    }
}
