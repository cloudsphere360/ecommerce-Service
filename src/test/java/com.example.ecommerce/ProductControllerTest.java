package com.example.ecommerce;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    private final ProdusctController controller = new ProductController();

    @Test
    void homeShouldReturnWelcomeMessage() {
        String result = controller.home();

        assertEquals("Welcome to Ecommerce Service!", result);
    }

    @Test
    void getProductsShouldReturnThreeProducts() {
        List<Product> products = controller.getProducts();

        assertEquals(3, products.size());
        assertEquals("Laptop", products.get(0).getName());
        assertEquals("Mobile Phone", products.get(1).getName());
        assertEquals("Headphones", products.get(2).getName());
    }
}