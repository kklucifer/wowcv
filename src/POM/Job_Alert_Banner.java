package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Job_Alert_Banner {

	 private static WebElement element = null;
	 

	    public static WebElement close(WebDriver driver){
			 element = driver.findElement(By.xpath("//*[@id=\"jobAlert\"]/div/div/div[1]/button"));

			 return element;
		 }
		 public static WebElement JA_banner(WebDriver driver){
			 element = driver.findElement(By.xpath("//a[@class='create-job-alert-link']"));

			 return element;
		 }
			 
		 public static WebElement JA_banner_image(WebDriver driver){
			 element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/a"));

			 return element;
		 }
			 public static WebElement JA_keyword(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"s2id_autogen2\"]"));

				 return element;
			 }
			
			 public static WebElement New_JA_keyword(WebDriver driver){
				 element = driver.findElement(By.xpath("//input[@type='text'] [@class='select2-input select2-default']"));

				 return element;
			 }
			 public static WebElement JA_keyword_1(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"s2id_autogen4\"]"));
				
				 return element;
			 }
			 public static WebElement JA_keyword_2(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"s2id_autogen208\"]"));

				 return element;
			 }
			 
			
			 
			 public static WebElement JA_save(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div/div[4]/div/a[3]"));

				 return element;
			 }
			 
			 public static WebElement JA_save_1(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[2]/div[4]/div/a[3]"));

				 return element;
			 }
			 
			 public static WebElement JA_save_2(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[3]/div[4]/div/a[3]"));

				 return element;
			 }
			 
			
			 
			 public static WebElement JA_addnew(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlert\"]/div/div/div[2]/div[5]/button"));
				
				 return element;
			 }
			

			 public static WebElement JA_location_DropDown(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[2]/div[3]/select"));

				 return element;
			 }
			 public static WebElement JA_location_DropDown_1(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[3]/div[3]/select"));

				 return element;
			 }
			 
			 public static WebElement JA_location(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[2]/div[3]/select"));

				 return element;
			 }
			
			
			 public static WebElement JA_location_1(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[3]/div[3]/select"));

				 return element;
			 }
			 
			
			
			 
			 
			public static WebElement JA_Salary(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[2]/div[4]/select"));

				 return element;
			 }
			public static WebElement JA_Salary_1(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[3]/div[4]/select"));

				 return element;
			 }
			 
			
			 
			 
			 public static WebElement JA_update(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[1]"));//*[@id="jobAlertList"]/div[2]/div[2]/div[4]/div/a[1]

				 return element;
			 }
			 public static WebElement JA_update_2(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[2]/div[4]/div/a[1]"));

				 return element;
			 }
			
			 public static WebElement JA_delete(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[2]"));

				 return element;
			 }
			 
			 public static WebElement JA_delete_1(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div/div[4]/div/a[2]"));

				 return element;
			 }
			 
			
			 public static WebElement JA_delete_2(WebDriver driver){
				 element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div/div[4]/div/a[2]"));

				 return element;
			 }
			 
}
