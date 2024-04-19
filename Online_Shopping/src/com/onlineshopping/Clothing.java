package com.onlineshopping;

public class Clothing extends Product{
	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	private String size;
	private String material;
	public Clothing(String productName, int productId, double price, int quantityInStock, String size,
			String material) {
		super(productName, productId, price, quantityInStock);
		this.size = size;
		this.material = material;
	}
	
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("size: "+ size);
		System.out.println("Material:"+ material);
	}
	
	

}
