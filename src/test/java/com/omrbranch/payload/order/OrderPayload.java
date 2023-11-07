package com.omrbranch.payload.order;

import com.omrbranch.pojo.order.createOrder_Input_Pojo;

public class OrderPayload {
	public createOrder_Input_Pojo createOrderPayLoad(String paymentType,String cardNo,String cardType,String year,String month,String cvv) {
		createOrder_Input_Pojo createOrder_Input_Pojo = new createOrder_Input_Pojo(paymentType, cardNo, cardType, year, month, cvv);
return createOrder_Input_Pojo;

	}


}
