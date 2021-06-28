package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;

public class DashboardStepImpl extends PageInitializer {

	public void clickOnSubmitButton() {
		CommonUtils.click(eidpDashboardPage.submitButton);
	}
	
	public void selectVerifyMeetingCheckbox() {
		WebDriverUtils.getWebDriver().findElement(By.cssSelector(".checkbox.btn.btn-primary")).click();
	}
	
	public void clickOnSearch() {
		CommonUtils.click(eidpDashboardPage.search);
	}
	
	public void clickOnManageDelegate() {
		CommonUtils.click(eidpDashboardPage.manageDelegate);
	}
	
	public void clickOnStartIDPButton() {
		CommonUtils.waitForVisibility(eidpDashboardPage.startIDPButton);
		CommonUtils.click(eidpDashboardPage.startIDPButton);
	}
	
	public void clickOnProceedButton() {
		CommonUtils.waitForVisibility(eidpDashboardPage.proceedButton);
		CommonUtils.click(eidpDashboardPage.proceedButton);
	}
	
	public void clickOnSendIDPToPrimaryMentorButton() {
		CommonUtils.click(eidpDashboardPage.sendIDPToPrimaryMentoryButton);
	}
	
	public void clickOnVerifyMeetingButton() {
		CommonUtils.click(eidpDashboardPage.verifyMeetingButton);
	}
	
	public Boolean isIDPSentMessage() {
		String message = eidpDashboardPage.idpMessage.getText();
		return message.contains("Thank you! You have successfully sent your IDP to the Primary Mentor");
		
	}
	
	public void clickOnIDPAwaitResponsButton() {
		CommonUtils.click(eidpDashboardPage.idpAwaitingResponseButton);
	}
	
	public Boolean selectFirstPendingReviewIDP() {
		Boolean isSelected = false;
		List<WebElement> reviews = WebDriverUtils.getWebDriver().findElements(By.cssSelector("a[title='Pending Review']"));
		if(reviews.size() > 0) {
			CommonUtils.click(reviews.get(0));
			isSelected = true;
		}
		return isSelected;
	}
	
	public Boolean selectIDPRequestOfTrainee() throws Exception{
		Boolean isSelected = false;
		String traineeName = SharedData.traineeName;
		if(!traineeName.contains(",")){
			traineeName = SharedData.traineeName.split(" ")[1] + ", " +SharedData.traineeName.split(" ")[0];
		}
		Thread.sleep(5000);
		List<WebElement> pendingReviews = WebDriverUtils.getWebDriver().findElements(By.xpath("//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Pending Review']"));
		if(pendingReviews.size() > 0) {
			pendingReviews.get(0).click();
			isSelected = true;
		}
		return isSelected;
	}
	
	public  void clickProceedButtonOfTrainee() throws Exception {
		
		String traineeName = SharedData.traineeName;
		if(!traineeName.contains(",")){
			traineeName = SharedData.traineeName.split(" ")[1] + ", " +SharedData.traineeName.split(" ")[0];
		}
		Thread.sleep(5000);
<<<<<<< Updated upstream
		//WebElement button = WebDriverUtils.getWebDriver().findElement(By.xpath("//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Proceed']"));
		WebElement button = WebDriverUtils.getWebDriver().findElement(By.xpath("(//a[@data-original-title='Proceed'])[1]"));
=======
		WebElement button = WebDriverUtils.getWebDriver().findElement(By.xpath("//a[text()='" + traineeName + "']//ancestor::tr//a[@title='Proceed']"));
>>>>>>> Stashed changes
		button.click();
	}
	
	public String getIDPRequestStatus() {
		return WebDriverUtils.getWebDriver().findElement(By.xpath("//table//tbody//td[2]")).getText();
	}

	public void clickOnSearchButton() {
		CommonUtils.click(eidpDashboardPage.searchButton);
	}

}
