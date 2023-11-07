package com.omrbranch.pojo.product;

public class ProductListAttributeOption {
		private int id;
		private int attribute_id;
		private String value;
		private String status;
		private String created_at;
		private String updated_at;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAttribute_id() {
			return attribute_id;
		}
		public void setAttribute_id(int attribute_id) {
			this.attribute_id = attribute_id;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
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
