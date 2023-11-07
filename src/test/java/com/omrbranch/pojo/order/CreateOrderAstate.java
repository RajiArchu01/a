package com.omrbranch.pojo.order;

public class CreateOrderAstate {
	private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public CreateOrderCountry getCountry() {
		return country;
	}
	public void setCountry(CreateOrderCountry country) {
		this.country = country;
	}
	private String name;
    private int country_id;
    private String status;
    private CreateOrderCountry country;
}
