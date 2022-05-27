package com.model;

public class Cart {
	

	int cartId;
	int pid;
	int quantity;
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [pid=" + pid + ", pname=" + pname + ",quantity="+quantity+", price=" + price + "]";
	}
	public Cart(int pid, String pname,int quantity, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity=quantity;
		this.price = price;
	}
	String pname;
	double price;
	public Cart() {
		System.out.println("Cart module");
	}

	

}
