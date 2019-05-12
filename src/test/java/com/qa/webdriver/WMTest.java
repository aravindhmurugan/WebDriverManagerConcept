package com.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().version("75").setup();
		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.iedriver().setup();
		
		driver = new FirefoxDriver();
//		driver = new InternetExplorerDriver();
//		driver = new ChromeDriver();
//		driver = new OperaDriver();
//		driver = new EdgeDriver();
	}

	@Test
	public void freecrmtitletest(){
		driver.get("https://classic.freecrm.com");
		System.out.println(driver.getTitle()); 
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
