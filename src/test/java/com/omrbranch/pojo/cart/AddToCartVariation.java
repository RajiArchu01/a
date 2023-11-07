package com.omrbranch.pojo.cart;

import java.util.ArrayList;

public class AddToCartVariation {
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(String special_price) {
		this.special_price = special_price;
	}
	public int getMax_qty() {
		return max_qty;
	}
	public void setMax_qty(int max_qty) {
		this.max_qty = max_qty;
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
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getIs_available() {
		return is_available;
	}
	public void setIs_available(int is_available) {
		this.is_available = is_available;
	}
	public int getIs_favorite() {
		return is_favorite;
	}
	public void setIs_favorite(int is_favorite) {
		this.is_favorite = is_favorite;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public ArrayList<AddToCartOption> getOptions() {
		return options;
	}
	public void setOptions(ArrayList<AddToCartOption> options) {
		this.options = options;
	}
	public String getOriginal_special_price() {
		return original_special_price;
	}
	public void setOriginal_special_price(String original_special_price) {
		this.original_special_price = original_special_price;
	}
	private int id;
	    private int product_id;
	    private String weight;
	    private int unit_id;
	    private int qty;
	    private String price;
	    private String special_price;
	    private int max_qty;
	    private String status;
	    private String created_at;
	    private String updated_at;
	    private int cart_count;
	    private int discount;
	    private int is_available;
	    private int is_favorite;
	    private String specifications;
	    private ArrayList<AddToCartOption> options;
	    private String original_special_price;
}
