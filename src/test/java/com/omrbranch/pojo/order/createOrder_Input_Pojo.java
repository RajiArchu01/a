package com.omrbranch.pojo.order;

public class createOrder_Input_Pojo {
	private String payment_method;
	public createOrder_Input_Pojo(String payment_method, String card_no, String card_type, String year, String month,
			String cvv) {
		super();
		this.payment_method = payment_method;
		this.card_no = card_no;
		this.card_type = card_type;
		this.year = year;
		this.month = month;
		this.cvv = cvv;
	}
	private String card_no;
    private String card_type;
    private String year;
    private String month;
    private String cvv;
    
    public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}
