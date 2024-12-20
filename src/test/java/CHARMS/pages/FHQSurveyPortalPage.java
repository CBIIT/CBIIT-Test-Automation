package CHARMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FHQSurveyPortalPage extends CommonUtils {
	public FHQSurveyPortalPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	/* *************************************************************** */
	/* ************ GENERAL LOCATORS ON FAMILY GRID PAGE ************* */
	/* *************************************************************** */
	/* Home Button */
	@FindBy(xpath = "(//a[normalize-space()='FHQ Home'])[1]")
	public WebElement homeButton;

	/* Form View Button */
	@FindBy(xpath = "(//p[normalize-space()='Form View'])[1]")
	public WebElement formViewButton;

	/* List View Button */
	@FindBy(xpath = "(//p[normalize-space()='List View'])[1]")
	public WebElement listViewButton;

	/* List View Button */
	@FindBy(xpath = "(//a[normalize-space()='List View'])[1]")
	public WebElement listViewButton1;

	/* FAMILY GRID Page: FHQ Children Link */
	@FindBy(xpath = "//td[normalize-space()=\"Children\"]")
	public WebElement childrenLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Partners Link */
	@FindBy(xpath = "//td[normalize-space()=\"Partners\"]")
	public WebElement partnersLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Siblings Link */
	@FindBy(xpath = "//td[normalize-space()=\"Siblings\"]")
	public WebElement siblingsLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Parents Link */
	@FindBy(xpath = "//td[normalize-space()=\"Parents\"]")
	public WebElement parentsLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Aunt/Uncle Link */
	@FindBy(xpath = "//td[normalize-space()=\"Aunt/Uncle\"]")
	public WebElement auntUncleLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Niece/Nephew Link */
	@FindBy(xpath = "//td[normalize-space()=\"Niece/Nephew\"]")
	public WebElement nieceNephewLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Grandparents Link */
	@FindBy(xpath = "//td[normalize-space()=\"Grandparents\"]")
	public WebElement grandparentsLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Grandchild Link */
	@FindBy(xpath = "(//td[normalize-space()='Grandchildren'])[1]")
	public WebElement grandChildrenLinkOnFamilyGrid;

	/* FAMILY GRID Page: FHQ Cousins Link */
	@FindBy(xpath = "//td[normalize-space()=\"Cousins\"]")
	public WebElement cousinsLinkOnFamilyGrid;

	/* *************************************************************** */
	/* ************* GENERAL LOCATORS ON LIST VIEW PAGE ************** */
	/* *************************************************************** */

	/* LIST VIEW Page:List View Button */
	@FindBy(xpath = "(//a[normalize-space()='List View'])[1]")
	public WebElement listView1Button;

	/* LIST VIEW Page: Parents on the Parent LIST VIEW Page */
	@FindBy(xpath = "//span[normalize-space()=\"Parents\"]")
	public WebElement parentsBanner;

	/* LIST VIEW Page: Sons/Daughters on the Child LIST VIEW Page */
	@FindBy(xpath = "(//span[normalize-space()='Sons/Daughters'])[1]")
	public WebElement childrenBanner;

	/* LIST VIEW Page: Partner on the Partner LIST VIEW Page */
	@FindBy(xpath = "(//span[normalize-space()='Partners'])[1]")
	public WebElement partnerBanner;

	/* LIST VIEW Page: Sibling on the Sibling LIST VIEW Page */
	@FindBy(xpath = "(//span[normalize-space()='Siblings'])[1]")
	public WebElement siblingBanner;

	/* LIST VIEW Page: AuntUncle on the AuntUncle LIST VIEW Page */
	@FindBy(xpath = "(//span[normalize-space()=\"Aunt/Uncles\"])[1]")
	public WebElement auntsUnclesBanner;

	/* LIST VIEW Page: Parents on the Parent LIST VIEW Page */
	@FindBy(xpath = "(//span[normalize-space()=\"Nieces/Nephews\"])[1]")
	public WebElement neiceNephewBanner;

	/* LIST VIEW Page: Parents on the Parent LIST VIEW Page */
	@FindBy(xpath = "//span[normalize-space()=\"Grandparents\"]")
	public WebElement grandParentsBanner;

	/* LIST VIEW Page: Parents on the Parent LIST VIEW Page */
	@FindBy(xpath = "(//span[@class='panel-title ng-binding'])[1]")
	public WebElement grandChildrenBanner;

	/* LIST VIEW Page: Parents on the Parent LIST VIEW Page */
	@FindBy(xpath = "//span[normalize-space()=\"Cousins\"]")
	public WebElement cousinsBanner;

	/* LIST VIEW Page: New Link on the LIST VIEW Page */
	@FindBy(xpath = "//button[@name=\"new\"]")
	public WebElement newButtonLinkOnListView;

	/* LIST VIEW Page: Context Menu Button on the Parent LIST VIEW Page */
	@FindBy(xpath = "//button[@aria-label=\"FHQ Parents Context Menu\"]")
	public WebElement parentContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Child LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Childs Context Menu'])[1]")
	public WebElement childContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Partner LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Partners Context Menu'])[1]")
	public WebElement partnerContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Sibling LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Siblings Context Menu'])[1]")
	public WebElement siblingContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Aunt/Uncle LIST VIEW Page */
	@FindBy(xpath = "(//button[@id='optionsMenu'])[1]")
	public WebElement auntUncleContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Parent LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Childs Context Menu'])[1]")
	public WebElement neiceNephewContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Parent LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Parents Context Menu'])[1]")
	public WebElement grandParentContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Parent LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Childs Context Menu'])[1]")
	public WebElement grandChildrenContextMenuButton;

	/* LIST VIEW Page: Context Menu Button on the Parent LIST VIEW Page */
	@FindBy(xpath = "(//button[@aria-label='FHQ Childs Context Menu'])[1]")
	public WebElement cousinContextMenuButton;

	/* LIST VIEW Page: The blue highlighted rows represent the incompleted family records on LIST VIEW Page */
	@FindBy(xpath = "(//div[contains(text(),'The blue highlighted rows represent the incomplete')])[1]")
	public WebElement rowsDetailsOnListView;

	/* LIST VIEW Page: The blue highlighted rows represent the incompleted family records on LIST VIEW Page */
	@FindBy(xpath = "(//a[@class='sp-breadcrumb-link ng-binding'][normalize-space()='All'])[1]")
	public WebElement allDetailsOnListView;

	/* LIST VIEW Page: Relation to Patient in (Biological Mother, Biological Father)*/
	@FindBy(xpath = "(//a[contains(text(),'Relation to Patient in (Biological Mother, Biologi')])[1]")
	public WebElement parentRelationToPatientBannerOnListView;

	/* LIST VIEW Page: Relation to patient = Son/Daughter on LIST VIEW Page */
	@FindBy(xpath = "(//a[normalize-space()='Relation to patient = Son/Daughter'])[1]")
	public WebElement childRelationToPatientBannerOnListView;

	/* LIST VIEW Page: Relation to patient = Niece/Nephew on LIST VIEW Page */
	@FindBy(xpath = "(//a[normalize-space()='Relation to patient = Niece/Nephew'])[1]")
	public WebElement neiceNephewRelationToPatientBannerOnListView;

	/*LIST VIEW Page: Relation to Patient in (Paternal grandfather (Father's Father), Paternal grandmother (Father's Mother),) */
	@FindBy(xpath = "(//a[contains(text(),\"Relation to Patient in (Paternal grandfather (Fath\")])[1]")
	public WebElement grandParentRelationToPatientBannerOnListView;

	/* LIST VIEW Page: Relation to patient = Niece/Nephew on LIST VIEW Page */
	@FindBy(xpath = "(//a[normalize-space()='Relation to patient = Grandchild'])[1]")
	public WebElement grandChildrenRelationToPatientBannerOnListView;

	/* LIST VIEW Page: Relation to patient = Cousin on LIST VIEW Page */
	@FindBy(xpath = "(//a[normalize-space()='Relation to patient = Cousin'])[1]")
	public WebElement cousinRelationToPatientBannerOnListView;

	/* LIST VIEW Page: No records in FHQ Child using that filter on LIST VIEW Page Banner */
	@FindBy(xpath = "(//div[@class='alert alert-info ng-binding ng-scope'])[1]")
	public WebElement noRecordsOnListView;

	/* LIST VIEW Page: First Name */
	@FindBy(xpath = "(//div[@aria-label='First Name'])[1]")
	public WebElement firstNameOnListView;

	/* LIST VIEW Page: First Initial of LAST name */
	@FindBy(xpath = "(//div[@aria-label='First Initial of LAST Name'])[1]")
	public WebElement firstInitialOfLastNameOnListView;

	/* LIST VIEW Page: Vital Status */
	@FindBy(xpath = "(//div[@aria-label='Vital Status'])[1]")
	public WebElement vitalStatusOnListView;

	/* LIST VIEW Page: Year of Birth */
	@FindBy(xpath = "(//div[normalize-space()='Year of Birth'])[1]")
	public WebElement yearOfBirthOnListView;

	/* LIST VIEW Page: Types of siblings */
	@FindBy(xpath = "(//div[normalize-space()='Type of sibling'])[1]")
	public WebElement siblingrelationToPatientOnListView;

	/* LIST VIEW Page: Relation to Patient */
	@FindBy(xpath = "(//div[normalize-space()='Relation to patient'])[1]")
	public WebElement relationToPatientOnListView;

	/* LIST VIEW Page: Relation to Patient */
	@FindBy(xpath = "(//div[normalize-space()='Relation to Patient'])[1]")
	public WebElement relationToPatientOnListView1;

	/* LIST VIEW Page: Sex assigned at birth */
	@FindBy(xpath = "(//div[@aria-label='Sex assigned at birth'])[1]")
	public WebElement sexAssignedAtBirthOnListView;

	/* LIST VIEW Page: Relation to Patient(Biological Father) Value */
	@FindBy(xpath = "(//span[normalize-space()='Biological Father'])[1]")
	public WebElement relationToPatientOnListViewValue1;

	/* LIST VIEW Page: Relation to Patient (Biological Mother) Value */
	@FindBy(xpath = "(//span[normalize-space()='Biological Mother'])[1]")
	public WebElement relationToPatientOnListViewValue2;

	/* LIST VIEW Page: Relation to Patient (Biological Mother) Value */
	@FindBy(xpath = "//tbody/tr[1]/td[5]")
	public WebElement relationToPatientOnListViewValue3;

	/* LIST VIEW Page: Relation to Patient(Biological Father) Value */
	@FindBy(xpath = "//tbody/tr[2]/td[5]")
	public WebElement relationToPatientOnListViewValue4;

	/* LIST VIEW Page: Relation to Patient (Biological Mother) Value */
	@FindBy(xpath = "//tbody/tr[3]/td[5]")
	public WebElement relationToPatientOnListViewValue5;

	/* LIST VIEW Page: Relation to Patient(Biological Father) Value */
	@FindBy(xpath = "//tbody/tr[4]/td[5]")
	public WebElement relationToPatientOnListViewValue6;

	/* LIST VIEW Page: Son/Daughter Banner on FHQ Child List view Page */
	@FindBy(xpath = "//a[normalize-space()=\"Relation to patient = Son/Daughter\"]")
	public WebElement ChildrelationToPatientSonDaughterBannerOnListView;

	/* LIST VIEW Page: Son/Daughter First Name on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant Child FN'])[1]")
	public WebElement childFirstNameOnListViewValue;

	/* LIST VIEW Page: Son/Daughter First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='A'])[1]")
	public WebElement childFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: Son/Daughter Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Alive'])[1]")
	public WebElement childVitalStatusOnListViewValue;

	/* LIST VIEW Page: Child Relation to Patient Value */
	@FindBy(xpath = "(//span[normalize-space()='Son/Daughter'])[1]")
	public WebElement childRelationToPatientOnListViewValue;

	/* LIST VIEW Page: Son/Daughter First Name on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant New Child FN'])[1]")
	public WebElement childFirstNameOnListViewValue1;

	/* LIST VIEW Page: Son/Daughter First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='J'])[1]")
	public WebElement childFirstInitialOfLastNameOnListViewValue1;

	/* LIST VIEW Page: Son/Daughter First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='P'])[1]")
	public WebElement childFirstInitialOfLastNameOnListViewValue2;

	/* LIST VIEW Page: Son/Daughter Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement childVitalStatusOnListViewValue1;

	/* LIST VIEW Page: Son/Daughter Year Of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()='1942'])[1]")
	public WebElement childYearOfBirthOnListViewValue1;

	/* LIST VIEW Page: Son/Daughter Year Of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()='1962'])[1]")
	public WebElement childYearOfBirthOnListViewValue2;

	/* LIST VIEW Page: Child Relation to Patient Value */
	@FindBy(xpath = "(//span[normalize-space()='Son/Daughter'])[1]")
	public WebElement childRelationToPatientOnListViewValue1;

	/* LIST VIEW Page: Child Relation to Patient Value */
	@FindBy(xpath = "(//span[normalize-space()='Female'])[1]")
	public WebElement childSexAssignedAtBirthOnListView1;

	/* LIST VIEW Page:Partner Banner on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant Partner FN'][normalize-space()='Participant Partner FN'])[1]")
	public WebElement partnerFirstNameOnListViewValue;

	/* LIST VIEW Page:Partner Banner on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: New Partner FN'][normalize-space()='New Partner FN'])[1]")
	public WebElement partnerFirstNameOnListViewValue1;

	/* LIST VIEW Page: Partner First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='B'])[1]")
	public WebElement partnerFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: Partner First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='M'])[1]")
	public WebElement partnerFirstInitialOfLastNameOnListViewValue1;

	/* LIST VIEW Page:Partner Vital Status on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement partnerVitalStatusOnListViewValue;

	/* LIST VIEW Page:Partner Vital Status on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[2]")
	public WebElement partnerVitalStatusOnListViewValue1;

	/* LIST VIEW Page:Partner Year of Birth on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[normalize-space()='1962'])[1]")
	public WebElement partnerYearOfBirthOnListViewValue1;

	/* LIST VIEW Page: Partner Year of Birth Value */
	@FindBy(xpath = "(//td[@data-field='year_of_birth'])[1]")
	public WebElement partnerYearOfBirthOnListView;

	/* LIST VIEW Page: Partner Relation to Patient Value */
	@FindBy(xpath = "(//span[normalize-space()='Participants Partner'])[1]")
	public WebElement partnerRelationToPatientOnListViewValue;

	/* LIST VIEW Page: Partner Relation to Patient Value */
	@FindBy(xpath = "(//span[normalize-space()='Participants Partner'])[2]")
	public WebElement partnerRelationToPatientOnListViewValue1;

	/* LIST VIEW Page: Sibling First Name on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Elder Sibling FN'][normalize-space()='Elder Sibling FN'])[1]")
	public WebElement siblingFirstNameOnListViewValue1;

	/* LIST VIEW Page: Sibling First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='M'])[1]")
	public WebElement siblingFirstInitialOfLastNameOnListViewValue1;

	/* LIST VIEW Page: Sibling Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement siblingVitalStatusOnListViewValue1;

	/* LIST VIEW Page: Sibling Year of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()='1977'])[1]")
	public WebElement siblingyearOfBirthOnListViewValue1;

	/* LIST VIEW Page: Types of Sibling Value */
	@FindBy(xpath = "(//span[normalize-space()='Half Sister (same mother)'])[1]")
	public WebElement siblingrelationToPatientOnListViewValue1;

	/* LIST VIEW Page: Sibling First Name on FHQ Child List view Page Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant Sibling FN'])[1]")
	public WebElement siblingFirstNameOnListViewValue;

	/* LIST VIEW Page: Sibling First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='C'])[1]")
	public WebElement siblingFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: Sibling Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()=\"Prefer not to answer\"])[1]")
	public WebElement siblingVitalStatusOnListViewValue;

	/* LIST VIEW Page: Sibling Year of Birth Value */
	@FindBy(xpath = "(//td[@role='cell'])[4]")
	public WebElement siblingyearOfBirthOnListViewValue;

	/* LIST VIEW Page: Types of Sibling Value */
	@FindBy(xpath = "(//span[normalize-space()='Brother'])[1]")
	public WebElement siblingrelationToPatientOnListViewValue;

	/* LIST VIEW Page: Sibling First Name Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Parent Sibling FN'])[1]")
	public WebElement auntUncleFirstNameOnListViewValue;

	/* LIST VIEW Page: AuntUncle First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='C'])[1]")
	public WebElement auntUncleFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: AuntUncle Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Prefer not to answer'])[1]")
	public WebElement auntUncleVitalStatusOnListViewValue;

	/* LIST VIEW Page: AuntUncle Year of Birth Value */
	@FindBy(xpath = "(//td[@role='cell'])[4]")
	public WebElement auntUncleYearOfBirthOnListViewValue;

	/* LIST VIEW Page: AuntUncle Relation Value */
	@FindBy(xpath = "(//td[@data-field='relation_to_patient'])[1]")
	public WebElement auntUncleRelationToPatientOnListViewValue;

	/* LIST VIEW Page: Sibling First Name Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant AuntUncle FN'])[1]")
	public WebElement auntUncleFirstNameOnListViewValue1;

	/* LIST VIEW Page: AuntUncle First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='D'])[1]")
	public WebElement auntUncleFirstInitialOfLastNameOnListViewValue1;

	/* LIST VIEW Page: AuntUncle Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement auntUncleVitalStatusOnListViewValue1;

	/* LIST VIEW Page: AuntUncle Year of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()='1955'])[1]")
	public WebElement auntUncleYearOfBirthOnListViewValue1;

	/* LIST VIEW Page: AuntUncle Relation Value */
	@FindBy(xpath = "(//span[normalize-space()='Aunt'])[1]")
	public WebElement auntUncleRelationToPatientOnListViewValue1;

	/* LIST VIEW Page: Nieces/Nephews First Name Value */
	@FindBy(xpath = "(//span[contains(@aria-label,'Open record: Sibling child FN')])[1]")
	public WebElement neiceNephewFirstNameOnListViewValue;

	/* LIST VIEW Page: Nieces/Nephews First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='A'])[1]")
	public WebElement neiceNephewFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: Nieces/Nephews Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Alive'])[1]")
	public WebElement neiceNephewVitalStatusOnListViewValue;

	/* LIST VIEW Page: Nieces/Nephews Year of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()=''])[1]")
	public WebElement neiceNephewyearOfBirthOnListViewValue;

	/* LIST VIEW Page: Nieces/Nephews Relation Value */
	@FindBy(xpath = "(//td[@data-field='relation'])[1]")
	public WebElement neiceNephewRelationToPatientOnListViewValue;

	/* LIST VIEW Page:Nieces/Nephews Sex Assigned at birth Value */
	@FindBy(xpath = "(//td[@data-field='sex_assigned_at_birth'])[1]")
	public WebElement neiceNephewSexAssignedAtBirthtOnListViewValue;

	/* LIST VIEW Page: Nieces/Nephews First Name Value */
	@FindBy(xpath = "(//span[contains(@aria-label,'Open record: Participant NieceNephew FN')])[1]")
	public WebElement neiceNephewFirstNameOnListViewValue1;

	/* LIST VIEW Page: Nieces/Nephews First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='J'])[1]")
	public WebElement neiceNephewFirstInitialOfLastNameOnListViewValue1;

	/* LIST VIEW Page: Nieces/Nephews Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement neiceNephewVitalStatusOnListViewValue1;

	/* LIST VIEW Page: Nieces/Nephews Year of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()='1942'])[1]")
	public WebElement neiceNephewyearOfBirthOnListViewValue1;
	
	/* LIST VIEW Page: Nieces/Nephews Relation Value */
	@FindBy(xpath = "(//td[@data-field='relation'])[2]")
	public WebElement neiceNephewRelationToPatientOnListViewValue1;

	/* LIST VIEW Page:Nieces/Nephews Sex Assigned at birth Value */
	@FindBy(xpath = "(//td[@data-field='sex_assigned_at_birth'])[2]")
	public WebElement neiceNephewSexAssignedAtBirthtOnListViewValue1;

	/* LIST VIEW Page: Grandchild First Name Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant SonDaughter Child FN'])[1]")
	public WebElement grandChildrenFirstNameOnListViewValue;

	/* LIST VIEW Page: Grandchild First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='A'])[1]")
	public WebElement grandChildrenFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: Grandchild Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Alive'])[1]")
	public WebElement grandChildrenVitalStatusOnListViewValue;

	/* LIST VIEW Page: Grandchild Relation to Patient Value */
	@FindBy(xpath = "(//span[@class='ng-binding ng-scope'][normalize-space()='Grandchild'])[1]")
	public WebElement GrandchildRelationToPatientOnListViewValue;

	/* LIST VIEW Page: Grandchild First Name Value */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant GrandChild FN'])[1]")
	public WebElement grandChildFirstNameOnListViewValue;

	/* LIST VIEW Page: Grandchild First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='R'])[1]")
	public WebElement grandChildFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page: Grandchild Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement grandChildVitalStatusOnListViewValue;

	/* LIST VIEW Page: Grandchild Year Of Birth Value */
	@FindBy(xpath = "(//span[normalize-space()='1967'])[1]")
	public WebElement grandChildYearOfBirthOnListViewValue;

	/* LIST VIEW Page: Grandchild Relation to Patient Value */
	@FindBy(xpath = "(//span[@class='ng-binding ng-scope'][normalize-space()='Grandchild'])[1]")
	public WebElement grandChildRelationToPatientOnListViewValue;

	/* LIST VIEW Page: Grandchild Sex Assigned at birth Value */
	@FindBy(xpath = "(//span[normalize-space()='Female'])[1]")
	public WebElement grandChildSexAssignedAtBirthOnListView;

	/* LIST VIEW Page: Cousins First Name Value */
	@FindBy(xpath = "(//span[contains(@aria-label,'Open record: Aunt Child FN')])[1]")
	public WebElement cousinFirstNameOnListViewValue;

	/* LIST VIEW Page: Cousins First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='E'])[1]")
	public WebElement cousinFirstInitialOfLastNameOnListViewValue;

	/* LIST VIEW Page:Cousins Vital Status Value */
	@FindBy(xpath = "(//td[normalize-space()=\"Don't Know\"])[1]")
	public WebElement cousinrenVitalStatusOnListViewValue;

	/* LIST VIEW Page: Cousins Year of Birth Value */
	@FindBy(xpath = "(//td[contains(@data-field,'year_of_birth')])[1]")
	public WebElement cousinYearOfBirthOnListViewValue;

	/* LIST VIEW Page: Cousins Relation Value */
	@FindBy(xpath = "(//span[normalize-space()='Cousin'])[1]")
	public WebElement cousinRelationToPatientOnListViewValue;

	/* LIST VIEW Page: Cousins Sex Assigned at birth Value */
	@FindBy(xpath = "(//td[contains(@data-field,'sex_assigned_at_birth')])[1]")
	public WebElement cousinSexAssignedAtBirthtOnListViewValue;

	/* LIST VIEW Page: Cousins First Name Value */
	@FindBy(xpath = "(//span[contains(@aria-label,'Open record: Participant Cousin FN')])[1]")
	public WebElement cousinFirstNameOnListViewValue1;

	/* LIST VIEW Page: Cousins First Initial Of Last Name Value */
	@FindBy(xpath = "(//span[normalize-space()='J'])[1]")
	public WebElement cousinFirstInitialOfLastNameOnListViewValue1;

	/* LIST VIEW Page:Cousins Vital Status Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement cousinrenVitalStatusOnListViewValue1;

	/* LIST VIEW Page: Cousins Year of Birth Value */
	@FindBy(xpath = "(//td[contains(@data-field,'year_of_birth')])[2]")
	public WebElement cousinYearOfBirthOnListViewValue1;

	/* LIST VIEW Page: Cousins Relation Value */
	@FindBy(xpath = "(//span[normalize-space()='Cousin'])[2]")
	public WebElement cousinRelationToPatientOnListViewValue1;

	/* LIST VIEW Page: Cousins Sex Assigned at birth Value */
	@FindBy(xpath = "(//td[contains(@data-field,'sex_assigned_at_birth')])[2]")
	public WebElement cousinSexAssignedAtBirthtOnListViewValue1;

	/* *************************************************************** */
	/* *** GENERAL LOCATORS ON All RELATIONS FHQ NEW RECORD PRODUCERS ** */
	/* *************************************************************** */

	/* RELATION RP:Header Banner */
	@FindBy(xpath = "(//p[contains(text(),\"We know families come in various configurations. T\")])[1]")
	public WebElement headerBanner;

	/* Completed Form View Button */
	@FindBy(xpath = "(//p[normalize-space()='Complete Form View'])[1]")
	public WebElement completedFormViewButton;

	/* RELATION RP:Short Description Information Banner on a new RP */
	@FindBy(xpath = "//div[@class=\"text-muted sc-cat-item-short-description ng-binding ng-scope\"]")
	public WebElement shortDescriptionInformationBanner;

	/* RELATION RP:First name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Name\"]")
	public WebElement firstNameLabel;

	/* RELATION RP:First Name textBox */
	@FindBy(xpath = "//input[@id=\"sp_formfield_first_name\"]")
	public WebElement firstNameTextBox;

	/* RELATION RP:First Initial of LAST name Label */
	@FindBy(xpath = "(//span[normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement firstInitialLastNameLabel;

	// @FindBy(xpath = "//span[normalize-space()=\"Initial of Last Name\"]")
	public WebElement firstInitialLastNameLabel1;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//span[normalize-space()='Year of Birth'])[1]")
	public WebElement yearOfBirthLabel;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[1]")
	public WebElement dateLabelBanner1;

	/* RELATION RP: Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[2]")
	public WebElement dateLabelBanner2;

	/* RELATION RP: Year Of Birth Label */
	@FindBy(xpath = "(//div[contains(@class,'well wrapper-xs m-b-sm flex-row justify-between ng-scope')])[3]")
	public WebElement dateLabelBanners;

	/* RELATION RP: Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='text-muted well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[3]")
	public WebElement dateLabelBanner3;

	/* RELATION RP: Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[4]")
	public WebElement dateLabelBanner4;

	/* RELATION RP: Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[5]")
	public WebElement dateLabelBanner5;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[1]")
	public WebElement yearOfBirthdateLabelBanner;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[2]")
	public WebElement yearOfBirthdateLabelBanner1;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "//div[@id='year_of_birth']//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope']")
	public WebElement yearOfBirthdateLabelBanner2;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[5]")
	public WebElement yearOfDeathdateLabelBanner1;

	/* RELATION RP:Year Of Death Label */
	@FindBy(xpath = "//div[@id=\"year_of_death\"]//div[contains(@class,\"text-muted well wrapper-xs m-b-sm flex-row justify-between ng-scope\")]//div[1]")
	public WebElement yearOfDeathdateLabelBanner2;

	/* RELATION RP:Vital Status Label */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status\"]")
	public WebElement vitalStatusLabel;

	/* RELATION RP:Current Age Label */
	@FindBy(xpath = "//span[normalize-space()=\"Current Age\"]")
	public WebElement currentAgeLabel;

	/* RELATION RP:Complete and Submit button */
	@FindBy(xpath = "//button[@name=\"Submit\"]")
	public WebElement CompleteAndSubmitButton;

	/* RELATION RP:Please provide the year or the age of death Label */
	@FindBy(xpath = "(//span[normalize-space()='Please provide the year of death or the age of death'])[1]")
	public WebElement yearOfDeathOrAgeLabel;

	/* RELATION RP:Year Of Death Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_year_of_death\"]//span[@class=\"ng-binding\"]")
	public WebElement yearOfDeathLabel;

	/* RELATION RP:Age Of Death Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_age_of_death\"]//span[@class=\"ng-binding\"]")
	public WebElement ageOfDeathLabel;

	// /* RELATION RP:Cause of Death Label */
	@FindBy(xpath = "(//span[normalize-space()='Cause of Death'])[1]")
	public WebElement causeOfDeathLabel;

	// /* RELATION RP:What was the cause of death Label */
	@FindBy(xpath = "(//span[normalize-space()='What was the cause of death?'])[1]")
	public WebElement causeOfDeathLabel1;

	/* RELATION RP:What was the cause of this relatives death? Label */
	@FindBy(xpath = "(//span[normalize-space()='What was the cause of this relative death?'])[1]")
	public WebElement causeOfThisRelativeDeathLabel;

	/* RELATION RP:If you don't know, you can write "don't know" in the text box */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[4]")
	public WebElement causeOfDeathInformation;

	/* RELATION RP:If you don't know, you can write "don't know" in the text box */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[7]")
	public WebElement causeOfDeathInformationBanner1;

	/* RELATION RP:If you don't know, you can write "don't know" in the text box */
	@FindBy(xpath = "//div[@id='cause_of_death']//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope']")
	public WebElement causeOfDeathInformationBanner;

	/* RELATION RP:If you don't know, you can write "don't know" in the text box */
	@FindBy(xpath = "//span[contains(@class,\"type-string field-actual state-mandatory\")]//div[contains(@class,\"text-muted well wrapper-xs m-b-sm flex-row justify-between ng-scope\")]")
	public WebElement causeOfDeathInformation2;

	/* RELATION RP:If you don't know, you can write "don't know" in the text box */
	@FindBy(xpath = "(//span[@class='ng-binding'])[21]")
	public WebElement causeOfDeathInformation1;

	/* RELATION RP:Cause Of Death InformationLink */
	@FindBy(xpath = "//div[@id=\"cause_of_death\"]//sp-help-tag[@class=\"ng-isolate-scope\"]")
	public WebElement causeOfDeathInformationLink;

	/* RELATION RP:Cause Of Death TextBox */
	@FindBy(xpath = "//input[@name=\"cause_of_death\"]")
	public WebElement causeOfDeathTextBox;

	/* RELATION RP:Cause Of Death TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_what_was_the_cause_of_death'])[1]")
	public WebElement causeOfDeathTextBox1;

	/* RELATION RP:Sex assigned at birth Label */
	@FindBy(xpath = "//span[normalize-space()=\"Sex assigned at birth\"]")
	public WebElement sexAssignedAtBirthLabel;

	/* RELATION RP:Gender Identity Label */
	@FindBy(xpath = "//span[normalize-space()=\"Gender Identity\"]")
	public WebElement genderIdentityLabel;

	/* RELATION RP:Gender Identity Label */
	@FindBy(xpath = "(//span[normalize-space()='Other gender'])[1]")
	public WebElement otherGenderIdentityLabel;

	/* RELATION RP:Is this relative a twin or part of a multiple birth?Label */
	@FindBy(xpath = "//span[normalize-space()=\"Is this relative a twin or part of a multiple birth?\"]")
	public WebElement isThisRelativeTwinOrMultipleBirthLabel;

	/* RELATION RP:Type of birth Label */
	@FindBy(xpath = "//span[normalize-space()=\"Type of birth\"]")
	public WebElement typeOfBirthLabel;

	/* RELATION RP:Has this relative been diagnosed with a RASopathy? Label */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative been diagnosed with a RASopathy?'])[1]")
	public WebElement diagnosedWithRasopathyLabel;

	/* RELATION RP: RASopathies Banner */
	@FindBy(xpath = "//span[@class=\"ng-binding\"][normalize-space()=\"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)\"]")
	public WebElement diagnosedWithRasopathyBanner;

	/* RELATION RP: RASopathies Banner Information */
	@FindBy(xpath = "//span[@class=\"ng-binding\"][normalize-space()=\"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)\"]")
	public WebElement diagnosedWithRasopathyInformationBanner;

	/* RELATION RP:If multiple RASopathy Add button Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each R\")])[1]")
	public WebElement rasopathyAddButtonInfoBanner;

	/* RELATION RP:If multiple RASopathy Add button Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each R\")])[1]")
	public WebElement rasopathyAddButtonInfoBanner1;

	/* RELATION RP:Please select the 'Add' button below to add each RASopathy this person has had. */
	@FindBy(xpath = "//div[@id=\"rasopathy_mrvs_label\"]//div[@class=\"ng-scope\"]")
	public WebElement personDiagnosedWithRasopathyAddButtonInfo;

	/* RELATION RP: Actions Banner */
	@FindBy(xpath = "(//th[@class='text-nowrap ng-scope'][normalize-space()='Actions'])[1]")
	public WebElement actionsBanner;

	/* RELATION RP: Actions Banner */
	@FindBy(xpath = "(//th[@class='text-nowrap ng-scope'][normalize-space()='Actions'])[2]")
	public WebElement actions1Banner;

	/* RELATION RP: Actions Banner */
	@FindBy(xpath = "(//th[@class='text-nowrap ng-scope'][normalize-space()='Actions'])[3]")
	public WebElement actions2Banner;

	/* RELATION RP: Actions Banner */
	@FindBy(xpath = "(//th[@class='text-nowrap ng-scope'][normalize-space()='Actions'])[4]")
	public WebElement actions3Banner;

	/* RELATION RP: RASopathy Banner */
	@FindBy(xpath = "(//th[normalize-space()='RASopathy'])[1]")
	public WebElement rASopathyBanner;

	/* RELATION RP: RASopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other RASopathy'])[1]")
	public WebElement rASopathyBannerValue;

	/* RELATION RP: Specify other RASopathy Banner */
	@FindBy(xpath = "(//th[normalize-space()='Specify other RASopathy'])[1]")
	public WebElement specifyOtherRASopathyBanner;

	/* RELATION RP: Cancer Banner */
	@FindBy(xpath = "(//th[normalize-space()='Cancer'])[1]")
	public WebElement cancerBanner;

	/* RELATION RP: Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other cancer'])[1]")
	public WebElement cancerBannerValue;

	/* RELATION RP: Specify other cancer Banner */
	@FindBy(xpath = "(//th[normalize-space()='Specify other cancer'])[1]")
	public WebElement specifyOtherCancerBanner;

	/* RELATION RP: Medical Condition Banner */
	@FindBy(xpath = "(//th[normalize-space()='Medical Condition'])[1]")
	public WebElement medicalConditionBanner;

	/* RELATION RP: Specify medical condition Banner */
	@FindBy(xpath = "(//th[normalize-space()='Specify medical condition'])[1]")
	public WebElement specifyMedicalConditionBanner;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for Parent'])[1]")
	public WebElement parentSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other cancer for Parent'])[1]")
	public WebElement parentSpecifyOtherCancerBannerValue;

	/* RELATION RP: Medical Condition Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Congenital heart disease'])[1]")
	public WebElement parentMedicalConditionBannerValue;

	/* RELATION RP: Specify medical condition Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Congenital condition'])[1]")
	public WebElement parentSpecifyMedicalConditionBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for child'])[1]")
	public WebElement childSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Cancer for child'])[1]")
	public WebElement childSpecifyOtherCancerBannerValue;

	/* RELATION RP: Medical Condition Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Developmental disorder'])[1]")
	public WebElement childMedicalConditionBannerValue;

	/* RELATION RP: Specify medical condition Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Developmental disorder Details'])[1]")
	public WebElement childSpecifyMedicalConditionBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for Sibling'])[1]")
	public WebElement siblingSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Cancer for Sibling'])[1]")
	public WebElement siblingSpecifyOtherCancerBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for AuntUncle'])[1]")
	public WebElement auntUncleSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Cancer for AuntUncle'])[1]")
	public WebElement auntUncleSpecifyOtherCancerBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for NieceNephew'])[1]")
	public WebElement neiceNephewSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Cancer for NeiceNephew'])[1]")
	public WebElement neiceNephewSpecifyOtherCancerBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Grandparent Other Rasopathy Details'])[1]")
	public WebElement grandParentSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Grandparent Skin Cancer Details'])[1]")
	public WebElement grandParentSpecifyOtherCancerBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for GrandChild'])[1]")
	public WebElement grandChildSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Cancer for GrandChild'])[1]")
	public WebElement grandChildSpecifyOtherCancerBannerValue;

	/* RELATION RP: Specify other Rasopathy Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Rasopathy for Cousin'])[1]")
	public WebElement cousinSpecifyOtherRASopathyBannerValue;

	/* RELATION RP: Specify other Cancer Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Other Cancer for Cousin'])[1]")
	public WebElement cousinSpecifyOtherCancerBannerValue;

	/* RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][contains(text(),'Please provide the year of diagnosis or the age of')])[1]")
	public WebElement yearOrAgeOfDiagnosisBanner;

	/* RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][contains(text(),'Please provide the year of diagnosis or the age of')])[2]")
	public WebElement yearOrAgeOfDiagnosis1Banner;

	/* RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][contains(text(),'Please provide the year of diagnosis or the age of')])[3]")
	public WebElement yearOrAgeOfDiagnosis2Banner;

	/* RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][contains(text(),'Please provide the year of diagnosis or the age of')])[4]")
	public WebElement yearOrAgeOfDiagnosis3Banner;

	/* RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Age of diagnosis'])[1]")
	public WebElement yearOrAgeOfDiagnosisBannerValue;

	/*RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Age of diagnosis'])[2]")
	public WebElement yearOrAgeOfDiagnosis1BannerValue;

	/* RELATION RP: Please provide the year of diagnosis or the age of diagnosis Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Age of diagnosis'])[3]")
	public WebElement yearOrAgeOfDiagnosis2BannerValue;

	/* RELATION RP: Year of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Year of diagnosis'])[1]")
	public WebElement yearOfDiagnosisBanner;

	/* RELATION RP: Year of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Year of diagnosis'])[2]")
	public WebElement yearOfDiagnosis1Banner;

	/* RELATION RP: Year of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Year of diagnosis'])[3]")
	public WebElement yearOfDiagnosis2Banner;

	/* RELATION RP: Year of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Year of diagnosis'])[4]")
	public WebElement yearOfDiagnosis3Banner;

	/* RELATION RP: Year of diagnosis Banner Value */
	@FindBy(xpath = "(//td[contains(@ng-repeat,'col in ::field.columns_meta track by col.id')])[4]")
	public WebElement yearOfDiagnosisBannerValue;

	/* RELATION RP: Year of diagnosis Banner Value */
	@FindBy(xpath = "(//td[contains(@ng-repeat,'col in ::field.columns_meta track by col.id')])[10]")
	public WebElement yearOfDiagnosis1BannerValue;

	/* RELATION RP: Year of diagnosis Banner Value */
	@FindBy(xpath = "(//td[contains(@ng-repeat,'col in ::field.columns_meta track by col.id')])[16]")
	public WebElement yearOfDiagnosis2BannerValue;

	/* RELATION RP: Age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Age of diagnosis'])[1]")
	public WebElement ageOfDiagnosisBanner;

	/* RELATION RP: Age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Age of diagnosis'])[2]")
	public WebElement ageOfDiagnosis1Banner;

	/* RELATION RP: Age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Age of diagnosis'])[3]")
	public WebElement ageOfDiagnosis2Banner;

	/* RELATION RP: Age of diagnosis Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Age of diagnosis'])[4]")
	public WebElement ageOfDiagnosis3Banner;

	/* RELATION RP: Age of diagnosis Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='18'])[1]")
	public WebElement ageOfDiagnosisBannerValue;

	/* RELATION RP: Age of diagnosis Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='29'])[1]")
	public WebElement ageOfDiagnosis1BannerValue;

	/* RELATION RP: Age of diagnosis Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='26'])[1]")
	public WebElement ageOfDiagnosis2BannerValue;

	/* RELATION RP: Additional Information Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Additional Information'])[1]")
	public WebElement additionalInformationBanner;

	/* RELATION RP: Additional Information Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Additional Information'])[2]")
	public WebElement additionalInformation1Banner;

	/* RELATION RP: Additional Information Banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Additional Information'])[3]")
	public WebElement additionalInformation2Banner;

	/* RELATION RP: Additional Information Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Additional Rasopathy Information Details added'])[1]")
	public WebElement additionalInformationBannerValue;

	/* RELATION RP: Additional Information Banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Additional Cancer Information Details added'])[1]")
	public WebElement additionalInformation1BannerValue;

	/* RELATION RP: Actions Edit Banner */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[1]")
	public WebElement actionsEdit;

	/* RELATION RP: Actions Edit Banner */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[2]")
	public WebElement actionsEdit1;

	/* RELATION RP: Actions Edit Banner */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[3]")
	public WebElement actionsEdit2;

	/* RELATION RP: Actions Edit Banner */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[4]")
	public WebElement actionsEdit3;

	/* RELATION RP: Actions Delete Banner */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[1]")
	public WebElement actionsDelete;

	/* RELATION RP: Actions Delete Banner */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[2]")
	public WebElement actionsDelete1;

	/* RELATION RP: Actions Delete Banner */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[3]")
	public WebElement actionsDelete2;

	/* RELATION RP: Actions Delete Banner */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[4]")
	public WebElement actionsDelete3;

	/* RELATION RP:Has this relative ever been diagnosed with cancer? Label */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with cancer?'])[1]")
	public WebElement diagnosedWithCancerLabel;

	/* RELATION RP:If yes,please enter a date or age of diagnosis if possible Banner */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='If yes, please enter a date or age of diagnosis if possible.'])[1]")
	public WebElement diagnosedWithCancerBanner;

	/* RELATION RP:Has this relative ever been diagnosed with any of the medical conditions listed below?Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this relative ever been diagnosed with any of the medical conditions listed below?\"]")
	public WebElement diagnosedWithMedicalConditionsLabel;

	/* RELATION RP:Congenital heart disease, Developmental disorder, uncommonphysical features, Other medical conditions. Banner */
	@FindBy(xpath = "(//span[contains(@ng-bind,'::field.help_text')][normalize-space()='Congenital heart disease, developmental disorder, uncommon physical features, other medical conditions.'])[1]")
	public WebElement diagnosedWithMedicalConditionsBanner;

	/* RELATION RP:Congenital heart disease, Developmental disorder, Uncommon physical features, Other medical conditions. Banner*/
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Congenital heart disease, developmental disorder, uncommon physical features, other medical conditions.'])[1]")
	public WebElement relativeDiagnosedWithMedicalConditionsInformation;

	/* RELATION RP:'Child' banner to add any CHILD MRVS */
	@FindBy(xpath = "//span[normalize-space()=\"Child\"]")
	public WebElement childMRVSbanner;

	/* RELATION RP:'Partner' banner to add any Partner MRVS */
	@FindBy(xpath = "//span[normalize-space()=\"Partner\"]")
	public WebElement partnerMRVSBanner;

	/* RELATION RP:Siblings banner to add any Siblings MRVS */
	@FindBy(xpath = "(//span[normalize-space()='Siblings'])[1]")
	public WebElement siblingMRVSBanner;

	/* RELATION RP:'Parents' banner to add any Parent MRVS */
	@FindBy(xpath = "//span[normalize-space()=\"Parents\"]")
	public WebElement parentMRVSBanner;

	/* RELATION RP:'Child' banner to add any CHILD MRVS */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[1]")
	public WebElement childMRVSAddbutton;

	/* RELATION RP:'Child' banner to Remove ALl any CHILD MRVS */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove All'])[1]")
	public WebElement removeAllbutton;

	/* RELATION RP:'Add' button to add any MRVS */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[1]")
	public WebElement addButton;

	/*RELATION RP:Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies? Label */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?'])[1]")
	public WebElement BirthsLabel;

	/* RELATION RP:Please identify the number of each of the following pregnancy results for this person. Banner */
	@FindBy(xpath = "(//label[contains(text(),'Please identify the number of each of the followin')])[1]")
	public WebElement personbirthsBanner;

	/* RELATION RP:Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies? Label */
	@FindBy(xpath = "(//span[normalize-space()='Has the participant ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?'])[1]")
	public WebElement participantPregnanciesLabel;

	/* RELATION RP:Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies? Label */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies?'])[1]")
	public WebElement pregnanciesLabel;

	/* RELATION RP:Please identify the number of each of the following pregnancy results for this parent. banner */
	@FindBy(xpath = "(//label[contains(text(),'Please identify the number of each of the followin')])[1]")
	public WebElement birthsBanner;

	/* RELATION RP:Total number of: Miscarriages Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Miscarriages'])[1]")
	public WebElement totalMiscarriagesLabel;

	/* RELATION RP:Total Number of Stillbirths Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Stillbirths'])[1]")
	public WebElement totalStillbirthsLabel;

	/* RELATION RP:Total Number of Induced Abortions Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Induced Abortions'])[1]")
	public WebElement totalInducedAbortionsLabel;

	/* RELATION RP:Total Number of Tubal/Ectopic/Molar Pregnancies Label */
	@FindBy(xpath = "(//label[contains(@for,'sp_formfield_total_number_of_tubal_ectopic_molar_pregnancies')])[1]")
	public WebElement totalTubalEctopicMolarPregnanciesLabel;

	/* RELATION RP:Total Number of Tubal/Ectopic/Molar Pregnancies Label */
	@FindBy(xpath = "(//label[contains(@for,'sp_formfield_tubal_ectopic_molar_pregnancies')])[1]")
	public WebElement totalTubalEctopicMolarPregnanciesLabel1;

	/* RELATION RP:How many total children has this relative had? Label */
	@FindBy(xpath = "//span[normalize-space()=\"How many total children (alive and deceased) has this relative had?\"]")
	public WebElement totalChildrenThisRelativeHadLabel;

	/* RELATION RP:How many total children has this relative had? Label */
	@FindBy(xpath = "(//span[normalize-space()='How many total children (alive and deceased) has this relative had?'])[1]")
	public WebElement auntUncletotalChildrenThisRelativeHadLabel;

	/* RELATION RP:Do you have any information on Participants relatives?Label */
	@FindBy(xpath = "//span[normalize-space()=\"Is this an aunt or uncle?\"]")
	public WebElement informationOnParticipantRelativesLabel;

	/* RELATION RP:Was this relative adopted? Label */
	@FindBy(xpath = "(//span[normalize-space()='Was this relative adopted?'])[1]")
	public WebElement thisRelativeAdoptedLabel;

	/*RELATION RP:Please include all biological children, living and deceased.Banner */
	@FindBy(xpath = "//div[@id=\"how_many_total_children_alive_and_deceased_has_child_had\"]//div[contains(@class,\"text-muted well wrapper-xs m-b-sm flex-row justify-between ng-scope\")]")
	public WebElement childincludeAllChildrenBanner;

	/* RELATION RP: Banner */
	@FindBy(xpath = "(//span[contains(@class,'ng-binding')][normalize-space()='Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.'])[1]")
	public WebElement includeAllChildrenBanner;

	/* RELATION RP:Please select the 'Add' button below to add each child this person has.Label */
	@FindBy(xpath = "//div[@id=\"child_mrvs_label\"]//div[contains(@class,\"ng-scope\")]")
	public WebElement eachChildThisPersonHasLabel;

	/* RELATION RP: SiblingChild First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Sibling child FN'])[1]")
	public WebElement siblingChildFirstNameBannerValue;

	/* RELATION RP:Is there anything else you would like us to know about this person? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Is there anything else you would like us to know about this person?\"]")
	public WebElement anythingElseAboutThisPersonLabel;

	/* RELATION RP:Form: Any Field DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement fHQFieldDropDown;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[2]")
	public WebElement fHQFieldDropDown1;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[3]")
	public WebElement fHQFieldDropDown2;

	/* *************************************************************** */
	/* ******** COMMON LOCATORS IN ALL MRVS ADD ROW PAGE ***************** */
	/* *************************************************************** */

	/* MRVS PAGE:FHQ New MRVS IFrame */
	@FindBy(xpath = "//iframe[@id='gsft_main']")
	public WebElement mRVSIFrame;

	/* MRVS PAGE:Partner Label */
	@FindBy(xpath = "//span[normalize-space()=\"Partner\"]")
	public WebElement partnerLabel;

	/* MRVS PAGE:Child Label */
	@FindBy(xpath = "//span[normalize-space()=\"Child\"]")
	public WebElement childLabel;

	/* MRVS PAGE:Sibling Label */
	@FindBy(xpath = "//span[normalize-space()=\"Siblings\"]")
	public WebElement siblingLabel;

	/* MRVS PAGE:Parent Label */
	@FindBy(xpath = "//span[normalize-space()=\"Parent\"]")
	public WebElement parentLabel;

	/* MRVS PAGE:RASopathy Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_fhq_rasopathies\"]//span[@class=\"ng-binding\"]")
	public WebElement rASopathyLabel;

	/* MRVS PAGE:Cancer Label */
	@FindBy(xpath = "//span[normalize-space()=\"Cancer(s)\"]")
	public WebElement cancerLabel;

	/* MRVS PAGE:Medical Condition(s) Label */
	@FindBy(xpath = "//span[normalize-space()=\"Medical Condition(s)\"]")
	public WebElement medicalConditionsLabel;

	/* MRVS PAGE:Add Row Banner (Add Row) */
	@FindBy(xpath = "(//h2[normalize-space()='Add Row'])[1]")
	public WebElement addRowBanner;

	/* MRVS PAGE:First Name Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='First Name'])[1]")
	public WebElement addRowFirstNameLabel;

	/* MRVS PAGE:First name of sibling Label */
	@FindBy(xpath = "//span[normalize-space()=\"First name of sibling\"]")
	public WebElement addRowFirstNameSiblingLabel;

	/* MRVS PAGE:First Name Text box */
	@FindBy(xpath = "//input[@class=\"form-control ng-pristine ng-valid ng-scope ng-empty ng-valid-maxlength ng-touched\"]")
	public WebElement addRowFirstNameTextbox;

	/* MRVS PAGE:First name of sibling TextBox */
	@FindBy(xpath = "//input[@name=\"first_name_of_sibling\"]")
	public WebElement addRowFirstNameSiblingTextBox;

	/* MRVS PAGE:First Initial of LAST name Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement addRowFirstInitialOfLastNameLabel;

	/* MRVS PAGE:First Initial of last name Label */
	@FindBy(xpath = "(//span[normalize-space()='First Initial of last name'])[1]")
	public WebElement addRowFirstInitialOfLastName1Label;

	/* MRVS PAGE:First Initial of LAST name DropDown */
	@FindBy(xpath = "(//span[contains(text(),'-- None --')])[1]")
	public WebElement addRowFirstInitialOfLastNameDropDown;

	/* MRVS PAGE:First Initial of LAST name of the Sibling DropDown */
	@FindBy(xpath = "(//span[contains(text(),'-- None --')])[1]")
	public WebElement addRowFirstInitialOfLastNameSiblingDropDown;

	/* MRVS PAGE:Vital Status Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Vital Status'])[1]")
	public WebElement addRowVitalStatusLabel;

	/* MRVS PAGE:Vital Status Label */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status of sibling\"]")
	public WebElement addRowVitalStatusSiblingLabel;

	/* MRVS PAGE:Vital Status DropDown */
	@FindBy(xpath = "(//span[contains(text(),'-- None --')])[2]")
	public WebElement addRowVitalStatusDropDown;

	/* MRVS PAGE:Vital Status of the Sibling DropDown */
	@FindBy(xpath = "//div[4]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement addRowVitalStatusSiblingDropDown;

	/* MRVS PAGE:Types of Siblings relation label */
	@FindBy(xpath = "//span[normalize-space()=\"Types of Sibling relation\"]")
	public WebElement addRowSiblingsTypeLabel;

	/* MRVS PAGE:Types of Siblings relation DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowSiblingsTypeDropDown;

	/* MRVS PAGE:Type Of Diagnosis(Rasopathy,Cancer or Medical Conditions)Label */
	@FindBy(xpath = "(//span[@class='ng-binding'])[1]")
	public WebElement addRowTypeOfDiagnosisLabel;

	/* MRVS PAGE:Type Of Diagnosis(Rasopathy,Cancer or Medical Conditions)DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
	public WebElement addRowTypeOfDiagnosisDropDown;

	/* MRVS PAGE:Type Of Diagnosis (OtherRasopathy, OtherCancer or OtherMedical Conditions)Label*/
	@FindBy(xpath = "(//span[@class='ng-binding'])[2]")
	public WebElement addRowOtherTypeOfDiagnosisLabel;

	/* MRVS PAGE:Type Of Diagnosis (OtherRasopathy, OtherCancer or OtherMedical Conditions)TextBox*/
	@FindBy(xpath = "(//input[@type='string'])[1]")
	public WebElement addRowOtherTypeOfDiagnosisTextBox;

	/* MRVS PAGE:Please provide the year of diagnosis or the age of diagnosis Label */
	@FindBy(xpath = "(//span[@class='ng-binding'])[3]")
	public WebElement addRowYearOrAgeOfDiagnosisLabel;

	/* MRVS PAGE:Please provide the year of diagnosis or the age of diagnosis Drop Down*/
	@FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
	public WebElement addRowYearOrAgeOfDiagnosisDropDown;

	/* MRVS PAGE:Year of diagnosis Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Year of diagnosis'])[1]")
	public WebElement addRowYearOfDiagnosisLabel;

	/* MRVS PAGE:An estimated age is preferred over "Don't Know". Examples: early 40s = 42; mid-40s = 45; late 40s = 48. Banner */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[1]")
	public WebElement addRowestimatedAgeBanner1;

	/* MRVS PAGE:An estimated age is preferred over "Don't Know". Examples: early 40s = 42; mid-40s = 45; late 40s = 48. Banner */
	@FindBy(xpath = "(//div[@class='well wrapper-xs m-b-sm flex-row justify-between ng-scope'])[2]")
	public WebElement addRowestimatedAgeBanner2;

	/* MRVS PAGE:Year of diagnosis DropDown */
	@FindBy(xpath = "//div[4]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement addRowYearOfDiagnosisDropDown;

	/* MRVS PAGE:Age of diagnosis Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Age of diagnosis'])[1]")
	public WebElement addRowAgeOfDiagnosisLabel;

	/* MRVS PAGE:Age of diagnosis DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'])[4]")
	public WebElement addRowAgeOfDiagnosisDropDown;

	/* MRVS PAGE:Additional Information Label */
	@FindBy(xpath = "(//span[normalize-space()='Additional Information'])[1]")
	public WebElement addRowadditionalInformationLabel;

	/* MRVS PAGE:Additional Information TextBox */
	@FindBy(xpath = "//div[@form-model=\"c.data.active_row\"]//textarea[@role=\"textbox\"]")
	public WebElement addRowadditionalInformationTextBox;

	/* MRVS PAGE:Close Row Button */
	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	public WebElement addRowcloseButton;

	/* MRVS Cancel Row Button */
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	public WebElement addRowCancelButton;

	/* MRVS PAGE:Save Row Button */
	@FindBy(xpath = "(//button[@class='btn btn-primary ng-binding'])[1]")
	public WebElement addRowsaveButton;

	/* ********************************************************** */
	/* START THE FHQ PARTICIPANT PERSONALS RECORD PRODUCER IN PORTAL */
	/* ********************************************************** */

	/* Start your family health questionnaire Link */
	@FindBy(xpath = "//div[contains(text(),\"Click here to start your family health questionnaire\")]")
	public WebElement startYourFamilyHealthQuiestionnaireLink;

	/* Start your family health questionnaire Link */
	@FindBy(xpath = "(//div[@class='h1 text-center text-white ng-binding'])[1]")
	public WebElement startYourFamilyHealthQuiestionnaireLink1;

	/* Start your family health Banner */
	@FindBy(xpath = "//p[contains(text(),'We know families come in various configurations. T')]")
	public WebElement familyHealthBanner;

	/* Family Cohort Study Management System: RASopathies Banner */
	@FindBy(xpath = "(//div[@class='header-title ng-binding'])[1]")
	public WebElement familyCohortHealthBanner;

	/* Start your family health Banner */
	@FindBy(xpath = "(//p[@class='text'])[1]")
	public WebElement familyHealthBanner1;

	/* Family Cohort Study Management System: RASopathies */
	@FindBy(xpath = "(//div[normalize-space()='NCI Family Studies Hub: RASopathies'])[1]")
	public WebElement familyCohortStudyManagementSystemLabel;

	/* Family Cohort Study Management System: RASopathies */
	@FindBy(xpath = "(//div[@class='header-title ng-binding'])[1]")
	public WebElement familyCohortStudyManagementSystemLabel1;

	/* FHQ Participant Banner */
	@FindBy(xpath = "(//h2[normalize-space()='Participant'])[1]")
	public WebElement participantBanner;

	/* FHQ Status Banner */
	@FindBy(xpath = "(//th[normalize-space()='Status'])[1]")
	public WebElement statusBanner;

	/* FHQ Relation Banner */
	@FindBy(xpath = "(//th[normalize-space()='Relation'])[1]")
	public WebElement relationBanner;

	/* FHQ Records Banner */
	@FindBy(xpath = "(//th[normalize-space()='Records'])[1]")
	public WebElement recordsBanner;

	/* PARTICIPANT RP: This form will ask questions about the participant and their children and siblings.--> banner */
	@FindBy(xpath = "(//div[@class='text-muted sc-cat-item-short-description ng-binding ng-scope'])[1]")
	public WebElement participantFamilyBanner;

	/* PARTICIPANT RP: If you are filling out this form for your self you are the participant.-->Banner */
	@FindBy(xpath = "(//label[contains(text(),'If you are filling out this form for your self, yo')])[1]")
	public WebElement participantProbandBanner;

	/* PARTICIPANT RP: You are currently filling out information for the participant. -->Banner */
	@FindBy(xpath = "(//p[contains(text(),'You are currently filling out information for the ')])[1]")
	public WebElement participantInformationBanner;

	/* PARTICIPANT RP: Please indicate your relationship to the participant.Label */
	@FindBy(xpath = "(//span[normalize-space()='Please indicate your relationship to the participant.'])[1]")
	public WebElement relationshipToParticipantLabel;

	/* PARTICIPANT RP: To confirm your identity, please indicate your relationship to the participant. DropDown */
	@FindBy(xpath = "//div[@id='select2-drop']/ul[@class='select2-results']")
	public WebElement patientsRelationshipToPatientDropDownValue;

	/* PARTICIPANT RP: Please indicate your relationship to the participant.Label */
	@FindBy(xpath = "(//label[contains(text(),'The following questions are about the study partic')])[1]")
	public WebElement studyParticipantLabel;

	/* PARTICIPANT RP:Are you currently married or in a long-term relationship?Label */
	@FindBy(xpath = "//span[contains(text(),\"Are you currently married or in a long-term relati\")]")
	public WebElement patientsCurrentlyMarriedLabel;

	/* PARTICIPANT RP:Are you currently married or in a long-term relationship?DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-2'])[1]")
	public WebElement patientsCurrentlyMarriedDropDown;

	/* PARTICIPANT RP: Are you currently married or in a long-term relationship? DropDown Value */
	@FindBy(xpath = "(//div[@id='select2-drop'])[1]")
	public WebElement patientsCurrentlyMarriedDropDownValue;

	/* PARTICIPANT RP:Please fill out the following about your current partner label */
	@FindBy(xpath = "(//label[contains(text(),'Please fill out the following about your current p')])[1]")
	public WebElement patientsCurrentPartnerLabel;

	/* PARTICIPANT RP: Current partner First Name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Name\"]")
	public WebElement patientsCurrentPartnerFirstNameLabel;;

	/* PARTICIPANT RP: Current partner First Name textBox */
	@FindBy(xpath = "//input[@id=\"sp_formfield_name_of_patient_current_partner\"]")
	public WebElement patientsCurrentPartnerFirstNameTextBox;

	@FindBy(xpath = "//label[contains(text(),\"Please identify the number of each of the followin\")]")
	public WebElement patientsPregnancyResultsLabel;

	/* PARTICIPANT RP: Total Number of Miscarriages Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Miscarriages\"]")
	public WebElement patientsTotalMiscarriagesLabel;

	/* PARTICIPANT RP: Total Number of Miscarriages DropDown */
	@FindBy(xpath = "//fieldset[4]//div[1]//div[1]//div[2]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsTotalMiscarriagesDropDown;

	/* PARTICIPANT RP: Total Number of Stillbirths Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Stillbirths\"]")
	public WebElement patientsTotalStillbirthsLabel;

	/* PARTICIPANT RP: Total Number of Stillbirths DropDown */
	@FindBy(xpath = "//fieldset[4]//div[1]//div[1]//div[3]//div[1]//span[1]//div[1]//a[1]//span[1]")
	// (//div[@id='s2id_sp_formfield_total_number_of_stillbirths'])[1]
	public WebElement patientsTotalStillbirthsDropDown;

	/* PARTICIPANT RP: Total Number of Induced Abortions Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Induced Abortions\"]")
	public WebElement patientsTotalInducedAbortionsLabel;

	/* PARTICIPANT RP:Total Number of Induced Abortions DropDown */
	@FindBy(xpath = "//div[4]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsTotalInducedAbortionsDropDown;

	/* PARTICIPANT RP:Total Number of Tubal/Ectopic/Molar Pregnancies Label */
	@FindBy(xpath = "//label[contains(@for,\"sp_formfield_tubal_ectopic_molar_pregnancies\")]//span[contains(@class,\"ng-binding\")]")
	public WebElement patientsTotalTubalEctopicMolarPregnanciesLabel;

	/* PARTICIPANT RP:Total Number of Tubal/Ectopic/Molar Pregnancies DropDown */
	@FindBy(xpath = "//div[5]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsTotalTubalEctopicMolarPregnanciesDropDown;

	/* PARTICIPANT RP:How many total children does the participant have? Label */
	@FindBy(xpath = "(//span[normalize-space()='How many total children (alive and deceased) has the participant had?'])[1]")
	public WebElement participantTotalChildrenHaveLabel;

	/* PARTICIPANT RP: Banner */
	@FindBy(xpath = "(//span[normalize-space()='Please include living and deceased children. You may include biologic and non-biologic (e.g. step, adopted, etc.) children. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.'])[1]")
	public WebElement participantTotalChildrenHaveBanner;

	/* PARTICIPANT RP: Child MRVS Remove All */
	@FindBy(xpath = "//div[@id=\"fhq_children\"]//button[2]")
	public WebElement patientsChildMRVSRemoveAllButton;

	/* PARTICIPANT RP: Child Actions banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-scope')][normalize-space()='Actions'])[1]")
	public WebElement childActionsBanner;

	/* PARTICIPANT RP: Child Actions banner value */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-scope')][normalize-space()='Actions'])[1]")
	public WebElement childActionsBannerValue;

	/* PARTICIPANT RP: Child Actions Edit */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[1]")
	public WebElement childActionsEdit;

	/* PARTICIPANT RP: Child Actions Delete */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[1]")
	public WebElement childActionsDelete;

	/* PARTICIPANT RP: Child First Name banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='First Name'])[1]")
	public WebElement childFirstNameBanner;

	/* PARTICIPANT RP: Child First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Participant Child FN'])[1]")
	public WebElement childFirstNameBannerValue;

	/* PARTICIPANT RP: Child First Initial of LAST name banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement childFirstInitialOfLastNameBanner;

	/* PARTICIPANT RP: Child First Initial of LAST name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='A'])[1]")
	public WebElement childFirstInitialOfLastNameBannerValue;

	/* PARTICIPANT RP: Child Vital Status banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Vital Status'])[1]")
	public WebElement childVitalStatusBanner;

	/* PARTICIPANT RP: Child Vital Status banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Alive'])[1]")
	public WebElement childVitalStatusBannerValue;

	/* PARTICIPANT RP: Patient Child Add Row Iframe */
	@FindBy(xpath = "//iframe[@id='dialog_frame']")
	public WebElement patientsChildMRVSAddRowPageIframe;

	/* PARTICIPANT RP: Patient Child Add Row Page label */
	@FindBy(xpath = "//h4[@class=\"modal-title ng-binding\"]")
	public WebElement patientsChildMRVSAddRowPageLabel;

	/* PARTICIPANT RP: Patient Child First Name Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_first_name_child\"]//span[2]")
	public WebElement patientsChildMRVSAddRowFirstNameLabel;

	/* PARTICIPANT RP: Patient Child First Name TextBox */
	@FindBy(xpath = "//input[@name=\"first_name_child\"]")
	public WebElement patientsChildMRVSAddRowFirstNameTextBox;

	/* PARTICIPANT RP: Patient Child First Initial of LAST name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of LAST name\"]")
	public WebElement patientsChildMRVSAddRowFirstInitialLastNameLabel;

	/* PARTICIPANT RP: Patient Child First Initial of LAST name DropDown */
	@FindBy(xpath = "//body//div[@aria-label=\"Table Variable Active Row\"]//div[@class=\"modal-body\"]//div[@class=\"modal-body\"]//div[2]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsChildMRVSAddRowFirstInitialLastNameDropDown;

	/* PARTICIPANT RP: Patient Child Vital Status Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_vital_status_child\"]//span[contains(text(),\"Vital Status\")]")
	public WebElement patientsChildMRVSAddRowVitalStatusLabel;

	/* PARTICIPANT RP: Patient Child Vital Status DropDown */
	@FindBy(xpath = "//div[@aria-label=\"Table Variable Active Row\"]//div[3]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsChildMRVSAddRowVitalStatusDropDown;

	/* PARTICIPANT RP: Patient Child MRVS Add Row page Add Button */
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-binding\"]")
	public WebElement patientsChildMRVSAddRowAddButton;

	/* PARTICIPANT RP: Patient Child MRVS Add Row page Close Button */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement patientsChildMRVSAddRowCloseButton;

	/* PARTICIPANT RP:How many total different partners has the participant had biological children with? Label */
	@FindBy(xpath = "//span[normalize-space()=\"How many total different partners has the participant had biological children with?\"]")
	public WebElement participantDifferentPartnerLabel;

	/* PARTICIPANT RP: Information banner text */
	@FindBy(xpath = "(//span[contains(@title,'Please do not count them here.')])[1]")
	public WebElement participantDifferentPartnerBanner;

	/* PARTICIPANT RP: Patient Partner MRVS Add Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[2]")
	public WebElement participantPartnerMRVSAddButton;

	/* PARTICIPANT RP: Patient Partner MRVS Remove All Button */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Remove All'])[2]")
	public WebElement patientsPartnerMRVSRemoveAllbutton;

	/* PARTICIPANT RP: Patient Partner Add Row Page label */
	@FindBy(xpath = "//h4[@class=\"modal-title ng-binding\"]")
	public WebElement patientsPartnerMRVSAddRowPageLabel;

	/* PARTICIPANT RP: Patient Partner First Name Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_first_name_partner\"]//span[@class=\"ng-binding\"][normalize-space()=\"First Name\"]")
	public WebElement patientsPartnerMRVSAddRowFirstNameLabel;

	/* PARTICIPANT RP: Patient Partner First Name TextBox */
	@FindBy(xpath = "//input[@id=\"sp_formfield_first_name_partner\"]")
	public WebElement patientsPartnerMRVSAddRowFirstNameTextBox;

	/* PARTICIPANT RP: Patient Partner First Initial of LAST name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of LAST name\"]")
	public WebElement patientsPartnerMRVSAddRowFirstInitialLastNameLabel;

	/* PARTICIPANT RP: Patient Partner First Initial of LAST name DropDown */
	@FindBy(xpath = "//body//div[@aria-label=\"Table Variable Active Row\"]//div[@class=\"modal-body\"]//div[@class=\"modal-body\"]//div[2]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsPartnerMRVSAddRowFirstInitialLastNameDropDown;

	/* PARTICIPANT RP: Patient Partner Vital Status Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_vital_status_partner\"]//span[@class=\"ng-binding\"][normalize-space()=\"Vital Status\"]")
	public WebElement patientsPartnerMRVSAddRowVitalStatusLabel;

	/* PARTICIPANT RP: Patient Partner Vital Status DropDown */
	@FindBy(xpath = "//div[@aria-label=\"Table Variable Active Row\"]//div[3]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement patientsPartnerMRVSAddRowVitalStatusDropDown;

	/* PARTICIPANT RP: Patient Partner MRVS Add Row page Add Button */
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-binding\"]")
	public WebElement patientsPartnerMRVSAddRowAddButton;

	/* PARTICIPANT RP: Patient Partner MRVS Add Row page Close Button */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement patientsPartnerMRVSAddRowCloseButton;

	/* PARTICIPANT RP: Partner Actions banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-scope')][normalize-space()='Actions'])[2]")
	public WebElement partnerActionsBanner;

	/* PARTICIPANT RP: Partner Actions Edit */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[2]")
	public WebElement partnerActionsEdit;

	/* PARTICIPANT RP: Partner Actions Delete */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[2]")
	public WebElement partnerActionsDelete;

	/* PARTICIPANT RP: Partner First Name banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='First Name'])[2]")
	public WebElement partnerFirstNameBanner;

	/* PARTICIPANT RP: Partner First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Participant Partner FN'])[1]")
	public WebElement partnerFirstNameBannerValue;

	/* PARTICIPANT RP: Partner First Initial of LAST name banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='First Initial of LAST Name'])[2]")
	public WebElement partnerFirstInitialOfLastNameBanner;

	/* PARTICIPANT RP: Partner First Initial of LAST name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='B'])[1]")
	public WebElement partnerFirstInitialOfLastNameBannerValue;

	/* PARTICIPANT RP: Partner Vital Status banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-binding ng-scope')][normalize-space()='Vital Status'])[2]")
	public WebElement partnerVitalStatusBanner;

	/* PARTICIPANT RP: Partner Vital Status banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Deceased'])[1]")
	public WebElement partnerVitalStatusBannerValue;

	/* PARTICIPANT RP:We would like to ask you some questions about Siblings details Banner*/
	@FindBy(xpath = "(//label[contains(text(),'We would like to ask you some questions about Sibl')])[1]")
	public WebElement participantSiblingsDetailsBanner;

	/* PARTICIPANT RP: How many siblings does the participant have?Label */
	@FindBy(xpath = "(//span[normalize-space()='How many siblings does the participant have?'])[1]")
	public WebElement participantTotalSiblingsHaveLabel;

	/* PARTICIPANT RP: Label */
	@FindBy(xpath = "(//span[@title='Please include all full and half siblings, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.'])[1]")
	public WebElement participantSiblingsDetailsBanner1;

	/* PARTICIPANT RP: How many siblings does the participant have?? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement participantTotalSiblingsHaveDropDown;

	/* PARTICIPANT RP: Patient Siblings MRVS Add Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[3]")
	public WebElement participantSiblingMRVSAddButton;

	/* PARTICIPANT RP: Patient Siblings MRVS Remove All Button */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Remove All'])[3]")
	public WebElement participantSiblingMRVSRemoveAllButton;

	/* PARTICIPANT RP: Patient Siblings MRVS Remove All Button */
	@FindBy(xpath = "//div[@id=\"details_of_siblings_does_this_relative_have\"]//button[2]")
	public WebElement patientsSiblingMRVSRemoveAllButton;

	/* PARTICIPANT RP: Patient Siblings Add Row Page label */
	@FindBy(xpath = "(//h2[normalize-space()='Add Row'])[1]")
	public WebElement siblingMRVSAddRowPageLabel;

	/* PARTICIPANT RP: Patient Siblings MRVS Types of Siblings relation label */
	@FindBy(xpath = "//span[normalize-space()=\"Types of Sibling relation\"]")
	public WebElement siblingMRVSAddRowSiblingsTypeLabel;

	/* PARTICIPANT RP: patient's Siblings MRVS Types of Siblings relation DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement siblingMRVSAddRowSiblingsTypeDropDown;

	/* PARTICIPANT RP: Patient Siblings MRVS First name of sibling Label */
	@FindBy(xpath = "//span[normalize-space()=\"First name of sibling\"]")
	public WebElement siblingMRVSAddRowFirstNameSiblingLabel;;

	/* PARTICIPANT RP: Patient Siblings MRVS First name of sibling TextBox */
	@FindBy(xpath = "//input[@name=\"first_name_of_sibling\"]")
	public WebElement siblingMRVSAddRowFirstNameSiblingTextBox;

	/* PARTICIPANT RP: Patient Siblings MRVS First Initial of LAST name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of LAST Name\"]")
	public WebElement siblingMRVSFirstInitialLastNameLabel;

	/* PARTICIPANT RP: Patient Siblings MRVS First Initial of LASTname DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement siblingMRVSFirstInitialLastNameDropDopwn;

	/* PARTICIPANT RP: Patient Siblings MRVS Vital Status Label */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status of sibling\"]")
	public WebElement siblingMRVSVitalStatusLabel;

	/* PARTICIPANT RP: Patient Siblings MRVS Vital Status DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement siblingMRVSVitalStatusDropDown;

	/* PARTICIPANT RP: Patient Siblings MRVS Add Row page Add Button */
	@FindBy(xpath = "//button[contains(@class,\"btn btn-primary ng-binding\")][normalize-space()=\"Add\"]")
	public WebElement siblingMRVSAddRowAddButton;;

	/* PARTICIPANT RP: Patient Siblings MRVS Add Row page Close Button */
	@FindBy(xpath = "//button[normalize-space()=\"Cancel\"]")
	public WebElement siblingMRVSAddRowCancelButton;

	/* PARTICIPANT RP: Patient Sibling Actions banner */
	@FindBy(xpath = "(//th[contains(@class,'text-nowrap ng-scope')][normalize-space()='Actions'])[3]")
	public WebElement siblingActionsBanner;

	/* PARTICIPANT RP: Patient Sibling Actions Edit */
	@FindBy(xpath = "(//a[contains(@class,'wrapper-xs fa fa-pencil')])[3]")
	public WebElement siblingActionsEdit;

	/* PARTICIPANT RP: Patient Sibling Actions Delete */
	@FindBy(xpath = "(//a[@class='wrapper-xs fa fa-close'])[3]")
	public WebElement siblingActionsDelete;

	/* PARTICIPANT RP: Patient Types of Siblings relation banner */
	@FindBy(xpath = "(//th[normalize-space()='Types of Sibling relation'])[1]")
	public WebElement siblingTypesBanner;

	/* PARTICIPANT RP: Patient Types of Siblings relation banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Brother'])[1]")
	public WebElement siblingTypesBannerValue;

	/* PARTICIPANT RP: Patient First name of sibling banner */
	@FindBy(xpath = "(//th[normalize-space()='First name of sibling'])[1]")
	public WebElement siblingFirstNameBanner;

	/* PARTICIPANT RP: Patient Sibling First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Participant Sibling FN'])[1]")
	public WebElement siblingFirstNameBannerValue;

	/* PARTICIPANT RP: Patient Sibling First Initial of LAST name banner */
	@FindBy(xpath = "(//th[normalize-space()='First Initial of LAST Name'])[3]")
	public WebElement siblingFirstInitialOfLastNameBanner;

	/* PARTICIPANT RP: Patient Sibling First Initial of LAST name banner */
	@FindBy(xpath = "(//th[normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement siblingFirstInitialOfLastNameBanner1;

	/* PARTICIPANT RP: Patient Sibling First Initial of LAST name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='C'])[1]")
	public WebElement siblingFirstInitialOfLastNameBannerValue;

	/* PARTICIPANT RP: Patient Vital Status of siblings banner */
	@FindBy(xpath = "(//th[normalize-space()='Vital Status of sibling'])[1]")
	public WebElement siblingVitalStatusBanner;

	/* PARTICIPANT RP: Patient Sibling Vital Status banner Value */
	@FindBy(xpath = "(//td[normalize-space()=\"Prefer not to answer\"])[1]")
	public WebElement siblingVitalStatusBannerValue;

	/* PARTICIPANT RP: Please add participant's parents and grandparents to the table below Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please add participant's parents and grandparents \")])[1]")
	public WebElement participantParentMRVSBanner;

	/* PARTICIPANT RP: Parents More Information Label */
	@FindBy(xpath = "//i[@aria-label=\"More information for We would like to ask you some questions about your parents and grandparents\"]")
	public WebElement patientsParentMRVSMoreInformationLink;

	/* PARTICIPANT RP: Parents More Information Banner */
	@FindBy(xpath = "//span[@title=\"More information\"]")
	public WebElement patientsParentMRVSMoreInformationLinkBanner;

	/* PARTICIPANT RP: Patient Parents MRVS Add Button */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add'])[4]")
	public WebElement participantParentMRVSAddButton;

	/* PARTICIPANT RP: Patient Parents MRVS Remove All Button */
	@FindBy(xpath = "//button[@id=\"91d260691b198590e541631ee54bcb65removeAllRows\"]")
	public WebElement patientsParentMRVSRemoveAllButton;

	/* PARTICIPANT RP: Patient Parents Add Row Page label */
	@FindBy(xpath = "//h4[contains(@class,\"modal-title ng-binding\")]")
	public WebElement parentMRVSAddRowPageLabel;

	/* PARTICIPANT RP: Patient Parents MRVS Relationship label */
	@FindBy(xpath = "//span[normalize-space()=\"Relationship\"]")
	public WebElement parentMRVSAddRowRelationshipLabel;

	/* PARTICIPANT RP: Patient Parents MRVS Relationship DropDown */
	@FindBy(xpath = "//div[contains(@aria-label,\"Table Variable Active Row\")]//div[contains(@ng-repeat,\"column in container.columns\")]//div[1]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement parentMRVSAddRowRelationshipDropDown;

	/* PARTICIPANT RP: Patient Parents MRVS First name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First name\"]")
	public WebElement parentMRVSAddRowFirstNameLabel;;

	/* PARTICIPANT RP: Patient Parents MRVS First name TextBox */
	@FindBy(xpath = "//input[contains(@name,\"first_name_parent\")]")
	public WebElement parentMRVSAddRowFirstNameTextBox;

	/* PARTICIPANT RP: Patient Parents MRVS First Initial of LAST name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of last name\"]")
	public WebElement parentMRVSFirstInitialLastNameLabel;

	/* PARTICIPANT RP: Patient Parents MRVS First Initial of LAST name DropDown */
	@FindBy(xpath = "//div[contains(@aria-label,\"Table Variable Active Row\")]//div[3]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement parentMRVSFirstInitialLastNameDropDopwn;

	/* PARTICIPANT RP: Patient Parents MRVS Vital Status Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_vital_status_parent\"]//span[@class=\"ng-binding\"][normalize-space()=\"Vital Status\"]")
	public WebElement parentMRVSVitalStatusLabel;

	/* PARTICIPANT RP: Patient Parents MRVS Vital Status DropDown */
	@FindBy(xpath = "//div[@aria-label=\"Table Variable Active Row\"]//div[4]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement parentMRVSVitalStatusDropDown;

	/* PARTICIPANT RP: Patient Parents MRVS Add Row page Add Button */
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-binding\"]")
	public WebElement parentMRVSAddRowAddButton;;

	/* PARTICIPANT RP: Patient Parents MRVS Add Row page Close Button */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement parentMRVSAddRowCloseButton;

	/* PARTICIPANT RP: Is there anything else you would like us to know about the participant?Label */
	@FindBy(xpath = "//span[normalize-space()=\"Is there anything else you would like us to know about the participant?\"]")
	public WebElement anythingElseAboutThisParticipantLabel;

	/* PARTICIPANT RP: Is there anything else you would like us to know about the participant?TextBox */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_this_patient'])[1]")
	public WebElement anythingElseAboutThisParticipantTextBox;

	/* PARTICIPANT RP: Complete and Submit Button */
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-binding ng-scope\"]")
	public WebElement participantCompleteAndSubmitButton;

	/* NV PARTICIPANT RP:Total Number of Live Births Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Live Births\"]")
	public WebElement TotalLiveBirthsLabel1;

	/* NV PARTICIPANT RP:Total Number of Live Births DropDown */
	@FindBy(xpath = "//select[@name=\"IO:11cb52431bbc8d906daea681f54bcbfe\"]")
	public WebElement nVFHQPatientPersonalsTotalLiveBirthsDropDown;

	/* NV PARTICIPANT RP: Total Number of Miscarriages Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Miscarriages\"]")
	public WebElement TotalMiscarriagesLabel1;

	/* NV PARTICIPANT RP: Total Number of Miscarriages DropDown */
	@FindBy(xpath = "//select[@name=\"IO:c81c92c31bbc8d906daea681f54bcbac\"]")
	public WebElement nVFHQPatientPersonalsTotalMiscarriagesDropDown;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][contains(text(),'Please write the first name of the partner(s) with')])[1]")
	public WebElement partnerPregnancyMiscarriageLabel;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_miscarriage_partners'])[1]")
	public WebElement partnerPregnancyMiscarriageTextBox;

	/* NV PARTICIPANT RP: Total Number of Stillbirths Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Stillbirths\"]")
	public WebElement TotalStillbirthsLabel1;

	/* NV PARTICIPANT RP: Total Number of Stillbirths DropDown */
	@FindBy(xpath = "//select[@name=\"IO:8e4c16071bbc8d906daea681f54bcb70\"]")
	public WebElement nVFHQPatientPersonalsTotalStillbirthsDropDown;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.Label*/
	@FindBy(xpath = "(//span[@class='ng-binding'][contains(text(),'Please write the first name of the partner(s) with')])[2]")
	public WebElement partnerPregnancyTotalStillbirthLabel;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whomthe participant had the pregnancy(ies) above.TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_stillbirth_partners'])[1]")
	public WebElement partnerPregnancyStillbirthTextBox;

	/* NV PARTICIPANT RP: Total Number of Induced Abortions Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Induced Abortions\"]")
	public WebElement TotalInducedAbortionsLabel1;

	/* NV PARTICIPANT RP: Total Number of Induced Abortions DropDown */
	@FindBy(xpath = "//select[contains(@name,\"IO:458cd6c71bbc8d906daea681f54bcb16\")]")
	public WebElement nVFHQPatientPersonalsTotalInducedAbortionsDropDown;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.Label*/
	@FindBy(xpath = "(//span[@class='ng-binding'][contains(text(),'Please write the first name of the partner(s) with')])[3]")
	public WebElement partnerPregnancyInducedAbortionLabel;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_abortion_partners'])[1]")
	public WebElement partnerPregnancyInducedAbortionTextBox;

	/* NV PARTICIPANT RP: Total Number of Tubal/Ectopic/Molar Pregnancies Label */
	@FindBy(xpath = "//label[contains(@for,\"sp_formfield_tubal_ectopic_molar_pregnancies\")]//span[2]")
	public WebElement TotalTubalEctopicMolarPregnanciesLabel1;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][contains(text(),'Please write the first name of the partner(s) with')])[4]")
	public WebElement partnerPregnancyEctopicMolarLabel;

	/* NV PARTICIPANT RP: Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_ectopic_partners'])[1]")
	public WebElement partnerPregnancyEctopicMolarTextBox;

	/* ***********************************************************************/
	/* ****** PARTNER MRVS DETAILS ****** */
	/* ***********************************************************************/

	/* MRVS PAGE:Partner Add Row Label */
	@FindBy(xpath = "(//h2[normalize-space()='Add Row'])[1]")
	public WebElement addPartnerRowBanner;

	/* MRVS PAGE:Partner First Name Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='First Name'])[1]")
	public WebElement addRowPartnerFirstNameLabel;

	/* MRVS PAGE:Partner First Name Text box */
	@FindBy(xpath = "(//input[@name='first_name_partner'])[1]")
	public WebElement addRowPartnerFirstNameTextbox;

	/* MRVS PAGE:Partner First Initial of LAST name Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement addRowPartnerFirstInitialOfLastNameLabel;

	/* MRVS PAGE:Partner First Initial of LAST name DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowPartnerFirstInitialOfLastNameDropDown;

	/* MRVS PAGE:Partner Vital Status Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Vital Status'])[1]")
	public WebElement addRowPartnerVitalStatusLabel;

	/* MRVS PAGE:Partner Vital Status DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowPartnerVitalStatusDropDown;

	/* MRVS PAGE:Partner Close Button */
	@FindBy(xpath = "//button[normalize-space()=\"Cancel\"]")
	public WebElement addRowPartnerCancelRowButton;

	/* MRVS PAGE:Partner Save Button */
	@FindBy(xpath = "//button[@class=\"btn btn-primary ng-binding\"]")
	public WebElement addRowPartnersaveRowButton;

	/************************************************************************/
	/* ************ CHILD MRVS DETAILS ****************************** */
	/************************************************************************/

	/* MRVS PAGE:Child Add Row Label */
	@FindBy(xpath = "//h4[@class=\"modal-title ng-binding\"]")
	public WebElement addChildRowBanner1;

	/* MRVS PAGE:Child Add Row Label */
	@FindBy(xpath = "(//h2[@class='modal-title h4 ng-binding'])[1]")
	public WebElement addChildRowBanner;

	/* MRVS PAGE:Child First Name Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='First Name'])[1]")
	public WebElement addRowChildFirstNameLabel;

	/* MRVS PAGE:Child First Name Text box */
	@FindBy(xpath = "(//input[@id='sp_formfield_first_name_child'])[1]")
	public WebElement addRowChildFirstNameTextbox;

	/* MRVS PAGE:Child First Initial of LAST name Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement addRowChildFirstInitialOfLastNameLabel;

	/* MRVS PAGE:First Initial of LAST name DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowChildFirstInitialOfLastNameDropDown;

	/* MRVS PAGE:Vital Status Label */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Vital Status'])[1]")
	public WebElement addRowChildVitalStatusLabel;

	/* MRVS PAGE:Vital Status DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowChildVitalStatusDropDown;

	/* MRVS PAGE:Vital Status DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowPatientChildVitalStatusDropDown;

	/* *************************************************************** */
	/* ********************* FHQ NEW PARTNER RECORD PRODUCER ********* */
	/* *************************************************************** */

	/* PARTNER RP: Banner on FHQ New Partner Record Producer Page */
	@FindBy(xpath = "(//h2[normalize-space()='Partner'])[1]")
	public WebElement PartnerBanner;

	/* PARTNER RP:You are currently filling out information for the participants partner.Banner */
	@FindBy(xpath = "(//p[@class='ng-binding'])[1]")
	public WebElement partnerRelationBanner;

	/* PARTNER RP: Is this your (the participant's) current partner? Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_is_this_the_participants_current_partner\"]//span[2]")
	public WebElement isThisYourCurrentPartnerLabel;

	/* PARTNER RP: Is this your (the participant's) current partner? DropDown */
	@FindBy(xpath = "//div[8]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement isThisYourCurrentPartnerDropDown;

	/* PARTNER RP:First Initial of LAST name Label */
	@FindBy(xpath = "//span[normalize-space()=\"Last Initial\"]")
	public WebElement firstInitialLastNameOfPartnerLabel;

	/* PARTNER RP:First Initial of LAST name DropDown */
	@FindBy(xpath = "(//span[contains(text(),'-- None --')])[1]")
	public WebElement firstInitialLastNameOfPartnerDropDown;

	/* PARTNER RP:Vital Status DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement vitalStatusOfPartnerDropDown;

	/* PARTNER RP:Year of Birth DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement yearOfBirthOfPartnerDropDown;

	/* PARTNER RP:Current Age DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement currentAgeOfPartnerDropDown;

	/* PARTNER RP: Is the participant blood-related to this person? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Is the participant blood-related to this person?\"]")
	public WebElement isParticipantBloodRelatedToThisPersonLabel;

	/* PARTNER RP: If you are filling out this form for your self you are the participant. Banner */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='If you are filling out this form for your self you are the participant.'])[1]")
	public WebElement isParticipantBloodRelatedToThisPersonBanner;

	/* PARTNER RP:Are you blood-related to this person? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement isParticipantBloodRelatedToThisPersonDropDown;

	/* PARTNER RP: Please describe how the participant is related to this person Label */
	@FindBy(xpath = "(//span[normalize-space()='Please describe how the participant is related to this person'])[1]")
	public WebElement participantRelatedToThisPartnerLabel;

	/* PARTNER RP: Please describe how the participant is related to this person TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_please_describe_how_the_participant_is_related_to_this_person'])[1]")
	public WebElement participantRelatedToThisPartnerTextBox;

	/* PARTNER RP: Is there any additional information you would like us to know or understand about this relative? Label*/
	@FindBy(xpath = "//span[normalize-space()=\"Is there any additional information you would like us to know or understand about this relative?\"]")
	public WebElement anyAdditionalInformationRelatedToThisPartnerLabel;

	/* PARTNER RP: Is there any additional information you would like us to know or understand about this partner? Text Box */
	@FindBy(xpath = "//textarea[contains(@name,\"additional_information\")]")
	public WebElement anyAdditionalInformationRelatedToThisPartnerTextBox;

	/* *************************************************************** */
	/* ********************* FHQ NEW PARENT RECORD PRODUCER ********* */
	/* *************************************************************** */

	/* PARENT RP: Banner on New Parent Record Producer Page */
	@FindBy(xpath = "//h2[normalize-space()='Parent']")
	public WebElement parentBanner;

	/* PARENT RP: You are currently filling out information for the participants parent.Banner */
	@FindBy(xpath = "(//p[contains(text(),'You are currently filling out information for the ')])[1]")
	public WebElement participantParentInformationBanner;

	/* PARENT RP: List View Button */
	@FindBy(xpath = "(//a[normalize-space()='List View'])[1]")
	public WebElement listViewParentButton;

	/* PARENT RP: Which parent is this? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Which parent is this?\"]")
	public WebElement WhichParentLabel;

	/* PARENT RP: Which parent is this? DropDown */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_which_parent']")
	public WebElement WhichParentDropDown;

	/* PARENT RP: Was this person adopted? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-4'])[1]")
	public WebElement WasThisRelativeAdoptedDropDown;

	/* PARENT RP: Sex assigned at birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-10'])[1]")
	public WebElement parentSexAssignedAtBirthDropDown;

	/* PARENT RP: Gender Identity DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement parentGenderIdentitydDropDown;

	/* PARENT RP: Is this relative a twin or part of a multiple birth? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement TwinOrMultipleBirthDropDown;

	/* PARENT RP:Type of birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-13'])[1]")
	public WebElement parentTypeOfBirthDropDown;

	/* PARENT RP:Has this relative ever had any miscarriages, stillbirths, induced abortions, or ectopic pregnancies? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-14'])[1]")
	public WebElement parentBirthLabelDropDown;

	/* PARENT RP: Please identify the number of each of the following pregnancy results for this parent. Banner */
	@FindBy(xpath = "(//label[contains(text(),'Please identify the number of each of the followin')])[1]")
	public WebElement parentbirthsBanner;

	/* PARENT RP: Total number of Miscarriages Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Miscarriages'])[1]")
	public WebElement parentTotalMiscarriagesLabel;

	/* PARENT RP: Total number of Miscarriages:(less than 20 weeks of pregnancy)Banner */
	@FindBy(xpath = "(//span[contains(text(),'(less than 20 weeks of pregnancy)')])[1]")
	public WebElement parentTotalMiscarriagesBanner;

	/* PARENT RP: Total number of Miscarriages DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-15'])[1]")
	public WebElement parentTotalMiscarriagesDropDown;

	/* PARENT RP: Total number of Stillbirths Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Stillbirths'])[1]")
	public WebElement parentTotalStillbirthsLabel;

	/* PARENT RP: Total number of Stillbirths:(more than 20 weeks of pregnancy)Banner */
	@FindBy(xpath = "(//span[contains(text(),'(more than 20 weeks of pregnancy)')])[1]")
	public WebElement parentTotalStillbirthsBanner;

	/* PARENT RP: Total number of Stillbirths DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-16'])[1]")
	public WebElement parentTotalStillbirthsDropDown;

	/* PARENT RP:Total number of Induced Abortions Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Induced Abortions'])[1]")
	public WebElement parentTotalInducedAbortionsLabel;

	/* PARENT RP: Total number of Induced Abortions DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-17'])[1]")
	public WebElement parentTotalInducedAbortionsDropDown;

	/* PARENT RP: Total number of Tubal/Ectopic/Molar Pregnancies Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_total_number_of_tubal_ectopic_molar_pregnancies\"]//span[2]")
	public WebElement parentTotalTubalEctopicMolarPregnanciesLabel;

	/* PARENT RP: Total number of Tubal/Ectopic/Molar Pregnancies DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-18'])[1]")
	public WebElement parentTotalTubalEctopicMolarPregnanciesDropDown;

	/* PARENT RP: Has this relative been diagnosed with a RASopathy? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-19'])[1]")
	public WebElement parentDiagnosedWithRasopathyDropDown;

	/* PARENT RP: Has this relative ever been diagnosed with cancer? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-20'])[1]")
	public WebElement parentDiagnosedWithCancerDropDown;

	/* PARENT RP: Has this relative ever been diagnosed with any of the medical conditions listed below? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-21'])[1]")
	public WebElement parentDiagnosedWithMedicalConditionsDropDown;

	/* PARENT RP: How many siblings does this relative have? Label */
	@FindBy(xpath = "(//span[normalize-space()='How many siblings does this relative have?'])[1]")
	public WebElement howManySiblingsThisRelativeHaveLabel;

	/* PARENT RP: Banner */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Please include all full and half siblings, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.'])[1]")
	public WebElement howManySiblingsThisRelativeHaveBanner;

	/* PARENT RP: How many siblings does this relative have? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-22'])[1]")
	public WebElement howManySiblingsThisRelativeHaveDropDown;

	/* PARENT RP: Please select the 'Add' button below to add each sibling this parent has. Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each s\")])[1]")
	public WebElement selectAddButtonToAddEachSiblingLabel;

	/* PARENT RP: Add Button to add the sibling Label */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[4]")
	public WebElement addSiblingButton;

	/* PARENT RP: Add Button to add the sibling Label */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove All'])[4]")
	public WebElement removeAllSiblingButton;

	/* PARENT RP: RP: Patient Sibling First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Sister'])[1]")
	public WebElement parentsiblingFirstNameBanner;

	/* PARENT RP: RP: Patient Sibling First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Parent Sibling FN'])[1]")
	public WebElement parentsiblingFirstNameBannerValue;

	/* PARENT RP: Please identify the number of each of the following pregnancy results for this parent. Label */
	@FindBy(xpath = "(//label[contains(text(),'Please identify the number of each of the followin')])[1]")
	public WebElement identifyPregnancyResultsForThisParentLabel;

	/* PARENT RP: Has this relative been diagnosed with a RASopathy? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this relative been diagnosed with a RASopathy?\"]")
	public WebElement relativeDiagnosedWithRasopathyLabel;

	/* PARENT RP: Please select the 'Add' button below to add each RASopathy this parent has had. Label*/
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each R\")])[1]")
	public WebElement parentDiagnosedWithRasopathyAddButtonInfo;

	/* PARENT RP: Has this relative ever been diagnosed with cancer? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this relative ever been diagnosed with cancer?\"]")
	public WebElement relativeDiagnosedWithCancerLabel;

	/* PARENT RP: Please select the 'Add' button below to add each cancer this parent has had. Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each c\")])[1]")
	public WebElement parentDiagnosedWithCancerAddButtonInfo;

	/* PARENT RP: Has this relative ever been diagnosed with any of the medical conditions listed below? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this relative ever been diagnosed with any of the medical conditions listed below?\"]")
	public WebElement parentDiagnosedWithMedicalConditionsLabel;

	/* PARENT RP: Please select the 'Add' button below to add each medical condition this parent has had. Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each m\")])[1]")
	public WebElement parentDiagnosedWithMedicalConditionsAddButtonInfo;

	/* PARENT RP: Is there anything else you would like us to know about this relative Text Box */
	@FindBy(xpath = "//span[normalize-space()=\"Is there anything else you would like us to know about this relative?\"]")
	public WebElement anythingElseAboutThisRelativeLabel;

	/* PARENT RP: Is there anything else you would like us to know about this person Text Box */
	@FindBy(xpath = "//textarea[@name=\"is_there_anything_else_you_would_like_us_to_know_about_this_parent_grandparent\"]")
	public WebElement anythingElseAboutThisRelativeTextBox;

	/* PARENT RP: Parent first Name On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant Mother FN'])[1]")
	public WebElement parentfirstNameOnListView;

	/* PARENT RP: Parent first Initial Of Last On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='D'])[1]")
	public WebElement parentfirstInitialOfLastNameOnListView;

	/* PARENT RP: Parent Vital Status On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement parentvitalStatusOnListView;

	/* PARENT RP: Parent Year of Birth On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='1941'])[1]")
	public WebElement parentyearOfBirthOnListView;

	/* PARENT RP: Parent Relation to Patient On List View Page */
	@FindBy(xpath = "(//span[@class='ng-binding ng-scope'][normalize-space()='Biological Mother'])[1]")
	public WebElement parentrelationToPatientOnListView;

	/* *************************************************************** */
	/* ********************* FHQ NEW CHILD RECORD PRODUCER *********** */
	/* *************************************************************** */
	/* CHILD RP: Banner(CHILD)(for Child to Patient) Page banner */
	@FindBy(xpath = "(//h2[normalize-space()='Son/Daughter'])[1]")
	public WebElement fHQChildBanner;

	/* CHILD RP: You are currently filling out information for the participants son/daughter.*/
	@FindBy(xpath = "(//p[@class='ng-binding'])[1]")
	public WebElement childRelationBanner;

	/* CHILD RP: Please make sure you have completed all partner records before completing children records. Banner */
	@FindBy(xpath = "(//p[contains(text(),'Please make sure you have completed all partner re')])[1]")
	public WebElement fHQChildBanner1;

	/* CHILD RP: :Which best describes this relative? Label */
	@FindBy(xpath = "//span[normalize-space()='Which best describes this relative?']")
	public WebElement bestDescribeThisRelativeLabel;

	/* CHILD RP: :Which best describes this relative? Label */
	@FindBy(xpath = "//span[normalize-space()='Are any of the following individuals a biological parent of this child?']")
	public WebElement biologicalParentOfThisChildLabel;

	/*CHILD RP: Is the other biological parent of this relative one of the partners you have entered? Label*/
	@FindBy(xpath = "//span[normalize-space()='Is the other biological parent of this relative one of the partners you have entered?']")
	public WebElement isOtherBiologicalParentOfThisRelativeLabel;

	/* CHILD RP: Is the other biological parent of this relative one of the partners you have entered? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-10'])[1]")
	public WebElement isOtherBiologicalParentOfThisRelativeChildDropDown;

	/* CHILD RP: If the partner name is not visible in the dropdown, that means the partner record is incomplete on the home page. Please return to the homepage and complete the partner record(s) before completing the children records. Banner */
	@FindBy(xpath = "(//span[contains(text(),'If the partner name is not visible in the dropdown, that means the partner record is incomplete on the home page. Please return to the homepage and complete the partner record(s) before completing the children records.')])[1]")
	public WebElement partnerDetailBanner;

	/* CHILD RP: Which best describes this relative? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-9'])[1]")
	public WebElement bestDescribeThisRelativeDropDown;

	/* *************************************************************** */
	/* ******** RASOPATHY QUESIONNARES ***************** */
	/* *************************************************************** */

	/* CHILD RP: Has this child been diagnosed with a RASopathy? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this child been diagnosed with a RASopathy?\"]")
	public WebElement childDiagnosedWithRasopathyLabel;

	/* CHILD RP: Has this child been diagnosed with a RASopathy? Link */
	@FindBy(xpath = "//div[@id=\"has_child_been_diagnosed_with_a_rasopathy\"]//span[@class=\"type-choice field-actual state-mandatory\"]")
	public WebElement childDiagnosedWithRasopathyInformationLink;

	/* CHILD RP: Information */
	@FindBy(xpath = "//span[@class=\"ng-binding\"][normalize-space()=\"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)\"]")
	public WebElement childDiagnosedWithRasopathyInformation;

	/* CHILD RP: Has this child been diagnosed with a RASopathy?DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-10'])[1]")
	public WebElement childDiagnosedWithRasopathyDropDown;

	/* CHILD RP: Please select the 'Add' button below to add each RASopathy this child has had. Label*/
	@FindBy(xpath = "//label[contains(text(),\"Please select the \"Add\" button below to add each R\")]")
	public WebElement addRasopathyButtonLabel;

	/* CHILD RP: Add Rasopathy Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[1]")
	public WebElement addRasopathyButton;

	/* CHILD RP: Remove All Rasopathy Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove All'])[1]")
	public WebElement removeAllRasopathyButton;

	/* CHILD RP: Remove All Cancer Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove All'])[2]")
	public WebElement removeAllCancerButton;

	/* CHILD RP: Remove All medical conditions Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove All'])[3]")
	public WebElement removeAllMedicalConditionButton;

	/* *************************************************************** */
	/* ********************* CANCER DETAILS QUESTIONS********************** */
	/* *************************************************************** */

	/* CHILD RP: Has this relative ever been diagnosed with cancer? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-17'])[1]")
	public WebElement relativeDiagnosedWithCancerDropDown;

	/* CHILD RP: Please select the 'Add' button below to add each cancer this person has had. Label */
	@FindBy(xpath = "//div[@id=\"cancer_mrvs_label\"]//div[@class=\"ng-scope\"]")
	public WebElement personDiagnosedWithCancerAddButtonInfo;

	/* CHILD RP: Add Cancer Button */
	@FindBy(xpath = "(//button[contains(@title,'You can add only 50 rows')][normalize-space()='Add'])[1]")
	public WebElement addCancerButton;

	/* *************************************************************** */
	/* ********* MEDICAL CONDITIONS DETAILS QUESTIONS **************** */
	/* *************************************************************** */

	/* CHILD RP: Has this relative ever been diagnosed with any of the medical conditions listed below? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this relative ever been diagnosed with any of the medical conditions listed below?\"]")
	public WebElement relativeDiagnosedWithMedicalConditionsLabel;

	/* CHILD RP: Has this child ever been diagnosed with any of the medical conditions listed below? Information Link */
	@FindBy(xpath = "//div[@id=\"has_child_ever_been_diagnosed_with_any_of_the_conditions_listed_below\"]//span[@class=\"type-choice field-actual state-mandatory\"]")
	public WebElement childDiagnosedWithMedicalConditionsInformationLink;

	/* CHILD RP: Has this child ever been diagnosed with any of the medicalconditions listed below? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-18'])[1]")
	public WebElement childDiagnosedWithMedicalConditionsDropDown;

	/*CHILD RP: Please select the 'Add' button below to add each medical conditionthis person has had.Add Button Information */
	@FindBy(xpath = "//div[@id=\"medical_condition_mrvs_label\"]//div[@class=\"ng-scope\"]")
	public WebElement relativeDiagnosedWithMedicalConditionsAddButtonInfo;

	/* CHILD RP: Add medical conditions Button */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add'])[3]")
	public WebElement addMedicalConditionsButton;

	/* *************************************************************** */
	/* ********* CHILDS CURRENT PATNER DETAILS QUESTIONS **************** */
	/* *************************************************************** */

	/* CHILD RP: :Is this child currently married or in a long-term relationship? Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_is_child_currently_married_or_in_a_long_term_relationship\"]//span[@class=\"ng-binding\"]")
	public WebElement childMarriedOrLongTermRelationShipLabel;

	/* CHILD RP: Is this child currently married or in a long-term relationship? DropDown */
	@FindBy(xpath = "//div[33]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childMarriedOrLongTermRelationShipDropDown;

	/* CHILD RP: Please fill out the following about this child's current partner.Information Label */
	@FindBy(xpath = "//div[@id=\"current_partner_label\"]//div[contains(@class,\"ng-scope\")]")
	public WebElement childCurrentPartnerInformationLabel;

	/* CHILD RP: Current Partner First Name Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_first_name_current_partner\"]//span[@class=\"ng-binding\"][normalize-space()=\"First Name\"]")
	public WebElement currentPartnerFirstNameLabel;;

	/* CHILD RP: Current Partner First Name Text Box */
	@FindBy(xpath = "//input[@id=\"sp_formfield_first_name_current_partner\"]")
	public WebElement currentPartnerFirstNameTextBox;

	/* CHILD RP: Current Partner First Initial Of Last Name- Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_last_initial_current_partner\"]//span[@class=\"ng-binding\"][normalize-space()=\"First Initial of LAST name\"]")
	public WebElement currentPartnerFirstInitialOfLastNameLabel;

	/* CHILD RP: Current Partner First Initial Of Last Name DropDown */
	@FindBy(xpath = "//div[36]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childCurrentPartnerFirstInitialOfLastNameDropDown;

	/* CHILD RP: Current Partner Vital Status Label */
	@FindBy(xpath = "//label[contains(@for,\"sp_formfield_current_partner_vital_status\")]//span[contains(@class,\"ng-binding\")]")
	public WebElement currentPartnerVitalStatusLabel;

	/* CHILD RP: Current Partner Vital Status DropDown */
	@FindBy(xpath = "//div[37]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childCurrentPartnerVitalStatusDropDown;

	/* *************************************************************** */
	/* ********* CHILDS TOTAL PREGNANCIES DETAILS QUESTIONS **************** */
	/* *************************************************************** */

	/* CHILD RP: How many TOTAL pregnancies has this child had or fathered? Label */
	@FindBy(xpath = "//span[normalize-space()=\"How many TOTAL pregnancies has this child had?\"]")
	public WebElement totalPregnanciesChildFatheredLabel;

	/* CHILD RP: :How many TOTAL pregnancies has this child had or fathered? Information Link */
	@FindBy(xpath = "//i[contains(@aria-label,\"{h} for How many TOTAL pregnancies has this child had or fathered?\")]")
	public WebElement totalPregnanciesChildFatheredInformationLink;

	/* CHILD RP: How many TOTAL pregnancies has this child had or fathered?DropDown */
	@FindBy(xpath = "//div[38]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement totalPregnanciesChildFatheredDropDown;

	/* CHILD RP: Please identify the number of each of the following pregnancy results for this child. Label */
	@FindBy(xpath = "//label[contains(text(),\"Please identify the number of each of the followin\")]")
	public WebElement identifyPregnancyResultsForThisChildLabel;

	/* CHILD RP: Total Number of Live Births DropDown */
	@FindBy(xpath = "//div[40]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childTotalLiveBirthsDropDown;

	/* CHILD RP: :Total Number of Miscarriages DropDown */
	@FindBy(xpath = "//div[41]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childTotalMiscarriagesDropDown;

	/* CHILD RP: Total Number of Stillbirths DropDown */
	@FindBy(xpath = "//div[42]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childTotalStillbirthsDropDown;

	/* CHILD RP: Total Number of Induced Abortions DropDown */
	@FindBy(xpath = "//div[43]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childTotalInducedAbortionsDropDown;

	/* CHILD RP: Total Number of Tubal/Ectopic/Molar Pregnancies DropDown */
	@FindBy(xpath = "//div[44]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childTotalTubalEctopicMolarPregnanciesDropDown;

	/* ********************************************************************** */
	/* **** Total children (alive and deceased) has this child had DETAILS ** */
	/* ********************************************************************** */

	/* CHILD RP: How many total children (alive and deceased) has this child had? Label */
	@FindBy(xpath = "(//span[normalize-space()='How many total children (alive and deceased) has this child had?'])[1]")
	public WebElement totalChildrenThisChildHadLabel;

	/* CHILD RP: How many total children (alive and deceased) has this child had? DropDown */
	@FindBy(xpath = "//div[45]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement totalChildrenThisChildHadDropDown;

	/* CHILD RP: 'Add' button to Add the Child's Child */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add'])[4]")
	public WebElement addChildMRVSButton;

	/* CHILD RP: 'Remove All' button to Add the Child's Child */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Remove All'])[4]")
	public WebElement removeAllChildMRVSButton;

	/* CHILD RP: Child First Name banner Value */
	@FindBy(xpath = "(//td[normalize-space()='Participant SonDaughter Child FN'])[1]")
	public WebElement childChildrenFirstNameBannerValue;

	/* ********************************************************************** */
	/* ****** child's children been with their current partner DETAILS ****** */
	/* ********************************************************************** */

	/* CHILD RP: Have all of this child's children been with their current partner? Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_have_all_of_child_s_children_been_with_partner\"]//span[@class=\"ng-binding\"]")
	public WebElement childCurrentPartnerLabel;

	/* CHILD RP: Have all of this child's children been with their current partner?DropDown */
	@FindBy(xpath = "//div[48]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childCurrentPartnerDropDown;

	/* CHILD RP: How many total different partners has child had children with?Label */
	@FindBy(xpath = "//span[normalize-space()=\"How many total different partners has child had children with?\"]")
	public WebElement childTotalDifferentPartnerLabel;

	/* CHILD RP: How many total different partners has child had children with? Drop Down */
	@FindBy(xpath = "//div[49]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement childTotalDifferentPartnerDropDown;

	/* CHILD RP: Please select the 'Add' button below to add each partner this child has had children with Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each p\")])[1]")
	public WebElement addButtonToAddPartnerThisChildHasLabel;

	/* CHILD RP: Add Partner Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[5]")
	public WebElement addPartnerButton;

	/* ***********************************************************************/
	/* ************** Other Biological Parent DETAILS ************************ */
	/* ***********************************************************************/

	/* CHILD RP: Other Biological Parent Label */
	@FindBy(xpath = "//span[normalize-space()=\"Other Biological Parent\"]")
	public WebElement otherBiologicalParentLabel;

	/* CHILD RP: Other Biological Parent DropDown */
	@FindBy(xpath = "(//a[@class='select2-choice select2-default form-control'])[4]")
	public WebElement otherBiologicalParentDropDown;

	/* CHILD RP: How many total children (alive and deceased) has this relative had? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-21'])[1]")
	public WebElement totalChildrenPatientHadDropDown;

	/* CHILD RP: Is there anything else you would like us to know about this child? Label */
	@FindBy(xpath = "(//span[normalize-space()='Is there anything else you would like us to know about this child?'])[1]")
	public WebElement anythingElseAboutChildLabel;
	
	/* CHILD RP: Is there anything else you would like us to know about this child? TextBox */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_child'])[1]")
	public WebElement anythingElseAboutChildTextBox;

	/* *************************************************************** */
	/* ********************* FHQ NEW SIBLING RECORD PRODUCER ********* */
	/* *************************************************************** */

	/* SIBLING RP: Banner on FHQ New Sibling Record Producer Page */
	@FindBy(xpath = "(//h2[normalize-space()='Sibling'])[1]")
	public WebElement fHQSiblingBanner;

	/* SIBLING RP: You are currently filling out information for the participants sibling.Banner */
	@FindBy(xpath = "(//p[contains(text(),'You are currently filling out information for the ')])[1]")
	public WebElement siblingRelationBanner;

	/* SIBLING RP: Please define the type of sibling? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Please define the type of sibling?\"]")
	public WebElement fHQTypeOfSiblingLabel;

	/* SIBLING RP: Please define the type of sibling? DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement fHQTypeOfSiblingDropDown;

	/* SIBLING RP: Please define the type of sibling? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement siblingBirthLabelDropDown;

	/* SIBLING RP: Please define the type of sibling? DropDown */
	@FindBy(xpath = "(//div[@id='select2-result-label-349'])[1]")
	public WebElement siblingBirthLabelYes;

	/* SIBLING RP: Does this sibling have a current spouse or partner? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Does this sibling have a current spouse or partner?\"]")
	public WebElement fHQDoesSiblingHaveCurrentSpouseLabel;

	/* SIBLING RP: Please fill out the following about this sibling's current partner.Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please fill out the following about this sibling's\")])[1]")
	public WebElement fHQDoesSiblingHaveCurrentSpouseBanner;

	/* SIBLING RP: Has this relative been diagnosed with a RASopathy? DropDown */
	@FindBy(xpath = "(//span[contains(text(),'-- None --')])[17]")
	public WebElement birthsLabelDropDown;

	/* SIBLING RP:Total Number of Miscarriages Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Miscarriages'])[1]")
	public WebElement siblingTotalMiscarriagesLabel;

	/* SIBLING RP:Total Number of Stillbirths Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Stillbirths'])[1]")
	public WebElement siblingtTotalStillbirthsLabel;

	/* SIBLING RP:Total Number of Induced Abortions Label */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Induced Abortions'])[1]")
	public WebElement siblingTotalInducedAbortionsLabel;

	/* SIBLING RP:Total Number of Tubal/Ectopic/Molar Pregnancies Label */
	@FindBy(xpath = "//label[contains(@for,'sp_formfield_total_number_of_tubal_ectopic_molar_pregnancies')]//span[2]")
	public WebElement siblingTotalTubalEctopicMolarPregnanciesLabel;

	/* SIBLING RP:Total Number of Tubal/Ectopic/Molar Pregnancies DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-16'])[1]")
	public WebElement cousinTotalTubalDropDown;

	/* SIBLING RP: Please select the 'Add' button below to add each Child thissibling has had. Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each C\")])[1]")
	public WebElement fHQSelectAddToAddSiblingChildrenBanner;

	/* SIBLING RP: How many total children has this relative had? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-20'])[1]")
	public WebElement howManyTotalChildrenSiblingHasDropDown;

	/* SIBLING RP: How many total children does this sibling have? Label */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Add'])[4]")
	public WebElement addChildMRVSButtonForSibling;

	/* SIBLING RP: How many total children does this sibling have? Label */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Remove All'])[4]")
	public WebElement removeAllChildMRVSButtonForSibling;

	/* SIBLING RP: Has this sibling been diagnosed with a RASopathy? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this sibling been diagnosed with a RASopathy?\"]")
	public WebElement siblingDiagnosedWithRasopathyLabel;

	/* SIBLING RP: Has this sibling been diagnosed with a RASopathy? Add button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[1]")
	public WebElement addSiblingRasopathyButton;

	/* SIBLING RP: Please select the 'Add' button below to add each RASopathy thissibling has had. Add Button Information */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each R\")])[1]")
	public WebElement siblingDiagnosedWithRasopathyAddButtonInfo;

	/* SIBLING RP: Has this relative ever had any type of cancer? Label */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with cancer?'])[1]")
	public WebElement siblingDiagnosedWithCancerLabel;

	/* SIBLING RP: Please select the 'Add' button below to add each cancer this sibling has had. Add Button Information */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each c\")])[1]")
	public WebElement siblingDiagnosedWithCancerAddButtonInfo;

	/* SIBLING RP: Has this relative ever been diagnosed with any of the conditions listed below? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Has this relative ever been diagnosed with any of the medical conditions listed below?\"]")
	public WebElement siblingDiagnosedWithMedicalConditionsLabel;

	/* SIBLING RP: Please select the 'Add' button below to add each medical condition this sibling has had. Add Button Information */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each m\")])[1]")
	public WebElement siblingDiagnosedWithMedicalConditionsAddButtonInfo;

	/* SIBLING RP: Is there anything else you would like us to know about this relative? Text Box */
	@FindBy(xpath = "(//textarea[contains(@name,'is_there_anything_else_you_would_like_us_to_know_about_sibling')])[1]")
	public WebElement anythingElseAboutSiblingTextBox;

	/* *************************************************************** */
	/* ********************* FHQ NEW AUNT/UNCLE RECORD PRODUCER ****** */
	/* *************************************************************** */

	/* AUNT/UNCLE RP: Banner on New Parent Record Producer Page */
	@FindBy(xpath = "(//h2[normalize-space()='Aunt/Uncle'])[1]")
	public WebElement auntUncleBanner;

	/* AUNT/UNCLE RP: You are currently filling out information for the participants aunt/uncle. */
	@FindBy(xpath = "(//p[@class='ng-binding'])[1]")
	public WebElement auntUncleRelationBanner;

	/* AUNT/UNCLE RP: Please enter one record per each family member for whom you have knowledge: Banner */
	@FindBy(xpath = "(//p[contains(text(),'Please enter one record per each family member for')])[1]")
	public WebElement shortDescriptionInformationBanner1;

	/* AUNT/UNCLE RP: Is this relative the participant's mother's sibling or their father's sibling Label */
	@FindBy(xpath = "(//span[contains(text(),\"Is this relative the participant's mother's sibling or their father's sibling\")])[1]")
	public WebElement relativeParticipantsMotherOrFatherSiblingLabel;

	/* AUNT/UNCLE RP: Is this relative the participant's mother's sibling or their father's sibling Banner*/
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='If you are filling out this form for your self you are the participant.'])[1]")
	public WebElement relativeParticipantsMotherOrFatherSiblingBanner;

	/* AUNT/UNCLE RP: Is this relative the participant's mother's sibling or their father's sibling DropDown */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_parent_sibling']")
	public WebElement relativeParticipantsMotherOrFatherSiblingDropDown;

	/* AUNT/UNCLE RP: Please define the type of sibling? Label */
	@FindBy(xpath = "(//span[normalize-space()='Please define the type of sibling?'])[1]")
	public WebElement auntUncleTypeOfSiblingToParentLabel;

	/* AUNT/UNCLE RP: Please define the type of sibling? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-1'])[1]")
	public WebElement auntUncleTypeOfSiblingToParentDropDown;

	/* AUNT/UNCLE RP: First Initial of Last Name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of LAST Name\"]")
	public WebElement auntUnclefirstInitialLastNameLabel;

	/* AUNT/UNCLE RP: What was the cause of death? Label */
	@FindBy(xpath = "//span[normalize-space()=\"What was the cause of death?\"]")
	public WebElement causeOfThisAuntUncleDeathLabel;

	/* AUNT/UNCLE RP: What was the cause of death? TextBox */
	@FindBy(xpath = "(//input[@name='cause_of_death'])[1]")
	public WebElement causeOfThisAuntUncleDeathTextBox;

	/* AUNT/UNCLE RP: Sex assigned at birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-8'])[1]")
	public WebElement auntUncleSexAssignedAtBirthDropDown;

	/* AUNT/UNCLE RP: Gender Identity DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-9'])[1]")
	public WebElement auntUncleGenderIdentitydDropDown;

	/* AUNT/UNCLE RP: Other Gender Label */
	@FindBy(xpath = "(//span[normalize-space()='Other gender'])[1]")
	public WebElement otherGenderLabel;

	/* AUNT/UNCLE RP: Other Gender TextBox */
	@FindBy(xpath = "(//input[@id='sp_formfield_other_gender'])[1]")
	public WebElement otherGenderTextBox;

	/* AUNT/UNCLE RP: Is this relative a twin or part of a multiple birth? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-10'])[1]")
	public WebElement auntUncleTwinOrMultipleBirthDropDown;

	/* AUNT/UNCLE RP:Type of birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement auntUncleTypeOfBirthDropDown;

	/* AUNT/UNCLE RP:Type of birth DropDown */
	@FindBy(xpath = "(//i[@aria-label='More information for Has this relative been diagnosed with a RASopathy?'])[1]")
	public WebElement pregnanacyBanner;

	/* AUNT/UNCLE RP:Type of birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement auntUnclepregnanciesDropDown;

	/* AUNT/UNCLE RP:Total number of: Miscarriages DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-13'])[1]")
	public WebElement auntUncleTotalMiscarriagesDropDown;

	/* AUNT/UNCLE RP:Total number of: Stillbirths DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-14'])[1]")
	public WebElement auntUncleTotalStillbirthsDropDown;

	/* AUNT/UNCLE RP:Total number of: Induced Abortions DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-15'])[1]")
	public WebElement auntUncleTotalInducedAbortionsDropDown;

	/* AUNT/UNCLE RP:Total number of: Tubal/Ectopic/Molar Pregnancies DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-16'])[1]")
	public WebElement auntUncleTotalTubalEctopicMolarPregnanciesDropDown;

	/* AUNT/UNCLE RP:Has this relative been diagnosed with a RASopathy?Drop-down */
	@FindBy(xpath = "(//span[@id='select2-chosen-17'])[1]")
	public WebElement auntUncleResopathyDianosisDropDown;

	/* AUNT/UNCLE RP:Has this relative ever been diagnosed with cancer?Drop-down */
	@FindBy(xpath = "(//span[@id='select2-chosen-18'])[1]")
	public WebElement auntUnclediagnosedWithCancerDropDown;

	/* AUNT/UNCLE RP: Please Press Add button below to add each cancer (name of Aunt) has had. Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each c\")])[1]")
	public WebElement auntUnclediagnosedWithCancerAddButtonInfo;

	/* AUNT/UNCLE RP: Please press add button below to add each Medical condition(name of Aunt) has had. Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each m\")])[1]")
	public WebElement auntUncleDiagnosedWithMedicalConditionsAddButtonInfo;

	/* AUNT/UNCLE RP:Add Medical Condition(s) MRVS Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[3]")
	public WebElement addMedicalConditionsAuntUncleButton;

	/* AUNT/UNCLE RP: Has this relative ever been diagnosed with any of the medical conditions listed below? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-19'])[1]")
	public WebElement auntUnclediagnosedWithMedicalConditionsDropDown;

	/* AUNT/UNCLE RP: How many total children has this relative had? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-20'])[1]")
	public WebElement auntUncletotalChildrenThisRelativeHadDropDown;

	/* AUNT/UNCLE RP: Please select the 'Add' button below to add each Child this relative has had. Banner */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each C\")])[1]")
	public WebElement addButtonEachChildThisRelativeHasBanner;

	/* AUNT/UNCLE RP: Add button for Child MRVS Button */
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[4]")
	public WebElement auntUncleAddChildMRVSButton;

	/* AUNT/UNCLE RP: RemoveAll button for Child MRVS Button */
	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Remove All'])[4]")
	public WebElement auntUncleRemoveAllChildMRVSButton;

	/* AUNT/UNCLE RP: AuntUncle Child First Name in MRVS table Value */
	@FindBy(xpath = "(//td[normalize-space()='Aunt Child FN'])[1]")
	public WebElement auntUncleFirstNameBannerValue;

	/* AUNT/UNCLE RP: AuntUncle First Initial of LAST name in MRVS table Value */
	@FindBy(xpath = "(//td[normalize-space()='E'])[1]")
	public WebElement auntUncleFirstInitialOfLastNameBannerValue;

	/* AUNT/UNCLE RP: AuntUncle Vital Status in MRVS table Value */
	@FindBy(xpath = "(//td[normalize-space()=\"Don't Know\"])[1]")
	public WebElement auntUncleVitalStatusBannerValue;

	/* AUNT/UNCLE RP: Is there anything else you would like us to know about this relative? TextBox */
	@FindBy(xpath = "(//textarea[contains(@name,'is_there_anything_else_you_would_like_us_to_know_about_aunt_uncle')])[1]")
	public WebElement anythingElseAboutAuntUncleTextBox;

	/* *************************************************************** */
	/* ********************* FHQ NEW NIECE/NEPHEW RECORD PRODUCER ****** */
	/* *************************************************************** */

	/* NIECE/NEPHEW RP: Banner on New Parent Record Producer Page Banner */
	@FindBy(xpath = "(//h2[normalize-space()='Niece/Nephew'])[1]")
	public WebElement nieceNephewBanner;

	/* NIECE/NEPHEW RP: You are currently filling out information for the participants niece/nephew. Banner */
	@FindBy(xpath = "(//p[contains(text(),'You are currently filling out information for the ')])[1]")
	public WebElement neiceNephewRelationBanner;

	/* NIECE/NEPHEW RP:Please make sure you have completed all partner records before completing children records.Banner */
	@FindBy(xpath = "(//p[contains(text(),'Please make sure you have completed all partner re')])[1]")
	public WebElement neiceNephewRelationBanner1;

	/* NIECE/NEPHEW RP: Who is the parent of this niece/nephew? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Who is the parent of this niece/nephew?\"]")
	public WebElement parentOfThisNieceNephewLabel;

	/* NIECE/NEPHEW RP: Banner */
	@FindBy(xpath = "(//span[@title='If the sibling name is not visible in the dropdown, that means the sibling record is incomplete on the home page. Please return to the homepage and complete the sibling record(s) before completing the niece/nephew records.'])[1]")
	public WebElement parentOfThisNieceNephewBanner;

	/* NIECE/NEPHEW RP: Who is the parent of this niece/nephew? DropDown */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_niece_nephew_parent'])[1]")
	public WebElement parentOfThisNieceNephewDropDown;

	/* NIECE/NEPHEW RP: First Initial of LAST name of this niece/nephew? Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_last_initial\"]//span[contains(text(),\"First Initial of LAST name\")]")
	public WebElement nieceNephewfirstInitialLastNameLabel;

	/* NIECE/NEPHEW RP: What was the cause of death? of this niece/nephew? Label */
	@FindBy(xpath = "//span[normalize-space()=\"What was the cause of death?\"]")
	public WebElement causeOfThisNieceNephewDeathLabel;

	/* NIECE/NEPHEW RP: If you don't know, you can write "don't know" in the text box. Banner */
	@FindBy(xpath = "(//input[@name='cause_of_death'])[1]")
	public WebElement causeOfThisNieceNephewDeathBanner;

	/* NIECE/NEPHEW RP: What was the cause of death? of this niece/nephew?TextBox */
	@FindBy(xpath = "(//input[@name='cause_of_death'])[1]")
	public WebElement causeOfThisNieceNephewDeathTextBox;

	/* NIECE/NEPHEW RP: Who is the parent of this niece/nephew? DropDown */
	@FindBy(xpath = "//div[@id=\"has_child_been_diagnosed_with_a_rasopathy\"]//span[contains(@class,\"ng-scope\")]//span[1]")
	public WebElement childDiagnosedWithRasopathyInformationBanner;

	/* NIECE/NEPHEW RP: Has this child been diagnosed with a RASopathy? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-22'])[1]")
	public WebElement nieceNephewResopathyDetailDropDown;

	/* NIECE/NEPHEW RP: Add RASopathy Button of this niece/nephew? Button */
	@FindBy(xpath = "")
	public WebElement addRasopathyButtonForNieceNephew;

	/* NIECE/NEPHEW RP: Has this child ever had any type of cancer? DropDown */
	@FindBy(xpath = "((//span[@id='select2-chosen-23'])[1]")
	public WebElement nieceNephewCancerDetailDropDown;

	/* *************************************************************** */
	/* ********************* FHQ NEW GRANDPARENT RECORD PRODUCER ********* */
	/* *************************************************************** */

	/* GRANDPARENT RP: Banner on New Grandparent Record Producer Page */
	@FindBy(xpath = "(//h2[normalize-space()='Grandparent'])[1]")
	public WebElement grandParentBanner;

	/* GRANDPARENT RP: Which Grandparent is this? Label */
	@FindBy(xpath = "(//span[normalize-space()='Which grandparent is this?'])[1]")
	public WebElement whichGrandParentLabel;

	/* GRANDPARENT RP: Which Grandparent is this? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-2'])[1]")
	public WebElement whichGrandParentDropDown;

	/* GRANDPARENT RP: You are currently filling out information for the participants paternal grandmother.Banner */
	@FindBy(xpath = "(//p[contains(text(),'You are currently filling out information for the ')])[1]")
	public WebElement grandParentInformationBanner;

	/* GRANDPARENT RP: First Initial of LAST name DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-3'])[1]")
	public WebElement firstInitialLastNameDropDown;

	/* GRANDPARENT RP: Was this person adopted? Label */
	@FindBy(xpath = "(//span[normalize-space()='Was this relative adopted?'])[1]")
	public WebElement wasGrandParentAdoptedLabel;

	/* GRANDPARENT RP: Was this person adopted? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-4'])[1]")
	public WebElement wasGrandParentAdoptedDropDown;

	/* GRANDPARENT RP: Year of Birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-5'])[1]")
	public WebElement yearOfBirthDropDown;

	/* GRANDPARENT RP: vital status DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-6'])[1]")
	public WebElement vitalStatusDropDown;

	/* GRANDPARENT RP: Year of Death DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-7'])[1]")
	public WebElement yearOfDeathDropDown;

	/* GRANDPARENT RP: Age of Death DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-8'])[1]")
	public WebElement ageOfDeathDropDown;

	/* GRANDPARENT RP: Has this relative been diagnosed with a RASopathy?DropDown */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')][normalize-space()='-- None --'])[19]")
	public WebElement grandParentDiagnosedWithRasopathyInformationDropDown;

	/* GRANDPARENT RP: Has this relative ever been diagnosed with cancer? DropDown */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')][normalize-space()='-- None --'])[20]")
	public WebElement grandParentDiagnosedWithCancerLabelDropDown;

	/* GRANDPARENT RP: Has this relative ever been diagnosed with any of the medical conditions listed below? DropDown */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')][normalize-space()='-- None --'])[21]")
	public WebElement grandParentDiagnosedWithMedicalConditionsLabelDropDown;

	/* GRANDPARENT RP: Has this relative ever been diagnosed with one of the medical conditions listed below? Label */
	@FindBy(xpath = "//span[contains(text(),\"Has this relative ever been diagnosed with one of \")]")
	public WebElement grandParentDiagnosedWithMedicalConditionsLabel;

	/* GRANDPARENT RP: Has this relative ever been diagnosed with one of the medical conditions listed below? DropDown */
	@FindBy(xpath = "//div[39]//div[1]//span[1]//div[1]//a[1]//span[1]")
	public WebElement grandParentMedicalConditionDropDown;

	/* GRANDPARENT RP: Medical Condition(s) Add Button */
	@FindBy(xpath = "//div[1]//span[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//form[1]//div[1]//sp-variable-layout[1]//fieldset[1]//div[1]//div[1]//div[41]//div[1]//span[1]//sp-catalog-variable[1]//div[1]//sp-sc-multi-row-element[1]//div[1]//div[1]//button[1]")
	public WebElement grandParentMedicalConditionAddButton;

	/* GRANDPARENT RP: Parent first Name On List View Page */
	@FindBy(xpath = "(//td[@role='cell'])[1]")
	public WebElement grandParentfirstNameOnListView;

	/* GRANDPARENT RP: Parent first Initial Of Last On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='D'])[1]")
	public WebElement grandParentfirstInitialOfLastNameOnListView;

	/* GRANDPARENT RP: Parent Vital Status On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement grandParentvitalStatusOnListView;

	/* GRANDPARENT RP: Parent Year of Birth On List View Page */
	@FindBy(xpath = "(//span[normalize-space()='Before 1900'])[1]")
	public WebElement grandParentyearOfBirthOnListView;

	/* GRANDPARENT RP: Parent Relation to Patient On List View Page */
	@FindBy(xpath = "(//td[@role='cell'])[5]")
	public WebElement grandParentrelationToPatientOnListView;

	/* *************************************************************** */
	/* ************* FHQ NEW Grandchild RECORD PRODUCER ************ */
	/* *************************************************************** */

	/* GRANDCHILD RP: Banner for Grandchild to Patient Page */
	@FindBy(xpath = "(//h2[normalize-space()='Grandchild'])[1]")
	public WebElement grandChildBanner;

	/* GRANDCHILD RP: You are currently filling out information for the participants grandchild. */
	@FindBy(xpath = "(//p[@class='ng-binding'])[1]")
	public WebElement grandChildRelationBanner;

	/* GRANDCHILD RP: Who is the parent of this grandchild? Label */
	@FindBy(xpath = "//span[normalize-space()=\"Who is the parent of this grandchild?\"]")
	public WebElement parentOfThisGrandChildLabel;

	/* GRANDCHILD RP: Banner */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='If the child name is not visible in the dropdown, that means the child record is incomplete on the home page. Please return to the homepage and complete the child record(s) before completing the grandchild records.'])[1]")
	public WebElement parentOfThisGrandChildBanner;

	/* GRANDCHILD RP: Who is the parent of this grandchild? DropDown */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_grandchild_parent'])[1]")
	public WebElement parentOfThisGrandChildDropDown;

	/* GRANDCHILD RP: Other Biological Parent DropDown */
	@FindBy(xpath = "//div[46]//div[1]//span[1]//span[2]//div[1]//div[1]//a[1]")
	public WebElement otherBiologicalGrandParentDropDown;

	/* *************************************************************** */
	/* ************* FHQ NEW COUSIN RECORD PRODUCER ************ */
	/* *************************************************************** */

	/* COUSIN RP: Banner for Cousin to Patient Page */
	@FindBy(xpath = "(//h2[normalize-space()='Cousin'])[1]")
	public WebElement cousinBanner;

	/* COUSIN RP: You are currently filling out information for the participants cousin.*/
	@FindBy(xpath = "(//p[@class='ng-binding'])[1]")
	public WebElement cousinRelationBanner;

	/* COUSIN RP: Who is the parent of this cousin? label */
	@FindBy(xpath = "//span[normalize-space()=\"Who is the parent of this cousin?\"]")
	public WebElement parentOfThisCousinLabel;

	/* COUSIN RP: Who is the parent of this cousin? Banner */
	@FindBy(xpath = "(//span[@title='If the aunt/uncle name is not visible in the dropdown, that means the aunt/uncle record is incomplete on the home page. Please return to the homepage and complete the aunt/uncle record(s) before completing the cousin records.'])[1]")
	public WebElement parentOfThisCousinBanner;

	/* COUSIN RP: Who is the parent of this cousin? DropDown */
	@FindBy(xpath = "(//span[@id='sp_formfield_reference_cousin_parent'])[1]")
	public WebElement parentOfThisCousinDropDown;

	/* COUSIN RP: Cousin First Name label */
	@FindBy(xpath = "(//span[normalize-space()=\"First Name\"])[1]")
	public WebElement cousinFirstNameLabel;

	/* COUSIN RP: Cousin First Name TextBox */
	@FindBy(xpath = "(//input[@name='first_name'])[1]")
	public WebElement cousinFirstNameTextBox;

	/* COUSIN RP: Is this relative a twin or part of a multiple birth? DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement isThisCousinTwinOrMultipleBirthDropDown;

	/* COUSIN RP: Type of birth DropDown */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement typeOfBirthOfCousinDropDown;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON ALL RELATIONS ********* */
	/* *************************************************************** */

	/* CRP: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='First Name'])[1]")
	public WebElement firstNameOnCRP;

	/* CRP: First Name On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_first_name'])[1]")
	public WebElement firstNameOnCRPValue;

	/* CRP: First Initial of LAST Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement firstInitialOfLASTNameOnCRP;

	/* CRP: First Initial of LAST Name On CRP Page Value */
	@FindBy(xpath = "(//input[@name='last_initial'])[1]")
	public WebElement firstInitialOfLASTNameOnCRPValue;

	/* CRP: First Initial of LAST Name On CRP Page Value */
	@FindBy(xpath = "(//input[@name='last_initial'])[1]")
	public WebElement firstInitialOfLASTNameOnCRPValue1;

	/* CRP: Year of Birth On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Year of Birth'])[1]")
	public WebElement yearOfBirthOnCRP;

	/* CRP: Year of Birth On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_year_of_birth'])[1]")
	public WebElement yearOfBirthOnCRPValue;

	/* CRP: Year of Birth On CRP Page Value */
	@FindBy(xpath = "(//input[@name='year_of_birth'])[1]")
	public WebElement yearOfBirthOnCRPValue1;

	/* CRP: Vital Status On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Vital Status'])[1]")
	public WebElement vitalStatusOnCRP;

	/* CRP: Vital Status On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement vitalStatusOnCRPValue;

	/* CRP: Please provide the year of death or the age of death On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Please provide the year of death or the age of death'])[1]")
	public WebElement yearOfDeathOrAgeOfDeathOnCRP;

	/* CRP: Please provide the year of death or the age of death On CRP Value */
	@FindBy(xpath = "(//span[contains(text(),'Year of Death')])[1]")
	public WebElement yearOfDeathOrAgeOfDeathOnCRPValue;

	/* CRP: Year of Death On CRP Page */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Year of Death'])[1]")
	public WebElement yearOfDeathOnCRP;

	/* CRP: Year of Death On CRP Page */
	@FindBy(xpath = "(//input[@id='sp_formfield_year_of_death'])[1]")
	public WebElement yearOfDeathOnCRPValue;

	/* CRP: Year of Death On CRP Page */
	@FindBy(xpath = "(//input[@name='year_of_death'])[1]")
	public WebElement yearOfDeathOnCRPValue1;

	/* CRP: What was the cause of this relative death? On CRP Page */
	@FindBy(xpath = "//span[normalize-space()='What was the cause of this relative death?']")
	public WebElement causeOfDeathOnCRP;

	/* CRP: What was the cause of this relative death? On CRP Page */
	@FindBy(xpath = "(//input[@name='what_was_the_cause_of_death'])[1]")
	public WebElement causeOfDeathOnCRPValue;

	/* CRP: What was the cause of this relative death? On CRP Page */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_cause_of_death'])[1]")
	public WebElement causeOfDeathOnCRPValue1;

	/* CRP: What was the cause of this relative death? On CRP Page */
	@FindBy(xpath = "(//input[@name='cause_of_death'])[1]")
	public WebElement causeOfDeathOnCRPValue2;

	/* CRP: Sex assigned at birth On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Sex assigned at birth'])[1]")
	public WebElement sexAssignedAtBirthOnCRP;

	/* CRP: Sex assigned at birth On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Female')])[1]")
	public WebElement sexAssignedAtBirthOnCRPValue;

	/* CRP: Gender Identity On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Gender Identity'])[1]")
	public WebElement genderIdentityOnCRP;

	/* CRP: Gender Identity On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Female')])[2]")
	public WebElement genderIdentityOnCRPValue;

	/* CRP: Gender Identity On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Additional gender category (write in)'])[1]")
	public WebElement genderIdentityOnCRPValue1;

	/* CRP: Gender Identity On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-4'])[1]")
	public WebElement genderIdentityOnCRPValue2;

	/* CRP: Other gender On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Other gender'])[1]")
	public WebElement otherGenderOnCRP;

	/* CRP: Other gender On CRP Page Value */
	@FindBy(xpath = "(//input[@name='other_gender'])[1]")
	public WebElement otherGenderOnCRPValue;

	/* CRP: Which best describes this relative? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Which best describes this relative?'])[1]")
	public WebElement describesThisRelativeOnCRP;

	/* CRP: Which best describes this relative? On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-5'])[1]")
	public WebElement describesThisRelativeOnCRPValue;

	/* CRP: Is the other biological parent of this relative one of partners you have entered On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Is the other biological parent of this relative one of partners you have entered'])[1]")
	public WebElement biologicalParentOfThisRelativeOnCRP;

	/* CRP: Is the other biological parent of this relative one of partners you have entered On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-6'])[1]")
	public WebElement biologicalParentOfThisRelativeOnCRPValue;

	/* CRP: Is this relative a twin or part of a multiple birth?On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Is this relative a twin or part of a multiple birth?'])[1]")
	public WebElement twinOnCRP;

	/* CRP: Is this relative a twin or part of a multiple birth?On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-7'])[1]")
	public WebElement twinOnCRPValue;

	/* CRP: Is this relative a twin or part of a multiple birth?On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[1]")
	public WebElement twinOnCRPValue1;

	/* CRP: Type of births On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Type of birth'])[1]")
	public WebElement typeOfBirthOnCRP;

	/* CRP: Type of births On CRP Page On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Fraternal Twin'])[1]")
	public WebElement typeOfBirthOnCRPValue;

	/* CRP: Type of births On CRP Page On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Identical Triplet'])[1]")
	public WebElement typeOfBirthOnCRPValue1;

	/* CRP: Type of births On CRP Page On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Twin from triplet birth'])[1]")
	public WebElement typeOfBirthOnCRPValue2;

	/* CRP: Type of births On CRP Page On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Fraternal triplet'])[1]")
	public WebElement typeOfBirthOnCRPValue3;

	/* CRP: Has this relative ever had any miscarriages, stillbirths, induced abortions ... On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever had any miscarriages, stillbirths, induced abortions ...'])[1]")
	public WebElement miscarriageStillBirthsOnCRP;

	/* CRP: Has this relative ever had any miscarriages, stillbirths, induced abortions ... On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-9'])[1]")
	public WebElement miscarriageStillBirthsOnCRPValue;

	/* CRP: Has this relative ever had any miscarriages, stillbirths, induced abortions ... On CRP Page Value */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')][normalize-space()='Yes'])[2]")
	public WebElement miscarriageStillBirthsOnCRPValue1;

	/* CRP: Has this relative ever had any miscarriages, stillbirths, induced abortions ... On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[2]")
	public WebElement miscarriageStillBirthsOnCRPValue2;

	/* CRP: Total Number of Miscarriages On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Miscarriages'])[1]")
	public WebElement totalNumberOfMiscarriagesOnCRP;

	/* CRP: Total Number of Miscarriages On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_miscarriages'])[1]")
	public WebElement totalNumberOfMiscarriagesOnCRPValue;

	/* CRP: Total Number of Miscarriages On CRP Page Value */
	@FindBy(xpath = "(//input[@name='miscarriages_less_than_20_weeks_of_pregnancy'])[1]")
	public WebElement totalNumberOfMiscarriagesOnCRPValue1;

	/* CRP: Total Number of Miscarriages On CRP Page Value */
	@FindBy(xpath = "(//input[@name='total_number_of_miscarriages'])[1]")
	public WebElement totalNumberOfMiscarriagesOnCRPValue2;

	/* CRP: Total Number of Stillbirths On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Stillbirths'])[1]")
	public WebElement totaNumberOfStillbirthsOnCRP;

	/* CRP: Total Number of Stillbirths On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_stillbirths'])[1]")
	public WebElement totaNumberOfStillbirthsOnCRPValue;

	/* CRP: Total Number of Stillbirths On CRP Page Value */
	@FindBy(xpath = "(//input[@name='stillbirths_more_than_20_weeks_of_pregnancy'])[1]")
	public WebElement totaNumberOfStillbirthsOnCRPValue1;

	/* CRP: Total Number of Stillbirths On CRP Page Value */
	@FindBy(xpath = "(//input[@name='total_number_of_stillbirths'])[1]")
	public WebElement totaNumberOfStillbirthsOnCRPValue2;

	/* CRP: Total Number of Induced Abortions On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Induced Abortions'])[1]")
	public WebElement totalNumberOfInducedAbortionsOnCRP;

	/* CRP: Total Number of Induced Abortions On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_induced_abortions'])[1]")
	public WebElement totalNumberOfInducedAbortionsOnCRPValue;

	/* CRP: Total Number of Induced Abortions On CRP Page Value */
	@FindBy(xpath = "(//input[@name='induced_abortions'])[1]")
	public WebElement totalNumberOfInducedAbortionsOnCRPValue1;

	/* CRP: Total Number of Induced Abortions On CRP Page Value */
	@FindBy(xpath = "(//input[@name='total_number_of_induced_abortions'])[1]")
	public WebElement totalNumberOfInducedAbortionsOnCRPValue2;

	/* CRP: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page */
	@FindBy(xpath = "//div[@id='total_number_of_tubal_ectopic_molar_pregnancies']//div[@class='ng-scope']")
	public WebElement totalNumberOfTubalOnCRP;

	/* CRP: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page */
	@FindBy(xpath = "//div[@id='tubal_ectopic_molar_pregnancies']//label")
	public WebElement totalNumberOfTubalOnCRP1;

	/* CRP: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_tubal_ectopic_molar_pregnancies'])[1]")
	public WebElement totalNumberOfTubalOnCRPValue;

	/* CRP: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page Value */
	@FindBy(xpath = "(//input[@name='tubal_ectopic_molar_pregnancies'])[1]")
	public WebElement totalNumberOfTubalOnCRPValue1;

	/* CRP: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_tubal_ectopic_molar_pregnancies'])[1]")
	public WebElement totalNumberOfTubalOnCRPValue2;

	/* CRP: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page Value */
	@FindBy(xpath = "(//input[@name='total_number_of_tubal_ectopic_molar_pregnancies'])[1]")
	public WebElement totalNumberOfTubalOnCRPValue3;

	/* CRP: Has this relative been diagnosed with a RASopathy On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative been diagnosed with a RASopathy?'])[1]")
	public WebElement diagnosedWithRASopathyOnCRP;

	/* CRP:Has this relative been diagnosed with a RASopathy On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[3]")
	public WebElement diagnosedWithRASopathyOnCRPValue;
	
	/* CRP:Has this relative been diagnosed with a RASopathy On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-10'])[1]")
	public WebElement grandParentDiagnosedWithRASopathyOnCRPValue;

	/* CRP: Has this relative ever been diagnosed with cancer? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with cancer?'])[1]")
	public WebElement diagnosedWithCancerOnCRP;

	/* CRP: Has this relative ever been diagnosed with cancer? On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[4]")
	public WebElement diagnosedWithCancerOnCRPValue;
	
	/* CRP: Has this relative ever been diagnosed with cancer? On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement grandParentDiagnosedWithCancerOnCRPValue;

	/* CRP: Has this relative ever been diagnosed with any of the medical conditions ... On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with any medical conditions?'])[1]")
	public WebElement diagnosedWithMedicalConditionsOnCRP;

	/* CRP: Has this relative ever been diagnosed with any of the medical conditions ... On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with any medical conditions?'])[1]")
	public WebElement diagnosedWithMedicalConditionsOnCRP1;

	/* CRP: Has this relative ever been diagnosed with any of the medical conditions ... On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement diagnosedWithMedicalConditionsOnCRPValue;
	
	/* CRP: Has this relative ever been diagnosed with any of the medical conditions On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement grandParentDiagnosedWithMedicalConditionsOnCRPValue;

	/* CRP: Has this relative ever been diagnosed with any of the medical conditions ... On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[5]")
	public WebElement diagnosedWithMedicalConditionsOnCRPValue1;

	/* CRP: How many total children (alive and deceased) has this relative had? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='How many total children (alive and deceased) has this relative had?'])[1]")
	public WebElement howManyChildrenOnCRP;

	/* CRP: How many total children (alive and deceased) has this relative had? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='How many total children (alive and deceased) does this relative have?'])[1]")
	public WebElement howManyChildrenOnCRP1;

	/* CRP: How many total children (alive and deceased) has this relative had? On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_how_many_total_children_alive_and_deceased_has_child_had'])[1]")
	public WebElement howManyChildrenOnCRPValue;

	/* CRP: How many total children (alive and deceased) has this relative had? On CRP Page Value */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')][normalize-space()='1'])[1]")
	public WebElement howManyChildrenOnCRPValue1;

	/* CRP: How many total children (alive and deceased) has this relative had? On CRP Page Value */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='1'])[1]")
	public WebElement howManyChildrenOnCRPValue2;

	/* CRP: How many total children (alive and deceased) has this relative had? On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_num_children'])[1]")
	public WebElement howManyChildrenOnCRPValue3;

	/* CRP: How many siblings does this relative have? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='How many siblings does this relative have?'])[1]")
	public WebElement howManySiblingsOnCRP;

	/* CRP: How many siblings does this relative have? On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_how_many_siblings'])[1]")
	public WebElement howManySiblingsOnCRPValue;

	/* CRP:Is there anything else you would like us to know about this relative? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Is there anything else you would like us to know about this relative?'])[1]")
	public WebElement additionalInfoOnCRP;

	/* CRP: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[contains(@name,'additional_information')])[1]")
	public WebElement additionalInfoOnCRPValue;

	/* CRP: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_child'])[1]")
	public WebElement additionalInfoOnCRPValue1;

	/* CRP: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[@name='is_there_anything_else_you_would_like_us_to_know_about_aunt_uncle'])[1]")
	public WebElement additionalInfoOnCRPValue2;

	/* CRP: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[@name='is_there_anything_else_you_would_like_us_to_know_about_child'])[1]")
	public WebElement additionalInfoOnCRPValue3;

	/* CRP: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_this_parent_grandparent'])[1]")
	public WebElement additionalInfoOnCRPValue4;

	/* CRP: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_sibling'])[1]")
	public WebElement additionalInfoOnCRPValue5;

	/* CRP: RASopathies Details On CRP Page */
	@FindBy(xpath = "(//a[@ng-if=\"::rl.type == 'REL'\"])[1]")
	public WebElement rASopathiesInfoOnCRPValue;

	/* CRP: Cancers Details On CRP Page */
	@FindBy(xpath = "(//a[@ng-if=\"::rl.type == 'REL'\"])[2]")
	public WebElement cancersInfoOnCRPValue;

	/* CRP: Medical Conditions Details On CRP Page */
	@FindBy(xpath = "(//a[@ng-if=\"::rl.type == 'REL'\"])[3]")
	public WebElement medicalConditionsInfoOnCRPValue;

	/* CRP: Related family member details On CRP Page */
	@FindBy(xpath = "(//a[normalize-space()='Related family member details 9'])[1]")
	public WebElement relatedFamilyMemberDetailsOnCRPValue;

	/* CRP: Related family member details On CRP Page */
	@FindBy(xpath = "(//a[@class='ng-binding ng-scope'])[9]")
	public WebElement relatedFamilyMemberDetailsOnCRPValue1;

	/* CRP: Related family member details On CRP Page */
	@FindBy(xpath = "(//a[contains(@class,'ng-binding ng-scope')])[9]")
	public WebElement relatedFamilyMemberDetailsOnCRPValue2;

	/* CRP: Related Lists On CRP Page */
	@FindBy(xpath = "(//label[normalize-space()='Related Lists'])[1]")
	public WebElement relatedListsOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON SIBLING ********* */
	/* *************************************************************** */

	/* CRP SIBLING: First Name On CRP Page */
	@FindBy(xpath = "(//span[@aria-label='Open record: Elder Sibling FN'][normalize-space()='Elder Sibling FN'])[1]")
	public WebElement siblingFirstNameBannerOnList;

	/* CRP SIBLING: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Elder Sibling FN'])[1]")
	public WebElement siblingFirstNameBannerOnCRP;

	/* CRP SIBLING: Types of siblings On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Type of sibling'])[1]")
	public WebElement typesOfSiblingsOnCRP;

	/* CRP SIBLING: Types of siblings On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Half Sister (same mother)'])[1]")
	public WebElement typesOfSiblingsOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON AUNTUNCLE ********* */
	/* *************************************************************** */

	/* CRP AUNTUNCLE: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant AuntUncle FN'])[1]")
	public WebElement auntUncleFirstNameBannerOnCRP;

	/* CRP AUNTUNCLE: Sibling to FHQ Parent On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Sibling to'])[1]")
	public WebElement siblingToOnCRP;

	/* CRP AUNTUNCLE: Sibling to FHQ Parent On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'FHQ Parent: Participant Mother FN')])[1]")
	public WebElement siblingToOnCRPValue;

	/* CRP AUNTUNCLE: Type of sibling On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Type of sibling'])[1]")
	public WebElement typeOfSiblingOnCRP;

	/* CRP AUNTUNCLE: Type of sibling On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Sister'])[1]")
	public WebElement typeOfSiblingOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON NEICENEPHEW ********* */
	/* *************************************************************** */

	/* CRP NEICENEPHEW: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant NieceNephew FN'])[1]")
	public WebElement neiceNephewFirstNameBannerOnCRP;

	/* CRP NEICENEPHEW: Parent of this relative On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Parent of this relative'])[1]")
	public WebElement ParentOfThisRelativeOnCRP;

	/* CRP NEICENEPHEW: Parent of this relative On CRP Page Value */
	@FindBy(xpath = "(//span[@class='padder ng-binding ng-scope'])[1]")
	public WebElement ParentOfThisRelativeOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON GRANDCHILD ********* */
	/* *************************************************************** */

	/* CRP GRANDCHILD: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant GrandChild FN'])[1]")
	public WebElement grandChildFirstNameBannerOnCRP;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON COUSIN ********* */
	/* *************************************************************** */

	/* CRP COUSIN: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant Cousin FN'])[1]")
	public WebElement cousinFirstNameBannerOnCRP;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON CHILD ********* */
	/* *************************************************************** */

	/* CRP CHILD: First Name On CRP Page */
	@FindBy(xpath = "(//span[@aria-label='Open record: Participant New Child FN'])[1]")
	public WebElement childFirstNameBannerOnList;

	/* CRP CHILD: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant New Child FN'])[1]")
	public WebElement childFirstNameBannerOnCRP;

	/* CRP CHILD: Parent of this relative On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Parent of this relative'])[1]")
	public WebElement parentOfThisRelativeOnCRP;

	/* CRP CHILD: Parent of this relative On CRP Page Value */
	@FindBy(xpath = "(//span[@class='padder ng-binding ng-scope'])[1]")
	public WebElement parentOfThisRelativeOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON PARTNERS ********* */
	/* *************************************************************** */

	/* CRP PARTNER: Participant First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='New Partner FN'])[1]")
	public WebElement partnerfirstNameBannerOnCRP;

	/* CRP PARTNER: Is this your (the participant's) current partner On CRP Page */
	@FindBy(xpath = "//div[@id='is_this_the_participants_current_partner']//div[@class='ng-scope']")
	public WebElement currentPartnerOnCRP;

	/* CRP PARTNER: Is this your (the participant's) current partner On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[1]")
	public WebElement currentPartnerOnCRPValue;

	/* CRP PARTNER: Is the participant blood-related to this person? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Is the participant blood-related to this person?'])[1]")
	public WebElement bloodRelativeOnCRP;

	/* CRP PARTNER: Is the participant blood-related to this person? On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[2]")
	public WebElement bloodRelativeOnCRPValue;

	/* CRP PARTNER: Please describe how the participant is related to this person On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Please describe how the participant is related to this person'])[1]")
	public WebElement howParticipantRelatedOnCRP;

	/* CRP PARTNER: Please describe how the participant is related to this person On CRP Page Value */
	@FindBy(xpath = "(//input[contains(@name,'please_describe_how_the_participant_is_related_to_this_person')])[1]")
	public WebElement howParticipantRelatedOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON GRANDPARENT ********* */
	/* *************************************************************** */

	/* CRP GRANDPARENT: Participant First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='GrandMother FN'])[1]")
	public WebElement grandParentFirstNameBannerOnCRP;

	/* CRP GRANDPARENT: Relation to Patient On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Relation to Patient'])[1]")
	public WebElement relationToPatientOnCRP;

	/* CRP GRANDPARENT: Relation to Patient On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-1'])[1]")
	public WebElement relationToPatientOnCRPValue;

	/* CRP GRANDPARENT: Was this relative adopted On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Was this relative adopted?'])[1]")
	public WebElement wasThisRelativeAdoptedOnCRP;

	/* CRP GRANDPARENT: Was this relative adopted On CRP Page Value */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')][normalize-space()='Yes'])[1]")
	public WebElement wasThisRelativeAdoptedOnCRPValue;

	/* *************************************************************** */
	/* ***** COMPLETED RECORD PRODUCERS LOCATORS ON PARENT ********* */
	/* *************************************************************** */

	/* CRP PARENT: Participant First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Participant Mother FN'])[1]")
	public WebElement parentfirstNameBannerOnCRP;

	/* CRP PARENT: Relation to Patient On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Relation to Patient'])[1]")
	public WebElement parentRelationToPatientOnCRP;

	/* CRP PARENT: Relation to Patient On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Biological Mother'])[1]")
	public WebElement parentRelationToPatientOnCRPValue;

	/* CRP PARENT: First Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='First Name'])[1]")
	public WebElement parentFirstNameOnCRP;

	/* CRP PARENT: first Name On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_first_name'])[1]")
	public WebElement parentFirstNameOnCRPValue;

	/* CRP PARENT: First Initial of LAST Name On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='First Initial of LAST Name'])[1]")
	public WebElement parentFirstInitialOfLASTNameOnCRP;

	/* CRP PARENT: First Initial of LAST Name On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_last_initial'])[1]")
	public WebElement parentFirstInitialOfLASTNameOnCRPValue;

	/* CRP PARENT: Was this relative adopted? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Was this relative adopted?'])[1]")
	public WebElement parentWasThisRelativeAdoptedOnCRP;

	/* PARENT RP: Parent Was this relative adopted? On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[1]")
	public WebElement parentWasThisRelativeAdoptedOnCRPValue;

	/* CRP PARENT: Year of Birth On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Year of Birth'])[1]")
	public WebElement parentYearOfBirthOnCRP;

	/* CRP PARENT: Year of Birth On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_year_of_birth'])[1]")
	public WebElement parentYearOfBirthOnCRPValue;

	/* CRP PARENT: Vital Status On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Vital Status'])[1]")
	public WebElement parentVitalStatusOnCRP;

	/* PARENT RP: Parent Vital Status On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Deceased'])[1]")
	public WebElement parentVitalStatusOnCRPValue;

	/* CRP PARENT: Please provide the year of death or the age of death On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Please provide the year of death or the age of death'])[1]")
	public WebElement parentYearOfDeathOrAgeOfDeathOnCRP;

	/* CRP PARENT: Year of Death On CRP Page */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Year of Death'])[1]")
	public WebElement parentYearOfDeathOnCRP;

	/* CRP PARENT: Parent Year of Death On CRP Page */
	@FindBy(xpath = "(//input[@id='sp_formfield_year_of_death'])[1]")
	public WebElement parentYearOfDeathOnCRPValue;

	/* CRP PARENT: Please provide the year of death or the age of death On CRP Value */
	@FindBy(xpath = "(//span[contains(@class,'select2-chosen')])[4]")
	public WebElement parentYearOfDeathOrAgeOfDeathOnCRPValue;

	/* CRP PARENT: What was the cause of this relative death? On CRP Page */
	@FindBy(xpath = "//span[normalize-space()='What was the cause of this relative death?']")
	public WebElement parentCauseOfDeathOnCRP;

	/* CRP PARENT: What was the cause of this relative death? On CRP Page */
	@FindBy(xpath = "(//textarea[contains(@name,'cause_of_death')])[1]")
	public WebElement parentCauseOfDeathOnCRPValue;

	/* CRP PARENT: Sex assigned at birth on CRP On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Sex assigned at birth'])[1]")
	public WebElement parentSexAssignedAtBirthOnCRP;

	/* CRP PARENT: Sex assigned at birth On CRP Value On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Female')])[1]")
	public WebElement parentSexAssignedAtBirthOnCRPValue;

	/* CRP PARENT: Gender Identity On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Gender Identity'])[1]")
	public WebElement parentGenderIdentityOnCRP;

	/* CRP PARENT: Gender Identity On CRP Page Value */
	@FindBy(xpath = "(//span[contains(text(),'Female')])[2]")
	public WebElement parentGenderIdentityOnCRPValue;

	/* CRP PARENT: Is this relative a twin or part of a multiple birth?On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Is this relative a twin or part of a multiple birth?'])[1]")
	public WebElement parentTwinOnCRP;

	/* CRP PARENT: Is this relative a twin or part of a multiple birth?On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-7'])[1]")
	public WebElement parentTwinOnCRPValue;

	/* CRP PARENT: Type of births On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Type of birth'])[1]")
	public WebElement parentTypeOfBirthOnCRP;

	/* CRP PARENT: Type of births On CRP Page On CRP Page Value */
	@FindBy(xpath = "(//span[normalize-space()='Fraternal Twin'])[1]")
	public WebElement parentTypeOfBirthOnCRPValue;

	/* CRP PARENT: Has this relative ever had any miscarriages, stillbirths, induced abortions ... On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever had any miscarriages, stillbirths, induced abortions ...'])[1]")
	public WebElement parentMiscarriageStillBirthsOnCRP;

	/*CRP PARENT: Has this relative ever had any miscarriages, stillbirths, induced abortions ... On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-9'])[1]")
	public WebElement parentMiscarriageStillBirthsOnCRPValue;

	/* CRP PARENT: Total Number of Miscarriages On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Miscarriages'])[1]")
	public WebElement parentTotalNumberOfMiscarriagesOnCRP;

	/* CRP PARENT: Total Number of Miscarriages On CRP Page On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_miscarriages'])[1]")
	public WebElement parentTotalNumberOfMiscarriagesOnCRPValue;

	/* CRP PARENT: Total Number of Stillbirths On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Stillbirths'])[1]")
	public WebElement parentTotaNumberOfStillbirthsOnCRP;

	/* CRP PARENT: Total Number of Stillbirths On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_stillbirths'])[1]")
	public WebElement parentTotaNumberOfStillbirthsOnCRPValue;

	/* CRP PARENT: Total Number of Induced Abortions On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Total number of Induced Abortions'])[1]")
	public WebElement parentTotalNumberOfInducedAbortionsOnCRP;

	/* CRP PARENT: Total Number of Induced Abortions On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_induced_abortions'])[1]")
	public WebElement parentTotalNumberOfInducedAbortionsOnCRPValue;

	/* CRP PARENT: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page */
	@FindBy(xpath = "//div[@id='total_number_of_tubal_ectopic_molar_pregnancies']//div[contains(@class,'form-group ng-scope ng-isolate-scope form-group-has-focus')]//div[contains(@class,'ng-scope')]//span[2]")
	public WebElement parentTotalNumberOfTubalOnCRP;

	/* CRP PARENT: Total Number of Tubal/Ectopic/Molar Pregnancies On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_total_number_of_tubal_ectopic_molar_pregnancies'])[1]")
	public WebElement parentTotalNumberOfTubalOnCRPValue;

	/* CRP PARENT: Has this relative been diagnosed with a RASopathy On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative been diagnosed with a RASopathy?'])[1]")
	public WebElement parentDiagnosedWithRASopathyOnCRP;

	/* CRP PARENT: Has this relative been diagnosed with a RASopathy On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-10'])[1]")
	public WebElement parentDiagnosedWithRASopathyOnCRPValue;

	/* CRP PARENT: Has this relative ever been diagnosed with cancer? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with cancer?'])[1]")
	public WebElement parentDiagnosedWithCancerOnCRP;

	/* CRP PARENT: Has this relative ever been diagnosed with cancer? On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-11'])[1]")
	public WebElement parentDiagnosedWithCancerOnCRPValue;

	/* CRP PARENT: Has this relative ever been diagnosed with any of the medical conditions On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Has this relative ever been diagnosed with any medical conditions?'])[1]")
	public WebElement parentDiagnosedWithMedicalConditionsOnCRP;

	/* CRP PARENT: Has this relative ever been diagnosed with any of the medical conditions ... On CRP Page Value */
	@FindBy(xpath = "(//span[@id='select2-chosen-12'])[1]")
	public WebElement parentDiagnosedWithMedicalConditionsOnCRPValue;

	/* CRP PARENT: How many siblings does this relative have? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='How many siblings does this relative have?'])[1]")
	public WebElement parentHowManySiblingsOnCRP;

	/* CRP PARENT: How many siblings does this relative have? On CRP Page Value */
	@FindBy(xpath = "(//input[@id='sp_formfield_how_many_siblings'])[1]")
	public WebElement parentHowManySiblingsOnCRPValue;

	/* CRP PARENT: Is there anything else you would like us to know about this relative? On CRP Page */
	@FindBy(xpath = "(//span[normalize-space()='Is there anything else you would like us to know about this relative?'])[1]")
	public WebElement parentAdditionalInfoOnCRP;

	/* CRP PARENT: Is there anything else you would like us to know about this relative? On CRP Page Value */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_this_parent_grandparent'])[1]")
	public WebElement parentAdditionalInfoOnCRPValue;

	/* CRP PARENT: RASopathies Details On CRP Page */
	@FindBy(xpath = "(//a[@ng-if=\"::rl.type == 'REL'\"])[1]")
	public WebElement parentRASopathiesInfoOnCRPValue;

	/* CRP PARENT: Cancers Details On CRP Page */
	@FindBy(xpath = "(//a[@ng-if=\"::rl.type == 'REL'\"])[2]")
	public WebElement parentCancersInfoOnCRPValue;

	/* CRP PARENT: Medical Conditions Details On CRP Page */
	@FindBy(xpath = "(//a[@ng-if=\"::rl.type == 'REL'\"])[3]")
	public WebElement parentMedicalConditionsInfoOnCRPValue;

	/* CRP PARENT: Related family member details On CRP Page */
	@FindBy(xpath = "(//a[normalize-space()='Related family member details'])[1]")
	public WebElement parentRelatedFamilyMemberDetailsOnCRPValue;
}
