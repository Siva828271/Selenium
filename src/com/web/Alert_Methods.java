package com.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alert.click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		alert2.click();
		Thread.sleep(3000);
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		
		WebElement alert3 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		alert3.click();
		Alert promptalert = driver.switchTo().alert();
		String text = promptalert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		promptalert.sendKeys("something new");
		promptalert.accept();

		
		

	}

}


