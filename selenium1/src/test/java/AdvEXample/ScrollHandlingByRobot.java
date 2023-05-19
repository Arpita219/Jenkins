package AdvEXample;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollHandlingByRobot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/* driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[text()='✕']")).click();*/
		
		driver.get("https://www.amazon.in/");
		 
		 Robot r=new Robot();
		
			/*r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);*/
		 
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 
			
			
			
			
			
	}

}
