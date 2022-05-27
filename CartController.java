package com.presentation;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Cart;
import com.service.CartService;
import com.service.cartInterface;

@controller
public class CartController {

	@Autowired
	cartInterface cartService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	public CartController() {
		System.out.println("MainApp init");
	}
	@RequestMapping("/getAllCart")
	ModelAndView show() throws SQLException
	{
		//System.out.println("Show All Product");
	//	List prd=productService.displayAllproductService();
		return new ModelAndView("listCart","carts",cartService.displayAllcartService());	
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addAddt(@ModelAttribute("cart") Cart cart,ModelMap map) throws SQLException
	{
		cartService.addToCartService(cart);
		map.addAttribute("carts",cartService.displayAllcartService());
		return "listCart";
	}
	
	/*@RequestMapping(value="/newCart",method=RequestMethod.GET)
	public String newCart(ModelMap map) throws SQLException{
		
		map.addAttribute("cart", new Cart());
		map.addAttribute("carts", cartService.displayAllcartService());
			
		return "addCart";
	}*/
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteCart(@RequestParam("id") int cid,ModelMap map) throws SQLException{
		
		cartService.delCartService(cid);
		
		map.addAttribute("carts", cartService.displayAllcartService());
			
		return "listCart";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String upateCustomer(@ModelAttribute("cart") Cart cart,ModelMap map) throws SQLException{
		cartService.updateCartService(cart);
		map.addAttribute("carts", cartService.displayAllcartService());
		return "listCart";
	}
	
/*	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String newCustomer(@PathVariable("id") int cid,ModelMap map) throws SQLException{
		
		map.addAttribute("cart", cartService.searchCartService(cid));
		map.addAttribute("carts", cartService.displayAllcartService());
			
		return "editCart";
	}

	
*/


}
