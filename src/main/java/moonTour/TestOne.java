package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		//System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
	
		 
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("my email id");
		//driver.findElement(By.CssSelector("#email")).click();	
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		//driver.findElement(By.CssSelector("#loginbutton")).click();		
	
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		
		
		
		
		
		
				

	}}

