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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Verification of the element'
WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Mad Irish Hacking Academy'), 
    5)

'Verification of the element'
WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_About'), 5)

'Verification of the element'
WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Contact'), 5)

'Verification of the element'
WebUI.click(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/b_Contact_caret'), FailureHandling.STOP_ON_FAILURE)

'Verification of the element'
WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Training'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Reading'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Newsletter'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Create account'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/input_Create account_username'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/input_Create account_password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/button_Sign in'), 0)

