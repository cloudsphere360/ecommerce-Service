package com.example.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Ecommerce Service!";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
                new Product(1L, "Laptop", 55000),
                new Product(2L, "Mobile Phone", 25000),
                new Product(3L, "Headphones", 3000)
        );
    }
}
