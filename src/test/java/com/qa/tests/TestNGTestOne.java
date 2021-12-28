package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGTestOne {
	
	WebDriver driver;
	
	
  @Test
  public void f() {
	  
  	  System.setProperty("webdriver.chrome.driver","C:\Users\91858\OneDrive\Documents\chromedriver.exe");
   	 
  	//Setting the driver to chrome driver
  	  driver = new ChromeDriver();
  	  String url = "https://www.google.com";
  	  driver.get(url);
  	  //Capturing the title and validating if expected is equal to actual
  	  String expectedTitle = "Google";
  	  String actualTitle = driver.getTitle();
  	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting the browser session");
  }

  @AfterMethod
  public void afterMethod() {
 	  System.out.println("Closing the browser session");
  	  driver.quit();
  }

}
