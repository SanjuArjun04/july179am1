package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://toolsqa.com/automation-practice-form/");
		Thread.sleep(2000L);
	}

}
