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
/*
 * Uruchomienie przeglądarki.
 */
WebUI.openBrowser('')
/*
 *  Przejscie na podany adres url.
 */
WebUI.navigateToUrl('https://allegro.pl/rejestracja?origin_url=%2F')
/*
 *  Zaakceptowanie Cookie Notice.
 */
WebUI.click(findTestObject('btn_AcceptCookieNotice'))
/*
 *  Wpisanie wartosci ze zmiennej varEmail dla pola Email. 
 */
WebUI.sendKeys(findTestObject('input_email'), varEmail)
/*
 *  Wpisanie wartosci ze zmiennej varPassword dla pola Haslo.
 */
WebUI.sendKeys(findTestObject('input_passwd'), varPassword)
/*
 * Oznaczenie wartosci wieku, w tym przypadku klikamy "Mam ponad 18 lat".
 */
WebUI.click(findTestObject('btn_Over18YearsOld'))
/*
 *  Akceptacja regulaminu serwisu.
 */
WebUI.click(findTestObject('checkbox_AcceptAgreementTerm'))
/*
 *  Kliknięcie na przycisk "Utwórz konto".
 */
WebUI.click(findTestObject('btn_CreateAccount'))
/*
 *  Sprawdzenie czy pokazała się wiadomosc o nieprawidłowym formacie w polu Email.
 */
WebUI.verifyElementVisible(findTestObject('msg_InvalidEmail'))
/*
 *  Zamknięcie przeglądarki.
 */
WebUI.closeBrowser()

