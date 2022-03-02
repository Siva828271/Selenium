package com.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot a =(TakesScreenshot) driver;
		
	File screenshot = a.getScreenshotAs(OutputType.FILE);
	
	File loc = new File("C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Screenshot\\cricbuzz.png");
	
	FileUtils.copyFile(screenshot, loc);
	
	driver.navigate().to("https://www.starbucks.in/");
	driver.manage().window().maximize();
	
	TakesScreenshot a1=(TakesScreenshot) driver;
	
	File screenshot1= a1.getScreenshotAs(OutputType.FILE);
	
	File loc1 = new File("C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Screenshot\\starbucks.png");
	
	FileUtils.copyFile(screenshot1, loc1);
	

		
		
	
		
		
		
		
		
		
		

	}
}
