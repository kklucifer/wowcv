package Module;

import org.testng.annotations.Test;


import POM.Login_Form;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;


public class Login_Testng {
	public WebDriver driver;
		String username;
		String password;
  @Test
  public void Login() {
	//Action click login in home page.
	  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		POM.HomePage.Button_Accoungt(driver).click();
		POM.HomePage.Button_Login(driver).click();
		
		
		// Action register in login form
		Login_Form.txtBox_Email(driver).sendKeys(username);
		Login_Form.txtBox_Password(driver).sendKeys(password);
		Login_Form.Button_Login(driver).click();
		

		System.out.println("Login Successfully");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		POM.HomePage.Web_Push(driver).click();
	  
	   Apply apply = new Apply();
	   apply.Apply_login(driver, 1, 200);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
	driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 Properties pro = new Properties();
	 InputStream input = null;
	try {
		input = new FileInputStream("configuration");
		pro.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	username = pro.getProperty("username_profile");
	password = pro.getProperty("password");
			
	 System.out.println(pro.getProperty("domain_home_page"));
	 driver.get(pro.getProperty("domain_home_page"));
	 //driver.manage().window().maximize();
	
  }

  @AfterMethod
  public void afterMethod() {
	 driver.close();
  }
  
  public void Login(WebDriver driver) {
	//Action click login in home page.
		POM.HomePage.Button_Accoungt(driver).click();
		POM.HomePage.Button_Login(driver).click();
		
		
		// Action register in login form
		Login_Form.txtBox_Email(driver).sendKeys("loitq168@gmail.com");
		Login_Form.txtBox_Password(driver).sendKeys("Loitran114@");
		Login_Form.Button_Login(driver).click();
		

		System.out.println("Login Successfully");
	
  }

  
  public void Login(String email, WebDriver driverlogin) {
	//Action click login in home page.
		POM.HomePage.Button_Accoungt(driverlogin).click();
		POM.HomePage.Button_Login(driverlogin).click();
		Properties pro = new Properties();
		FileInputStream input= null;
		  try {
				input = new FileInputStream("configuration");
				pro.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		// Action register in login form
		Login_Form.txtBox_Email(driverlogin).sendKeys(email);
		Login_Form.txtBox_Password(driverlogin).sendKeys(pro.getProperty("password"));
		Login_Form.Button_Login(driverlogin).click();

		System.out.println("Login Successfully");
		//Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
  }
  public void Login(String email,String pass, WebDriver driverlogin) {
	//Action click login in home page.
		POM.HomePage.Button_Accoungt(driverlogin).click();
		POM.HomePage.Button_Login(driverlogin).click();
		Properties pro = new Properties();
		FileInputStream input= null;
		  try {
				input = new FileInputStream("configuration");
				pro.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		// Action register in login form
		Login_Form.txtBox_Email(driverlogin).sendKeys(email);
		Login_Form.txtBox_Password(driverlogin).sendKeys(pass);
		Login_Form.Button_Login(driverlogin).click();

		System.out.println("Login Successfully");
		//Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  	
}
