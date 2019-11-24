package com.xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		 WebElement name1 = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		name1.sendKeys("shirt",Keys.ENTER);
		Thread.sleep(2000);
	  WebElement name2 = driver.findElement(By.xpath("//img[@title=\"Roadster Men Blue Regular Fit Printed Casual Shirt\"]"));
			  name2.click();
			 Set<String> wins=driver.getWindowHandles();
			 for(String n:wins)
			 {
				 driver.switchTo().window(n);
			 }
			 driver.findElement(By.xpath("//span[@class=\"myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\"]/parent::div")).click();
			 WebElement txt=driver.findElement(By.xpath("//span[contains(.,'Please select a size')]"));
			System.out.println( txt.getText());
    
}
}

