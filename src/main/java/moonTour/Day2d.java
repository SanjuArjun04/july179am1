package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.swiggy.com/");
driver.findElement(By.cssSelector("#location")).sendKeys("Kelambakam");

driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");

driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("sanju");
	
	}

}
