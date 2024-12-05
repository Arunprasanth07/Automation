package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.Driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		//find the button position
		WebElement Position =	driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt94\']/span[2]"));

		Point xyvalue = Position.getLocation();

		int xvalue = xyvalue.getX();
		int yvalue = xyvalue.getY();
		System.out.println("X is "+ xvalue + "Y is " + yvalue);

		//find the size of the button
		WebElement size =	driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();

		System.out.println("Height = "+ height + "width = "+ width);
		//find the button colour
		WebElement colour =	driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"));
		String  buttoncolour = colour.getCssValue("background-color");
		System.out.println("colour of button is "+ buttoncolour);
	//	 Click the button
	WebElement click =	driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']/span"));
	    click.click(); 





	}

}
