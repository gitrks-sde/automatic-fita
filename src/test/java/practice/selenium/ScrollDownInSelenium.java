package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,1000);", "");		
		WebElement ele=driver.findElement(By.xpath("//legend[contains(text(),'Fixed')]"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-350);", "");
		
		Thread.sleep(10000);
		driver.quit();
	}

}
