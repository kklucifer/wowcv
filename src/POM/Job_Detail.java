

package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Job_Detail {
	private static WebElement element = null;

	
	
	public static WebElement Button_Apply(WebDriver driver){

	    element = driver.findElement(By.xpath("//a[@class='btn btn-primary job-apply-btn can-apply-job']"));

	    return element;
		}
	
	public static WebElement Input_File(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@type='file']"));

	    return element;
		}
	    public static WebElement Button_Apply_resume(WebDriver driver){

		    element = driver.findElement(By.xpath(" //*[@id=\"applyJobModal\"]/div/div/div/form/div[5]/div/button"));

		    return element;
	    }
	  
	    public static WebElement Text_applied(WebDriver driver){

		    element = driver.findElement(By.xpath("//*[@id=\"applyJobModal\"]/div/div/div/div"));

		    return element;
	    }

	    public static WebElement job_title(WebDriver driver){

		    element = driver.findElement(By.xpath("//h3 [@class='job-name']"));

		    return element;
	    }
	    public static WebElement job_des_1(WebDriver driver){

		    element = driver.findElement(By.xpath("//div[@class='read-more-panel-ex']/div[@class='read-more-content mt1']"));

		    return element;
	    }
	    public static WebElement job_des_2(WebDriver driver){

		    element = driver.findElement(By.xpath("//div[@class='read-more-panel-ex mt2']/div[@class='read-more-content mt1']"));

		    return element;
	    }
	    public static WebElement job_skill_1(WebDriver driver){

		    element = driver.findElement(By.xpath("//div[@class='skill-tags mt1']"));

		    return element;
	    }

	    public static WebElement job_skill_2(WebDriver driver){

		    element = driver.findElement(By.xpath("//div[@class='read-more-panel-ex mt2']/div[@class='read-more-content mt1']"));

		    return element;
	    }
	    public static WebElement job_skill_3(WebDriver driver){

		    element = driver.findElement(By.xpath("//div[@class='read-more-panel-ex mt2']/div[@class='read-more-content mt1']"));

		    return element;
	    }

	    public static WebElement location(WebDriver driver){

		    element = driver.findElement(By.xpath("//p[@class='company-location hidden-xs']"));

		    return element;
	    }
	
	   public static WebElement Upload_New_Cv(WebDriver driver)
	   {
		   element = driver.findElement(By.xpath("//i[@class='fa fa-cloud-upload pull-left']"));
		   return element;
	   }
	   
	   

}
