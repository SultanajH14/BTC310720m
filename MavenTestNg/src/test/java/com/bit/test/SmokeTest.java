package com.bit.test;

import org.testng.annotations.Test;

import com.bit.resource.Utility;

public class SmokeTest extends BaseTest{

	
	
	@Test(priority=1)
	
	public void primetest() {
		
		System.out.println("primetest");
	}
	
	@Test
	
	public void sdf() {
		Utility cd = new Utility(dr);
	cd.varifyWomenJeanQuantityAndPrice(3);
	}
	
}
