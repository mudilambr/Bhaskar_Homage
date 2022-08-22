#Author: Bhaskara Rao Mudila
#e-mail: bhaskar.cse.535@gmail.com

@AssignmentTest
Feature: As a Job seeker, I want to apply job in Homage career portal

	# Testcase-1 (Positive Test case)
  Scenario: Submit an application and validate all the required fields (Positive Test case)
	  Given I launch application url and verify the UI
	  When I enter the Basic details
	  And enter the Roles selection
	  And enter the Job Opportunities
	  And enter the Engagement Types and others
	  And enable the declaration form
	  And Submit application
	  Then I verify marked mandatory fields are Not observed
	  And Application submitted successfully
	
	
	# Testcase-2 (Negative Test case) 
  Scenario: Submit an application with Invalid data (Negative Test case)
	  Given I launch application url and verify the UI
	  When I Missing some basic details
	  And Submit application
	  Then I verify marked mandatory fields are Exists
	  And Application submitted Failed
	
	