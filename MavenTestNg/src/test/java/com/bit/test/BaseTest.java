package com.bit.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.configuration.Theme;



public class BaseTest {
public WebDriver dr;

public ExtentTest test;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void openBrowser(String browser, String url) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWEETY\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.get(url);
		}

	}

	@AfterClass
	public void closeBrowser() {
		dr.quit();
	}

	@AfterMethod
	public void afterMethod(ITestResult arg0) throws IOException {
		System.out.println("arg0");
		if (arg0.getStatus() == ITestResult.FAILURE) {
			System.out.println(arg0.getName() + "ScreenShot of Failure");
			test.fail(arg0.getMethod().getMethodName()+ "is Fail");
			File sf = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(sf, new File("C:\\Users\\SWEETY\\Desktop\\BTC31072021m\\MavenTestNg\\screnshort.png"),
					true);
		}

		else if (arg0.getStatus() == ITestResult.SUCCESS) {
			test.pass(arg0.getMethod().getMethodName() +" is pass");
			System.out.println(arg0.getName() + "Is Success");
		}

		else if (arg0.getStatus() == ITestResult.SKIP) {
			test.skip(arg0.getMethod().getMethodName() +" is skip");
			System.out.println(arg0.getName() + "Is Skip");
		}

	}
	
	
}
