package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//driver.quit();
driver.findElement(By.name("q")).sendKeys("Youtube"+Keys.ENTER); 


		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.linkText("Go to Dashboard")).click();


	}

}
