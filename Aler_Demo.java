package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aler_Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Demo\\New_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		WebElement simple = driver.findElement(By.xpath("//a[.='Alert with OK ']"));
		simple.click();

		WebElement okay = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		okay.click();
		
		driver.quit();

	}

}
