package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserProfile {
	public void UserProfile(WebDriver driver)
	{
	        POM.JobSearch.Button_Accoungt(driver).click();
	        POM.User_Profile.Button_UserProfile(driver).click();
	        POM.User_Profile.Txtbox_UserProfile_Education(driver).getText();
	        Select select = new Select(POM.User_Profile.Txtbox_UserProfile_JobLevel(driver));
	        WebElement option = select.getFirstSelectedOption();
	        String Joblevel = option.getText();
	        Select select_education = new Select(POM.User_Profile.Txtbox_UserProfile_Education(driver));
	        WebElement education = select_education.getFirstSelectedOption();
	        String education_default = education.getText();
	        System.out.printf(POM.User_Profile.Txtbox_UserProfile_Jobtitle(driver).getText());
	        
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
	    }
}
