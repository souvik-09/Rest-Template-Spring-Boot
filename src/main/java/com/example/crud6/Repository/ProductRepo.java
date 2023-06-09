package com.example.crud6.Repository;

import com.example.crud6.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
