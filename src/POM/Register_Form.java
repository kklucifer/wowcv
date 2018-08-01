package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register_Form {
	  private static WebElement element = null;

	  public static WebElement txtBox_Firstname(WebDriver driver){

	     element = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));

	     return element;

	     }

	  public static WebElement txtBox_Lastname(WebDriver driver){

	     element = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));

	  return element;

	     }
	  
	  
	 	 
	  public static WebElement txtBox_Password(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"password\"]"));

	 	 return element;

	 	    }
	 	 
	  public static WebElement txtBox_Email(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"email\"]"));

	 	 return element;

	 	    }
	  
	  
	 public static WebElement Button_Register(WebDriver driver){

	     element = driver.findElement(By.xpath("//*[@id=\"formReg\"]/div/div[3]/div[6]/div/button"));

	  return element;

	     } 

	 //Facebook 
	 public static WebElement Button_Login_FB(WebDriver driver){

	 	 	element = driver.findElement(By.xpath("//*[@id=\"formReg\"]/div/div[1]/div/div/div/div[1]/a"));

	 	 return element;	

	 }

	 public static WebElement txtBox_Email_FB(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"email\"]"));

	 	 return element;

	 	  }

	 public static WebElement txtBox_Password_fb(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"pass\"]"));

	 	 return element;

	 	    }

	 public static WebElement Button_Login_FB_native(WebDriver driver){

	 	 	element = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));

	 	 return element;	

	 }

	 // Google	
	 public static WebElement Button_Login_GG(WebDriver driver){

	 	 	element = driver.findElement(By.xpath("//*[@id=\"formReg\"]/div/div[1]/div/div/div/div[2]/a"));

	 	 return element;	

	 }

	 public static WebElement txtBox_Email_GG(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));

	 	 return element;

	 	  }


	 public static WebElement Button_Next_GG(WebDriver driver){

	  element = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));

	 return element;

	 }


	 public static WebElement txtBox_Password_GG(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

	 	 return element;

	 	    }

	 public static WebElement Button_Login_GG_native(WebDriver driver){

	 	 	element = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"));

	 	 return element;	

	 }

	 //GitHub 
	 public static WebElement Button_Login_GH(WebDriver driver){

	 	 	element = driver.findElement(By.xpath("//*[@id=\"formReg\"]/div/div[1]/div/div/div/div[3]/a"));

	 	 return element;	

	 }

	 public static WebElement txtBox_Email_GH(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"login_field\"]"));

	 	 return element;

	 	  }

	 public static WebElement txtBox_Password_GH(WebDriver driver){

	 	    element = driver.findElement(By.xpath("//*[@id=\"password\"]"));

	 	 return element;

	 	    }

	 public static WebElement Button_Login_GH_native(WebDriver driver){

	 	 	element = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]"));

	 	 return element;	

	 }

	 public static WebElement Textbox_Jobtitle(WebDriver driver){

	  	element = driver.findElement(By.xpath("//*[@id=\"jobTitle\"]"));

	  return element;	

	 }
	 
	
	 //validate the JA after register
	
	 public static WebElement Button_Edit(WebDriver driver){

		  	element = driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[1]"));

		  return element;	
		
		 }

	 public static WebElement Textbox_Jobtitle_JA(WebDriver driver){

	  	element = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/ul/li[1]/div"));

	  return element;	
	
	 }
	 public static WebElement Textbox_Salary_JA(WebDriver driver){

		  	element = driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/ul/li[1]/div"));

		  return element;	

		 }
	 

}
