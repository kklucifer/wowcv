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

public class Register_Gmail extends Apply {
	static WebDriver    driver;
	Properties pro    = new Properties();
	InputStream input = null;
	@Test(priority =0)
	public void Register_Gmail_Test() {
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		try {
			input = new FileInputStream("configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(pro.getProperty("gmail_account"));
		String email= pro.getProperty("gmail_account");
			POM.HomePage.Button_Accoungt(driver).click();
			POM.HomePage.Button_Login(driver).click();
			
			Login_Form.Button_Login_GG(driver).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println(pro.getProperty("password_social"));
			String passs= pro.getProperty("password_social");
			Set<String> allWindowHandles = driver.getWindowHandles();
			String windown1 = (String) allWindowHandles.toArray()[0];
			String windown2 = (String) allWindowHandles.toArray()[1];	
			
			driver.switchTo().window(windown2);
			
			Login_Form.txtBox_Email_GG(driver).sendKeys(email);
			Login_Form.Button_Next_GG(driver).click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Login_Form.txtBox_Password_GG(driver).sendKeys(passs);
			Login_Form.Button_Login_GG_native(driver).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.switchTo().window(windown1).close();
			driver.switchTo().window(windown2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		if(POM.JobSearch.Button_Close_Inactive_Banner(driver).isDisplayed())
			{
				
				POM.JobSearch.Button_Close_Inactive_Banner(driver).click();
			}
		Module.Check_Email.gmail(pro.getProperty("gmail_account"));
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			POM.HomePage.Web_Push(driver).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			POM.JA_After_register.JA_Close_Alert(driver).click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//  
				e.printStackTrace();
			}
			Apply_Register(driver, 1, 100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	  
         }
	

	
   		 @AfterMethod
		 public void afterMethod() {
			driver.quit();
	      }
		  @BeforeMethod
		  public void beforeMethod() {
			  	System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
				 driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.get("https://staging.topitworks.com/en");
				// driver.manage().window().maximize();
					
					try {
						input = new FileInputStream("configuration");
						pro.load(input);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					
					System.out.println(pro.getProperty("gmail_account"));
					String email= pro.getProperty("gmail_account");
					Sim.Open_Job_Seeker_List(email);
		  }

}
