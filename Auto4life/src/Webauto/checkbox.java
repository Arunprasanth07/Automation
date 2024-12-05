package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.leafground.com/checkbox.xhtml");
	
	WebElement java = driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
	java.click();
	
	WebElement isselect = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
	
	Boolean result = isselect.isSelected();
	
	System.out.println(result);
	
	WebElement toggle = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt100\']/div[2]"));

	
	if (toggle.isDisplayed()) {
		toggle.click();
	}
	
	WebElement find = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102\']/div[2]"));
	Boolean result1 = find.isEnabled();
	System.out.println(result1);
	
	
	
	
	
	
	}
	
	

}
