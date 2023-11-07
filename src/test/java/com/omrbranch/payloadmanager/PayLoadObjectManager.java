package com.omrbranch.payloadmanager;

import com.omrbranch.payload.address.AddressPayload;
import com.omrbranch.payload.cart.CartPayLoad;
import com.omrbranch.payload.order.OrderPayload;
import com.omrbranch.payload.product.ProductSearchPayload;

public class PayLoadObjectManager {
private AddressPayload addressPayLoad;
private ProductSearchPayload productSearchPayload;
private CartPayLoad cartPayLoad;
private OrderPayload orderPayLoad;



public AddressPayload getAddressPayLoad() {
	return (addressPayLoad==null)? addressPayLoad = new AddressPayload():addressPayLoad;
}
public ProductSearchPayload getProductSearchPayload() {
	return (productSearchPayload==null)?productSearchPayload = new ProductSearchPayload():productSearchPayload;
}
public CartPayLoad getCartPayLoad() {
	return (cartPayLoad==null)? cartPayLoad = new CartPayLoad():cartPayLoad;
}
public OrderPayload getOrderPayLoad() {
	return (orderPayLoad==null)?orderPayLoad = new OrderPayload():orderPayLoad;
}
}
