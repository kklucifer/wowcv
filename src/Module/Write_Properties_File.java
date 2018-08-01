package Module;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Properties_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 write_user_name();

	}
	public static void write_user_name()
	{
		Properties prop= new Properties();
		try
		{
			prop.setProperty("username","loitq115@gmail.com");
			prop.setProperty("username_profile","loitq155@gmail.com");
			prop.setProperty("password","Loitran114@");
			prop.setProperty("register","loitq115@gmail.com");
			prop.setProperty("domain_home_page","https://staging.topitworks.com/en");
			prop.setProperty("gmail", "https://mail.google.com/");
			prop.setProperty("yopmail", "http://www.yopmail.com/en/");
			prop.setProperty("gmail_account","loitq147@gmail.com");
			prop.setProperty("facebook_account","loitq117@gmail.com");
			prop.setProperty("github_account_login","loitq168@gmail.com");
			prop.setProperty("github_account","loitq134@gmail.com");
			prop.setProperty("gmail_account_login","loitq162@gmail.com");
			prop.setProperty("facebook_account_login","loitq117@gmail.com");
			prop.setProperty("password_social","loitran114");
			prop.setProperty("domain_sim","https://staging-sims.vietnamworks.com/login.php");
			prop.setProperty("domain_forgot_page","https://staging.topitworks.com/en/forgot");
			prop.setProperty("file1","/Users/loitq/Downloads/test1.doc");
			prop.setProperty("file2","/Users/loitq/Downloads/Selenium-Desktop.docx");
			prop.setProperty("file2","/Users/loitq/Downloads/Selenium-Desktop.docx");
			prop.setProperty("email_anonymous","loitq133@gmail.com");
			prop.setProperty("email_anonymous_jobdetail","loitq134@gmail.com");
			prop.store(new FileOutputStream("configuration"), null);	
		}
		catch (IOException xe)
		{
			xe.printStackTrace();
		}
	}
	

}
