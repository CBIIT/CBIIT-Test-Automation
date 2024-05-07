package AnalysisTools.ThreeDVizSNP.StepsImplementations;

import java.time.Duration;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import AnalysisTools.ThreeDVizSNP.Utils.ThreeDVizSNP_Constants;
import appsCommon.PageInitializers.PageInitializer;

public class ThreeDVizSNPStepImp extends PageInitializer {

	/** Upload example VCF File **/
	public static void verifyFileUploadText() {
		CommonUtils.assertTrueTestNG(threeDVizSNPPage.allUploadFields.size() == 1,"asserts that there is only one upload field");
		CommonUtils.assertEqualsWithMessage(threeDVizSNPPage.actualVcfText.getText(),ThreeDVizSNP_Constants.EXPECTED_VCF_TEXT,"asserted the vcf actual text");
	}
	/** Upload example VCF File **/
	public static void uploadExampleVCFFile() {
		CommonUtils.sendKeys(threeDVizSNPPage.vcfFileUpload, ThreeDVizSNP_Constants.VALID_FILE_PATH);
	}

	/** Upload Invalid VCF File **/
	public static void uploadInvalidVCFFIle() {
		CommonUtils.sendKeys(threeDVizSNPPage.vcfFileUpload, ThreeDVizSNP_Constants.INVALID_FILE_PATH);
	}

	/** Upload example VCF File after clicking visualize button and then submit **/
	public static void uploadVcfFile() {
		threeDVizSNPPage.visulizeButton.click();
		uploadExampleVCFFile();
		threeDVizSNPPage.submitButton.click();
	}

	/** Visualize Button and about button click **/
	public static void visukizeButtionAndAboutButtonClick() {
		threeDVizSNPPage.visulizeButton.click();
		threeDVizSNPPage.aboutButton.click();
	}

	/** DISMISS POPUP ALERT AFTER WAIT **/
	public static void dismissPopUpAlert() {
		Assert.assertTrue(waitForAlertForSpecificPeriod(180),"Alert window is not present even after the wait period");
		CommonUtils.dismissAlert();
	}
	
	/** METHOD TO WAIT FOR ALERT FOR A GIVEN TIME PERIOD **/
	public static boolean waitForAlertForSpecificPeriod(int maxTimeoutInSeconds){
		for(int waitPeriod = 0;!isAlertPresent();waitPeriod++){
			if (waitPeriod >maxTimeoutInSeconds){
				return false;
			}
			MiscUtils.sleep(1000);
		}
		return true;
	}

	/** Verify if alert is present **/
	public static  boolean isAlertPresent() {
		try {
			webDriver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	/** verify no. of pages displayed **/
	public static void verifyNumberOfPagesDisplayed() {
		String numberOfPages = CommonUtils.getText(threeDVizSNPPage.numberOfPages);
		Assert.assertTrue(numberOfPages.contains("0"));
	}

	/** Long running Job Submit operation **/
	public static void longRunningJobSubmit() {
		threeDVizSNPPage.longRunningJobCheckBox.click();
		threeDVizSNPPage.emailId.sendKeys("satya.gugulothu@nih.gov");
		threeDVizSNPPage.jobName.sendKeys("12345");
	}

	/** Validate error message */
	public static void validateErrorMessage() {
		String text = threeDVizSNPPage.errorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase(
				"The Gene symbols searched for are not found in the attached file, please change the search criteria of the gene symbols and resubmit the analysis."));
	}

	/** Error message validation on invalid upload **/
	public static void validateErrorMessageForInvalidVcf() {
		String text = threeDVizSNPPage.invalidJobErrorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase("Visualization Job Failed"));
	}

	/** Verify Email notifications are sent **/
	public static void verifyEmailNotificationSent() {
		String text = threeDVizSNPPage.emailNotificationCnfirmation.getText();
		Assert.assertTrue(text.trim().equals("You will receive an email once processing is complete."));
	}

	/** download files for svg png and json **/
	public static void DownloadFilesForSvgPngAndJson() {
		threeDVizSNPPage.svgButton.click();
		threeDVizSNPPage.pngButton.click();
		threeDVizSNPPage.jsonButton.click();
	}

	/** mini window interaction **/
	public static void miniWindowInteraction() {
		threeDVizSNPPage.svgButton.click();
		threeDVizSNPPage.summaryButton.click();
	}

	/** feedback option **/
	public static void feedbackOption() {
		MiscUtils.sleep(5000);
		CommonUtils.switchToFrame(threeDVizSNPPage.ifrmaeFeedback);
		CommonUtils.waitForThePresenceOfEl(threeDVizSNPPage.feedbackLocator, Duration.ofSeconds(30));
		JavascriptUtils.clickByJS(threeDVizSNPPage.feedback);
	}
}
