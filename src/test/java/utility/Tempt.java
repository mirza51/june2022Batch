package utility;

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
	    
	
	
		
	}
}
