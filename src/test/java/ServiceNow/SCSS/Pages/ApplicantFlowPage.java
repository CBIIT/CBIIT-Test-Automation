package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicantFlowPage extends CommonUtils {

    public ApplicantFlowPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** tab Profile **/
    @FindBy(xpath = "//span[@class='ant-menu-title-content']//*[contains(text(),'Profile')]")
    public WebElement tabProfile;

    /** tab Basic Information **/
    @FindBy(xpath = "//div[contains(text(),'Basic Information')]")
    public WebElement tabPBasicInfo;

    /** tab Demographics **/
    @FindBy(xpath = "//div[contains(text(),'Demographics (optional)')]")
    public WebElement tabDemographics;

    /** button Edit Profile tab **/
    @FindBy(xpath = "//button//span[contains(text(),'Edit')]")
    public WebElement btnEditProfileTab;

    /**  Profile first name field **/
    @FindBy(xpath = "//input[@id='basic_firstName']")
    public WebElement fldFirstNameProfile;

    /**  Profile middle name field **/
    @FindBy(xpath = "//input[@id='basic_middleName']")
    public WebElement fldMiddleNameProfile;

    /**  Profile last name field **/
    @FindBy(xpath = "//div//input[@id='basic_lastName']")
    public WebElement fldLastNameProfile;

    /**  Profile email field **/
    @FindBy(xpath = "//div//input[@id='basic_email']")
    public WebElement fldEmailProfile;

    /**  Profile phone field **/
    @FindBy(xpath = "//span//input[@name='phone']")
    public WebElement fldPhoneProfile;

    /**  Profile business phone field **/
    @FindBy(xpath = "//span//input[@name='businessPhone']")
    public WebElement fldBusinessPhoneProfile;

    /**  Profile address field **/
    @FindBy(xpath = "//div//input[@id='basic_address_address']")
    public WebElement fldAddressProfile;

    /**  Profile app number field **/
    @FindBy(xpath = "//div//input[@id='basic_address_address2']")
    public WebElement fldAppNumberProfile;

    /**  Profile city field **/
    @FindBy(xpath = "//div//input[@id='basic_address_city']")
    public WebElement fldCityProfile;

    /**  Profile state field **/
    @FindBy(xpath = "//div//input[@id='basic_address_stateProvince']")
    public WebElement fldStateProfile;

    /**  Profile country field **/
    @FindBy(xpath = "//div//input[@id='basic_address_country']")
    public WebElement fldCountryProfile;

    /**  Profile zip field **/
    @FindBy(xpath = "//div//input[@id='basic_address_zip']")
    public WebElement fldZipProfile;

    /**  Degree dropdown **/
    @FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
    public WebElement dropdownDegree;

    /**  Degree Masters **/
    @FindBy(xpath = "//div[@title='Masters']")
    public WebElement degreeMasters;

    /**  Degree Masters **/
    @FindBy(xpath = "//div[@title='Bachelors']")
    public WebElement degreeBachelors;

    /**  radio button yes "Are you a US citizen" **/
    @FindBy(xpath = "(//span//input[@class='ant-radio-input'])[1]")
    public WebElement rdButtonUSCitizen;

    /**  button save Profile tab **/
    @FindBy(xpath = "//button//span[.='Save']")
    public WebElement buttonSave;

    /**  button Share Demographics Profile tab **/
    @FindBy(xpath = "//label[@class='ant-radio-wrapper ant-radio-wrapper-in-form-item']//input[@value='1']")
    public WebElement buttonShareDemographics;

    /**  button  NOT Share Demographics Profile tab **/
    @FindBy(xpath = "//label[@class='ant-radio-wrapper ant-radio-wrapper-in-form-item']//input[@value='0']")
    public WebElement buttonNotShareDemographics;

    /**  button Female Sex Profile tab **/
    @FindBy(xpath = "//div[@class='ant-space-item']//input[@value='Male']")
    public WebElement buttonFemaleSex;

    /**  button Male Sex Profile tab **/
    @FindBy(xpath = "//div[@class='ant-space-item']//input[@value='Female']")
    public WebElement buttonMaleSex;

    /**  button Hispanic or Latino Profile tab **/
    @FindBy(xpath = "//div[@id='demographics_ethnicity']//input[@value='1']")
    public WebElement buttonHispanicOrLatino;

    /**  button Not Hispanic or Latino Profile tab **/
    @FindBy(xpath = "//div[@id='demographics_ethnicity']//input[@value='0']")
    public WebElement buttonNotHispanicOrLatino;

    /**  button American Indian or Alaska Native Profile tab **/
    @FindBy(xpath = "//input[@value='American Indian']")
    public WebElement buttonAmericanIndianAlaskaNative;

    /**  button Asian Profile tab **/
    @FindBy(xpath = "//input[@value='Asian']")
    public WebElement buttonAsian;

    /**  button Blind Profile tab **/
    @FindBy(xpath = "//input[@value='Blind']")
    public WebElement buttonBlind;

    /**  button Deaf Profile tab **/
    @FindBy(xpath = "//input[@value='Deaf']")
    public WebElement buttonDeaf;

    /** Home Tab**/
    @FindBy(xpath = "//li[@class='ant-menu-item ant-menu-item-only-child']//a[contains(text(),'Home')]")
    public WebElement homeTab;

    /** Senior Project Manager Vacancy **/
    @FindBy(xpath = "//a[contains(text(),'Senior Project Manager')]")
    public WebElement seniorProjectManagerVacancy;

    /**VP Product Development Vacancy **/
    @FindBy(xpath = "//a[contains(text(),'VP Product Development')]")
    public WebElement vpProductDevelopmentVacancy;

    /**Python Developer Vacancy **/
    @FindBy(xpath = "//a[contains(text(),'Python Developer')]")
    public WebElement pythonDeveloperVacancy;

    /**Cyber Security AnalystVacancy **/
    @FindBy(xpath = "//a[contains(text(),'Cyber Security Analyst')]")
    public WebElement cyberSecurityAnalystVacancy;

    /** Apply button **/
    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    public WebElement applyButton;

    /** First Name field**/
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameField;

    /**Last Name field**/
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameField;

    /** Email field**/
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailField;

    /** Save Application button**/
    @FindBy(xpath = "//span[contains(text(),'save application')]")
    public WebElement saveApplicationButton;

    /** alert Application successfully saved**/
    @FindBy(xpath = "//span[contains(text(),'Application successfully saved')]")
    public WebElement alertApplicationsaved;

    /** Back to Applicanst Home?*/
    @FindBy(xpath = "//span[contains(text(),'Back to Applications Home?')]")
    public WebElement alertBackToApplicationsHome;

    /** Remove Draft**/
    @FindBy(xpath = "//span[contains(text(),' remove')]")
    public WebElement removeDraft;

    /** Edit Draft*/
    @FindBy(xpath = "//span[contains(text(),'edit')]")
    public WebElement editDraft;


    /** Edit Draft VP vacancy*/
    @FindBy(xpath = "//tbody/tr[3]/td[1]/a[1]")
    public WebElement editDraftVP;


    /**  Confirm alert Remove Draft**/
    @FindBy(xpath = "//span[contains(text(),'Confirm')]")
    public WebElement confirmAlert;

    /**  Confirm alert Remove Draft**/
    @FindBy(xpath = "//span[contains(text(),'First Name, Last Name, and Email are required to save. Please fill out required field')]")
    public WebElement alertUnsuccessfulSaveApplication;

    /**No minimum degree answer**/
    @FindBy(xpath = "(//input[@class='ant-radio-input'])[2]")
    public WebElement noMinimumDegreeAnswer;

    /**Yes minimum degree answer**/
    @FindBy(xpath = "(//input[@class='ant-radio-input'])[1]")
    public WebElement yesMinimumDegreeAnswer;

    /**  Next button**/
    @FindBy(xpath = "//button//span[contains(text(),'next')]")
    public WebElement nextButton;

    /**Alert minimum degree answer**/
    @FindBy(xpath = "//div[contains(text(),'A Doctoral degree is minimally required to apply to this vacancy. Please click cancel to go back')]")
    public WebElement alertMinimumDegree;

    /**Alert Fill out required fields**/
    @FindBy(xpath = "//span[contains(text(),'Please fill out all required fields.')]")
    public WebElement alertReqFields;

    /**  vacancy Title VP product Development**/
    @FindBy(xpath = "//h1[contains(text(),'VP Product Development')]")
    public WebElement vacTitle;

    /** Open date field**/
    @FindBy(xpath = "//label[contains(text(),'Open Date')]")
    public WebElement openDateField;

    /** Closedate field**/
    @FindBy(xpath = "//label[contains(text(),'Close Date')]")
    public WebElement closeDateField;

    /** Vacancy Description field**/
    @FindBy(xpath = "//p[contains(text(),'vacancy description text')]")
    public WebElement vacDescriptionField;

    /** Application Documents field**/
    @FindBy(xpath = "//h2[contains(text(),'APPLICATION DOCUMENTS')]")
    public WebElement appDocumentsField;

    /** EQUAL OPPORTUNITY EMPLOYMENT**/
    @FindBy(xpath = "//h2[contains(text(),'EQUAL OPPORTUNITY EMPLOYMENT')]")
    public WebElement equalOpportunityEmploymentStatement;

    /** STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE**/
    @FindBy(xpath = "//h2[contains(text(),'STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE')]")
    public WebElement standardsOfConductStatement;

    /** FOREIGN EDUCATION**/
    @FindBy(xpath = "//h2[contains(text(),'FOREIGN EDUCATION')]")
    public WebElement foreignEducationStatement;

    /** REASONABLE ACCOMODATION**/
    @FindBy(xpath = "//h2[contains(text(),'REASONABLE ACCOMODATION')]")
    public WebElement reasonableAccommodationStatement;

    /** Email address field**/
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAddressField;

    /** Phone number field**/
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberField;

    /**  Business Phone number field**/
    @FindBy(xpath = "//input[@id='businessPhone']")
    public WebElement businessPhonehoneNumberField;

    /**  Address section title**/
    @FindBy(xpath = "//h3[contains(text(),'Address')]")
    public WebElement addressSectionTitle;

    /** Please enter a valid email address ALERT**/
    @FindBy(xpath = "//div[contains(text(),'Please enter a valid email address')]")
    public WebElement emailAddressAlert;

    /** Please enter a valid phone number ALERT**/
    @FindBy(xpath = "(//div[contains(text(),'Please enter a valid phone number')])[1]")
    public WebElement phoneNumberAlert;

    /** Please enter a valid phone number ALERT**/
    @FindBy(xpath = "(//div[contains(text(),'Please enter a valid phone number')])[2]")
    public WebElement businessPhoneNumberAlert;

    /** Please enter a valid business phone number ALERT**/
    @FindBy(xpath = "//div[contains(text(),'A Doctoral degree is minimally required to apply to this vacancy. Please click cancel to go back')]")
    public WebElement doctoralDegreeAlert;

    /** Your Applications healdine**/
    @FindBy(xpath = "//h1[contains(text(),'Your Applications')]")
    public WebElement yourApplicationsHeadline;

    /** Address Line One**/
    @FindBy(xpath = "//input[@id='address_address']")
    public WebElement addressLineOne;

    /** Address Line Two**/
    @FindBy(xpath = "//input[@id='address_address2']")
    public WebElement addressLineTwo;

    /** Address Line City**/
    @FindBy(xpath = "//input[@id='address_city']")
    public WebElement addressLineCity;

    /** Address Line State**/
    @FindBy(xpath = "//input[@id='address_stateProvince']")
    public WebElement addressLineState;

    /** Address Line Country**/
    @FindBy(xpath = "//input[@id='address_country']")
    public WebElement addressLineCountry;

    /** Address ZipCode**/
    @FindBy(xpath = "//input[@id='address_zip']")
    public WebElement addressLineZipCode;

    /** Alert Please enter zip/postal code**/
    @FindBy(xpath = "//div[contains(text(),'Please enter zip/postal code')]")
    public WebElement alertZipCode;

    /** Alert Please enter a valid email address**/
    @FindBy(xpath = "//div[contains(text(),'Please enter a valid email address')]")
    public WebElement alertEmail;

    /** References section title*/
    @FindBy(xpath = "//h3[contains(text(),'References')]")
    public WebElement referencesSectionTitle;

    /** Review section title*/
    @FindBy(xpath = "//h3[contains(text(),'Review')]")
    public WebElement reviewSectionTitle;

    /** Application Documents title*/
    @FindBy(xpath = "//h3[contains(text(),'Application Documents')]")
    public WebElement applicationDocumentsTitle;

    /**  First Name field References section*/
    @FindBy(xpath = "//input[@id='references_0_firstName']")
    public WebElement firstNameReferencesSection;

    /**  Middle Name field References section*/
    @FindBy(xpath = "//input[@id='references_0_middleName']")
    public WebElement middleNameReferencesSection;

    /**  Last Name field References section*/
    @FindBy(xpath = "//input[@id='references_0_lastName']")
    public WebElement lastNameReferencesSection;

    /**  Email field References section*/
    @FindBy(xpath = "//input[@id='references_0_email']")
    public WebElement emailReferencesSection;

    /**  Phone Number field References section*/
    @FindBy(xpath = "//input[@id='references_0_phoneNumber']")
    public WebElement phoneNumberReferencesSection;

    /**  Organization field References section*/
    @FindBy(xpath = "//input[@id='references_0_organization']")
    public WebElement organizationReferencesSection;

    /**  Relationships Dropdown References section*/
    @FindBy(xpath = "(//div[@class='ant-select ant-select-single ant-select-show-arrow'])[1]")
    public WebElement relationshipsDpReferencesSection;

    /**  Relationships Dropdown  Supervisor References section*/
    @FindBy(xpath = "(//div[contains(text(),'Supervisor/Manager')])[2]")
    public WebElement relationshipsSupervisorDpReferencesSection;

    /**  Is it okay for the Hiring Team to contact the reference directly? References section*/
    @FindBy(xpath = "(//div[@class='ant-select ant-select-single ant-select-show-arrow'])[2]")
    public WebElement contactdirectlyDpReferencesSection;

    /** yes Answer Is it okay for the Hiring Team to contact the reference directly? References section*/
    @FindBy(xpath = "//div[contains(text(),'Yes')]")
    public WebElement yesContactdirectlyDpReferencesSection;

    /** no Answer Is it okay for the Hiring Team to contact the reference directly? References section*/
    @FindBy(xpath = "//div[contains(text(),'No')]")
    public WebElement noContactdirectlyDpReferencesSection;

    /** Upload CV button*/
    @FindBy(xpath = "(//span[contains(text(),'Upload')])[2]")
    public WebElement uploadCV;

    /** Upload Vision Statement button*/
    @FindBy(xpath = "(//span[contains(text(),'Upload')])[4]")
    public WebElement uploadVisStatement;

    /** Alert Upload File*/
    @FindBy(xpath = "//div[contains(text(),'Please upload a document.')]")
    public WebElement alertUploadFile;

    /** Your Applications Tab*/
    @FindBy(xpath = "//a[contains(text(),'Your Applications')]")
    public WebElement yourApplicationsTab;

    /** Vacancy Title Field*/
    @FindBy(xpath = "//span[contains(text(),'Vacancy Title')]")
    public WebElement vacancyTitleField;

    /** State Field*/
    @FindBy(xpath = "//th[contains(text(),'State')]")
    public WebElement stateField;

    /** Vacancy Closes Field*/
    @FindBy(xpath = "//span[contains(text(),'Vacancy Closes')]")
    public WebElement vacancyClosesField;

    /** Application Submitted Field*/
    @FindBy(xpath = "//span[contains(text(),'Application Submitted')]")
    public WebElement applicationSubmittedField;

    /** Actions Field*/
    @FindBy(xpath = "//th[contains(text(),'Actions')]")
    public WebElement actionsField;

    /**Submit Application Button*/
    @FindBy(xpath = "//span[contains(text(),'submit application')]")
    public WebElement submitApplicationButton;

    /**Submit Application Button Ok alert*/
    @FindBy(xpath = "//span[contains(text(),'ok')]")
    public WebElement okSubmitApplicationButton;

    /**withdraw Application*/
    @FindBy(xpath = "(//span[contains(text(),'withdraw')])[2]")
    public WebElement withdrawApplication;

    /**Done alert*/
    @FindBy(xpath = "//span[contains(text(),'done')]")
    public WebElement doneAlert;

    /**withdrawn*/

    @FindBy(xpath = "(//span[contains(text(),'withdrawn')])[1]")



    public WebElement withdrawnStatus;

    /**Jae Song dropdown Native View*/
    @FindBy(xpath = "//span[contains(text(),'JS')]")
    public WebElement jaeSongDropdown;

    /**Log out*/
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    public WebElement logOut;

    /**References blurb*/
    @FindBy(xpath = "//p[contains(text(),'Please provide professional references that can submit a recommendation on your behalf.')]")
    public WebElement referencesBlurb;

    /** Supervisor/Manager relationships dropdown*/
    @FindBy(xpath = "//div[@id='references_0_relationship_list_0']")
    public WebElement supervisorOption;

    /** Coworker relationships dropdown*/
    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Co-worker']")
    public WebElement coworkerOption;

    /** Colleague relationships dropdown*/
    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Colleague']")
    public WebElement colleagueOption;

    /** Peer relationships dropdown*/
    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Peer']")
    public WebElement peerOption;

    /**  vacancy Director of Cybersecurity**/
    @FindBy(xpath = "//a[contains(text(),'Director of Cybersecurity')]")
    public WebElement dirOfCybersecurityVacancy;

    /**alert You have already applied for this position**/
    @FindBy(xpath = "//span[contains(text(),'You have already applied for this position.')]")
    public WebElement alertAlreadyApplied;

    /**Business Phone field Review**/
    @FindBy(xpath = "//h2[contains(text(),'Business Phone')]")
    public WebElement busPhoneFieldReview;

    /**alert "Please ensure each of your documents are unique files.  "**/
    @FindBy(xpath = "//strong[contains(text(),'Please ensure each of your documents are unique files.')]")
    public WebElement uniqueFilesDocumentsAlert;

    /**alert "Application documents will not be saved unless your application is submitted/finalized on the next section."**/
    @FindBy(xpath = "//strong[contains(text(),'Application documents will not be saved unless your application is submitted/finalized on the next section.')]")
    public WebElement savedDocumentsAlert;

    /**Position Title(if applicable)**/
    @FindBy(xpath = "//label[contains(text(),'Position Title (If Applicable)')]")
    public WebElement positionTitleReferencesSection;

    /**Senior Product Owner Application**/
    @FindBy(xpath = "//a[contains(text(),'Senior Product Owner')]")
    public WebElement seniorProductOwnerApplication;

    /**Application First Name Field**/
    @FindBy(xpath = "//span[normalize-space()='Jae']")
    public WebElement applicationFirstNameField;


    /**Director of Software Engineering draft**/
    @FindBy(xpath = "//h1[contains(text(),'Forescout Engineer')]")
    public WebElement forescoutEngineergDraft;
}
