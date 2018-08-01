package Module;

import org.testng.annotations.Test;
import  Module.Global_Contanst;
import POM.HomePage;
import POM.JobSearch;
import POM.Job_Alert_Banner;
import POM.Register_Form;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

	public class Register_Testng extends Apply{
	public WebDriver     driver;
	Properties pro     = new Properties();
	InputStream input  = null;
	  @Test
	  	public void Register() {
		  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		  try {
				input = new FileInputStream("configuration");
				pro.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  	String email=Global_Contanst.Email();	
			HomePage.Button_Accoungt(driver).click();
			HomePage.Button_Register(driver).click();
			Register_Form.txtBox_Firstname(driver).sendKeys("Lợi");
			Register_Form.txtBox_Lastname(driver).sendKeys("Trần Quốc ");
			Register_Form.txtBox_Password(driver).sendKeys(pro.getProperty("password"));		


			String jobtitle ="Quality Control";
			Register_Form.txtBox_Email(driver).sendKeys(email);
			Register_Form.Textbox_Jobtitle(driver).sendKeys(jobtitle);
			Register_Form.Button_Register(driver).click();
			System.out.println("Register Successfully/n");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = driver.getCurrentUrl();
			if(url.equals("https://staging.topitworks.com/en/job"))
			{
				System.out.printf("redicrect correctly/n");
			}
			else
			{
				System.out.printf("redicrect incorrectly/n");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			HomePage.Web_Push(driver).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JobSearch.Button_Close_Inactive_Banner(driver).click();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Job_Alert_Banner.JA_banner(driver).click();		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Register_Form.Button_Edit(driver).click();
			
			if(Register_Form.Textbox_Jobtitle_JA(driver).getText().equals("Quality Control"))
			{
				System.out.println("Create JA correctly/n");
			}
			else
			{
				System.out.println("Create JA incorrectly/n");
			}
			Job_Alert_Banner.close(driver).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JobSearch.Button_Accoungt(driver).click();
			JobSearch.Button_Log_Out(driver).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Login_Testng Login = new Login_Testng();
			Login.Login(email,driver);
			
			
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  Apply_Register(driver,1,200);
			  
			  try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 UserProfile user= new UserProfile();
			 user.UserProfile(driver);
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
				
			 Check_Email check = new Check_Email();
			 check.normal_register(driver, email);
			
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
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.get(pro.getProperty("domain_home_page"));
			 //driver.manage().window().maximize();
			 //Sim.Open_Job_Seeker_List(pro.getProperty("register"));
		 
		 
		  }
	
		  @AfterMethod
		  public void afterMethod() {
			driver.quit();
		  }
		  	

	}
