package com.empty_brower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class new_brower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\demoexample\\driver\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.setBinary("F:\\software testing\\chrome-win64\\chrome.exe");	
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
