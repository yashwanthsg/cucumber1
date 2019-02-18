#Author: your.email@your.domain.com

Feature: 
   
  Scenario Outline: To test the abhibus website
    Given The user is in home page
    When 	The user filling the fields "<from>", "<to>"
   	And The user search the availabity 
    Then The availabity results got
	Examples:
				 |	from	|	to	|
    	|Chennai|Madurai|
    	
    	
  

