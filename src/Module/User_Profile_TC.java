package Module;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class User_Profile_TC {
	 Properties pro     = new Properties();
	 InputStream input  = null;
	 WebDriver          driver;
	 String file        = null;
  @Test (priority =0)
  public void User_Profile_Test() {
	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  try {
			input = new FileInputStream("configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  POM.HomePage.Web_Push(driver).click();
	  try {
		Thread.sleep(500);
	  	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  	}
	  POM.JobSearch.Button_Accoungt(driver).click();
	  POM.User_Profile.Button_UserProfile_JobSearch(driver).click();
	  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).clear();
	  POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).sendKeys("Quality Control");
	  POM.User_Profile.Txtbox_UserProfile_YearofExperience(driver).clear();
	  POM.User_Profile.Txtbox_UserProfile_YearofExperience(driver).sendKeys("3");
	  POM.User_Profile.Checkbox_UserProfile_MakeSearch(driver).click();
	  Select select = new Select(POM.User_Profile.Txtbox_UserProfile_JobLevel(driver));
	
	  try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  select.selectByIndex(4);
      WebElement option = select.getFirstSelectedOption();
      String Joblevel = option.getText();
      Select select_education = new Select(POM.User_Profile.Txtbox_UserProfile_Education(driver));
     
      try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      select_education.selectByIndex(4);
      WebElement education = select_education .getFirstSelectedOption();
      String education_default = education.getText();
      System.out.printf(POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).getText());
      POM.User_Profile.Checkbox_UserProfile_MakeSearch(driver).click();
      POM.User_Profile.Upload_Cv(driver).sendKeys(pro.getProperty("file1"));
      file= "test1.doc";
      POM.User_Profile.Button_UserProfile_Page_Submit(driver).click();
     
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      if(POM.User_Profile.Pop_Up(driver).isDisplayed())
    	  {
    	  	System.out.println("Success");
    	  };
	  driver.navigate().refresh();
	  try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   if(POM.User_Profile.Checkbox_UserProfile_MakeSearch(driver).isSelected() == true)
       {
           System.out.println("Make search comfirm");
       }
       else
       {
           System.out.println("Make search fail");
       }
       
       if(Joblevel.equals("Director and above"))
       {
           System.out.println("Job level comfirm");
       }
       else
       {
           System.out.println("Job level fail");
       }
       
       if(education_default.equals("Bachelors"))
       {
           System.out.println("Education comfirm");
       }
       else
       {
           System.out.println("Education fail");
       }
       
       
       if(POM.User_Profile.Txtbox_UserProfile_YearofExperience(driver).getAttribute("value").equals("3"))
       {
           System.out.println(" year of experience comfirm");
       }
       else
       {
           System.out.println("year of experience fail");
       }
       
       if(POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).getAttribute("value").equals("Quality Control"))
       {
           System.out.println("Jobtitle comfirm");
       }
       else
       {
           System.out.println("Jobtitle fail");
       }
       if(POM.User_Profile.Cv_Name(driver).getText().equals(file))
       {
           System.out.println("file upload comfirm");
       }
       else
       {
           System.out.println("file upload  fail");
       }
       System.out.println("Create user profile success");
       
       Update_User_Profile(driver);
      
  }

  public void Update_User_Profile(WebDriver driver)
  {
	  POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).clear();
	  POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).sendKeys("Quality Assurance");
	  POM.User_Profile.Txtbox_UserProfile_YearofExperience(driver).clear();
	  POM.User_Profile.Txtbox_UserProfile_YearofExperience(driver).sendKeys("4");
	  Select select = new Select(POM.User_Profile.Txtbox_UserProfile_JobLevel(driver));
	
	  try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  select.selectByIndex(3);
      WebElement option = select.getFirstSelectedOption();
      String Joblevel = option.getText();
      Select select_education = new Select(POM.User_Profile.Txtbox_UserProfile_Education(driver));
     
      try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      select_education.selectByIndex(3);
      WebElement education = select_education .getFirstSelectedOption();
      String education_default = education.getText();
      System.out.printf(POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).getText());
      POM.User_Profile.Checkbox_UserProfile_MakeSearch(driver).click();
      POM.User_Profile.Upload_Cv(driver).sendKeys(pro.getProperty("file2"));
      file= "Selenium-Desktop.docx";
      POM.User_Profile.Checkbox_UserProfile_MakeSearch(driver).click();
      POM.User_Profile.Button_UserProfile_Page_Submit(driver).click();
      try {
		Thread.sleep(500);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  driver.navigate().refresh();
	  try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   if(POM.User_Profile.Checkbox_UserProfile_MakeSearch(driver).isSelected() != true)
       {
           System.out.println("Make unsearch comfirm");
       }
       else
       {
           System.out.println("Make unsearch fail");
       }
       
       if(Joblevel.equals("Manager"))
       {
           System.out.println("Job level comfirm");
       }
       else
       {
           System.out.println("Job level fail");
       }
       
       if(education_default.equals("College"))
       {
           System.out.println("Education comfirm");
       }
       else
       {
           System.out.println("Education fail");
       }
       
       
       if(POM.User_Profile.Txtbox_UserProfile_YearofExperience(driver).getAttribute("value").equals("4"))
       {
           System.out.println(" year of experience comfirm");
       }
       else
       {
           System.out.println("year of experience fail");
       }
       
       if(POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).getAttribute("value").equals("Quality Assurance"))
       {
           System.out.println("Jobtitle comfirm");
       }
       else
       {
           System.out.println("Jobtitle fail");
       }
       
       if(POM.User_Profile.Cv_Name(driver).getText().equals(file))
       {
           System.out.println("file upload comfirm");
       }
       else
       {
           System.out.println("file upload  fail");
       }
       System.out.println("Update user profile success");
  }
  
  
  @BeforeMethod
  public void beforeMethod()
  {
	  try {
			input = new FileInputStream("configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  
	  System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 driver.get(pro.getProperty("domain_home_page"));
	
	 //driver.manage().window().maximize();
	 Login_Testng login = new Login_Testng();
	 String email =pro.getProperty("username_profile");
	 login.Login(email, driver);
	  
  }
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }
}
