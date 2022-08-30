Feature: Login check features with examples
Scenario Outline: Login page with examples keyword

Given user is in login page screen
When user enters "<username>" and "<password>" on login page
Then user clicks on login Button on home page
Then user naviagtes to Home page from login page
Then user closes the Browser in Home page


Examples:
|username                    |password       |
|funkypete10@gmail.com       |Gdots143$$     |
|gunturmarnadh88@gmail.com   |Dotsvalue@143$$|
|amarnadhguntur015@gmail.com |Gdots143$$     |
