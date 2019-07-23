$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('org\teachermatch\login\login.feature');
formatter.feature({
  "line": 1,
  "name": "Login Functionality Feature",
  "description": "\nIn order to ensure Login functionality works,\nI want to run the cucumber test to verify it is working",
  "id": "login-functionality-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality-feature;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user navigates to https://titan.teachermatch.org",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user logs in using email as titanteacher@yopmail.com and password as omsai11ram",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.givenStatment()"
});
formatter.result({
  "duration": 9444274264,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.whenStatement()"
});
formatter.result({
  "duration": 4669553493,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.thenStatment()"
});
formatter.result({
  "duration": 15362730,
  "error_message": "java.lang.AssertionError: expected [Admin Mosaic] but found [Set Preferences]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat org.teachermatch.login.LoginTest.thenStatment(LoginTest.java:36)\r\n\tat ✽.Then login should be successful(org\\teachermatch\\login\\login.feature:9)\r\n",
  "status": "failed"
});
});