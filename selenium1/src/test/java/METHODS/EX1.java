package METHODS;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do ");
		driver.manage().window().maximize();
		
		//isDisplayed
		/* WebElement data = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		 if(data.isDisplayed())
		 {
			 System.out.println("logo is displayed");
				 
		 }
		 else
		 {
			 System.out.println("logo is not displayed");
		 }*/
		
		//isSelected
		/*WebElement data1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		data1.click();
		Thread.sleep(1000);
		
		
		if(data1.isSelected()) {
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}*/
		
		//isEnabled()
/*WebElement data = driver.findElement(By.id("username"));
		if(data.isEnabled())
		{
			data.sendKeys("admin")
		}
		else
		{
			System.out.println("not enabled");
		}*/
		
		//getAttribute
		/*WebElement data = driver.findElement(By.id("username"));
		String value = data.getAttribute("id");
System.out.println("Attribute value for id is:"+value);

 String value1 = data.getAttribute("type");
 System.out.println("Attribute value for id is:"+value1);
 WebElement data1 = driver.findElement(By.id("loginButton"));
 String value2 = data1.getAttribute("href");
 System.out.println("Attribute value for id is:"+value2);
 
 //getTagname
 WebElement data3 = driver.findElement(By.id("loginButton"));
			String tag = data3.getTagName();
			System.out.println(tag);
			
			WebElement data4 = driver.findElement(By.id("username"));
			String tag1 = data4.getTagName();
			System.out.println(tag1);*/
		
			
		//getCssValue
		
		/*driver.get("https://www.facebook.com/login/");
		WebElement font = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
		String data = font.getCssValue("font-size");
		System.out.println(data);
		
		String data1 = font.getCssValue("color");
		System.out.println(data1);
		
		//getLocation()
		WebElement value = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		
Point Loc = value.getLocation();
System.out.println(Loc);
System.out.println(Loc.getX());
System.out.println(Loc.getY());

Dimension loc1 = value.getSize();
System.out.println(loc1);
System.out.println(loc1.getHeight());
System.out.println(loc1.getWidth());

//getRect()
WebElement rect = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
Rectangle deta = rect.getRect();
System.out.println(deta.getHeight());
System.out.println(deta.getWidth());
System.out.println(deta.getX());
System.out.println(deta.getY());*/
		
		//getAriaRole
		
		/*WebElement get = driver.findElement(By.id("username"));
		System.out.println(get.getAriaRole());
		
		WebElement login = driver.findElement(By.id("loginButton"));
		System.out.println(login.getAriaRole());
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(checkbox.getAriaRole());
		
		WebElement password = driver.findElement(By.name("pwd"));
		System.out.println(password.getAriaRole());*/

	}

}
