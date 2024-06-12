package com.pageobjectmodel.letshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email=By.xpath("//input[@id='userEmail']");
	By password=By.cssSelector("#userPassword");
	By loginBtn=By.name("login");
	
	
	
	public void enterEmail(String useremail)
	{
		driver.findElement(email).sendKeys(useremail);
	}
	
	public void enterPassword(String userpassword)
	{
		driver.findElement(password).sendKeys(userpassword);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginBtn).click();
	}

}
