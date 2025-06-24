package CHARMS.scenariosData;

import APPS_COMMON.PageInitializers.PageInitializer;
import CHARMS.constants.CHARMS_Data_File_Path_Constants;
import com.nci.automation.utils.ExcelReader;
import java.util.Map;

public class NV_Clinic_Visits_TestDataManager extends PageInitializer {
    public Map<String, String> testDataForClinicVisit;
    public String name;
    public String dateOfBirth;
    public String study;
    public String visitType;
    public String status;
    public String clinicDate;
    public String primaryProvider;
    public String schedulingCoordinator;
    public String preclinicNoteComplete;
    public String coordinationWithOtherNIHProtocol;
    public String specifyNIHProtocolSpecialty;
    public String CRISOrderStatus;
    public String schedulingStatus;
    public String afterHoursEmergencyContactName;
    public String afterHoursEmergencyContactNumber;

    /**
     * FETCHING DATA FROM EXCEL BEFORE CREATING NEW CLINIC VISIT
     */
    public void dataInitializerClinicVisits(String sheetName) {
        if (sheetName.equals("screenerScenario2")) {
            testDataForClinicVisit = ExcelReader.excelIntoHashMap(CHARMS_Data_File_Path_Constants.RAS_SCENARIO_TWO_DATA, "ClinicVisit");
            name = testDataForClinicVisit.get("Name");
            dateOfBirth = testDataForClinicVisit.get("Date of Birth");
            study = testDataForClinicVisit.get("Study");
            visitType = testDataForClinicVisit.get("Visit Type");
            status = testDataForClinicVisit.get("Status");
            clinicDate = testDataForClinicVisit.get("Clinic Date");
            primaryProvider = testDataForClinicVisit.get("Primary Provider");
            schedulingCoordinator = testDataForClinicVisit.get("Scheduling Coordinator");
            preclinicNoteComplete = testDataForClinicVisit.get("Preclinic Note Complete");
            coordinationWithOtherNIHProtocol = testDataForClinicVisit.get("Coordination with Other NIH Protocol");
            specifyNIHProtocolSpecialty = testDataForClinicVisit.get("Specify NIH Protocol/Specialty");
            CRISOrderStatus = testDataForClinicVisit.get("CRIS Order Status");
            schedulingStatus = testDataForClinicVisit.get("Scheduling Status");
            afterHoursEmergencyContactName = testDataForClinicVisit.get("After Hours Emergency Contact Name");
            afterHoursEmergencyContactNumber = testDataForClinicVisit.get("After Hours Emergency Contact Number");
        }
    }
}