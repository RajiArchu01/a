package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.globaldatas.GlobalDatas;
import com.omrbranch.pojo.login.Login_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_LoginStep extends BaseClass{
	Response response;
	
	static GlobalDatas globalDatas = new GlobalDatas();
	
	@Given("User add header")
	public void userAddHeader() {
		given();
		header("accept", "application/json");
	}
	@When("User add basic authentication for login")
	public void userAddBasicAuthenticationForLogin() throws FileNotFoundException, IOException {
	    addBasicAuthentication(getPropertyFileValue("userName"), getPropertyFileValue("password"));
	}
	@When("User send {string} request for login endpoint")
	public void userSendRequestForLoginEndpoint(String type) {
	     response = requestType(type, Endpoints.BASICAUTHLOGIN);
	     int statusCode = getStatusCode(response);
	     globalDatas.setStatusCode(statusCode);
	}
	
	@Then("User should verify the login response body firstName present as {string} and get the logtoken saved")
	public void userShouldVerifyTheLoginResponseBodyFirstNamePresentAsAndGetTheLogtokenSaved(String expFirstName) {
	    Login_Output_Pojo login_Output_Pojo = response.as(Login_Output_Pojo.class);
	    String actFirstName = login_Output_Pojo.getData().getFirst_name();
	    String logtoken = login_Output_Pojo.getData().getLogtoken();
	    TC1_LoginStep.globalDatas.setLogtoken(logtoken);
	    Assert.assertEquals("Verify FirstName",expFirstName, actFirstName);
	}
}
