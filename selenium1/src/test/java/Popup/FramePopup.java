package Popup;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopup {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
     WebDriver driver=new EdgeDriver();
 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable");
		
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));	
			
		act.dragAndDrop(drag, drop).perform();
	
	}

}
