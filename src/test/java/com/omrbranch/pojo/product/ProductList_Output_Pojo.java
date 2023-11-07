package com.omrbranch.pojo.product;

import java.util.ArrayList;

public class ProductList_Output_Pojo {
	private int status;
	    private String message;
	    private String currency;
	    private ArrayList<ProductListDatum> data;
	    private String banner;
	    private int cart_count;
	    
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
		public ArrayList<ProductListDatum> getData() {
			return data;
		}
		public void setData(ArrayList<ProductListDatum> data) {
			this.data = data;
		}
		public String getBanner() {
			return banner;
		}
		public void setBanner(String banner) {
			this.banner = banner;
		}
		public int getCart_count() {
			return cart_count;
		}
		public void setCart_count(int cart_count) {
			this.cart_count = cart_count;
		}
}
