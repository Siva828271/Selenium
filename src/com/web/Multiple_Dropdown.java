package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.leafground.com/pages/Dropdown.html");
    driver.manage().window().maximize();
    
    WebElement letter = driver.findElement(By.xpath("//h1[contains(text(),'Learn')]"));
    String text2 = letter.getText();
    System.out.println("Heading in the to is-"+text2);
    
    
    WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
    Select a = new Select(multiple);
    a.selectByIndex(1);
    a.selectByValue("4");
    a.selectByVisibleText("UFT/QTP");
    
    
    //get options 
    List<WebElement> options = a.getOptions();
    System.out.println("All the options in the list are:");
    for (WebElement alloptions : options) {
    	String text = alloptions.getText();
    	System.out.println(text);
	}
    //getall selected options
    List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
    System.out.println("Selected options are:");
    for (WebElement selectedoption : allSelectedOptions) {
    	String text = selectedoption.getText();
    	System.out.println(text);
	}
    //get first selected option
    WebElement firstSelectedOption = a.getFirstSelectedOption();
    String text = firstSelectedOption.getText();
    System.out.println("The first selected options is :"+text);
    
    a.deselectByValue("1");
    a.deselectByVisibleText("Loadrunner");
    a.deselectByIndex(3);
    
	}

}
