package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
    WebElement page=driver.findElement(By.id("body-wrapper"));
       Actions acc=new Actions(driver);
       acc.contextClick(page).perform();
       Robot r=new Robot();
       for(int i=1;i<5;i++)
   	{
   	r.keyPress(KeyEvent.VK_DOWN);
   	r.keyRelease(KeyEvent.VK_DOWN);
   	}
   	
   	r.keyPress(KeyEvent.VK_ENTER);
   	r.keyRelease(KeyEvent.VK_ENTER);
       

	}

}
