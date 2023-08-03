package ServiceNow.CHARMS.Steps;

import appsCommon.DynamicLocators;
import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class RAS_Survey_Data_Verification_Steps extends PageInitializer {


    @Then("RAS Survey Data for Scenario One is verified")
    public void ras_survey_Data_for_scenario_one_is_verified() {
        /**
         * DATA VERIFICATION
         */

        /**
         * NAVIGATING TO RAS SURVEY TABLE
         */
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        JavascriptUtils.scrollIntoView(DynamicLocators.dynamicTextLocator("RASopathy Surveys"));
        CommonUtils.clickOnElement(DynamicLocators.dynamicTextLocator("RASopathy Surveys"));
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewIframe);
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label='Preview record: IIQ0001090']")).click();
        CommonUtils.clickOnElement(participantDetailsPage.openRecordButton);

        /**
         * EXAMPLE OF CLICKING ON TAB
         */
        CommonUtils.clickOnElement(ras_survey_native_view.dynamicTabLocator("RASopathy History"));

        /**
         *  ----- BEGINNING Basic information SECTION VALIDATION ----- DIEGO
         */

        /**
         *  ----- END Basic information SECTION VALIDATION ----- DIEGO
         */



        /**
         *  ----- BEGINNING DEMOGRAPHICS SECTION VALIDATION ----- HAMID
         */

        /**
         *  ----- END DEMOGRAPHICS SECTION VALIDATION ----- HAMID
         */


        /**
         *  ----- BEGINNING RASopathy History SECTION VALIDATION ----- ALENA
         */

        /**
         *  ----- END RASopathy History SECTION VALIDATION ----- ALENA
         */

        /**
         *  ----- BEGINNING Birth and Gestation SECTION VALIDATION ----- ALENA
         */

        /**
         *  ----- END Birth and Gestation SECTION VALIDATION ----- ALENA
         */

        /**
         *  ----- BEGINNING GROWTH SECTION VALIDATION ----- DIEGO
         */

        /**
         *  ----- END GROWTH SECTION VALIDATION ----- DIEGO
         */

    }

}