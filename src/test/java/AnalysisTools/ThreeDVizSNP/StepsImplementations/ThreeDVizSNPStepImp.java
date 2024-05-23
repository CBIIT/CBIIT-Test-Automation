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

	/**
	 * UPLOAD EXAMPLE VCF FILE
	 */
	public static void verifyFileUploadText() {
		CommonUtils.assertTrueTestNG(threeDVizSNPPage.allUploadFields.size() == 1,"asserts that there is only one upload field");
		CommonUtils.assertEqualsWithMessage(threeDVizSNPPage.actualVcfText.getText(),ThreeDVizSNP_Constants.EXPECTED_VCF_TEXT,"asserted the vcf actual text");
	}
	/**
	 * UPLOAD EXAMPLE VCF FILE
	 */
	public static void uploadExampleVCFFile() {
		CommonUtils.sendKeys(threeDVizSNPPage.vcfFileUpload, ThreeDVizSNP_Constants.VALID_FILE_PATH);
	}

	/**
	 * UPLOAD INVALID VCF FIle
	 */
	public static void uploadInvalidVCFFIle() {
		CommonUtils.sendKeys(threeDVizSNPPage.vcfFileUpload, ThreeDVizSNP_Constants.INVALID_FILE_PATH);
	}

	/**
	 * UPLOAD EXAMPLE VCF FILE AFTER CLICKING VISUALIZE BUTTON AND THEN SUBMIT
	 */
	public static void uploadVcfFile() {
		threeDVizSNPPage.visulizeButton.click();
		uploadExampleVCFFile();
		threeDVizSNPPage.submitButton.click();
	}

	/**
	 * VISUALIZE BUTTON AND ABOUT BUTTON CLICK
	 */
	public static void visukizeButtionAndAboutButtonClick() {
		threeDVizSNPPage.visulizeButton.click();
		threeDVizSNPPage.aboutButton.click();
	}

	/**
	 * DISMISS POPUP ALERT AFTER WAIT
	 */
	public static void dismissPopUpAlert() {
		Assert.assertTrue(waitForAlertForSpecificPeriod(180),"Alert window is not present even after the wait period");
		CommonUtils.dismissAlert();
	}
	
	/**
	 * METHOD TO WAIT FOR ALERT FOR A GIVEN TIME PERIOD
	 *
	 * @param maxTimeoutInSeconds
	 */
	public static boolean waitForAlertForSpecificPeriod(int maxTimeoutInSeconds){
		for(int waitPeriod = 0;!isAlertPresent();waitPeriod++){
			if (waitPeriod >maxTimeoutInSeconds){
				return false;
			}
			MiscUtils.sleep(1000);
		}
		return true;
	}

	/**
	 * VERIFY IF ALERT IS PRESENT
	 */
	public static  boolean isAlertPresent() {
		try {
			webDriver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	/**
	 * VERIFY NO. OF PAGES DISPLAYED
	 */
	public static void verifyNumberOfPagesDisplayed() {
		String numberOfPages = CommonUtils.getText(threeDVizSNPPage.numberOfPages);
		Assert.assertTrue(numberOfPages.contains("0"));
	}

	/**
	 * LONG RUNNING JOB SUBMIT OPERATION
	 */
	public static void longRunningJobSubmit() {
		threeDVizSNPPage.longRunningJobCheckBox.click();
		threeDVizSNPPage.emailId.sendKeys("satya.gugulothu@nih.gov");
		threeDVizSNPPage.jobName.sendKeys("12345");
	}

	/**
	 * VALIDATE ERROR MESSAGE
	 */
	public static void validateErrorMessage() {
		String text = threeDVizSNPPage.errorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase(
				"The Gene symbols searched for are not found in the attached file, please change the search criteria of the gene symbols and resubmit the analysis."));
	}

	/**
	 * ERROR MESSAGE VALIDATION ON INVALID UPLOAD
	 */
	public static void validateErrorMessageForInvalidVcf() {
		String text = threeDVizSNPPage.invalidJobErrorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase("Visualization Job Failed"));
	}

	/**
	 * VERIFY EMAIL NOTIFICATIONS ARE SENT
	 */
	public static void verifyEmailNotificationSent() {
		String text = threeDVizSNPPage.emailNotificationCnfirmation.getText();
		Assert.assertTrue(text.trim().equals("You will receive an email once processing is complete."));
	}

	/**
	 * DOWNLOAD FILES FOR SVG PNG AND JSON
	 */
	public static void DownloadFilesForSvgPngAndJson() {
		CommonUtils.switchToFrame(0);
		threeDVizSNPPage.svgButton.click();
		threeDVizSNPPage.pngButton.click();
		threeDVizSNPPage.jsonButton.click();
	}

	/**
	 * MINI WINDOW INTERACTION
	 */
	public static void miniWindowInteraction() {
		CommonUtils.switchToFrame(0);
		threeDVizSNPPage.svgButton.click();
		threeDVizSNPPage.summaryButton.click();
	}

	/**
	 * FEEDBACK OPTION
	 */
	public static void feedbackOption() {
		MiscUtils.sleep(5000);
		CommonUtils.switchToFrame(threeDVizSNPPage.ifrmaeFeedback);
		CommonUtils.waitForThePresenceOfEl(threeDVizSNPPage.feedbackLocator, Duration.ofSeconds(30));
		JavascriptUtils.clickByJS(threeDVizSNPPage.feedback);
	}
}
