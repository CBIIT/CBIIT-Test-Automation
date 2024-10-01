package ServiceNow.OA_Intake.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OAIntakePage {
    public OAIntakePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** New request tab */
    @FindBy(xpath = "//div//h2[.='New Request']")
    public WebElement newRequestTab;

    /** New request page header */
    @FindBy(xpath = "//div//h3[contains(text(),'Office of Acquisitions (OA) New Request ')]")
    public WebElement newRequestPageHeader;

    /** Requestor Queue hyperlink */
    @FindBy(xpath = "//a[@title='Requester Queue Link']")
    public WebElement requestorQueueHyperlink;

    /** Requestor page header */
    @FindBy(xpath = "//h2[contains(text(),'Requestor (Requested For) Queue for ')]")
    public WebElement requestorPageHeader;

    /**  User Guide hyperlink*/
    @FindBy(xpath = "//*[@id=\"xbd56f5e41b8af910344042e2b24bcb61\"]/div/div/div/div[2]/p[5]/strong/a")
    public WebElement userGuideHyperlink;

    /**  User Guide Please log in to see articles*/
    @FindBy(xpath = "//p[contains(text(),'Please log in to see articles.')]")
    public WebElement userGuideLoginText;

    /**  Status of request*/
    @FindBy(xpath = "//span[@class='select2-chosen'][.='Draft']")
    public WebElement requestStatus;

    /**  request Title field*/
    @FindBy(xpath = "//input[@id='sp_formfield_request_title']")
    public WebElement requestTitleField;

    /**  request Description field*/
    @FindBy(xpath = "//textarea[@id='sp_formfield_request_description']")
    public WebElement requestDescriptionField;

    /**  award date field*/
    @FindBy(xpath = "//input[@id='sp_formfield_expected_award_date']")
    public WebElement awardDateField;

    /** NAICS code status dropdown*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_known_naics_code_select']")
    public WebElement drpdnNAICSCodeStatus;

    /** NAICS code status Known option*/
    @FindBy(xpath = "//ul//li//div[@class='select2-result-label']")
    public WebElement drpdnNAICSCodeKnownOption;

    /** NAICS code field*/
    @FindBy(xpath = "//input[@id='sp_formfield_naics_code']")
    public WebElement nAICSCodeField;

    /** dropdown New or Re-compete Contract*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_new_contract']")
    public WebElement drpdwnNewRecompeteContract;

    /**  Re-compete Contract*/
    @FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement recompeteContract;

    /**  Re-compete Contract Number field */
    @FindBy(xpath = "//*[@id='sp_formfield_contract_number']")
    public WebElement previousContractNumberField;

    /**  Previous Number field */
    @FindBy(xpath = "//*[@id='sp_formfield_previous_co']")
    public WebElement previousBuyerField;

    /**  Recommended Contract Mechanism dropdown*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_contract_mechanism']")
    public WebElement drpdownRecomContractMechanism;

    /**  External Call/Task Orders (TOs)(NITAAC, GSA)*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[2]")
    public WebElement externalCallOption;

    /**  Internal Call/Task Orders (TOs)(NITAAC, GSA)*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[3]")
    public WebElement internalCallOption;

    /**  alert messagen Task Order Acquisition Plans*/
    @FindBy(xpath = "(//div[.=' Task Order Acquisition Plans (TOAPs) are required for both Internal and External Call/ Order submissions.'])[2]")
    public WebElement alertMessageTaskOrderAcqPlans;

    /**  R&D/R&D Support dropdown*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_rd_support']")
    public WebElement drpdownRD;

    /**  R&D/R&D Support yes*/
    @FindBy(xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement RDYes;

    /**  Date Concept Peer Review Completed field*/
    @FindBy(xpath = "//input[@id='sp_formfield_date_review_completed']")
    public WebElement dateConceptPeerReviewComField;
}
