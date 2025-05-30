package CHARMS.scenariosData;

import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class NV_New_Appointment_TestDataManager extends PageInitializer {
    public Map<String, String> testDataForNewAppointment;
    public String name;
    public String study;
    public String appointment;
    public String otherAppointmentSpecify;
    public String duration;
    public String location;
    public String otherLocationSpecify;
    public String provider;
    public String status;
    public String statusDate;
    public String reportStatus;
    public String otherReportStatusSpecify;
    public String scheduledDateTime;
    public String notes;

    /**
     * FETCHING DATA FROM EXCEL BEFORE CREATING NEW APPOINTMENT
     */
    public void dataInitializerClinicVisits(String sheetName) {
        if (sheetName.equals("screenerScenario2")) {
            testDataForNewAppointment = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_TWO_DATA, "NewAppointment");
            name = testDataForNewAppointment.get("Name");
            study = testDataForNewAppointment.get("Study");
            appointment = testDataForNewAppointment.get("Appointment");
            otherAppointmentSpecify = testDataForNewAppointment.get("Other Appointment (Specify)");
            duration = testDataForNewAppointment.get("Durations (hours)");
            location = testDataForNewAppointment.get("Location");
            otherLocationSpecify = testDataForNewAppointment.get("Other Location (Specify)");
            provider = testDataForNewAppointment.get("Provider");
            status = testDataForNewAppointment.get("Status");
            statusDate = testDataForNewAppointment.get("Status Date");
            reportStatus = testDataForNewAppointment.get("Report Status");
            otherReportStatusSpecify = testDataForNewAppointment.get("Other Report Status (Specify)");
            scheduledDateTime = testDataForNewAppointment.get("Scheduled Date/Time");
            notes = testDataForNewAppointment.get("Notes");
        }
    }
}