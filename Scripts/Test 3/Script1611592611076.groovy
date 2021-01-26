import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('lifecharger.org')

WebUI.click(findTestObject('Object Repository/archives'))

WebUI.closeBrowser()

