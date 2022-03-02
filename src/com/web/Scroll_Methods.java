package com.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Methods {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://isaimini.techsslash.com/");
		driver.manage().window().maximize();

		// Scroll down by webelement method
		WebElement down = driver.findElement(By.xpath("(//div[@class='line'])[3]"));
		Thread.sleep(2000);
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("arguments[0].scrollIntoView();", down);

		// Scroll up by webelement method
		WebElement up = driver.findElement(By.xpath("(//div[@class='line'])[1]"));
		Thread.sleep(2000);
		a.executeScript("arguments[0].scrollIntoView();", up);

		// Scroll down by range
		Thread.sleep(2000);
		a.executeScript("window.scrollBy (0,3000);");

		// Scroll up by range
		Thread.sleep(2000);
		a.executeScript("window.scrollBy (0,-3000);");

		// to take screenshot
		TakesScreenshot sc = (TakesScreenshot) driver;
		File a1 = sc.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Screenshot\\isaimini.png");
		FileUtils.copyFile(a1, b);

	}

}
