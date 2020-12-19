package ru.geekbrains.servlet;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @PostConstruct
    public void initProducts() {
        products = new ArrayList<>();
        products.add(new Product(1, "брус 1*1", 10));
        products.add(new Product(2, "брус 2*2", 20));
        products.add(new Product(3, "брус 3*3", 30));
        products.add(new Product(4, "брус 4*4", 40));
        products.add(new Product(5, "брус 5*5", 50));
        products.add(new Product(6, "брус 6*6", 60));
        products.add(new Product(7, "брус 7*7", 70));
        products.add(new Product(8, "брус 8*8", 80));
        products.add(new Product(9, "брус 9*9", 90));
        products.add(new Product(10, "брус 10*10", 100));
    }

    public Product getProductById(int productId) {
        if (products.size() != 0) {
            for (Product product : products) {
                if (productId == product.getId()) {
                    return product;
                }
            }
        }
        return null;
    }
}
