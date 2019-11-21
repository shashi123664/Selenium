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
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("spree_user_email"));
		email.sendKeys("udyandasgupta23@gmail.com");
		Thread.sleep(2000);
		WebElement google = driver.findElement(By.className("google-auth"));
		Thread.sleep(2000);
		google.click();
		

}
}
