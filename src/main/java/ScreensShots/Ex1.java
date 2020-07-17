package ScreensShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/ ");
		TakesScreenshot t=(TakesScreenshot)driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File des=new File("D:\\green.png");
	FileUtils.copyFile(src, des);
	}

}
