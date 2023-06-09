package com.example.crud6.Services;

import com.example.crud6.Models.Cart;

import java.util.HashMap;
import java.util.List;

public interface CartService {
    Cart save(Long pId, Long prodId);

    HashMap<String, List<Cart>> listOfItems(String name);
}
