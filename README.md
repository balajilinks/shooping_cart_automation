# shopping_cart_automation

## Sample Automation Framework

Maven + Selenium + cucumber + TestnNG

# Command to Execute the Automation

### To Run scripts in Chrome Browser 
mvn clean install -Pcucumber -Dbrowser=chrome

### To Run Scripts in Firefox Browser
mvn clean install -Pcucumber -Dbrowser=firefox

After the execution, Maven plugin will generate nice html reports.

## User Scenario:-
1. Goto ebay Site and search for an item
2. Narrow the Search to "Buy it Now"
3. Add the item to the cart
4. Navigate to Shopping Basket
5. Check whether the selected item added to the basket

## To Do:-
1.Shopping cart assertions needs to be improved,
2.Add cloud based testing (Saucelabs) capabailities to Browser Selection, Currently this project supports only Chrome and Firefox
3.ChromeDriver needs to be included in the path.

