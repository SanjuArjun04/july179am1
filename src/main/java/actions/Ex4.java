package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4 {


		
		
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.snapdeal.com/ ");
		     Actions ac=new Actions(driver);
		     Thread.sleep(5000);
	WebElement sign=driver.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
		    
ac.moveToElement(sign).perform();
	}

}
