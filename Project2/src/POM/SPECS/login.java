package POM.SPECS;
import java.io.IOException;
import java.io.*;
import org.openqa.selenium.*;
import java.util.logging.*;
import java.util.*;
import java.io.File;
import org.apache.commons.io.FilenameUtils;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.*;

public class login {

	public static void login1() throws IOException, InterruptedException {
		POM.COMMON.common.openBrowser();
		
		  POM.CONFIGURATION.driver.driver.get(POM.CONFIGURATION.Configuration.siteurl);
		  
		  POM.PAGES.webpage.getSearchbox().sendKeys(POM.PAGES.webpage.search_item); 
		  POM.PAGES.webpage.getBtn_search().click();
		  
		  WebDriverWait wait1 = new WebDriverWait(POM.CONFIGURATION.driver.driver , 30);
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Men's Gb 2354116_Olive Green_5 Boots"))) ;
		  
		  File scrFile;
	        scrFile = ((TakesScreenshot)POM.CONFIGURATION.driver.driver).getScreenshotAs(OutputType.FILE); 
	        org.apache.commons.io.FileUtils.copyFile(scrFile, new File("/Users/test/Desktop/Dir2/ProductFound/ProductFound.png"));   
	        
	        
	        POM.PAGES.webpage.getItem1().click();
	        
	        Set<String> ids = POM.CONFIGURATION.driver.driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        POM.CONFIGURATION.driver.driver.switchTo().window(childId);
	        
	        
            POM.PAGES.webpage.getBtn_addtocart().click();
            
            WebDriverWait wait2 = new WebDriverWait(POM.CONFIGURATION.driver.driver , 30);
  		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div/div/div[2]/div/div/div/div/div/h1"))) ;
	        
	        File scrFile2;
	        scrFile2 = ((TakesScreenshot)POM.CONFIGURATION.driver.driver).getScreenshotAs(OutputType.FILE); 
	        org.apache.commons.io.FileUtils.copyFile(scrFile2, new File("/Users/test/Desktop/Dir2/AddedToCart/cart.png")); 
	        
	        
		
	}
	
	
}
