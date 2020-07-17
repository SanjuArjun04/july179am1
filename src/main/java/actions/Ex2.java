package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
	     Actions ac=new Actions(driver);
	    // WebElement first=driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[23]"));
	     Thread.sleep(3000);
	   //  WebElement first=driver.findElement(By.xpath("(//li[@onmouseover='mouseoverNavigation(this);'])[4]"));
	     WebElement first=driver.findElement(By.xpath("//li[@id='nav_43']"));
	     ac.moveToElement(first).perform();
	     Thread.sleep(3000);
	  Alert a=driver.switchTo().alert();
         a.dismiss();
	     //driver.quit();
	}

}
