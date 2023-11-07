package com.omrbranch.payload.product;

import com.omrbranch.pojo.product.ProductList_Input_Pojo;
import com.omrbranch.pojo.product.SearchProduct_Input_Pojo;

public class ProductSearchPayload {
	public SearchProduct_Input_Pojo searchAddressPayload(String product) {
		SearchProduct_Input_Pojo searchProduct_Input_Pojo = new SearchProduct_Input_Pojo(product);
		return searchProduct_Input_Pojo;
	}
	public ProductList_Input_Pojo productListPayLoad(String categoryId, String pageNo) {
		ProductList_Input_Pojo productList_Input_Pojo = new ProductList_Input_Pojo(categoryId, pageNo);
		return productList_Input_Pojo;
	}
}
