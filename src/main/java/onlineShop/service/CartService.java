package onlineShop.service;

import org.springframework.stereotype.Service;

import onlineShop.model.Cart;

@Service
public interface CartService {
    Cart getCartById(int CartId);
}

