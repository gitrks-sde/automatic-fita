package com.letshoptests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.letsshop.BaseClass;
import com.pageobjectmodel.letshop.Homepage;
import com.pageobjectmodel.letshop.LoginPage;
import com.pageobjectmodel.letshop.ProductPage;

public class TestCase1 extends BaseClass {

	@Test
	public void logintoApp() throws IOException
	{
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterEmail("wolverinek11@rahulshetty.com");
		loginPage.enterPassword("Pwdselenium@1");
		loginPage.clickOnLoginButton();
	}
	@Test(dependsOnMethods="logintoApp")
	public void selectAndAddProcutToCart() throws IOException
	{
		Homepage homepage=new Homepage(driver);
		ProductPage productPage=new ProductPage(driver);
		
		homepage.clickToViewZara();
		productPage.ClickAddTocart();
		
	}
}
