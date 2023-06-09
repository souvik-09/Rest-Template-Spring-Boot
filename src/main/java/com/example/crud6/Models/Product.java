package com.example.crud6.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long productId;
    private String productName;
    private Double price;
    private Integer quantity;

}



