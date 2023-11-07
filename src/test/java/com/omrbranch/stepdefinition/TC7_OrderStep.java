package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payloadmanager.PayLoadObjectManager;
import com.omrbranch.pojo.order.CreateOrder_Output_Pojo;
import com.omrbranch.pojo.order.GetOrderdetails_Output_Pojo;
import com.omrbranch.pojo.order.GetOrderdetaisProduct;
import com.omrbranch.pojo.order.TrackOrderOrderStatus;
import com.omrbranch.pojo.order.TrackOrder_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC7_OrderStep extends BaseClass {
	PayLoadObjectManager pom = new PayLoadObjectManager();
	Response response;
	
	@When("User add request body text to create order with {string},{string},{string},{string},{string} and {string}")
	public void userAddRequestBodyTextToCreateOrderWithAnd(String paymentType,String cardNo,String cardType,String year,String month,String cvv) {
	    payLoad(pom.getOrderPayLoad().createOrderPayLoad(paymentType, cardNo, cardType, year, month, cvv));
	}
	@When("User send {string} request for createOrder endpoint")
	public void userSendRequestForCreateOrderEndpoint(String type) {
	     response = requestType(type, Endpoints.CREATEORDER);
	     int statusCode = response.getStatusCode();
	     TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the createOrder response message matches {string} and saved orderId")
	public void userShouldVerifyTheCreateOrderResponseMessageMatchesAndSavedOrderId(String expSuccessmsg) {
	    CreateOrder_Output_Pojo createOrder_Output_Pojo = response.as(CreateOrder_Output_Pojo.class);
	    String message = createOrder_Output_Pojo.getMessage();
	    Assert.assertEquals("Verify Order created successfully", expSuccessmsg, message);
	    
	    int order_id = createOrder_Output_Pojo.getOrder_id();
	    String orderId = String.valueOf(order_id);
	    TC1_LoginStep.globalDatas.setOrderId(orderId);
	}
	
	@Given("User add header and bearer for accessing getOrderDeatils endpoint")
	public void userAddHeaderAndBearerForAccessingGetOrderDeatilsEndpoint() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept","*/*");
		Header h2 = new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		lstHeader.add(h1);
		lstHeader.add(h2);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
	}
	@Given("User send {string} request for getOrderDetails endpoint")
	public void userSendRequestForGetOrderDetailsEndpoint(String type) {
	     response = requestType(type, Endpoints.GETORDERDETAILS+TC1_LoginStep.globalDatas.getOrderId());
	     int statusCode = response.getStatusCode();
	     TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the getOrderDetails response message matches {string} and saved itemId")
	public void userShouldVerifyTheGetOrderDetailsResponseMessageMatchesAndSavedItemId(String string) {
	    GetOrderdetails_Output_Pojo getOrderdetails_Output_Pojo = response.as(GetOrderdetails_Output_Pojo.class);
	    String message = getOrderdetails_Output_Pojo.getMessage();
	    Assert.assertEquals("Verify Ok Success Message", "OK", message);
	    String orderNo = getOrderdetails_Output_Pojo.getData().getOrder_no();
	    TC1_LoginStep.globalDatas.setOrderNo(orderNo);
	    
	    ArrayList<GetOrderdetaisProduct> products = getOrderdetails_Output_Pojo.getProducts();
	    for(GetOrderdetaisProduct eachGetOrderdeatilsProduct: products) {
	    	int id = eachGetOrderdeatilsProduct.getId();
	    	String itemId = String.valueOf(id);
	    	TC1_LoginStep.globalDatas.setItemId(itemId);
	    	
	    }
	    
	}

	@Given("User add header and bearer for accessing TrackOrder endpoint")
	public void userAddHeaderAndBearerForAccessingTrackOrderEndpoint() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept","application/json");
		Header h2 = new Header("Authorization","Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		lstHeader.add(h1);
		lstHeader.add(h2);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
	}
	@Given("User send {string} request for TrackOrder endpoint")
	public void userSendRequestForTrackOrderEndpoint(String type) {
	     response = requestType(type, Endpoints.TRACKORDER+TC1_LoginStep.globalDatas.getOrderId()+"/"+TC1_LoginStep.globalDatas.getItemId());
	     int statusCode = response.getStatusCode();
	     TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the TrackOrder response message matches {string},{string} and {string}")
	public void userShouldVerifyTheTrackOrderResponseMessageMatchesAnd(String string, String string2, String string3) {
	    TrackOrder_Output_Pojo trackOrder_Output_Pojo = response.as(TrackOrder_Output_Pojo.class);
	    ArrayList<TrackOrderOrderStatus> order_status = trackOrder_Output_Pojo.getOrder_status();
	    for(TrackOrderOrderStatus eachTrackOrderStatus:order_status) {
	    	String title = eachTrackOrderStatus.getTitle();
	    }
	    
	}
}
