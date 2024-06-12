package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/client");
		Thread.sleep(3000);

		WebElement registerlink = driver.findElement(By.linkText("Register"));
		registerlink.click();
		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.xpath("//*[@id='firstName']"));
		firstname.sendKeys("Karthi");
		Thread.sleep(3000);

		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("R");
		Thread.sleep(3000);
		
		Select occupation=new Select(driver.findElement(By.xpath("//select[@formcontrolname='occupation']")));
		occupation.selectByIndex(2);
		Thread.sleep(3000);
		occupation.selectByValue("4: Scientist");
		Thread.sleep(3000);
		occupation.selectByVisibleText("Doctor");
		
		WebElement radioBtnMale=driver.findElement(By.xpath("//input[@value='Male']"));
		
		boolean temp=radioBtnMale.isEnabled();
		System.out.println("Radio button selected: "+temp);

		Thread.sleep(10000);
		driver.quit();

	}

}
