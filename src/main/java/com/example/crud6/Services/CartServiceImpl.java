package com.example.crud6.Services;

import com.example.crud6.DTO.PeopleDTO;
import com.example.crud6.Models.Cart;
import com.example.crud6.Models.Product;
import com.example.crud6.Repository.CartRepo;
import com.example.crud6.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    CartRepo cartRepo;

    @Autowired
    ProductRepo productRepo;

    @Override
    public Cart save(Long pId, Long prodId) {

        PeopleDTO people = restTemplate.getForObject("http://localhost:8080/people/" + pId, PeopleDTO.class);

        Product product = restTemplate.getForObject("http://localhost:8081/product/" + prodId, Product.class);

        Product prod = productRepo.save(product);

        Cart cart = new Cart();
        cart.setName(people.getName());
        cart.setEmail(people.getEmail());
        cart.setProducts(Arrays.asList(product));

        var save = cartRepo.save(cart);

        return save;
    }

    @Override
    public HashMap<String ,List<Cart>> listOfItems(String name) {
        List<Cart> cart = cartRepo.findByName(name);

        HashMap<String ,List<Cart>> map = new HashMap<>();
        map.put(name , cart);

        return map;
    }

}


