package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class LoginPage {
	
	 WebDriver driver;
	 
	 @BeforeTest
	     public void setUp() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91858\\OneDrive\\Desktop\\chromedriver.exe");	 
	         driver = new ChromeDriver();	 
	     }
	 
	    public void login() {
	        String login_url = "https://opensource-demo.orangehrmlive.com/";
	        driver.get(login_url);     
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        System.out.println(driver.getTitle());
	    }
	    
	    @Test
	    public void dashboard() {
	        
	       driver.findElement(By.id("menu_dashboard_index")).click();
	        String textPresent = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();     
	        String textToBePresent = "DashBoard";
	        assertEquals(textPresent, textToBePresent);
	    }	    
	    
		   @AfterTest
		    public void tearDown() {
		            driver.quit();
		    }

}
