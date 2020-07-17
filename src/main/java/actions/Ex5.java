package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Actions ac=new Actions(driver);
	//WebElement fir=	driver.findElement(By.xpath("//h1[contains(text(),'1 Software Training Institutes in Chennai with Placements')]"));
WebElement fir=driver.findElement(By.xpath("//h1[@style='font-size:22px;']"));
		ac.doubleClick(fir).perform();
	String s=	fir.getText();
	System.out.println(s);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);

	}

}
