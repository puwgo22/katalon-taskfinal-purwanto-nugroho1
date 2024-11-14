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

WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/text_Account'), 'Account')

WebUI.click(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/button_account'))

WebUI.click(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/button_login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/h1_Login'))

WebUI.click(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/button_Not_yet_a_customer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/h1_User Registration'))

'Input Email'
WebUI.setText(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/input_email'), email)

'Input Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/input_repeat_password'), password)

'Input Repeat Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/input_password'), repeat_pass)

'Toggle Show Password Advice'
WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/slide-toggle-bar_advice_pass'))

//if (toggle == true) {
//    WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/slide-toggle-bar_advice_pass'))
//}

'Verify Toggle Show Password Advice'
WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/slide-toggle-bar_advice_pass'), FailureHandling.STOP_ON_FAILURE)
//'Verify Toggle Show Password Advice'
//if (toggle == true) {
//    WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/slide-toggle-bar_advice_pass'), 'contains at least one digit')
//} else {
//    WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/slide-toggle-bar_advice_pass'), 'Show password advice')
//}

WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/icondone_contains at least one lower character'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/icondone-contains at least one upper character'))

WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/icondone-contains at least one digit'))

WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/icondone-contains at least one special character'))

WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/icondone-contains at least 8 characters'))

WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/drop_security_pass_advice'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/select_your_eldest_siblings_middle_name'), FailureHandling.STOP_ON_FAILURE)
'Select Security Question'
def select_dropdown = sequrity_question_pass

switch (select_dropdown) {
    case select_dropdown = 'Your eldest siblings middle name?':
        println(select_dropdown)

        WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/select_your_eldest_siblings_middle_name'))

        break
    case select_dropdown = 'Your favorite movie?':
        println(select_dropdown)

        WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/select_your_favorite_movie'))

        break
    case select_dropdown = 'Name of your favorite pet?':
        println(select_dropdown)

        WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/select_name_of_your_favorite_pet'))

        break
    case select_dropdown = 'Your favorite book?':
        println(select_dropdown)

        WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/select_your_favorite_book'))

        break
    default:
        println(select_dropdown)

        WebUI.click(findTestObject('Web_Testing/01-Registrasi_Web/select_company_you_first_work_for_as_an_adult'))

        break
}

//WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/select_your_eldest_siblings_middle_name'), sequrity_question_pass)
'Verify Security Question'
switch (select_dropdown) {
    case select_dropdown = 'Your eldest siblings middle name?':
        println(select_dropdown)

        WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/select_your_eldest_siblings_middle_name'), 
            'Your eldest siblings middle name?')

        break
    case select_dropdown = 'Your favorite movie?':
        println(select_dropdown)

        WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/select_your_favorite_movie'), 'Your favorite movie?')

        break
    case select_dropdown = 'Name of your favorite pet?':
        println(select_dropdown)

        WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/select_name_of_your_favorite_pet'), 'Name of your favorite pet?')

        break
    case select_dropdown = 'Your favorite book?':
        println(select_dropdown)

        WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/select_your_favorite_book'), 'Your favorite book?')

        break
    default:
        println(select_dropdown)

        WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/select_company_you_first_work_for_as_an_adult'), 
            'Company you first work for as an adult?')

        break
}

WebUI.setText(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/input_answerquestion'), answer_question)

WebUI.click(findTestObject('Object Repository/Web_Testing/01-Registrasi_Web/button_add_register'))

WebUI.verifyElementText(findTestObject('Web_Testing/01-Registrasi_Web/toastmessage_Registration completed successfully. You can now log in'), 
    'Registration completed successfully. You can now log in.', FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Web_Testing/01-Registrasi_Web/h1_Login'))

