package Module;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import POM.Job_Alert_Banner;
public class Create_JA {
	public void Create_JA_Test(WebDriver driver)
	{
		   //Add new JA 2
	     Job_Alert_Banner.JA_addnew(driver).click();
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    Job_Alert_Banner.JA_keyword_1(driver).sendKeys("C++");
	    Job_Alert_Banner.JA_keyword_1(driver).sendKeys(Keys.ENTER);
	    Select location1 =  new Select(POM.Job_Alert_Banner.JA_location_DropDown(driver));
	    location1.selectByIndex(3);
	    Select salary1 = new Select(POM.Job_Alert_Banner.JA_Salary(driver));
	    salary1.selectByIndex(1);	     
	    Job_Alert_Banner.JA_save_1(driver).click();
	    //update JA
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    POM.Job_Alert_Banner.JA_update_2(driver).click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    Job_Alert_Banner.JA_keyword_1(driver).sendKeys("C++");
	    Job_Alert_Banner.JA_keyword_1(driver).sendKeys(Keys.ENTER);
	    location1.selectByIndex(2);
	    salary1.selectByIndex(2);	     
	    Job_Alert_Banner.JA_save_1(driver).click();
	     

	     //Add new JA 3
	     Job_Alert_Banner.JA_addnew(driver).click();
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     Job_Alert_Banner.JA_keyword_2(driver).sendKeys("Tiếng Việt");
	     Job_Alert_Banner.JA_keyword_2(driver).sendKeys(Keys.ENTER);
	     Select location2 =  new Select(POM.Job_Alert_Banner.JA_location_DropDown_1(driver));
		 location2.selectByIndex(3);
		 Select salary2 = new Select(POM.Job_Alert_Banner.JA_Salary_1(driver));
		 salary2.selectByIndex(1);
	     Job_Alert_Banner.JA_save_2(driver).click(); 
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     
	     // delete job alert	
	     Job_Alert_Banner.JA_delete(driver).click();
	   
	    System.out.println("Delete job alert successfully");
	 
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     Job_Alert_Banner.JA_delete_1(driver).click();

	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     Job_Alert_Banner.JA_delete_2(driver).click();
	     driver.navigate().refresh();
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
 