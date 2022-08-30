$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/amarnadhguntur/eclipse-workspace/Test34/src/main/java/features/logincheck.feature");
formatter.feature({
  "line": 1,
  "name": "Login check feature",
  "description": "",
  "id": "login-check-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login page Scenario",
  "description": "",
  "id": "login-check-feature;login-page-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"amarnadhguntur015@gmail.com\" and \"Gdots143$$\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user naviagtes to Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SteopDef.user_is_in_login_page()"
});
formatter.result({
  "duration": 6682613958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amarnadhguntur015@gmail.com",
      "offset": 13
    },
    {
      "val": "Gdots143$$",
      "offset": 47
    }
  ],
  "location": "SteopDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 8547045792,
  "status": "passed"
});
formatter.match({
  "location": "SteopDef.user_clicks_on_login_Button()"
});
formatter.result({
  "duration": 1713113208,
  "status": "passed"
});
formatter.match({
  "location": "SteopDef.user_naviagtes_to_Home_page()"
});
formatter.result({
  "duration": 6795000,
  "status": "passed"
});
formatter.match({
  "location": "SteopDef.user_closes_the_Browser()"
});
formatter.result({
  "duration": 76762791,
  "status": "passed"
});
});