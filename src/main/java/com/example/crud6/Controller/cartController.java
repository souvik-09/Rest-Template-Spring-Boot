package com.example.crud6.Controller;

import com.example.crud6.Models.Cart;
import com.example.crud6.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;

@RestController
public class cartController {
    @Autowired
    CartService cartService;

    @PostMapping("/cart/{pId}/{prodId}")
    public Cart save (@PathVariable Long pId , @PathVariable Long prodId ){
        return cartService.save(pId,prodId);
    }

    @GetMapping("/cart/{name}")
    public HashMap<String , List<Cart>> listOfItems (@PathVariable String name){
        return  cartService.listOfItems(name);
    }
}
