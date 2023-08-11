package CustomBusiness.EIDP.StepsImplementation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;

public class DashboardStepImpl extends PageInitializer {

	public void clickOnSubmitButton() {
		CommonUtils.clickOnElement(eidpDashboardPage.submitButton);
	}

	public void selectVerifyMeetingCheckbox() {
		eidpDashboardPage.meetingCheckbox.click();
	}

	public void clickOnSearch() {
		CommonUtils.waitForClickability(eidpDashboardPage.search);
		CommonUtils.clickOnElement(eidpDashboardPage.search);
	}

	public void clickOnManageDelegate() {
		CommonUtils.clickOnElement(eidpDashboardPage.manageDelegate);
	}

	public void clickOnReviseIDP() throws Exception {
		for (WebElement e : eidpDashboardPage.reviseExistingIDPs) {
			if (e.isEnabled()) {
				e.click();
				return;
			}
		}
		throw new Exception("No button available to click for revise IDP");
	}

	public void clickOnStartIDPButton() {
		CommonUtils.waitForVisibility(eidpDashboardPage.startIDPButton);
		CommonUtils.clickOnElement(eidpDashboardPage.startIDPButton);
	}

	public void clickOnProceedButton() {
		CommonUtils.waitForVisibility(eidpDashboardPage.proceedButton);
		CommonUtils.clickOnElement(eidpDashboardPage.proceedButton);
	}

	public void clickOnSendIDPToPrimaryMentorButton() {
		CommonUtils.clickOnElement(eidpDashboardPage.sendIDPToPrimaryMentoryButton);
	}

	public void clickOnVerifyMeetingButton() {
		CommonUtils.clickOnElement(eidpDashboardPage.verifyMeetingButton);
	}

	public Boolean isIDPSentMessage() {
		String message = eidpDashboardPage.idpMessage.getText();
		return message.contains("Thank you! You have successfully sent your IDP to the Primary Mentor");

	}

	public void clickOnIDPAwaitResponsButton() {
		CommonUtils.waitForClickability(eidpDashboardPage.idpAwaitingResponseButton);
		CommonUtils.clickOnElement(eidpDashboardPage.idpAwaitingResponseButton);
	}

	public Boolean selectFirstPendingReviewIDP() {
		Boolean isSelected = false;
		List<WebElement> reviews = WebDriverUtils.webDriver
				.findElements(By.cssSelector("a[title='Pending Review']"));
		if (reviews.size() > 0) {
			CommonUtils.clickOnElement(reviews.get(0));
			isSelected = true;
		}
		return isSelected;
	}

	// Looping through list of trainees to pick up the initiated IDP of a trainee
	public boolean selectIDPRequestOfTraineeNHGRI() throws Exception {
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		MiscUtils.sleep(5000);
		for (byte i = 1; i <= 8; i++) {
			for (WebElement each : eidpDashboardPage.pendingReviews) {
				if (each.getText().equals(traineeName)) {
					eidpDashboardPage.pendingReviewsTraineeButton(traineeName).click();
					isSelected = true;
					break;
				}
			}
			MiscUtils.sleep(5000);
			if (isSelected) {
				break;
			} else {
				eidpDashboardPage.nextButton.click();
				MiscUtils.sleep(5000);
			}
		}
		return isSelected;
	}

	public Boolean selectIDPRequestOfTrainee() throws Exception {
		CommonUtils.waitForClickability(eidpDashboardPage.idpAwaitingResponseButton);
		eidpDashboardPage.idpAwaitingResponseButton.click();
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		if (eidpDashboardPage.pendingReviewsTrainee(traineeName).size() > 0) {
			eidpDashboardPage.pendingReviewsTrainee(traineeName).get(0).click();
			isSelected = true;
		}
		if (!isSelected) {
			eidpDashboardPage.traineeProceedButton(traineeName).click();
		}
		return isSelected;
	}

	public boolean clickProceedButtonOfTraineeNHGRI() throws Exception {
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (traineeName.trim().equals("")) {
			throw new Exception("Trainee Name is blank");
		}
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		traineeName = traineeName.toLowerCase();
		String str = traineeName.split(",")[1].trim();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		String str2 = traineeName.split(",")[0].trim();
		str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
		traineeName = str2 + "," + str;
		Thread.sleep(5000);
		if (CommonUtils.isElementDisplayed(By.xpath("//tr//a[contains(text(),'" + str2 + "') and contains(text(),'"
				+ str + "')]/parent::td/following-sibling::td//a/img[@alt='proceed']"))) {
			WebDriverUtils.webDriver.findElement(By.xpath("//tr//a[contains(text(),'" + str2
					+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='proceed']"))
					.click();
		} else if (CommonUtils.isElementDisplayed(By.xpath("//tr//a[contains(text(),'" + str2
				+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='Proceed']"))) {
			WebDriverUtils.webDriver.findElement(By.xpath("//tr//a[contains(text(),'" + str2
					+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='Proceed']"))
					.click();
		} else {
			if (CommonUtils.isElementEnabled(eidpDashboardPage.mentorsTableNext)) {
				eidpDashboardPage.mentorsTableNext.click();
				clickProceedButtonOfTraineeNHGRI();
			} else {
				throw new Exception("Unable to find the trainne to proceed");
			}
		}
		return isSelected;
	}

	public void clickProceedButtonOfTrainee() throws Exception {

		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}

		Thread.sleep(25000);
		WebElement button = WebDriverUtils.webDriver.findElement(By.xpath(String.format(
				"//h4[contains(text(),'ADD')]/ancestor::div[@class='container main']//tbody//*[text()='%s']//parent::td/following-sibling::td/a[@class=\"btn btn-primary\"]",
				traineeName)));
		button.click();

	}

	public void clickProceedButtonOfTraineeCoPrimaryMentorNHGRI() throws Exception {
		String traineeName = SharedData.traineeName;
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		Thread.sleep(5000);
		WebElement button = WebDriverUtils.webDriver
				.findElement(By.xpath("//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Proceed']"));
		Thread.sleep(5000);
		button.click();
	}

	public String getIDPRequestStatus() {
		return WebDriverUtils.webDriver.findElement(By.xpath("//table//tbody//td[2]")).getText();
	}

	public void clickOnSearchButton() {
		CommonUtils.clickOnElement(eidpDashboardPage.searchButton);
	}

	public Boolean selectIDPRequestOfTraineeForRenewal() throws Exception {
		//SharedData.traineeName="GUTHRIE,Lori";
		try {
			CommonUtils.selectDropDownValue("100", WebDriverUtils.webDriver
					.findElement(By.xpath("//SELECT[@name=\"primaryMentorsawaitingResponseTable_length\"]")));
		} catch (Exception ee3) {
			//throw ee2;
		}
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if (traineeName.trim().equals("")) {
			throw new Exception("Trainee Name is blank");
		}
		if (!traineeName.contains(",")) {
			traineeName = SharedData.traineeName.split(" ")[1] + ", " + SharedData.traineeName.split(" ")[0];
		}
		traineeName = traineeName.toLowerCase();
		String str = traineeName.split(",")[1].trim();
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		String str2 = traineeName.split(",")[0].trim();
		str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
		traineeName = str2 + "," + str;
		Thread.sleep(5000);
		if (CommonUtils.isElementDisplayed(By.xpath("//tr//a[contains(text(),'" + str2 + "') and contains(text(),'"
				+ str + "')]/parent::td/following-sibling::td//a/img[@alt='proceed']"))) {
			WebDriverUtils.webDriver.findElement(By.xpath("//tr//a[contains(text(),'" + str2
					+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='proceed']"))
					.click();
		} else if (CommonUtils.isElementDisplayed(By.xpath("//tr//a[contains(text(),'" + str2
				+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='Proceed']"))) {
			WebDriverUtils.webDriver.findElement(By.xpath("//tr//a[contains(text(),'" + str2
					+ "') and contains(text(),'" + str + "')]/parent::td/following-sibling::td//a/img[@alt='Proceed']"))
					.click();
		} else {
			try {
				if (CommonUtils.isElementEnabled(
						WebDriverUtils.webDriver.findElement(By.xpath("//li[@id=\"mentorsTable_next\"]/a")))) {
					WebDriverUtils.webDriver.findElement(By.xpath("//li[@id=\"mentorsTable_next\"]/a")).click();

				}
			} catch (Exception ee) {
				try {
					if (CommonUtils.isElementEnabled(WebDriverUtils.webDriver
							.findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable_next']")))) {
						WebDriverUtils.webDriver
								.findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable_next']")).click();
					}
				} catch (Exception ee2) {
					throw  ee2;
				}
			}
			selectIDPRequestOfTraineeForRenewal();
		}
		return isSelected;
	}

	public void finishSteps() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverUtils.webDriver.findElement(By.xpath("title=\"Verify Meeting And Accept IDP\"")).click();
		WebDriverUtils.webDriver.findElement(By.id("checkboxMeetingVerified")).click();
		WebDriverUtils.webDriver.findElement(By.xpath("//button[@onclick=\"form_submit_verifyMeetingPM()\"]"))
				.click();
	}
}