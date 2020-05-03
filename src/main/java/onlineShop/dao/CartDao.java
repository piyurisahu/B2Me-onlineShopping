package onlineShop.dao;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import onlineShop.model.Cart;

@Repository
public interface CartDao {
	Cart getCartById(int cartId);

	Cart validate(int cartId) throws IOException;
}
