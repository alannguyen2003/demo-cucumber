Feature: Demo Login function

  Scenario Outline: Login with several username and password expected login successfully
	Given User enters "<username>" and "<password>"
	When User hit login button
	Then User is navigated to home page and equals "<username>"
	Examples:
	  | username   | password |
	  | mngr510570 | pedetEj  |

  Scenario: Log out normal
	Given User enter log out button
	Then User is navigated to login page

