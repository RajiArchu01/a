package com.omrbranch.pojo.cart;

public class AddToCart_Output_Pojo {
	private int status;
    public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public AddTocartData getData() {
		return data;
	}
	public void setData(AddTocartData data) {
		this.data = data;
	}
	private String message;
    private String currency;
    private int cart_count;
    private AddTocartData data;
}
