package ru.geekbrains.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);

        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
        System.out.println("Товары в магазине:" + "\n" +productRepository.getProducts() + "\n");

        Cart cart = context.getBean("cart", Cart.class);
        System.out.println("Ваша корзина:" + "\n" + cart.getCartList() + "\n");

        CartController cartController = context.getBean("cartController", CartController.class);
        cartController.cartControllerLogic();

        context.close();
    }
}
