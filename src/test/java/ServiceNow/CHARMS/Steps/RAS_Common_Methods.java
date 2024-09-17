package ServiceNow.CHARMS.Steps;

import static ServiceNow.CHARMS.StepsImplementation.RASStudy.RAS_Screener_Submissions_StepsImpl.rasScreenerSubmissions;
import static appsCommon.PageInitializers.PageInitializer.rasScenario3StepsImpl;
import static appsCommon.PageInitializers.PageInitializer.ras_Screener_TestDataManager;

public class RAS_Common_Methods {

    /***
     * THIS METHOD WILL SELECT THE SCREENER SUBMISSION ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     */
    public void rasScreenerScenarioSelector(String sheetName) {
        if (sheetName.contentEquals("screenerScenario1")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
        } else if (sheetName.contentEquals("screenerScenario2")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScreenerSubmissions(sheetName);
//             rasScenario2StepsImpl.rasScreenerSubmissionScenario2();
        } else if (sheetName.contentEquals("screenerScenario3")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
            rasScenario3StepsImpl.rasScreenerSubmissionScenario3();
        } else if (sheetName.contentEquals("screenerScenario4")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
//            rasScenario4StepsImpl.rasScreenerSubmissionScenario4();
        } else if (sheetName.contentEquals("screenerScenario5")) {
            ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
//            ras_scenario_five_stepsImpl.ras_screener_submission_five();
        }
    }
}
