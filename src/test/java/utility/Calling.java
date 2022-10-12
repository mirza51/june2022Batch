package utility;



public class Calling {

	
	
public static void main(String[] args)
	{


	//browserLaunch	
	Object[] input=new Object[2];
	input[0]="Chrome";
	input[1]="E:\\Automation support\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input);
	
	//open application
	Object[] input1=new Object[1];
	input1[0]="https://www.flipkart.com/";
	SeleniumOperations.openApplication();
	

   //CLICK ON ELEMENT
   Object[] input2=new Object[1];
   input2[0]="//*[@class='_2KpZ6l _2doB4z']";  
   SeleniumOperations.clickOnElement(input2);

  //MOUSE OVER ACTION
  Object[] input3=new Object[1];
  input3[0]="//*[@class='_1_3w1N']";
  SeleniumOperations.mouseOverAction(input3);

 //CLICK ON ELEMENT
 Object[] input4=new Object[1];
 input4[0]="//*[text()='My Profile']";
 SeleniumOperations.clickOnElement(input4);


  //SEND KEYS
 Object[] input5=new Object[2];
 input5[0]="(//*[@type='text'])[2]";
 input5[1]="8149524177";
 SeleniumOperations.sendText(input5);

 //SEND KEYS
 Object[] input6=new Object[2];
 input6[0]="//*[@type='password']";
 input6[1]="515151";
 SeleniumOperations.sendText(input6);

 //CLICK ON ELEMENT
 Object[] input7=new Object[1];
 input7[0]="(//*[@type='submit'])[2]";
 SeleniumOperations.clickOnElement(input7);


} 
  
  
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  












	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


