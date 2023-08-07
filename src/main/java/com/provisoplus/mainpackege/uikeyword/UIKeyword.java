package com.provisoplus.mainpackege.uikeyword;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class UIKeyword {
	public static RemoteWebDriver driver;
	public static FluentWait<WebDriver> wait;
	
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JARS\\drivers\\chromedriver_win32 (3) 114\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new  ChromeDriver(options);
			driver.manage().window().maximize();
			
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.withTimeout(Duration.ofSeconds(500));
		wait.ignoring(NoSuchElementException.class);
	}
	public static void lunchUrl(String url) {
		driver.get(url);

	}
		
}
	
	

