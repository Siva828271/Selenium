package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	static int totalcase,recovercase,activecase;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		//To get all header data
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		//To iterate all headers by their index
		for (int i = 0; i < alldata.size(); i++) {
			String text = alldata.get(i).getText();
			String headerdata = text.replace("\n", " ");
		//	System.out.println(headerdata);
		//To get a particular header by index
			if (headerdata.equalsIgnoreCase("Total Cases")) {
				totalcase =i;
				System.out.println("Index of Total cases is :"+totalcase);
				
			}
			else if (headerdata.equalsIgnoreCase("Total Recovered")){
			recovercase =i;
				System.out.println("Index of Totalrecovered:"+recovercase);
				
			}
			else if (headerdata.equalsIgnoreCase("Active cases")) {
			activecase=i;
				System.out.println("Index of Active cases:"+activecase);
				
			}
		}
		//To get the elements from all rows
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		//iterate all row elements
		for (int i = 0; i < allrows.size(); i++) {
			//To get the elements from all column
			List<WebElement> allelement = allrows.get(i).findElements(By.tagName("td"));
			//Iterate all columns
			for (int j = 0; j < allelement.size(); j++) {
				if (allelement.get(j).getText().equalsIgnoreCase("USA")) {
					System.out.println("Total cases   in USA:"+allelement.get(totalcase).getText());
					System.out.println("Total recovered in USA :"+allelement.get(recovercase).getText());
					System.out.println("Active cases in USA:"+allelement.get(activecase).getText());
					
				}
				
				}
				
			}
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

