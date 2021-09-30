package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewEnrollmentsPage extends CommonUtils {

	/** --------------- BEGINNING OF NATIVE COVIDcode VIEW All APPLICATIONS BAR --------------- */

	/** Filter Navigator search bar */
	@FindBy(css = "#filter")
	public WebElement filterNavigator;

	/** Native View Frame */
	@FindBy(id = "gsft_main")
	public WebElement NativeViewFrame;
	
	/** Native View Download Attachment Link */
	@FindBy(xpath = "//a[contains(text(), '[download]')]")
	public WebElement nativeViewDownloadAttachmentLink;
	
	/** COVIDCode Follow Ups Group 1 link */
	@FindBy(xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]")
	public WebElement covidCodeFollowUpsGroup1link;

	/** COVIDCode Enrollments New button */
	@FindBy(css = "#sysverb_new")
	public WebElement covidCodeEnrollmentsNewButton;
	
	/** COVIDCode Enrollments Open Record */
	@FindBy(xpath = "//a[contains(text(), 'Open Record')]")
	public WebElement covidCodeEnrollmentOpenRecordBtn;

	/** COVIDCode Follow Up New button */
	@FindBy(xpath = "//button[@id = 'sysverb_new']")
	public WebElement covidCodeFollowUpNewButton;

	/** COVIDCode Enrollments Search drop down */
	@FindBy(xpath = "//span[@class = 'input-group-addon input-group-select']/span/select")
	public WebElement covidCodeEnrollmentsSearchDropDown;

	/** COVIDCode Enrollments Search text box */
	@FindBy(xpath = "//div[@class='input-group']/input")
	public WebElement covidCodeEnrollmentsSearchTextBox;

	/** COVIDCode Survey Number first link */
	@FindBy(xpath = "//tr[3]/td[3]/a")
	public WebElement covidCodeSurveyNumberFirstLink;

	/** COVIDCode Follow Ups Activity tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[6]/span[1]/span[2]")
	public WebElement covidCodeFollowUpsActivityTab;

	/** COVIDcode Enrollments Context Menu Link */
	@FindBy(xpath = "//h2[contains(text(), 'COVIDcode Enrollments')]")
	public WebElement covidCodeEnrollmentsContextMenuLink;

	/** Disease Courses Context Menu Link */
	@FindBy(xpath = "//h2[contains(text(), 'Disease Courses')]")
	public WebElement diseaseCoursesContextMenuLink;

	/** COVIDcode Follow Ups Context Menu Link */
	@FindBy(xpath = "//div[contains(text(),'COVIDcode Follow Ups')]")
	public WebElement followUpsContextMenuLink;

	/** COVIDcode Dashboard Context Menu Link */
	@FindBy(xpath = "//span[@class = 'sn-canvas-header-title ng-binding']")
	public WebElement covidCodeDashboardContextMenuLink;

	/**
	 * --------------- THE END OF NATIVE COVIDcode VIEW All APPLICATIONS BAR ---------------*/

	
	/**
	 * ------ BEGINNING OF NATIVE VIEW COVIDcode APPLICATION PANNEL NAVIGATOR SECTION----------*/
	
	/** Native View Panel Navigator Admin Guide Link */
	@FindBy(xpath = "//a[@id='abad49291b589c102701b913cc4bcb06']/div/div")
	public WebElement nativeViewPanelNavigatorAdminGuideLink;

	/** Native View Panel Navigator COVIDCode Enrollments Link */
	@FindBy(xpath = "//div[contains(text(), 'COVIDcode enrollments')]")
	public WebElement nativeViewPanelNavigatorCovidCodeEnrollmentsLink;

	/** Native View Panel Navigator Forms Assigned to Me Link */
	@FindBy(xpath = "//div[contains(text(), 'Forms Assigned to Me')]")
	public WebElement nativeViewPanelNavigatorFormsAssignedToMeLink;

	/** Native View Panel Navigator Enrollment and Follow Up Link */
	@FindBy(xpath = "//span[contains(text(), 'Enrollment and Follow Up')]")
	public WebElement nativeViewPanelNavigatorEnrollmentAndFollowUpLink;

	/** Native View Panel Navigator My draft enrollment Link */
	@FindBy(xpath = "//div[contains(text(), 'My draft enrollments')]")
	public WebElement nativeViewPanelNavigatorMyDraftEnrollmentLink;

	/** Native View Panel Navigator COVIDCode Follow Ups link */
	@FindBy(xpath = "//div[contains(text(), 'COVIDcode Follow Ups')]")
	public WebElement nativeViewPanelNavigatorCovidCodeFollowUpsLink;

	/** Native View Panel Navigator My draft follow ups Link */
	@FindBy(xpath = "//div[contains(text(), 'My draft follow ups')]")
	public WebElement nativeViewPanelNavigatorMyDraftFollowUpsLink;

	/** Native View Panel Navigator Disease Course Link */
	@FindBy(xpath = "//div[contains(text(), 'Disease Course')]")
	public WebElement nativeViewPanelNavigatorDiseaseCourseLink;

	/** Native View Panel Navigator Specimens Link */
	@FindBy(xpath = "//div[contains(text(), 'Specimens')]")
	public WebElement nativeViewPanelNavigatorSpecimensLink;

	/** Native View Panel Navigator COVIDcode Dashboard Link */
	@FindBy(xpath = "//div[contains(text(), 'COVIDcode Dashboard')]")
	public WebElement nativeViewPanelNavigatorCovidCodeDashboardLink;

	/** Native View Panel Navigator Inquiry Tracking Link */
	@FindBy(xpath = "//li[@id = 'concourse_module_115c7e961b48a410e541631ee54bcb39']/div/a")
	public WebElement nativeViewPanelNavigatorInquiryTrackingLink;

	/** Native View Panel Navigator COVIDCode Volunteer Surveys Link */
	@FindBy(xpath = "//div[contains(text(), 'COVIDcode volunteer surveys')]")
	public WebElement nativeViewPanelNavigatorCovidCodeVolunteerSurveysLink;

	/** Native View Panel Navigator COVIDcode Inquiry Tracking Link */
	@FindBy(xpath = "//div[contains(text(), 'COVIDcode Inquiry Tracking')]")
	public WebElement nativeViewPanelNavigatorCovidCodeInquiryTrackingLink;

	/** Native View Panel Navigator My Inquiry Tracking Records Link */
	@FindBy(xpath = "//div[contains(text(), 'My Inquiry Tracking Records')]")
	public WebElement nativeViewPanelNavigatorMyInquiryTrackingRecordsLink; 

	/** Native View Panel Navigator Inquiry Tracking Dashboard Link */
	@FindBy(xpath = "//div[contains(text(), 'Inquiry Tracking Dashboard')]")
	public WebElement nativeViewPanelNavigatorInquiryTrackingDashboardLink;

	/** Native View Panel Navigator Institution Contact Tracking Link */
	@FindBy(xpath = "//li[@id = 'concourse_module_4ebc72d61b48a410e541631ee54bcb2e']/div/a")
	public WebElement nativeViewPanelNavigatorInstitutionContactTrackingLink;

	/** Native View Panel Navigator COVIDcode Institution Contact Tracking Link */
	@FindBy(xpath = "//div[contains(text(), 'COVIDcode Institution Contact Tracking')]")
	public WebElement nativeViewPanelNavigatorCovidCodeInstitutionContactTrackingLink;

	/** Native View Panel Navigator Admin Link */
	@FindBy(xpath = "//li[@id = 'concourse_module_d5de22161b08a410e541631ee54bcb18']/div/a")
	public WebElement nativeViewPanelNavigatorAdminLink;

	/** Native View Panel Navigator GeCo COVID Multi-Select Choices Link */
	@FindBy(xpath = "//div[contains(text(),'GeCo COVID Multi-Select Choices')]")
	public WebElement nativeViewPanelNavigatorGeCoCovidMultiSelectChoicesLink;

	/** Native View Panel Navigator Hospital Codes Link */
	@FindBy(xpath = "//div[contains(text(),'Hospital Codes')]")
	public WebElement nativeViewPanelNavigatorHospitalCodesLink;

	/** Native View Panel Navigator Notifications Link */
	@FindBy(xpath = "//li[@id = 'concourse_module_dd3a471c1bdda8106daea681f54bcb32']/div/a/div/div")
	public WebElement nativeViewPanelNavigatorNotificationsLink;

	/**
	 * ----- END OF NATIVE VIEW COVIDcode APPLICATION PANNEL NAVIGATOR SECTION ---------------
	 */

	
	/**
	 * ---------- BEGINNING OF NATIVE VIEW COVIDcode MY VIEW MY INQUIRY TRACKING RECORD------------*/

	/** My Inquiry Tracking Records New Button */
	@FindBy(xpath = "//button[@class='selected_action action_context btn btn-primary']")
	public WebElement myInquiryTrackingRecordsNewButton;

	/** My Inquiry Tracking Records Study Team Contact Section tab */
	@FindBy(xpath = "//span[@aria-controls='section_tab.36ef0c611be8e410e541631ee54bcbef']")
	public WebElement myInquiryTrackingRecordsStudyTeamContactTab;

	/**
	 * My Inquiry Tracking Records Study Team Contact "Section COVID test result
	 * received (non OMS)?" text
	 */
	@FindBy(xpath = "//span[contains(text(), 'non OMS')]")
	public WebElement myInquiryTrackingRecordsStudyTeamContactCOVIDtestResultReceivedQuestionText;

	/**
	 * My Inquiry Tracking Records Study Team Contact "Covid Test Result F/U 1" text
	 */
	@FindBy(xpath = "//span[contains(text(), 'Result F/U 1')]")
	public WebElement myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_1Text;

	/**
	 * My Inquiry Tracking Records Study Team Contact "Covid Test Result F/U 2" text
	 */
	@FindBy(xpath = "//span[contains(text(), 'Result F/U 2')]")
	public WebElement myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_2Text;

	/** My Inquiry Tracking Records Study Team Contact "Telephone interview date/time" text */
	@FindBy (xpath = "//span[contains(text(), 'Telephone')]")
	public WebElement  myInquiryTrackingRecordsStudyTeamContactTelephoneInterviewDate_timeText;
	
	/** My Inquiry Tracking Records Study Team Contact "Assigned to" text */
	@FindBy (xpath = "//div[@id='label.x_g_nci_geco_covid_inquiry_tracking.assigned_to']/label/span[2]")
	public WebElement  myInquiryTrackingRecordsStudyTeamContactAssignedToText;
	
	/** My Inquiry Tracking Records Study Team Contact "Assigned to me" button */
	@FindBy (xpath = "//button[@id='add_me_locked.x_g_nci_geco_covid_inquiry_tracking.assigned_to']")
	public WebElement  myInquiryTrackingRecordsStudyTeamContactAssignedToMeButton;
	
	/** My Inquiry Tracking Records Study Team Contact "Unlock Assigned to" button */
	@FindBy (xpath = "//button[@id='x_g_nci_geco_covid_inquiry_tracking.assigned_to_unlock']")
	public WebElement  myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToButton;
	
	/** My Inquiry Tracking Records Study Team Contact "Unlock Assigned to" search text field */
	@FindBy (xpath = "//input[@id='sys_display.x_g_nci_geco_covid_inquiry_tracking.assigned_to']")
	public WebElement  myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField;
	
	/** My Inquiry Tracking Records Study Team Contact "Assigned to me" Name text */
	@FindBy (xpath = "//p[@id='x_g_nci_geco_covid_inquiry_tracking.assigned_to_nonedit']")
	public WebElement  myInquiryTrackingRecordsStudyTeamContactAssignedToMeNameText;
	
	/** My Inquiry Tracking Records Study Team Contact "List of Assigned to" drop down */
	@FindBy (xpath = "//select[@id='select_0x_g_nci_geco_covid_inquiry_tracking.assigned_to']/option")
	public List<WebElement> myInquiryTrackingRecordsStudyTeamContactListOfAssignedToDD;
	
	/** My Inquiry Tracking Records Study Team Contact Initial Emails Sent Date Select Date Button */
	@FindBy (xpath = "//a[@id='x_g_nci_geco_covid_inquiry_tracking.study_team_contact_date_1.ui_policy_sensitive']" )
	public WebElement myInquiryTrackingRecordsStudyTeamContactInitialEmailsSentDateSelectDateButton;
	
	/** My Inquiry Tracking Records Study Team Contact Initial Emails Sent Date Select Date Button Calendar Table */
	@FindBy (xpath = "//table[@id='window.GwtDateTimePicker']")
	public WebElement myInquiryTrackingRecordsStudyTeamContactInitialEmailsSentDateSelectDateButtonCalendarTable;
	
	/** My Inquiry Tracking Records Study Team Contact Covid Test Result F/U 1 Text Box */
	@FindBy (xpath = "//input[@name='x_g_nci_geco_covid_inquiry_tracking.study_team_contact_date_2']")
	public WebElement myInquiryTrackingRecordsStudyTeamContactCovidTestResultFU1TextBox; 
	
	/** My Inquiry Tracking Records Study Team Contact Covid Test Result F/U 1 Text Box */
	@FindBy (xpath = "//input[@name='x_g_nci_geco_covid_inquiry_tracking.study_team_contact_date_3']")
	public WebElement myInquiryTrackingRecordsStudyTeamContactCovidTestResultFU2TextBox;

	/** ---------------THE END OF THE NATIVE VIEW COVIDcode My Inquiry Tracking Records VIEW  ---------------  */
	
	
	/** --------------- BEGINNING OF NATIVE VIEW COVIDcode Specimens VIEW  ---------------  */ 
	
	/** Specimens Preview Button */
	@FindBy (xpath = "(//*[@class='list_decoration_cell col-small col-center '])[1]")
	public WebElement specimensPreviewButton;
	
	/** Specimens Open Record Button */
	@FindBy (xpath = "//*[@class='btn btn-sm btn-default pop-over-button pull-right']")
	public WebElement specimensOpenRecordButton;
	
	/** Specimens Sample Outcome drop down */
	@FindBy (xpath = "//select[@id='x_g_nci_geco_covid_blood_samples.sample_outcome']")
	public WebElement specimensSampleOutcomeDD;
	
	/** Specimen Sample Code Link */
	@FindBy (xpath = "(//a[contains(text(), 'Sample Code')])[1]")
	public WebElement specimenSampleCodeLink;

	/** --------------- THE END OF NATIVE VIEW COVIDcode Specimens VIEW  ---------------  */ 
	
	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode INQUIRY TRACKING RECORD ---------------*/

	/** COVIDcode Inquiry Tracking New Button */
	@FindBy(xpath = "//button[@class='selected_action action_context btn btn-primary']")
	public WebElement covidCodeInquiryTrackingNewButton;
	
	/** COVIDcode Inquiry Tracking Outcome drop down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_inquiry_tracking.outcome']")
	public WebElement covidCodeInquiryTrackingOutcomeDD;
	
	/** COVIDcode Inquiry Tracking User Group Id drop down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_inquiry_tracking.user_group_id']")
	public WebElement covidCodeInquiryTrackingUserGroupIdDD;

	/**
	 * ---------- END OF NATIVE VIEW COVIDcode INQUIRY TRACKING RECORD------------*/
	
	public NativeViewEnrollmentsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
