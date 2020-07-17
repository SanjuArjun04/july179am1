package org.pruple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskPurple {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://purple.com/");
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("")));
        
	}
}
