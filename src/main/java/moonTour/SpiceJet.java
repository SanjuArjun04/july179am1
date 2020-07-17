package moonTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("https://www.spicejet.com/");
		
		
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
	//calendar
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

    System.out.println("its enabled");
   else
 {
	System.out.println("its  not enabled");
}
   
  //checkbox
  // driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscout']")).click();
   //dropdown
   
 //  driver.findElement(By.id("divpaxinfo")).click();
  driver.findElement(By.id("divpaxinfo")).click();

   
 //  Select k=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
   //k.selectByValue("5");
   
   
   Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
   s.selectByValue("USD");
   
   driver.findElement(By.cssSelector("#ctl00$mainContent$btn_FindFlights")).click();
   
   
}
}
