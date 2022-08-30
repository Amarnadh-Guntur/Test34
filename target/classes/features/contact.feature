Feature: Login check features with examples
Scenario Outline: Login page with examples keyword

Given user is in login page screen for contacts add scenario
When user enters "<username>" and "<password>" on login page for contacts add scenario
Then user clicks on login Button on home page for contacts add scenario
Then user naviagtes to Home page from login page for contacts add scenario
Then user closes the Browser in Home page
Then user navigates to contacts link and clicks on it


/* //a[@class='item active'][contains(@href,'contacts')] */


Examples:
|username                    |password       |
|funkypete10@gmail.com       |Gdots143$$     |
|gunturmarnadh88@gmail.com   |Dotsvalue@143$$|
|amarnadhguntur015@gmail.com |Gdots143$$     |