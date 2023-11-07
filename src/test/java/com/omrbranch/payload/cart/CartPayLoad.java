package com.omrbranch.payload.cart;

import com.omrbranch.pojo.cart.AddToCart_Input_Pojo;
import com.omrbranch.pojo.cart.setADdress_Input_Pojo;
import com.omrbranch.pojo.cart.setADdress_Output_Pojo;

public class CartPayLoad {
	public AddToCart_Input_Pojo addToCartPayload(String productId,String productVariationId,String type) {
		AddToCart_Input_Pojo addToCart_Input_Pojo = new AddToCart_Input_Pojo(productId, productVariationId, type);
		return addToCart_Input_Pojo;
	}
	public setADdress_Input_Pojo setADdressPayLoad(String cartAddressId,String cartId) {
		setADdress_Input_Pojo setADdress_Input_Pojo = new setADdress_Input_Pojo(cartAddressId, cartId);
		return setADdress_Input_Pojo;
	}
}
