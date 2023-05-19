package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandlings {

	public static void main(String[] args) throws Throwable {
     WebDriver driver=new EdgeDriver();
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   //driver.get("https://demo.automationtesting.in");
   		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
   		driver.get("https://demo.automationtesting.in/Windows.html");
   		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
   		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   		Thread.sleep(4000);
   		Set<String> set = driver.getWindowHandles();
   		for (String string : set)
   		{
   			driver.switchTo().window(string);
   			String title = driver.getTitle(); 
   			System.out.println(title);
   			if(title.contains("Selenium"))
   			{
   				break;
   			}
   		}
   		
   		driver.findElement(By.linkText("Watch the Videos")).click();
   		Thread.sleep(4000);
   		
   		Set<String> set2 = driver.getWindowHandles();
   		for (String string : set2)
   		{
   			driver.switchTo().window(string);
   			String title = driver.getTitle();
   			System.out.println(title);
   			if(title.contains("Frames"))
   			{
   				break;
   			}
   		}
   		Thread.sleep(4000);

	}

}
