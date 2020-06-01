package POM.PAGES;
import org.openqa.selenium.*;


public class webpage {
	
	
	public static WebElement  searchbox, btn_search, item1  , btn_addtocart  ;
	public static String siteurl, item_name;
	public static String search_item= "Men's Gb 2354116_Olive Green_5 Boots";
	
	 //getter methods to get elements on the web page
	 public static WebElement getSearchbox(){
	     searchbox=POM.CONFIGURATION.driver.driver.findElement(By.id("twotabsearchtextbox"));
	     return searchbox ;
	      }

	 public static WebElement getBtn_search(){
		 btn_search=POM.CONFIGURATION.driver.driver.findElement(By.className("nav-input"));
	     return btn_search;
	 }
	 
	 public static WebElement getItem1(){
		 item1=POM.CONFIGURATION.driver.driver.findElement(By.partialLinkText("Men's Gb 2354116_Olive Green_5 Boots"));
	     return item1;
	 }
	
	 public static WebElement getBtn_addtocart(){
		 btn_addtocart=POM.CONFIGURATION.driver.driver.findElement(By.id("add-to-cart-button"));
	     return btn_addtocart;
	 }

}
