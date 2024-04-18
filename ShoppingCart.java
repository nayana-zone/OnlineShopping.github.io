package com.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.Product;

public class ShoppingCart {
	 private List<Product> cartItems;

	 public ShoppingCart() {
	        this.cartItems = new ArrayList<>();
	    }

	    public void addToCart(Product product) {
	        cartItems.add(product);
	    }

	    public void displayCart() {
	        if (cartItems.isEmpty()) {
	            System.out.println("Your shopping cart is empty.");
	            return;
	        }
	        System.out.println("Shopping Cart Contents:");
	        for (Product product : cartItems) {
	            product.displayDetails();
	            System.out.println("--");
	        }
	    }

	    public double calculateTotalPrice() {
	        double totalPrice = 0;
	        for (Product product : cartItems) {
	            totalPrice += product.getPrice();
	        }
	        return totalPrice;
	    }
	}
	 
	 

