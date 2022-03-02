package com.web;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {

	public static void main(String[] args) throws IOException {
		// Property setting
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		// Browse launch
		WebDriver driver = new ChromeDriver();
		// get URL
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		// Maximize the window
		driver.manage().window().maximize();
		// Title of the web page
		String title = driver.getTitle();
		System.out.println("The title of the webpage:" + title);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("m.sivaganesh175@gmail.com");
		// password
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Siva@123");
		// login
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		// Category choosing
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		dress.click();
		// dress selection
		WebElement casual = driver.findElement(By.xpath("(//a[contains(@title,'You ')])[1]"));
		casual.click();
		// quick view
		WebElement Quickview = driver.findElement(By.xpath("(//img[contains(@class,'replace')])[2]"));
		Quickview.click();
		// finding number of frames
		int frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of frames in the web page is:" + frame);
		//switching to the frame
		WebElement outer = driver.findElement(By.xpath("//iframe[contains(@class,'fancybox')]"));
		driver.switchTo().frame(outer);
        //selecting the size
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'control ')]"));
		Select s = new Select(dropdown);
		s.selectByValue("3");
        //Adding it to the cart
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();
		//Switching out of frame
		driver.switchTo().defaultContent();
		// proceed to cart
		WebElement proceed = driver.findElement(By.xpath("//a[contains(@title,'Proceed ')]"));
		proceed.click();
		// Summary
		WebElement proceed1 = driver.findElement(By.xpath("(//a[contains(@title,'Proceed ')])[2]"));
		proceed1.click();
		// address
		WebElement proceed2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceed2.click();
		// Shipping
		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();

		WebElement proceed3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceed3.click();
		// payment
		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();
		// confirm order
		WebElement confirm = driver.findElement(By.xpath("(//button[contains(@class,'button ')])[1]"));
		confirm.click();
		// screenshot
		TakesScreenshot screen = (TakesScreenshot) driver;
		File capture = screen.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Screenshot\\Dressorder.png");
		FileUtils.copyFile(capture, loc);

	}

}
