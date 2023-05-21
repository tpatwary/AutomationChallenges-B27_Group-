package com.JavaCodingPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNullPointerExceptions {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='e'])[1]")).sendKeys("tanvirpatweary16@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testero1");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}
}
