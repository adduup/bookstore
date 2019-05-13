package com.bookstore.service;

import java.util.List;

import com.bookstore.model.CartItem;
import com.bookstore.model.ShoppingCart;

public interface CartItemService {

	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

}
