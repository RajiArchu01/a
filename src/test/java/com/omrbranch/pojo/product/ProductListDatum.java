package com.omrbranch.pojo.product;

import java.util.ArrayList;

public class ProductListDatum {
	private int id;
	private String product_code;
	private String image;
	private String name;
	private String description;
	private String manage_stock;
	private String quick_grab;
	private String is_exclusive;
	private String status;
	private int cart_count;
	private ArrayList<ProductListVariation> variations;
	private String price;
	private String special_price;
	private String original_special_price;
	private int discount;
	private ArrayList<Integer> product_variation_option;
	private int product_variation_id;
	    private int is_favorite;
	    
	    
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getProduct_code() {
			return product_code;
		}
		public void setProduct_code(String product_code) {
			this.product_code = product_code;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getManage_stock() {
			return manage_stock;
		}
		public void setManage_stock(String manage_stock) {
			this.manage_stock = manage_stock;
		}
		public String getQuick_grab() {
			return quick_grab;
		}
		public void setQuick_grab(String quick_grab) {
			this.quick_grab = quick_grab;
		}
		public String getIs_exclusive() {
			return is_exclusive;
		}
		public void setIs_exclusive(String is_exclusive) {
			this.is_exclusive = is_exclusive;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getCart_count() {
			return cart_count;
		}
		public void setCart_count(int cart_count) {
			this.cart_count = cart_count;
		}
		public ArrayList<ProductListVariation> getVariations() {
			return variations;
		}
		public void setVariations(ArrayList<ProductListVariation> variations) {
			this.variations = variations;
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
		public String getOriginal_special_price() {
			return original_special_price;
		}
		public void setOriginal_special_price(String original_special_price) {
			this.original_special_price = original_special_price;
		}
		public int getDiscount() {
			return discount;
		}
		public void setDiscount(int discount) {
			this.discount = discount;
		}
		public ArrayList<Integer> getProduct_variation_option() {
			return product_variation_option;
		}
		public void setProduct_variation_option(ArrayList<Integer> product_variation_option) {
			this.product_variation_option = product_variation_option;
		}
		public int getProduct_variation_id() {
			return product_variation_id;
		}
		public void setProduct_variation_id(int product_variation_id) {
			this.product_variation_id = product_variation_id;
		}
		public int getIs_favorite() {
			return is_favorite;
		}
		public void setIs_favorite(int is_favorite) {
			this.is_favorite = is_favorite;
		}
}
