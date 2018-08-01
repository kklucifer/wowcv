package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yopmail {

	public static WebElement element =null; 
	public static WebElement txt_email(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='login'] "));
		return element;
	}
	public static WebElement btn_login(WebDriver driver)
	{ 
		element= driver.findElement(By.xpath("//input[@type=\"submit\"] "));
		return element;
	}
}

