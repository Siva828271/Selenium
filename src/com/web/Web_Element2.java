package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("siva");
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("ganesh");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("yadav790482827");
		
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("sivaji");
		
		WebElement confirm = driver.findElement(By.name("ConfirmPasswd"));
		confirm.sendKeys("sivaji");
		
		WebElement check = driver.findElement(By.id("i3"));
		check.sendKeys("sivaji");
		
		boolean selected = check.isSelected();
		System.out.println("selected or not" + selected);
		Thread.sleep(3000);
		
		WebElement next = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
