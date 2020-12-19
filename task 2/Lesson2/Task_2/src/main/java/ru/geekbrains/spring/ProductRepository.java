package ru.geekbrains.spring;

import ru.geekbrains.spring.Product;
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
        products.add(new Product(1, "Product 1", 10));
        products.add(new Product(2, "Product 2", 20));
        products.add(new Product(3, "Product 3", 30));
        products.add(new Product(4, "Product 4", 40));
        products.add(new Product(5, "Product 5", 50));
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
