package com.bit.resource;

import org.testng.annotations.DataProvider;

public class DataDriven {
	
	@DataProvider(name = "login")
	public Object[][] macyslogin() {
		Object o[][] = new Object[2][2];
		o[0][0] = "gsffw@gmail.com";
		o[0][0] = "df3445";
		o[0][0] = "kjh@gmail.com";
		o[0][0]	= "567assd"	;
		return o;
	}

}
