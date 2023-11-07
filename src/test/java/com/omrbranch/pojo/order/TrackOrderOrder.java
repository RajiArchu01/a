package com.omrbranch.pojo.order;

public class TrackOrderOrder {
	private int order_id;
    public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}
	public TrackOrderDeliveryAddress getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(TrackOrderDeliveryAddress delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getCurrent_date() {
		return current_date;
	}
	public void setCurrent_date(String current_date) {
		this.current_date = current_date;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String order_no;
    private String delivery_time;
    private TrackOrderDeliveryAddress delivery_address;
    private String current_date;
    private String scheduled;
    private String status;
}
