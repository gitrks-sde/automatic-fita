package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		
		System.out.println("URL: "+driver.getCurrentUrl());
		
		String title=driver.getTitle();
		
		System.out.println("Title: "+title);
		
		driver.findElement(By.linkText("Java Specifications")).click();
		
		Thread.sleep(5000);
				
		System.out.println("Current URL: "+driver.getCurrentUrl());
		
		System.out.println("Page Source: "+driver.getPageSource());
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
		

	}

}
