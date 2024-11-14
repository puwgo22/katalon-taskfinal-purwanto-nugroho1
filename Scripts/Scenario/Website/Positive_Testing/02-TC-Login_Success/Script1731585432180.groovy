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

WebUI.callTestCase(findTestCase('Scenario/Website/01-TC-Open_Web'), [('baeURL') : GlobalVariable.baseURLjuice], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Block/Web_Testing/01-TC-Registration'), [('username') : GlobalVariable.email_web, ('password') : GlobalVariable.password_web
        , ('mothermaidenname') : GlobalVariable.answer, ('repeat_pass') : GlobalVariable.repeat_passweb, ('sequrity_pass') : GlobalVariable.sequrity_question], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Block/Web_Testing/03-TC-Login'), [('username') : GlobalVariable.email_web, ('password') : GlobalVariable.password_web], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Scenario/Website/02-TC-Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

