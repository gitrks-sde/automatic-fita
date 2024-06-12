package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.letsshop.BaseClass;
import com.pageobjectmodel.letshop.Homepage;
import com.pageobjectmodel.letshop.LoginPage;
import com.pageobjectmodel.letshop.ProductPage;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefinitionsClass extends BaseClass {

	@Given("URL is loaded")
	public void url_is_loaded() {
		System.out.println("Launching Browser");
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://rahulshettyacademy.com/client");
	}

	@When("user enters the email ID")
	public void user_enters_the_email_id() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail("wolverinek11@rahulshetty.com");
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPassword("Pwdselenium@1");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginButton();
	}

	@Then("verfiy logged in successfully")
	public void verfiy_logged_in_successfully() {
		Homepage homePage = new Homepage(driver);
		Assert.assertEquals(true, homePage.verfiyHomepageLoaded());
	}

	@When("click on the product zara")
	public void click_on_the_product_zara() {
		Homepage homepage = new Homepage(driver);
		homepage.clickToViewZara();

	}

	@And("click Add To Cart button")
	public void click_Add_To_Cart_button() {
		ProductPage productPage = new ProductPage(driver);
		productPage.ClickAddTocart();
	}
	
	@When("click on the product iphone")
	public void click_on_the_product_iphone()
	{
		Homepage homepage = new Homepage(driver);
		homepage.clickToViewIphone();
	}
	
	@After
	public void close()
	{
		driver.close();
	}
}
