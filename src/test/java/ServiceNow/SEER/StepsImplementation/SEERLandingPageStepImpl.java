package ServiceNow.SEER.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class SEERLandingPageStepImpl extends PageInitializer {

    public static void theUserAttemptsToRequestResearchDataWithExistingEmailAddress(String existingEmailAddress) {
        CommonUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        seerLandingPage.researchDataRequestsEmailAddressField.sendKeys(existingEmailAddress);
        seerLandingPage.registerForResearchDataButton.click();
    }

    public static void userSeesTheFollowingHeaderAndMessagePopUpWithLinks(String expectedHeaderText, String expectedParagraph) {
        CommonUtils.waitForVisibility(seerExistingAccountPage.headerText);
        String actualHeaderText = seerExistingAccountPage.headerText.getText();
        JavascriptUtils.drawBlueBorder(seerExistingAccountPage.headerText);
        CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);
        String actualParagraphText = seerExistingAccountPage.paragraph.getText();
        JavascriptUtils.drawBlueBorder(seerExistingAccountPage.paragraph);
        CommonUtils.assertEquals(actualParagraphText, expectedParagraph);
        CucumberLogUtils.logScreenShot();
    }

    public static void userSeesTheFollowingPIVCardLoginMessage(String expectedPIVCardLoginMessage) {
        String actualPIVCardLoginMessageText = seerExistingAccountPage.pIVCardLoginMessageText.getText();
        JavascriptUtils.drawBlueBorder(seerExistingAccountPage.pIVCardLoginMessageText);
        CommonUtils.assertEquals(actualPIVCardLoginMessageText, expectedPIVCardLoginMessage);
        CucumberLogUtils.logScreenShot();
    }

    public static void buttonIsAlsoDisplayed(String expectedButtonText) {
        String actualButtonText = seerExistingAccountPage.backToSeerDatabaseDetailsButton.getText();
        JavascriptUtils.drawBlueBorder(seerExistingAccountPage.backToSeerDatabaseDetailsButton);
        CommonUtils.assertEquals(actualButtonText, expectedButtonText);
        CucumberLogUtils.logScreenShot();
    }

    public static void theSEERDataAccessLandingPageHasTheFollowingTextDisplayed(String expectedLandingPageText) {
        String actualLandingPageText = seerLandingPage.landingPageText.getText();
        CommonUtils.assertEquals(actualLandingPageText, expectedLandingPageText);
        JavascriptUtils.scrollDown(300);
        JavascriptUtils.drawBlueBorder(seerLandingPage.landingPageText);
        CucumberLogUtils.logScreenShot();
    }
}