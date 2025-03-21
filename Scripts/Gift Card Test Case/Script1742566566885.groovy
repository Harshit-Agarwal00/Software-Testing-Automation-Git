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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Gift Card/Page_/input_IN 91_email'), 'Harshithunny11@gmail.com')

WebUI.click(findTestObject('Object Repository/Gift Card/Page_/input_Passkey error_a-button-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/Gift Card/Page_Amazon Sign In/input_Forgot password_password'), 
    'hUQCGF8Jx0gIvg3fD636Yg==')

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Online Shopping site in India Shop Onl_10c5f3/span_Your Account'))

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Your Account/h2_Amazon Pay balance'))

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Add Money to Wallet/button_options-container-063-40f-8d8'))

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Amazon Pay Gift Card/label_Enter gift card code-ard-90d-211'))

WebUI.click(findTestObject('Object Repository/Gift Card/Page_Amazon Pay Gift Card/button_tux-button primary large fullwidth-ard-d0b-98f'))

WebUI.doubleClick(findTestObject('Object Repository/Gift Card/Page_Amazon Pay Gift Card/p_You seem to have entered an invalid Gift _d69ccd'))

WebUI.closeBrowser()


