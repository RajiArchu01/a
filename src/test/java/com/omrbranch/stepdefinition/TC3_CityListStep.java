package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payloadmanager.PayLoadObjectManager;
import com.omrbranch.pojo.address.CityList;
import com.omrbranch.pojo.address.CityList_Output_Pojo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC3_CityListStep extends BaseClass {
	Response response;
	PayLoadObjectManager pom = new PayLoadObjectManager();
	
	@Given("User add header for to get CityList")
	public void userAddHeaderForToGetCityList() {
	    
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		lstHeader.add(h1);
		lstHeader.add(h2);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
		
	}
	@When("User add request body state id for get city list")
	public void userAddRequestBodyStateIdForGetCityList() {
		
		payLoad(pom.getAddressPayLoad().cityListPayload(TC1_LoginStep.globalDatas.getStateIdText()));
		
	}
	@When("User send {string} request for CityList endpoint")
	public void userSendRequestForCityListEndpoint(String type) {
		
		 response = requestType(type, Endpoints.CITYLIST);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	    
	}
	@Then("User verify the citylist response message matches {string} and saved city id")
	public void userVerifyTheCitylistResponseMessageMatchesAndSavedCityId(String expCityName) {
	    
		CityList_Output_Pojo cityList_Output_Pojo = response.as(CityList_Output_Pojo.class);
		ArrayList<CityList> data = cityList_Output_Pojo.getData();
		
		for(CityList eachCityList : data) {
			String cityName = eachCityList.getName();
			if(cityName.equals(expCityName)) {
				int cityId = eachCityList.getId();
				System.out.println(cityId);
				TC1_LoginStep.globalDatas.setCityId(cityId);
				Assert.assertEquals("Verify CityName", expCityName, cityName);
				
			}
		}
	}

}
