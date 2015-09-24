# shooping_cart_automation

Sample Automation Framework

Maven + Selenium + cucucumber + TestnNG

Command to Execute the Automation

To Run scripts in Chrome Browser (Make Sure chromedriver included in the path)
mvn clean install -Pcucumber -Dbrowser=chrome

To Run Scripts in Firefox Browser
mvn clean install -Pcucumber -Dbrowser=firefox

After the execution, Maven plugin will generate nice html reports.

User Scenario:-
Goto ebay Site and search for an item
Narrow the Search to "Buy it Now"
Add the item to the cart
Navigate to Shopping Basket
Check whether the selected item added to the basket

To Do:-
Page objects needs to be connected to Step definitions
Shopping cart assertions needs to be improved
Add cloud based testing (Saucelabs) capabailities to Browser Selection. Currently this project supports only Chrome and Firefox
ChromeDriver needs to be included in the path.

