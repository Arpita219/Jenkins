package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AuthenticationPopup {
@Test
	public void m1() {
		WebDriver driver=new EdgeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//(https://username:password@URL);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
