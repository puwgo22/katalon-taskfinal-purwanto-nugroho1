Project Final Task for Automated Testing with Katalon Studio in TAK 2024 Batch 8

# **Objective**
This application focuses on how the API testing, Web Testing, and Mobile Testing.

# App Usage Guide
## **Requirements that must be inserted before running this application are:**
* Using Groovy language based on Katalon Studio ``` version 9.7.2```
* API Testing is done on the End-Point API provided by [restful-booker.herokuapp](restful-booker.herokuapp.com)
* Web Testing is done on provided by [juice-shop.herokuapp](https://juice-shop.herokuapp.com/)
* Mobile Testing is done on provided by [TODO v.2 APK](https://drive.google.com/file/d/1WHFqVgFFSwsyauU4MaXMcN2fupcDT9lY/view)
* Testing was carried out with the Google Chrome Website Browser ```Version 130.0.6723.91``` (Official Build)

## **Summary of API Testing Results**
In the implementation of testing, testing was carried out on 6 Test Cases with the results:
```
6 Passed
0 Failed
0 Not Executed
```
So the test result is 100% Passed

## **Report API TESTING**
In testing, if you have to test one test case at a time, it will take a long time, so a Test Suite is made, so that you can run several test cases simultaneously, namely:
```
TS - Activity_Booking
TS - CreateToken_Failed
```
which consists of 6 test cases, namely
```
TC - Create_BookingID
TC - Get_BookingID
TC - Update_BookingID
TC - Delete_BookingID
TC - Create_BookingID_Pass_Failed
TC - Create_BookingID_User_Failed
```

## **Summary of WEB TESTING Results**
In testing, if you have to test one test case at a time, it will take a long time, so a Test Suite is made, so that you can run several test cases simultaneously, namely:
```
TS - E2E_Testing
TS - Login
TS - Registration
```
which consists of 6 test cases, namely
```
Negative
TC - Regist_Failed_without_Email
TC - Login_Failed_Email_not_Valid
TC - Login_Failed_Password_not_Valid
```
```
Positive
TC - Registration_Succes
TC - Login_Succes_with_Google
TC - Login_Succes
```

## **Summary of MOBILE TESTING Results**
In testing, if you have to test one test case at a time, it will take a long time, so a Test Suite is made, so that you can run several test cases simultaneously, namely:
```
TS - Negative_Testing
TS - E2E-Testing
TS - Positive_Testing
```
which consists of 12 test cases, namely
```
Negative
TC - Failed_to_Create_without_Title_TODOO
TC - Failed_to_Create_without_Task_TODOO
```
```
Positive
TC - Create_Task-TODOO
TC - Add_New_Task_with_Add_Category_TODOO
TC - Edit_Task_ODOO
TC - Copy_Task_TODOO
TC - Share_Task_TODOO
TC - Delete_Task_TODOO
TC - Add_Category_TODOO
TC - Update_Category-TODOO
TC - Delete_Category_TODOO
TC - E2E_Testing
```


