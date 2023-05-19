package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileProperty {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new EdgeDriver();
		
		FileInputStream fis=new FileInputStream("./commondata.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url1");
		driver.get(URL);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
	}

}
