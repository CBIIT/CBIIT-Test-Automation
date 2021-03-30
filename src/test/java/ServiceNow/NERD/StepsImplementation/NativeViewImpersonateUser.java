package ServiceNow.NERD.StepsImplementation;

import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class NativeViewImpersonateUser extends PageInitializer {

	
	public void impersonateToCRSReviewer() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Grace Liou");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}
	
	
	public void impersonateToDocPlanningContact() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}
	
	public void impersonateToStaffMemmber() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(2000);
		nativeViewDashPage.enterTextImpersntSearchBox("Diego Juarez");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}
	
}
