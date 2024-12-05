package Webauto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
	/*	WebElement simple_alert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		
		simple_alert.click();
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		confirmalert.click();
		 Alert confirm = driver.switchTo().alert();
		 Thread.sleep(3000);
		 confirm.dismiss(); */
		 
		 WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		 promptbox.click();
		 Alert prompt = driver.switchTo().alert();
		 prompt.sendKeys("Kottamuthu");
		 Thread.sleep(3000);
		 prompt.accept();
	}

}
