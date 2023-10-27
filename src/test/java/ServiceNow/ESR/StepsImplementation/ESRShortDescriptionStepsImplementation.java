package ServiceNow.ESR.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;

public class ESRShortDescriptionStepsImplementation extends PageInitializer {

    public static void findShortDescriptionFields(String expectedIDField, String expectedStageField) {
        esrTicketCreationPage.linkToNewESRTicket.click();
        String actualIDField = esrShortDescriptionPage.esrIDFieldText.getText();
        CommonUtils.assertEquals(actualIDField, expectedIDField);
        String actualStageField = esrShortDescriptionPage.stageFieldText.getText();
        CommonUtils.assertEquals(actualIDField, expectedStageField);
        CucumberLogUtils.logScreenshot();
    }

    public static void findShortDescriptionFieldsTwo(String expectedIDField, String expectedProjectField) {
        esrTicketCreationPage.linkToNewESRTicket.click();
        String actualIDField = esrShortDescriptionPage.esrIDFieldText.getText();
        CommonUtils.assertEquals(actualIDField, expectedIDField);
        String actualProjectField = esrShortDescriptionPage.projectNameFieldText.getText();
        CommonUtils.assertEquals(actualProjectField, expectedProjectField);
        CucumberLogUtils.logScreenshot();
    }
}
