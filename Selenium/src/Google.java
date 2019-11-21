import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q")); 
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		WebElement search1 = driver.findElement(By.name("q"));
		search1.clear();
            search1.sendKeys("selenium",Keys.ENTER);
            driver.navigate().back();
	}
}
		