package com.web;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Runner_Classadactin  {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\Driver98\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//user name
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("sivaganesh175");
	//password
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("adactin");
	//login
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	//location
	WebElement loc = driver.findElement(By.id("location"));
	Select a = new Select(loc);
	a.selectByVisibleText("Sydney");
	//hotel
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select a1 = new Select(hotel);
	a1.selectByVisibleText("Hotel Sunshine");
	//room type
   WebElement roomtype = driver.findElement(By.xpath("(//select[contains(@class,'search')])[3]"));
   Select a2 = new Select(roomtype);
   a2.selectByVisibleText("Super Deluxe");
	//room no
   WebElement roomno = driver.findElement(By.xpath("(//select[contains(@class,'search')])[4]"));
   Select a3 = new Select(roomno);
   a3.selectByVisibleText("3 - Three");
   //check in
   WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
   checkin.sendKeys("03/02/2022");
   //check out
   WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
   checkout.sendKeys("04/02/2022");
	//adult
	WebElement adult = driver.findElement(By.xpath("(//select[contains(@class,'search')])[5]"));
	Select a4 = new Select(adult);
	a4.selectByVisibleText("3 - Three");
	//children
	WebElement children = driver.findElement(By.xpath("(//select[contains(@class,'search')])[6]"));
	Select a5 = new Select(children);
	a5.selectByVisibleText("4 - Four");
	//submit
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	//radio
	WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
	radio.click();
	//continue
	WebElement continueclick = driver.findElement(By.id("continue"));
	Actions a6 = new Actions(driver);
	a6.click(continueclick).build().perform();
	//first name
	WebElement frstname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	frstname.sendKeys("Hari");
	//second name
	WebElement secname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	secname.sendKeys("krishnan");
   //address
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("No-12,annai satya nagar tamaram chennai");
	//card number
	WebElement cardnum = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	cardnum.sendKeys("5346457874536987");
	//card type
	WebElement cardtype = driver.findElement(By.xpath("(//select[contains(@class,'select')])[1]"));
	Select a7 = new Select(cardtype);
	a7.selectByVisibleText("VISA");
	//Expiry month
	WebElement expmon= driver.findElement(By.xpath("(//select[contains(@class,'select')])[2]"));
	Select a8 = new Select(expmon);
	a8.selectByIndex(6);
    //Expiry year
	WebElement expyear= driver.findElement(By.xpath("(//select[contains(@class,'select')])[3]"));
	Select a9 = new Select(expyear);
	a9.selectByVisibleText("2022");
	//cvv
	WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
	cvv.sendKeys("000");
	//book
	WebElement book = driver.findElement(By.xpath("//input[@value='Book Now']"));
	a6.click(book).build().perform();
	//itinerary
	WebElement itinerary = driver.findElement(By.xpath("//input[@value='My Itinerary']"));
	a6.click(itinerary).build().perform();
	//Screen shot
	TakesScreenshot sc = (TakesScreenshot) driver;
	File source = sc.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Siva\\eclipse-workspace\\Maven_Project1\\ScreenShots\\adactin.png");
	FileUtils.copyFile(source, dest);
}
}
