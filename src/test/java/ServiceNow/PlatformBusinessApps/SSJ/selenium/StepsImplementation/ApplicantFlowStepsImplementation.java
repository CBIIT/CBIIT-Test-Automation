package ServiceNow.PlatformBusinessApps.SSJ.selenium.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ApplicantFlowStepsImplementation extends PageInitializer {

    public void userIsOnProfileTab() {
        CommonUtils.waitForVisibility(applicantFlowPage.tabProfile);
        CommonUtils.clickOnElement(applicantFlowPage.tabProfile);
    }

    public void userSavesUpdatedSection() {
        CommonUtils.waitForVisibility(applicantFlowPage.buttonSave);
        CommonUtils.clickOnElement(applicantFlowPage.buttonSave);
    }

    public boolean clickEditButtonBasicInfoSection() {
        if (applicantFlowPage.btnEditProfileTab.isDisplayed()) {
            CommonUtils.clickOnElement(applicantFlowPage.btnEditProfileTab);
            return true;
        } else {
            return false;
        }
    }

    public boolean clickEditButtonDemographicsSection() {
        if (applicantFlowPage.btnEditProfileTab.isDisplayed()) {
            CommonUtils.clickOnElement(applicantFlowPage.tabDemographics);
            CommonUtils.clickOnElement(applicantFlowPage.btnEditProfileTab);
            return true;
        } else {
            return false;
        }
    }

    public void pickDegree(String degree) {
        if (degree.equals("Masters")) {
            CommonUtils.clickOnElement(applicantFlowPage.dropdownDegree);
            CommonUtils.clickOnElement(applicantFlowPage.degreeMasters);
        } else if (degree.equals("Bachelors")) {
            CommonUtils.clickOnElement(applicantFlowPage.dropdownDegree);
            CommonUtils.clickOnElement(applicantFlowPage.degreeBachelors);
        }
    }

    public void enterFirstNameProfileTab(String firstName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldFirstNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldFirstNameProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldFirstNameProfile, firstName);
    }

    public void enterMiddleNameProfileTab(String middleName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldMiddleNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldMiddleNameProfile, middleName);
    }

    public void enterLastNameProfileTab(String lastName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldLastNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, lastName);
    }

    public void enterEmailProfileTab(String email) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldEmailProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldEmailProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldEmailProfile, email);
    }

    public void enterPhoneProfileTab(String phone) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldPhoneProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldPhoneProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldPhoneProfile, phone);
    }

    public void enterBusinessPhoneProfileTab(String businessPhone) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldBusinessPhoneProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldBusinessPhoneProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldBusinessPhoneProfile, businessPhone);
    }

    public void enterAddressProfileTab(String address) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldAddressProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldAddressProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldAddressProfile, address);
    }

    public void enterAppNumberProfileTab(String appNumber) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldAppNumberProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldAppNumberProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldAppNumberProfile, appNumber);
    }

    public void enterCityProfileTab(String city) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldCityProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldCityProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldCityProfile, city);
    }

    public void enterStateProfileTab(String state) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldStateProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldStateProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldStateProfile, state);
    }

    public void
    enterCountryProfileTab(String country) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldCountryProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldCountryProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldCountryProfile, country);
    }

    public void enterZipProfileTab(String zip) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldZipProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldZipProfile, Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldZipProfile, zip);
    }

    public void editSexChoice() {
        if (applicantFlowPage.buttonMaleSex.isSelected()) {
            CommonUtils.clickOnElement(applicantFlowPage.buttonFemaleSex);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonMaleSex);
        }
    }

    public void editEthnicityChoice() {
        if (applicantFlowPage.buttonHispanicOrLatino.isSelected()) {
            CommonUtils.clickOnElement(applicantFlowPage.buttonNotHispanicOrLatino);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonHispanicOrLatino);
        }
    }

    public void editRaceChoice() {
        if (applicantFlowPage.buttonAmericanIndianAlaskaNative.isSelected()) {
            CommonUtils.clickOnElement(applicantFlowPage.buttonAsian);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonAmericanIndianAlaskaNative);
        }
    }

    public void editDisabilityChoice() {
        if (applicantFlowPage.buttonBlind.isSelected()) {
            CommonUtils.clickOnElement(applicantFlowPage.buttonDeaf);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonAmericanIndianAlaskaNative);
        }
    }

    public void closeOutlookWindow() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public boolean verifySSJLandingPageTitle(String title) {
        if (applicantFlowPage.ssjLandingPageTitle.getText().equals(title)) {
            System.out.println("SSJ Landing page title is displayed correctly");
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyNIHHyperlinkNavigation() {
        CommonUtils.waitForVisibility(applicantFlowPage.nihLogo);
        if (applicantFlowPage.nihLogo.isDisplayed()) {
            webDriver.navigate().back();
            CommonUtils.sleep(3000);
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyOpenVacanciesHeader(String textOpenVacanciesHeader) {
        return applicantFlowPage.openVacanciesHeader.getText().equals(textOpenVacanciesHeader);
    }

    public boolean verifyOpenVacanciesText(String textOpenVacancies) {
        return applicantFlowPage.openVacanciesText.getText().equals(textOpenVacancies);
    }

    public boolean verifyCloseDateContent(String endPeriod) {
        return applicantFlowPage.closeDateLiveVacancyVacDetailsView.getText().contains(endPeriod);
    }

    public void verifyStatements(String statement) {
        switch (statement) {
            case "EQUAL OPPORTUNITY EMPLOYMENT":
                Assert.assertTrue(applicantFlowPage.equalOpportunityEmploymentStatement.isDisplayed());
                break;
            case "STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE":
                Assert.assertTrue(applicantFlowPage.standardsOfConductStatement.isDisplayed());
                break;
            case "FOREIGN EDUCATION":
                Assert.assertTrue(applicantFlowPage.foreignEducationStatement.isDisplayed());
                break;
            case "REASONABLE ACCOMODATION":
                Assert.assertTrue(applicantFlowPage.reasonableAccommodationStatement.isDisplayed());
                break;
        }
    }

    public boolean verifyYourApplicationsPageTitle(String title) {
        return applicantFlowPage.yourApplicationsPageTitle.getText().equals(title);
    }
}


