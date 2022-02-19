package com.bit.resource;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Utility {

	public WebDriver dr;
	   public Utility(WebDriver x) {
	        dr = x;
	        PageFactory.initElements(dr, this);
	   }
	  
	  // public void getCurrentUrl(String url) {
		   //dr.navigate().to(url);
		  // dr.getCurrentUrl(url);}
		   
	  public void getAnyurl(String url) {
		  dr.get(url);
	  }
	
	public void clickOnAnyElement(By by) {
		dr.findElement(by).click();
	}
	
	public void typeOnAnyElement(By by, String value) {
		dr.findElement(by).sendKeys(value);
	}
	public void clickOnElement(List<WebElement> eles, String expectedText) throws InterruptedException {
		for(int i= 0; i<=eles.size();i++) {
	    boolean b= eles.get(i).getText().equals(expectedText);
	    if(b) {
	    	
	    }
	    else {
	    	eles.get(i).click();
	    	myWait(3000);
	    	dr.navigate().back();
	    }
	
		}
	}
	
	public void myWait(long mili) throws InterruptedException {
		Thread.sleep(mili);
	}

	public void getCurrentUrl(String url) {
		dr.getCurrentUrl();
		
	}
	 
	@FindBy(xpath = "value") List<WebElement> allQuantity;
	@FindBy(xpath = "value") WebElement pricee;
	@FindBy(xpath = "value") WebElement chpricee;
	public void varifyWomenJeanQuantityAndPrice(int expectedquantity ) {// user will select quantity 
		String pr = pricee.getText().replace("$", "");
		 double pric =  Double.parseDouble(pr);
		for(int i = 1; i<= allQuantity.size();i++) {
			String quantity = allQuantity.get(i).getText();
			int quant =	Integer.parseInt(quantity);
			if(quant == expectedquantity)
			allQuantity.get(i).click();
			
			String chpr = pricee.getText().replace("$", "");
			 double chpric =  Double.parseDouble(chpr);
		 
		 if (pric* quant == chpric ) {
		 //(quant<=allQuantity.size()) {
			 
		
		 System.out.println("pric is change"+ pric);
		 }
		}
}

	public void getTextOnElement(By by) {
		dr.findElement(by).getText();
		
	}
	public void manu(List<WebElement> eles, String text) {
		
		
	}
}
