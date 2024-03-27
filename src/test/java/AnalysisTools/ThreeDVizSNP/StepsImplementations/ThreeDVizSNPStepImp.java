package AnalysisTools.ThreeDVizSNP.StepsImplementations;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;

public class ThreeDVizSNPStepImp extends PageInitializer {

	/** Upload exmple VCF File**/
	public void uploadExampleVCFFile() {
		String path = System.getProperty("user.dir") + "/src/test/java/AnalysisTools/example.vcf";
		CommonUtils.sendKeys(ThreeDVizSNPPage.vcfFileUpload, path);
	}

	/** Upload Invalid VCF File**/
	public void uploadInvalidVCFFIle() {
		String path = System.getProperty("user.dir") + "/src/test/java/AnalysisTools/invalid.vcf";
		CommonUtils.sendKeys(ThreeDVizSNPPage.vcfFileUpload, path);
	}
	
	/** Upload exmple VCF File after clicking vizulize button and then submit**/
	public void uploadVcfFile() {
		ThreeDVizSNPPage.visulizeButton.click();
		uploadExampleVCFFile();
		ThreeDVizSNPPage.submitButton.click();
	}

	/** vizulize Button and about button click**/
	public void visukizeButtionAndAboutButtonClick() {
		ThreeDVizSNPPage.visulizeButton.click();
		ThreeDVizSNPPage.aboutButton.click();
	}
	
	/** Dismiss PopUp Alert**/
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

	/** Verify if alert is present**/
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
		String numberOfPages = CommonUtils.getText(ThreeDVizSNPPage.numberOfPages);
		Assert.assertTrue(numberOfPages.contains("0"));
	}

	/** Long running Job Submit operation **/
	public void longRunningJobSubmit() {
		ThreeDVizSNPPage.longRunningJobCheckBox.click();
		ThreeDVizSNPPage.emailId.sendKeys("satya.gugulothu@nih.gov");
		ThreeDVizSNPPage.jobName.sendKeys("12345");
	}
	
	/** Validate error message*/
	public void validateErrorMessage() {
		String text = ThreeDVizSNPPage.errorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase(
				"The Gene symbols searched for are not found in the attached file, please change the search criteria of the gene symbols and resubmit the analysis."));
	}

	/** Error message validation on invalid upload **/
	public void validateErrorMessageForInvalidVcf() {
		String text = ThreeDVizSNPPage.invalidJobErrorMessage.getText();
		Assert.assertTrue(text.equalsIgnoreCase("Visualization Job Failed"));
	}
	
	/** Verify Email notifications are sent **/
	public void verifyEmailNotificationSent() {
		String text = ThreeDVizSNPPage.emailNotificationCnfirmation.getText();
		Assert.assertTrue(text.trim().equals("You will receive an email once processing is complete."));
	}

	/** download files for svg png and json **/
	public void DownloadFilesForSvgPngAndJson() {
		ThreeDVizSNPPage.svgButton.click();
		ThreeDVizSNPPage.pngButton.click();
		ThreeDVizSNPPage.jsonButton.click();
	}

	/** mini window interaction **/
	public void miniWindowInteraction() {
		ThreeDVizSNPPage.svgButton.click();
		ThreeDVizSNPPage.summaryButton.click();
	}

	/** feedback option **/
	public void feedbackOption() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonUtils.switchToFrame(ThreeDVizSNPPage.ifrmaeFeedback);
		CommonUtils.waitForThePresenceOfEl("//button[@id='QSIFeedbackButton-btn']", Duration.ofSeconds(30));
		JavascriptUtils.clickByJS(ThreeDVizSNPPage.feedback);
	}
}
