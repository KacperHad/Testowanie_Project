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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://allegro.pl/rejestracja?origin_url=%2F')

WebUI.click(findTestObject('Object Repository/PageRegistration/Page_Allegro.pl - Wicej ni aukcje. Najlepsz_7d011b/button_Ok, zgadzam si'))

WebUI.setText(findTestObject('Object Repository/PageRegistration/Page_Allegro.pl - Wicej ni aukcje. Najlepsz_7d011b/input_Konto dla klientw biznesowych._email'), 
    'admin@wp.pl')

WebUI.setEncryptedText(findTestObject('Object Repository/PageRegistration/Page_Allegro.pl - Wicej ni aukcje. Najlepsz_7d011b/input_E-mail_password'), 
    'IB5ftfpDHiB2b9tArRL3kw==')

WebUI.click(findTestObject('Object Repository/PageRegistration/Page_Allegro.pl - Wicej ni aukcje. Najlepsz_7d011b/label_Mam 18 lat i wicej'))

WebUI.click(findTestObject('Object Repository/PageRegistration/Page_Allegro.pl - Wicej ni aukcje. Najlepsz_7d011b/label_Owiadczam, e znam i akceptuj postanow_42526a'))

WebUI.click(findTestObject('Object Repository/PageRegistration/Page_Allegro.pl - Wicej ni aukcje. Najlepsz_7d011b/button_Utwrz konto'))

