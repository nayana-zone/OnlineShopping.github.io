package com.onlineshopping;

public class Product {
    public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	private String productName;
    private int productId;
    private double price;
    private int quantityInStock;
	
    
    public Product(String productName, int productId, double price, int quantityInStock) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}
    
    public Product() {
    	
    }
    
    public void displayDetails() {
    	 System.out.println("Product Name: " + productName);
         System.out.println("Product ID: " + productId);
         System.out.println("Price: $" + price);
         System.out.println("Quantity in Stock: " + quantityInStock);
    }

	





    
}
