

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shashi shoumya");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("shashi123@");//pass.sendKeys("shashi123@",keys.ENTER);
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();

		
	}
}
