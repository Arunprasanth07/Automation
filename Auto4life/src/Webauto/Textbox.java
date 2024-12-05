package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.Driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement name =	driver.findElement(By.name("j_idt88:name"));
		name.sendKeys("Arun Prasanth K");

		WebElement addtext =	driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
		addtext.sendKeys("Express");

		WebElement findtext = 	driver.findElement(By.id("j_idt88:j_idt97"));
		String value = findtext.getAttribute("value");
		System.out.println(value);

		WebElement cleardata =	driver.findElement(By.id("j_idt88:j_idt95"));
		cleardata.clear();

		WebElement find = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']"));
		Boolean result = find.isEnabled();
		System.out.println(result);
	}

}
