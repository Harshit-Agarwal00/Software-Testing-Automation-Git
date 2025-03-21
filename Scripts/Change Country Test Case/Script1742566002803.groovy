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

WebUI.click(findTestObject('Object Repository/Change Country/Page_Online Shopping site in India Shop Onl_10c5f3/span_India'))

WebUI.click(findTestObject('Object Repository/Change Country/Page_Go to website/span_India'))

WebUI.click(findTestObject('Object Repository/Change Country/Page_Go to website/a_Australia'))

WebUI.click(findTestObject('Object Repository/Change Country/Page_Go to website/input_Cancel_a-button-input'))

WebUI.switchToWindowTitle('Amazon.com.au: Shop online for Electronics, Apparel, Toys, Books, DVDs & more')

WebUI.click(findTestObject('Object Repository/Change Country/Page_Amazon.com.au Shop online for Electron_18857a/div_icp-touch-link-country  display none   _0b8ffc'))

WebUI.closeBrowser()


