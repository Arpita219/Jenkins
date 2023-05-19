package Popup;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpLoadPop {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
//WebElement data = driver.findElement(By.xpath("//button[text()='Or select file to upload']"));
    WebElement data = driver.findElement(By.id("file-upload"));
    data.sendKeys("C:\\Users\\Arpita\\Downloads\\WCSM26 (1).txt");
    System.out.println("uploaded sucessfully");
	}

}
