package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	static WebDriver driver;
	public static void launch(String s)
	{
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
	}
	public static void fill(WebElement w, String s)
	{
	w.sendKeys(s);
	}

	public static void klik(WebElement w)
	{
	w.click();	
	}
	public static void dropdown(WebElement w,int i)
	{
		Select s=new Select(w);
		s.selectByIndex(i);
	}
	public static void radiobtn(WebElement w)
	{
		w.click();
	}
	public static void lgnbtnclick(WebElement w)
	{
		w.click();
	}
	public static void webtable(WebElement w)
	{
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		for(WebElement x:row) {
			List<WebElement> data=x.findElements(By.tagName("td"));
			for(WebElement k:data) {
			String name=k.getText();
			System.out.println(name);
			}
		}
	}
}	


