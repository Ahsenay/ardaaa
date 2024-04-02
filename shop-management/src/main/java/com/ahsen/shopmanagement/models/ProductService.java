package com.ahsen.shopmanagement.models;

import org.springframework.stereotype.Service;

import com.ahsen.shopmanagement.models.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Diğer servis metodlarını buraya ekleyebilirsiniz
}
