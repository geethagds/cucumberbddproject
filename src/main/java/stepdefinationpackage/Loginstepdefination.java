package stepdefinationpackage;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagespackage.Loginp;
import utilities.Reportingmanager.ReportingManager;

public class Loginstepdefination extends Loginp{

		@Given("^User is in login page$")
	    public void user_is_in_login_page() throws IOException  
		{
			launchApplication();	
			ExtentCucumberAdapter.addTestStepLog("application launched successfully");
			 ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.
			 captureScreenshot());
			 
		
		}
		
		   @When("^User enters email id \"([^\"]*)\"$")
		    public void user_enters_email_id(String EmailID) throws IOException, InterruptedException 
		   {
				enterEmailId(EmailID); 
				ExtentCucumberAdapter.addTestStepLog("email entered successfully" + EmailID);
				ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());


		    	Thread.sleep(3000);
		    	
		    }
		
		   
		   @And("^User enters password \"([^\"]*)\"$")
		    public void user_enters_password(String strArg1) throws IOException {
		        enterPassword(strArg1);
				
				 ExtentCucumberAdapter.addTestStepLog("password entered successfully" + strArg1);
				 ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.
				 captureScreenshot());
				 
		
		    }
		   
		
		@And("^User clicks the signin button$")
	    public void User_clicks_the_signin_button() throws IOException, InterruptedException  
		{
			clickSigninButton();
			ExtentCucumberAdapter.addTestStepLog("button clicked successfully");

			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.captureScreenshot());
	    	Thread.sleep(5000);

		
		}
		

		
/*		 @Then("^close application$") public void close_application() throws
		 IOException {
		 
		 closebrowser();
		 ExtentCucumberAdapter.addTestStepLog("application closed successfully");
		 ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(ReportingManager.
		 captureScreenshot());
		  
		  
*/		  
		 
	}
