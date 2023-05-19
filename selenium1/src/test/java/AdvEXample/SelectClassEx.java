package AdvEXample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/ ");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
        
		 
		 //select by index
		WebElement daylist = driver.findElement(By.id("day"));
        Select sel=new Select(daylist);
		sel.selectByIndex(20);
		
		//select by value
		WebElement monthlist = driver.findElement(By.id("month"));
		Select sel1=new Select(monthlist);
	    sel1.selectByValue("9");
	    
	    //select by visibletext
	    WebElement yearlist = driver.findElement(By.id("year"));
	    Select sel2=new Select(yearlist);
	    sel2.selectByVisibleText("2021");
	}
	

}
