package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JA_After_register {
	 private static WebElement element = null;


	 public static WebElement JA_Keyword(WebDriver driver){
		 element = driver.findElement(By.xpath("//ul[@class='keyword_newuser']/li[position()=4]/span"));

		 return element;
	 }
		 
	
	 
	 public static WebElement JA_Keyword_1(WebDriver driver){
		 element = driver.findElement(By.xpath("//ul[@class='keyword_newuser']/li[position()=3]/span"));

		 return element;
	 }
	 
	 public static WebElement JA_Keyword_2(WebDriver driver){
		 element = driver.findElement(By.xpath("//ul[@class='keyword_newuser']/li[position()=2]/span"));

		 return element;
	 }
	 
	
	 public static WebElement JA_Keyword_3(WebDriver driver){
		 element = driver.findElement(By.xpath("//*[@id=\"jobAlertNewUser\"]/div/div/div[2]/div[1]/div/ul/li[12]/span"));

		 return element;
	 }
	 public static WebElement JA_Location(WebDriver driver){
		 element = driver.findElement(By.xpath("//ul[@class='location_newuser']/li[position()=2]/span"));

		 return element;
	 }
	 
	 public static WebElement JA_Save(WebDriver driver){
		 element = driver.findElement(By.xpath("//*[@id=\"jobAlertNewUser\"]/div/div/div[2]/div[3]/div/a"));

		 return element;
	 }
	 
	 
	 
	 public static WebElement JA_ErrorMessage_Alert(WebDriver driver){
		 element = driver.findElement(By.xpath("/html/body/div[6]/h2"));

		 return element;
	 }
	 
	
	 
	 public static WebElement JA_ErrorMessage_Alert_Keyword(WebDriver driver){
		 element = driver.findElement(By.xpath("/html/body/div[6]/h2"));

		 return element;
	 }
	 
	 
	 public static WebElement JA_Close_Alert(WebDriver driver){
		 element = driver.findElement(By.xpath("//*[@id=\"jobAlertNewUser\"]/div/div/div[1]/button"));
		 
		 return element;
	 }
	 public static WebElement JA_Close_Alert_1(WebDriver driver){
		 element = driver.findElement(By.xpath("//*[@id=\"jobAlertNewUser\"]/div/div/div[1]/button/img"));
		 
		 return element;
	 }
}
