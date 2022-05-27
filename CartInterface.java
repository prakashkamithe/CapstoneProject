package com.service;

import java.sql.SQLException;
import java.util.List;

import com.model.Cart;

public interface CartInterface {
	int addToCartService(Cart c);
	boolean delCartService(int cid);
//	Product searchProductService(int pid);
	boolean updateCartService(Cart cart);
	List displayAllcartService() throws SQLException;

}
