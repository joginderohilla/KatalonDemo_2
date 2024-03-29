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

WebUI.navigateToUrl('https://beta.consumer.meridianlink.com/login.aspx?enc2=36aNbmudSLCCMdjJoYQn6iT9nG7GRjqBbkIAMYcy9aM')

WebUI.setText(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcLoginMaintxtLogin'), 
    'automation_user1')

WebUI.click(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcLoginMainbtnLogin'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcMFLQuestionsAnswer1'), 
    'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcMFLQuestionsAnswer2'), 
    'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcMFLQuestionsbtnContinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcMFLPasswordPromptPassword'), 
    '8SQVv/p9jVRTNAZyT989/A==')

WebUI.click(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Login/input_ctl00bcMFLPasswordPromptbtnSignIn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_MeridianLink Consumer and Opening Main Page/img'))

WebUI.closeBrowser()

