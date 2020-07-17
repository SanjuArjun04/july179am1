package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.findElement(By.xpath("//*[@id=\'nav-wrapper\']/ul/li[6]/a")).click();
	
		driver.findElement(By.xpath("//input[@id='InputName']")).sendKeys("sanju");

          driver.findElement(By.xpath("//*[@id=\'InputEmail1\']")).sendKeys("sanju@gamail.com");
          driver.findElement(By.cssSelector("#InputSubject")).sendKeys("34235346545645");
          driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/select[1]")).click();
          Select s= new Select(driver.findElement(By.name("courses")));
          s.selectByValue("JAVA/J2EE");
          Select k=new Select(driver.findElement(By.name("branch")));
          k.selectByValue("Adyar");
          Select t=new Select(driver.findElement(By.name("time")));
          t.selectByValue("Immediately");
          driver.findElement(By.name("comments")).sendKeys("looking forward to join the class");
          driver.findElement(By.id("submit")).click();
        //  driver.close();
          
       
	}

}
