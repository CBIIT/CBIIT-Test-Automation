package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NativeViewGroupingsVerificationSteps extends PageInitializer {
	
	@Given("an internal user is logged into native view and searches for {string}")
	public void an_internal_user_is_logged_into_native_view_and_searches_for(String covidCodeApplication) throws TestingException {
	    nativeViewLoginImpl.nativeViewLogin();
	    nativeViewEnrollementsPage.filterNavigator.sendKeys(covidCodeApplication);
	    MiscUtils.sleep(3000);
	}

	@Then("the following groupings display:{string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void the_following_groupings_display(String adminGuide, String enrollmentAndFollowUp, String formsAssignedToMe, String covidCodeEnrollments, String myDraftEnrollments, String covidCodeFollowUps, String myDraftFollowUps, String diseaseCourse, String specimens, String covidCodeDashboard, String inquiryTracking, String covidCodeVolunteerSurveys, String covidCodeInquiryTracking, String myInquiryTrackingRecords, String inquiryTrackingDashboard, String institutionContactTracking, String covidCodeInstitutionContactTracking, String admin, String geCoCovidMultiSelectChoices, String hospitalCodes, String notifications) {
	    Assert.assertEquals(adminGuide, nativeViewEnrollementsPage.nativeViewPanelNavigatorAdminGuideLink.getText());
	    Assert.assertEquals(enrollmentAndFollowUp, nativeViewEnrollementsPage.nativeViewPanelNavigatorEnrollmentAndFollowUpLink.getText());
	    Assert.assertEquals(formsAssignedToMe, nativeViewEnrollementsPage.nativeViewPanelNavigatorFormsAssignedToMeLink.getText());
	    Assert.assertEquals(covidCodeEnrollments, nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeEnrollmentsLink.getText());
	    Assert.assertEquals(myDraftEnrollments, nativeViewEnrollementsPage.nativeViewPanelNavigatorMyDraftEnrollmentLink.getText());
	    Assert.assertEquals(covidCodeFollowUps, nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeFollowUpsLink.getText());
	    Assert.assertEquals(myDraftFollowUps, nativeViewEnrollementsPage.nativeViewPanelNavigatorMyDraftFollowUpsLink.getText());
	    Assert.assertEquals(diseaseCourse, nativeViewEnrollementsPage.nativeViewPanelNavigatorDiseaseCourseLink.getText());
	    Assert.assertEquals(specimens, nativeViewEnrollementsPage.nativeViewPanelNavigatorSpecimensLink.getText());
	    Assert.assertEquals(covidCodeDashboard, nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeDashboardLink.getText());
	    Assert.assertEquals(inquiryTracking, nativeViewEnrollementsPage.nativeViewPanelNavigatorInquiryTrackingLink.getText());
	    Assert.assertEquals(covidCodeVolunteerSurveys, nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeVolunteerSurveysLink.getText());
	    Assert.assertEquals(covidCodeInquiryTracking, nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInquiryTrackingLink.getText());
	    Assert.assertEquals(myInquiryTrackingRecords, nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink.getText());
	    Assert.assertEquals(inquiryTrackingDashboard, nativeViewEnrollementsPage.nativeViewPanelNavigatorInquiryTrackingDashboardLink.getText());
	    Assert.assertEquals(institutionContactTracking, nativeViewEnrollementsPage.nativeViewPanelNavigatorInstitutionContactTrackingLink.getText());
	    Assert.assertEquals(covidCodeInstitutionContactTracking, nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInstitutionContactTrackingLink.getText());
	    Assert.assertEquals(admin, nativeViewEnrollementsPage.nativeViewPanelNavigatorAdminLink.getText());
	    Assert.assertEquals(geCoCovidMultiSelectChoices, nativeViewEnrollementsPage.nativeViewPanelNavigatorGeCoCovidMultiSelectChoicesLink.getText());
	    Assert.assertEquals(hospitalCodes, nativeViewEnrollementsPage.nativeViewPanelNavigatorHospitalCodesLink.getText());
	    Assert.assertEquals(notifications, nativeViewEnrollementsPage.nativeViewPanelNavigatorNotificationsLink.getText());
	}

	@When("an internal user clicks on COVIDCode Enrollments")
	public void an_internal_user_clicks_on_COVIDCode_Enrollments() {
	    nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeEnrollmentsLink.click();
	    MiscUtils.sleep(3000);
	}

	@Then("a COVIDCode Enrollments table with a list of records displays")
	public void a_COVIDCode_Enrollments_table_with_a_list_of_records_displays() {
	    CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
	    MiscUtils.sleep(3000);
	    CucumberLogUtils.logScreenShot();
	    Assert.assertEquals("COVIDcode Enrollments", nativeViewEnrollementsPage.covidCodeEnrollmentsContextMenuLink.getText());
	    WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("an internal user clicks on Disease Course")
	public void an_internal_user_clicks_on_Disease_Course() {
	    nativeViewEnrollementsPage.nativeViewPanelNavigatorDiseaseCourseLink.click();
	    MiscUtils.sleep(3000);
	}

	@Then("a Disease Course table with a list of records displays")
	public void a_Disease_Course_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
	    MiscUtils.sleep(3000);
	    CucumberLogUtils.logScreenShot();
	    Assert.assertEquals("Disease Courses", nativeViewEnrollementsPage.diseaseCoursesContextMenuLink.getText());
	    WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("an internal user clicks on COVIDCode Follow Ups")
	public void an_internal_user_clicks_on_COVIDCode_Follow_Ups() {
	    nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeFollowUpsLink.click();
	    MiscUtils.sleep(3000);
	}

	@Then("a COVIDCode Follow Ups table with a list of records displays")
	public void a_COVIDCode_Follow_Ups_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
	    MiscUtils.sleep(3000);
	    CucumberLogUtils.logScreenShot();
	    Assert.assertEquals("COVIDcode Follow Ups", nativeViewEnrollementsPage.followUpsContextMenuLink.getText());
	    WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("an internal user clicks on COVIDCode Dashboard")
	public void an_internal_user_clicks_on_COVIDCode_Dashboard() {
	    nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeDashboardLink.click();
	    MiscUtils.sleep(3000);
	}

	@Then("a COVIDCode Dashboard table with a list of records displays")
	public void a_COVIDCode_Dashboard_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
	    MiscUtils.sleep(3000);
	    CucumberLogUtils.logScreenShot();
	    Assert.assertEquals("COVIDcode Dashboard", nativeViewEnrollementsPage.covidCodeDashboardContextMenuLink.getText());
	    WebDriverUtils.webDriver.switchTo().defaultContent();
	}


	
	

}
