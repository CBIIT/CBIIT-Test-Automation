package ServiceNow.CHARMS.FanconiSurvey.playwright.Pages;

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
	/* Method to dynamically locate Relative tabs element in FHQ participant page in Native View */
	public WebElement dynamicLocatorForRelativeTab(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//span["+i +"]//span[1]//span[2]"));			
	}	
	/* Method to dynamically locate Partner element in FHQ participant page in Native View*/
	public WebElement dynamicLocatorForPartner(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@aria-label,'FHQ Partners related list')]//tr//td[normalize-space()='"+text+"']/parent::tr/td[2]"));
	}		
	/* Method to dynamically locate Added Relative element in FHQ participant page in Native View*/
	public WebElement dynamicLocatorForAddedRelative(String text1,String text2) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@aria-label,'" + text1 +"')]//tr//td[normalize-space()='"+text2+"']/parent::tr/td[3]"));
	}
	/* Method to dynamically locate Added Relative element in FHQ participant page in Native View */
	public WebElement dynamicLocatorForAddedRelatives(String text1,String text2) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//td[@class='vt'][normalize-space()='" + text1 +"']/parent::tr//td[@class='vt'][normalize-space()='"+text2+"']/parent::tr/td[3]"));
	}
	/* Method to dynamically locate GrandParents element in FHQ participant page in Native View */
	public WebElement dynamicLocatorForGrandParent(String text1,String text2) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//div[@aria-label=\"Grandparent(s) related list\"]//table[@role=\"presentation\"])[1]//tr//td[normalize-space()='" +text1 +"']/parent::tr/td[3][normalize-space()='" + text2 +"']"));
	}	
	/* Method to dynamically locate Labels in Relative Information form section of FHQ participant page in Native View */
	public WebElement dynamicLocatorForLabels() {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[@aria-label=\"Relative Information form section\"]//label"));
	}	
	/* Method to dynamically locate Labels in Relative Information form section of FHQ participant page in Native View */
	public WebElement dynamicLocatorForParents(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[@aria-label=\"Parent(s) related list\"]//tr//td[normalize-space()='" + text +"']/parent::tr/td[2]"));
	}
	/* Method to dynamically locate Relation to Patient in GrandParents List View Page */
	public WebElement dynamicLocatorForGrandparents(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//td[@data-th=\"Relation to Patient\"]/span[contains(.,\""+ text +"\")]"));
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
	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View */
	public WebElement dynamicLocatorTextBoxUsingValue(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@value='" + text + "']"));
	}
	/* Method to dynamically locate Selected DROP down Value in NativeView For the Patient form */
	public WebElement dynamicLocatorForSelectedDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@aria-required=\"false\"])[" + i + "]"));
	}	
	/* Dynamic Help Text Banner */
	public WebElement dynamicLocatorForHelpTextBanner(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//div[@class=\"help-tag-container\"]//span)[" + i + "]"));
	}
	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View*/
	public WebElement dynamicLocatorTextBoxForReadOnlyInput(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//select[@aria-label='" + text + "']"));
	}
	/* Method to dynamically locate TEXT BOXES with Values ON FHQ FORMS and Native View*/
	public WebElement dynamicLocatorTextBoxForReadOnlyInput1(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//textarea[@aria-label='" + text + "']"));
	}
	/* Use This Method To Dynamically Locate Record Buttons On */
	public WebElement dynamicFHQRelativePreviewButtonLocator(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: " + text + "'])[1]"));
	}
	/* Use This Method To Dynamically Locate Record Buttons On */
	public WebElement dynamicFHQPatientPreviewButtonLocator(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: " + text + "'])[1]"));
	}
	public WebElement dynamicLocatorForSelectedDropDown(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//select[@id='" + text + "']"));
	}	
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingAnchorTag(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='" + text + "'])["+ i +"]"));
	}	
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingAnchorTag1(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label='Preview record: " + text + "'])["+ i +"]"));
	}	
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingAnchorTag2(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[@aria-label=\"" + text +" - Open record: \"])[" + i +"]"));
	}
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingSpanLabel(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@aria-label='Open record: "+text +"'])[1]"));
	}
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorForMRVSTableValue(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//td[@class='ng-binding ng-scope'])[" + i +"]"));
	}
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorForSelectedDropDownValue(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(@class,'select2-chosen')])[" + i +"]"));
	}
	/* Method to dynamically locate elements in FHQ for Buttons using text */
	public WebElement dynamicLocatorForButtonUsingText(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//td[@data-th='" + text + "']"));
	}
	/* Method to dynamically locate elements in FHQ for Buttons using text */
	public WebElement dynamicLocatorForButtonUsingText(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//td[@data-th='" + text + "'])["+i+"]"));
	}
	/* Method to dynamically locate elements in FHQ  USING TEXT */
	public WebElement dynamicLocatorUsingText(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']"));
	}
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingNormalizeSpace(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[normalize-space()='" + text + "']"));
	}
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorClassNormalizeSpace(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//span[@class='sp-field-label-padding ng-binding'][normalize-space()='" + text + "']"));
	}
	/* Method to dynamically locate elements in FHQ */
	public WebElement dynamicLocatorUsingContainsNormalizeSpace(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//*[normalize-space()='" + text + "'])["+i+"]"));	
	}
	/* Method to dynamically locate elements in NV FHQ */
	public WebElement dynamicLocatorNormalizeSpaceSpan(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@data-html='false'][normalize-space()='" + text + "'])["+i+"]"));	
	}
	/* Method to dynamically locate Button elements in FHQ */
	public WebElement dynamicLocatorForButton(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//button[@aria-label='" + text + "']"));
	}
	/* Method to dynamically locate Button elements in FHQ */	
	public WebElement dynamicLocatorByNameForButton(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//button[@name='" + text + "']"));
	}
	/* Method to dynamically locate titles using contains in FHQ */
	public WebElement dynamicLocatorUsingTitle(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(@title,'" + text + "')]"));
	}
	/* Method to dynamically locate titles in FHQ */
	public WebElement dynamicLocatorForTitle(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[@title='" + text + "')]"));
	}
	/* Method to dynamically locate Banners In FHQ */
	public WebElement dynamicLocatorForBanner(String text, int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//th[contains(@scope,'col')][normalize-space()='" + text + "'])["+i+"]"));
	}
	/* Method to dynamically locate TEXT BOXES ON FHQ FORMS */
	public WebElement dynamicLocatorForTextBox(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='" + text + "']"));	
	}
	/* Method to dynamically locate TEXT BOXES ON FHQ FORMS */
	public WebElement dynamicLocatorTextBox(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[@name='" + text + "']"));	
	}
	/* Method to dynamically locate ELEMENTS */
	public WebElement dynamicLocatorForDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='select2-chosen'][normalize-space()='-- None --'])[" + i +"]"));
	}
	/* Method to dynamically locate ELEMENTS using contains In Drop down List */
	public WebElement dynamicLocator2ForDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(@class,'select2-chosen')])[" + i +"]"));
	}
	/* Method to dynamically locate ELEMENTS In Drop down List  */
	public WebElement dynamicLocator3ForDropDown(int i) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@id='select2-chosen-" + i + "'])[1]"));
	}
	/* Method to dynamically locate TEXT BOXES ON FHQ FORMS*/	
	public WebElement dynamicLocatorElementInTable(int int1, int int2) {
		return WebDriverUtils.webDriver.findElement(By.cssSelector("tbody tr:nth-child("+ int1 +") td:nth-child(" + int2 +")"));	
	}
	/* Note: */
	@FindBy(xpath = "(//p[contains(@class,'text')])[4]")
	public WebElement noteMyRasLandingPage;

	/* RELATION RP:Form: Any Field DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement fHQFieldDropDown;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[2]")
	public WebElement fHQFieldDropDown1;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[3]")
	public WebElement fHQFieldDropDown2;

	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[4]")
	public WebElement fHQFieldDropDown3;

	@FindBy(xpath = "(//*[contains(text(),\"Is this your (the participant's) current partner\")])[1]")
	public static WebElement currentPartnerLabel;

	@FindBy(xpath = "//input[@id=\"sys_display.x_naci_family_coho_fhq_child.other_biological_parent_partner\"]")
	public static WebElement otherBiologicalParentTextBox;

	@FindBy(xpath = "(//*[contains(text(),\"Is there anything else you would like us to know about this participant?\")])[1]")
	public static WebElement additionalInformation;

	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fhq_patient.is_there_anything_else_you_would_like_us_to_know_about_this_patient'])[1]")
	public static WebElement additionalInformationAdded;

	@FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_fhq_patient.participant'])[1]")
	public static WebElement participantName;

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

	/* Other Biological Parent Dropdown*/
	@FindBy(xpath = "(//a[@class='select2-choice select2-default form-control'])[4]")
	public WebElement otherBiologicalParentDropdown;

	/* RELATION RP:Short Description Information Banner on a new RP */
	@FindBy(xpath = "//span[contains(text(),'We would like to ask some questions about Siblings')]")
	public WebElement siblingInformationBanner;

	/* Other Biological Parent Dropdown Value */
	@FindBy(xpath = "(//div[@id='select2-result-label-37'])[1]")
	public WebElement otherBiologicalParentDropdownValue;

	@FindBy(xpath ="(//h2[@class='h2 m-t-none m-b-sm font-thin ng-binding ng-scope'])[1]")
	public WebElement parentTypeHeading;

	/* MRVS PAGE:First Initial of LAST name DropDown */
	@FindBy(xpath = "(//span[@class='select2-chosen'][normalize-space()='-- None --'])[1]")
	public WebElement addRowChildFirstInitialOfLastNameDropDown;

	@FindBy(xpath = "(//span[contains(@class,'ng-binding')][contains(text(),'Please write the first name of the partner(s) with')])[2]")
	public WebElement partnerHeading2;

	/* LIST VIEW Page: New Link on the LIST VIEW Page */
	@FindBy(xpath = "//button[@name=\"new\"]")
	public WebElement newButtonLinkOnListView;

	/* LIST VIEW Page:Home Button */
	@FindBy(xpath = "(//a[normalize-space()='FHQ Home'])[1]")
	public WebElement homeButton;

	/* LIST VIEW Page: The blue highlighted rows represent the incompleted family records on LIST VIEW Page */
	@FindBy(xpath = "(//div[contains(text(),'The blue highlighted rows represent the incomplete')])[1]")
	public WebElement rowsDetailsOnListView;

	/* RELATION RP:Short Description Information Banner on a new RP */
	@FindBy(xpath = "(//strong[contains(text(),'Please provide what information you can about this')])[1]")
	public WebElement shortDescriptionInformationBanner;

	/* PARTNER RP: Is this your (the participant's) current partner? Label */
	@FindBy(xpath = "//label[@for=\"sp_formfield_is_this_the_participants_current_partner\"]//span[2]")
	public WebElement isThisYourCurrentPartnerLabel;

	/* Prelim Record */	
	@FindBy(xpath = "//tr[@class='ng-scope prelim_check']//td[1]")
	public WebElement dynamicLocatorForPrelimRecord;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "//label[@for='sp_formfield_year_benign_tumor']//div[@ng-if='field.expand_help']//div[1]")
	public WebElement yearOfBirthdateLabelBanner;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//span[contains(@title,'Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.')][contains(text(),'Examples: select 1995 if you know the date is in t')])[1]")
	public WebElement yearOfBirthdateBanner;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//span[contains(@title,'Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.')][contains(text(),'Examples: select 1995 if you know the date is in t')])[1]")
	public WebElement yearOfBirthdateLabelBanner1;

	/* RELATION RP:Year Of Birth Label */
	@FindBy(xpath = "(//span[contains(@title,'An estimated date is preferred over ')])[1]")
	public WebElement yearOfBirthdateLabelBanner2;

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

	@FindBy(xpath = "(//label[contains(text(),\"Please select the 'Add' button below to add each m\")])[1]")
	public WebElement diagnosedWithMedicalConditionsAddButtonInfo;

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

	/* Sibling Banner */
	@FindBy(xpath = "(//span[@class='ng-binding'][normalize-space()='Please include all full and half siblings, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere.'])[1]")
	public WebElement howManySiblingsThisRelativeHaveBanner;

	/* Is there anything else you would like us to know about the participant?TextBox */
	@FindBy(xpath = "(//textarea[@id='sp_formfield_is_there_anything_else_you_would_like_us_to_know_about_this_patient'])[1]")
	public WebElement anythingElseAboutThisParticipantTextBox;

	/* Medical conditions.Banner */
	@FindBy(xpath = "(//span[contains(@ng-bind,'::field.help_text')][normalize-space()='Congenital heart disease, developmental disorder, uncommon physical features, other medical conditions.'])[1]")
	public WebElement diagnosedWithMedicalConditionsBanner;

	@FindBy(xpath = "(//td[@ng-if='!field._loadingData'][normalize-space()='No data to display'])[4]")
	public WebElement siblingNoDataToDisplay ;

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

	/* NV: FHQ Patients Menu Link In NV Navigator */
	@FindBy(css = "a[aria-label='FHQ Patients']")
	public  WebElement nVFHQFilterMatchLink;

	/* NV: Native View FHQ Patient Link */
	@FindBy(xpath = "(//a[normalize-space()='SOnika'])[1]")
	public WebElement nVFHQSonikaLink;

	/* iFrame */
	@FindElementBy(css = "iframe[title='Main Content']")
	public static WebElement nativeViewiFrame;

	/* NV: FHQ CHARMS Referrals List view-> iFrame */
	@FindBy(xpath = "//iframe[@id='gsft_main']")
	public WebElement nVListViewiFrame;

	/* NV: FHQ Application Menu Link In NV Navigator */
	@FindBy(xpath = "//span[normalize-space()=\"FHQ Application Menu\"]")
	public static WebElement nVFHQApplicationMenuLink;

	/* NV: FHQ Application Menu Link-->Patients Link In NV Navigator */   //Check if needed to be deleted
	@FindBy(xpath = "//span[normalize-space()=\"FHQ Application Menu\"]")
	public static WebElement nVFHQPatientUnderApplicationMenuLink;

	/* NV: FHQ Participant in CHARMS Partner Form  */
	@FindBy(xpath = "//label[@for='sys_display.x_naci_family_coho_fhq_partner.participant']")
	public WebElement nVPartnerParticipantLabel;

	/* NV: FHQ Participant in CHARMS Partner Form  */
	@FindBy(xpath = "(//input[@aria-labelledby='label.x_naci_family_coho_fhq_partner.participant'])[1]")
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
	/* Method to dynamically locate how_many_children elements in FHQ in siblings form */
	public WebElement dynamicLocatorForInputTotalChildrenForAuntUncle(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_fhq_" + text + ".how_many_total_children_does_this_relative_have'])[1]"));
	}
	/* Method to dynamically locate benign_tumor elements in FHQ */
	public WebElement dynamicLocatorForInputBenignTumor(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_fhq_" + text + ".has_benign_tumor'])[1]"));
	}
	/* Method to dynamically locate is_there_anything_else_you_would_like_us_to_know_about_this_parent_grandparent elements in FHQ */
	public WebElement dynamicLocatorForInputAnythingElse(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_fhq_" + text + ".has_benign_tumor'])[1]"));
	}
}