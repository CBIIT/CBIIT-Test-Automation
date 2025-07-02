package CHARMS.scenariosData;

import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class NV_Subject_Flags_TestDataManager {
    public Map<String, String> TEST_DATA_FOR_NV_SUBJECT_FLAGS;

    public String PARTICIPATION_STATUS;
    public String ELIGIBLE_FOR_CLINIC;
    public String INDIVIDUAL_AFFECTED_STATUS;
    public String INDIVIDUAL_GENETIC_STATUS;
    public String FAMILY_GENETIC_STATUS;
    public String SUBJECT_COMMENTS;

    public void dataInitializerSubjectFlags(String sheetName) {
        if (sheetName.equals("screenerScenario2")) {
            TEST_DATA_FOR_NV_SUBJECT_FLAGS = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_TWO_DATA, "SubjectFlags");
        }
        PARTICIPATION_STATUS = TEST_DATA_FOR_NV_SUBJECT_FLAGS.get("Participation Status");
        ELIGIBLE_FOR_CLINIC = TEST_DATA_FOR_NV_SUBJECT_FLAGS.get("Eligible for Clinic");
        INDIVIDUAL_AFFECTED_STATUS = TEST_DATA_FOR_NV_SUBJECT_FLAGS.get("Individual Affected Status");
        INDIVIDUAL_GENETIC_STATUS = TEST_DATA_FOR_NV_SUBJECT_FLAGS.get("Individual Genetic Status");
        FAMILY_GENETIC_STATUS = TEST_DATA_FOR_NV_SUBJECT_FLAGS.get("Family Genetic Status");
        SUBJECT_COMMENTS = TEST_DATA_FOR_NV_SUBJECT_FLAGS.get("Subject Comments");
    }
}
