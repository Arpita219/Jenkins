package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do ");
		driver.manage().window().maximize();
		
		
		//Xpath by Attribute-->//htmltag[@Attributename='Attributevalue']
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		//Xpath by contains-->//htmltag[contains(@Attributename,'Attributevalue')]
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("manager");
		
		//Xpath by VisibleText()--->//htmltag[text()='Attributevalue']
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(1000);
		
		//Xpath by contains VisibleText()-->//htmltag[contains(text(),'Attributevalue')]
		driver.findElement(By.xpath("//a[contains(text(),'View ')]")).click();
		
		
	}

}
