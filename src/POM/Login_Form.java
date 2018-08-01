package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Form {
    private static WebElement element = null;
    
 public static WebElement txtBox_Password(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='password'][@class='form-control']"));

	 return element;

	    }
	 
 public static WebElement txtBox_Email(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='email'][@class='form-control']"));

	 return element;

	  }
 
 public static WebElement Button_Login(WebDriver driver){

	 	element = driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-primary btn-block']"));

	 return element;	

    }

// Facebook 
 public static WebElement Button_Login_FB(WebDriver driver){

	 	element = driver.findElement(By.xpath("//a[@class='social-button fb-button']"));

	 return element;	

 }
 
 public static WebElement txtBox_Email_FB(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='text'][@name='email']"));

	 return element;

	  }
 
 public static WebElement txtBox_Password_fb(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='password'][@name='pass']"));

	 return element;

	    }

 public static WebElement Button_Login_FB_native(WebDriver driver){

	 	element = driver.findElement(By.xpath("//button[@type='submit']"));

	 return element;	

 }
 
 // Google	
 public static WebElement Button_Login_GG(WebDriver driver){

	 	element = driver.findElement(By.xpath("//a[@class='social-button gmail-button']"));

	 return element;	

}

public static WebElement txtBox_Email_GG(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='email'][@aria-label='Email or phone']"));

	 return element;

	  }


public static WebElement Button_Next_GG(WebDriver driver){

    element = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));

 return element;

  }


public static WebElement txtBox_Password_GG(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));

	 return element;

	    }

public static WebElement Button_Login_GG_native(WebDriver driver){

	 	element = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span"));

	 return element;	

}

//GitHub 
public static WebElement Button_Login_GH(WebDriver driver){

	 	element = driver.findElement(By.xpath("//a[@class='social-button github-button']"));

	 return element;	

}

public static WebElement txtBox_Email_GH(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='text'][@class='form-control input-block']"));

	 return element;

	  }

public static WebElement txtBox_Password_GH(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='password']"));

	 return element;

	    }

public static WebElement Button_Login_GH_native(WebDriver driver){

	 	element = driver.findElement(By.xpath("//input[@type='submit'][@class='btn btn-primary btn-block']"));

	 return element;	

}

}
