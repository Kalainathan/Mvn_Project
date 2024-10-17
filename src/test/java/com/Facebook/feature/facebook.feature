Feature: User Going To Post The Picture In Facebook Application

  Scenario Outline: User Going To Enter The Username And Password In The Particular Fields
    Given user Launch The Facebook Application Url
    When user Going To Enter The "<Username>" In The Username Field
    And user Going To Enter THe "<Password>" In The Password Field
    Then user Click THe Log In Button And Navigate TO Next Page

    Examples: 
    	|Username|Password|
      | kalai |  1234 |
      | ilan  | 12344 |
      |8939596988|Thiya$1804|
