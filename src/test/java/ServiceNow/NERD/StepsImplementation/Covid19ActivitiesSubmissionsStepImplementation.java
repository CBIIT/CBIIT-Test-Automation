package ServiceNow.NERD.StepsImplementation;

import ServiceNow.NERD.Pages.Covid19ActivitiesSubmissionsPage;
import ServiceNow.NERD.Steps.HooksSteps;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class Covid19ActivitiesSubmissionsStepImplementation extends PageInitializer {
    /**
     * This method will verify that Checkbox options are Displayed
     *
     * @param priority1ImproveFundamentalKnowledge
     * @param priority2AdvanceResearchToImproveDetection
     * @param priority3SupportToAdvanceTreatment
     * @param priority4AccelerateResearchToImprovePrevention
     * @param priority5PreventAndRedressPoorCOVID19Outcomes
     * @param other
     */
    public static void covid19StrategicPlanCheckBoxOptionsAreAlsoDisplayed(String priority1ImproveFundamentalKnowledge, String priority2AdvanceResearchToImproveDetection,
                                                                           String priority3SupportToAdvanceTreatment, String priority4AccelerateResearchToImprovePrevention,
                                                       String priority5PreventAndRedressPoorCOVID19Outcomes, String other) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText);
        String[] expectedCheckBoxesValues = {priority1ImproveFundamentalKnowledge, priority2AdvanceResearchToImproveDetection, priority3SupportToAdvanceTreatment,
                priority4AccelerateResearchToImprovePrevention, priority5PreventAndRedressPoorCOVID19Outcomes, other};
        String[] actualCheckBoxesValue = new String[expectedCheckBoxesValues.length];
        for (int i = 0; i < actualCheckBoxesValue.length; i++) {
            actualCheckBoxesValue[i] = covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanCheckBoxes.get(i)
                    .getText();
          CommonUtils.clickOnElement(Covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanCheckBoxesSingleElement(actualCheckBoxesValue[i]));
        }
        for (int j = 0; j < actualCheckBoxesValue.length; j++) {
            JavascriptUtils.drawBlueBorder(covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanCheckBoxes.get(j));
            CommonUtils.assertEquals(expectedCheckBoxesValues[j], actualCheckBoxesValue[j]);
        }
        MiscUtils.sleep(500);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
}