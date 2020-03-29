Feature: OpenCartApplication 
  In order to create a webpage
  As a e-commerce vendor
  I want to get access to the portal
  
  Background: these are the steps common for every scenario to be followed
  Given I have browser with opencartpage 
  
  Scenario: ValidLoginCredential
 When I enter login details from Excel "src/test/resources/ExcelSheet/OpenCart.xlsx" with SheetName "ValidCredentials"
 Then I should access to the portal with title with My Account
 
 
 
 Scenario Outline: InvalidLoginCredential
 When user enter '<username>' and Password '<password>'
 Then I should  not  get access to the portal
 
 Examples:
 |username|password|
 |anjanipriya123@gmail.com|anju.554|
 |s0nii03021998@gmail.com|christ@08|
 
    Scenario: ClickOnPhones and PDAs
   When I click on the product Phones and PDAs
   Then I should get all Phones and PDAs
   
   Scenario: ClickOnMP3 Players
   When I click on the product MP3 Players
   Then I should get all MP3 Players
   
   
   Scenario: ClickOnCurrency
   When I click on currency
   Then I should able to select the currency
   
  
   
   
   
   
   
   
   
   
   
   
   
   
  