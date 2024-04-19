package com.main;

import com.onlineshopping.Clothing;
import com.onlineshopping.Electronics;
import com.shoppingcart.ShoppingCart;

import exception.DuplicateProductIDException;
import exception.ProductNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		 Electronics laptop = new Electronics("Laptop", 1, 999.99, 5, "Dell", 12);
	     Electronics smartphone = new Electronics("Smartphone", 2, 499.99, 8, "Apple", 12);
	     
	     Clothing shirt = new Clothing("Shirt", 3, 29.99, 10, "M", "Cotton");
	     Clothing pants = new Clothing("Pants", 4, 39.99, 12, "32", "Denim");
	     
	     ShoppingCart cart = new ShoppingCart();
	        try {
				cart.addProduct(laptop);
				cart.addProduct(smartphone);
		        cart.addProduct(shirt);
		        cart.addProduct(pants);
		        
		        System.out.println("Cart Contents:");
		        cart.displayCart();
		        
		        
		        double totalPrice = cart.calculateTotalPrice();
		        
		        System.out.println("Total Price: $" + totalPrice);
		        
		        
		        cart.deleteProduct(1);
	            System.out.println("\nAfter removing Laptop:");
	            cart.displayCart();
	            
	            cart.addProduct(shirt);
	        }
	        
	        
	        catch (DuplicateProductIDException | ProductNotFoundException e) {
	            System.out.println(e.getMessage());
	        }
	        
	       


	}

}
