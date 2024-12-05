package Webauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.Driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		// Selecting the multiple options using select class option
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/ul"));
		
		Select multioption = new Select(multiselect);
		
		multioption.selectByIndex(1);
		multioption.selectByIndex(3);
		multioption.selectByIndex(5);
		
	}

}
