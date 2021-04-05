package ServiceNow.NERD.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CreateNewSubmissionPage extends CommonUtils {

	/** ------------ CREATE NEW SUBMISSION PAGE ----------- */

	/** ------------ CREATE NEW COLLABORATION SECTION ----------- */

	/** CRS Knowledge Management System Create New Submission Breadcrumb */
	@FindBy(xpath = "//a[contains(text(), 'Create New Submission')]")
	public WebElement crsKnowledgeManagementSystemCreateNewSubmissionBreadcrumb;

	/** Title text box */
	@FindBy(xpath = "//input[@id='x_26385_crs_kd_u_kb_title']")
	public WebElement titleTextBox;

	/** Please Specify Text */
	@FindBy(xpath = "//h4[text()='Please specify']")
	public WebElement pleaseSpecifyText;

	/** Please Specify Drop Down */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_existing_activities_type']")
	public WebElement pleaseSpecifyDropDown;

	/** Please Specify Drop Down values */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_existing_activities_type']/option")
	public List<WebElement> pleaseSpecifyDropDownValues;

	/** Please Specify asterisk */
	@FindBy(xpath = "(//i[@class='fa fa-asterisk'])[3]")
	public WebElement pleaseSpecifyAsterisk;

	/** Acronym text box */
	@FindBy(xpath = "//input[@id='x_26385_crs_kd_u_kb_acronym']")
	public WebElement acronymTextBox;

	/** Fiscal Year text */
	@FindBy(xpath = "//h4[text()='Fiscal Year']")
	public WebElement fiscalYearText;

	/** Fiscal Year asterisk */
	@FindBy(xpath = "(//i[@class='fa fa-asterisk'])[4]")
	public WebElement fiscalYearAsterisk;

	/** Fiscal Year Drop Down */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_fiscal_year']")
	public WebElement fiscalYearDropDown;

	/** Description text box iFrame */
	@FindBy(xpath = "//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help']")
	public WebElement DescriptionTextBoxIframe;

	/** Description text box */
	@FindBy(xpath = "//body[@id='tinymce']")
	public WebElement DescriptionTextBox;

	/** FY the Collaborative Activity Originated Drop Down */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_fiscal_year_originated']")
	public WebElement fyTheCollaborativeActivityOriginatedDropDown;

	/**
	 * Lead DOC Drop Down
	 */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_doc']")
	public WebElement leadDOCDropDown;

	/**
	 * Other DOCs list : CBIIT check box
	 */
	@FindBy(xpath = "//div[@class='md-container md-ink-ripple'][1]")
	public WebElement otherDOCsCBIITCheckBox;

	/*** CRS Knowledge Management System Other DOCs list check boxes */
	@FindBy(xpath = "//div[@class='field-section ng-scope'][9]/div[2]/div/md-checkbox")
	public List<WebElement> crsKnowledgeManagementSystemOtherDOCsList;

	/** POC Text Box */
	@FindBy(xpath = "//input[@id='x_26385_crs_kd_u_kb_poc']")
	public WebElement pocTextBox;

	/** References Text Box */
	@FindBy(xpath = "//input[@id='pmids']")
	public WebElement ReferencesTextBox;

	/** NIH ICs/OD Collaborators If Other Is Selected Above Please Specify Text */
	@FindBy(xpath = "//div[@id = 'x_26385_crs_kd_u_kb_nih_ics_od_collaborators_other_specify']/div/h4")
	public WebElement nihICs_ODCollaboratorsIfOtherIsSelectedAbovePleaseSpecifyText;

	/**
	 * NIH ICs/OD Collaborators If Other Is Selected Above Please Specify Text Box
	 */
	@FindBy(xpath = "//input[@id = 'x_26385_crs_kd_u_kb_nih_ics_od_collaborators_other_specify']")
	public WebElement nihICs_ODCollaboratorsIfOtherIsSelectedAbovePleaseSpecifyTextBox;

	/** NIH ICs/OD Collaborators Drop Down */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_nih_ics_od_collaborators']")
	public WebElement nihICs_ODcollaboratorsDropDown;

	/** HHS Agency Collaborators Drop Down */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_hhs_agency_collaborators']")
	public WebElement hhsAgencyCollaboratorsDropDown;

	/** Other Federal Agency Collaborators Drop Down */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_other_federal_agency_collaborators']")
	public WebElement otherFederalAgencyCollaboratorsDropDown;

	/** Tribal/State/Local Government Collaborators Drop Down */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_government_collaborators']")
	public WebElement tribalStateLocalGovernmentCollaboratorsDropDown;

	/** Foreign Government Collaborators Drop Down */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_foreign_government_collaborators']")
	public WebElement foreignGovernmentCollaboratorsDropDown;

	/** Non-Governmental Collaborators Drop Down */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_non_governmental_collaborators']")
	public WebElement nonGovernmentalCollaboratorsDropDown;

	/**
	 * Select type of collaborative activity list: Resource Development check box
	 */
	@FindBy(xpath = "(//div[@class='md-container md-ink-ripple'])[22]")
	public WebElement selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox;

	/***
	 * Select type of collaborative activity list: Public Education Campaign Check
	 * Box
	 */
	@FindBy(xpath = "//md-checkbox[@aria-label = 'Public Education Campaign']")
	public WebElement selectTypeOfCollaborativeActivityListPublicEducationCampaignCheckBox;

	/***
	 * Select type of collaborative activity list: Best Practices Document Check Box
	 */
	@FindBy(xpath = "//md-checkbox[@aria-label = 'Best Practices Document']")
	public WebElement selectTypeOfCollaborativeActivityListBestPracticesDocumentCheckBox;

	/**
	 * Is this collaboration related to a regulatory activity? Drop Down
	 */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_related_to_regulatory_activity']")
	public WebElement isThisCollaborationRelatedToRegulatoryActivityDropDown;

	/**
	 * Was NIH funding provided for this activity? Drop Down
	 */
	@FindBy(xpath = "//select[@name='x_26385_crs_kd_u_kb_nih_funding']")
	public WebElement wasNIHFundingProvidedForThisActivityDropDown;

	/**
	 * Products/Outputs list: Research Tool Development check box
	 */
	@FindBy(xpath = "(//div[@class='md-container md-ink-ripple'])[27]")
	public WebElement productsOutputsListResearchToolDevelopmentCheckBox;

	/**
	 * 
	 * NIH strategic alignment (Primary) Drop Down
	 */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_nih_strategic_alignment_primary'] ")
	public WebElement nihStrategicAlignment_Primary_DropDown;

	/**
	 * NIH strategic alignment (Secondary Optional) Drop Down
	 */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_nih_strategic_alignment_other'] ")
	public WebElement nihStrategicAlignment_SecondaryOptional_DropDown;

	/**
	 * HHS Strategic Plan Alignment (Primary) Drop Down
	 */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_hhs_strategic_plan_alignment_primary'] ")
	public WebElement hhsStrategicPlanAlignment_Primary_DropDown;

	/**
	 * HHS Strategic Plan Alignment (Secondary Optional) Drop Down
	 */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_hhs_strategic_plan_alignment_other'] ")
	public WebElement hhsStrategicPlanAlignment_SecondaryOptional_DropDown;

	/** Attachment: Choose file Button */
	@FindBy(xpath = "//input[@name='file2upload']")
	public WebElement chooseFileButton;

	/** Attachment: Choose File Text */
	@FindBy(xpath = "//*[@id = 'crs-article']/div/div/div/div[1]/div[43]/div[2]/div")
	public WebElement chooseFileText;

	/** Submit Button */
	@FindBy(xpath = "//button[@class='md-raised md-button ng-scope md-ink-ripple']")
	public WebElement submitButton;

	/** Cancel Button */
	@FindBy(xpath = "//button[@ng-click='c.goBacktoSubmission()']")
	public WebElement cancelButton;

	/** Pop Up Confirmation Yes Button */
	@FindBy(xpath = "//button[@ng-click='c.submitSubmission()']")
	public WebElement popUpConfirmationYesButton;

	/** Information Dialog Pop Up OK button */
	@FindBy(xpath = "//button[@ng-repeat='button in options.buttons track by button.label']")
	public WebElement informationDialogPopUpOKbutton;

	/** ------------ END OF CREATE NEW COLLABORATION SECTION ----------- */

	/** Pop Up Submission Confirmation Text */
	@FindBy(xpath = "//div[@class='spModal_content'] ")
	public WebElement popUpSubmissionConfirmationText;

	/** Pop Up Submission Confirmation Ok Button */
	@FindBy(xpath = "//button[text() = 'Ok']")
	public WebElement popUpSubmissionConfirmationOkButton;

	/***
	 * CRS Knowledge Management System Select Type Of Collaborative Activity List
	 */
	@FindBy(xpath = "//*[@id = 'x_26385_crs_kd_u_kb_collaborative_activity_type']/div[2]/div/md-checkbox")
	public List<WebElement> crsKnowledgeManagementSystemSelectTypeOfCollaborativeActivityList;

	/*** CRS Knowledge Management System Products Outputs List */
	@FindBy(xpath = "//*[@id = 'x_26385_crs_kd_u_kb_products_outputs']/div[2]/div[6]/md-checkbox")
	public List<WebElement> crsKnowledgeManagementSystemProductsOutputsList;

	/*** CRS Knowledge Management System Uploaded File */
	@FindBy(xpath = "//div[@id = 'crs-article']/div/div/div/div[1]/div[43]/div[2]/div/input")
	public WebElement crsKnowledgeManagementSystemUploadedFile;

	/*** CRS Knowledge Management System "AutomationTest" Under Review Text */
	@FindBy(xpath = "//a[contains(text(),'AutomationTest')]/following::div[2]")
	public WebElement crsKnowledgeManagementSystemAutomationTestUnderReviewText;

	/** CRS Knowledge Management System "AutomationTest" Delete Button */
	@FindBy(xpath = "//a[contains(text(),'AutomationTest')]/following::button[4]")
	public WebElement crsKnowledgeManagementSystemAutomationTestDeleteButton;

	/*** CRS Knowledge Management System Confirm Delete Button */
	@FindBy(xpath = "//button[@ng-click = 'c.deleteSubmission()']")
	public WebElement crsKnowledgeManagementSystemConfirmDeleteButton;

	/***
	 * CRS Knowledge Management System Submission Has Been Successfully Deleted
	 * PopUp Text
	 */
	@FindBy(xpath = "//div[contains(text(), 'Submission has been successfully deleted.')]")
	public WebElement crsKnowledgeManagementSystemSubmissionHasBeenSuccessfullyDeletedPopUpText;

	/***
	 * CRS Knowledge Management System Submission Has Been Successfully Deleted
	 * PopUp Ok Button
	 */
	@FindBy(xpath = "//button[@ng-click = 'buttonClicked(button)']")
	public WebElement crsKnowledgeManagementSystemSubmissionHasBeenSuccessfullyDeletedPopUpOkButton;

	/** ------------ END OF CREATE NEW SUBMISSION PAGE ----------- */

	public CreateNewSubmissionPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
