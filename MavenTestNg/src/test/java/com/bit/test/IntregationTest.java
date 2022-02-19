package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bit.resource.DataDriven;
import com.bit.resource.Utility;

public class IntregationTest extends BaseTest {
	
	@Test (dataProviderClass = DataDriven.class, dataProvider="login")
	
	public void faceBooklogin(String email, String password) {
		Utility u = new Utility(dr);
		u.getCurrentUrl("https://www.facebook.com/");
		u.typeOnAnyElement(By.name("email"), email);
		u.typeOnAnyElement(By.name("pass"), password);
		u.clickOnAnyElement(By.name("login"));
		
	}
	
@Test

public void targetmanu( ) throws InterruptedException {
	Utility u = new Utility(dr);
	
	u.clickOnElement(u.dr.findElements(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li/a")), "Orders");

}
}
