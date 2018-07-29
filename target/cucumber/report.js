$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fbLogin.feature");
formatter.feature({
  "line": 1,
  "name": "verify facebook login",
  "description": "",
  "id": "verify-facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user enters invalid username ans password",
  "description": "",
  "id": "verify-facebook-login;user-enters-invalid-username-ans-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on fb login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username in the username textbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters password in the password textbox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user navigates to other page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User validates the error message.",
  "keyword": "And "
});
formatter.match({
  "location": "bddfblogin.user_is_on_fb_login_page()"
});
formatter.result({
  "duration": 5035748288,
  "status": "passed"
});
formatter.match({
  "location": "bddfblogin.user_enters_username_in_the_username_textbox()"
});
formatter.result({
  "duration": 936434480,
  "status": "passed"
});
formatter.match({
  "location": "bddfblogin.user_enters_password_in_the_password_textbox()"
});
formatter.result({
  "duration": 84919639,
  "status": "passed"
});
formatter.match({
  "location": "bddfblogin.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1805952876,
  "status": "passed"
});
formatter.match({
  "location": "bddfblogin.user_navigates_to_other_page()"
});
formatter.result({
  "duration": 37560033,
  "status": "passed"
});
formatter.match({
  "location": "bddfblogin.user_validates_the_error_message()"
});
formatter.result({
  "duration": 26799,
  "status": "passed"
});
});