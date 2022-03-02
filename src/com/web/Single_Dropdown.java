package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://login.yahoo.com/account/create?.lang=en-IN&src=help&activity=ybar-signin&pspid=986299015&.done=https%3A%2F%2Fin.help.yahoo.com%2Fkb%2Faccount&specId=yidReg&done=https%3A%2F%2Fin.");
		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Kavin");

		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("ranjan");

		WebElement email = driver.findElement(By.name("yid"));
		email.sendKeys("kavin_ranjan828271");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("cutebabyboby");
		// Single dropdown
		WebElement num = driver.findElement(By.xpath("//select[@type='select']"));
		Select a = new Select(num);
		a.selectByIndex(2);

		WebElement phonenum = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
		phonenum.sendKeys("7897896546");
		Thread.sleep(2000);
		// single dropdown
		WebElement month = driver.findElement(By.name("mm"));
		Select a1 = new Select(month);
		a1.selectByVisibleText("December");
		boolean multiple = a1.isMultiple();
		System.out.println("multiple or not-" + multiple);
		// deselection deselect is not possible in single drop down
		// a.deselectByValue("3");//
		// a1.deselectByIndex(11);//
		// a.deselectAll();// not possible in single drop down

		// get options posssible in single drop down
		List<WebElement> options = a1.getOptions();
		System.out.println("The options in the single drop down list are");
		for (WebElement numlist : options) {
			String text = numlist.getText();
			System.out.println(text);
		}
		// get all selected options It displays the selected value (ie one option)
		List<WebElement> allSelectedOptions = a1.getAllSelectedOptions();
		System.out.println(" selected option is ");
		for (WebElement allelements : allSelectedOptions) {
			String text = allelements.getText();
			System.out.println(text);
		}
		WebElement firstSelectedOption = a1.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("The first selected option is :"+text);

		WebElement day = driver.findElement(By.name("dd"));
		day.sendKeys("12");

		WebElement year = driver.findElement(By.name("yyyy"));
		year.sendKeys("2019");

		WebElement gender = driver.findElement(By.name("freeformGender"));
		gender.sendKeys("Male");
		Thread.sleep(2000);
		WebElement next = driver.findElement(By.xpath("//button[@type='submit']"));
		next.click();

	}

}
