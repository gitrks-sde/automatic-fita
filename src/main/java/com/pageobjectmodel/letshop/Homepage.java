package com.pageobjectmodel.letshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By viewBtn_Zara=By.xpath("(/button[contains(text(),' View')])[1]");
	By viewBtn_Iphone=By.xpath("(//button[contains(text(),' View')])[3]");
	
	@FindBy(xpath="//p[contains(text(),'Automation Practice')]")
	public WebElement pageHeader;
	
	public void clickToViewZara()
	{
		driver.findElement(viewBtn_Zara).click();
	}
	
	public void clickToViewIphone()
	{
		driver.findElement(viewBtn_Iphone).click();
	}
	
	public boolean verfiyHomepageLoaded()
	{
		return pageHeader.isDisplayed();
	}

}
