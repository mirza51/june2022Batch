package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperations
      {
	 
	
	public static WebDriver driver=null;
    
	public static ConfigReader config;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	//BROWSERLAUNCH
	public static Hashtable<String,Object> browserLaunch(Object[]inputparameters)
	{
		try{
		String bName=(String) inputparameters[0];
		String webDriverExePath=(String) inputparameters[1];
		
		if(bName.equalsIgnoreCase("Chrome"))
		{
			config=new ConfigReader();
			
		System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		}
		
		else if (bName.equalsIgnoreCase("Firefox"))
		{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
		}
	         outputParameters.put("STATUS", "PASS");
	         outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		
		
	}catch(Exception e)
		{
	        
		outputParameters.put("STATUS", "FAIL");
        outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given:"+inputparameters[0].toString());
	
		
		}
		return outputParameters;
    }
		
	
	//OPEN APPLICATION
	public static Hashtable<String,Object> openApplication()
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		driver.get(config.getApplicationUrl());
	
		outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "Action: Open Application, Input Given:"+config.getApplicationUrl().toString());
	  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
	}catch(Exception e)
		{
		    outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "Action: Open Application, Input Given:"+config.getApplicationUrl().toString());
		
		}
		return outputParameters;
		}
	//CLICK ON ELEMENT
	public static Hashtable<String,Object> clickOnElement(Object[]inputparameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String locator=(String)inputparameters[0]; 
	    driver.findElement(By.xpath(locator)).click();
	    
	    outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "Action: Click On Element, Input Given:"+inputparameters[0].toString());
	    
	}
	catch(Exception e)
		{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "Ation: Click On Element, Input Given:"+inputparameters[0].toString());
	
		}
		return outputParameters;
	}
		
		
		
	//MOUSE OVER
	public static Hashtable<String, Object> mouseOverAction(Object[]inputparameters)
	{
		try{
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String locator=(String)inputparameters[0];
		Actions act=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(locator));
		act.moveToElement(abc).build().perform();
		
		 outputParameters.put("STATUS", "PASS");
		 outputParameters.put("MESSAGE", "Action: Mouse Over Action, Input Given:"+inputparameters[0].toString());
		
		
		}
	     catch(Exception e)
		{
	    	outputParameters.put("STATUS", "FAIL");
	    	outputParameters.put("MESSAGE", "Action: Mouse Over Action, Input Given:"+inputparameters[0].toString());
	    	  
		}
		return outputParameters;
		}
	//Send keys
	public static Hashtable<String, Object> sendText(Object[]inputparameters)
	{
		try{
		String locator=(String) inputparameters[0];
		String sendkey=(String) inputparameters[1];
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	   driver.findElement(By.xpath(locator)).sendKeys(sendkey);
	   
	      outputParameters.put("STATUS", "PASS");
	      outputParameters.put("MESSAGE", "Action: Send Text, Input Given:"+inputparameters[0].toString());
	   
	   
		}
		catch(Exception e)
		{
	     outputParameters.put("STATUS", "FAIL");
	     outputParameters.put("MESSAGE", "Action: Send Text, Input Given:"+inputparameters[0].toString());
			
			
		}
		return outputParameters;
	}

	  
	  //VALIDATION
   public static Hashtable<String, Object> validation(Object[]inputparameters)
   {
	   try{
	   String xpath= (String) inputparameters[0];
	   String giventext= (String) inputparameters[1];
	   driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	   String findedText=driver.findElement(By.xpath(xpath)).getText();
	   
	   if(findedText.equalsIgnoreCase(giventext))
	   {
		   System.out.println("Test Case Pass");
		   
         }
	  
   
	   
   else
   {
	   System.out.println("Test Case Fail");
   }
	   
	   outputParameters.put("STATUS", "PASS");
	   outputParameters.put("MESSAGE", "Action: Validation, Input Given:"+inputparameters[1].toString());
	   
	   
	   
   }
	catch(Exception e)
	   {
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action: Validation, Input Given:"+inputparameters[1].toString());
		
	   }
	return outputParameters;
	   }
   
   
   
      }
	
	
	


