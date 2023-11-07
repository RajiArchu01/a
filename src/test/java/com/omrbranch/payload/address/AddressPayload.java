package com.omrbranch.payload.address;

import com.omrbranch.pojo.address.AddUserAddress_Input_Pojo;
import com.omrbranch.pojo.address.CityList_Input_Pojo;
import com.omrbranch.pojo.address.DeleteAddress_Input_Pojo;
import com.omrbranch.pojo.address.UpdateUserAddress_Input_Pojo;

public class AddressPayload {

	public CityList_Input_Pojo cityListPayload(String stateId) {
		CityList_Input_Pojo cityList_Input_Pojo = new CityList_Input_Pojo(stateId);
		return cityList_Input_Pojo;
	}

	public AddUserAddress_Input_Pojo addUserAddressPayLoad(String firstName, String lastName, String mobile, String apartment, int state, int city, int country, String zipcode, String address, String addressType) {
		AddUserAddress_Input_Pojo address_Input_Pojo = new AddUserAddress_Input_Pojo(firstName, lastName, mobile, apartment, state, city, country, zipcode, address, addressType);
		return address_Input_Pojo;
	}

	public UpdateUserAddress_Input_Pojo updateUserAddressPayLoad(String addressId, String firstName, String lastName, String mobile, String apartment, int state, int city, int country, String zipcode, String address, String addressType) {
		UpdateUserAddress_Input_Pojo updateUserAddress_Input_Pojo = new UpdateUserAddress_Input_Pojo(addressId,firstName, lastName, mobile, apartment, state, city, country, zipcode, address, addressType);
		return updateUserAddress_Input_Pojo;
	}

	public DeleteAddress_Input_Pojo deleteAddressPayLoad(String addressIdText) {
		DeleteAddress_Input_Pojo deleteAddress_Input_Pojo = new DeleteAddress_Input_Pojo(addressIdText);
		return deleteAddress_Input_Pojo;
	}
	
}
