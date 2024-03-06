package AnalysisTools.ThreeDVizSNP.StepsImplementations;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;

import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializers.PageInitializer;

public class ThreeDVizSNPStepImp extends PageInitializer {

	public void uploadExampleVCFFile() {
		String path = System.getProperty("user.dir") + "/src/test/resources/example.vcf";
		CommonUtils.sendKeys(ThreeDVizSNPPage.vcfFileUpload, path);
	}

	public void dismissPopUpAlert() {
		int counter = 0;
		while (!isAlertPresent()) {
			counter++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (counter > 90) {
				break;
			}
		}
		CommonUtils.dismissAlert();

	}

	public boolean isAlertPresent() {
		try {
			webDriver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	public void verifyNumberOfPagesDisplayed() {
		String numberOfPages =CommonUtils.getText(ThreeDVizSNPPage.numberOfPages);
		Assert.assertTrue(numberOfPages.contains("0"));
	}

}
