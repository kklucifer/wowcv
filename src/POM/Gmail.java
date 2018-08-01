package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail {
	static WebElement element= null;
	public static WebElement bt_inbox_email_1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@role='tabpanel'][1]/div[2]/div[1]/table/tbody/tr[1]"));
		return element;
	}
	public static WebElement bt_inbox_email_2(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@role='tabpanel'][1]/div[2]/div[1]/table/tbody/tr[2]"));
		return element;
	}
	
	public static WebElement btn_detele(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[7]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]"));
		return element;
		
	}
}
