package AdvEXample;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	
	//KEYS EXAMPLE:
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.actitime.com/login.do ");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);*/

		
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.name("q")).sendKeys("TommyHilfiger",Keys.ENTER);
	}

}
