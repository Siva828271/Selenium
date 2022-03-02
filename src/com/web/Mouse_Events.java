package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		// object creation for calling the method inside the Actions class
		Actions a = new Actions(driver);
		// To double click
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(doubleclick).build().perform();

		// To right click
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(rightclick).build().perform();

		// to perform click operation
		WebElement click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		a.click(click).build().perform();

		// To move the element
		WebElement move = driver.findElement(By.xpath("(//div[@class='header-wrapper'])[5]"));
		a.moveToElement(move).build().perform();

		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		// drag and drop
		WebElement D1 = driver.findElement(By.xpath("//div[contains(@style,'position')]"));
		WebElement D2 = driver.findElement(By.xpath("(//div[contains(@class,'ui')])[2]"));
		a.dragAndDrop(D1, D2).build().perform();

	}

}
