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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://energitrans.2stallions.network/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_LOG IN/input_uname'), 'nikhil@2stallions.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOG IN/input_pwd'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Page_LOG IN/input_pwd'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Verification Code/input_otp_code'), '000000')

WebUI.sendKeys(findTestObject('Object Repository/Page_Verification Code/input_otp_code'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Mustafa Application/div_Success'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Mustafa Application/a_Nikhil'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Mustafa Application/a_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_LOG IN/h2_Log In'))

WebUI.closeBrowser()

