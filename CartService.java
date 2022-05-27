package com.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartDaoInte;
import com.model.Cart;

@Service
public class CartService implements cartInterface {
	public void setCartDao(CartDaoInte cartDao) {
		this.cartDao = cartDao;
	}

	@Autowired
	CartDaoInte    cartDao;
	


	public CartService() {
		System.out.println("CartService init ....");
	}

	@Override
	public int addToCartService(Cart c) {
		System.out.println("add cart");
		int x=cartDao.addToCart(c);
		return x;
	}

	@Override
	public boolean delCartService(int cid) {
		return cartDao.delCart(cid);
		
	}

/*	@Override
	public Cart searchCartService(int cid) {
		return cartDao.searchCart(cid);
	}
*/
	@Override
	public boolean updateCartService(Cart cart ) {
		
		return cartDao.updateCart(cart);
	}

	@Override
	public List displayAllcartService() throws SQLException {
		System.out.println("displayAllcartService");
		List l=cartDao.displayAllcart();
		return l;
		
		
	}
	
}