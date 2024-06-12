package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"C:Users/karth/Downloads/chromedriver-win64_v124/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//h3[contains(text(),'DEBIT SIDE')]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(3000);
		
		WebElement bank=driver.findElement(By.xpath("//a[contains(text(),'BANK ')]"));
		WebElement droplocation=driver.findElement(By.xpath("//*[@id='bank']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(bank, droplocation).perform();
		
		WebElement amount=driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amountlocation=driver.findElement(By.xpath("//*[@id='amt7']"));
		
		act.dragAndDrop(amount, amountlocation).perform();
		
		Thread.sleep(10000);
		driver.quit();
	}

}
