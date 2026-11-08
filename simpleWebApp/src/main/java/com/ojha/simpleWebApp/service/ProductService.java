package com.ojha.simpleWebApp.service;

import com.ojha.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iphone", 50000),
            new Product(102, "samsung", 60000),
            new Product(103, "milton", 6000)));

    public List<Product> getProducts() {
        return products;
    }


    public Product getProductById(int proId) {
        return products.stream()
                .filter(p -> p.getProdId() == proId)
                .findFirst().get();
    }

    public Product addProduct(Product prod) {
        products.add(prod);
        return prod;
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;

            products.set(index, prod);
        }

    }
    public void deleteProduct ( int prodId){
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId)
                index = i;

            products.remove(index);
        }
    }
}