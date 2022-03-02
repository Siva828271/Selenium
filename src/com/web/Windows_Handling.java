package com.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiA24SPBhB0EiwAjBgkhsYUCEEw2WEY4iv9X8IFa7QltcF97PIC8q1Vr6A_WEiZXg94VX-i8RoCurIQAvD_BwE");
        driver.manage().window().maximize();
        //web element men
        WebElement men = driver.findElement(By.xpath("(//a[contains(@style,'border')])[1]"));
        Actions a = new Actions(driver);
        a.contextClick(men).build().perform();
        Robot rc = new Robot();
        rc.keyPress(KeyEvent.VK_DOWN);
        rc.keyRelease(KeyEvent.VK_DOWN);
        
        rc.keyPress(KeyEvent.VK_ENTER);
        rc.keyRelease(KeyEvent.VK_ENTER);
        //web element kids
        WebElement kids = driver.findElement(By.xpath("(//a[contains(@style,'border')])[3]"));
        a.contextClick(kids).build().perform();
        
        rc.keyPress(KeyEvent.VK_DOWN);
        rc.keyRelease(KeyEvent.VK_DOWN);
        
        rc.keyPress(KeyEvent.VK_ENTER);
        rc.keyRelease(KeyEvent.VK_ENTER);
        //Web element home&furniture
        WebElement home = driver.findElement(By.xpath("(//a[contains(@style,'border')])[4]"));
        a.contextClick(home).build().perform();
        
        rc.keyPress(KeyEvent.VK_DOWN);
        rc.keyRelease(KeyEvent.VK_DOWN);
        
        rc.keyPress(KeyEvent.VK_ENTER);
        rc.keyRelease(KeyEvent.VK_ENTER);
        //Get window handle
        Set<String> WH = driver.getWindowHandles();
        for (String string : WH) {
        	String title = driver.switchTo().window(string).getTitle();
        	System.out.println(title);
			
		}
        //To move the window to the required position
        String b ="Kids Clothing - Buy Kids Clothes, Dresses & Bottom wear Online in India";
        for (String string : WH) {
        	if(driver.switchTo().window(string).getTitle().equals(b)) {
        	break;
			
		}
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        }
		
		
	}
        	
			
        
			

}
