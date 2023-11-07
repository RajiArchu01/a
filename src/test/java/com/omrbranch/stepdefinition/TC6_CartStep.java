package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payloadmanager.PayLoadObjectManager;
import com.omrbranch.pojo.cart.AddToCart_Output_Pojo;
import com.omrbranch.pojo.cart.GetCartItemsData;
import com.omrbranch.pojo.cart.GetCartItems_Output_Pojo;
import com.omrbranch.pojo.cart.setADdress_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class TC6_CartStep extends BaseClass {
	PayLoadObjectManager pom = new PayLoadObjectManager();
	Response response;
	@Given("User add header and bearer for accessing endpoints")
	public void userAddHeaderAndBearerForAccessingEndpoints() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept","application/json");
		Header h2 = new Header("Authorization","Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		Header h3 = new Header("Content-Type","application/json");
		lstHeader.add(h1);
		lstHeader.add(h2);
		lstHeader.add(h3);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);  
	}
	
	@When("User add request body text to add product in the cart with {string},{string} and {string}")
	public void userAddRequestBodyTextToAddProductInTheCartWithAnd(String productId, String productVariationId, String type) {
	    payLoad(pom.getCartPayLoad().addToCartPayload(TC1_LoginStep.globalDatas.getProductId(), TC1_LoginStep.globalDatas.getProductVariationId(), type));
	}
	@When("User send {string} request for addToCart endpoint")
	public void userSendRequestForAddToCartEndpoint(String type) {
		 response = requestType(type, Endpoints.ADDTOCART);
		 int statusCode = response.getStatusCode();
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the addToCart response message matches {string}")
	public void userShouldVerifyTheAddToCartResponseMessageMatches(String expSuccessMsg) {
		AddToCart_Output_Pojo addToCart_Output_Pojo = response.as(AddToCart_Output_Pojo.class);
		String message = addToCart_Output_Pojo.getMessage();
		Assert.assertEquals("Verify Product added in cart", expSuccessMsg, message);
		
	}
	@Given("User add header and bearer for to getCartItems")
	public void userAddHeaderAndBearerForToGetCartItems() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		lstHeader.add(h1);
		lstHeader.add(h2);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
	}
	@Given("User send {string} request for getCartItems endpoint")
	public void userSendRequestForGetCartItemsEndpoint(String type) {
		 response = requestType(type, Endpoints.GETCARTITEMS);
		 int statusCode = response.getStatusCode();
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the getCartItems response message matches {string} and saved cartAddressId and cartId")
	public void userShouldVerifyTheGetCartItemsResponseMessageMatchesAndSavedCartAddressIdAndCartId(String expSuccessMsg) {
		GetCartItems_Output_Pojo getCartItems_Output_Pojo = response.as(GetCartItems_Output_Pojo.class);
		String message = getCartItems_Output_Pojo.getMessage();
		int id = getCartItems_Output_Pojo.getAddress().getId();
		String cartAddressId = String.valueOf(id);
		TC1_LoginStep.globalDatas.setCartAddressId(cartAddressId);
		ArrayList<GetCartItemsData> data = getCartItems_Output_Pojo.getData();
		for(GetCartItemsData eachGetCartItemData: data) {
			int cart_id = eachGetCartItemData.getCart_id();
			String cartId = String.valueOf(cart_id);
			TC1_LoginStep.globalDatas.setCartId(cartId);
		}
		Assert.assertEquals("Verify getCartItem OK message",expSuccessMsg,message);
	}
	
	@When("User add request body text to set address in the cart with {string} and {string}")
	public void userAddRequestBodyTextToSetAddressInTheCartWithAnd(String cartAddressId, String cartId) {
	    payLoad(pom.getCartPayLoad().setADdressPayLoad(TC1_LoginStep.globalDatas.getCartAddressId(), TC1_LoginStep.globalDatas.getCartId()));
		
	}
	@When("User should {string} request for setADdress endpoint")
	public void userShouldRequestForSetADdressEndpoint(String type) {
	     response = requestType(type, Endpoints.SETADDRESS);
	     int statusCode = response.getStatusCode();
	     TC1_LoginStep.globalDatas.setStatusCode(statusCode);
		
	}
	@Then("User should verify the setADdress response message matches {string}")
	public void userShouldVerifyTheSetADdressResponseMessageMatches(String expSuccessMsg) {
	    setADdress_Output_Pojo setADdress_Output_Pojo = response.as(setADdress_Output_Pojo.class);
	    String message = setADdress_Output_Pojo.getMessage();
	    Assert.assertEquals("Verify Cart updated successfully",expSuccessMsg,message);
		
	}
}
