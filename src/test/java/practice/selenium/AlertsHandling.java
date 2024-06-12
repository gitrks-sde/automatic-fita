package practice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
			
		WebElement submitBtn=driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		submitBtn.click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Selenium Practice");
		alert.accept();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
