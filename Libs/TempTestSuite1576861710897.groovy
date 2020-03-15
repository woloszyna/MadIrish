import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Page_Mad Irish Hacking Academy/E2E Page_Mad Irish Hacking Academy')

suiteProperties.put('name', 'E2E Page_Mad Irish Hacking Academy')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/albert.woloszyn/Katalon Studio/showCaseDEASP/Reports/20191220_170812/Page_Mad Irish Hacking Academy/E2E Page_Mad Irish Hacking Academy/20191220_170812/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Page_Mad Irish Hacking Academy/E2E Page_Mad Irish Hacking Academy', suiteProperties, new File("/Users/albert.woloszyn/Katalon Studio/showCaseDEASP/Reports/20191220_170812/Page_Mad Irish Hacking Academy/E2E Page_Mad Irish Hacking Academy/20191220_170812/testCaseBinding"))