package com.bit.resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebooklogin {
	public WebDriver dr;
	
	public Facebooklogin(WebDriver dr) {
		this.dr = dr;
	}

	public void getAnyurl(String url) {
		dr.get(url);
	}
	public void clickOnAnyElement(By by) {
		dr.findElement(by).click();
	}
	public void typeOnEmail(By by,String email )  {
		if(email.contains(".")) {
			dr.findElement(by).sendKeys("email");
		
		}
		else {
			try {
				throw new InvalidDataException(email);
				
			}
			catch(InvalidDataException e){
				System.out.println(e.InvalidData());
				e.printStackTrace();
			
				
			}
		}
			
	}
		
	
	public void typeOnAnyElement(By by,String password ) {
		dr.findElement(by).sendKeys("password");
	}
	public void getTextOnElement(By by) {
	String s= dr.findElement(by).getText();
	System.out.println(s);
	}
}
