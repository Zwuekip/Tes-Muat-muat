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

WebUI.callTestCase(findTestCase('MuatMuatLogin/Transporter/masuk_subs'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('transporter/button_tambah_langganan_trasporter'))

WebUI.click(findTestObject('transporter/button_BF_trans_1_bulan'))

WebUI.click(findTestObject('transporter/button_metode_pembayaran'))

WebUI.click(findTestObject('transporter/button_bayar_BCA'))

WebUI.click(findTestObject('transporter/button_buat_pesanan'))

WebUI.verifyElementText(findTestObject('transporter/check_syaratdanketentuan'), 'Syarat dan Ketentuan Menjadi Pengguna Big Fleets')

WebUI.click(findTestObject('transporter/button_syarat1'))

WebUI.click(findTestObject('transporter/button_syarat2'))

WebUI.click(findTestObject('transporter/button_syarat3'))

WebUI.click(findTestObject('transporter/button_syarat4'))

WebUI.click(findTestObject('transporter/button_lanjutkan_syarat'))

'Jika sudah sampai ini, user sudah berlangganan dan tidak bisa menambahkan paket langganan lagi\r\n='
WebUI.click(findTestObject('transporter/button_ok_bayar'))

