package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Classmethod {
	public static WebDriver driver;//declaring driver variable as static variable

	public static WebDriver webbroswerlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver98\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else if (name.equalsIgnoreCase("Internet Explorer")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	// close
	public static void close() {
		driver.close();
	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// navigate to
	public static void Navigateto(String nexturl) {
		driver.navigate().to(nexturl);
	}

	// navigate back
	public static void Navigateback() {
		driver.navigate().back();
	}

//navigate forward
	public static void Navigateforward() {
		driver.navigate().forward();
	}

	// get url
	public static void get(String url) {
		driver.get(url);
	}

	// alert accept
	public static void alertaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	//alert dismiss
	public static void alertdismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	//alert sendkeys
	public static void alertsendkeys(String input) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
	}
	//alert get text
	public static void alertgettext() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}

//Action single click
	public static void Actionsingleclick(WebElement singleclick) {
		Actions a = new Actions(driver);
		a.click(singleclick).build().perform();
		
	}
	//Action right click
	public static void Actionrightclick(WebElement rightclick) {
		Actions a = new Actions(driver);
		a.contextClick(rightclick).build().perform();
	}
	//Action double click
	public static void Actiondoubleclick(WebElement doubleclick) {
		Actions a = new Actions(driver);
		a.doubleClick(doubleclick).build().perform();
	}
	//Action move the element
	public static void Actionmovetheelement(WebElement moveelement) {
		Actions a = new Actions(driver);
		a.moveToElement(moveelement).build().perform();
	}
	//Action drag and drop
	public static void Actiondraganddrop(WebElement drag,WebElement drop) {
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
	}
	
    //frame by index
	public static void framebyindex(int ind) {
		driver.switchTo().frame(ind);
	}
	//frame by name
	public static void framebyname( String name) {
		driver.switchTo().frame(name);
	}
	//frame by web element
	public static void framebywebelement( WebElement element) {
		driver.switchTo().frame(element);
	}
	//switch to parent frame
	public static void frameswitchtoparent() {
		driver.switchTo().parentFrame();
	}
	//switch to default content
	public static void frameswitchtodefaultcontent( ) {
		driver.switchTo().defaultContent();
	}
//Robot
	public static void RobotMethods() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

//window handle
	public static void windowhandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println("current window handling:"+windowHandle);
	}

//window handles random title
	public static void Windowhandlesrandom() {
		  Set<String> WH = driver.getWindowHandles();
	        for (String string : WH) {
	        	String title = driver.switchTo().window(string).getTitle();
	        	System.out.println(title);
				
			}
	}

//Select by index
	public static void Dropdownselectbyindex(WebElement dropdownbox, int num) {
		Select s = new Select( dropdownbox);
		s.selectByIndex(num);
	}
	//Select by value
	public static void Dropdownselectbyvalue(WebElement  dropdownbox,  String value) {
		Select s = new Select( dropdownbox);
		s.selectByValue(value);
	}
	//Select by text
	public static void Dropdownselectbytext(WebElement  dropdownbox,  String text) {
		Select s = new Select( dropdownbox);
		s.selectByVisibleText(text);
	}
	//deselect all
	public static void Dropdowndeselectall(WebElement dropdownbox) {
		Select s = new Select( dropdownbox);
		s.deselectAll();
	}

//deselect by index
	public static void Dropdowndeselectbyindex(WebElement dropdownbox, int num) {
		Select s = new Select( dropdownbox);
		s.deselectByIndex(num);
	}
	//Deselect by value
	public static void Dropdowndeselectbyvalue(WebElement  dropdownbox,  String value) {
		Select s = new Select( dropdownbox);
		s.deselectByValue(value);
	}
	//deselect by text
	public static void Dropdowndeselect(WebElement dropdownbox, String text) {
		Select s = new Select( dropdownbox);
		s.deselectByVisibleText(text);
	}

//isEnabled
	public static void IsEnabled(WebElement button) {
		boolean enabled = button.isEnabled();
		System.out.println("Is Enabled:"+enabled);
	}

//isDisplayed
	public static void IsDidsplayed(WebElement text) {
		boolean displayed = text.isDisplayed();
		System.out.println("Is displayed:"+displayed);
	}

//is selected
	public static void IsSelected(WebElement checkbox) {
		boolean selected = checkbox.isSelected();
		System.out.println("Is selected:"+selected);
	}

//Get options
	public static void getoptions(WebElement multipledropdown) {
		Select s = new Select(multipledropdown);
		 List<WebElement> options = s.getOptions();
		    System.out.println("All the options in the list are:");
		    for (WebElement alloptions : options) {
		    	String text = alloptions.getText();
		    	System.out.println("All options in the list are :"+text);
			}
	}

//Get title
	public static void Gettitle() {
		String title = driver.getTitle();
		System.out.println("The title is :"+title);
	}

//GetcurrentUrl
	public static void GetcurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current URL is :"+currentUrl);
	}

//Get text
	public static void Gettext(WebElement element) {
		String text = element.getText();
		System.out.println("The text is :"+text);
	}

//Get attribute name
	public static void Getattributename(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println("The attribute name is:"+attribute);
		
	}
	//Get attribute value
	public static void Getattributevalue(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println("The attribute name is:"+attribute);
	}

//implicit wait
	public static void Implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

//Explicit wait
	public static void Explicitwait(int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

//take screenshot
	public static void Screenshot( String place) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source=tc.getScreenshotAs(OutputType.FILE);
		File dest = new File(place);
		FileUtils.copyFile(source, dest);
	}
//Scroll up
	public static void Scrollingup( WebElement elementup) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elementup);
	}
	//Scroll  down
		public static void Scrollingdown( WebElement elementdown) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", elementdown);
		}
//Sendkeys
	public static void sendkeys(WebElement element, String input) {

		element.sendKeys(input);
	}

//Get first selected options
	public static void GetfirstSelectedoption(WebElement element) {
		Select s = new Select(element);
		   WebElement firstSelectedOption = s.getFirstSelectedOption();
		   String text = firstSelectedOption.getText();
		   System.out.println("The first selected options is :"+text);
		    
	}

//Get all selected options
	public static void Getallselected(WebElement element) {
		Select s = new Select(element);
	    List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	    System.out.println("Selected options are:");
	    for (WebElement selectedoption : allSelectedOptions) {
	    	String text = selectedoption.getText();
	    	System.out.println("All selected options are:"+text);
		}
	}

//Ismultiple
	public static void Ismultiple(WebElement dropdownbox) {
		Select s = new Select(dropdownbox);
		boolean multiple = s.isMultiple();
		System.out.println("Is multiple:"+multiple);
	}

//click
	public static void click(WebElement singleclick) {
		singleclick.click();
	}

}
