import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/ks/x6fkqf2x5bv6_zt1yp_rj3kh0000gn/T/Katalon/20191219_125731/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'http://192.168.56.101/\')\n\nWebUI.click(findTestObject(\'Page_Mad Irish Hacking Academy/b_Contact_caret\'))\n\nWebUI.click(findTestObject(\'Page_Mad Irish Hacking Academy/a_Create account\'))\n\nWebUI.setText(findTestObject(\'Page_Mad Irish Hacking Academy/input_Email_email\'), \'somevalue2@email.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Mad Irish Hacking Academy/input_Password_password\'), \'p4y+y39Ir5Oy1MY8jPt0uQ==\')\n\nWebUI.click(findTestObject(\'Page_Mad Irish Hacking Academy/button_Register\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

