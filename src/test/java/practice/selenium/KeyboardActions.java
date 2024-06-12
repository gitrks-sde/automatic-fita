package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		Thread.sleep(3000);
		
		WebElement r1=driver.findElement(By.xpath("//input[@value='radio2']"));
		r1.click();
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		
		a.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyUp(Keys.TAB)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.keyUp(Keys.ENTER)
		.build()
		.perform();
		
		WebElement name=driver.findElement(By.id("name"));
		
		a.sendKeys("selenium")
		.keyDown(Keys.CONTROL)
		.keyDown("a")		
		.keyUp("a")
		.keyDown("c")
		.keyUp("c")
		.keyUp(Keys.CONTROL)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)
		.keyDown(Keys.TAB)	
		.keyUp(Keys.TAB)
		.keyDown(Keys.CONTROL)
		.keyDown("v")
		.keyUp("v")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
