package ServiceNow.PlatformBusinessApps.NERD.selenium.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class NERDSubmissionsPage extends CommonUtils {

	/**
	 * ------------ CRS KNOWLEGE MANAGEMENT SYSTEM SUBMISSIONSIONS PAGE -----------
	 */

	/** CRS Knowledge Management System Submissions Page Header */
	@FindBy(xpath = "//div[@class = 'container details']")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageHeader;

	/** CRS Knowledge Management System Submissions Page Submissions link */
	@FindBy(xpath = "//div[@id='crs-main']/div[1]/div/ul/li")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink;

	/**
	 * CRS Knowledge Management System Submissions Page Collaborations Create New
	 * Submission link
	 */
	@FindBy(xpath = "//div[contains(text(), 'Collaborations')]/a")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink;

	/**
	 * CRS Knowledge Management System Submissions Page OGCR Create New
	 * Submission link
	 */
	@FindBy(xpath = "//*[@id='ogcrAccordion']//child::div[1]//child::h4//child::a//child::span//child::div//child::a")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageOGCRCreateNewSubmissionLink;

	/** CRS Knowledge Management System Submissions Page Collaborations link */
	@FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[3]")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink;

	/** Confirm Submission to CRS button */
	@FindBy(xpath = "//button[@ng-click='c.submitSubmission()']")
	public WebElement confirmSubmissionYesButton;

	/** Pop Up Submission has been successfully OK button */
	@FindBy(xpath = "//button[@ng-repeat='button in options.buttons track by button.label']")
	public WebElement popUpOKbutton;

	/** Confirm Delete Submission Yes Button */
	@FindBy(xpath = "//button[@ng-click='c.deleteSubmission()']")
	public WebElement confirmDeleteYesButton;

	/** Returned Submission to the DOC planning Contact SAVE button */
	@FindBy(xpath = "//button[@ng-click='c.saveSubmission()']")
	public WebElement SaveButton;

	/**
	 * CRS Knowledge Management System Submissions Page Top Accomplishments Create
	 * New
	 * Submission link
	 */
	@FindBy(xpath = "//div[@role='tablist']//div[1]//div[1]//h4[1]//a[1]//span[1]//div[1]//a[1]")
	public WebElement topAccomplishmentsCreateNewSubmissionLink;

	/** CRS Top Accomplishments Submissions Page link */
	@FindBy(xpath = "//div[contains(text(), 'Top Accomplishments')]")
	public WebElement topAccomplishmentSubmissionsPageLink;

	/** Submissions Page Select Check Box - Fiscal Year 2019 */
	@FindBy(xpath = "//*[@id='x_26385_crs_kd_u_kb_fiscal_year']/div[2]/div[1]/md-checkbox")
	public WebElement submissionsSelectCheckBoxFiscalYear2019;

	/** CRS Top Accomplishments Submission Page - Fiscal Year 2021 */
	@FindBy(xpath = "(//div[@class = 'submission-checkboxes ng-scope'])[2]/md-checkbox/div[1]")
	public WebElement topAccomplishmentFiscalYear2021;

	/** CRS Submission Page - Title Text Box */
	@FindBy(xpath = "//input[@id = 'x_26385_crs_kd_u_kb_title']")
	public WebElement submissionsPageTitleTextBox;

	/** Submission Page Research Type Drop Down */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_research_type']")
	public WebElement submissionsPageResearchTypeDropDown;

	/** CRS Top Accomplishment Submission Save Button */
	@FindBy(xpath = "//button[@ng-show='c.save'][2]")
	public WebElement topAccomplishmentNewSubmissionSaveButton;

	/** CRS Top Accomplishment Submission Cancel Button */
	@FindBy(xpath = "//button[@ng-click='c.goBacktoSubmissions()']")
	public WebElement topAccomplishmentNewSubmissionCancelButton;

	/** New Submissions Page Submit Button */
	@FindBy(xpath = "//span[normalize-space()='Submit']")
	public WebElement newSubmissionsPageSubmitButton;

	/** CRS Top Submissions */
	@FindBy(xpath = "(//a[contains(text(), 'Submissions')])[2]")
	public WebElement topSubmisionsName;

	/** OM Add New Entry Button */
	@FindBy(xpath = "(//a[@ng-click='c.gotoNewEntry(tab.tmpl,$event,tab.category,tab.kb)'][normalize-space()='+ Add New Entry'])[11]")
	public WebElement omAddNewEntryButton;

	/** OM Content Type Header Text */
	@FindBy(xpath = "//h4[normalize-space()='OM Content Type']")
	public WebElement omContentTypeHeaderText;

	/** CRS Published only Check Box */
	@FindBy(xpath = "//*[@id='published']")
	public WebElement publishedOnlyCheckBox;

	/** CRS Published only Text*/
	@FindBy(xpath = "//div[normalize-space()='Published Only:']")
	public WebElement publishedOnlyText;

	/**
	 * 
	 * Beginning Of OM Content Type List Of WebElements
	 *
	 **/

	/** Administration Transition Material Text */
	@FindBy(xpath = "//span[normalize-space()='Administration Transition Material']")
	public WebElement administrationTransitionMaterialText;

	/** Anti-Harrassment/Civility Material Text */
	@FindBy(xpath = "//span[normalize-space()='Anti-Harrassment/Civility Material']")
	public WebElement antiHarrassmentCivilityMaterialText;

	/** Congressional Justification Text */
	@FindBy(xpath = "(//span[normalize-space()='Congressional Justification'])[1]")
	public WebElement congressionalJustificationText;

	/** Donna's Blog Text */
	@FindBy(xpath = "(//span[normalize-space()=\"Donna's Blog\"])[1]")
	public WebElement donnasBlogText;

	/** HHS Requests Text */
	@FindBy(xpath = "(//span[normalize-space()='HHS Requests'])[1]")
	public WebElement hhsRequestsText;

	/** Furlough Planning Text */
	@FindBy(xpath = "(//span[normalize-space()='Furlough Planning'])[1]")
	public WebElement furloughPlanningText;

	/** Equity and Inclusion Program Text */
	@FindBy(xpath = "(//span[normalize-space()='Equity and Inclusion Program'])[1]")
	public WebElement equityAndInclusionProgramText;

	/** COVID-19 Leadership Messages Text */
	@FindBy(xpath = "(//span[normalize-space()='COVID-19 Leadership Messages'])[1]")
	public WebElement covid19LeadershipMessagesText;

	/** Other Text */
	@FindBy(xpath = "(//span[normalize-space()='Other'])[1]")
	public WebElement otherOmContentText;

	/** OM Content Type If Other Please Specify Header Text */
	@FindBy(xpath = "//h4[normalize-space()='If Other is selected above, please specify']")
	public WebElement omContentTypeOtherPleaseSpecifyText;

	/** Title Text Box */
	@FindBy(xpath = "//div[4]//div[2]//input[1]")
	public WebElement omTitleTextBox;

	/** Fiscal Year 2022 Check Box */
	@FindBy(xpath = "//body/div[@ng-class=\"{'sp-loading': main.firstPage, 'sp-can-animate': main.doAnimate}\"]/section[@aria-label='CRS Knowledge Database Portal page content']/main/div[@ng-repeat='container in containers']/div[@ng-class='::main.getContainerClasses(container)']/sp-page-row[@ng-repeat='row in ::container.rows track by row.sys_id']/div/div[@ng-repeat='column in columns track by column.sys_id']/span[@ng-repeat='rectangle in column.widgets track by rectangle.instance_id']/div[@data='data']/div/div[@ng-if=\"c.xpage == 'new_entry'\"]/div/div[@data='data']/div/div/div/div/div/div[@ng-repeat='entry in c.schema track by $index']/div[@ng-if=\"entry.type == 'checkbox'\"]/div[@ng-repeat='item in entry.items track by $index']/md-checkbox[@aria-label='2022']/div[1]")
	public WebElement omFiscalYear2022CheckBox;

	/** POC Text Box */
	@FindBy(xpath = "//div[17]//div[2]//input[1]")
	public WebElement omPocTextBox;

	/** OM Save Button */
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement omSaveButton;

	/** OM Entry Has Been Successfully Saved OK Button */
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	public WebElement omOkButton;

	/** End Of OM Content Type List Of WebElements */

	/**
	 * ------------ COLLABORATION SUBMISSIONSIONS BY DOC PLANNING CONTACT
	 * -----------
	 */

	/** Return to Staff confirmation pop up window text field */
	@FindBy(xpath = "//textarea[@id='doc_comment']")
	public WebElement confirmRETURNtoStaffPopUpWindowTextField;

	/** Return to Staff confirmation pop up window YES button */
	@FindBy(xpath = "//button[@ng-click='c.rejectDOCSubmission()']")
	public WebElement confirmRETURNtoStaffPopUpWindowYesButton;

	/**
	 * Information dialog: Required fields need to be filled in before submission.
	 * text
	 */
	@FindBy(xpath = "//div[@class='spModal_content']")
	public WebElement requiredFieldsNeedToBeFilledInBeforeSubmissionText;

	/** Save Button for New Submission By DOC Planning contact */
	@FindBy(xpath = "//*[@id='crs-article']/div/div/div/div[2]/button[1]")
	public WebElement saveButtonNewSubmissionDOCplanning;

	/** Cancel Button for New Submission By DOC Planning contact */
	@FindBy(xpath = "//*[@id='crs-article']/div/div/div/div[2]/button[2]")
	public WebElement cancelButtonNewSubmissionDOCplanning;

	/** Return to Staff Member Drop Down */
	@FindBy(xpath = "/html/body/div[3]/md-dialog/div[2]/div/a/span[2]/b")
	public WebElement confirmRETURNtoStaffPopUpWindowDropDown;

	/** Confirm: Enter Text for search Staff Member */
	@FindBy(xpath = "/html/body/div[5]/div/input")
	public WebElement confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField;

	/** Confirm: Enter Text for search Staff Member Results */
	@FindBy(xpath = "/html/body/div[5]/ul/li/div")
	public WebElement confirmRETURNtoStaffPopUpWindowResultsTextField;

	/** Confirm Return to Staff member PopUp Window YES Button */
	@FindBy(xpath = "/html/body/div[3]/md-dialog/div[3]/button[1]")
	public WebElement confirmReturnYesButton;

	/** Confirm Return to Staff member Pop Up Window NO Button */
	@FindBy(xpath = "/html/body/div[3]/md-dialog/div[3]/button[2]")
	public WebElement confirmReturnNoButton;

	/**
	 * ------------ END OF COLLABORATION SUBMISSIONS BY DOC PLANNING CONTACT
	 * -----------
	 */

	/**
	 * ------------ BEGINNING OF CRS Knowledge Management System Submissions Page
	 * -----------------COVID-19 Activities Submission------------
	 */

	/** COVID-19 Activities Create New Submission Link Button */
	@FindBy(xpath = "(//a[@ng-click='c.gotoNewSubmission(tab.tmpl,$event)'][normalize-space()='+ Create new Submission'])[4]")
	public WebElement covid19CreateNewSubmissionButton;

	/** Super User COVID-19 Activities Create New Submission Link Button */
	@FindBy(xpath = "(//a[@ng-click='c.gotoNewEntry(tab.tmpl,$event,tab.category,tab.kb)'][normalize-space()='+ Add New Entry'])[4]")
	public WebElement superUserCovid19CreateNewSubmissionButton;

	/**
	 * COVID-19 Activities This Activity Aligns With The Following NIH Covid-19
	 * Strategic Plan Text
	 */
	@FindBy(xpath = "(//h4[@ng-bind-html='entry.label'])[7]")
	public WebElement thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText;

	/** COVID-19 Check Boxes */
	@FindBy(xpath = "//md-checkbox")
	public List<WebElement> covid19ActivitiesCheckBoxes;

	/** Special Topic Header Text */
	@FindBy(xpath = "//h4[normalize-space()='Special Topic']")
	public WebElement specialTopicHeaderText;

	/** COVID-19 Check Box */
	@FindBy(xpath = "//span[normalize-space()='COVID-19']")
	public WebElement covid19CheckBox;

	/**
	 * ------------ END OF CRS Knowledge Management System Submissions Page COVID-19
	 * Activities ------------
	 */

	/** ------------ COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER ----------- */

	/** Submissions : Order by Drop Down */
	@FindBy(xpath = "//select[@id='orderBy']")
	public WebElement submissionsOrderByDropDown;

	/** Submissions: Confirm RETURN pop up window Text field */
	@FindBy(xpath = "//textarea[@id='crs_comment']")
	public WebElement confirmRETURNpopUpWindowTextField;

	/** Submissions: Confirm RETURN pop up window YES button */
	@FindBy(xpath = "//button[@ng-click='c.rejectCRSSubmission()']")
	public WebElement confirmRETURNpopUpWindowYESbutton;

	/** Submissions: Submission has been successfully ... pop up OK button */
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	public WebElement submissionSuccessfullyPopUpOkButton;

	/** Submissions: Confirm pop up window YES button */
	@FindBy(xpath = "//button[@ng-click='c.submitSubmission()']")
	public WebElement confirmPopUpWindowYESbutton;

	/** Submissions: Confirm pop up window YES button CRS*/
	@FindBy(xpath = "//*[@id='dialogContent_1']//child::div[3]//child::button[1]")
	public WebElement confirmPopUpWindowYESbuttonCRS;

	/** Submissions: Published Text */
	@FindBy(xpath = "//md-list-item[1]//div[1]//div[3]//div[3]")
	public WebElement publishedText;

	/**
	 * ------------ END OF COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER -----------
	 */

	/**
	 * ------------ END OF CRS KNOWLEGE MANAGEMENT SYSTEM SUBMISSIONSIONS PAGE
	 * -----------
	 */

	/** ------------ CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE ----------- */

	/** CRS Knowledge Management System Home Page NERD Button */
	@FindBy(xpath = "(//div[@class='kb-top-pad'])[1]")
	public WebElement crsKnowledgeManagementSystemHomePageNERDButton;

	/** CRS Knowledge Management System Home Page HOME Button */
	@FindBy(xpath = "//a[text()='Home']")
	public WebElement crsKnowledgeManagementSystemHomePageHOMEButton;

	/** CRS Knowledge Management System Home Page Drop Down Menu */
	@FindBy(xpath = "(//button[@id='single-button'])[1]")
	public WebElement crsKnowledgeManagementSystemHomePageDropDownMenu;

	/** CRS Knowledge Management System Home Page Drop Down Menu Values */
	@FindBy(xpath = "(//ul[@class='dropdown-menu-right dropdown-menu'])[1]/li")
	public List<WebElement> crsKnowledgeManagementSystemHomePageDropDownMenuValues;

	/** ------------ CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE: NERD ----------- */

	/** NERD Special Topics Drop Down */
	@FindBy(xpath = "(//button[@class='btn btn-default dropdown-toggle'])[3]")
	public WebElement nerdSpecialTopicsDD;

	/** NERD Special Topics Drop Down Values */
	@FindBy(xpath = "//div[contains(@class,'filter-section ng-scope open')]//li")
	public List<WebElement> nerdSpecialTopicsDDvalues;

	/** NERD Collaborations List */
	@FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[3]")
	public WebElement collaborationsList;

	/** NERD Collaborations DOC Version Link */
	@FindBy(xpath = "//div[@class='block-info']")
	public WebElement collaborationsDOCVersionLink;

	/** NERD Collaborations Version number1 */
	@FindBy(partialLinkText = "DOC Version")
	public WebElement collaborationsVersionNumber1;

	/** NERD Collaborations Version number */
	@FindBy(xpath = "//*[@id='crs-article']/div/div[2]/div[1]/div[2]/div[1]/a")
	public WebElement collaborationsVersionNumber2;

	/** NERD Collaborations Version number generic */
	@FindBy(xpath = "(//a[contains(text(),'Version')])[2]")
	public WebElement collaborationsVersionNumberGeneric;

	/**
	 * ------------ THE END OF CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE: NERD
	 * -----------
	 */

	/** ------------ CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE: NERD ----------- */

	/**
	 * ------------ THE BEGINNING OF NCI CANCER DATA STANDARDS REPOSITORY AND
	 * REGISTRY (CADSR) PAGE -----------
	 */

	/** Please Specify Header Text */
	@FindBy(xpath = "//h4[normalize-space()='Please specify']")
	public WebElement pleaseSpecifyHeaderText;

	/** Please Specify Drop Down Option 1 */
	@FindBy(xpath = "//div[6]//div[2]//select[1]")
	public WebElement pleaseSpecifyDropDownOption1;

	/** Please Specify Drop Down Edited Option */
	@FindBy(xpath = "//option[contains(text(),'Edited')]")
	public WebElement pleaseSpecifyDropDownEditedOption;

	/** Fiscal Year Header Text */
	@FindBy(xpath = "//h4[normalize-space()='Fiscal Year']")
	public WebElement fiscalYearHeaderText;

	/** Fiscal Year Drop Down Option 1 */
	@FindBy(xpath = "//div[8]//div[2]//select[1]")
	public WebElement fiscalYearDropDownOption1;

	/** Fiscal Year Drop Down 2022 Option */
	@FindBy(xpath = "//option[contains(text(),'2024')]")
	public WebElement fiscalYearDropDown2024Option;

	/**
	 * ------------ END OF NCI CANCER DATA STANDARDS REPOSITORY AND REGISTRY (CADSR)
	 * PAGE -----------
	 */

	/**
	 * ------------ BEGINNING OF COLLABORATIONS CATEGORY LOCATORS PAGE -----------
	 */

	/** Save Button */
	@FindBy(xpath = "//div[@ng-if=\"c.data.cat != 'OCPL'\"]//button[1]")
	public WebElement collaborationsCategorySaveButton;

	/**
	 * Yes Button for Are you ready to submit this entry to DOC Planning Contact?
	 * Pop Up
	 */
	@FindBy(xpath = "//button[@ng-click='c.submitSubmission()']//span[contains(text(),'Yes')]")
	public WebElement collaborationCategoryYesButton;

	/** Ok Button for Submission has been successfully submitted. Pop Up */
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	public WebElement collaborationCategoryOkButton;

	/** Collaboration Title Text Box */
	@FindBy(xpath = "//body//div[@ng-class=\"{'sp-loading': main.firstPage, 'sp-can-animate': main.doAnimate}\"]//div[@data='data']//div[@data='data']//div//div//div//div//div//div[2]//div[2]//input[1]")
	public WebElement collaborationTitleTextBox;

	/** Collaboration Please Specify Drop Down */
	@FindBy(xpath = "(//select)[1]")
	public WebElement collaborationPleaseSpecifyDropDown;

	/** Collaboration Fiscal Year Drop Down */
	@FindBy(xpath = "//div[5]//div[2]//select[1]")
	public WebElement collaborationFiscalYearDropDown;

	/** Collaboration Body Text Box */
	@FindBy(xpath = "//body")
	public WebElement collaborationBodyTextBox;

	/** Collaboration FY The Collaborative Activity Originated Drop Down */
	@FindBy(xpath = "//div[8]//div[2]//select[1]")
	public WebElement collaborationFyTheCollaborativeActivityOriginatedDropDown;

	/** Collaboration Lead DOC Drop Down */
	@FindBy(xpath = "//div[9]//div[2]//select[1]")
	public WebElement collaborationLeadDocDropDown;

	/** Collaboration POC Text Box */
	@FindBy(xpath = "//div[11]//div[2]//input[1]")
	public WebElement collaborationPocTextBox;

	/** Collaboration NIH ICs/OD Collaborators */
	@FindBy(xpath = "(//select[@name='x_26385_crs_kd_u_kb_nih_ics_od_collaborators'])[1]")
	public WebElement collaborationtNihIcsOdCollaboratorsDropDown;

	/** Collaboration HHS Agency Collaborators Drop Down */
	@FindBy(xpath = "(//select[@name='x_26385_crs_kd_u_kb_hhs_agency_collaborators'])[1]")
	public WebElement collaborationHhsAgencyCollaboratorsDropDown;

	/** Collaboration Other Federal Agency Collaborators Drop Down */
	@FindBy(xpath = "(//select[@name='x_26385_crs_kd_u_kb_other_federal_agency_collaborators'])[1]")
	public WebElement collaborationOtherFederalAgencyCollaboratorsDropDown;

	/** Collaboration Tribal/State/Local Government Collaborators Drop Down */
	@FindBy(xpath = "//div[19]//div[2]//select[1]")
	public WebElement collaborationTribalStateLocalGovernmentCollaboratorsDropDown;

	/** Collaboration Foreign Government Collaborators Drop Down */
	@FindBy(xpath = "(//select[@name='x_26385_crs_kd_u_kb_foreign_government_collaborators'])[1]")
	public WebElement collaborationForeignGovernmentCollaboratorsDropDown;

	/** Collaboration Non-Governmental Collaborators Drop Down */
	@FindBy(xpath = "(//select[@name='x_26385_crs_kd_u_kb_non_governmental_collaborators'])[1]")
	public WebElement collaborationNonGovernmentalCollaboratorsDropDown;

	/**
	 * Collaboration Select Type Of Collaborative Activity Check Boxes Committee,
	 * Work Group, or Advisory Group
	 * Check Box
	 */
	@FindBy(xpath = "(//div)[236]")
	public WebElement collaborationCommitteeWorkGroupOrAdvisoryGroupCheckBox;

	/**
	 * Collaboration IF COMMITTEE IS SELECTED ABOVE, Is this a FACA committee Drop
	 * Down
	 */
	@FindBy(xpath = "//div[31]//div[2]//select[1]")
	public WebElement collaborationIfCommitteeIsSelectedAoveIsThisAFacaCommitteeDropDown;

	/**
	 * Collaboration Is this collaboration related to a regulatory activity? Drop
	 * Down
	 */
	@FindBy(xpath = "//div[32]//div[2]//select[1]")
	public WebElement collaborationIsThisCollaborationRelatedToARegulatoryActivityDropDown;

	/** Collaboration Was NIH funding provided for this activity? Drop Down */
	@FindBy(xpath = "//div[33]//div[2]//select[1]")
	public WebElement collaborationWasNihFundingProvidedFoThisActivityDropDown;

	/** Collaboration Products/Outputs Research Tool Development Check Boxes */
	@FindBy(xpath = "(//div)[312]")
	public WebElement collaborationResearchToolDevelopmentCheckBox;

	/** Collaboration NIH strategic alignment (Primary) Drop Down */
	@FindBy(xpath = "(//select[@ng-options='option for option in entry.items track by option'])[16]")
	public WebElement collaborationNihStrategicAlignmentPrimaryDropDown;

	/** Collaboration HHS Strategic Plan Alignment (Primary) Drop Down */
	@FindBy(xpath = "(//select[@ng-options='option for option in entry.items track by option'])[18]")
	public WebElement collaborationHhsStrategicPlanAlignmentPrimaryDropDown;

	/** Collaboration Submit Button */
	@FindBy(xpath = "//div[@ng-if=\"c.data.cat != 'OCPL'\"]//button[1]")
	public WebElement collaborationSubmitButton;

	/**
	 * Collaboration Are you ready to submit this entry to DOC Planning Contact? Yes
	 * Button
	 */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[3]")
	public WebElement collaborationYesButton;

	/** Collaboration Submission has been successfully submitted. Ok Button */
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	public WebElement collaborationOkButton;

	/** Collaborations Button */
	@FindBy(xpath = "//div[3]//div[1]//h4[1]//a[1]//span[1]//div[1]")
	public WebElement collaborationsButton;

	/** ------------ END OF COLLABORATIONS CATEGORY LOCATORS PAGE ----------- */

	/** ------------  OTHER ACCOMPLISHMENTS CATEGORY SUBMISSION LOCATORS PAGE ----------- */

	/** Super User Other Accomplishments Create New Submission Link Button */
	@FindBy(xpath = "(//a[@ng-click='c.gotoNewEntry(tab.tmpl,$event,tab.category,tab.kb)'][normalize-space()='+ Add New Entry'])[2]")
	public WebElement superUserOtherAccomplishmentsCreateNewSubmissionButton;

	/**
	 * CRS Knowledge Management System Submissions Page for NCI Staff Member
	 * Other Accomplishments Create New Submission link
	 */
	@FindBy(xpath = "//div[@role='tablist']//div[2]//div[1]//h4[1]//a[1]//span[1]//div[1]//a[1]")
	public WebElement otherAccomplishmentsCreateNewSubmissionLink;

	public NERDSubmissionsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}