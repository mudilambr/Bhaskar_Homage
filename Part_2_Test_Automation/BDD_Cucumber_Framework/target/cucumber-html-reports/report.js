$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featurefiles/HomageCareer.feature");
formatter.feature({
  "name": "As a Job seeker, I want to apply job in Homage career portal",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AssignmentTest"
    }
  ]
});
formatter.scenario({
  "name": "Submit an application and validate all the required fields (Positive Test case)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AssignmentTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch application url and verify the UI",
  "keyword": "Given "
});
formatter.match({
  "location": "HomageCareerTest.iLaunchApplicationUrlAndVerifyTheUI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Basic details",
  "keyword": "When "
});
formatter.match({
  "location": "HomageCareerTest.iEnterTheBasicDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the Roles selection",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.enterTheRolesSelection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the Job Opportunities",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.enterTheJobOpportunities()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the Engagement Types and others",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.enterTheEngagementTypesAndOthers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enable the declaration form",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.enableTheDeclarationForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submit application",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.SubmitApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify marked mandatory fields are Not observed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomageCareerTest.iVerifyMarkedMandatoryFieldsAreNotObserved()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Application submitted successfully",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.applicationSubmittedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Submit an application with Invalid data (Negative Test case)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AssignmentTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch application url and verify the UI",
  "keyword": "Given "
});
formatter.match({
  "location": "HomageCareerTest.iLaunchApplicationUrlAndVerifyTheUI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Missing some basic details",
  "keyword": "When "
});
formatter.match({
  "location": "HomageCareerTest.iMissingSomeBasicDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submit application",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.SubmitApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify marked mandatory fields are Exists",
  "keyword": "Then "
});
formatter.match({
  "location": "HomageCareerTest.iVerifyMarkedMandatoryFieldsAreExists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Application submitted Failed",
  "keyword": "And "
});
formatter.match({
  "location": "HomageCareerTest.applicationSubmittedFailed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});