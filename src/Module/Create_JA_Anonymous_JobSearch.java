package Module;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Job_Alert_Banner;
import POM.Register_Form;

public class Create_JA_Anonymous_JobSearch {


		 	 WebDriver driver;
			 Properties pro    = new Properties();
			 InputStream input = null;
			  @Test
			  public void Create_JA_Anonymous_JobSearch_Test() {
				  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
				  try {
						input = new FileInputStream("configuration");
						pro.load(input);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
				  POM.HomePage.Txt_search(driver).sendKeys("PHP");
				  Select selector = new Select(POM.HomePage.Dropbox_location(driver));
				  selector.selectByIndex(1);
				  POM.HomePage.Button_search(driver).click();
				  try {
					Thread.sleep(500);
				  } catch (InterruptedException e) {
					// TODO Auto-generated catch block
				 	e.printStackTrace();
			      }
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  jse.executeScript("window.scrollBy(0,900)", "");
				  WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][@id='emailAN']")));
				  String email = pro.getProperty("email_anonymous");
				  System.out.println(email);
				  POM.JobSearch.Txt_JA_Anonymous(driver).sendKeys(email);
				  POM.JobSearch.Btn_JA_Anonymous(driver).click();
				  driver.close();
				  try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  Check_Email.JA_Anonymous(email);
				 }
				 @BeforeMethod
				 public void beforeMethod() {
				  System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
					 driver = new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
					try {
						input = new FileInputStream("configuration");
						pro.load(input);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
					 driver.get(pro.getProperty("domain_home_page"));
					 driver.manage().window().maximize();
				 }
			
				  @AfterMethod
				  public void afterMethod() {
					 //driver.quit();
				  }
				
				

	

}
