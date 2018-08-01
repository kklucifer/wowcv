package Module;

import org.openqa.selenium.WebDriver;

import POM.JA_After_register;
import POM.Job_Alert_Banner;

public class Create_JA_Popup {
	public void Create_JA_Popup_Test(WebDriver driver)
{
//	JA_After_register.JA_Save(driver).click();
//	String En="You did not select any keyword?";
//	String keyword ="We recommend maximum 3 keywords to have a best-fit job list.";
	//String a= JA_After_register.JA_ErrorMessage_Alert(driver).getText();		
	
	
	
	//if (a.equals(En)== true )
	//{
	//JA_After_register.JA_Close_Alert(driver).click();
	//try {
	//	Thread.sleep(1000);
	//} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
	//	e1.printStackTrace();
	///}
	
	JA_After_register.JA_Keyword_1(driver).click();
	JA_After_register.JA_Keyword_2(driver).click();
	JA_After_register.JA_Keyword_3(driver).click();
//	String b= JA_After_register.JA_ErrorMessage_Alert_Keyword(driver).getText();
//	if (b.equals(keyword)==true)
//	{
//		JA_After_register.JA_Close_Alert(driver).click();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
	
	JA_After_register.JA_Location(driver).click();
	JA_After_register.JA_Save(driver).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Job_Alert_Banner.JA_banner(driver).click();
	System.out.println("Create Job alert after register Successfully");
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
