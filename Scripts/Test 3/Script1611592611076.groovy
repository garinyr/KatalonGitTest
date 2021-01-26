import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('lifecharger.org')

WebUI.click(findTestObject('null'))

WebUI.delay(5)

WebUI.closeBrowser()

