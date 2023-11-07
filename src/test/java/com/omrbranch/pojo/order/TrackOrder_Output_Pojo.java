package com.omrbranch.pojo.order;

import java.util.ArrayList;

public class TrackOrder_Output_Pojo {
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<TrackOrderOrderStatus> getOrder_status() {
		return order_status;
	}
	public void setOrder_status(ArrayList<TrackOrderOrderStatus> order_status) {
		this.order_status = order_status;
	}
	public TrackOrderOrder getOrder() {
		return order;
	}
	public void setOrder(TrackOrderOrder order) {
		this.order = order;
	}
	private String message;
	private ArrayList<TrackOrderOrderStatus> order_status;
	private TrackOrderOrder order;
}
