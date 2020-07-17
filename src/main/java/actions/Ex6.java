package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
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
	ac.contextClick(fir).perform();
	Thread.sleep(4000);
	Robot r=new Robot();
	for(int i=1;i<5;i++)
	{
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}

}
