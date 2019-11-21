import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Actitime {
	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title=driver.getTitle();
		System.out.println(title);
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("admin");
		  Thread.sleep(2000);
		 WebElement pass = driver.findElement(By.name("pwd"));
		 Thread.sleep(2000);
		 pass.sendKeys("manager",Keys.ENTER);
		 Thread.sleep(2000);
		 String title2=driver.getTitle();
		 System.out.println(title2);
		 if(title == title2)
		 {
			 System.out.println("login unsuccessfull");
		 }
		 
		 else
			 System.out.println("login successfull");
		  
		  
		  
	}

}
