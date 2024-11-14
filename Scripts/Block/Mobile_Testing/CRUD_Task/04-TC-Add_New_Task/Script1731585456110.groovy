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

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.ImageButton - FAB'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.TextView - Add Task'), 
    0)

Mobile.setText(findTestObject('Mobile_Test/01-Create_Task/widget.EditText - Enter task title'), 'Tugas Selenium', 0)

Mobile.setText(findTestObject('Mobile_Test/01-Create_Task/widget.EditText - Enter your task'), 'task 1', 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Mobile_Test/03-Add_Task_with_Add_Category/view.View - Select Date 30'), 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.Button - OK Set Date'), 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.ImageButton - Keyboard'), 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.EditText - Hours'), '08', 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.EditText - Minute'), '45', 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.Spinner - AM PM Dropdown'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.CheckedTextView - Click PM'), 
    0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.Button - OK Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.ImageView - Tree Button'), 
    0)

Mobile.setText(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.EditText - Enter category'), 
    'Sekolah', 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.Button - Add Category'), 0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.Spinner - Dropdown'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.CheckedTextView - Dropdown Sekolah'), 
    0)

Mobile.tap(findTestObject('Mobile_Test/01-Create_Task/widget.TextView - Click Save'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Mobile_Test/03-Add_Task_with_Add_Category/widget.TextView - Verif Tugas Selenium'), 
    'Tugas Selenium')

