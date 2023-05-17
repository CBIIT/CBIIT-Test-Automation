package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.DUA_Constants;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import ServiceNow.SEER.Constants.Registration_Constants;
import appsCommon.PageInitializer;

public class SEERDataAccessRequestPageStepsImpl extends PageInitializer {
    public static String newEmail = "seer" + CommonUtils.email;

    public void fillingOutRegistrationForm() {
        /* ENTERING FIRST NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);

        /* ENTERING LAST NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);

        /**
         * VERIFYING EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */
        Assert.assertEquals(newEmail,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        MiscUtils.sleep(1000);

        /* CLICKING ON ORGANIZATION DROP DOWN */
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);

        /* ENTERING ORGANIZATION NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
        MiscUtils.sleep(1000);

        /* ENTERING COUNTRY NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCountryField,
                Registration_Constants.COUNTRY_NAME);

        /* SELECTING COUNTRY OPTION */
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationCountryUSA);
        MiscUtils.sleep(1000);

        /* ENTERING STREET ADDRESS */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);

        /* ENTERING CITY NAME */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);

        /* ENTERING STATE */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, Registration_Constants.STATE);

        /* ENTERING ZIP CODE */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                Registration_Constants.ZIP_CODE);
        MiscUtils.sleep(1000);

        /* ENTERING PHONE NUMBER */
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /*
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue("General Public",
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void verifyingAgreements() {
        String actualTreatmentDataLimitationsAgreementText = seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement.getText();
        CommonUtils.assertEquals(actualTreatmentDataLimitationsAgreementText, DUA_Constants.SEER_ACKNOWLEDGMENT_OF_TREATMENT_DATA_LIMITATIONS);
        CucumberLogUtils.logScreenShot();

        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        String actualDataUseAgreementCertificationText = seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText();
        CommonUtils.assertEquals(actualDataUseAgreementCertificationText, DUA_Constants.DATA_USE_AGREEMENT_CERTIFICATION);
        CucumberLogUtils.logScreenShot();

        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        String actualDataAccessBestPracticeAssuranceText = seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText();
        CommonUtils.assertEquals(actualDataAccessBestPracticeAssuranceText, DUA_Constants.BEST_PRACTICE_ASSURANCE);
        CucumberLogUtils.logScreenShot();
    }
}
