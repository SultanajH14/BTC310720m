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
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
	public WebDriver dr;
	public ExtentHtmlReporter htmlReporter;
	public  ExtentReports extent;
	public  static ExtentTest test;
	@BeforeSuite
	public void Setup() {
	 
		 htmlReporter = new ExtentHtmlReporter("extent.html");
	    extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
		
        
        
        /*extent = new ExtentReports();
		spark = new ExtentSparkReporter("C:\\Users\\SWEETY\\Desktop\\BTC31072021m\\MavenTestNg\\Html_report" +"UnitTest" +".html");

		extent.attachReporter(spark);
		spark.config().setTheme(Theme.DARK);*/
		
	}

	
	@BeforeClass
	@Parameters({ "browser" })
	public void openBrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWEETY\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();
			//dr.get(url);
		}

	}

	
		@AfterMethod
		public void afterMethod(ITestResult arg0) throws IOException {
			System.out.println("arg0");
			if (arg0.getStatus() == ITestResult.FAILURE) {
				//System.out.println(arg0.getName() + "ScreenShot of Failure");
				test.fail(arg0.getName()+ "is Fail");
				test.log(Status.FAIL,arg0.getThrowable());
				File sf = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(sf, new File("C:\\Users\\SWEETY\\Desktop\\BTC31072021m\\MavenTestNg\\screnshort.png"),true);
			test.addScreenCaptureFromPath("C:\\Users\\SWEETY\\Desktop\\BTC31072021m\\MavenTestNg\\screnshort.png");
			}

			else if (arg0.getStatus() == ITestResult.SUCCESS) {
				test.pass(arg0.getName() +" is pass");
				//test.log(Status.PASS, arg0.getThrowable());
				//System.out.println(arg0.getName() + "Is Success");
			}

			else if (arg0.getStatus() == ITestResult.SKIP) {
				test.skip(arg0.getName() +" is skip");
				System.out.println(arg0.getName() + "Is Skip");
			}

		}
		

		
	@AfterClass
	public void closeBrowser() {
		dr.quit();
		//dr.close();
	}
	
	@AfterSuite
	public void tearDown() {
		//dr.close();
		//dr.quit();
		extent.flush();
		
	}
}
