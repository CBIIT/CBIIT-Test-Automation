package CHARMS.steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Then;
import static APPS_COMMON.PageInitializers.PageInitializer.nativeViewCHARMSClinicVisitsPage;
import static APPS_COMMON.PageInitializers.PageInitializer.nativeViewCHARMSParticipantDetailsPage;

public class NativeViewClinicVisitsSteps {

    /**
     * Study Team member opens PD record, navigates to the Clinic Visits related list, and creates a new Clinic Visit.
     */
    @Then("Study Team member navigates to the Clinic Visits related list and creates new Clinic Visit")
    public void study_team_member_navigates_to_the_clinic_visits_related_list_and_creates_new_clinic_visit() {
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.clinicVisitsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.clinicVisitsTab);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantDetailsPage.newClinicVisitButton);
        nativeViewCHARMSParticipantDetailsPage.newClinicVisitButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.studyInputField.clear();
        nativeViewCHARMSClinicVisitsPage.studyInputField.sendKeys("RASopathy");
        CommonUtils.selectDropDownValue("Annual", nativeViewCHARMSClinicVisitsPage.visitTypeDropdown);
        CommonUtils.selectDropDownValue("Appointment Made", nativeViewCHARMSClinicVisitsPage.statusDropdown);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarButton.click();
        CommonUtils.sleep(500);
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton);
        nativeViewCHARMSClinicVisitsPage.clinicDateCalendarTodayButton.click();
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        nativeViewCHARMSClinicVisitsPage.primaryProviderInputField.clear();
        nativeViewCHARMSClinicVisitsPage.primaryProviderInputField.sendKeys("Lauren Black");
        CommonUtils.sleep(300);
        nativeViewCHARMSClinicVisitsPage.schedulingCoordinatorInputField.clear();
        nativeViewCHARMSClinicVisitsPage.schedulingCoordinatorInputField.sendKeys("Hodalis Gaytan");
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSClinicVisitsPage.preclinicNoteCompleteDropdown);
        CommonUtils.selectDropDownValue("Yes", nativeViewCHARMSClinicVisitsPage.coordinationWithOtherNihProtocolDropdown);
        CommonUtils.waitForClickability(nativeViewCHARMSClinicVisitsPage.specifyNihProtocolInputField);
        nativeViewCHARMSClinicVisitsPage.specifyNihProtocolInputField.sendKeys("Testing");
        CommonUtils.selectDropDownValue("In Progress", nativeViewCHARMSClinicVisitsPage.crisOrderStatusDropdown);
        CommonUtils.selectDropDownValue("In Progress", nativeViewCHARMSClinicVisitsPage.scheduleStatusDropdown);
        nativeViewCHARMSClinicVisitsPage.afterHoursEmergencyContactNameDropdown.sendKeys("Test Contact");
        nativeViewCHARMSClinicVisitsPage.afterHoursEmergencyContactNumberDropdown.sendKeys("703-687-5816");
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }
}