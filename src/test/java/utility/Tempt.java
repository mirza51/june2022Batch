package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException
	{
		
		//OPEN BROWSER
	System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
	//OPEN APPLICATION
	driver.get("https://www.flipkart.com/");
		
	//CLICK ON CANCEL ICON
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	
	//MOUSE OVER IN LOGING
	Actions act=new Actions(driver);
	WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
	act.moveToElement(abc).build().perform();
	Thread.sleep(20000);
	
	//CLICK ON MY PROFILE
	Thread.sleep(2000);
	driver.findElementByXPath("//*[text()='My Profile']").click();
	//TYPE NAME
	 Thread.sleep(5000);
	    driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8149524177");
	   //ENTER PASSWORD
	    driver.findElementByXPath("//*[@type='password']").sendKeys("515151");   
	    //CLICK ON LOGIN BUTTON
	    driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //CLICK ON MANAGE ADDRESS
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[text()='Manage Addresses']")).click();
	    
	      //CLICK ON ADDADRESS
	      Thread.sleep(5000);
	      
	    driver.findElementByXPath("//*[text()='ADD ADDRESSES']").click();
	     //NAME
	     Thread.sleep(2000);
		    driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("asad");
	     //MOBILENUMBER
		    driver.findElementByName("phone").sendKeys("8149524177");
	    //ENTER PIN CODE
		    driver.findElementByName("pincode").sendKeys("414001");
	     //ENTER LOCALITY
		     driver.findElementByName("addressLine2").sendKeys("nagar");
	    //ENTER ADDRESS NERA STREET
		    driver.findElementByName("addressLine1").sendKeys("near inam masjid");
	     //CITY AND DISTRICT
		    Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@name='landmark']")).sendKeys("ahmednagar");
	     //ENTER LADNMARK
	       driver.findElementByName("landmark").sendKeys("near inam masjid");
	     //ALTERNATE NUMBER
		   driver.findElementByXPath("(//input[@type='text'])[8]").sendKeys("9822688347");
	     //CLICK ON RADION BUTTON 
		    driver.findElementByClassName("_1XFPmK").click();
	     //CLICK ON SAVE BUTTONE
		   driver.findElement(By.xpath("//*[@type='button'][2]")).click();
	    
	    
	}
	
		
	}

