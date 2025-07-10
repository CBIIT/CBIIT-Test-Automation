package CHARMS.scenariosData;

import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class RAS_NV_Consent_Record_TestDataManager extends PageInitializer {

    /**
     * NATIVE VIEW CONSENT RECORD VARIABLES
     */
    public Map<String, String> TEST_DATA_FOR_NV_CONSENT_RECORD;
    public String STUDY;
    public String CONSENT_DATE;
    public String CONSENT_BY;
    public String ASSIGNED_TO;
    public String CURRENT_PREVIOUS;
    public String CONSENT_CALL_SCHEDULED_TIME;
    public String CONSENT_CALL_DATE;
    public String SHORT_FORM_CONSENT;
    public String INTERPRETER_USED;
    public String INTERPRETER_NAME_OR_ID;
    public String INTERPRETER_LANGUAGE;
    public String INTERPRETER_WITNESS;
    public String INTERPRETER_SIGNED;
    public String COPY_OF_CONSENT_ASSENT_PROVIDED_BEFORE_SIGNING;
    public String PROTOCOL_DISCUSSED_IN_PRIVATE_SETTING;
    public String PARTICIPANT_VERBALIZED_UNDERSTANDING_OF_STUDY_CONDITIONS_AND_PARTICIPATION;
    public String QUESTIONS_ADDRESSED_BEFORE_SIGNING;
    public String CONSENT_ASSENT_OBTAINED_BEFORE_STUDY_PROCEDURES;
    public String COPY_OF_SIGNED_DATED_CONSENT_ASSENT_GIVEN_TO_PARTICIPANT;
    public String COHORT;
    public String CONSENT_FORM;
    public String COLLECTION_METHOD;
    public String CONSENT_VERSION;
    public String NOT_DEVELOPMENTALLY_ABLE_TO_GIVE_ASSENT;
    public String LEGAL_DOCUMENTATION_RECEIVED;
    public String CONSENT_ASSENT_STATUS;
    public String CONSENT_ASSENT_CATEGORY;
    public String PARENT_GUARDIAN_STATUS;
    public String NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED;
    public String PARENT_GUARDIAN_1_SIGNED;
    public String PARENT_GUARDIAN_1_NAME;
    public String PARENT_GUARDIAN_2_SIGNED;
    public String PARENT_GUARDIAN_2_NAME;
    public String NUMBER_OF_LARS;
    public String LAR_1_SIGNED;
    public String LAR_1_NAME;
    public String LAR_2_SIGNED;
    public String LAR_2_NAME;
    public String FUTURE_USE_OF_SPECIMENS_AND_DATA_BY_NIH;
    public String FUTURE_USE_BY_COLLABORATORS;
    public String FUTURE_IDENTIFIABLE_USE_BY_COLLABORATORS;
    public String RETURN_OF_GENETIC_FINDINGS;
    public String CREATED;
    public String SENT_TO_MEDIDATA;
    public String ASSENT_SIGNED;

    public void dataInitializerRasConsentRecord(String sheetName) {

        /**
         * FETCHING DATA FROM EXCEL SHEET BEFORE SUBMITTING CONSENT CALL
         */
        if (sheetName.equals("screenerScenarioAdult")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_ADULT, "Consent");
        }
        if (sheetName.equals("screenerScenario2")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_TWO_DATA, "Consent");
        }
        if (sheetName.equals("screenerScenarioAdult-NeedsLAR")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_ADULT_NEEDS_LAR, "Consent");
        }
        if (sheetName.equals("screenerScenarioAgeUnder7")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_UNDER_7, "Consent");
        }
        if (sheetName.equals("screenerScenarioAge7-10")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_7_10_DATA, "Consent");
        }
        if (sheetName.equals("screenerScenarioAge11-13")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_11_13_DATA, "Consent");
        }
        if (sheetName.equals("screenerScenarioAge14-17")) {
            TEST_DATA_FOR_NV_CONSENT_RECORD = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_AGE_14_17_DATA, "Consent");
        }
        CONSENT_CALL_SCHEDULED_TIME = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent call scheduled time");
        CONSENT_CALL_DATE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Call Date");
        COHORT = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Cohort");
        CONSENT_FORM = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Form");
        COLLECTION_METHOD = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Collection Method");
        CONSENT_VERSION = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Version");
        CONSENT_ASSENT_STATUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent/Assent Status");
        CONSENT_ASSENT_CATEGORY = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent/Assent Category");
        PARENT_GUARDIAN_STATUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian Status");
        NUMBER_OF_GUARDIAN_SIGNATURES_REQUIRED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Number of Guardian Signatures required");
        LEGAL_DOCUMENTATION_RECEIVED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Legal Documentation Received");
        NOT_DEVELOPMENTALLY_ABLE_TO_GIVE_ASSENT = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Not developmentally able to give assent");
        PARENT_GUARDIAN_1_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian 1 Signed");
        PARENT_GUARDIAN_1_NAME = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian 1 Name");
        PARENT_GUARDIAN_2_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian 2 Signed");
        PARENT_GUARDIAN_2_NAME = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Parent/Guardian 2 Name");
        NUMBER_OF_LARS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Number of LARs");
        LAR_1_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("LAR 1 Signed");
        LAR_1_NAME = TEST_DATA_FOR_NV_CONSENT_RECORD.get("LAR 1 Name");
        LAR_2_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("LAR 2 Signed");
        LAR_2_NAME = TEST_DATA_FOR_NV_CONSENT_RECORD.get("LAR 2 Name");
        ASSIGNED_TO = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Assigned to");
        CONSENT_DATE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent Date");
        CONSENT_BY = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent By");
        CURRENT_PREVIOUS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Current/Previous");
        STUDY = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Study");
        COPY_OF_CONSENT_ASSENT_PROVIDED_BEFORE_SIGNING = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Copy of Consent/Assent Provided Before Signing");
        PROTOCOL_DISCUSSED_IN_PRIVATE_SETTING = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Protocol Discussed in Private Setting");
        PARTICIPANT_VERBALIZED_UNDERSTANDING_OF_STUDY_CONDITIONS_AND_PARTICIPATION = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Participant Verbalized Understanding of Study Conditions and Participation");
        QUESTIONS_ADDRESSED_BEFORE_SIGNING = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Questions Addressed Before Signing");
        CONSENT_ASSENT_OBTAINED_BEFORE_STUDY_PROCEDURES = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Consent/Assent Obtained Before Study Procedures");
        COPY_OF_SIGNED_DATED_CONSENT_ASSENT_GIVEN_TO_PARTICIPANT = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Copy of Signed/Dated Consent/Assent Given to Participant");
        SHORT_FORM_CONSENT = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Short Form Consent");
        INTERPRETER_USED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter used?");
        INTERPRETER_NAME_OR_ID = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter Name or ID");
        INTERPRETER_LANGUAGE = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter Language");
        INTERPRETER_WITNESS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter Witness?");
        INTERPRETER_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Interpreter Signed");
        FUTURE_USE_OF_SPECIMENS_AND_DATA_BY_NIH = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Future Use of Specimens and Data by NIH");
        FUTURE_USE_BY_COLLABORATORS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Future Use by Collaborators");
        FUTURE_IDENTIFIABLE_USE_BY_COLLABORATORS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Future Identifiable Use by Collaborators");
        RETURN_OF_GENETIC_FINDINGS = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Return of Genetic Findings");
        CREATED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Created");
        SENT_TO_MEDIDATA = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Sent to Medidata");
        ASSENT_SIGNED = TEST_DATA_FOR_NV_CONSENT_RECORD.get("Assent signed");
    }
}