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

WebUI.openBrowser('http://192.168.56.101/')

WebUI.click(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/b_Contact_caret'))

WebUI.click(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Create account'))

WebUI.callTestCase(findTestCase('Page_Mad Irish Hacking Academy/Utilities and Prechecks/Initial Checks on every page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Create Account Page/p_Header'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Create Account Page/Email field'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Create Account Page/Password field'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Create Account Page/Register button'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Create Account Page/Forgot your password link'), 
    0)

WebUI.callTestCase(findTestCase('Page_Mad Irish Hacking Academy/Utilities and Prechecks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

