package ServiceNow.AwardNomination.StepsImplementation;

import ServiceNow.AwardNomination.Constants.AwardNominationConstants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import static Hooks.Hooks.softAssert;
import static com.nci.automation.web.TestProperties.getAwardNominationUrl;

public class AwardNominationStepsImplementation extends PageInitializer {

    /**
     * Logs in as a Submitter User to NCCR Portal.
     */
    public void awardNominationSubmitterUserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((AwardNominationConstants.SUBMITTER_AWARD_NOMINATION));
        WebDriverUtils.webDriver.get(getAwardNominationUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Navigate to VIBE via Portal menu
     */
    public void navigateToVIBE() {
        CommonUtils.clickOnElement(awardNominationPage.tabServices);
        CommonUtils.waitForVisibility(awardNominationPage.subTabGeneral);
        CommonUtils.clickOnElement(awardNominationPage.subTabGeneral);
        CommonUtils.waitForVisibility(awardNominationPage.optionVIBE);
        CommonUtils.clickOnElement(awardNominationPage.optionVIBE);
    }

    /**
     * verify VIBE page title
     */
    public void verifyVIBEPageTitle() {
        CommonUtils.waitForVisibility(awardNominationPage.pageTitleVIBE);
        softAssert.assertTrue(awardNominationPage.pageTitleVIBE.isDisplayed());
    }

    /**
     * verify what is your name field is not null
     */
    public void verifyWhatIsYourNameFieldNotNull() {
        softAssert.assertNotNull(awardNominationPage.fieldWhatIsYourName.getText());
    }

    /**
     * choose YES from Would you like your appreciation to be anonymous?
     */
    public void chooseYesAnonymousAppreciation() {
        CommonUtils.waitForVisibility(awardNominationPage.dropdownAppreciationAnonymous);
        CommonUtils.clickOnElement(awardNominationPage.dropdownAppreciationAnonymous);
        CommonUtils.waitForVisibility(awardNominationPage.optionYesDropdownAppreciationAnonymous);
        CommonUtils.clickOnElement(awardNominationPage.optionYesDropdownAppreciationAnonymous);
    }

    /**
     * enter colleague name
     */
    public void enterColleagueToAppreciation(String person){
        CommonUtils.waitForVisibility(awardNominationPage.dropdownAppreciationAnonymous);
        CommonUtils.sendKeysToElement(awardNominationPage.fieldColleagueName,person);
        CommonUtils.waitForVisibility(awardNominationPage.chosenPerson);
        CommonUtils.clickOnElement(awardNominationPage.chosenPerson);
    }

    /**
     * enter Share AppreciationText
     * @param text
     */
    public void enterShareAppreciation(String text) {
        CommonUtils.waitForVisibility(awardNominationPage.textFieldShareAppreciation);
        CommonUtils.sendKeysToElement(awardNominationPage.textFieldShareAppreciation, text);
        awardNominationPage.textFieldShareAppreciation.sendKeys(Keys.TAB);
    }

    /**
     * verify section Optional Responses is displayed
     */
    public void verifySectionOptionalResponsesDisplayed() {
        softAssert.assertTrue(awardNominationPage.sectionHeaderOptionalResponses.isDisplayed());
    }

    /**
     * verify section Which value best reflects your appreciation? (Select one or more) is displayed
     */
    public void verifySectionAppreciationValueDisplayed() {
        softAssert.assertTrue(awardNominationPage.sectionHeaderWhichValueBestReflectsYourAppreciation.isDisplayed());
    }

    /**
     * verify Add Attachment is displayed
     */
    public void verifySectionAddAttachmentDisplayed() {
        softAssert.assertTrue(awardNominationPage.addAttachmentOption.isDisplayed());
    }

    /**
     * click Submit Button
     */
    public void clickSubmitButton() {
        CommonUtils.clickOnElement(awardNominationPage.buttonSubmit);
    }

    /**
     * verify Tickets section displayed
     */
    public void verifySectionTicketsDisplayed() {
        softAssert.assertTrue(awardNominationPage.sectionTickets.isDisplayed());
    }

    /**
     * verify last ticket status
     * @param statusWorkInProgress
     */
    public void verifyLastTicketsStatus(String statusWorkInProgress) {
        CommonUtils.waitForVisibility(awardNominationPage.ticketsStatusPageView);
        softAssert.assertEquals(awardNominationPage.ticketsStatusPageView, statusWorkInProgress);
    }

    /**
     * verify approval status
     * @param approvalStatus
     */
    public void verifyApprovalStatus(String approvalStatus) {
        CommonUtils.waitForVisibility(awardNominationPage.approvalStatusPageView);
        softAssert.assertEquals(awardNominationPage.approvalStatusPageView, approvalStatus);
    }

    /**
     * verify Cancel button is displayed
     */
    public void verifyCancelButtonDisplayed() {
        CommonUtils.waitForVisibility(awardNominationPage.cancelButton);
        softAssert.assertTrue(awardNominationPage.cancelButton.isDisplayed());
    }

    /**
     * verify Add Watchers button is displayed
     */
    public void verifyAddWatchersButtonDisplayed() {
        CommonUtils.waitForVisibility(awardNominationPage.addWatchersButton);
        softAssert.assertTrue(awardNominationPage.addWatchersButton.isDisplayed());
    }

    /**
     * verify Add Attachment button is displayed
     */
    public void verifyAddAttachmentButtonDisplayed() {
        CommonUtils.waitForVisibility(awardNominationPage.addAttachmentButton);
        softAssert.assertTrue(awardNominationPage.addAttachmentButton.isDisplayed());
    }

    /**
     * add Watcher
     * @param watcher
     */
    public void addWatcher(String watcher) {
        CommonUtils.waitForVisibility(awardNominationPage.textFieldAddWatchers);
        CommonUtils.sendKeysToElement(awardNominationPage.textFieldAddWatchers,watcher);
        awardNominationPage.textFieldAddWatchers.sendKeys(Keys.TAB);
        CommonUtils.clickOnElement(awardNominationPage.saveChangesConfModalButton);
    }

    /**
     * verify Watcher is added
     * @param watcher
     */
    public void verifyWatcherAdded(String watcher) {
        CommonUtils.waitForVisibility(awardNominationPage.watchListField);
        softAssert.assertTrue(awardNominationPage.watchListField.getText().equals(watcher));
    }
}

