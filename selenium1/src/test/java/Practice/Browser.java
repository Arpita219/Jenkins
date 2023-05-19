package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Browser {

public static void main(String[] args) throws Throwable {
   
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.flipkart.com/");
		
		//to maximize the screen
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//to minimize the screen
		driver.manage().window().minimize();
		
		/*Thread.sleep(1000);*/
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		
		//to get title
		/*String data = driver.getTitle();
		System.out.println(data);
		
		//to get current url
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	//to get the source code of the page
	String source = driver.getPageSource();
	System.out.println(source);
	
	// to close current focusing window
	//driver.close();
	
	// to close all the windows
	driver.quit();*/
		
	}
	

	
}
