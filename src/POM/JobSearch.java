package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobSearch {

	private static WebElement element = null;


	public static WebElement Button_Close_Inactive_Banner(WebDriver driver){

	    element = driver.findElement(By.xpath("//a[@class='close-require-active']"));

	    return element;

	    }
	public static WebElement Button_Accoungt(WebDriver driver){

	    element = driver.findElement(By.xpath("//span[@class='fa-stack fa-lg m-t-n-xs']"));

	    return element;

	    }
	public static WebElement Button_Log_Out(WebDriver driver){

	    element = driver.findElement(By.xpath("//a[@href='https://staging.topitworks.com/en/logout']"));

	    return element;

	    }

	 public static WebElement Button_Register(WebDriver driver){

	    element = driver.findElement(By.xpath("//i[@class='fa fa-fw fa-lg fa-sign-out']"));

	 return element;
	 }
	 
	 public static WebElement Button_Login(WebDriver driver){

		    element = driver.findElement(By.xpath("//i[@class='fa fa-fw fa-lg fa-sign-in']"));
		 return element;
	 }
		
	 public static WebElement Job_Title_(WebDriver driver, int n){
		 String job_link = "//*[@id=\"hits\"]/div[" + n + "]/div[2]/div/div/div/div[1]/h4/a";
		    element = driver.findElement(By.xpath(job_link));

		 return element;
	 }
	
	//*[@id="pagination"]/ul/li[3]/a
	 public static WebElement Paging(WebDriver driver, int n){
		 String job_link = "//*[@id=\"pagination\"]/ul/li["+n+"]/a";
		    element = driver.findElement(By.xpath(job_link));

		 return element;
	 }
	
	 public static WebElement Txt_JA_Anonymous(WebDriver driver){

		    element = driver.findElement(By.xpath("//input[@type='text'][@id='emailAN']"));
		 return element;
	 }
	
	 public static WebElement Btn_JA_Anonymous(WebDriver driver){

		    element = driver.findElement(By.xpath("//button[@id='emailANSubmit'][@type='submit']"));
		 return element;
	 }
}
