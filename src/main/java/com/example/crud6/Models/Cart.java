package com.example.crud6.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String email;

    @ManyToMany(targetEntity = Product.class)

    @JoinColumn
    private List<Product> products;

}
