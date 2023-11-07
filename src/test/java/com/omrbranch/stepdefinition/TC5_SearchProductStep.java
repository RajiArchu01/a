package com.omrbranch.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payloadmanager.PayLoadObjectManager;
import com.omrbranch.pojo.product.ProductListDatum;
import com.omrbranch.pojo.product.ProductListVariation;
import com.omrbranch.pojo.product.ProductList_Output_Pojo;
import com.omrbranch.pojo.product.SearchProductList;
import com.omrbranch.pojo.product.SearchProduct_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC5_SearchProductStep extends BaseClass {
	PayLoadObjectManager pom = new PayLoadObjectManager();
	Response response;
	@Given("User add header for to searchProduct")
	public void user_add_header_for_to_search_product() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept","application/json");
		Header h2 = new Header("Content-Type", "application/json");
		lstHeader.add(h1);
		lstHeader.add(h2);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
	}
	
	@When("User add request body text for get productList of {string}")
	public void userAddRequestBodyTextForGetProductListOf(String product) {
		payLoad(pom.getProductSearchPayload().searchAddressPayload(product));
	}
	
	@When("User send {string} request for SearchProduct endpoint")
	public void user_send_request_for_search_product_endpoint(String type) {
		 response = requestType(type, Endpoints.SEARCHPRODUCT);
		 int statusCode = getStatusCode(response);
		 TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the productList response message matches {string} and saved categoryId and id and type")
	public void user_should_verify_the_product_list_response_message_matches_and_saved_category_id_and_id_and_type(String expSearchProductSuccessMsg) {
	   SearchProduct_Output_Pojo searchProduct_Output_Pojo = response.as(SearchProduct_Output_Pojo.class);
	    String message = searchProduct_Output_Pojo.getMessage();
	    Assert.assertEquals("Verify SearchProduct SuccessMsg OK", expSearchProductSuccessMsg, message);
	    
	    ArrayList<SearchProductList> data = searchProduct_Output_Pojo.getData();
	    for(SearchProductList eachSearchProductList: data) {
	    	int category_id = eachSearchProductList.getCategory_id();
	    	String categoryId = String.valueOf(category_id);
	    	TC1_LoginStep.globalDatas.setCategoryId(categoryId);
	    }
	    
	}
	
	@Given("User add header for to productList")
	public void userAddHeaderForToProductList() {
		List<Header> lstHeader = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		lstHeader.add(h1);
		lstHeader.add(h2);
		Headers headers = new Headers(lstHeader);
		addHeaders(headers);
	}
	
	@When("User add request body text to get product details with {string} and {string}")
	public void userAddRequestBodyTextToGetProductDetailsWithAnd(String categoryId, String pageNo) {
	    payLoad(pom.getProductSearchPayload().productListPayLoad(TC1_LoginStep.globalDatas.getCategoryId(), pageNo));
	}
	@When("User send {string} request for ProductList endpoint")
	public void userSendRequestForProductListEndpoint(String type) {
	     response = requestType(type, Endpoints.PRODUCTLIST);
	     int statusCode = response.getStatusCode();
	     TC1_LoginStep.globalDatas.setStatusCode(statusCode);
	}
	@Then("User should verify the productList response message matches {string} and saved productId and productVariationId")
	public void userShouldVerifyTheProductListResponseMessageMatchesAndSavedProductIdAndProductVariationId(String expOKSuccessMsg) {
	    ProductList_Output_Pojo productList_Output_Pojo = response.as(ProductList_Output_Pojo.class);
	    String message = productList_Output_Pojo.getMessage();
	    ArrayList<ProductListDatum> data = productList_Output_Pojo.getData();
	    for(ProductListDatum eachProductListDatum:data) {
	    	String name = eachProductListDatum.getName();
	    	if(name.equals("YUM YUM Daily Needs Dry Fruits Combo Pack")) {
	    		int id = eachProductListDatum.getId();
	    		String productId = String.valueOf(id);
	    		TC1_LoginStep.globalDatas.setProductId(productId);
	    		ArrayList<ProductListVariation> variationsData = eachProductListDatum.getVariations();
	    		for(ProductListVariation eachProductListVariation: variationsData) {
	    			String price = eachProductListVariation.getPrice();
	    			if(price.equals("1550.00")) {
	    				int id2 = eachProductListVariation.getId();
	    				String productVariationId = String.valueOf(id2);
	    				TC1_LoginStep.globalDatas.setProductVariationId(productVariationId);
	    			}
	    		}
	    	}
	    } 
	    Assert.assertEquals("Verify Message OK", expOKSuccessMsg, message);
	}

}
