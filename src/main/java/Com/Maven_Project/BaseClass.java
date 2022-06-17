package Com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Select input;
	
	
	//browser launch
	public static WebDriver browserLaunch(String browsername) {
	
		if (browsername.equalsIgnoreCase("chrome")) {                                //chrome launch
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe"); 
				
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
		else if (browsername.equalsIgnoreCase("ie")) {
	}
		else if (browsername.equalsIgnoreCase("firefox")) {
			
	}
		else if (browsername.equalsIgnoreCase("opera")) {
	}
		return driver;
		
		}
	    //get
	    
	    public static void urlLaunch(String url) {
		driver.get(url);
		}
	    
	    //close
	    
	    public static void closeBrowser() {	
	    driver.close();
		}
	    
	    //quit browser
	    
	    public static void quitBrowser() {
	    driver.quit();
	    
		}
	    //webelement clear
	    
	    public static void clear(WebElement element) {
          element.clear();
		}
	    
	    //send keys
	    public static void sendKeys(WebElement element,String input) {
        element.sendKeys(input);
		}
        
	    //click
	    public static void clickElement(WebElement element) {
	    element.click();
		}
	    
	    //screenshot (day2 )
	    public static void screenshot(String location) throws IOException {
        
	    	TakesScreenshot ts =(TakesScreenshot) driver;                                                             //narrowing type casting
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(location);
			FileUtils.copyFile(source, target);
		}
	    
	    //selectbyvalue
	    public static void selectValue(WebElement element,String byvalue) {
	    	
	        input  = new Select(element);                                                                            //syntax
	        input.selectByValue(byvalue);
	    }
	    //select by visibletext
	    public static void selectvisibletext(WebElement element,String visibletext) {
	    	
	    	input  = new Select(element); 
	    	input.selectByVisibleText(visibletext); 

		}
	    //select by index
	    public static void selectindex(WebElement element,int number) {
             
	    	input  = new Select(element); 
	    	input.selectByIndex(number);
		}
	    
	    
	    
	    
	    
	    
	    
	    
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

