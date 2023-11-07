package com.omrbranch.pojo.cart;

public class AddToCart_Input_Pojo {
	private String product_id;
	private String product_variation_id;
    private String type;
    
    
    public AddToCart_Input_Pojo(String product_id, String product_variation_id, String type) {
		super();
		this.product_id = product_id;
		this.product_variation_id = product_variation_id;
		this.type = type;
	}
    public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_variation_id() {
		return product_variation_id;
	}
	public void setProduct_variation_id(String product_variation_id) {
		this.product_variation_id = product_variation_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
