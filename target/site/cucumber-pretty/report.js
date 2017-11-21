$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "User login on Automation practice website",
  "description": "As a user\r\nI want to see the login page\r\nSo that I can login successfully",
  "id": "user-login-on-automation-practice-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 14164863599,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.verifyUserIsOnHomePage()"
});
formatter.result({
  "duration": 139833184,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User can able to login successfully with valid credentials",
  "description": "",
  "id": "user-login-on-automation-practice-website;user-can-able-to-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User selects SignIn link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should be on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter email as \"qamasters@mailinator.com\" and password as \"Password1\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User selects SignIn",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should see his name as \"QA Masters\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.selctSignInLink()"
});
formatter.result({
  "duration": 1768343586,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyUserIsOnLoginpage()"
});
formatter.result({
  "duration": 70333951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qamasters@mailinator.com",
      "offset": 21
    },
    {
      "val": "Password1",
      "offset": 64
    }
  ],
  "location": "LoginSteps.enterLoginCredentials(String,String)"
});
formatter.result({
  "duration": 392717173,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.selectSignIn()"
});
formatter.result({
  "duration": 1483080929,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.isUserLoggedIn()"
});
formatter.result({
  "duration": 68961713,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA Masters",
      "offset": 29
    }
  ],
  "location": "LoginSteps.user_should_see_his_name_as_something(String)"
});
formatter.result({
  "duration": 50750156,
  "status": "passed"
});
formatter.after({
  "duration": 117355672,
  "status": "passed"
});
});