package Module;

import java.util.Random;

public class Global_Contanst {
	public static String   chara(){
	String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 6) { // length of the random string.
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;
	}
    
	public static String  Email() {
		
	Random rand = new Random();
	String n = chara();
	
	String email = "loitq"+n+"@yopmail.com";
	return email;
	}
	public static String  Staging_Vi() {
		
	String Staging_Vi = "https://staging.topitworks.com";
	return Staging_Vi;
	}
	public static String  Production_VI() {
		
	String Production_VI = "https://topitworks.com";
	return Production_VI;
	}
	
	public static String  Staging_EN() {
		
	String Staging_EN = "https://staging.topitworks.com/en";
	return Staging_EN;
	}
	public static String  Production_EN() {
		
	String Production_EN = "https://topitworks.com/en";
	return Production_EN;
	}
	
	public static String GoogleChrome()
	{
	 String driver ="/Users/loitq/Downloads/chromedriver";
	 return driver;
	}
	public static String Safari()
	{
	 String driver ="";
	 return driver;
	}
	public static String FireFox()
	{
	 String driver ="";
	 return driver;
	}
}
