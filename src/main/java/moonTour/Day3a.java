package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sanju@gamil.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sanju");	
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		
	}

}
