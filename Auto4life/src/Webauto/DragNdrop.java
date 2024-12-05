package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\'form:drop_content\']"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(from).moveToElement(to).release().build().perform();
		
		// Or simple method below
		
		action.dragAndDrop(from, to).build().perform();

		
	}

}
