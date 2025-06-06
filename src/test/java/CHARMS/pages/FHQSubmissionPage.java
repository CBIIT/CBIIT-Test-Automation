package CHARMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.support.FindElementBy;

public class FHQSubmissionPage extends CommonUtils {
	public FHQSubmissionPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public WebElement dynamicPreviewButtonLocator(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[normalize-space()='" + text + "'])[1]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingAnchorTag(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='" + text + "'])["+ i +"]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingAnchorTag(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label=\"Preview record: " +text + "\"]"));
	}

	public WebElement dynamicPreviewButtonLocators(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: "+text+"'])[1]"));
	}

	/* Method to dynamically locate Partner element in FHQ participant page in Native View*/
	public WebElement dynamicLocatorForRelative(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: "+text+"'])[1]"));
	}

	/* Method to dynamically locate Added Relative element in FHQ participant page in Native View*/
	public WebElement dynamicLocatorForAddedRelative(String text1,String text2) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@aria-label,'" + text1 +"')]//tr//td[normalize-space()='"+text2+"']/parent::tr/td[3]"));
	}

	/* Method to dynamically locate Labels in Relative Information form section of FHQ participant page in Native View */
	public WebElement dynamicLocatorForParents(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[@aria-label=\"Parent(s) related list\"]//tr//td[normalize-space()='" + text +"']/parent::tr/td[2]"));
	}

	/* Dynamic Help Text Banner */
	public WebElement dynamicLocatorForHelpTextBanner(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//div[@class=\"help-tag-container\"]//span)[" + i + "]"));
	}

	/* Method to dynamically locate Labels in Relative Information form section of FHQ participant page in Native View */
	public WebElement dynamicLocatorForLabels() {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//label[@for='x_naci_family_coho_fhq_partner.is_this_the_participants_current_partner'])[1]"));
	}

	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View*/
	public WebElement dynamicLocatorTextBoxForReadOnlyInput1(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//textarea[@aria-label='" + text + "']"));
	}

	/* Method to dynamically locate elements in FHQ AND Questions in Native View */
	public WebElement dynamicLocatorContainsText(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
	}	

	/* Method to dynamically locate elements in FHQ AND Questions in Native View */
	public WebElement dynamicLocatorContainsText(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//*[contains(text(),'" + text + "')])["+i+"]"));
	}

	/* Method to dynamically locate TEXT BOXES with Values in FHQ FORMS in Native View */
	public WebElement dynamicLocatorTextBoxUsingInput(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@aria-label='" + text + "']"));
	}

	/* Method to dynamically locate Input TEXT BOXES with Values in FHQ FORMS in Native View */
	public WebElement dynamicLocatorInputTextBox(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@type=\"text\"][1])["+i+"]"));
	}	

	/* Method to dynamically locate TEXT BOXES with Values in FHQ FORMS in Native View */
	public WebElement dynamicLocatorTextBoxUsingInput(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@type=\"text\"])[" + i + "]"));
	}

	/* Method to dynamically locate TEXT BOXES with Values in FHQ FORMS in Native View */
	public WebElement dynamicLocatorTextBoxUsingInputId(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_fhq_partner." + text + "'])[1]"));
	}

	/* Method to dynamically locate TEXT BOXES ON FHQ FORMS */
	public WebElement dynamicLocatorForTextBox(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='" + text + "']"));
	}

	public WebElement dynamicLocatorInputForParent(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@id='x_naci_family_coho_fhq_parent." + text + "']"));
	}

	public WebElement dynamicLocatorInputForChild(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@id=\"x_naci_family_coho_fhq_child." + text + "\"]"));
	}

	public WebElement dynamicLocatorInputForSibling(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@id=\"x_naci_family_coho_fhq_siblings." + text + "\"]"));
	}

	public WebElement dynamicLocatorInputForAunt(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@id=\"x_naci_family_coho_fhq_aunts_nephew." + text + "\"]"));
	}

	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View*/
	public WebElement dynamicLocatorInputForPartner(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_fhq_partner." + text + "'])[1]"));
	}

	/* Method to dynamically locate Participant elements in FHQ */
	public WebElement dynamicLocatorForParticipant(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@aria-labelledby='label.x_naci_family_coho_fhq_" + text + ".participant'])[1]"));
	}

	/* Method to dynamically locate year_of_birth elements in FHQ */
	public WebElement dynamicLocatorForInputYearOfBirth(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@aria-labelledby='label.x_naci_family_coho_fhq_" + text + ".year_of_birth'])[1]"));
	}

	/* Method to dynamically locate total_number_of_miscarriages elements in FHQ */
	public WebElement dynamicLocatorForInputTotalMiscarriages(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@aria-labelledby='label.x_naci_family_coho_fhq_" + text + ".total_number_of_miscarriages'])[1]"));
	}

	/* Method to dynamically locate total_number_of_miscarriages elements in FHQ */
	public WebElement dynamicLocatorForInputTotalMiscarriage(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_fhq_" + text + ".miscarriages_less_than_20_weeks_of_pregnancy'])[1]"));
	}

	/* Method to dynamically locate total_number_of_stillbirths elements in FHQ */
	public WebElement dynamicLocatorForInputTotalStillbirths(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@aria-labelledby='label.x_naci_family_coho_fhq_" + text + ".total_number_of_stillbirths'])[1]"));
	}

	/* Method to dynamically locate total_number_of_stillbirths elements in FHQ */
	public WebElement dynamicLocatorForInputTotalStillbirth(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_fhq_" + text + ".stillbirths_more_than_20_weeks_of_pregnancy'])[1]"));
	}

	/* Method to dynamically locate how_many_children elements in FHQ in siblings form */
	public WebElement dynamicLocatorForInputTotalChildrenForAuntUncle(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_fhq_" + text + ".how_many_total_children_does_this_relative_have'])[1]"));
	}

	/* Method to dynamically locate how_many_siblings elements in FHQ */
	public WebElement dynamicLocatorForInputTotalSiblings(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@aria-labelledby='label.x_naci_family_coho_fhq_" + text + ".how_many_siblings'])[1]"));
	}

	/* Method to dynamically locate how_many_siblings elements in FHQ */
	public WebElement dynamicLocatorForInputTotalChildren(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@name='x_naci_family_coho_fhq_" + text + ".how_many_total_children_alive_and_deceased_has_child_had'])[1]"));
	}

	/* Method to dynamically locate how_many_children elements in FHQ in siblings form */
	public WebElement dynamicLocatorForInputTotalChildrenForSibling(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@name='x_naci_family_coho_fhq_" + text + ".total_num_children'])[1]"));
	}

	/* Method to dynamically locate benign_tumor elements in FHQ */
	public WebElement dynamicLocatorForInputBenignTumor(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_fhq_" + text + ".has_benign_tumor'])[1]"));
	}

	/* Method to dynamically locate is_there_anything_else_you_would_like_us_to_know_about_this_parent_grandparent elements in FHQ */
	public WebElement dynamicLocatorForInputAnythingElse(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_fhq_" + text + ".has_benign_tumor'])[1]"));
	}

	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View*/
	public WebElement dynamicLocatorSelectForPartner(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_fhq_partner." + text + "'])[1]"));
	}

	/* Method to dynamically locate Selected DROP down Value in NativeView For the Patient form */
	public WebElement dynamicLocatorForSelectedDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@aria-required=\"false\"])[" + i + "]"));
	}

	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View*/
	public WebElement dynamicLocatorTextBoxForReadOnlyInput(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='label-text'][normalize-space()='"+ text +"'])[1]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingSpanLabel(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@aria-label='Open record: "+text +"'])[1]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorForSelectedDropDownValue(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(@class,'select2-chosen')])[" + i +"]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingNormalizeSpace2(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='" + text + "']"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingNormalizeSpaceContain(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//span[@class=\"label-text\"][normalize-space()='" + text + "']"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorClassNormalizeSpace(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//span[@class='sp-field-label-padding ng-binding'][normalize-space()='" + text + "']"));
	}

	/* Method to dynamically locate ELEMENTS */
	public WebElement dynamicLocatorForDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='select2-chosen'][normalize-space()='-- None --'])[" + i +"]"));
	}

	/* Method to dynamically locate elements in NV FHQ */
	public WebElement dynamicLocatorNormalizeSpaceSpan(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@data-html='false'][normalize-space()='" + text + "'])["+i+"]"));
	}

	/* Method to dynamically locate ELEMENTS using contains In Drop down List */
	public WebElement dynamicLocator2ForDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(@class,'select2-chosen')])[" + i +"]"));
	}

	/* Method to dynamically locate ELEMENTS In Drop down List  */
	public WebElement dynamicLocator3ForDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@id='select2-chosen-" + i + "'])[1]"));
	}

	/* Method to dynamically locate Relative tabs element in FHQ participant page in Native View */
	public WebElement dynamicLocatorForRelativeTab(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//span["+i +"]//span[1]//span[2]"));
	}

	/* Method to dynamically locate Relative tabs element in FHQ participant page in Native View */
	public WebElement dynamicLocatorForFamilyTab(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@role='tab'])["+i +"]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingNormalizeSpace(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[normalize-space()='" + text + "']"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingNormalizeSpace1(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//*[normalize-space()='" + text + "'])[1]"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingContainsNormalizeSpace(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//*[normalize-space()='" + text + "'])["+i+"]"));	
	}

	/* Method to dynamically locate titles using contains in FHQ */
	public WebElement dynamicLocatorUsingTitle(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(@title,'" + text + "')]"));
	}

	/* Method to dynamically locate TEXT BOXES ON FHQ FORMS */
	public WebElement dynamicLocatorTextBox(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[@name='" + text + "']"));
	}

	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorForMRVSTableValue(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//td[@class='ng-binding ng-scope'])[" + i +"]"));
	}

	/* Method to dynamically locate elements in FHQ for Buttons using text */
	public WebElement dynamicLocatorForButtonUsingText(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//td[@data-th='" + text + "']"));
	}
	/* Method to dynamically locate Relation to Patient in GrandParents List View Page */
	public WebElement dynamicLocatorForGrandparents(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//td[@data-th=\"Relation to Patient\"]/span[contains(.,\""+ text +"\")]"));
	}

	/* Method to dynamically locate Banners In FHQ */
	public WebElement dynamicLocatorForBanner(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//th[contains(@scope,'col')][normalize-space()='" + text + "'])["+i+"]"));
	}

	/* Method to dynamically locate TEXT BOXES ON FHQ FORMS*/	
	public WebElement dynamicLocatorElementInTable(int int1, int int2) {
		return WebDriverUtils.webDriver.findElement(By.cssSelector("tbody tr:nth-child("+ int1 +") td:nth-child(" + int2 +")"));	
	}

	/* Method to dynamically locate Button elements in FHQ */
	public WebElement dynamicLocatorForButton(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//button[@aria-label='" + text + "']"));
	}

	@FindBy(xpath = "(//input[@id='x_naci_family_coho_fhq_patient_table_header_search_control'])[1]")
	public WebElement firstNameOfParticipantInListView;

	@FindBy(xpath = "(//button[@class='list_header_search_toggle icon-search btn btn-icon table-btn-lg'])[1]")
	public WebElement participantSearchColumnButton;

	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fhq_patient.fhq_study'])[1]")
	public WebElement fhqStudyValue;

	@FindBy(xpath = "//button[@id=\"user-info-dropdown\"]")
	public WebElement fhqUserInfoDropDown;

	@FindBy(xpath = "(//p[contains(@class,'text')])[4]")
	public WebElement noteMyRasLandingPage;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement fHQFieldDropDown;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[2]")
	public WebElement fHQFieldDropDown1;

	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fhq_patient.participant'])[1]")
	public WebElement participantValue;

	@FindBy(xpath = "(//*[contains(text(),\"Is there anything else you would like us to know about this participant?\")])[1]")
	public static WebElement additionalInformation;

	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fhq_patient.is_there_anything_else_you_would_like_us_to_know_about_this_patient'])[1]")
	public static WebElement additionalInformationAdded;

	@FindBy(xpath = "(//span[@class='icon-arrow-down'])[1]")
	public static WebElement  nextRecordArrow;;

	@FindBy(xpath = "//a[@aria-label='Review Family History Questionnaire']//span[contains(text(),'Family History Questionnaire')]")
	public static WebElement familyHistoryQuestionnaireLink;

	/* MRVS PAGE:Save Row Button */
	@FindBy(xpath = "(//button[@class='btn btn-primary ng-binding'])[1]")
	public static WebElement addRowSaveButton;

	/* MRVS PAGE:Save Row Button */
	@FindBy(xpath = "(//th[@class='text-nowrap ng-binding ng-scope'][normalize-space()='First Initial of LAST Name'])[3]")
	public static WebElement firstInitalOfLastNameSibling;

	/* Family Cohort Study Management System: RASopathies */
	@FindBy(xpath = "(//div[@class='h1 text-center text-white ng-binding'])[1]")
	public WebElement familyCohortStudyManagementSystemLabel;

	/* Family Cohort Study Management System: RASopathies */
	@FindBy(xpath = "(//span[@class='label-text'][contains(text(),'Please describe how the participant is related to ')])[1]")
	public WebElement partnerRelationToParticipant;

	/* Which of the following individuals is a biological parent of this child? Selected Dropdown*/
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_other_biological_parent_partner'])[1]")
	public WebElement biologicalParentOfThisChildDropdown;

	/* RELATION RP:Short Description Information Banner on a new RP */
	@FindBy(xpath = "//span[contains(text(),'We would like to ask some questions about Siblings')]")
	public WebElement siblingInformationBanner;

	/* Other Biological Parent Value */
	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fhq_child.other_biological_parent_partner'])[1]")
	public WebElement OtherBiologicalParent;

	/* Which of the following individuals is a biological parent of this child? Selected Dropdown Value */
	@FindBy(xpath = "(//ul[@id='select2-results-23'])[1]/li[1]")
	public WebElement biologicalParentOfThisChildDropdownValue;

	@FindBy(xpath ="(//h2[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'])[1]")
	public WebElement parentTypeHeading;

	@FindBy(xpath = "(//span[contains(@class,'ng-binding')][contains(text(),'Please write the first name of the partner(s) with')])[2]")
	public WebElement partnerHeading2;

	/* LIST VIEW Page: New Link on the LIST VIEW Page */
	@FindBy(xpath = "//button[@name=\"new\"]")
	public WebElement newButtonLinkOnListView;

	/* LIST VIEW Page:Home Button */
	@FindBy(xpath = "(//a[normalize-space()='FHQ Home'])[1]")
	public WebElement homeButton;

	/* FHQ Submitted Page:FHQ Submitted Page text area */
	@FindBy(xpath = "(//textarea[@id='textArea1'])[1]")
	public WebElement fhqSubmittedPageTextArea;

	/* LIST VIEW Page: The blue highlighted rows represent the incompleted family records on LIST VIEW Page */
	@FindBy(xpath = "(//div[contains(text(),'The blue highlighted rows represent the incomplete')])[1]")
	public WebElement rowsDetailsOnListView;

	/* RELATION RP:Short Description Information Banner on a new RP */
	@FindBy(xpath = "(//strong[contains(text(),'Please provide what information you can about this')])[1]")
	public WebElement shortDescriptionInformationBanner;

	/* PARTNER RP: Is this your (the participant's) current partner? Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_is_this_the_participants_current_partner\"]//span[2]")
	public WebElement isThisYourCurrentPartnerLabel;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//span[contains(@title,'Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.')][contains(text(),'Examples: select 1995 if you know the date is in t')])[1]")
	public WebElement yearOfBirthdateBanner;

	/* PARTNER:Please describe how the participant is related TextBox */
	@FindBy(xpath = "//textarea[contains(@name,\"additional_information\")]")
	public WebElement participantRelatedToThisPartnerTextBox;

	/* PARTNER:Please describe how the participant is related TextBox */
	@FindBy(xpath = "(//textarea[@role='textbox'])[1]")
	public WebElement addOtherInformationForRelativeTextBox;

	/*You are currently filling out information for the participants Banner */
	@FindBy(xpath = "(//p[@class='ng-binding'])[1]")
	public WebElement relativeFillingInfoBanner;

	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each R\")])[1]")
	public WebElement parentDiagnosedWithRasopathyAddButtonInfo;

	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each R\")])[1]")
	public WebElement diagnosedWithRasopathyAddButtonInfo;

	/* Please select the 'Add' button below to add each cancer this parent has had. Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each c\")])[1]")
	public WebElement parentDiagnosedWithCancerAddButtonInfo;

	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each c\")])[1]")
	public WebElement diagnosedWithCancerAddButtonInfo;

	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each b\")])[1]")
	public WebElement diagnosedWithBenignTumorAddButtonInfo;

	/* Children Help Text Banner */
	@FindBy(xpath = "(//div[@class=\"help-tag-container\"]//span)[3]")
	public WebElement childrenHelpTextBanner;

	/* Please select the 'Add' button below to add each medical condition this parent has had. Label*/
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each m\")])[1]")
	public WebElement parentDiagnosedWithMedicalConditionsAddButtonInfo;

	/* Please select the 'Add' button below to add each sibling this parent has. Label */
	@FindBy(xpath = "//span[@title='Please include all full and half siblings, living and deceased. Please do not include miscarriages, or stillbirths. These will be collected elsewhere.']")
	public WebElement siblingBanner;

	/* Please select the 'Add' button below to add each sibling this parent has. Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each s\")])[1]")
	public WebElement siblingAddButtonInfo;

	/* Please select the 'Add' button below to add each child this person has.Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each c\")])[2]")
	public WebElement childAddButtonInfo;

	/* Please select the 'Add' button below to add each child this person has.Label */
	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each C\")])[1]")
	public WebElement childAddButtonInfo1;

	/* RASopathy Banner */
	@FindBy(xpath = "//span[@class=\"ng-binding\"][normalize-space()=\"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)\"]")
	public WebElement childDiagnosedWithRasopathyInformation;

	/* RASopathy Banner */
	@FindBy(xpath = "//span[@class=\"ng-binding\"][normalize-space()=\"Examples of RASopathies include Noonan Syndrome, Costello Syndrome, Legius Syndrome, Capillary Arteriovenous Malformation Syndrome, Cardiofaciocutaneous Syndrome, or Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)\"]")
	public WebElement diagnosedWithRasopathyInformation;

	/* Is there anything else you would like us to know about the participant?TextBox */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_this_patient'])[1]")
	public WebElement anythingElseAboutThisParticipantTextBox;

	/* Medical conditions.Banner */
	@FindBy(xpath = "(//span[contains(@ng-bind,'::field.help_text')][normalize-space()='Congenital heart disease, developmental disorder, uncommon physical features, other medical conditions.'])[1]")
	public WebElement diagnosedWithMedicalConditionsBanner;

	@FindBy(xpath ="(//span[contains(text(),'Please enter one record per each family member for')])[1]")
	public WebElement auntUncleInformationBanner;

	@FindBy(xpath ="//a[contains(text(),\"Relation to Patient in (Biological Mother, Biologi\")]")
	public WebElement relationToPatientLink;

	@FindBy(xpath ="(//a[contains(text(),\"Relation to Patient in (Paternal grandfather (Fath\")])[1]")
	public WebElement relationToPatientGrandParentLink;

	@FindBy(xpath ="//div[@class=\"form-group m-b-xs ng-scope\"]//p//em")
	public WebElement submitFormHelpTextBanner;	

	@FindBy(xpath ="(//button[normalize-space()='Complete'])[1]")
	public WebElement completeButton;

	/* ************* NATIVE VIEW * ************* */
	/* NV: Native View Side Door UserName */
	@FindBy(xpath = "(//input[@id='user_name'])[1]")
	public WebElement nVSideDoorUserName;

	/* NV: Native View Side Door Password */
	@FindBy(xpath = "(//input[@id='user_password'])[1]")
	public WebElement nVSideDoorPassword;

	/* NV: Native View Side Door LogIn Button */
	@FindBy(xpath = "//button[@id='sysverb_login']")
	public WebElement nVSideDoorLogInButton;

	/* iFrame */
	@FindElementBy(css = "iframe[title='Main Content']")
	public static WebElement nativeViewiFrame;

	/* NV: FHQ Participant in CHARMS Partner Form  */
	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fhq_partner.participant'])[1]")
	public static  WebElement nVPartnerParticipantValue;
	
	/* NV: FHQ Parent AnyThing Else Value in Parents Form  */
	@FindBy(xpath = "(//textarea[@id='x_naci_family_coho_fhq_parent.is_there_anything_else_you_would_like_us_to_know_about_this_parent_grandparent'])[1]")
	public static  WebElement nVParentAnythingElseValue;

	/* NV: FHQ Parent AnyThing Else Value in Son/Daughter Form  */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fhq_child.is_there_anything_else_you_would_like_us_to_know_about_child'])[1]")
	public static  WebElement nVChildAnythingElseValue;

	/* NV: FHQ Parent AnyThing Else Value in Sibling Form  */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fhq_siblings.is_there_anything_else_you_would_like_us_to_know_about_sibling'])[1]")
	public static  WebElement nVSiblingAnythingElseValue;

	/* NV: FHQ Parent AnyThing Else Value in Aunt/Uncle Form  */
	@FindBy(xpath = "(//textarea[@id='x_naci_family_coho_fhq_aunts_nephew.is_there_anything_else_you_would_like_us_to_know_about_aunt_uncle'])[1]")
	public static  WebElement nVAuntUncleAnythingElseValue;
}