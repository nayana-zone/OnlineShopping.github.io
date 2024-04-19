package com.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import com.onlineshopping.Product;
import exception.DuplicateProductIDException;
import exception.ProductNotFoundException;

public class ShoppingCart {
	 private List<Product> cartItems;

	 public ShoppingCart() {
	        this.cartItems = new ArrayList<>();
	    }

	 public void addProduct(Product product) throws DuplicateProductIDException {
	        for (Product item : cartItems) {
	            if (item.getProductId() == product.getProductId()) {
	                throw new DuplicateProductIDException("Product with ID " + product.getProductId() + " already exists in the cart, Add different one!!!");
	            }
	        }
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
	    
	    public void deleteProduct(int productId) throws ProductNotFoundException {
	        for (Product product : cartItems) {
	            if (product.getProductId() == productId) {
	                cartItems.remove(product);
	                return;
	            }
	        }
	        throw new ProductNotFoundException("Product with ID " + productId + " not found in the cart.");
	    }
	}

	 
	 

