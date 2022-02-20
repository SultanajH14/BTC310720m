package com.bit.res;

import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

public class dataprTest {
	
	SoftAssert s= new SoftAssert();
	public void test() {
		s.assertTrue(3>4);
		System.out.println("hi");
		s.assertAll();
	}
	
	@DataProvider(name= "login")
	public Object[][] getData(){
		Object[][] o = new Object[2][2];
		o[0][0] = "user1";
		o[0][1] = "dfg3";
		o[1][0] = "user1";
		o[1][1] = "fdsg5";
		return o;
	}

}
