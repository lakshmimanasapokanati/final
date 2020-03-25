$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/OpenCart.feature");
formatter.feature({
  "name": "OpenCartApplication",
  "description": "  In order to create a webpage\n  As a e-commerce vendor\n  I want to get access to the portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "ValidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027\u003cusername\u003e\u0027 and password \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should access to the portal with title with My Account",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "anjanipriya123@gmail.com",
        "anju.555"
      ]
    },
    {
      "cells": [
        "pravallika12@gmail.com",
        "sunny123"
      ]
    },
    {
      "cells": [
        "s0nii03021998@gmail.com",
        "christ@07"
      ]
    },
    {
      "cells": [
        "manasapokanati@gmail.com",
        "manasa.123"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ValidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027anjanipriya123@gmail.com\u0027 and password \u0027anju.555\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title with My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_access_to_the_portal_with_title_with_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ValidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027pravallika12@gmail.com\u0027 and password \u0027sunny123\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title with My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_access_to_the_portal_with_title_with_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ValidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027s0nii03021998@gmail.com\u0027 and password \u0027christ@07\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title with My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_access_to_the_portal_with_title_with_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ValidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter \u0027manasapokanati@gmail.com\u0027 and password \u0027manasa.123\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_enter_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title with My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_access_to_the_portal_with_title_with_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "InvalidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter \u0027\u003cusername\u003e\u0027 and Password \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I should  not  get access to the portal",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "anjanipriya123@gmail.com",
        "anju.554"
      ]
    },
    {
      "cells": [
        "s0nii03021998@gmail.com",
        "christ@08"
      ]
    }
  ]
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "InvalidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter \u0027anjanipriya123@gmail.com\u0027 and Password \u0027anju.554\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.user_enter_and_Password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should  not  get access to the portal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_not_get_access_to_the_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "InvalidLoginCredential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter \u0027s0nii03021998@gmail.com\u0027 and Password \u0027christ@08\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.user_enter_and_Password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should  not  get access to the portal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_not_get_access_to_the_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnPhones and PDAs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on the product Phones and PDAs",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_click_on_the_product_Phones_and_PDAs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get all Phones and PDAs",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_all_Phones_and_PDAs()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnMP3 Players",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on the product MP3 Players",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_click_on_the_product_MP3_Players()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get all MP3 Players",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_get_all_MP3_Players()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "these are the steps common for every scenario to be followed",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with opencartpage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_have_browser_with_opencartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ClickOnCurrency",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on currency",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_click_on_currency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to select the currency",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefintion.StepDefinition.i_should_able_to_select_the_currency()"
});
formatter.result({
  "status": "passed"
});
});