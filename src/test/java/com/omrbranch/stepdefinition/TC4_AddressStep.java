package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payloadmanager.PayLoadObjectManager;
import com.omrbranch.pojo.address.AddUserAddress_Output_Pojo;
import com.omrbranch.pojo.address.DeleteAddress_Output_Pojo;
import com.omrbranch.pojo.address.GetUserAddress_Output_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC4_AddressStep extends BaseClass {
	PayLoadObjectManager pom  = new PayLoadObjectManager();
	Response response;
			
	@Given("User add header and bearer authorization for accessing address endpoints")
	public void userAddHeaderAndBearerAuthorizationForAccessingAddressEndpoints() {
	    
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		Header h3 = new Header("Content-Type", "application/json");
		lstHeader.add(h1);
		lstHeader.add(h2);
		lstHeader.add(h3);
		
		Headers headers = new Headers(lstHeader);
		addHeaders(headers); 
	}
	@Given("User add header for accessing getAddress endpoints")
	public void user_add_header_for_accessing_get_address_endpoints() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept","application/json");
		Header h2 = new Header("Authorization", "Bearer "+TC1_LoginStep.globalDatas.getLogtoken());
		lstHeader.add(h1);
		lstHeader.add(h2);
		
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
	}
	
	@When("User add request body for add new address {string},{string},{string},{string},{int} ,{int} ,{int} ,{string},{string} and {string}")
	public void userAddRequestBodyForAddNewAddressAnd(String firstName, String lastName, String mobile, String apartment, Integer stateId, Integer cityId, Integer countryId, String zipcode, String address, String addressType) {
	    payLoad(pom.getAddressPayLoad().addUserAddressPayLoad(firstName, lastName, mobile, apartment, TC1_LoginStep.globalDatas.getStateIdNum(), TC1_LoginStep.globalDatas.getCityId(), countryId, zipcode, address, addressType));
	}
	
	@When("User send {string} request for addUserAddress endpoint")
	public void userSendRequestForAddUserAddressEndpoint(String type) {
		
		 response = requestType(type, Endpoints.ADDUSERADDRESS);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	    
	}
	@Then("User should verify the addUserAddress response message matches {string}")
	public void userShouldVerifyTheAddUserAddressResponseMessageMatches(String expAddAddressSuccessMsg) {
		AddUserAddress_Output_Pojo addUserAddress_Output_Pojo = response.as(AddUserAddress_Output_Pojo.class);
		String message = addUserAddress_Output_Pojo.getMessage();
		int addressIdNum = addUserAddress_Output_Pojo.getAddress_id();
		String addressIdText = String.valueOf(addressIdNum);
		TC1_LoginStep.globalDatas.setAddressIdText(addressIdText);
		Assert.assertEquals("Verify Address Added Successfully", expAddAddressSuccessMsg, message);
	}
	
	@Given("User send {string} request for getUserAddress endpoint")
	public void userSendRequestForGetUserAddressEndpoint(String type) {
		 response = requestType(type, Endpoints.GETUSERADDRESS);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	    
	}
	@Then("User should verify the getUserAddress response message matches {string}")
	public void userShouldVerifyTheGetUserAddressResponseMessageMatches(String expGetUserAddressSuccessMsg) {
	    GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response.as(GetUserAddress_Output_Pojo.class);
	    String message = getUserAddress_Output_Pojo.getMessage();
	    Assert.assertEquals("Verify Get Address OK ", expGetUserAddressSuccessMsg, message);
	}
	
	@When("User add request body for update new address {string},{string},{string},{string},{string},{int} ,{int} ,{int} ,{string},{string} and {string}")
	public void userAddRequestBodyForUpdateNewAddressAnd(String addressId, String firstName, String lastName, String mobile, String apartment, Integer stateId, Integer cityId, Integer countryId, String zipcode, String address, String addressType) {
	   payLoad(pom.getAddressPayLoad().updateUserAddressPayLoad(addressId, firstName, lastName, mobile, apartment, TC1_LoginStep.globalDatas.getStateIdNum(), TC1_LoginStep.globalDatas.getCityId(), countryId, zipcode, address, addressType));
	}
	@When("User send {string} request for updateUserAddress endpoint")
	public void userSendRequestForUpdateUserAddressEndpoint(String type) {
		 response = requestType(type, Endpoints.UPDATEUSERADDRESS);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the updateUserAddress response message matches {string}")
	public void userShouldVerifyTheUpdateUserAddressResponseMessageMatches(String expUpdateUserAddressSuccessMsg) {
		UpdateUserAddress_Output_Pojo updateUserAddress_Output_Pojo = new UpdateUserAddress_Output_Pojo();
		String message = updateUserAddress_Output_Pojo.getMessage();
		Assert.assertEquals("Verify Address Updated Successfully", expUpdateUserAddressSuccessMsg, message);
	    
	}
	@When("User add request body for delete new address {string}")
	public void userAddRequestBodyForDeleteNewAddress(String string) {
	    payLoad(pom.getAddressPayLoad().deleteAddressPayLoad(TC1_LoginStep.globalDatas.getAddressIdText()));
	}
	@When("User send {string} request for deleteAddress endpoint")
	public void userSendRequestForDeleteAddressEndpoint(String type) {
		 response = requestType(type, Endpoints.DELETEADDRESS);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the deleteAddress response message matches {string}")
	public void userShouldVerifyTheDeleteAddressResponseMessageMatches(String expDeleteAddressSuccessMsg) {
	    DeleteAddress_Output_Pojo deleteAddress_Output_Pojo = new DeleteAddress_Output_Pojo();
	    String message = deleteAddress_Output_Pojo.getMessage();
	    Assert.assertEquals("Verify Address Deleted Successfully", expDeleteAddressSuccessMsg, message);
	    		
	}
}
