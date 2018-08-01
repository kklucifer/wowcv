package Module;

import org.testng.annotations.Test;

import POM.HomePage;


import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Job_Alert_TC {
	public WebDriver driver;
	
  @Test
  public void Job_Alert_TC_Test() {
	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  Login_Testng login = new Login_Testng();
	  login.Login("jobalerttesting@gmail.com","loitran114", driver);
	  // create JA new desgin
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	  HomePage.Web_Push(driver).click();
	  
	  Create_JA_Popup JA_Popup= new Create_JA_Popup();
	  JA_Popup.Create_JA_Popup_Test(driver);
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  Create_JA create_JA = new Create_JA();
	  create_JA.Create_JA_Test(driver);
  }
  @BeforeMethod
  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://staging.topitworks.com/en");
		// driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
