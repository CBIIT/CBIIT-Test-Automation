package ServiceNow.CHARMS.StepsImplementation;

import org.openqa.selenium.Keys;
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
		MiscUtils.sleep(2000);
		charmsNativeViewPage.applicationsSearchBar.sendKeys(fcsms);
	}

	public void navigateToCHARMSreferralsShowList() {
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewStudioIframe);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.charmsReferralsShowList);
		MiscUtils.sleep(1000);
		charmsNativeViewPage.charmsReferralsShowList.click();
		MiscUtils.sleep(3000);
	}

	public void searchForTestAccountCHARMSreferralsShowList(String testAccountEmail) {
		CommonUtils.selectDropDownValue("Contact Email Address", charmsNativeViewPage.charmsReferralsShowListSearchDropDown);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.charmsReferralsShowListSearchTextBox.sendKeys(testAccountEmail);
		MiscUtils.sleep(1000);
		charmsNativeViewPage.charmsReferralsShowListSearchTextBox.sendKeys(Keys.RETURN);
		MiscUtils.sleep(3000);
	}

	public void deleteAccountFromCHARMSreferralsShowList() {
		charmsNativeViewPage.charmsReferralsShowListTestAccountCheckBox.click();
		MiscUtils.sleep(3000);
		CommonUtils.selectDropDownValue("Delete", charmsNativeViewPage.charmsReferralsShowListDeleteDropDown);
		//CommonUtils.selectDropDownValue(charmsNativeViewPage.charmsReferralsShowListDeleteDropDown, "Delete");
		MiscUtils.sleep(3000);
		charmsNativeViewPage.charmsReferralsPopUpDeleteButton.click();
		MiscUtils.sleep(3000);
	}

	public void navigateToFamilyMemberDetails() {
		WebDriverUtils.webDriver.switchTo().defaultContent();
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(charmsNativeViewPage.familyMemberDetailsLink);
		//charmsNativeViewPage.familyMemberDetailsLink.click();
		MiscUtils.sleep(3000);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewFamilyMemberDetailsIframe);
		MiscUtils.sleep(2000);
	}

	public void navigateToFamilyMemberDetailsShowList() {
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.familyMemberDetailsShowListLink);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.familyMemberDetailsShowListLink.click();
		MiscUtils.sleep(3000);
	}

	public void searchTestAccountNameFamilyMemberDetails(String accountName) {
		//CommonUtils.selectDropDownValue(charmsNativeViewPage.familyMemberDetailsShowListSearchDropDown, "Name");
		CommonUtils.selectDropDownValue("Name", charmsNativeViewPage.familyMemberDetailsShowListSearchDropDown);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.familyMemberDetailsShowListSearchTextBox.sendKeys(accountName);
		MiscUtils.sleep(1000);
		charmsNativeViewPage.familyMemberDetailsShowListSearchTextBox.sendKeys(Keys.RETURN);
		MiscUtils.sleep(3000);
	}

	public void deleteAccountFromFamilyMemberDetails() {
		charmsNativeViewPage.familyMemberDetailsShowListCheckBox.click();
		MiscUtils.sleep(3000);
		//CommonUtils.selectDropDownValue(charmsNativeViewPage.familyMemberDetailsShowListDeleteDropDown, "Delete");
		CommonUtils.selectDropDownValue("Delete", charmsNativeViewPage.familyMemberDetailsShowListDeleteDropDown);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.familyMemberDetailsShowListPopUpDeleteButton.click();
		MiscUtils.sleep(3000);
	}

	public void navigateToFCSMSformAccess() {
		WebDriverUtils.webDriver.switchTo().defaultContent();
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(charmsNativeViewPage.fcsmsFormAccess);
		//charmsNativeViewPage.fcsmsFormAccess.click();
		MiscUtils.sleep(3000);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewFCSMSformAccessIframe);
		MiscUtils.sleep(3000);
	}

	public void deleteAccountFromFCSMSformAccess() {
		charmsNativeViewPage.fcsmsFormAccessShowListSearchBox.click();
		MiscUtils.sleep(3000);
		charmsNativeViewPage.fcsmsFormAccessShowListSearchBox.sendKeys("diegojuarezbusiness@gmail.com");
		MiscUtils.sleep(1000);
		charmsNativeViewPage.fcsmsFormAccessShowListSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(3000);
		charmsNativeViewPage.fcsmsFormAccessShowListAccountCheckBox.click();
		MiscUtils.sleep(3000);
		//CommonUtils.selectDropDownValue(charmsNativeViewPage.fcsmsFormAccessShowListDeleteDropDown, "Delete");
		CommonUtils.selectDropDownValue("Delete", charmsNativeViewPage.fcsmsFormAccessShowListDeleteDropDown);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.fcsmsFormAccessShowListDeleteButton.click();
		MiscUtils.sleep(3000);
	}
}
