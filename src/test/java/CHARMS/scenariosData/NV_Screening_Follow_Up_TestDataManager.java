package CHARMS.scenariosData;

import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class NV_Screening_Follow_Up_TestDataManager {
    public Map<String, String> TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP;
    public String STUDY;
    public String SITE;
    public String TASK_NAME;
    public String STATUS;
    public String STATUS_DATE;
    public String DUE_DATE;
    public String EVENT_TYPE;
    public String DURATION_HOURS;
    public String STAFF;
    public String DATE_TIME;
    public String LOCATION;
    public String REPORT_STATUS;
    public String OTHER_REPORT_STATUS_SPECIFY;
    public String REPORT_STATUS_DATE;
    public String MEDIA_STATUS;
    public String OTHER_MEDIA_STATUS_SPECIFY;
    public String MEDIA_STATUS_DATE;
    public String SCREENING_REMINDER_1_DATE;
    public String SCREENING_REMINDER_1_STATUS;
    public String OTHER_REMINDER_1_STATUS;
    public String SCREENING_REMINDER_2_DATE;
    public String SCREENING_REMINDER_2_STATUS;
    public String OTHER_REMINDER_2_STATUS;
    public String SCREENING_REMINDER_3_DATE;
    public String SCREENING_REMINDER_3_STATUS;
    public String OTHER_REMINDER_3_STATUS;

    public void dataInitializerScreeningFollowUp(String sheetName) {
        if (sheetName.equals("screenerScenarioAdult")) {
            TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_ADULT, "ScreeningFollowUp");
        }
        STUDY = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Study");
        SITE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Site");
        TASK_NAME = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Task Name");
        STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Status");
        STATUS_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Status Date");
        DUE_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Due Date");
        EVENT_TYPE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Event Type");
        DURATION_HOURS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Duration (hours)");
        STAFF = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Staff");
        DATE_TIME = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Date/Time");
        LOCATION = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Location");
        REPORT_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Report Status");
        OTHER_REPORT_STATUS_SPECIFY = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Other Report Status (specify)");
        REPORT_STATUS_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Report Status Date");
        MEDIA_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Media Status");
        OTHER_MEDIA_STATUS_SPECIFY = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Other Media Status (specify)");
        MEDIA_STATUS_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Media Status Date");
        SCREENING_REMINDER_1_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Screening Reminder 1 Date");
        SCREENING_REMINDER_1_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Screening Reminder 1 Status");
        OTHER_REMINDER_1_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Other Reminder 1 Status");
        SCREENING_REMINDER_2_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Screening Reminder 2 Date");
        SCREENING_REMINDER_2_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Screening Reminder 2 Status");
        OTHER_REMINDER_2_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Other Reminder 2 Status");
        SCREENING_REMINDER_3_DATE = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Screening Reminder 3 Date");
        SCREENING_REMINDER_3_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Screening Reminder 3 Status");
        OTHER_REMINDER_3_STATUS = TEST_DATA_FOR_NV_SCREENING_FOLLOW_UP.get("Other Reminder 3 Status");
    }
}