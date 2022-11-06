$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Signin.feature");
formatter.feature({
  "line": 3,
  "name": "Sign in feature",
  "description": "",
  "id": "sign-in-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Given user currently state"
    },
    {
      "line": 5,
      "value": "#When user do this"
    },
    {
      "line": 6,
      "value": "#Then this result of what user do"
    }
  ],
  "line": 8,
  "name": "Sign in with  Valid Email and Password",
  "description": "",
  "id": "sign-in-feature;sign-in-with--valid-email-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User fill valid email",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "valid password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "The result is success Sign in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Sign in with invalid data",
  "description": "",
  "id": "sign-in-feature;sign-in-with-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User fill invalid email",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "The result is failed Sign in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "Sign in with password less than 5 characters",
  "description": "",
  "id": "sign-in-feature;sign-in-with-password-less-than-5-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User fill valid email",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Password less than 5 character",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "The result is failed Sign in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 27,
  "name": "Sign in with invalid Email and password less than 5 characters",
  "description": "",
  "id": "sign-in-feature;sign-in-with-invalid-email-and-password-less-than-5-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User fill invalid email",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Password less than 5 character",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "The result is failed Sign in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 33,
  "name": "Sign in input empty Email and password",
  "description": "",
  "id": "sign-in-feature;sign-in-input-empty-email-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "User on Sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User directly click sign in",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "The result is failed Sign in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});