# FinalProjectItBootcamp
Version: 1.0.0

### FinalProjectItBootcamp is used for testing functionalities:
Target application URL is: https://petstore.octoperf.com/.

Browsers: 

1. Chrome Browser version: 79.0.3945.36,

2. Firefox Browser version: 74.0.


Run test suite: TestNg.xml 

`Total tests run: 16`

## Used libraries:

* TestNG automation testing framework
* Selenium portable framework for testing web applications
* Apache POI library for manipulating various file formats
* JavaDoc is located in doc folder.

## The following website functionalities are tested:

* Enter the store
* Check URL status for all links
* Go to all links and check are we going to the right page
* Sign in 
* Logout
* Testing registration whit Apache poi (Excel tabel, sheet users)
* Select from the dropdown menu
* Checkbox functionality
* Adding all items in the Cart (Excel tabel, sheet cart_items)
* Check are all items added to cart
* Delete all cookies
* Check are cart is empty
* Using soft assert

## This project contains 3 packages:
1. Pages
2. Tests
3. Utilis
* *All packages are in the `src` folder.*

## Package Pages contains 6 classes:
 1. CartPage
 2. HomePage
 3. PetStoreMenuPage
 4. RegistrationPage
 5. SignInPage
 6. StoreItemPage

## Package Tests contains 5 classes:
1. CartTest
2. HomePageTest
3. PetStoreMenuPageTest
4. RegistrationPageTest
5. SignInPageTest

## Package Utilis contains 1 class:
_ExcelUtils_

## Folder data contains 1 xlsx file
_pet-store-data.xlsx_

## Folder Config contains
_selectors.properties_
