$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  This feature will test login related scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.background({
  "name": "example of background scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the browser opens",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.the_browser_opens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter URL\u0027s test web",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSD.i_enter_URL_s_test_web()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page shows and credentials are asked",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.page_shows_and_credentials_are_asked()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Happy path when everything works ok",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Happy"
    }
  ]
});
formatter.step({
  "name": "Im at login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.im_at_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valid credentials are entered",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSD.valid_credentials_are_entered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The welcome page shows successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.the_welcome_page_shows_successfully()"
});
formatter.result({
  "status": "passed"
});
});