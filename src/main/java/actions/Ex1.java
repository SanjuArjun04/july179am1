package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions acc=new Actions(driver);
      WebElement first=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2  '])[1]"));
       acc.moveToElement(first).perform();
       Thread.sleep(3000);
WebElement se=driver.findElement(By.xpath("//div[@id='nav-al-your-account']/a"));

		se.click();

	}

}
