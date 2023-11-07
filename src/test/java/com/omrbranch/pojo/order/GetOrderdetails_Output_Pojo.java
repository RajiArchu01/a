package com.omrbranch.pojo.order;

import java.util.ArrayList;

public class GetOrderdetails_Output_Pojo {
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
	public GetOrderDetailsData getData() {
		return data;
	}
	public void setData(GetOrderDetailsData data) {
		this.data = data;
	}
	public ArrayList<GetOrderDetailsCalendar> getCalendar() {
		return calendar;
	}
	public void setCalendar(ArrayList<GetOrderDetailsCalendar> calendar) {
		this.calendar = calendar;
	}
	public String getCurrent_date() {
		return current_date;
	}
	public void setCurrent_date(String current_date) {
		this.current_date = current_date;
	}
	public ArrayList<GetOrderdetaisProduct> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<GetOrderdetaisProduct> products) {
		this.products = products;
	}
	private String message;
    private String currency;
    private GetOrderDetailsData data;
    private ArrayList<GetOrderDetailsCalendar> calendar;
    private String current_date;
    private ArrayList<GetOrderdetaisProduct> products;
}
