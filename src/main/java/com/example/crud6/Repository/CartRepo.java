package com.example.crud6.Repository;

import com.example.crud6.Models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepo extends JpaRepository<Cart, Long> {
    List<Cart> findByName(String name);
}
