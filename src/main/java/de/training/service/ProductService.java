package de.training.service;

import de.training.dao.ProductDao;
import de.training.model.Product;

import java.util.List;

public class ProductService {

    private ProductDao productDao = new ProductDao();

    public ProductService() {
    }

    public String insertProduct(Product product) {
        product.setName("Lars Test");
        return productDao.insertProduct(product);
    }

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }


}
