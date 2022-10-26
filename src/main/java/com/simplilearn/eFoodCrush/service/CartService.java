package com.simplilearn.eFoodCrush.service;

import java.util.List;

import com.simplilearn.eFoodCrush.entity.Cart;
import com.simplilearn.eFoodCrush.exception.CartItemNotFoundException;

public interface CartService {
	public Cart getCartItemById(int cartItemId) throws CartItemNotFoundException;

	public List<Cart> getAllCartItems();

	public Cart addCartItem(Cart cartItem);

	public Cart updateCartItem(int cartItemId, Cart cartItem) throws CartItemNotFoundException;

	public void deleteCartItem(int cartItemId);

}
