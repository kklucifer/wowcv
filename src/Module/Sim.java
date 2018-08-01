package Module;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Open_Job_Seeker_List("loitq117@gmail.com");

	}
	static WebDriver driver;
	public static WebDriver Open_Sim()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Properties pro = new Properties();
		 InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
		 driver.get(pro.getProperty("domain_sim"));
		 driver.manage().window().maximize();
		 POM.Sim.Txt_username(driver).sendKeys("loitq");
		 POM.Sim.Txt_password(driver).sendKeys("123456789");
		 POM.Sim.btn_login(driver).submit();
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	public static void Open_Job_List()
	{
		driver = Open_Sim();
		 driver.switchTo().frame("leftframe");
		 POM.Sim.btn_Job_Management(driver).click();
		 POM.Sim.btn_Job(driver).click();
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame("maintitleframe");
	}
	public static void Open_Job_Seeker_List(String email)
	{
		
		driver = Open_Sim();
		 driver.switchTo().frame("leftframe");
		 POM.Sim.btn_Job_Seeker(driver).click();
		 POM.Sim.btn_Job_Seeker_List(driver).click();
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame("maintitleframe");
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 POM.Sim.Txt_User_Name(driver).sendKeys(email);
		 POM.Sim.Btn_Search(driver).submit();
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 POM.Sim.Btn_Check_All(driver).click();
		 POM.Sim.Btn_Delete_All(driver).click();
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 POM.Sim.Btn_Delete_Submit(driver).click();
		 driver.close();
	}

}
