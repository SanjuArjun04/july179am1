package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	     Actions ac=new Actions(driver);
	    // WebElement first=driver.findElement(By.xpath("//a[text()='COURSES']"));
	     WebElement first=driver.findElement(By.className("activeLink"));
	    // WebElement first=driver.findElement(By.xpath("//li[@id='nav_43']"));
	     ac.moveToElement(first).perform();
	     Thread.sleep(3000);
	    /* WebElement sec=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
ac.moveToElement(sec).perform();
	     WebElement btn =driver.findElement(By.className("sub-menu"));
	     List<WebElement> tag=btn.findElements(By.tagName("a"));
	     System.out.println("number of tags"+ tag.size());
	     for(WebElement menu:tag)
	     {
	    	 if(menu.getText().equals("Oracle Training  "))
	    	 {
	    		 menu.click();
	    		 break;
	    	 }
	     }*/
	     WebElement sec=driver.findElement(By.xpath("//ul[@class='dropdown']/li[3]/ul/li/a"));
	     ac.moveToElement(sec).perform();
	     
	     driver.findElement(By.xpath("//ul[@class='dropdown']/li[3]/ul/li/ul/li[3]/a")).click();
	}
}