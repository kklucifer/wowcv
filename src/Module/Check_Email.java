package Module;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import POM.Login_Form;
import POM.Register_Form;

  public class Check_Email {
	public static WebDriver driver =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JA_Anonymous("loitq133@gmail.com");
	}
	public static void gmail(String email)
	{
		
		System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Properties pro = new Properties();
		 InputStream input = null;
		try {
			input = new FileInputStream("Configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(pro.getProperty("gmail"));
		 driver.get(pro.getProperty("gmail"));
		 driver.manage().window().maximize();
		 
		 System.out.println(pro.getProperty("gmail"));
		 driver.get(pro.getProperty("gmail"));
		 driver.manage().window().maximize();
		 Login_Form.txtBox_Email_GG(driver).sendKeys(email);
		 Login_Form.Button_Next_GG(driver).click();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Login_Form.txtBox_Password_GG(driver).sendKeys("loitran114");
		 Login_Form.Button_Login_GG_native(driver).click();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tabpanel'][1]/div[2]/div[1]/table/tbody/tr[1]")));
		 POM.Gmail.bt_inbox_email_1(driver).click();
		 String email1 = driver.findElement(By.xpath("//table[@role='presentation'][1]/tr[1]/td[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[1]")).getText();
		 System.out.println(email1);
		 if(email1.contains("Welcome to topITworks") == true)
		 {
			 System.out.println("Success");
		 }
		 else {
			  System.out.println("Failed");
		 } 
		 try {
			Thread.sleep(1000);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 driver.findElement(By.xpath("//table/tbody/tr/td/table[2]/tbody/tr[4]/td/table/tbody/tr/td/p/a")).click();
		 driver.close();;
	}
	public static void JA_Anonymous(String email)
	{
		
		System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 Properties pro = new Properties();
		 InputStream input = null;
		try {
			input = new FileInputStream("Configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(pro.getProperty("gmail"));
		 driver.get(pro.getProperty("gmail"));
		 driver.manage().window().maximize();
		 Login_Form.txtBox_Email_GG(driver).sendKeys(email);
		 Login_Form.Button_Next_GG(driver).click();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Login_Form.txtBox_Password_GG(driver).sendKeys("loitran114");
		 Login_Form.Button_Login_GG_native(driver).click();
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='tabpanel'][1]/div[2]/div[1]/table/tbody/tr[1]")));
		 POM.Gmail.bt_inbox_email_1(driver).click();	
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Confirm')]")));
		 driver.findElement(By.xpath("//a[contains(text(), 'Confirm')]")).click();
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 String windown1 = (String) allWindowHandles.toArray()[0];
		 String windown2 = (String) allWindowHandles.toArray()[1];	
		 driver.switchTo().window(windown1);
		 POM.Gmail.btn_detele(driver).click();
		 driver.switchTo().window(windown2);
		 WebDriverWait wait1= new WebDriverWait(driver,10);
		 wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='create-job-alert-link']")));
		POM.Job_Alert_Banner.JA_banner(driver).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 POM.Login_Form.txtBox_Email(driver).sendKeys(email);
		 POM.Login_Form.txtBox_Password(driver).sendKeys("Loitran114@");
		 POM.Login_Form.Button_Login(driver).submit();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
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
		POM.Job_Alert_Banner.JA_banner(driver).click();
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Register_Form.Button_Edit(driver).click();
		 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[3]/select")));
		String location=select.getFirstSelectedOption().getText();
		if(location=="Ho Chi Minh")
		{
			System.out.println("Create JA correctly");
		}
		else
		{
			System.out.println("Create JA incorrectly");
		}
		
		if(driver.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/ul/li[1]/div")).getCssValue("value") =="PHP")
		{
			System.out.println("Create JA correctly]");
		}
		else
		{
			System.out.println("Create JA incorrectly");
		}
		driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[3]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[2]")).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElements(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[2]")).size()!=0)
		{
			driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[2]")).click();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(driver.findElements(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[2]")).size()!=0)
		{
			driver.findElement(By.xpath("//*[@id=\"jobAlertList\"]/div[2]/div[1]/div[4]/div/a[2]")).click();
		}
	}
	
	
	
	
	public static void normal_register(WebDriver driver, String email)
	{
		System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 Properties pro = new Properties();
		 InputStream input = null;
		try {
			input = new FileInputStream("Configuration");
			pro.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(pro.getProperty("yopmail"));
		POM.yopmail.txt_email(driver).sendKeys("email");
		POM.yopmail.btn_login(driver).click();
		driver.close();
		  
	 
		 
	}
}
