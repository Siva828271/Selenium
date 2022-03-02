package com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("m.sivaganesh175@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Siva@123");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		//Explicit wait
		/*WebDriverWait b = new WebDriverWait(driver, 20);
		b.until(ExpectedConditions.visibilityOf(login));*/
		Actions a = new Actions(driver);
		a.click(login).build().perform();
		

	}

}
