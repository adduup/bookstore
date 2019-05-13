package com.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.model.CartItem;
import com.bookstore.model.ShoppingCart;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

}
