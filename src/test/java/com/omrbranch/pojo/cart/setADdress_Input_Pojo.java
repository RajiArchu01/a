package com.omrbranch.pojo.cart;

public class setADdress_Input_Pojo {
	private String address_id;
	private String cart_id;
    
	public setADdress_Input_Pojo(String address_id, String cart_id) {
		super();
		this.address_id = address_id;
		this.cart_id = cart_id;
	}
	
	 public String getAddress_id() {
			return address_id;
		}
		public void setAddress_id(String address_id) {
			this.address_id = address_id;
		}
		public String getCart_id() {
			return cart_id;
		}
		public void setCart_id(String cart_id) {
			this.cart_id = cart_id;
		}
}
