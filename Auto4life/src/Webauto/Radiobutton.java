package Webauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\prasa\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement defaultselect1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]/span"));

		WebElement defaultselect2 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[2]/div/div[2]"));
		
		Boolean status1 = defaultselect1.isSelected();
		Boolean status2 = defaultselect2.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement Select = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]"));
		
		Select.click();
		
	}

}
