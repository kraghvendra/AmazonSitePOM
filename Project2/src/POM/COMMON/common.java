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

	   public static String[] readCSV(String fname) throws IOException{
	      
	      File f1=new File(fname);
	      FileReader fr= new FileReader(f1);
	      BufferedReader br= new BufferedReader(fr);
	      String line= br.readLine();
	      String [] data= line.split(",");
	      return data;
	      
	   }
	   
	}


