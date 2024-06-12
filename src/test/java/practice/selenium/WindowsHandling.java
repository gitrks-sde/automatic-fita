package practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String tab1=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radio2.click();
		Thread.sleep(3000);
		String tab2=driver.getWindowHandle();
		System.out.println(tab1+"   "+tab2);
		
		driver.switchTo().window(tab1);
		
		WebElement chooseBtn=driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(3000);
		chooseBtn.sendKeys("C:\\Users\\karth\\Downloads\\Cucumber Assessment.pdf");
		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
