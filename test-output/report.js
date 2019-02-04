$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Prasad/eclipse-workspace/CucumberwithPageObjectModel/Feature/Features.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate Free CRM HomePage",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open browser and enter Free CRM url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify login page title",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user  login into app",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate Home Page title",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_open_browser_and_enter_Free_CRM_url()"
});
formatter.result({
  "duration": 41340580028,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.verify_login_page_title()"
});
formatter.result({
  "duration": 74462414,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_login_into_app()"
});
formatter.result({
  "duration": 22124776071,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.validate_Home_Page_title()"
});
formatter.result({
  "duration": 3015591533,
  "status": "passed"
});
});