package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelector {

	public static void main(String[] args) {
     
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do ");
		driver.manage().window().maximize();
		
		//cssSelector using id() [Attribute='AttributeValue']
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		
		//htmltag[Attributename='AttributeValue']
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		//cssSelector using class()  [Attribute='AttributeValue']
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		
		//driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		
		//by using id=#
		 //driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		 
		 //by using class=.
		// driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
	}

}
