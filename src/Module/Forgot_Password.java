package Module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Forgot_Password {
	public WebDriver driver;
	Properties pro = new Properties();
	InputStream input = null;
	
  @Test
  public void Forgot_Password() {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MICROSECONDS);
	  try {
			input = new FileInputStream("configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  String email =pro.getProperty("username");
	  POM.Forgot_Password.Txt_email(driver).sendKeys(email);
	  POM.Forgot_Password.Btn_Submit(driver).submit();
	  Check_Email.gmail(email);
  }
  @BeforeMethod
  public void beforeMethod() {
	  try {
			input = new FileInputStream("configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  
	  System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get(pro.getProperty("domain_forgot_page"));
	 driver.manage().window().maximize();

  }

  @AfterMethod
  public void afterMethod() {
  }

}
