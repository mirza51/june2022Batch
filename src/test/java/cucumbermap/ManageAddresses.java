package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddresses {

	

@When("^user click on manage Addresses$")
public void user_click_on_manage_Addresses() throws Throwable {
    Thread.sleep(8000);
	Object[] input9=new Object[1];
	input9[0]="//*[text()='Manage Addresses']";
	Hashtable<String, Object> output9=SeleniumOperations.clickOnElement(input9);
	HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^user click on manage Addresses$", output9.get("MESSAGE").toString());
	
}

@When("^user click on add address$")
public void user_click_on_add_address() throws Throwable {
	Object[] input10=new Object[1];
	input10[0]="//*[text()='ADD ADDRESSES']";
	Hashtable<String, Object> output10=SeleniumOperations.clickOnElement(input10);
	HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user click on add address$", output10.get("MESSAGE").toString());
	
}

@When("^user send \"([^\"]*)\" as name$")
public void user_send_as_name(String name) throws Throwable {
    Thread.sleep(8000);
	Object[] input11=new Object[2];
	input11[0]="(//*[@type='text'])[2]";
	input11[1]=name;
	Hashtable<String, Object> output11=SeleniumOperations.sendText(input11);
	HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"^user send \"([^\"]*)\" as name$", output11.get("MESSAGE").toString());


}

@When("^user send \"([^\"]*)\" as number$")
public void user_send_as_number(String number) throws Throwable {
   
	Object[] input12=new Object[2];
	input12[0]="phone";
	input12[1]=number;
	Hashtable<String, Object> output12=SeleniumOperations.sendText(input12);
	HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(),"^user send \"([^\"]*)\" as number$", output12.get("MESSAGE").toString());

	
}

@When("^user send \"([^\"]*)\" as pinCode$")
public void user_send_as_pinCode(String pinCode) throws Throwable {
   
	 
		Object[] input13=new Object[2];
		input13[0]="pincode";
		input13[1]=pinCode;
		Hashtable<String, Object> output13=SeleniumOperations.sendText(input13);
		HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(),"^user send \"([^\"]*)\" as pinCode$", output13.get("MESSAGE").toString());
	
}

@When("^user send \"([^\"]*)\" as locality$")
public void user_send_as_locality(String locality) throws Throwable {
	
	Object[] input14=new Object[2];
	input14[0]="addressLine2";
	input14[1]=locality;
	Hashtable<String, Object> output14=SeleniumOperations.sendText(input14);
	HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(),"^user send \"([^\"]*)\" as locality$", output14.get("MESSAGE").toString());

}

@When("^user send \"([^\"]*)\" as address$")
public void user_send_as_address(String near) throws Throwable {
    Thread.sleep(8000);
	Object[] input15=new Object[2];
	input15[0]="addressLine1";
	input15[1]=near;
	Hashtable<String, Object> output15=SeleniumOperations.sendText(input15);
	HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(),"^user send \"([^\"]*)\" as address$", output15.get("MESSAGE").toString());


}

@When("^user send \"([^\"]*)\" as city$")
public void user_send_as_city(String city) throws Throwable {
   
	Object[] input16=new Object[2];
	input16[0]="//*[@name='landmark']";
	input16[1]=city;
	Hashtable<String, Object> output16=SeleniumOperations.sendText(input16);
	HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(),"^user send \"([^\"]*)\" as city$", output16.get("MESSAGE").toString());

	
}

@When("^user send \"([^\"]*)\" as landmark$")
public void user_send_as_landmark(String mark) throws Throwable {
	
	Object[] input17=new Object[2];
	input17[0]="landmark";
	input17[1]=mark;
	Hashtable<String, Object> output17=SeleniumOperations.sendText(input17);
	HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(),"^user send \"([^\"]*)\" as landmark$", output17.get("MESSAGE").toString());

	
	
}

@When("^user send \"([^\"]*)\" as alternate phone number$")
public void user_send_as_alternate_phone_number(String alter) throws Throwable {
   
	Object[] input18=new Object[2];
	input18[0]="(//input[@type='text'])[8]";
	input18[1]=alter;
	Hashtable<String, Object> output18=SeleniumOperations.sendText(input18);
	HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(),"^user send \"([^\"]*)\" as alternate phone number$", output18.get("MESSAGE").toString());

	
}

@When("^user click on radio buttone$")
public void user_click_on_radio_buttone() throws Throwable {
    Thread.sleep(8000);
	Object[] input19=new Object[1];
	input19[0]="_1XFPmK";
	Hashtable<String, Object> output19=SeleniumOperations.clickOnElement(input19);
	HTMLReportGenerator.StepDetails(output19.get("STATUS").toString(), "^user click on radio buttone$", output19.get("MESSAGE").toString());
	

}

@When("^user click on save buttone$")
public void user_click_on_save_buttone() throws Throwable {
    
	Object[] input20=new Object[1];
	input20[0]="_1XFPmK";
	Hashtable<String, Object> output20=SeleniumOperations.clickOnElement(input20);
	HTMLReportGenerator.StepDetails(output20.get("STATUS").toString(), "^user click on save buttone$", output20.get("MESSAGE").toString());

	
}

@Then("^address added successfuly$")
public void address_added_successfuly() throws Throwable {
	Object[] input21=new Object[1];
	input21[0]="//*[@type='button'][2]";
	Hashtable<String, Object> output21=SeleniumOperations.clickOnElement(input21);
	HTMLReportGenerator.StepDetails(output21.get("STATUS").toString(), "^address added successfuly$", output21.get("MESSAGE").toString());

	
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
