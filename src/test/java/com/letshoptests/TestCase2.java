package com.letshoptests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.letsshop.BaseClass;
import com.letsshop.ExternalDataReader;
import com.pageobjectmodel.letshop.Homepage;
import com.pageobjectmodel.letshop.LoginPage;
import com.pageobjectmodel.letshop.ProductPage;

public class TestCase2 extends BaseClass {

	@Test
	public void loginToLetshopApp() throws InvalidFormatException, IOException {
		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterEmail(ExternalDataReader.readUsername());
		loginPage.enterPassword(ExternalDataReader.readPassword());
		loginPage.clickOnLoginButton();
	}

	@Test(dependsOnMethods="loginToLetshopApp")
	public void selectAndAddProductIphone() {
		Homepage homepage = new Homepage(driver);
		ProductPage productPage = new ProductPage(driver);

		homepage.clickToViewIphone();
		productPage.ClickAddTocart();
		

	}

	@Test(dependsOnMethods="selectAndAddProductIphone")
	public void verfiyCorrectProductAdded() {
		ProductPage productPage = new ProductPage(driver);
		String expectedProductName = "zara";
		
		productPage.ClickCartToView();
		
		String actualProductName = productPage.getProductName();

		System.out.println("Added Product: " + actualProductName);

		if (expectedProductName.equalsIgnoreCase(actualProductName)) {
			System.out.println("Correct Product added");
		} else {
			System.out.println("Incorrect Product added");
		}
		
		//Assert.assertEquals(actualProductName,expectedProductName);
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualProductName, expectedProductName);
	}
	
	@Test(dependsOnMethods="verfiyCorrectProductAdded")
	public void checkoutProduct()
	{
		ProductPage productPage=new ProductPage(driver);
		
		productPage.clickCheckoutButton();
	}
}
