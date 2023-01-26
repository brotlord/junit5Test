package de.training.dao;

import de.training.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> db = new ArrayList<>();

    public String insertProduct(Product product) {
        db.add(new Product(product.getId(), product.getName(), product.getPrice()));
        return "Insert successful";
    }

    public List<Product> getAllProducts() {
        return db;
    }
}
