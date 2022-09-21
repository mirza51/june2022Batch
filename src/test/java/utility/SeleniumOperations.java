package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
      {
	 
	
	public static WebDriver driver=null;
      
	//BROWSERLAUNCH
	public static void browserLaunch(Object[]inputparameters)
	{
		try{
		String bName=(String) inputparameters[0];
		String webDriverExePath=(String) inputparameters[1];
		
		if(bName.equalsIgnoreCase("Chrome"))
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", webDriverExePath);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		
		else if (bName.equalsIgnoreCase("Firefox"))
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.setProperty("webdriver.gecko.driver", webDriverExePath);
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
	}
		catch(Exception e)
		{
		System.out.println(e);
		}
    }
		
	//OPEN APPLICATION
	public static void openApplication(Object[]inputparameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String strgurl=(String)inputparameters[0]; 
		driver.get(strgurl);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	//CLICK ON ELEMENT
	public static void clickonElement(Object[]inputparameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String locator=(String)inputparameters[0]; 
	    driver.findElement(By.xpath(locator)).click();
	}
	catch(Exception e)
		{
		System.out.println(e);
		}
		}
	//MOUSE OVER
	public static void mouseOverAction(Object[]inputparameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String locator=(String)inputparameters[0];
		Actions act=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(locator));
		act.moveToElement(abc).build().perform();
		}
	     catch(Exception e)
		{
	    	 System.out.println(e);
		}
		}
	//Send keys
	public static void sendText(Object[]inputparameters)
	{
		try{
		String locator=(String) inputparameters[0];
		String sendkey=(String) inputparameters[1];
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath(locator)).sendKeys(sendkey);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	  
	  //VALIDATION
   public static void validation(Object[]inputparameters)
   {
	   try{
	   String xpath= (String) inputparameters[0];
	   String giventext= (String) inputparameters[1];
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String findedText=driver.findElement(By.xpath(xpath)).getText();
	   
	   if(findedText.equalsIgnoreCase(giventext))
	   {
		   System.out.println("Test Case Pass");
		   
         }
	  
   
	   
   else
   {
	   System.out.println("Test Case Fail");
   }
   }
	catch(Exception e)
	   {
		System.out.println(e);
	   }
	   }
   
   
   
      }
	
	
	


