package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Thanks_Page {

	static WebElement element = null;
	public static WebElement TxtBox_JobTitle(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//*[@id=\"userJobTitle\"]"));
		return element;
		
	}
	public static WebElement TxtBox_Experience(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//*[@id=\"userYearOfExperience\"]"));
		return element;
		
	}
	public static WebElement Drop_JobLevel(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//*[@id=\"userExperienceLevel\"]"));
		return element;
		
	}
	
	public static WebElement Drop_Education(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//*[@id=\"userHighestEducation\"]"));
		return element;
		
	}
	
	public static WebElement Btn_Submit(WebDriver driver)
	{
		element =  driver.findElement(By.xpath("//button[@class='btn btn-primary btn-make-cv-searchable']"));
		return element;
		
	}
}
