Feature: Demo Login function

  Scenario Outline: Login with several username and password expected login successfully
	Given User enters "<username>" and "<password>"
	When User hit login button
	Then User is navigated to home page
	Examples:
	  | username | password |
	  | nguyenne | 123456   |
	  | nguyenne | 123456   |
	  | nguyenne | 123456   |
	  | nguyenne | 123456   |
	  | nguyenne | 123456   |

  Scenario: Log out normal
	Given User enter log out button
	Then User is navigated to login page

