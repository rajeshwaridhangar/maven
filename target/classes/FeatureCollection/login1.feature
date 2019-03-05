#Author: Rajeshwari
#Date : 2019-02-25
#Feature:login

Feature: Login feature

  
  Background: User access the login page of Mercury tours application 
      When user opens "chrome" browser
      And user enters the application url "http://newtours.demoaut.com/mercurywelcome.php" 
      And user waits "5" seconds to load login page
      And user maximizes login page 
      Then Mercury Tours application login page should be displayed
    

  
  Scenario Outline: Varify that valid user able to login into Mercury Tours application by using valid username and password
    Given user access login page of Mercury tours application 
    When user enters "<username>" as username
    And user enters "<password>" as password
    And user clicks on signin button
    Then user is on flight finder page
    When user clicks on sign off link
    Then user access sign on page
    
   Examples: 
   
   |username|password|
   |Suvidyap1|P@ssword1|
   |Suvidyap2|P@ssword2|

   