package CustomBusiness.CCR.StepsImplementation;

import CustomBusiness.CCR.Constants.CCR_CONSTANTS;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CCRStepsImplementation extends PageInitializer {

    public void ccrLogin(){
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CCR"));
    }

    public void clickNextButton(String sectionName) throws TestingException {
        switch (sectionName) {
            case "Basic Information":
                CommonUtils.waitForVisibility(cCRApplicationPage.nextButtonBasicInfoSection);
                CommonUtils.clickOnElement(cCRApplicationPage.nextButtonBasicInfoSection);
                break;
            case "Address":
                CommonUtils.waitForVisibility(cCRApplicationPage.nextButtonAddressSection);
                CommonUtils.clickOnElement(cCRApplicationPage.nextButtonAddressSection);
                break;
            case "Business Address":
                CommonUtils.waitForVisibility(cCRApplicationPage.nextButtonBusinessAddressSection);
                CommonUtils.clickOnElement(cCRApplicationPage.nextButtonBusinessAddressSection);
                break;
            case "Required Documents":
                CommonUtils.waitForVisibility(cCRApplicationPage.nextButtonRequiredDocumentsSection);
                CommonUtils.clickOnElement(cCRApplicationPage.nextButtonRequiredDocumentsSection);
                break;
        }
    }

    public void chooseUSA(String sectionName) throws TestingException {
        switch (sectionName) {
            case "Address":
                Select se = new Select(cCRApplicationPage.countryDropdown);
                se.selectByValue("060f782fdb51f30054d8ff621f96190a");
                break;
            case "Business Address":
                Select s = new Select(cCRApplicationPage.countryBusinessDropdown);
                s.selectByValue("060f782fdb51f30054d8ff621f96190a");
                break;
        }
    }

    public void uploadDocuments(String document){
        switch (document) {
            case "CV":
                MiscUtils.sleep(2000);
             //   CommonUtils.clickOnElement(cCRApplicationPage.do);
                WebElement fileInput = webDriver.findElement(By.xpath("(//input[@placeholder='No file chosen'])[1]"));
                fileInput.sendKeys("/src/test/java/CustomBusiness/CCR/Resources/CV.docx");
                break;
            case "Research Goals":
                WebElement fileInput2 = webDriver.findElement(By.xpath("(//input[@placeholder='No file chosen'])[2]"));
                fileInput2.sendKeys("/src/test/java/CustomBusiness/CCR/Resources/ResearchGoals.docx");
                break;
            case "Letter of Interest":
                MiscUtils.sleep(2000);
                WebElement fileInput3 = webDriver.findElement(By.xpath("(//input[@placeholder='No file chosen'])[3]"));
                fileInput3.sendKeys("/src/test/java/CustomBusiness/CCR/Resources/LetterOfInterest.docx");
                break;
            case "Upload Diversity Statement":
                WebElement fileInput4 = webDriver.findElement(By.xpath("(//input[@placeholder='No file chosen'])[4]"));
                fileInput4.sendKeys("/src/test/java/CustomBusiness/CCR/Resources/DiversityStatement.docx");
                break;

        }
    }

    public void selectOutreachSource(String source){
        switch (source) {
            case "Contacted By Member":
                Select s1 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s1.selectByVisibleText(" Directly contacted by a member of the search committee or an NCI employee. ");
                break;
            case "Colleague":
                Select s2 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s2.selectByVisibleText(" Advisor/colleague in my current organization. If known, please indicate how they found out. ");
                break;
            case "Internet Search":
                Select s3 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s3.selectByVisibleText(" Internet/Google search. Please indicate keywords used. ");
                break;
            case "Social Media":
                Select s4 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s4.selectByVisibleText(" CCR social media, including Facebook, Twitter, Instagram, Linkedin. Please indicate which specifically. ");
                break;
            case "Online Journal":
                Select s5 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s5.selectByVisibleText(" On-line journal advertisement or career fair. Please identify which journal/meeting. ");
                break;
            case "GMPAP":
                Select s6 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s6.selectByVisibleText(" Geographic Management of Cancer Health Disparities Program (GMaP). ");
                break;
            case "Other":
                Select s7 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s7.selectByVisibleText(" Other (please specify) ");
                break;
            case "Don't recall":
                Select s8 = new Select(cCRApplicationPage.outreachSourceDropdown);
                s8.selectByVisibleText(" Don't recall. ");
                break;
        }
    }

    public void selectUploadingMaterialsOption(String option) {
        switch (option) {
            case "Yes":
                CommonUtils.clickOnElement(cCRApplicationPage.yesOptionSimplicityOfUploadingMaterials);
                break;
            case "No":
                CommonUtils.clickOnElement(cCRApplicationPage.noOptionSimplicityOfUploadingMaterials);
                break;
        }
    }

    public void selectAdInformationOption(String option){
        switch (option) {
            case "Yes":
                CommonUtils.clickOnElement(cCRApplicationPage.yesPostedAd);
                break;
            case "No":
                CommonUtils.clickOnElement(cCRApplicationPage.noPostedAd);
                break;
        }
    }

    public void clickButton(String button){
        switch (button) {
            case "Apply Now":
                CommonUtils.waitForClickability(cCRApplicationPage.applyNowButton);
                CommonUtils.clickOnElement(cCRApplicationPage.applyNowButton);
                break;
            case "Submit":
                CommonUtils.waitForVisibility(cCRApplicationPage.submitButton);
                CommonUtils.clickOnElement(cCRApplicationPage.submitButton);
                CommonUtils.waitForVisibility(cCRApplicationPage.submitConfirmationButton);
                CommonUtils.clickOnElement(cCRApplicationPage.submitConfirmationButton);
                CommonUtils.waitForVisibility(cCRApplicationPage.closeApplicationSubmittedButton);
                CommonUtils.clickOnElement(cCRApplicationPage.closeApplicationSubmittedButton);
                break;
        }
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
}
