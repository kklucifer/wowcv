
	package Module;

	import java.util.List;
	
    import java.net.HttpURLConnection;
    import java.net.MalformedURLException;

	import java.net.URL;

	import java.util.ArrayList;

	import java.util.HashSet;

	import java.util.Iterator;

	import java.util.NoSuchElementException;

	import java.util.Set;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.Keys;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebDriver.Navigation;

	import org.openqa.selenium.WebDriver.Options;

	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.firefox.FirefoxProfile;

	import org.openqa.selenium.support.ui.*;

	import com.google.common.base.Function;

	import com.google.common.base.Predicate;
	

	public class LinkBroken {

	  public static List findAllLinks(WebDriver driver)

	  {

		  List<WebElement> elementList1 = new ArrayList();
		  List<WebElement> Finalist = new ArrayList();

		  elementList1 = driver.findElements(By.tagName("a"));

		  elementList1.addAll(driver.findElements(By.tagName("img")));

		  

		  for (WebElement element : elementList1)

		  {

			  if(element.getAttribute("href") != null)

			  {

				  Finalist.add(element);

			  }		  

		  }	

		  return Finalist;

	  }

		public static String isLinkBroken(URL url) throws Exception

		{

			//url = new URL("http://yahoo.com");

			String response = "";

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			try

			{

			    connection.connect();

			     response = connection.getResponseMessage();	        

			    connection.disconnect();

			    return response;

			}

			catch(Exception exp)

			{

				return exp.getMessage();

			}  				

		}

		public static void main(String[] args) throws Exception {

			// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", Module.Global_Contanst.GoogleChrome());

				ChromeDriver ff = new ChromeDriver();

				ff.get("https://www.topitworks.com/vi/viec-lam");

				//ff.get("http://www.yahoo.com/");		
			    List<WebElement> allImages = new ArrayList();

			     allImages = findAllLinks(ff);    

			    System.out.println("Total number of elements found " + allImages.size());
			 

			    for( WebElement element : allImages){

			    	try

			    	{

				     System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

			    		//System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

			    	}

			    	catch(Exception exp)

			    	{

			    		System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());	    		

			    	}

			    }
			    ff.close();

		    }

}
	

