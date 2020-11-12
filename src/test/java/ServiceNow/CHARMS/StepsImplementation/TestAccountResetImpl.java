package ServiceNow.CHARMS.StepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializer;

public class TestAccountResetImpl extends PageInitializer {

	public void navigateToCHARMSstudio(String fcsms) {
		for (String childTab : WebDriverUtils.webDriver.getWindowHandles()) {
			WebDriverUtils.webDriver.switchTo().window(childTab);
		}
		charmsNativeViewPage.applicationsSearchBar.sendKeys(fcsms);
	}

	public void navigateToCHARMSreferralsShowList() {
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewStudioIframe);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.charmsReferralsShowList);
		charmsNativeViewPage.charmsReferralsShowList.click();
		MiscUtils.sleep(2000);
	}

	public void searchForTestAccountCHARMSreferralsShowList(String testAccountEmail) {
		CommonUtils.selectDropDownValue(charmsNativeViewPage.charmsReferralsShowListSearchDropDown,
				"Contact Email Address");
		charmsNativeViewPage.charmsReferralsShowListSearchTextBox.sendKeys(testAccountEmail);
		charmsNativeViewPage.charmsReferralsShowListSearchTextBox.sendKeys(Keys.RETURN);
		MiscUtils.sleep(2000);
	}

	public void deleteAccountFromCHARMSreferralsShowList() {
		charmsNativeViewPage.charmsReferralsShowListTestAccountCheckBox.click();
		CommonUtils.selectDropDownValue(charmsNativeViewPage.charmsReferralsShowListDeleteDropDown, "Delete");
		MiscUtils.sleep(2000);
		charmsNativeViewPage.charmsReferralsPopUpDeleteButton.click();
		MiscUtils.sleep(2000);
	}

	public void navigateToFamilyMemberDetails() {
		WebDriverUtils.webDriver.switchTo().defaultContent();
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(charmsNativeViewPage.familyMemberDetailsLink);
		//charmsNativeViewPage.familyMemberDetailsLink.click();
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewFamilyMemberDetailsIframe);
		MiscUtils.sleep(2000);
	}

	public void navigateToFamilyMemberDetailsShowList() {
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.familyMemberDetailsShowListLink);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.familyMemberDetailsShowListLink.click();
		MiscUtils.sleep(2000);
	}

	public void searchTestAccountNameFamilyMemberDetails(String accountName) {
		CommonUtils.selectDropDownValue(charmsNativeViewPage.familyMemberDetailsShowListSearchDropDown, "Name");
		charmsNativeViewPage.familyMemberDetailsShowListSearchTextBox.sendKeys(accountName);
		charmsNativeViewPage.familyMemberDetailsShowListSearchTextBox.sendKeys(Keys.RETURN);
		MiscUtils.sleep(2000);
	}

	public void deleteAccountFromFamilyMemberDetails() {
		charmsNativeViewPage.familyMemberDetailsShowListCheckBox.click();
		CommonUtils.selectDropDownValue(charmsNativeViewPage.familyMemberDetailsShowListDeleteDropDown, "Delete");
		MiscUtils.sleep(2000);
		charmsNativeViewPage.familyMemberDetailsShowListPopUpDeleteButton.click();
		MiscUtils.sleep(2000);
	}

	public void navigateToFCSMSformAccess() {
		WebDriverUtils.webDriver.switchTo().defaultContent();
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(charmsNativeViewPage.fcsmsFormAccess);
		//charmsNativeViewPage.fcsmsFormAccess.click();
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewFCSMSformAccessIframe);
		MiscUtils.sleep(3000);
	}

	public void deleteAccountFromFCSMSformAccess() {
		charmsNativeViewPage.fcsmsFormAccessShowListSearchBox.click();
		charmsNativeViewPage.fcsmsFormAccessShowListSearchBox.sendKeys("diegojuarezbusiness@gmail.com");
		charmsNativeViewPage.fcsmsFormAccessShowListSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.fcsmsFormAccessShowListAccountCheckBox.click();
		CommonUtils.selectDropDownValue(charmsNativeViewPage.fcsmsFormAccessShowListDeleteDropDown, "Delete");
		charmsNativeViewPage.fcsmsFormAccessShowListDeleteButton.click();
		MiscUtils.sleep(2000);
	}

}
