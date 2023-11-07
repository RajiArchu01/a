package com.omrbranch.pojo.order;

public class GetOrderdetaisProduct {
	private int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMedium_image() {
		return medium_image;
	}
	public void setMedium_image(String medium_image) {
		this.medium_image = medium_image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getScheduled() {
		return scheduled;
	}
	public void setScheduled(int scheduled) {
		this.scheduled = scheduled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String image;
    private String medium_image;
    private String name;
    private String price;
    private String special_price;
    private String start_date;
    private String end_date;
    private int scheduled;
    private String status;
}
