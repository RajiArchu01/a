package com.omrbranch.stepdefinition;

import java.util.ArrayList;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.pojo.address.StateList;
import com.omrbranch.pojo.address.StateList_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC2_StateListStep extends BaseClass {
	
	Response response;
	
	@Given("User add headers for to StateList")
	public void userAddHeadersForToStateList() {
		
		given();
		header("accept", "application/json");
		
	}
	
	@When("User send {string} request for StateList endpoint")
	public void userSendRequestForStateListEndpoint(String type) {
		
		 response = requestType(type, Endpoints.STATELIST);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	    
	}
	@Then("User should verify the statelist response message matches {string} and saved state id")
	public void userShouldVerifyTheStatelistResponseMessageMatchesAndSavedStateId(String expStateName) {
	    
		StateList_Output_Pojo stateList_Output_Pojo = response.as(StateList_Output_Pojo.class);
		ArrayList<StateList> data = stateList_Output_Pojo.getData();
		
		for(StateList eachStateList: data) {
			String stateName = eachStateList.getName();
			if(stateName.equals(expStateName)) {
				
				int stateIdNum = eachStateList.getId();
				String stateIdText = String.valueOf(stateIdNum);
				TC1_LoginStep.globalDatas.setStateIdText(stateIdText);
				System.out.println(stateIdNum);
				TC1_LoginStep.globalDatas.setStateIdNum(stateIdNum);
				System.out.println(stateIdText);
				
				
				Assert.assertEquals("Verify StateName", expStateName, stateName);
				break;
			}
		}
	}

}
