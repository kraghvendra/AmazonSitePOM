package POM.COMMON;
import java.io.*;
import java.util.*;
import org.openqa.selenium.chrome.*;



public class common {
	
	public static void openBrowser(){
		
	      if(POM.CONFIGURATION.Configuration.browsername.equals("Chrome")){
	         POM.CONFIGURATION.driver.driver=new ChromeDriver();
	         
	      }
	   }

	   
	   
	}


