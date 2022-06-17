package Com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.pomclass.Login_Page;
import Com.pomclass.Page_One;
import Com.pomclass.Page_Three;
import Com.pomclass.Page_Two;
import Com.sdp.Page_Object_Manager;

public class Runner extends BaseClass{
	
	public static WebDriver driver = browserLaunch("chrome"); 
	
	//pom class one object
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	//public static Login_Page lp = new Login_Page(driver);
	//public static Page_One pageone = new Page_One(driver);
	//public static Page_Two pagetwo = new Page_Two(driver); 
	//public static Page_Three pagethree = new Page_Three(driver); 
	
	public static void main(String[] args) throws InterruptedException  {
		
		
		urlLaunch("https://adactinhotelapp.com/index.php");                             //url
		
		//login page                                                                             
		sendKeys(pom.getInstanceLoginPage().getUsername(), "dhanush5");                                        //username
		                                                                                       
        sendKeys(pom.getInstanceLoginPage().getPassword(), "dhanush5");                                        //find&password typing
                                                     
        clickElement(pom.getInstanceLoginPage().getLogin());                                                 //login button,login.click();
	 
        //page one
         
        
        selectValue(pom.getInstancePageOne().getLocation(), "Paris");                                               // location
                                                                                                                                                                                     
        selectvisibletext(pom.getInstancePageOne().getHotels(), "Hotel Sunshine");                                  //hotel name
                    
        selectindex(pom.getInstancePageOne().getRoom_type(), 4);                                                    //room type
        
	    selectindex(pom.getInstancePageOne().getRoom_nos(), 5);                                                     //number of rooms
	                       
	    clear(pom.getInstancePageOne().getDatepick_in());                                                           //fromdate.clear(); //fromdate in hotel
	    sendKeys(pom.getInstancePageOne().getDatepick_in(), "25/03/2022");                                         
	                                                 
	    clear(pom.getInstancePageOne().getDatepick_out());                                                          //todate.clear();
	    sendKeys(pom.getInstancePageOne().getDatepick_out(), "27/03/2022");                                         //todate
	    
	    selectValue(pom.getInstancePageOne().getAdult_room(), "4");                                                  //people in rooms
	                                                                                         
	    selectindex(pom.getInstancePageOne().getChild_room(), 4);                                                   //child in rooms
	                                                     
	    clickElement(pom.getInstancePageOne().getSubmit());                                                         //search option
	    
	    //page two 
	                                                                                                 //syntax                                                                        
        clickElement(pom.getInstancePageTwo().getRadiobutton_0());                                                   //radiobutton
                                                                       
        clickElement(pom.getInstancePageTwo().getCont());                                                            //continue button
        
        //page three
                                                                                                       //syntax                                                      
        sendKeys(pom.getInstancePageThree().getFirst_name(), "dhanush");                                               //first name
                                                                
        sendKeys(pom.getInstancePageThree().getLast_name(), "raj");                                                    //last name
          
        sendKeys(pom.getInstancePageThree().getAddress(), "chennai");                                                  //billing adress
        
        sendKeys(pom.getInstancePageThree().getCc_num(), "1234567898745632");                                          //credit card number
          
        selectValue(pom.getInstancePageThree().getCc_type(), "VISA");                                                  //cc.selectByValue("VISA"); 
        
        selectValue(pom.getInstancePageThree().getCc_exp_month(), "5");                                                //cc expire month                         
        
        selectValue(pom.getInstancePageThree().getCc_exp_year(), "2022");                                              //cc expire year
                                                               
        sendKeys(pom.getInstancePageThree().getCc_cvv(), "555");                                                       //cvv number
                                                                 
        clickElement(pom.getInstancePageThree().getBook_now());                                                        //booknow button
        
        Thread.sleep(10000);
        clickElement(pom.getInstancePageThree().getLogout());                                                          // final logout button
        
        Thread.sleep(10000);	
 	    closeBrowser();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
