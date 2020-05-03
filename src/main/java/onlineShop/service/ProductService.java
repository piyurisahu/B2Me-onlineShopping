package onlineShop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import onlineShop.model.Product;

@Service
public interface ProductService {
    
    List<Product> getAllProducts();
    
    Product getProductById(int productId);

    void deleteProduct(int productId);
    
    void addProduct(Product product);
    
    void updateProduct(Product product);
}

