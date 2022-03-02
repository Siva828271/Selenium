package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		//All data to be displayed
		System.out.println("All data in a static table:");
		System.out.println(" ");
		List<WebElement> all = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement alldata : all) {
			String text = alldata.getText();
			System.out.println(text);
			
		}
		System.out.println(" ");
		//Row data to be displayed
		System.out.println("Single row data in a static table:");
		System.out.println(" ");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement rowdata : row) {
			String text = rowdata.getText();
			System.out.println(text);
			
		}
		System.out.println(" ");
		//column data to be displayed
		System.out.println("Column data in a static table:");
		System.out.println(" ");
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for (WebElement columndata : column) {
			String text = columndata.getText();
			System.out.println(text);
		}
		System.out.println(" ");
		//Particular data to be displayed
		System.out.println("Particular data in a static table:");
		System.out.println(" ");
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[4]/td[6]"));
			String text = particular.getText();
			System.out.println(text);
			System.out.println(" ");
		//Header
		System.out.println("Header data in a static table:");
		System.out.println(" ");
		List<WebElement> head = driver.findElements(By.tagName("th"));	
		for (WebElement header : head) {
			String text2 = header.getText();
			System.out.println(text2);
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
