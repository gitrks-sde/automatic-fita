package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");

		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		email.sendKeys("wolverinek11@rahulshetty.com");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//input[@id='userPassword']"));
		password.sendKeys("Pwdselenium@1");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(4000);
		
		WebElement productaname=driver.findElement(By.xpath("//b[contains(text(),'ZARA')]"));
		
		System.out.println(productaname.getText());
		
		WebElement zara=driver.findElement(By.xpath("//b[contains(text(),'ZARA')]/../following-sibling::button[2]"));
		zara.click();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
