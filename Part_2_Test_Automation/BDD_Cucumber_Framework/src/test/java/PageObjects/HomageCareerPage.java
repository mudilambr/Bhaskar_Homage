package PageObjects;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.IdType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.WebActions;

import static enums.IdType.*;
import static utilities.FinalProperties.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class HomageCareerPage {

	// Constants
	private static String FIRSTNAME_TEXT = "Bhaskara Rao"; 
	private static String LASTNAME_TEXT = "Mudila";
	private static String EMAIL_TEXT = "test123@abc.com"; 
	private static String PHONE_TEXT = "12345678";
	private static String DOB_TEXT = "22/03/1990";

	private static final boolean True =  true;
	private static final boolean False = false;	
	
	// Basic Details
	private static String HEADER_TITLE = "/html/head/title";
	private static String HEADER_TITLE_TEXT = "Homage - Quality Home Care";
	private static String FIRSTNAME = "firstName";
	private static String LASTNAME = "lastName";	
	private static String EMAIL = "email";	
	private static String PHONE = "phone";
	private static String DOB = "dob"; 
	private static String NATIONALITY = "nationality";
	private static String NATIONALITY_FOREIGNER = "//*[@id='menu-']/div[3]/ul/li[3]";
	private static String COUNTRY_OF_ORIGIN = "//*[@id='country_of_origin']";
	private static String COUNTRY_OF_ORIGIN_TEXT = "India";
	
	// Roles
	private static String PROFESSIONAL_EXP_NO = "//*[@id='root']/div/div[1]/div[3]/div/span[4]/div/button[2]";
	private static String PROFESSIONAL_EXP_CAREGIVER = "//*[@id='root']/div/div[1]/div[3]/div/div[3]/button/div/div";
	
	// Job Opportunities
	private static String JOB_OPPORTUNITIES = "//*[@id='jobOpp']/button/span";
	private static String JOB_COVID_ASSIGNMENTS = "//*[@id='root']/div/div[1]/div[3]/div/span[6]/div/button[3]/div";

	// Job Engagement Types
	private static String JOBTYPES_ENG = "//*[@id='jobTypes']/button/span/span";
	private static String JOBTYPE_FULLTIME = "//*[@id='root']/div/div[1]/div[3]/div/span[7]/div/button[3]/div/b";	
	
	// Background Check
	private static String BACKGROUNDCHECK_NO = "//*[@id='root']/div/div[1]/div[3]/div/div[5]/button[2]";

	// Job Advertisement
	private static String JOBADV_SOURCE = "//*[@id='source']";
	private static String JOBADV_LINKEDIN = "//*[@id='menu-']/div[3]/ul/li[5]";

	private static String DECLARATION_FULLNAME = "//*[@id='declarationName']";
	private static String CHECKBOX_ACCEPT = "//*[@id='root']/div/div[1]/div[3]/div/div[9]";
	private static String SUBMIT_APPLICATION_XPATH =	"//*[@id='root']/div/div[1]/div[3]/div/button[3]";

	private static String MANDATORY_REQUIRED_FIELD = "//*[contains(@id,'-helper-text')]";
	private static String MANDATORY_REQUIRED_TEXT = "Required";
	private static String MANDATORY_INCORRECT_TEXT = "Incorrect";
	private static String MANDATORY_INVALID_TEXT = "Invalid";	
	private static String APPLICATION_SUBMITTED = "//*[@id='root']/div/div[1]/div[3]/div/h1";
	private static String APPLICATION_SUBMITTED_TEXT = "Your application has been submitted!";

	
	
	// ******************************************** Helper Methods ******************************************** //
    public void openUrlAndVerify() {
    	WebActions.openUrl(env.getProperty("applicationUrl"));
    	WebActions.waitForPageToLoadFully();
		softAssert.assertThat(WebActions.getInstance().getTitle()).contains(HEADER_TITLE_TEXT);
    }

    
    public void enterBasicDetailsAndVerify() {
    	WebActions.scrollDown(1);
    	WebActions.typeText(Id, FIRSTNAME, FIRSTNAME_TEXT);
    	WebActions.typeText(Id, LASTNAME, LASTNAME_TEXT);
    	WebActions.typeText(Id, EMAIL, EMAIL_TEXT);
    	WebActions.typeText(Id, PHONE, PHONE_TEXT);
    	WebActions.typeText(Id, DOB, DOB_TEXT);
    	WebActions.click(Id, NATIONALITY);
    	WebActions.click(Xpath, NATIONALITY_FOREIGNER);
    	WebActions.typeText(Xpath, COUNTRY_OF_ORIGIN, COUNTRY_OF_ORIGIN_TEXT);
    	WebActions.locateElement(Xpath, COUNTRY_OF_ORIGIN).sendKeys(Keys.RETURN);
    }
    
    
	public void selectProfessionalExperienceNo() {
		WebActions.scrollDown(1);
    	WebActions.click(Xpath, PROFESSIONAL_EXP_NO);
    	WebActions.click(Xpath, PROFESSIONAL_EXP_CAREGIVER);
	}
	
    
	public void selectJobOpportunityCovid() {
		WebActions.click(Xpath, JOB_OPPORTUNITIES);
		WebActions.scrollDown(2);
    	WebActions.click(Xpath, JOB_COVID_ASSIGNMENTS);
	}
    
	
	public void selectJobTypeFullTime() {
		WebActions.click(Xpath, JOBTYPES_ENG);
		WebActions.scrollDown(2);
    	WebActions.click(Xpath, JOBTYPE_FULLTIME);
	}

	
	public void selectBackgroundCheckNo() {
		WebActions.click(Xpath, BACKGROUNDCHECK_NO);
	}

	
	public void selectJobAdvertisementSourceLinkedin() {
		WebActions.click(Xpath, JOBADV_SOURCE);
		WebActions.click(Xpath, JOBADV_LINKEDIN);		
	}

	
	public void enterDeclarationFullName() {
		WebActions.scrollDown(1);
		WebActions.click(Xpath, DECLARATION_FULLNAME);
		WebActions.click(Xpath, CHECKBOX_ACCEPT);
	}	
	
	
	public void selectSubmitApplication() {
		WebActions.scrollDown(1);
		WebActions.click(Xpath, SUBMIT_APPLICATION_XPATH);		
	}
	

	public boolean verifyMandatoryfields() {
		WebActions.scrollDown(1);
		try {
		    WebElement tmpRequired1 = WebActions.getInstance().findElement(By.xpath(MANDATORY_REQUIRED_FIELD));
		    String tmpRequired = tmpRequired1.getText();
		    
			if ((tmpRequired.contains(MANDATORY_REQUIRED_TEXT)) || 
					(tmpRequired.contains(MANDATORY_INCORRECT_TEXT)) ||
					(tmpRequired.contains(MANDATORY_INVALID_TEXT))) {
				return True;
				}
			else {
				return False;
			}				
		   
	    } catch (NoSuchElementException e) {
	    	System.out.println("Mandatory field errors are Not displaying: "+ e.getMessage());
	    	return False;
	    }			    				   
	}
	
		 
	public void verifyMandatoryfieldsExists() {
		softAssert.assertThat(verifyMandatoryfields()).isEqualTo(True);
		System.out.println("Mandatory field errors are Existing");		
	}

	
	public void verifyMandatoryfieldsNotExists() {
		softAssert.assertThat(verifyMandatoryfields()).isEqualTo(False);
		System.out.println("Mandatory field errors are Not Existing");		
	}

	public void checkTheApplicationStatusForSuccess() {
		//verifyMandatoryfieldsNotExists();
		WebElement tmpAppStatus1 = null;
		try {
			tmpAppStatus1 = WebActions.getInstance().findElement(By.xpath(APPLICATION_SUBMITTED));
			String tmpAppStatus = tmpAppStatus1.getText();			
			softAssert.assertThat(tmpAppStatus).contains(APPLICATION_SUBMITTED_TEXT);
			
	    } catch (NoSuchElementException e) {
	    	softAssert.assertThat(verifyMandatoryfields()).isEqualTo(False);
	    	System.out.println("Submit of Application is Failed due to missing mandatory fields: "+ e.getMessage());
	    }			    				   
	}
	
	public void checkTheApplicationStatusForFailure() {
		WebElement tmpAppStatus1 = null;
		try {
			tmpAppStatus1 = WebActions.getInstance().findElement(By.xpath(APPLICATION_SUBMITTED));
			String tmpAppStatus = tmpAppStatus1.getText();			
			softAssert.assertThat(tmpAppStatus).contains(APPLICATION_SUBMITTED_TEXT);
			
	    } catch (NoSuchElementException e) {
	    	softAssert.assertThat(verifyMandatoryfields()).isEqualTo(True);
	    	System.out.println("Submit of Application is Failed due to missing mandatory fields: "+ e.getMessage());
	    }			    				   
	}

	
	public void verifyMissingFieldLastName() {
    	WebActions.scrollToTop();
    	WebActions.typeText(Id, FIRSTNAME, FIRSTNAME_TEXT);
    	//WebActions.typeText(Id, LASTNAME, LASTNAME_TEXT);		// Missing Last Name
    	WebActions.typeText(Id, EMAIL, EMAIL_TEXT);
    	WebActions.typeText(Id, PHONE, PHONE_TEXT);
    	WebActions.typeText(Id, DOB, DOB_TEXT);
    	WebActions.click(Id, NATIONALITY);
    	WebActions.click(Xpath, NATIONALITY_FOREIGNER);
    	WebActions.typeText(Xpath, COUNTRY_OF_ORIGIN, COUNTRY_OF_ORIGIN_TEXT);
    	WebActions.locateElement(Xpath, COUNTRY_OF_ORIGIN).sendKeys(Keys.RETURN);
    }

	
}
	

