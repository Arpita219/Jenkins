package Popup;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) throws Throwable {
		// WebDriverManager.edgedriver().setup();
		// WebDriver driver=new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//li[@id=\"popup_menu_item_2\"]")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();

		driver.findElement(By.name("name")).sendKeys("shobharani");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();

		Alert alt = driver.switchTo().alert();

		String text = alt.getText();
		System.out.println(text);

		alt.accept();

	}

}
