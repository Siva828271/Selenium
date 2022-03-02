package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tnebnet.org/awp/login?locale=ta");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("userName"));	
		username.sendKeys("sivaganesh");
		
		WebElement pass = driver.findElement(By.id("password"));	
		pass.sendKeys("Siva@123");
		
		String attribute = username.getAttribute("name");	
		System.out.println(attribute);
		
		String attribute2 = username.getAttribute("value");
		System.out.println(attribute2);
		
		boolean displayed = pass.isDisplayed();
		System.out.println("The pass word is displayed or not-" + displayed);
		
		boolean enabled = pass.isEnabled();
		System.out.println("The password enabled or not-" + pass);
		
		boolean selected = username.isSelected();
		System.out.println("The user name selected or not-" + selected);
		
		pass.clear();
		WebElement text = driver.findElement(By.xpath("(//span[contains(@style,'font')])[19]"));
		String text2 = text.getText();
		System.out.println(text2);
	}
}