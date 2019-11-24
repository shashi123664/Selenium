package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleThirdElement1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	     driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> name = driver.findElements(By.xpath("//h3[@class=\"LC20lb\"]"));
		for(WebElement n:name)
		{
			System.out.println(n.getText());
			
		}
		for(int i=0;i<name.size();i++)
		{
			if(i==2)
			{
				name.get(i).click();
			}
		}
	}
}