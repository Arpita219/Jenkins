package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
		//WebDriver driver=new ChromeDriver();
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		
		driver.get("https://demo.actitime.com/login.do ");
		driver.manage().window().maximize();
		
		//Locator using id()
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//Locator using name()
        driver.findElement(By.name("pwd")).sendKeys("manager");
         //driver.findElement(By.id("loginButtonContainer")).click();
        //driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.className("initial")).click();
	}

}
