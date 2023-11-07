package com.omrbranch.pojo.product;

public class ProductListVariationOption {
	private int id;
	private int product_id;
	private int variation_id;
	private String attribute_id;
	private int attribute_value_id;
	private String status;
	private String created_at;
	private String updated_at;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getVariation_id() {
		return variation_id;
	}
	public void setVariation_id(int variation_id) {
		this.variation_id = variation_id;
	}
	public String getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(String attribute_id) {
		this.attribute_id = attribute_id;
	}
	public int getAttribute_value_id() {
		return attribute_value_id;
	}
	public void setAttribute_value_id(int attribute_value_id) {
		this.attribute_value_id = attribute_value_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
}
