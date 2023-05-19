package Popup;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	
	driver.findElement(By.xpath("//div[text()='June 2023']"
			+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='26']")).click();
	}

}
