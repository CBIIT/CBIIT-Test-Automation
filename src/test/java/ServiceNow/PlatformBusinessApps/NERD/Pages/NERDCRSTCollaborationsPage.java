package ServiceNow.PlatformBusinessApps.NERD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class NERDCRSTCollaborationsPage {

    @FindBy(xpath = "//h4[contains(text(),'Category')]")
    public WebElement nerdCollaborationsCategoryText;

    @FindBy(xpath = "//h4[contains(text(),'Please specify')]")
    public WebElement nerdCollaborationsPleaseSpecifyText;

    @FindBy(xpath = "//h4[contains(text(),'Acronym')]")
    public WebElement nerdCollaborationsAcronymText;

    @FindBy(xpath = "//h4[contains(text(),'Fiscal Year')]")
    public WebElement nerdCollaborationsFiscalYearText;

    @FindBy(xpath = "//h4[contains(text(),'Description')]")
    public WebElement nerdCollaborationsDescriptionText;

    @FindBy(xpath = "//h4[contains(text(),'Website URL(s)')]")
    public WebElement nerdCollaborationsWebsiteURLsText;

    @FindBy(xpath = "//h4[contains(text(),'FY the')]")
    public WebElement nerdCollaborationsFYtheCollaboorativeActivityOriginatedText;

    @FindBy(xpath = "//h4[contains(text(),'Lead DOC')]")
    public WebElement nerdCollaborationsLeadDOCText;

    @FindBy(xpath = "//h4[contains(text(),'Other DOCs')]")
    public WebElement nerdCollaborationsOtherDOCsText;

    @FindBy(xpath = "//h4[contains(text(),'POC')]")
    public WebElement nerdCollaborationsPOCText;

    @FindBy(xpath = "//h4[contains(text(),'References')]")
    public WebElement nerdCollaborationsReferencesText;

    @FindBy(xpath = "//h4[contains(text(),'NIH ICs')]")
    public WebElement nerdCollaborationsNihICsODCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'HHS Agency')]")
    public WebElement nerdCollaborationsHhsAgencyCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'Other Federal Agency')]")
    public WebElement nerdCollaborationsOtherFederalAgencyCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'Tribal')]")
    public WebElement nerdCollaborationsTribalStateLocalGovernmentCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'Foreign Government')]")
    public WebElement nerdCollaborationsForeginGovernmentCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'Non-Governmental')]")
    public WebElement nerdCollaborationsNonGovernmentalCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'Other Collaborators')]")
    public WebElement nerdCollaborationsOtherCollaboratorsText;

    @FindBy(xpath = "//h4[contains(text(),'Select type of')]")
    public WebElement nerdCollaborationsSelectTypeOfCollaborativeActivityText;

    @FindBy(xpath = "//h4[contains(text(),'IF COMMITTEE')]")
    public WebElement nerdCollaborationsIfCommitteeIsSelectedAboveIsThisAFacaCommitteeText;

    @FindBy(xpath = "//h4[contains(text(),'Is this collaboration')]")
    public WebElement nerdCollaborationsIsThisCollaborationRelatedToARegulatoryActivityText;

    @FindBy(xpath = "//h4[contains(text(),'Was NIH funding')]")
    public WebElement nerdCollaborationsWasNihFundingProvidedForThisActivityText;

    @FindBy(xpath = "//h4[contains(text(),'Products/Outputs')]")
    public WebElement nerdCollaborationsProductsOutputsText;

    @FindBy(xpath = "//h4[contains(text(),'IF RESEARCH')]")
    public WebElement nerdCollaborationsIfResearchResourceIsSelectedAboveSpecifyTypeText;

    @FindBy(xpath = "//h4[contains(text(),'NIH strategic')]")
    public WebElement nerdCollaborationsNihStrategicAlignmentText;

    @FindBy(xpath = "//h4[contains(text(),'HHS Strategic')]")
    public WebElement nerdCollaborationsHhsStrategicPlanAlignmentText;

    @FindBy(xpath = "//h4[contains(text(),'Author')]")
    public WebElement nerdCollaborationsAuthorText;

    /** Cancel Button */
    @FindBy(xpath = "//span[normalize-space()='Cancel']")
    public WebElement cancelButton;

    /** Yes Pop up button */
    @FindBy(xpath = "//button[@ng-click='c.deleteSubmission()']")
    public WebElement yesPopUpButton;

    public NERDCRSTCollaborationsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
