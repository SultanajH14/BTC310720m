package com.bit.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bit.resource.Facebooklogin;
import com.bit.resource.InvalidDataException;

public class ExceptionTest extends BaseTest{
@Test
public void Facebook() throws InvalidDataException {
	Facebooklogin fb = new Facebooklogin(dr);
	//fb.getAnyurl("https://www.facebook.com/");
	
	fb.typeOnEmail(By.name("email"), "adkj235@yahoocom");
	fb.typeOnAnyElement(By.name("pass"), "asd2345");
	fb.clickOnAnyElement(By.name("login"));
	fb.getTextOnElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
		
	}
	
}

