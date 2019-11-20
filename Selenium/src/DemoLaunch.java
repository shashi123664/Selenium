import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		Set<String> wins=driver.getWindowHandles();
		Thread.sleep(2000);
        //wins.remove(parent);
		/*for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win).close();
		}*/
		ArrayList<String> lst=new ArrayList<>(wins);
		for(int i =lst.size()-1;i>=0;i--)
		{
			driver.switchTo().window(lst.get(i)).close(); 
		}
		
		
		
		
		 
		 
		//driver.close();
		
	}

}
