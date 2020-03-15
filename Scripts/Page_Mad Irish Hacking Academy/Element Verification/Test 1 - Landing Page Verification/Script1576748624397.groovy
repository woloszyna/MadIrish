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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://192.168.56.101/')

WebUI.click(findTestObject('Page_Mad Irish Hacking Academy/Top Bar on every page/a_Mad Irish Hacking Academy'))

WebUI.callTestCase(findTestCase('Page_Mad Irish Hacking Academy/Utilities and Prechecks/Initial Checks on every page'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/a_Learn more'), 
    0, FailureHandling.STOP_ON_FAILURE)

/*WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/a_Learn more'), 
    0, FailureHandling.STOP_ON_FAILURE)*/
WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/h2_Live Training'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/p_Browse our catalog of upcoming courses an_5f7925'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/a_View details_Live_Training'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/h2_Reading Room'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/p_Look through our extensive collection of _48c044'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/a_View details_Reading_Room'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/h2_Newsletter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Mad Irish Hacking Academy/Page_Mad Irish Hacking Academy Landing Page/a_View details_Newsletter'), 
    0)

WebUI.callTestCase(findTestCase('Page_Mad Irish Hacking Academy/Utilities and Prechecks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

