package practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		
		WebElement cauliflower=driver.findElement(By.xpath("//h4[contains(text(),'Cauliflower')]/../div[3]/button"));
		cauliflower.click();
		
		WebElement cartIcon=driver.findElement(By.xpath("//a[@class='cart-icon']"));
		cartIcon.click();
		
		WebElement proceed=driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO')]"));
		proceed.click();
		
		WebElement input=driver.findElement(By.xpath("//input[@class='promoCode']"));
		input.sendKeys("rahulshettyacademy");
		
		WebElement applyBtn=driver.findElement(By.xpath("//button[@class='promoBtn']"));
		applyBtn.click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		Thread.sleep(10000);
		driver.quit();
	}

}
