package Webauto;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement oldwindow1 = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		oldwindow1.click();
		
		Set<String> newwindow = driver.getWindowHandles();
		
		for (String new1 : newwindow) {
			driver.switchTo().window(new1);
					
		}
		
		WebElement mail = driver.findElement(By.xpath("//*[@id=\'email\']"));
		mail.sendKeys("Testmail@123");
		
		driver.close();
		driver.switchTo().window(oldwindow);
		
		WebElement oldwindow2 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		
		oldwindow2.click();
		
		
		 Set <String> multi = driver.getWindowHandles();
		int size = driver.getWindowHandles().size();
		System.out.println("No of tabs opened: " + size);
		
		for (String switchw : multi) {
			if (!switchw.equals(oldwindow2));
			driver.switchTo().window(switchw);
			driver.close();
		}
		
		driver.quit();
		
		
		
		
		
		
	}

}
