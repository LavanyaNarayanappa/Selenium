package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
	
	
	public static void main(String args[]){
	try {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  
//        JavascriptExecutor js = (JavascriptExecutor)driver;  
//        js.executeScript("scrollBy(0, 5000)");   
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.id("fname")).sendKeys("hello");
		String text=driver.findElement(By.className("col-md-12")).getText();
		System.out.println(text);
		Select dropdown=new Select( driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Manual Testing");
		driver.findElement(By.cssSelector("input.Performance")).click();
		driver.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	}

}
