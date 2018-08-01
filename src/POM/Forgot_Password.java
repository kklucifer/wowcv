package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgot_Password {
	private static WebElement element = null;

	 public static WebElement Txt_email(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='email']"));

	    return element;
	    }
	 public static WebElement Btn_Submit(WebDriver driver){

		    element = driver.findElement(By.xpath("//button[@type='submit']"));

		    return element;
		    }

}
