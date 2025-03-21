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

WebUI.click(findTestObject('Object Repository/Order Test/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Order Test/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'Harshithunny11@gmail.com')

WebUI.click(findTestObject('Object Repository/Order Test/Page_Amazon Sign In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setEncryptedText(findTestObject('Object Repository/Order Test/Page_Amazon Sign In/input_Forgot password_password'), 
    'hUQCGF8Jx0gIvg3fD636Yg==')

WebUI.click(findTestObject('Object Repository/Order Test/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Order Test/Page_Online Shopping site in India Shop Onl_10c5f3/img'))

WebUI.click(findTestObject('Object Repository/Order Test/Page_iQOO Z9 Lite 5G (Mocha Brown, 6GB RAM,_4840bc/input_There was a problem retrieving the co_d71a61'))

WebUI.click(findTestObject('Object Repository/Order Test/Page_Amazon.in Shopping Cart/input_This order contains a gift_proceedToR_057b5e'))

WebUI.closeBrowser()

