package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User_Profile {
	static WebElement element = null;
	public static WebElement Button_UserProfile(WebDriver driver){

	    element = driver.findElement(By.xpath("//a[@href='https://staging.topitworks.com/en/my-profile']"));

	    return element;
	    }
	
	public static WebElement Button_UserProfile_JobSearch(WebDriver driver){

	    element = driver.findElement(By.xpath("//a/i[@class='fa fa-user-o'][position()=1]"));

	    return element;
	    }
	
	public static WebElement Txtbox_UserProfile_Jobtitle(WebDriver driver){

	    return element = driver.findElement(By.xpath("//input[@type='text'][@id='userJobTitle']"));
	}
	
	public static WebElement Txtbox_UserProfile_YearofExperience(WebDriver driver){

	    return element = driver.findElement(By.xpath("//input[@type='text'][@id='userYearOfExperience']"));
	}
	
	public static WebElement Txtbox_UserProfile_JobLevel(WebDriver driver){

	    return element = driver.findElement(By.xpath("//*[@id=\"job_level\"]"));
	}
	
	public static WebElement Txtbox_UserProfile_Education(WebDriver driver){

	    return element = driver.findElement(By.xpath("//*[@id=\"highest_education\"]"));
	}
	
	
	public static WebElement Txtbox_UserProfile_UploadCV(WebDriver driver){

	    return element = driver.findElement(By.xpath("//*[@id=\"profileResume\"]"));
	}
	//*[@id="checkbox1"]
	public static WebElement Checkbox_UserProfile_MakeSearch(WebDriver driver){

	    return element = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
	}
	
	public static WebElement Button_UserProfile_Submit(WebDriver driver){

	    return element = driver.findElement(By.xpath("//*[@id=\"yourProfile\"]/div/div/form/div[3]/button"));
	}
	public static WebElement Button_UserProfile_Page_Submit(WebDriver driver){

	    return element = driver.findElement(By.xpath("//*[@id=\"yourProfile\"]/div/div/form/div[3]/button"));
	}
	
	public static WebElement Cv_Name(WebDriver driver){

	    return element = driver.findElement(By.xpath("//span[@class='file-resume-label']"));
	}
	public static WebElement Upload_Cv(WebDriver driver){

	    return element = driver.findElement(By.xpath("//input[@type='file'][@name='profile-resume']"));
	}
	public static WebElement Pop_Up(WebDriver driver) {
	
		return element = driver.findElement(By.xpath("	//div[@class='swal-title']"));
	}
}
