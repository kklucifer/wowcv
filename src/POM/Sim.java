package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sim {
	static WebElement element;
	public static WebElement Txt_username(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//input[@type='text'][@name='txtusername']"));
		return element;
		
	}
	public static WebElement Txt_password(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//input[@type='password'][@name='txtpassword']"));
		return element;
		
	}
	public static WebElement btn_login(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//input[@type='submit']"));
		return element;
		
	}
	public static WebElement btn_Job_Management(WebDriver driver)
	{

		element= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td"));
		return element;
	}
	
	public static WebElement btn_Job(WebDriver driver)
	{

		element= driver.findElement(By.cssSelector("#module_4 > tbody > tr:nth-child(4)"));
		return element;
	}
	
	public static WebElement btn_Job_Seeker(WebDriver driver)
	{

		element= driver.findElement(By.xpath("/descendant::td[@valign='middle'][position()=2]"));
		return element;
	}
	public static WebElement btn_Job_Seeker_List(WebDriver driver)
	{

		element= driver.findElement(By.xpath("//*[@id=\"module_2\"]/tbody/tr[2]/td[2]/a"));
		return element;
	}
	
	
	public static WebElement Txt_User_Name(WebDriver driver)
	{

		element= driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		return element;
	}
	public static WebElement Btn_Search(WebDriver driver)
	{

		element= driver.findElement(By.xpath("//input[@type='submit'][@name='search']"));
		return element;
	}
	
	public static WebElement Btn_Check_All(WebDriver driver)
	{

		element= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td[1]/a[1]"));
		return element;
	}
	
	public static WebElement Btn_Delete_All(WebDriver driver)
	{

		element= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table[5]/tbody/tr/td[1]/a[3]"));
		return element;
	}
		
	public static WebElement Btn_Delete_Submit(WebDriver driver)
	{

		element= driver.findElement(By.xpath("//input[@type='submit'][@name='delete']"));
		return element;
    }
	
}
