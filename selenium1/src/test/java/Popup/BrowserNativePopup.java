package Popup;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
ChromeOptions option=new ChromeOptions();
option.addArguments("incognito");
WebDriver driver=new ChromeDriver(option);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.yatra.com");
		
		
/*EdgeOptions option=new EdgeOptions();
option.addArguments("InPrivate");
WebDriver driver=new EdgeDriver(option);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.yatra.com");*/
	}

}
