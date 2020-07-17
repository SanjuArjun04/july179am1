package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("greens Technology");
driver.close();
	}

}
