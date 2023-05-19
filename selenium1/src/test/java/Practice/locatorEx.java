package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorEx {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		WebElement data = driver.findElement(By.name("field-keywords"));
		data.sendKeys("tommy hilfigher");
		data.submit();
		Thread.sleep(100);
		//driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.partialLinkText("Customer")).click();
	}

}
