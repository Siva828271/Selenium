package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
//single frame
		driver.switchTo().frame("singleframe");
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Start accepting and stop expecting");
		
		String word = textbox.getAttribute("value");
		System.out.println("The entered quote in the single frame is-" + word);
		
		driver.switchTo().defaultContent();

		WebElement button2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		button2.click();
//muliple frame
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);

		WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox1.sendKeys("Dont follow the way make it");
		
		String word2 = textbox1.getAttribute("value");
		System.out.println("The entered quote in the multiple frame is-" + word2);
		
		driver.switchTo().defaultContent();


	}

}
