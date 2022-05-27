package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Cart;
@Repository
public class CartDao {
	@Autowired
	JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
	this.jdbc = jdbc;
}


	public CartDao()  {
		System.out.println("Cart Dao iit");
	
	}
		

	@Override
	public int addToCart(Cart c) {
		//p=new Product(201, "Mouse",1200);
		//int sid= new Random().nextInt(100000);
		String query="insert into cart  values ( "+c.getPid()+",'"+c.getPname()+"','"
				+c.getPrice()+"')"; 						
		
		int x=jdbc.update(query);
		//jdbc.
		
		
		return x;
		
	}

	@Override
	public boolean delCart(int cid) {
		String query="delete from cart where cid ="+cid;
		int x=jdbc.update(query);
		if(x>0)
			return true;
		else
			return false;
		
		
	}
/*
	@Override
	public Cart searchCart(int cid) {
		String query ="select * from cart where cid="+cid;
		//jdbc.queryForObject(query, requiredType)
		return null;
		
	} */

	@Override
	public boolean updateCart(Cart cart) {
		String query="update cart set cname ="+cart.getPname()+", price="+cart.getPrice()+" where cid="+cart.getPid() ;
		int x=jdbc.update(query);
		if(x>0)
			return true;
		else
			return false;
		
	}

	@Override
	public List<Cart> displayAllcart() throws SQLException {
		System.out.println("displayAllcart");
		String s1="select * from cart";
		List l=jdbc.queryForList(s1);
		return l;
		
		
		
		
		
	}

	

}
