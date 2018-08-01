package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import POM.Thanks_Page;

public class Make_CV_Searchable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Make_Searchable(WebDriver driver)
	{
		POM.Thanks_Page.TxtBox_JobTitle(driver).sendKeys("Quality Control");
		POM.Thanks_Page.TxtBox_Experience(driver).sendKeys("3");
		Select joblevel = new Select( POM.Thanks_Page.Drop_JobLevel(driver));
		joblevel.selectByIndex(4);
		Select education = new Select (POM.Thanks_Page.Drop_Education(driver));
		education.selectByIndex(4);
		if(Thanks_Page.Btn_Submit(driver).isEnabled() == true)
		{
			System.out.println("Make searchable CV successfully");
		}
		else
		{
			System.out.println("Cannot make searchable CV");
		}
	}
	public static void Make_Searchable_Register(WebDriver driver)
	{
		POM.Thanks_Page.TxtBox_JobTitle(driver).sendKeys("Quality Control");
		POM.Thanks_Page.TxtBox_Experience(driver).sendKeys("3");
		Select joblevel = new Select( POM.Thanks_Page.Drop_JobLevel(driver));
		joblevel.selectByIndex(4);
		Select education = new Select (POM.Thanks_Page.Drop_Education(driver));
		education.selectByIndex(4);
		Thanks_Page.Btn_Submit(driver).click();
		
			System.out.println("Make searchable CV successfully");			
	}

}
