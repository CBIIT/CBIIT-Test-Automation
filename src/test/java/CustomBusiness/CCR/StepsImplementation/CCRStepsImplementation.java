package CustomBusiness.CCR.StepsImplementation;

import CustomBusiness.CCR.Constants.CCR_CONSTANTS;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import static com.nci.automation.web.TestProperties.getCcrUrl;

public class CCRStepsImplementation extends PageInitializer {

    public void ccrApplicantLogin(){
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((CCR_CONSTANTS.APPLICANT));
        WebDriverUtils.webDriver.get(getCcrUrl());
        CucumberLogUtils.logScreenshot();
    }

    public void ccrAdminLogin(){
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((CCR_CONSTANTS.ADMIN));
        WebDriverUtils.webDriver.get(getCcrUrl());
        CucumberLogUtils.logScreenshot();
    }

    public void clickNextButton(String sectionName) {
        switch (sectionName) {
            case "Basic Information":
                CommonUtils.waitForVisibility(cCRApplicantPage.nextButtonBasicInfoSection);
                CommonUtils.clickOnElement(cCRApplicantPage.nextButtonBasicInfoSection);
                break;
            case "Address":
                CommonUtils.waitForVisibility(cCRApplicantPage.nextButtonAddressSection);
                CommonUtils.clickOnElement(cCRApplicantPage.nextButtonAddressSection);
                break;
            case "Reference":
                CommonUtils.waitForVisibility(cCRApplicantPage.nextButtonReferenceSection);
                CommonUtils.clickOnElement(cCRApplicantPage.nextButtonReferenceSection);
                break;
            case "Business Address":
                CommonUtils.waitForVisibility(cCRApplicantPage.nextButtonBusinessAddressSection);
                CommonUtils.clickOnElement(cCRApplicantPage.nextButtonBusinessAddressSection);
                break;
            case "Required Documents":
                CommonUtils.waitForVisibility(cCRApplicantPage.nextButtonRequiredDocumentsSection);
                CommonUtils.clickOnElement(cCRApplicantPage.nextButtonRequiredDocumentsSection);
                break;
        }
    }

    public void chooseUSA(String sectionName) {
        switch (sectionName) {
            case "Address":
                Select se = new Select(cCRApplicantPage.countryDropdown);
                se.selectByValue("060f782fdb51f30054d8ff621f96190a");
                break;
            case "Business Address":
                Select s = new Select(cCRApplicantPage.countryBusinessDropdown);
                s.selectByValue("060f782fdb51f30054d8ff621f96190a");
                break;
        }
    }

    public void uploadDocuments(String document) throws AWTException {
        switch (document) {
            case "CV":
                CommonUtils.clickOnElement((cCRApplicantPage.uploadFileCV));
                setClipboardData(CCR_CONSTANTS.CV);
                CommonUtils.sleep(3000);
                enterFilePathCloseWindowDialogue();
                break;
            case "Research Goals":
                CommonUtils.clickOnElement((cCRApplicantPage.uploadFileResearchGoals));
                setClipboardData(CCR_CONSTANTS.RESEARCH_GOALS);
                CommonUtils.sleep(1000);
                enterFilePathCloseWindowDialogue();
                break;
        }
    }

    public void selectOutreachSource(String source){
        switch (source) {
            case "Contacted By Member":
                Select s1 = new Select(webDriver.findElement(By.id("outreach_source")));
                s1.selectByVisibleText(" Directly contacted by a member of the search committee or an NCI employee. ");
                break;
            case "Colleague":
                Select s2 = new Select(webDriver.findElement(By.id("outreach_source")));
                s2.selectByVisibleText(" Advisor/colleague in my current organization. If known, please indicate how they found out. ");
                break;
            case "Internet Search":
                Select s3 = new Select(webDriver.findElement(By.id("outreach_source")));
                s3.selectByVisibleText(" Internet/Google search. Please indicate keywords used. ");
                break;
            case "Social Media":
                Select s4 = new Select(webDriver.findElement(By.id("outreach_source")));
                s4.selectByVisibleText(" CCR social media, including Facebook, Twitter, Instagram, Linkedin. Please indicate which specifically. ");
                break;
            case "Online Journal":
                Select s5 = new Select(webDriver.findElement(By.id("outreach_source")));
                s5.selectByVisibleText(" On-line journal advertisement or career fair. Please identify which journal/meeting. ");
                break;
            case "GMPAP":
                Select s6 = new Select(webDriver.findElement(By.id("outreach_source")));
                s6.selectByVisibleText(" Geographic Management of Cancer Health Disparities Program (GMaP). ");
                break;
            case "Other":
                Select s7 = new Select(webDriver.findElement(By.id("outreach_source")));
                s7.selectByVisibleText(" Other (please specify) ");
                break;
            case "Don't recall":
                Select s8 = new Select(webDriver.findElement(By.id("outreach_source")));
                s8.selectByVisibleText(" Don't recall. ");
                break;
        }
    }

    public void selectUploadingMaterialsOption(String option) {
        switch (option) {
            case "Yes":
                CommonUtils.clickOnElement(cCRApplicantPage.yesOptionSimplicityOfUploadingMaterials);
                break;
            case "No":
                CommonUtils.clickOnElement(cCRApplicantPage.noOptionSimplicityOfUploadingMaterials);
                break;
        }
    }

    public void selectAdInformationOption(String option){
        switch (option) {
            case "Yes":
                CommonUtils.clickOnElement(cCRApplicantPage.yesPostedAd);
                break;
            case "No":
                CommonUtils.clickOnElement(cCRApplicantPage.noPostedAd);
                break;
        }
    }

    public void submitApplication(){
        CommonUtils.clickOnElement(cCRApplicantPage.submitButton);
        CommonUtils.clickOnElement(cCRApplicantPage.submitConfirmationButton);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(cCRApplicantPage.closeApplicationSubmittedButton);
        Assert.assertTrue(" User failed to submit application", cCRApplicantPage.msgApplicationSubmitted.isDisplayed());
    }

    public void clickApplyButton(){
        CommonUtils.waitForClickability(cCRApplicantPage.applyNowButton);
        CommonUtils.clickOnElement(cCRApplicantPage.applyNowButton);
    }

    public void verifyDisplayedTab(String tab) {
        if (tab.equals ("Home")) {
       CommonUtils.waitForVisibility(cCRLandingPage.homeTab);
       CommonUtils.assertTrue(cCRLandingPage.homeTab.isDisplayed());
        } else {
       CommonUtils.waitForVisibility(cCRLandingPage.positionsTab);
       CommonUtils.assertTrue(cCRLandingPage.positionsTab.isDisplayed());
        }
    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public static void enterFilePathCloseWindowDialogue() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
    }

    public void logOutOfCCRCareersApp(){
        CommonUtils.clickOnElement(cCRApplicantPage.userDropdownMenu);
        CommonUtils.clickOnElement(cCRApplicantPage.optionLogOut);
    }

    public void adminUserCreatesNewVacancy(){
        CommonUtils.waitForVisibility(cCRAdminUserPage.tabPositions);
        CommonUtils.clickOnElement(cCRAdminUserPage.tabPositions);
        CommonUtils.waitForVisibility(cCRAdminUserPage.buttonAddPosition);
        CommonUtils.clickOnElement(cCRAdminUserPage.buttonAddPosition);
        CommonUtils.waitForVisibility(cCRAdminUserPage.fieldPositionTitle);
        CommonUtils.sendKeys(cCRAdminUserPage.fieldPositionTitle, "Chief Technical Officer");
        CommonUtils.sleep(2000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(cCRAdminUserPage.fieldDescription, "Added description");
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.switchTo().defaultContent();
        JavascriptUtils.scrollIntoView(cCRAdminUserPage.openDateCalendar);
        CommonUtils.clickOnElement(cCRAdminUserPage.openDateCalendar);
        CommonUtils.clickOnElement(cCRAdminUserPage.todaysDateActiveField);
        CommonUtils.sleep(2000);
        cCRAdminUserPage.fielOneReqDocuments.clear();
        CommonUtils.sleep(1000);
        cCRAdminUserPage.fielTwoReqDocuments.clear();
        Select s = new Select(webDriver.findElement(By.id("number_of_references")));
        s.selectByVisibleText("1");
        clickOutside();
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(cCRAdminUserPage.buttonSaveNewPosition);
    }

    public void adminUserDeletesNewVacancy(){
        CommonUtils.waitForVisibility(cCRAdminUserPage.tabPositions);
        CommonUtils.clickOnElement(cCRAdminUserPage.tabPositions);
        CommonUtils.waitForVisibility(cCRAdminUserPage.buttonRemoveNewlyCreatedPosition);
        CommonUtils.clickOnElement(cCRAdminUserPage.buttonRemoveNewlyCreatedPosition);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(cCRAdminUserPage.buttonOkRemovingPositionModal);
        CommonUtils.sleep(2000);
        Assert.assertTrue("Position was NOT removed",cCRAdminUserPage.confirmationMessagePositionWasRemoved.isDisplayed());
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(cCRAdminUserPage.acknowledgeConfirmationModalPositionWasRemoved);
    }

    public void clickOutside(){
        Actions action = new Actions(webDriver);
        action.moveByOffset(0, 0).click().build().perform();
    }
}
