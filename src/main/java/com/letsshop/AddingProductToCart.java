package com.letsshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AddingProductToCart extends UserSuperClass{
	public static WebDriver driver;

	@Test(enabled=true,testName="TC005")
	public void loginToLetShop() throws InterruptedException
	{
		System.out.println("Method to launch Browser");
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://rahulshettyacademy.com/client");

		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.cssSelector("#userPassword"));
		password.sendKeys("Pwdselenium@1");
		Thread.sleep(3000);

		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
		
	}
	
	@Test(dependsOnMethods="loginToLetShop",testName="TC006")
	public void selectProduct()
	{
		System.out.println("Method to Select 2nd product");
		WebElement product1=driver.findElement(By.xpath("(//button[contains(text(),' View')])[3]"));
		product1.click();
	}
	@Test(dependsOnMethods="selectProduct",testName="TC007")
	public void addProductToCart() throws InterruptedException
	{
		System.out.println("Method to add to cart");
		WebElement addToCart=driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]"));
		addToCart.click();
		Thread.sleep(10000);
		
		
	}
	
	//@Test(dependsOnMethods="addProductToCart", testName="TC008", alwaysRun=true)
	public void closeConnection() throws InterruptedException
	{
		System.out.println("Method to close Browser");
		System.out.println("Welcome to TestNG");
		driver.quit();
		
	}
	
	
}
