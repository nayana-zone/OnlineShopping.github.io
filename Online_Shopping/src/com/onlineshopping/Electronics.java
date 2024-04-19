package com.onlineshopping;

public class Electronics extends Product{
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	private String brand;
	private int warrantyPeriod;
	
	public Electronics(String productName, int productId, double price, int quantityInStock, String brand,
			int warrantyPeriod) {
		super(productName, productId, price, quantityInStock);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}
	
	public void displayDetails() {
		super.displayDetails();
		 System.out.println("Brand: " + brand);
	     System.out.println("Warranty Period: " + warrantyPeriod);
	}
	

}
