package com.omrbranch.pojo.product;

public class ProductList_Input_Pojo {
	private String category_id;
	private String page_no;
	
	public ProductList_Input_Pojo(String category_id, String page_no) {
		super();
		this.category_id = category_id;
		this.page_no = page_no;
	}
	
	 public String getCategory_id() {
			return category_id;
		}
		public void setCategory_id(String category_id) {
			this.category_id = category_id;
		}
		public String getPage_no() {
			return page_no;
		}
		public void setPage_no(String page_no) {
			this.page_no = page_no;
		}
}
