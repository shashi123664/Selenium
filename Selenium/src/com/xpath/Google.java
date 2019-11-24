package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"hdtb-msb-vis\"]")).click();;
		driver.findElement(By.xpath("//img[@id=\"rT8rqQKh8jt3DM:\"]")).click();
}
}
