package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
				
		WebElement practice=driver.findElement(By.xpath("(//a[text()='Practice'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", practice);
		Thread.sleep(3000);
		practice.click();
		
		driver.switchTo().parentFrame();
		
		WebElement radioBtn=driver.findElement(By.xpath("//input[@value='radio2']"));
		js.executeScript("arguments[0].scrollIntoView();", radioBtn);
		Thread.sleep(3000);
		radioBtn.click();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
