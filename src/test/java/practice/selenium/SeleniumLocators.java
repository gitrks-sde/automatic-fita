package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");

		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("karthikeyan.r@gmail.com");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.cssSelector("#userPassword"));
		password.sendKeys("123245566");
		Thread.sleep(3000);

		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		Thread.sleep(3000);

		WebElement registerlink = driver.findElement(By.linkText("Register"));
		registerlink.click();
		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.xpath("//*[@id='firstName']"));
		firstname.sendKeys("karthi");
		Thread.sleep(3000);

		WebElement lastname = driver.findElement(By.tagName("input"));
		lastname.sendKeys("R");
		Thread.sleep(10000);

		driver.quit();

	}

}
