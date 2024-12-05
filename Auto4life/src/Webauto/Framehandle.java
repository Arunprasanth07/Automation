package Webauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement clickone = driver.findElement(By.id("Click"));
		clickone.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement clicktwo = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clicktwo.click();
		
		driver.switchTo().defaultContent();
		
		List <WebElement> framecount = driver.findElements(By.tagName("iframe"));
		
		int size = framecount.size();
		System.out.println("No of frame is - "+ size);
		
		
		
		
		
	}


}
