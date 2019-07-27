$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Safety Login feature",
  "description": "\r\nIn order to ensure Login functionality works,\r\nI want to run the cucumber test to verify it is working",
  "id": "safety-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Login Functionality",
  "description": "",
  "id": "safety-login-feature;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user navigates to https://safety-red5.kuvrr.com/",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "title of the login page is Safety Kuvrr",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters email \"admin\" and password \"secret\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click on continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is on home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_navigates_to_homepage()"
});
formatter.result({
  "duration": 15930492999,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verifyloginPageTitle()"
});
formatter.result({
  "duration": 82928099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 19
    },
    {
      "val": "secret",
      "offset": 40
    }
  ],
  "location": "LoginStepDefinition.fillUserCredential(String,String)"
});
formatter.result({
  "duration": 3262299600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clickContinue()"
});
formatter.result({
  "duration": 52294900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 20390801,
  "status": "passed"
});
});