package AdvEXample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.name("q")).sendKeys("bluetooth");
		 Thread.sleep(2000);
		 List<WebElement> allLinks = driver.findElements(By.tagName("li"));
		 
		 for(WebElement wb:allLinks)
		 {
			 System.out.println(wb.getText());
			 if(wb.getText().contains(" earphone"))
			 {
				 wb.click();
				 break;
			 }
		 }
	}

}
