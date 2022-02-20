package com.bit.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver dr;
@Parameters({"browser","url"})
 public void openBrowser(String b, String u) {
	if (b.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWEETY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr= new ChromeDriver();
	}if (b.equals("Firefox")) {
		System.setProperty("","");
		dr= new ChromeDriver();
	 
 }
}
}
