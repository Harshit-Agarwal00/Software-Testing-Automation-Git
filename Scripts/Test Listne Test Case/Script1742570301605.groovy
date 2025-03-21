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


WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/TestListner TestSuit/Page_/input_IN 91_email'), 'harshithunny11@gmail.com')

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_/input_Passkey error_a-button-input'))

WebUI.setEncryptedText(findTestObject('Object Repository/TestListner TestSuit/Page_Amazon Sign In/input_Forgot password_password'),
	'hUQCGF8Jx0gIvg3fD636Yg==')

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Online Shopping site in India Shop Onl_10c5f3/a_Amazon Pay'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Amazon Pay/a_Gift Cards'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Buy Again/a_Gift Ideas'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Gifts for Everyone  Amazon.in Gift Finder/input_Search Amazon.in_field-keywords'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Gifts for Everyone  Amazon.in Gift Finder/div_pop 9'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Amazon.in  pop 9/a_in'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Online Shopping site in India Shop Onl_10c5f3/div_Change countryregion_nav-flyout-buffer-top'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Online Shopping site in India Shop Onl_10c5f3/span_'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_, , ,    - Amazon.in/div_HI'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_/div_HI'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_/i_,_a-icon a-icon-radio'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_/input_Cancel_a-button-input'))

WebUI.click(findTestObject('Object Repository/TestListner TestSuit/Page_Change Language Settings/span_2'))



