package ServiceNow.CICDBuild.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.utils.CucumberLogUtils;
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
		MiscUtils.sleep(4000);
		WebDriverWait wait = new WebDriverWait(WebDriverUtils.webDriver, 60);
		wait.until(ExpectedConditions.visibilityOf(devOpsNativeViewPage.applicationSelectorDropDown));
		devOpsNativeViewPage.applicationSelectorDropDown.click();
		MiscUtils.sleep(6000);
		List<WebElement> values = devOpsNativeViewPage.dropDownApplications;
		MiscUtils.sleep(6000);
		CommonUtils.selectValueFromBootStrapDropDown(values, cicdDevOps);
		MiscUtils.sleep(5000);//was seven seconds	
		JavascriptUtils.clickByJS(devOpsNativeViewPage.showSelectedApplicationButton);
		MiscUtils.sleep(8000);
		//WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='user_info_dropdown']")).click();
		//MiscUtils.sleep(2000);
		//WebDriverUtils.webDriver.findElement(By.xpath("//*[@href='logout.do']")).click();
		CucumberLogUtils.logScreenShot();
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
