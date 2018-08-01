
package Module;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.JobSearch;
import POM.Job_Detail;

public class Apply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Apply_login(WebDriver driver,int n, int m )
	{
		
		int count =0;
		int page =1;
		for(int i= n; i<=m;i++ )
			
		{
			if(count==0 && i % 8 ==0)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,900)", "");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JobSearch.Paging(driver,page).click();
			page++;
			}
			if(count>0)
			{
				System.out.println("apply successfully");
				break;
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			JobSearch.Job_Title_(driver, i).click();
		
		 
		Set<String> allWindowHandles = driver.getWindowHandles();
		String windown1 = (String) allWindowHandles.toArray()[0];
		String windown2 = (String) allWindowHandles.toArray()[1];	
		driver.switchTo().window(windown2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Job_Detail.Button_Apply(driver).click();	
		
		try {
			Thread.sleep(2500);
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
		if(driver.findElements(By.xpath("//*[@id=\"applyJobModal\"]/div/div/div/div")).size() ==0)
		{
		
		Job_Detail.Button_Apply_resume(driver).click();
		//Make_CV_Searchable.Make_Searchable(driver);
		count++;
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.close();
		driver.switchTo().window(windown1);		
		}	
	}
	
	public void Apply_Register(WebDriver driver,int n, int m ) 
	{
		
		int count =0;
		int page =3;
		for(int i= n; i<=m;i++ )
			
		{
			if(count==0 && i % 8 ==0)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,900)", "");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JobSearch.Paging(driver,page).click();
			page++;
			}
			if(count!=0)
			{
				System.out.println("apply successfully");
				break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			JobSearch.Job_Title_(driver, i).click();
		 
		Set<String> allWindowHandles = driver.getWindowHandles();
		String windown1 = (String) allWindowHandles.toArray()[0];
		String windown2 = (String) allWindowHandles.toArray()[1];	
		
		driver.switchTo().window(windown2);
	
		

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Job_Detail.Button_Apply(driver).click();
		
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(Job_Detail.Upload_New_Cv(driver).isEnabled() == true)
		{
			Job_Detail.Input_File(driver).sendKeys("/Users/loitq/Downloads/test1.doc");
			
			
//			Job_Detail.Upload_New_Cv(driver).click();
//			Robot robot;
//			try {
//				StringSelection path = new StringSelection("/Users/loitq/Downloads/test1.doc");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
//				//File file = new File("/Users/loitq/Downloads/selenium.doc");
//				//StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
//				robot = new Robot();
//			
//			
// 
//			// Cmd + Tab is needed since it launches a Java app and the browser looses focus
//// 
////			robot.keyPress(KeyEvent.VK_META);
//// 
////			robot.keyPress(KeyEvent.VK_TAB);
//// 
////			robot.keyRelease(KeyEvent.VK_META);
//// 
////			robot.keyRelease(KeyEvent.VK_TAB);
//// 
////			robot.delay(500);
//// 
////			//Open Goto window
//// 
////			robot.keyPress(KeyEvent.VK_META);
//// 
////			robot.keyPress(KeyEvent.VK_SHIFT);
//// 
////			robot.keyPress(KeyEvent.VK_G);
//// 
////			robot.keyRelease(KeyEvent.VK_META);
//// 
////			robot.keyRelease(KeyEvent.VK_SHIFT);
//// 
////			robot.keyRelease(KeyEvent.VK_G);
//// 
////			//Paste the clipboard value
//// 
////			robot.keyPress(KeyEvent.VK_META);
//// 
////			robot.keyPress(KeyEvent.VK_V);
//// 
////			robot.keyRelease(KeyEvent.VK_META);
//// 
////			robot.keyRelease(KeyEvent.VK_V);
//// 
////			//Press Enter key to close the Goto window and Upload window
//// 
////			robot.keyPress(KeyEvent.VK_ENTER);
//// 
////			robot.keyRelease(KeyEvent.VK_ENTER);
//// 
////			robot.delay(500);
////			robot.keyPress(KeyEvent.VK_ENTER);
////
////			robot.keyRelease(KeyEvent.VK_ENTER);
////			} catch (AWTException e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
//			}
			try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			Job_Detail.Button_Apply_resume(driver).click();
			try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			Make_CV_Searchable.Make_Searchable_Register(driver);
			count++;
		}
		
		driver.close();
		driver.switchTo().window(windown1);		
		}	
	
}

}
