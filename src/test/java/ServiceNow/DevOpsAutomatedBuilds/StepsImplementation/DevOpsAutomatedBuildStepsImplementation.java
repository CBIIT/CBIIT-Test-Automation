package ServiceNow.DevOpsAutomatedBuilds.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class DevOpsAutomatedBuildStepsImplementation extends PageInitializer {

	public void devOpsSandboxNativeViewLogin(String username, String password) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ServiceNowAutomatedDevOpsBuild"));
		CommonUtils.sendKeys(devOpsLoginPage.userNameTextBox, ConfUtils.getProperty(username));
		CommonUtils.sendKeys(devOpsLoginPage.passwordTxtBox, ConfUtils.getProperty(password));
		JavascriptUtils.clickByJS(devOpsLoginPage.logInButton);
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(devOpsLoginPage.nativeViewLink);
	}

	public void selectingCICDDevOpsApplication(String cicdDevOps) {
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(devOpsNativeViewPage.applicationSelectorDropDown, cicdDevOps);
		JavascriptUtils.clickByJS(devOpsNativeViewPage.showSelectedApplicationButton);
	}

	public void selectingApplicationAsDeploymentType(String application) {
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(devOpsNativeViewPage.nativeViewSandboxIframe);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(devOpsNativeViewPage.buildThisApplicationButton);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(devOpsNativeViewPage.selectDeploymentDropDown, application);
		MiscUtils.sleep(2000);
	}

	public void clickBuildButton() {
		JavascriptUtils.clickByJS(devOpsNativeViewPage.buildButton);
		MiscUtils.sleep(3000);
	}

	public void selectingUpdateSetAsDeploymentType(String updateSet) {
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(devOpsNativeViewPage.nativeViewSandboxIframe);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(devOpsNativeViewPage.buildThisApplicationButton);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(devOpsNativeViewPage.selectDeploymentDropDown, updateSet);
	}

	public void selectingPendingCodeReviewSetsAndMovingToRightTable() {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(devOpsNativeViewPage.moveRightButton);
		List<WebElement> sets = devOpsNativeViewPage.listOfSetsPendingCodeReview;
		for (WebElement retrievedSets : sets) {
			retrievedSets.click();
			devOpsNativeViewPage.moveRightButton.click();
		}
	}
	public void selectingCICDDevOpsInProgressSetsAndMovingToRightTable() {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(devOpsNativeViewPage.moveRightButton);
		List<WebElement> sets = devOpsNativeViewPage.listOfCICDDevOpsInProgress;
		for (WebElement retrievedSets : sets) {
			retrievedSets.click();
			devOpsNativeViewPage.moveRightButton.click();
		}
		
	}

}
