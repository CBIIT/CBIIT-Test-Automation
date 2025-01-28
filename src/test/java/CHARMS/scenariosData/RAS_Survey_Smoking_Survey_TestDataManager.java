package CHARMS.scenariosData;

import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class RAS_Survey_Smoking_Survey_TestDataManager extends PageInitializer {

    /*
     * SMOKING SURVEY VARIABLES
     */
    public Map<String, String> TEST_DATA_FOR_RAS_SMOKING_SURVEY;
    public String HAVE_YOU_EVER_USED_ANY_OF_THESE_TOBACCO_PRODUCTS_EVEN_ONCE_SELECT_ALL_THAT_APPLY;
    public String HOW_MANY_CIGARETTES_HAVE_YOU_SMOKED_IN_YOUR_LIFE_PROVIDE_AN_ESTIMATE;
    public String HOW_OLD_WERE_YOU_WHEN_YOU_FIRST_SMOKED_A_CIGARETTE;
    public String HOW_OLD_WERE_YOU_WHEN_YOU_STARTED_SMOKING_CIGARETTES_ON_A_REGULAR_BASIS;
    public String ON_DAYS_THAT_YOU_SMOKE_SMOKED_HOW_MANY_CIGARETTES_DO_DID_YOU_SMOKE_PER_DAY;

    /**
     * Initializes data for the Smoking Survey from an Excel sheet.
     *
     * @param sheetName the name of the Excel sheet containing the data
     */
    public void dataInitializerSmokingSurvey(String sheetName) {
        TEST_DATA_FOR_RAS_SMOKING_SURVEY = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SMOKING_SURVEY, sheetName);
        HAVE_YOU_EVER_USED_ANY_OF_THESE_TOBACCO_PRODUCTS_EVEN_ONCE_SELECT_ALL_THAT_APPLY = TEST_DATA_FOR_RAS_SMOKING_SURVEY.get("Have you ever used any of these tobacco products, even once? Select all that apply.");
        HOW_MANY_CIGARETTES_HAVE_YOU_SMOKED_IN_YOUR_LIFE_PROVIDE_AN_ESTIMATE = TEST_DATA_FOR_RAS_SMOKING_SURVEY.get("How many cigarettes have you smoked in your life? Provide an estimate.");
        HOW_OLD_WERE_YOU_WHEN_YOU_FIRST_SMOKED_A_CIGARETTE = TEST_DATA_FOR_RAS_SMOKING_SURVEY.get("How old were you when you first smoked a cigarette?");
        HOW_OLD_WERE_YOU_WHEN_YOU_STARTED_SMOKING_CIGARETTES_ON_A_REGULAR_BASIS = TEST_DATA_FOR_RAS_SMOKING_SURVEY.get("How old were you when you started smoking cigarettes on a regular basis?");
        ON_DAYS_THAT_YOU_SMOKE_SMOKED_HOW_MANY_CIGARETTES_DO_DID_YOU_SMOKE_PER_DAY = TEST_DATA_FOR_RAS_SMOKING_SURVEY.get("On days that you [smoke/smoked], how many cigarettes [do/did] you smoke per day? Please provide the number of cigarettes, not the number of packs.");
    }
}
