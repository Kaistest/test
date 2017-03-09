package com.Selenium.test.Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromeTest {

public WebDriver driver;

    public InvokeChromeTest()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\uid0655\\Desktop\\Selenium\\Driver&doc\\chromedriver.exe");
    	System.out.println("ok");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }
    
    @Test
	public void firefoxProgram() throws InterruptedException {

		
	}

}

