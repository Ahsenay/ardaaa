package com.ahsen.shopmanagement.models;

import org.springframework.web.bind.annotation.RestController;
import com.ahsen.shopmanagement.services.ProductService;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // HTTP isteklerini işleyen metodlar burada tanımlanır
}
