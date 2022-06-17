package Com.Maven_Project;

public class BaseClass_Practice {
	
/*	public static WebDriver driver = browserLaunch("chrome");
	
	public static void main(String[] args) {
		
	
	
	
    urlLaunch("http://demo.automationtesting.in/Frames.html");
    
    driver.switchTo().frame("SingleFrame");                                               //switching to single frame
	
	
	WebElement fa = driver.findElement(By.xpath("//input[@type='text']"));               //finding the text box
	fa.sendKeys("dhanush frames program"); 
	
	Thread.sleep(5000);
	//driver.switchTo().defaultContent();                                                   //returning back to deafult page
	switchToDefaultcontent();
	
	
	WebElement fa1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));        //finding the second box
	fa1.click();
	
	
	WebElement outer = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])[1]"));     // iframe outer 
	Thread.sleep(5000);
	//driver.switchTo().frame(outer);
	switchFrame(outer);
	
	WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
	Thread.sleep(3000);
	//driver.switchTo().frame(inner);
	switchFrame(inner);
	
	WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));                           //finding text box
	                                                                                                    
	Thread.sleep(2000);                                                                                     //swtching to text
	textbox.sendKeys("paravala selnium easya than eruku");






	
*/	
//--------------------------------------------------------------------------------------------------------------------------
                                   // window handles

/*	       urlLaunch("https://www.amazon.in/");
   
   WebElement testleaf = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
   
   
   //move to element
   Thread.sleep(5000);
   //Actions action = new Actions(driver);           
   //action.moveToElement(testleaf).build().perform();
   moveToElement(testleaf);
   
   Thread.sleep(2000);
   WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	 
     //Actions ac =new Actions(driver);
     //ac.contextClick(bestseller).build().perform();
     contextClick(bestseller);
	 
     //Robot r = new Robot(); 
	 //r.keyPress(KeyEvent.VK_DOWN);
	 //r.keyRelease(KeyEvent.VK_DOWN);
	 
	 //r.keyPress(KeyEvent.VK_ENTER);
	 //r.keyRelease(KeyEvent.VK_ENTER);
     
     vkDown();
     vkEnter();
	 
	 WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	 
	 Thread.sleep(2000);
	 //ac.contextClick(mobiles).build().perform();
	 contextClick(mobiles);
	 
	 Thread.sleep(2000);
	 // r.keyPress(KeyEvent.VK_DOWN);
	 //r.keyRelease(KeyEvent.VK_DOWN);
	 vkDown();
	 
	 Thread.sleep(2000);
	 // r.keyPress(KeyEvent.VK_ENTER);
	 //r.keyRelease(KeyEvent.VK_ENTER);
	 
	 vkEnter();
	 
	 //new tab new releases
	 WebElement newrealese = driver.findElement(By.xpath("//a[text()='New Releases']"));
	 
	 //Thread.sleep(2000);
	 //ac.contextClick(newrealese).build().perform();
	 contextClick(newrealese);
	 
	 Thread.sleep(2000);
	 //r.keyPress(KeyEvent.VK_DOWN);
	 //r.keyRelease(KeyEvent.VK_DOWN);
	 vkDown();
	 
	 Thread.sleep(2000);
	 //r.keyPress(KeyEvent.VK_ENTER);
	 //r.keyRelease(KeyEvent.VK_ENTER);
	 vkEnter();
	 
	 //new tab computers
	 WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
	 
	 Thread.sleep(2000);
	 //ac.contextClick(computers).build().perform();
	 contextClick(computers);
	 
	 
	 Thread.sleep(2000);
	 //r.keyPress(KeyEvent.VK_DOWN);
	 //r.keyRelease(KeyEvent.VK_DOWN);
	 vkDown();
	 
	 Thread.sleep(2000);
	 // r.keyPress(KeyEvent.VK_ENTER);
	 //r.keyRelease(KeyEvent.VK_ENTER);
	 vkEnter();
	 
	 //to get window handles
	 Thread.sleep(2000);
	 //Set<String> windowHand = driver.getWindowHandles();
	 //iterating one by one and getting url and title using switchTo
	 //for (String all : windowHand) {
	//	System.out.println(all);
	//	String title = driver.switchTo().window(all).getTitle();
	//	System.out.println(title);
	//	String currentUrl = driver.switchTo().window(all).getCurrentUrl();
	//	System.out.println(currentUrl);
	//	System.out.println("================================================");
	 
	 getWindowHandles();
	 getMultipleWindowURl();
	
	 //to know about if case in (foreach)
	
	     
	    // String vada ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";  //tomatch this words
	 //for (String all1 : windowHand) {
		// if (driver.switchTo().window(all1).getTitle().equalsIgnoreCase(vada)) {
		//	 System.out.println(vada);
		//	 break;	
		//}	
	 
}	
*/

   
//-----------------------------------------------------------------------------------------------------------------------------------
                  //drag and drop

/*		     urlLaunch("http://leafground.com/pages/drop.html");

 WebElement soource = driver.findElement(By.id("draggable"));
 WebElement target = driver.findElement(By.id("droppable"));
 
 dragDrop(soource, target);
*/			   


//-------------------------------------------------------------------------------------------------------------------------------------		

/*		        urlLaunch("https://www.amazon.in/");
   
    Thread.sleep(5000);
	WebElement lastbutton = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));        //finding back to top button
	
	JavascriptExecutor js = (JavascriptExecutor) driver;                                                   //syntax for javascript executor
	
	js.executeScript("arguments[0].scrollIntoView();", lastbutton);                                        //scroll into view
	
	//scroll into view in javascript
	Thread.sleep(5000); 
	WebElement book = driver.findElement(By.xpath("//a[text()='Help']"));                                  //to move to another image
	//js.executeScript("arguments[0].scrollIntoView();", book);
	javascriptScrollIntoView(book);
	
	//scroll with xy axis in javascript
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,2000);");
	
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,5000);");
	
	//click function in javascript
	Thread.sleep(5000);
	//js.executeScript("arguments[0].click();" ,book);       
	javascriptClick(book);
*/				
   
   
   
//--------------------------------------------------------------------------------------------------------------------------------
                                                //screenshot

   //urlLaunch("http://demo.automationtesting.in/Alerts.html");
   
   //screenshot("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project1\\Screenshot\\dh.png");




//----------------------------------------------------------------------------------------------------------------------------		
                                          //alert
/*		        urlLaunch("http://demo.automationtesting.in/Alerts.html");

   //simple alert
	Thread.sleep(2000);
	WebElement s = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));                  //only selection
	s.click();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();                                                                //(accept)
	alertaccept();
	
	
	//confirm click
	Thread.sleep(2000);
	WebElement s2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));                      //first selection
	s2.click();
	Thread.sleep(2000);
	WebElement s3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));                //second selection
	s3.click(); 
	Thread.sleep(2000);
	//driver.switchTo().alert().dismiss();                                                              //(dismiss)
	alertDismiss();
	
	//prompt alert
	WebElement s4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));                      //first selection
	s4.click();	
	
	Thread.sleep(2000);
	WebElement s5 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));                   //second slection
	
	Thread.sleep(2000);
	s5.click();
	
	Thread.sleep(2000);
	//String text = driver.switchTo().alert().getText();                                                 //printing get text
	//System.out.println(text);
	alertGetText();
	
	
	Thread.sleep(2000);
	//driver.switchTo().alert().sendKeys("dhanush prompt alert box program");
	alertSendkeys("dh5");
	
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	alertaccept();

*/		

//----------------------------------------------------------------------------------------------------------------------------
                           //select

/*		urlLaunch("http://www.leafground.com/pages/Dropdown.html");

WebElement find = driver.findElement(By.xpath("(//select)[6]"));

Select s = new Select(find);

Thread.sleep(2000);
//boolean m = s.isMultiple();
//System.out.println(m);
isMultiple(find);

Thread.sleep(2000);

//s.selectByValue("3");                                               //selecting maultiple value in single select
selectValue(find, "3");
//s.selectByIndex(2);
selectindex(find, 3);
//s.selectByVisibleText("Loadrunner");
selectvisibletext(find, "Loadrunner");

Thread.sleep(2000);

//s.deselectByIndex(2);                                                //deslecting  (for each used)
deslectByIndex(find, 2);


System.out.println("=====get options  ===  all options========");

//List<WebElement> options = s.getOptions();                            //get text multiple (for each used)

//for (WebElement all : options) {
//	String text = all.getText();
//	System.out.println(text);
//	}

getOptions(find);


System.out.println("=====get all selected options=============");     //get all selected (for each used)

//List<WebElement> allselected = s.getAllSelectedOptions();

//for (WebElement all2 : allselected) {
//String text2 = all2.getText();
// System.out.println(text2);	
//}
getAllSelectedOption(find);

System.out.println("=====get first selected===================");       //first selected

//WebElement first = s.getFirstSelectedOption();
//String text3 = first.getText();
//System.out.println(text3);
getFirstSelectedOption(find);

//s.deselectAll();	
deSelectAll(find);

Thread.sleep(10000);                               
*/		


//-------------------------------------getattribute--------------------------------------------------------------		
/*		urlLaunch("https://www.instagram.com");

WebElement username = driver.findElement(By.name("username"));
String attribute = username.getAttribute("aria-label");
System.out.println(attribute);
*/

/*		urlLaunch("https://www.facebook.com/");

//gettext
WebElement login = driver.findElement(By.name("login"));
getText(login); 
*/		


//day1 ----------------------------------------------------------

/*		 urlLaunch("https://www.facebook.com/");

Thread.sleep(2000);
navigateTo("https://www.youtube.com/");

Thread.sleep(2000);
navigateBack();

//gettitle
//String title = driver.getTitle();
// System.out.println(title);

Thread.sleep(2000);
getTitle();


Thread.sleep(2000);
navigateForward();

//getcurrenturl
//String currentUrl = driver.getCurrentUrl();
//System.out.println(currentUrl); 

getCurrentUrl();

Thread.sleep(2000);
navigateRefresh();


closeBrowser();

*/		   

//}

//}

//}
