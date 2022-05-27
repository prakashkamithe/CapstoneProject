package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Cart;

public interface CartDaoInte {
	int addToCart(Cart c);
	boolean delCart(int cid);
	boolean updateCart(Cart cart);
	List<Cart> displayAllcart() throws SQLException;

}
