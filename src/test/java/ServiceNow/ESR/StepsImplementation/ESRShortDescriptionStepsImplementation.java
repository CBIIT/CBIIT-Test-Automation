package ServiceNow.ESR.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;

public class ESRShortDescriptionStepsImplementation extends PageInitializer {

    public static void findShortDescriptionFields(String expectedIDField, String expectedStageField) {
        esrTicketCreationPage.linkToNewESRTicket.click();
        String actualIDField = esrShortDescriptionPage.esrIDFieldText.getText();
        CommonUtils.assertEquals(actualIDField, expectedIDField);

    }
}
