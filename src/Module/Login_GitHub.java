package Module;

import org.testng.annotations.Test;

import POM.Login_Form;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login_GitHub {
	Properties pro = new Properties();
	 InputStream input = null;
	public WebDriver driver;
	
	  @Test
	  public void Login_GitHub_Test() {
		  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		  try {
				input = new FileInputStream("configuration");
				pro.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Action click login in home page.
			POM.HomePage.Button_Accoungt(driver).click();
			POM.HomePage.Button_Login(driver).click();
			
			Login_Form.Button_Login_GH(driver).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			Set<String> allWindowHandles = driver.getWindowHandles();
			String windown1 = (String) allWindowHandles.toArray()[0];
			String windown2 = (String) allWindowHandles.toArray()[1];	
			
			driver.switchTo().window(windown2);
		    Login_Form.txtBox_Email_GH(driver).sendKeys(pro.getProperty("github_account_login"));
		    Login_Form.txtBox_Password_GH(driver).sendKeys("loitran114");
		    Login_Form.Button_Login_GH_native(driver).click();
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.switchTo().window(windown1).close();
			driver.switchTo().window(windown2);
		    
			Apply apply = new Apply();
			apply.Apply_login(driver, 1, 200);
		  
	  }
  @AfterMethod
  public void afterMethod() {
	driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  Properties pro = new Properties();
		 InputStream input = null;
		try {
			input = new FileInputStream("configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get(pro.getProperty("domain_home_page"));
		 //driver.manage().window().maximize();
  }

}
