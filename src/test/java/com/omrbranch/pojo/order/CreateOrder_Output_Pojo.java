package com.omrbranch.pojo.order;

public class CreateOrder_Output_Pojo {
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
	public CreateOrderData getData() {
		return data;
	}
	public void setData(CreateOrderData data) {
		this.data = data;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	private String message;
    private String currency;
    private CreateOrderData data;
    private int order_id;
}
