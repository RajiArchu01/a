package com.omrbranch.pojo.order;

public class CreateOrderData {
	private String order_code;
    public String getOrder_code() {
		return order_code;
	}
	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	public String getCoupon_discount() {
		return coupon_discount;
	}
	public void setCoupon_discount(String coupon_discount) {
		this.coupon_discount = coupon_discount;
	}
	public String getShipping_fee() {
		return shipping_fee;
	}
	public void setShipping_fee(String shipping_fee) {
		this.shipping_fee = shipping_fee;
	}
	public String getGrand_total() {
		return grand_total;
	}
	public void setGrand_total(String grand_total) {
		this.grand_total = grand_total;
	}
	public String getSavings() {
		return savings;
	}
	public void setSavings(String savings) {
		this.savings = savings;
	}
	public String getCredits_used() {
		return credits_used;
	}
	public void setCredits_used(String credits_used) {
		this.credits_used = credits_used;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public CreateOrderUserAddress getUser_address() {
		return user_address;
	}
	public void setUser_address(CreateOrderUserAddress user_address) {
		this.user_address = user_address;
	}
	private int order_no;
    private int user_id;
    private int address_id;
    private String payment_method;
    private String wallet;
    private String updated_at;
    private String created_at;
    private int id;
    private String total_amount;
    private String coupon_discount;
    private String shipping_fee;
    private String grand_total;
    private String savings;
    private String credits_used;
    private int amount;
    private CreateOrderUserAddress user_address;
}
