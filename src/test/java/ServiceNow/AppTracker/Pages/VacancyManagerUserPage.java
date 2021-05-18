package ServiceNow.AppTracker.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class VacancyManagerUserPage extends CommonUtils {

	/** Vacancy Dashboard Page Header **/
	@FindBy(xpath = "//h1[contains(text(),'Vacancy Dashboard')]")
	public WebElement vacancyDashboardPageHeader;

	/** Create Vacancy Button **/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement createVacancyButton;

	/** Vacancy Page Vacancy Title Input Field **/
	@FindBy(xpath = "//input[@id='BasicInfo_title']")
	public WebElement vacancyTitleField;

	/** Vacancy Page Vacancy Description Input Field **/
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	public WebElement vacancyDescriptionField;

	/** Vacancy Description Header **/
	@FindBy(xpath = "//h3[contains(text(),'Basic Vacancy Information')]")
	public WebElement vacancyHeader;

	/** Recommendation Option **/
	@FindBy(xpath = "//div[@class='ant-slider-step']")
	public WebElement lettersOfRecommendation;

	/** Basic Vacancy Information Save Button **/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary wider-button']")
	public WebElement basicVacancyInformationSaveButton;

	/** Review and Finalize Page verify number of letters of recommendation **/
	@FindBy(xpath = "//li[@class='ListItemTrue' and text()='2']")
	public WebElement numberOfLettersOfRecommendation;

	/** List of Vacancy Sections **/
	@FindBy(css = "div.ant-steps-item")
	public List<WebElement> listOfSections;

	/** Vacancy Committee Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item ant-steps-item-wait'][2]")
	public WebElement vacancyCommitteeSection;

	/** Vacancy Committee Section Header **/
	@FindBy(xpath = "//h3[text()='Vacancy Committee']")
	public WebElement vacancyCommitteeSectionHeader;

	/** Basic Vacancy Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item ant-steps-item-process ant-steps-item-active']")
	public WebElement basicVacancySection;

	/** Mandatory Statements Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item ant-steps-item-wait'][1]")
	public WebElement mandatoryStatementsSection;

	/** Mandatory Statements Section Equal Opportunity Employer text verify **/
	@FindBy(xpath = "//p[contains(text(), 'Equal Opportunity Employer')]")
	public WebElement equalOpportunityEmployerInMandatorySection;

	/** Mandatory Statements Section text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_equalOpportunityEmployerText']//p")
	public WebElement textOfSectionEqualOpportunityEmployer;

	/**
	 * Mandatory Statements Section Standards of Conduct/Financial Disclosure text
	 * verify
	 **/
	@FindBy(xpath = "//p[contains(text(), 'Standards of Conduct/Financial Disclosure')]")
	public WebElement standardsOfConductFinancialDisclosureInMandatorySection;

	/** Mandatory Statements Section Foreign Education text verify **/
	@FindBy(xpath = "//p[contains(text(), 'Foreign Education')]")
	public WebElement foreignEducationInMandatorySection;

	/** Mandatory Statements Section Reasonable Accommodation text verify **/
	@FindBy(xpath = "//p[contains(text(), 'Reasonable Accommodation')]")
	public WebElement reasonableAccommodationInMandatorySection;

	/** Mandatory Statements Foreign Education text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_foreignEducationText']//p" )
	public WebElement textOfSectionForeignEducationText;

	/** Mandatory Statements Section Standards of Conduct text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_standardsOfConductText']//p")
	public WebElement textOfSectionStandardsOfConductText;

	/** Mandatory Statements Section Reasonable Accommodation text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_reasonableAccomodationText']//p")
	public WebElement textOfSectionReasonableAccommodationText;

	/** Email Templates Committee Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item ant-steps-item-wait'][3]")
	public WebElement emailTamplatesSection;

	/** Review Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item ant-steps-item-wait'][4]")
	public WebElement reviewSection;

	/** Basic Vacancy tab pre-flight vacancies **/
	@FindBy(xpath = "(//p[@class='vacancy-desc'])[1]")
	public WebElement preFlightVacanciesTab;

	/** Basic Vacancy tab pre-flight vacancies ALL sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'All')])[1]")
	public WebElement allPreFlightSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab pre-flight vacancies Draft sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Draft')]")
	public WebElement draftSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab pre-flight vacancies Finalized sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Finalized')]")
	public WebElement finalizedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab live vacancies ALL sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'All')])[2]")
	public WebElement allLiveSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab live vacancies **/
	@FindBy(xpath = "(//p[@class='vacancy-desc'])[2]")
	public WebElement liveVacanciesTab;

	/** Basic Vacancy tab live vacancies Live sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Live')]")
	public WebElement liveSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab live vacancies Extended sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Extended')]")
	public WebElement extendedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies **/
	@FindBy(xpath = "(//p[@class='vacancy-desc'])[3]")
	public WebElement closedVacanciesTab;

	/** Basic Vacancy tab closed vacancies ALL sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'All')])[3]")
	public WebElement allClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Closed sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Closed')]")
	public WebElement closedClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Triaged sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Triaged')]")
	public WebElement triagedClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Individually Scored sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Individually Scored')]")
	public WebElement individuallyScoredClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Scored sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'Scored')])[2]")
	public WebElement scoredClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Archived sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Archived')]")
	public WebElement archivedClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy Open Date calendar input **/
	@FindBy(xpath = "//input[@id='BasicInfo_openDate']")
	public WebElement openCalendarInputButtonInBasicVacancySection;

	/** Basic Vacancy Close Date calendar input **/
	@FindBy(xpath = "//input[@id='BasicInfo_closeDate']")
	public WebElement closeCalendarInputButtonInBasicVacancySection;

	/** Basic Vacancy Date calendar input **/
	@FindBy(xpath = "(//td[@title='2021-05-14'])[1]")
	public WebElement date;

	/** Basic Vacancy Open Date calendar table **/
	@FindBy(xpath = "(//table[@class='ant-picker-content'])[1]")
	public WebElement openCalendarTableInBasicVacancySection;

	/** Basic Vacancy Close Date calendar table **/
	@FindBy(xpath = "(//table[@class='ant-picker-content'])[2]")
	public WebElement closeCalendarTableInBasicVacancySection;

	/** Basic Vacancy Today's OpenDate calendar table **/
	@FindBy(xpath = "(//input[@title='2021-05-18'])[1]")
	public WebElement todaysOpenDate;

	/** Basic Vacancy Today's CloseDate calendar table **/
	@FindBy(xpath = "(//input[@title='2021-05-18'])[2]")
	public WebElement todaysCloseDate;
	
	/**Toggle Button on Mandatory Statements page section Equal Opportunity Employer**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_equalOpportunityEmployer']")
	public WebElement toggleButtonEqualOpportunityEmployer;
	
	/**Toggle Button on Mandatory Statements page section Standards of Conduct**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_standardsOfConduct']")
	public WebElement toggleButtonStandardsOfConduct;
	
	/**Toggle Button on Mandatory Statements page section Foreign Education**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_foreignEducation']")
	public WebElement toggleButtonForeignEducation;
	
	/**Toggle Button on Mandatory Statements page section Reasonable Accommodation**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_reasonableAccomodation']")
	public WebElement toggleButtonReasonableAccommodation;
	
	
	
	

	public VacancyManagerUserPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

}
