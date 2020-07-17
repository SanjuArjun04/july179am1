package moonTour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.get("http://www.greenstechnologys.com/");
		driver.get( "https://www.amazon.in");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
	driver.close();
	}

	
}

