package com.pageobjectmodel.letshop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By addTocartBtn=By.xpath("//button[contains(text(),'Add to Cart')]");
	
	@FindBy(xpath="//button[contains(text(),'Cart')]/i")
	WebElement cartBtn;
	
	@FindBy(xpath="//div[@class='cartSection']/h3")
	WebElement productHeader;
	
	@FindBy(xpath="//button[contains(text(),'Checkout')]")
	WebElement checkoutBtn;
	
	public void ClickAddTocart()
	{
		driver.findElement(addTocartBtn).click();
	}
	
	public void ClickCartToView()
	{
		cartBtn.click();
	}
	
	public String getProductName()
	{
		return productHeader.getText();
	}
	
	public void clickCheckoutButton()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		checkoutBtn.click();
	}

}
