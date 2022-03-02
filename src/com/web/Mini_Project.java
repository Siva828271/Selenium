package com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//sign in
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		//email
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("m.sivaganesh175@gmail.com");
		//create an account
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		//To click the radio button
		WebElement radio = driver.findElement(By.id("id_gender1"));
		radio.click();
		//first name
		WebElement first = driver.findElement(By.id("customer_firstname"));
		first.sendKeys("Siva");
		//last name
		WebElement last = driver.findElement(By.id("customer_lastname"));
		last.sendKeys("Ganesh");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Siva@123");
		//Day
		WebElement day = driver.findElement(By.id("days"));
		Select a = new Select(day);
		a.selectByIndex(4);
		//month
		WebElement month = driver.findElement(By.id("months"));
		Select a1 = new Select(month);
		a1.selectByValue("11");
		//year
		WebElement year = driver.findElement(By.id("years"));
		Select a2 = new Select(year);
        a2.selectByVisibleText("1997  ");	
       //company name           
         WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Miami Deign ");
        //address
        WebElement address1 = driver.findElement(By.id("address1"));
        address1.sendKeys("928 SW 30th Ave, Miami, FL 33135");
         //city
        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Miami");
        //State
        WebElement state = driver.findElement(By.id("id_state"));
        Select a3 = new Select(state);
        a3.selectByVisibleText("Florida");
        //Postal code
        WebElement postalcode = driver.findElement(By.id("postcode"));
        postalcode.sendKeys("33101");
        //country
        WebElement country = driver.findElement(By.id("id_country"));
        Select a4 = new Select(country);
        a4.selectByIndex(1);
        //additional info
        WebElement addinfo = driver.findElement(By.id("other"));
        addinfo.sendKeys("Happy to visit Your website");
        //phone num
        WebElement phonenum = driver.findElement(By.id("phone_mobile"));
        phonenum.sendKeys("7904828271");
        //address ref
        WebElement addressref = driver.findElement(By.id("alias"));
        addressref.sendKeys("No-11 alwarthirunagar");
        //Final submission
        WebElement register = driver.findElement(By.id("submitAccount"));
        Actions a5 = new Actions(driver);
        a5.click(register).build().perform();
        
        
        
        
        
        
        




	}

}
