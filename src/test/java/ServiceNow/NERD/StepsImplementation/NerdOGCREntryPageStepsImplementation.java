package ServiceNow.NERD.StepsImplementation;

import ServiceNow.NERD.Pages.NERDOGCRAddNewEntryPage;
import ServiceNow.NERD.Steps.HooksSteps;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;

public class NerdOGCREntryPageStepsImplementation extends PageInitializer {

    public static void newEntrySpecialTopicDropDownValues(String DDValuePayline, String bigDataDataSharing,
                                                          String CCDI, String COVID19, String healthDisparities, String lowDoseRadiation,
                                                          String mCDEarlyDetection, String moonshot, String pediatric, String rare, String sTARAct, String survivorship) {
        String[] expectedSpecialTopicValues = {DDValuePayline, bigDataDataSharing, CCDI, COVID19, healthDisparities,
                lowDoseRadiation, mCDEarlyDetection, moonshot, pediatric, rare, sTARAct, survivorship};
        String[] actualSpecialTopicValue = new String[expectedSpecialTopicValues.length];
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopic);
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopic);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDown, Keys.ENTER);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        for (int i = 1; i < actualSpecialTopicValue.length - 1; i++) {
            actualSpecialTopicValue[i - 1] = NERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDownValues("" + i).getText();
        }
        for (int j = 1; j < actualSpecialTopicValue.length - 1; j++) {
            JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDownValues("" + j ));
            CommonUtils.assertEqualsWithMessage(expectedSpecialTopicValues[j - 1], actualSpecialTopicValue[j - 1], "Verify NERD OGCR new Entry Special Topic Drop Down Values");
        }
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
}
