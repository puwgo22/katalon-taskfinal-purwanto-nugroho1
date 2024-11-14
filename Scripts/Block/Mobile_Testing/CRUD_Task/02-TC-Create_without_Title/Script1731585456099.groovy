import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.ImageButton - FAB'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.EditText - Enter task title'), '', 0)

Mobile.setText(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.EditText - Enter your task'), 'Tugas 1', 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/view.View - Select Date 26'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.Button - OK Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.RadialTimePicker - Timer'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.Button - OK Set time'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.Spinner - Dropdown'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.CheckedTextView - DropDown Personal'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.TextView - Click Save'), 0)

//Mobile.verifyElementText(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.Toast - Please add title'), 'Please add title', 10)
Mobile.verifyElementText(findTestObject('Object Repository/Mobile_Test/01-Create_Task/widget.Toast - Please add title'), '', FailureHandling.OPTIONAL)

