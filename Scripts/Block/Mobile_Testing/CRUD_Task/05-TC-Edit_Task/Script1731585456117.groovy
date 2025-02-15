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

Mobile.tap(findTestObject('Mobile_Test/02-Edit_Task/widget.TextView - Check Katalon Mobile'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/02-Edit_Task/widget.ImageButton - Three-Dots'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/02-Edit_Task/widget.TextView - Click Edit'), 0)

Mobile.setText(findTestObject('Mobile_Test/02-Edit_Task/widget.EditText - Enter new task tittle'), 'Selenium Project', 0)

Mobile.setText(findTestObject('Mobile_Test/02-Edit_Task/widget.EditText - Enter new your task'), 'Final Project', 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.Spinner - Dropdown'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/02-Edit_Task/widget.CheckedTextView - Dorpdown Business'), 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.TextView - Click Save'), 0)

