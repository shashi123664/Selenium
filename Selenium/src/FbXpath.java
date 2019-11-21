import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 WebElement emailOrPhone = driver.findElement(By.xpath("//label[@for=\"email\"]"));
		System.out.println( emailOrPhone.getText());
		 WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		 email.sendKeys(emailOrPhone.getText());
		 WebElement pass1 = driver.findElement(By.xpath("//label[@for=\"pass\"]"));
		 System.out.println(pass1.getText());
		 WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		 pass.sendKeys(pass1.getText());
		 
		 
		 

}
}