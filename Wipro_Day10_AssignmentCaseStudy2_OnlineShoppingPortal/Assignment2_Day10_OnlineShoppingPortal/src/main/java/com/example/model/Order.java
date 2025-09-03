package com.example.model;

public class Order {

	private String orderId;
    private String product;
    private String status;
    
    public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String orderId, String product, String status) {
		this.orderId = orderId;
		this.product = product;
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
