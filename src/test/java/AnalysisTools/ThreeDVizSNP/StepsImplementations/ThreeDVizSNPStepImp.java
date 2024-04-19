package AnalysisTools.ThreeDVizSNP.StepsImplementations;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;

public class ThreeDVizSNPStepImp extends PageInitializer {

	/** Upload example VCF File **/
	public void uploadExampleVCFFile() {
		String path = System.getProperty("user.dir") + "/src/test/java/AnalysisTools/ThreeDVizSNP/Utils/example.vcf";
		CommonUtils.sendKeys(threeDVizSNPPage.vcfFileUpload, path);
	}

	/** Upload Invalid VCF File **/
	public void uploadInvalidVCFFIle() {
		String path = System.getProperty("user.dir") + "/src/test/java/AnalysisTools/ThreeDVizSNP/Utils/invalid.vcf";
		CommonUtils.sendKeys(threeDVizSNPPage.vcfFileUpload, path);
	}

	/** Upload example VCF File after clicking vizulize button and then submit **/
	public void uploadVcfFile() {
		threeDVizSNPPage.visulizeButton.click();
		uploadExampleVCFFile();
		threeDVizSNPPage.submitButton.click();
	}

	/** vizulize Button and about button click **/
	public void visukizeButtionAndAboutButtonClick() {
		threeDVizSNPPage.visulizeButton.click();
		threeDVizSNPPage.aboutButton.click();
	}

	/** Dismiss PopUp Alert **/
	public void dismissPopUpAlert() {
		int counter = 0;
		while (!isAlertPresent()) {
			counter++;
			MiscUtils.sleep(2000);
			if (counter > 90) {
				break;
			}
		}
		CommonUtils.dismissAlert();
	}

	/** Verify if alert is present **/
	public boolean isAlertPresent() {
		try {
			webDriver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	/** verify no. of pages displayed **/
	public void verifyNumberOfPagesDisplayed() {
		String numberOfPages = CommonUtils.getText(threeDVizSNPPage.numberOfPages);
		Assert.assertTrue(numberOfPages.contains("0"));
	}

	/** Long running Job Submit operation **/
	public void longRunningJobSubmit() {
		threeDVizSNPPage.longRunningJobCheckBox.click();
		threeDVizSNPPage.emailId.sendKeys("satya.gugulothu@nih.gov");
		threeDVizSNPPage.jobName.sendKeys("12345");
	}

	/** Validate error message */
	public void validateErrorMessage() {
		String text = threeDVizSNPPage.errorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase(
				"The Gene symbols searched for are not found in the attached file, please change the search criteria of the gene symbols and resubmit the analysis."));
	}

	/** Error message validation on invalid upload **/
	public void validateErrorMessageForInvalidVcf() {
		String text = threeDVizSNPPage.invalidJobErrorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase("Visualization Job Failed"));
	}

	/** Verify Email notifications are sent **/
	public void verifyEmailNotificationSent() {
		String text = threeDVizSNPPage.emailNotificationCnfirmation.getText();
		Assert.assertTrue(text.trim().equals("You will receive an email once processing is complete."));
	}

	/** download files for svg png and json **/
	public void DownloadFilesForSvgPngAndJson() {
		threeDVizSNPPage.svgButton.click();
		threeDVizSNPPage.pngButton.click();
		threeDVizSNPPage.jsonButton.click();
	}

	/** mini window interaction **/
	public void miniWindowInteraction() {
		threeDVizSNPPage.svgButton.click();
		threeDVizSNPPage.summaryButton.click();
	}

	/** feedback option **/
	public void feedbackOption() {
		MiscUtils.sleep(5000);
		CommonUtils.switchToFrame(threeDVizSNPPage.ifrmaeFeedback);
		CommonUtils.waitForThePresenceOfEl(threeDVizSNPPage.feedbackLocator, Duration.ofSeconds(30));
		JavascriptUtils.clickByJS(threeDVizSNPPage.feedback);
	}
}
