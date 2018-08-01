package Module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Job_Search {
			WebDriver driver;

		  @Test
		  public void Job_Search_Test() {
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
			  POM.JobSearch.Job_Title_(driver, 1).click();
			  try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  	Set<String> allWindowHandles = driver.getWindowHandles();
				String windown2 = (String) allWindowHandles.toArray()[1];	
				driver.switchTo().window(windown2);
				  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 String keyword  = "PHP";
			 String des1     = POM.Job_Detail.job_des_1(driver).getText().toLowerCase();
			 String des2     = POM.Job_Detail.job_des_2(driver).getText().toLowerCase();
			 String title    = POM.Job_Detail.job_title(driver).getText().toLowerCase();
			 String skill    = POM.Job_Detail.job_skill_1(driver).getText().toLowerCase();
			 String location = POM.Job_Detail.location(driver).getText().toLowerCase();
			 System.out.println(skill);
			 keyword.toLowerCase();
			 if(des1.contains("php")==true)
			 {
				 System.out.println("Job Description 1 has");
			 }else
			 {
				 System.out.println("Job description 1 does not have");
			 }
			 if(des2.contains("php")==true)
			 {
				 System.out.println("Job Description 2 has");
			 }else
			 {
				 System.out.println("Job description 2 does not have");
			 }
			 if(title.contains("php")==true)
			 {
				 System.out.println("Job title has");
			 }else
			 {
				 System.out.println("Job title does not have");
			 }
			 if(skill.contains("php")==true)
			 {
				 System.out.println("skill has");
			 }else
			 {
				 System.out.println("skill does not have");
			 }
			 if(location.contains("ho chi minh")==true)
			 {
				 System.out.println("location has");
			 }else
			 {
				 System.out.println("location does not have");
			 } 
			
		   }
		  
		  public void checkRecommendedJob(WebDriver driver )
		  {
			  
		  } 
		  
		  
		  
			 @BeforeMethod
			 public void beforeMethod() {
			  System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
				 driver = new ChromeDriver();
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 Properties pro = new Properties();
				 InputStream input = null;
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
				 driver.quit();
			  }
			
			}
