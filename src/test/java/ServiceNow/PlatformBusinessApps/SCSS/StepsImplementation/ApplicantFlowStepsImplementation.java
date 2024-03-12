package ServiceNow.PlatformBusinessApps.SCSS.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import org.openqa.selenium.Keys;

public class ApplicantFlowStepsImplementation extends PageInitializer {

    public void userIsOnProfileTab(){
        CommonUtils.waitForVisibility(applicantFlowPage.tabProfile);
        CommonUtils.clickOnElement(applicantFlowPage.tabProfile);
    }

    public void userSavesUpdatedSection(){
        CommonUtils.waitForVisibility(applicantFlowPage.buttonSave);
        CommonUtils.clickOnElement(applicantFlowPage.buttonSave);
    }

    public void clickEditButton(String tab) {
        if (tab.equals("Basic Information")){
            CommonUtils.clickOnElement(applicantFlowPage.btnEditProfileTab);
        } else if (tab.equals("Demographics")){
            CommonUtils.clickOnElement(applicantFlowPage.tabDemographics);
            CommonUtils.clickOnElement(applicantFlowPage.btnEditProfileTab);
        }
    }

    public void pickDegree(String degree) {
        if (degree.equals("Masters")){
            CommonUtils.clickOnElement(applicantFlowPage.dropdownDegree);
            CommonUtils.clickOnElement(applicantFlowPage.degreeMasters);
        } else if (degree.equals("Bachelors")){
            CommonUtils.clickOnElement(applicantFlowPage.dropdownDegree);
            CommonUtils.clickOnElement(applicantFlowPage.degreeBachelors);
        }
    }

    public void enterFirstNameProfileTab(String firstName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldFirstNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldFirstNameProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldFirstNameProfile,firstName);
    }

    public void enterMiddleNameProfileTab(String middleName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldMiddleNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldMiddleNameProfile,middleName);
    }

    public void enterLastNameProfileTab(String lastName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldLastNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile,lastName);
    }

    public void enterEmailProfileTab(String email) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldEmailProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldEmailProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldEmailProfile,email);
    }

    public void enterPhoneProfileTab(String phone) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldPhoneProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldPhoneProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldPhoneProfile,phone);
    }

    public void enterBusinessPhoneProfileTab(String businessPhone) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldBusinessPhoneProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldBusinessPhoneProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldBusinessPhoneProfile, businessPhone);
    }

    public void enterAddressProfileTab(String address){
        CommonUtils.waitForVisibility(applicantFlowPage.fldAddressProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldAddressProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldAddressProfile,address);
    }

    public void enterAppNumberProfileTab(String appNumber) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldAppNumberProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldAppNumberProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldAppNumberProfile,appNumber);
    }

    public void enterCityProfileTab(String city) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldCityProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldCityProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldCityProfile,city);
    }

    public void enterStateProfileTab(String state) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldStateProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldStateProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldStateProfile,state);
    }

    public void
    enterCountryProfileTab(String country) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldCountryProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldCountryProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldCountryProfile,country);
    }

    public void enterZipProfileTab(String zip) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldZipProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldZipProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldZipProfile,zip);
    }

    public void editSexChoice() {
     if (applicantFlowPage.buttonMaleSex.isSelected()){
           CommonUtils.clickOnElement(applicantFlowPage.buttonFemaleSex);
       } else {
           CommonUtils.clickOnElement(applicantFlowPage.buttonMaleSex);
       }
    }

    public void editEthnicityChoice() {
        if (applicantFlowPage.buttonHispanicOrLatino.isSelected()){
            CommonUtils.clickOnElement(applicantFlowPage.buttonNotHispanicOrLatino);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonHispanicOrLatino);
        }
    }

    public void editRaceChoice() {
        if (applicantFlowPage.buttonAmericanIndianAlaskaNative.isSelected()){
            CommonUtils.clickOnElement(applicantFlowPage.buttonAsian);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonAmericanIndianAlaskaNative);
        }
    }

    public void editDisabilityChoice() {
        if (applicantFlowPage.buttonBlind.isSelected()){
            CommonUtils.clickOnElement(applicantFlowPage.buttonDeaf);
        } else {
            CommonUtils.clickOnElement(applicantFlowPage.buttonAmericanIndianAlaskaNative);
        }
    }
}
