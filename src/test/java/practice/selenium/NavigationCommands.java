package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");

		Thread.sleep(4000);
		
		WebElement about= driver.findElement(By.linkText("About"));
		about.click();
		
		Thread.sleep(4000);
		
		WebElement aboutSelenium=driver.findElement(By.partialLinkText("Governance"));
		aboutSelenium.click();
		
		Thread.sleep(10000);
		driver.quit();

	}

}
