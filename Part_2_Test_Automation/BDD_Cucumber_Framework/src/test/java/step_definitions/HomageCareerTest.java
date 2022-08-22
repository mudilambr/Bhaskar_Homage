package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import PageObjects.HomageCareerPage;

public class HomageCareerTest {

	HomageCareerPage homageCareerPageObject = new HomageCareerPage();
	
	@Given("I launch application url and verify the UI")
	public void iLaunchApplicationUrlAndVerifyTheUI() {	    
	    System.out.println("Open URL and Verify...");
		homageCareerPageObject.openUrlAndVerify();	    	   
	}

	@When("I enter the Basic details")
	public void iEnterTheBasicDetails() {
		System.out.println("Entering the Basic details...");
		homageCareerPageObject.enterBasicDetailsAndVerify();	
	}

	@When("enter the Roles selection")
	public void enterTheRolesSelection() {
		System.out.println("Entering the Roles section...");
		homageCareerPageObject.selectProfessionalExperienceNo();		
	}

	@When("enter the Job Opportunities")
	public void enterTheJobOpportunities() {
		System.out.println("Entering Job Opportunities...");
		homageCareerPageObject.selectJobOpportunityCovid();				
	}

	@When("enter the Engagement Types and others")
	public void enterTheEngagementTypesAndOthers() {
		System.out.println("Entering Engagement Types and others (Job type, Background check, Job Advertisement source) ...");
		homageCareerPageObject.selectJobTypeFullTime();
		homageCareerPageObject.selectBackgroundCheckNo();
		homageCareerPageObject.selectJobAdvertisementSourceLinkedin();				
	}

	@When("enable the declaration form")
	public void enableTheDeclarationForm() {		
		System.out.println("Entering the Declaration form...");
		homageCareerPageObject.enterDeclarationFullName();	
	}

	@When("Submit application")
	public void SubmitApplication() {
		System.out.println("Clicking on Submit application form...");
		homageCareerPageObject.selectSubmitApplication();
	}

	@Then("I verify marked mandatory fields are Not observed")
	public void iVerifyMarkedMandatoryFieldsAreNotObserved() {
		System.out.println("Checking Mandatory fields Errors are observed or Not...");
		homageCareerPageObject.verifyMandatoryfieldsNotExists();
		//homageCareerPageObject.verifyMandatoryfieldsExists();		
	}
	

	@Then("Application submitted successfully")
	public void applicationSubmittedSuccessfully() {
		System.out.println("Checking Job Application Submitted status...");
		homageCareerPageObject.checkTheApplicationStatusForSuccess();		
	}
	
	
	@When("I Missing some basic details")
	public void iMissingSomeBasicDetails() {
		System.out.println("Submitting Application with some missing field (Last Name)...");
		homageCareerPageObject.verifyMissingFieldLastName();
		enterTheRolesSelection();
		enterTheJobOpportunities();		
		enterTheEngagementTypesAndOthers();
		enableTheDeclarationForm();
		SubmitApplication();		
	}

	
	@Then("I verify marked mandatory fields are Exists")
	public void iVerifyMarkedMandatoryFieldsAreExists() {
		System.out.println("Checking Mandatory fields Errors are observed or Not...");
		homageCareerPageObject.verifyMandatoryfieldsExists();

	}
	

	@Then("Application submitted Failed")
	public void applicationSubmittedFailed() {
		System.out.println("Checking Job Application Submitted status...");
		homageCareerPageObject.checkTheApplicationStatusForFailure();
	}
	
}

