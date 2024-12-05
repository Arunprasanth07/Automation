package Webauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownoptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		System.setProperty("Webdriver.chrome.Driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
	/*	// Selecting the course using select index option
		WebElement coursedrop = driver.findElement(By.className("ui-selectonemenu"));
		
		Select select = new Select(coursedrop);
		
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByVisibleText("Playwright"); */
		
		// Selecting the no of options using list method option
		WebElement Noofoptn = driver.findElement(By.className("ui-selectonemenu-label ui-inputfield ui-corner-all"));
		
		Select select = new Select(Noofoptn);
		
		List <WebElement> options = select.getOptions();
		int list = options.size();
		System.out.println("No of options is" + list);
		
	}

}
