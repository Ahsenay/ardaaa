package com.ahsen.shopmanagement.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahsen.shopmanagement.controllers.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Özel sorguları buraya ekleyebilirsiniz
}
