package onlineShop.dao;

import org.springframework.stereotype.Repository;

import onlineShop.model.Cart;
import onlineShop.model.CartItem;

@Repository
public interface CartItemDao {
    void addCartItem(CartItem cartItem);
    
    void removeCartItem(int CartItemId);
    
    void removeAllCartItems(Cart cart);
}

