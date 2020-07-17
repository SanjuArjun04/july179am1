package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3b {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.greenstechnologies.in/selenium-training.php");
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\'course-home\']/h6/p")).getText());

	}

}
