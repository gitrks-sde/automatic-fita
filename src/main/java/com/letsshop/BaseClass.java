package com.letsshop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;


public class BaseClass{
	public static WebDriver driver;

	@BeforeTest
	public void OpeningURL() throws InterruptedException
	{
		System.out.println("Launching Browser");
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://rahulshettyacademy.com/client");
		
		
	}
	
	@AfterTest
	public void closeConnection() throws InterruptedException
	{
		System.out.println("Closing Connection....");
		Thread.sleep(10000);
		driver.quit();
		
	}
	
	public static void captureScreenshot() throws IOException
	{
		File files=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files, new File("./WD_ScreenShot.jpg"));
	}
	
	
	
}
