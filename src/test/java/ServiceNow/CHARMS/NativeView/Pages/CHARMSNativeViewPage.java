package ServiceNow.CHARMS.NativeView.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CHARMSNativeViewPage extends CommonUtils{

    /** Studio link */
	@FindBy (xpath = "//*[@id='bb0c4ba0c3120200ca27ff9c02d3ae7e']/div/div")
	public WebElement studioLink;
	
	/** Native View Studio CHARMS Referrals iframe */
	@FindBy (xpath = "/html/body/div[1]/section/editor-tabset/div/div/editor-tab-frame/iframe")
	public WebElement nativeViewStudioIframe;
	
	/** Native View Studio Family Member Details iframe */
	@FindBy (xpath = "/html/body/div[1]/section/editor-tabset/div/div[2]/editor-tab-frame/iframe")
	public WebElement nativeViewFamilyMemberDetailsIframe;
	
	/** Native View Studio FCSMS Form Access iframe */
	@FindBy (xpath = "/html/body/div[1]/section/editor-tabset/div/div[3]/editor-tab-frame/iframe")
	public WebElement nativeViewFCSMSformAccessIframe;
	
	/*
	 * ServiceNow Studio CHARMS Referrals
	 */
	/** CHARMS Referrals x button */
	@FindBy (xpath = "/html/body/div[1]/section/editor-tabset/ul/li[1]/a")
	public WebElement charmsReferralsXbutton;
	
	/** Applications search bar */
	@FindBy (xpath = "//input[@name='filter']")
	public WebElement applicationsSearchBar;
	
	/** Family Cohort Study link */
	@FindBy (linkText = "Family Cohort Study")
	public WebElement familyCohortStudyLink;
	
	/** CHARMS Referrals link */
	@FindBy (xpath = "/html/body/div[1]/nav/app-explorer/div[1]/ul/li[1]/ul/li[1]/ul/li[3]/a")
	public WebElement charmsReferralsLink;
	
	/** CHARMS Referrals Show List */
	@FindBy (xpath = "//*[@id='465ea163c3113000bac1addbdfba8f29']")	
	public WebElement charmsReferralsShowList;
	
	/** CHARMS Referrals show list search drop down */ 
	@FindBy (xpath = "//div[@class='input-group']/span/span/select")
	public WebElement charmsReferralsShowListSearchDropDown;
	
	/** CHARMS Referrals show list search text box */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")
	public WebElement charmsReferralsShowListSearchTextBox;
	
	/** CHARMS Referrals show list Test Account email address */
	@FindBy (xpath = "//td[contains(text(),'diegoju')]")
	public WebElement charmsReferralsShowListTestAccountEmailAddress;
	
	/** CHARMS Referrals show list test account check box */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr/td[1]/span/label")
	public WebElement charmsReferralsShowListTestAccountCheckBox;
	
	/** CHARMS Referrals show list delete drop down */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr/td[1]/span[2]/select")
	public WebElement charmsReferralsShowListDeleteDropDown;
	
	/** CHARMS Referrals show list confirmation pop up Delete button */
	@FindBy (xpath = "//button[@id='ok_button']")
	public WebElement charmsReferralsPopUpDeleteButton;
	
	
	/*
	 * Family Member Details 
	 */
	/** Family Member Details x button */
	@FindBy (xpath = "/html/body/div[1]/section/editor-tabset/ul/li[2]/a")
	public WebElement familyMemberDetailsXbutton;
	
	/** Family Member Details */
	@FindBy (xpath = "//*[@id='navigation-modules']/ul/li[1]/ul/li[1]/ul/li[7]/a")
	public WebElement familyMemberDetailsLink;
	
	/** Family Member Details Show List link */
	@FindBy (xpath = "//*[@id='465ea163c3113000bac1addbdfba8f29']")
	public WebElement familyMemberDetailsShowListLink;
	
	/** Family Member Details show list search drop down */
	@FindBy (xpath = "//div[@class='input-group']/span/span/select")
	public WebElement familyMemberDetailsShowListSearchDropDown;
	
	/** Family Member Details show list search text box */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")
	public WebElement familyMemberDetailsShowListSearchTextBox;
	
	/** Family Member Details show list check box */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr/td[1]/span/label")
	public WebElement familyMemberDetailsShowListCheckBox;
	
	/** Family Member Details show list delete drop down */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr/td[1]/span[2]/select")
	public WebElement familyMemberDetailsShowListDeleteDropDown;
	
	/** Family Member Details show list pop up delete button */
	@FindBy (xpath = "//button[@id='ok_button']")
	public WebElement familyMemberDetailsShowListPopUpDeleteButton;
	
	/*
	 * FCSMS Form Access
	 */
	
	/** FCSMS Form Access */
	@FindBy (xpath = "//*[@id='navigation-modules']/ul/li[1]/ul/li[1]/ul/li[9]/a")
	public WebElement fcsmsFormAccess;
	
	/** FCSMS Form Access Show List Link */
	@FindBy (xpath = "//*[@id='465ea163c3113000bac1addbdfba8f29']")
	public WebElement fcsmsFormAccessShowListLink;
	
	/** FCSMS Form Access Show List */
	@FindBy (xpath = "//div[@class='input-group']/span/span/select")
	public WebElement fcsmsFormAccessShowListDropDrown;
	
	/** FCSMS Form Access Show List search box */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[1]/div/span/div/div/input")
	public WebElement fcsmsFormAccessShowListSearchBox;
	
	/** FCSMS Form Access Show List Account check box */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/table/tbody/tr/td/div/table/tbody/tr/td[1]/span/label")
	public WebElement fcsmsFormAccessShowListAccountCheckBox;
	
	/** FCSMS Form Access Show List Delete drop down */
	@FindBy (xpath = "/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr/td[1]/span[2]/select")
	public WebElement fcsmsFormAccessShowListDeleteDropDown; 
	
	/** FCSMS Form Access Show List Delete button */
	@FindBy (xpath = "//button[@id='ok_button']")
	public WebElement fcsmsFormAccessShowListDeleteButton; 
	
	/*
	 * ----------------- BEGINNING OF Native View Elements for ALL pages
	 * -----------------
	 */

	/*
	 * Dashboard Link
	 */
	@FindBy(xpath = "//body/div[5]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[1]/div[1]/concourse-application-tree[1]/ul[1]/li[17]/ul[1]/li[5]/div[1]/div[1]/a[1]/div[1]/div[1]")
	public WebElement nativeViewDashboardLink;
	
	/*
	 * Native view frame
	 */
	@FindBy (xpath = "//iframe[@title='RAS Study | ServiceNow']")
	public WebElement nativeViewiFrameCHARMS;
	
	
	/*
	 * Native view Waiting for Eligibility Review button
	 */
	@FindBy (xpath = "//a[@rel='eligibility_status%3Dwaiting_for_eligibility']")
	public WebElement nativeViewWaitingForElegibilityReviewButton;
	
	
	/*
	 * Native view Family Member Details Preview Automated Test button
	 */
	@FindBy (xpath = "//a[@aria-label='Preview record: Automated Test']")
	public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedTestButton;
	
	/*
	 * Native view Family Member Details Preview Automated Test First Name text
	 */
	@FindBy (xpath = "/html/body/div[4]/div[3]/form/div/span/span/div[4]/div/div[1]/div[2]/div[2]/input[1]")
	public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText;
	
	/*
	 * Native view Family Member Details Preview Automated Test Last Name text
	 */
	@FindBy (xpath = "//body/div[@role='dialog']/div[@class='popover-content']/form[@name='x_naci_family_coho_family_history_details.do']/div/span[contains(@class,'tabs2_section tabs2_section_0 tabs2_section0')]/span[contains(@class,'section')]/div[@aria-label='Family Member Details form section']/div[@class='row']/div[2]/div[2]/div[2]/input[1]")
	public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText;
	
	/*
	 * Native view Family Member Details Preview Automated Test Contact Home Phone text
	 */
	@FindBy (xpath = "//body/div[@role='dialog']/div[@class='popover-content']/form[@name='x_naci_family_coho_family_history_details.do']/div/span[contains(@class,'tabs2_section tabs2_section_0 tabs2_section0')]/span[contains(@class,'section')]/div[@aria-label='Family Member Details form section']/div[@class='row']/div[2]/div[3]/div[2]/input[1]")
	public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText;
	
	/*
	 * Native view Family Member Details Preview Automated Test Open Record button
	 */
	@FindBy (xpath = "//a[normalize-space()='Open Record']")
	public WebElement nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton;
	
	/*
	 * Native view Family Member Details Automated Test Record 'Name' text 
	 */
	@FindBy (xpath = "//body/div[2]/form[1]/span[1]/span[1]/div[5]/div[2]/div[1]/div[2]/div[2]/input[1]")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordNameText;
	
	
	/*
	 * Native view Family Member Details Automated Test Record 'Waiting for eligibility' text 
	 */
	@FindBy (xpath = "(//option[@selected='SELECTED'])[2]")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordWaitingForEligibilityText;
	
	/*
	 * Native view Family Member Details Automated Test Record 'New Screener Received' text 
	 */
	@FindBy (xpath = "(//option[@selected='SELECTED'])[3]")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordNewScreenerReceivedText;
	
	/*
	 * Native view Family Member Details Automated Test Record 'May we have your permission to contact this relative?' text 
	 */
	@FindBy (xpath = "(//option[@selected='SELECTED'])[1]")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordMayWeHaveYourPermissionToContactThisRelativeYesText;
	

	/*
	 * Native view Family Member Details Automated Test Record Personal Information tab
	 */
	@FindBy (xpath = "//span[@class='tabs2_tab default-focus-outline tabs2_active']")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordRecordPersonalInformationTab;
	
	
	/*
	 * Native view Family Member Details Automated Test Record Submit for Eligibility Review button
	 */
	@FindBy (xpath = "//span[@class='navbar_ui_actions']//button[@value='ea5e9eacdb998810b86770c08c96196e'][normalize-space()='Submit for Eligibility Review']")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordSubmitForEligibilityReviewButton;
	
	
	/*
	 * Native view Family Member Details Automated Test Record Mark Eligible button
	 */
	@FindBy (xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@name,'not_important')][normalize-space()='Mark Eligible']")
	public WebElement nativeViewFamilyMemberDetailsAutomatedTestRecordMarkEligibleButton;
	
	
	/*
	 * ----------------- END OF Native View Elements for ALL pages -----------------
	 */
	
	
	public CHARMSNativeViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
