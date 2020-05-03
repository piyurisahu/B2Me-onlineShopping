package onlineShop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import onlineShop.model.Product;

@Repository
public interface ProductDao {

	Product getProductById(int productId);

	void deleteProduct(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	List<Product> getAllProducts();
}
