package com.xpath;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		Thread.sleep(2000);
		//WebElement dining = driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]/span"));
		//System.out.println(dining.getText());
		//Thread.sleep(2000);
	 //driver.findElement(By.id("search")).sendKeys(dining.getText(),Keys.ENTER);/*
	List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
	for(WebElement name:menu)
	{
		System.out.println(name.getText());
	}

	
   }
}
