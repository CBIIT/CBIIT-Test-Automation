package ServiceNow.CHARMS.StepsImplementation.RASStudy;

import ServiceNow.CHARMS.Pages.RAS_Screener_Page;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static ServiceNow.CHARMS.Pages.RAS_Screener_Page.dynamicLocator;

public class RAS_Screener_Submissions_StepsImpl extends PageInitializer {

    public void screener_submissions() {

        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(myRASSurveyPage.rasSurveyThisCopyText);
        //ASSERTING THAT THIS IS THE COPY FOR LOWER ENVIRONMENTS ONLY!!! MESSAGE DISPLAYS
        Assert.assertEquals(myRASSurveyPage.rasSurveyThisCopyText.getText(), ras_Screener_Constants.THIS_IS_A_COPY);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenshot();
        ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
        MiscUtils.sleep(2000);
        if (!rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.isDisplayed()) {
            ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
        }

        /**
         * * * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *
         */

        if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you completing this form for someone else or for yourself?")) {
            CucumberLogUtils.scenario.log("* * * * ARE YOU COMPLETING THIS FORM FOR SOMEONE ELSE OR FOR YOURSELF? * * * *");
            dynamicLocator(ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself).click();
            CucumberLogUtils.logScreenshot();
            if (ras_Screener_TestDataManager.areYouCompletingThisFormForSomeoneElseOrYourself.contentEquals("I am completing this form for myself")) {
                CucumberLogUtils.scenario.log("* * * THIS IS A SELF SCREENER SUBMISSION * * *");

                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                /**
                 * * * * * * ENTERING FIRST NAME, MIDDLE INITIAL, LAST NAME FOR * * WHAT IS YOUR NAME? * * * * *
                 */

                try {
                    if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your name?")) {
                        CucumberLogUtils.scenario.log("* * * * * ENTERING FIRST NAME, MIDDLE INITIAL, LAST NAME * * * * *");
                        rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.FIRST_NAME).sendKeys(ras_Screener_TestDataManager.firstName);
                        rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.MIDDLE_INITIAL).sendKeys(ras_Screener_TestDataManager.middleInitial);
                        rasopathyQuestionnairePage.dynamicTextBoxLocator(ras_Screener_Constants.LAST_NAME).sendKeys(ras_Screener_TestDataManager.lastName);
                        CucumberLogUtils.logScreenshot();
                    }
                } catch (Exception e) {
                    CucumberLogUtils.scenario.log("* * * * FIRST NAME, MIDDLE INITIAL, LAST NAME PAGE FOR WHAT IS YOUR NAME NOT DISPLAYED * * TEST CONTINUES * * * *");
                }
                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();
                CucumberLogUtils.logScreenshot();
                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();

                /**
                 * * * * * * WHAT IS YOUR DATE OF BIRTH? * * * * *
                 */
                try {
                    if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What is your date of birth?")) {
                        CucumberLogUtils.scenario.log("* * * * * WHAT IS YOUR DATE OF BIRTH? * * * * *");
                        CommonUtils.selectDropDownValue(ras_Screener_TestDataManager.dateOfBirthMonth, rasopathyQuestionnairePage.calendarMonthDropDown);
                        rasopathyQuestionnairePage.calendarYearTextBox.clear();
                        rasopathyQuestionnairePage.calendarYearTextBox.sendKeys(ras_Screener_TestDataManager.dateOfBirthYear);
                        RAS_Screener_Page.dynamicDateOfBirthCalendarLocator(ras_Screener_TestDataManager.whatIsYourDateOfBirth).click();
                        CucumberLogUtils.logScreenshot();
                    }
                } catch (Exception e) {
                    CucumberLogUtils.scenario.log("* * * * WHAT IS YOUR DATE OF BIRTH? QUESTION NOT DISPLAYED * * TEST CONTINUES * * * *");
                }
                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();

                /**
                 * * * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * * *
                 */
                try {
                    if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("What was your sex assigned at birth?")) {
                        CucumberLogUtils.scenario.log("* * * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH? * * * * * ");
                        dynamicLocator(ras_Screener_TestDataManager.sexAssignedAtBirthOption).click();
                        CucumberLogUtils.logScreenshot();
                    }
                } catch (NoSuchElementException e) {
                    CucumberLogUtils.scenario.log("* * * * WHAT WAS YOUR SEX ASSIGNED AT BIRTH QUESTION NOT DISPLAYED * * TEST CONTINUES * * * *");
                }
                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();

                /**
                 * * * * * * ARE YOU ADOPTED? * * * * *
                 */

                try {
                    if (rasopathyQuestionnairePage.question.isDisplayed() && rasopathyQuestionnairePage.question.getText().contentEquals("Are you adopted?")) {
                        dynamicLocator(ras_Screener_TestDataManager.areYouAdoptedOption).click();
                        CucumberLogUtils.logScreenshot();
                    }
                } catch (NoSuchElementException e) {
                    CucumberLogUtils.scenario.log("* * * * ARE YOU ADOPTED QUESTION NOT DISPLAYED * * TEST CONTINUES * * * *");
                }
                ras_scenario_one_stepsImpl.clickOnScreenerNextButton();

            }
        }
    }

}
