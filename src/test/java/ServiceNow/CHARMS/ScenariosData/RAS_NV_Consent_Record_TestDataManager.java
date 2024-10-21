package ServiceNow.CHARMS.ScenariosData;

import ServiceNow.CHARMS.Constants.CHARMS_Data_File_Path_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class RAS_NV_Consent_Record_TestDataManager extends PageInitializer {

    /**
     * NATIVE VIEW CONSENT RECORD VARIABLES
     */
    public Map<String, String> TEST_DATA_FOR_NV_CONSENT_RECORD;
    public String CONSENT_CALL_SCHEDULED_TIME;
    public String CONSENT_CALL_DATE;
    public String COHORT;
    public String CONSENT_FORM;
    public String CONSENT_VERSION;
    public String CONSENT_TYPE;
    public String RESPONSE_TYPE;
    public String PARENT_GUARDIAN_STATUS;
    public String LEGAL_DOCUMENTATION_RECEIVED;
    public String NOT_DEVELOPMENTALLY_ABLE_TO_GIVE_ASSENT;
    public String PARENT_GUARDIAN_1_SIGNED;
    public String PARENT_GUARDIAN_2_SIGNED;
    public String CONSENT_STATUS;
    public String CONSENT_DATE;
    public String CONSENT_BY;
    public String CURRENT_PREVIOUS;
    public String STUDY;
    public String INTERPRETER_USED;
    public String CONSENT_ASSENT_STATUS;
    public String INTERPRETER_WITNESS;
    public String INTERPRETER_SIGNED;
    public String FUTURE_USE_OF_SPECIMENS_AND_DATA_BY_NIH;
    public String FUTURE_USE_BY_COLLABORATORS;
    public String FUTURE_IDENTIFIABLE_USE_BY_COLLABORATORS;
    public String RETURN_OF_GENETIC_FINDINGS;
    public String CREATED;
    public String SENT_TO_MEDIDATA;

    public void dataInitializerRasConsentRecord(String sheetName) {
        /**
         * FETCHING DATA FROM EXCEL SHEET BEFORE SUBMITTING CONSENT CALL
         */
        if (sheetName.equals("rasAdultConsentRecord")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_ADULT, sheetName);
        }
        if (sheetName.equals("screenerScenarioAdult-NeedsLAR")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_ADULT_NEEDS_LAR, sheetName);
        }
        if (sheetName.equals("screenerScenarioAgeUnder7")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_UNDER_7, sheetName);
        }
        if (sheetName.equals("screenerScenarioAge7-10")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_7_10_DATA, sheetName);
        }
        if (sheetName.equals("screenerScenarioAge11-13")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_11_13_DATA, sheetName);
        }
        if (sheetName.equals("screenerScenarioAge14-17")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_14_17_DATA, sheetName);
        }

        CONSENT_CALL_SCHEDULED_TIME = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent call scheduled time");
        CONSENT_CALL_DATE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Call Date");
        COHORT = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Cohort");
        CONSENT_FORM = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Form");
        CONSENT_VERSION = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Version");
        CONSENT_TYPE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Type");
        RESPONSE_TYPE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Response Type");
        PARENT_GUARDIAN_STATUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian Status");
        LEGAL_DOCUMENTATION_RECEIVED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Legal Documentation Received");
        NOT_DEVELOPMENTALLY_ABLE_TO_GIVE_ASSENT = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Not developmentally able to give assent");
        PARENT_GUARDIAN_1_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian 1 Signed");
        PARENT_GUARDIAN_2_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian 2 Signed");
        CONSENT_STATUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Status");
        CONSENT_DATE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Date");
        CONSENT_BY = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent By");
        CURRENT_PREVIOUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Current/Previous");
        STUDY = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Study");
        INTERPRETER_USED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter used?");
        CONSENT_ASSENT_STATUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent/Assent Status");
        INTERPRETER_WITNESS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter Witness?");
        INTERPRETER_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter Signed");
        FUTURE_USE_OF_SPECIMENS_AND_DATA_BY_NIH = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Future Use of Specimens and Data by NIH");
        FUTURE_USE_BY_COLLABORATORS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Future Use by Collaborators");
        FUTURE_IDENTIFIABLE_USE_BY_COLLABORATORS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Future Identifiable Use by Collaborators");
        RETURN_OF_GENETIC_FINDINGS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Return of Genetic Findings");
        CREATED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Created");
        SENT_TO_MEDIDATA = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Sent to Medidata");
    }
}
