package com.ahsen.shopmanagement.controllers;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "price_history")
public class PriceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "change_date", nullable = false)
    private LocalDateTime changeDate;

    public PriceHistory() {
        // Default constructor
    }

    public PriceHistory(Product product, BigDecimal price, LocalDateTime changeDate) {
        this.product = product;
        this.price = price;
        this.changeDate = changeDate;
    }

    // Getters and setters
}
