		package POM;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		
		public class HomePage {
		    private static WebElement element = null;
		
		 public static WebElement Button_Accoungt(WebDriver driver){
		
		    element = driver.findElement(By.xpath("//span[@class='fa-stack fa-lg m-t-n-xs']"));
		
		    return element;
		    }
		 
		
		 public static WebElement Button_Register(WebDriver driver){
		
		    element = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul[2]/li[2]/ul/li[2]/a"));
		
		 return element;
		 }
		 
		 public static WebElement Button_Login(WebDriver driver){
		
			    element = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul[2]/li[2]/ul/li[1]/a"));
		
			 return element;
		
		    }
		 
		 public static WebElement Button_search(WebDriver driver){
		
			    element = driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-primary btn_find_jobs']"));
		
			 return element;
		
		 }
		
		
		 public static WebElement Dropbox_location(WebDriver driver){
		
			    element = driver.findElement(By.xpath("//select[@id='getfromselect']"));
		
			 return element;
		
		}
		 
		 public static WebElement Txt_search(WebDriver driver){
		
			    element = driver.findElement(By.xpath("//input[@type='text'][@name='job_title']"));
		
			 return element;
		
		}
		
		 public static WebElement Web_Push(WebDriver driver){
		
			    element = driver.findElement(By.xpath("//button[@id='onesignal-popover-cancel-button']"));
		
			 return element;
		
		}
		
		}
