package ServiceNow.PlatformBusinessApps.NERD.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NERDCRSTopAccomplishmentsPage {

    /** NERD Top Accomplishments accordion Button */
    @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[1]")
    public WebElement nerdTopAccomplishmentsAccordionButton;

    /** NERD Top Accomplishments Category text */
    @FindBy(xpath = "//h4[contains(text(),'Category')]")
    public WebElement nerdTopAccomplishmentsCategoryText;

    /** NERD Top Accomplishments Rank text */
    @FindBy(xpath = "//h4[contains(text(),'Rank')]")
    public WebElement nerdTopAccomplishmentsRankText;

    /** NERD Top Accomplishments Title text */
    @FindBy(xpath = "//h4[contains(text(),'Title')]")
    public WebElement nerdTopAccomplishmentsTitleText;

    /** NERD Top Accomplishments DOC text */
    @FindBy(xpath = "//h4[contains(text(),'DOC')]")
    public WebElement nerdTopAccomplishmentsDOCText;

    /** NERD Top Accomplishments Description text */
    @FindBy(xpath = "//h4[contains(text(),'Description')]")
    public WebElement nerdTopAccomplishmentsDescriptionText;

    /** NERD Top Accomplishments Cancer Site/Type text */
    @FindBy(xpath = "//h4[contains(text(),'Cancer Site/Type')]")
    public WebElement nerdTopAccomplishmentsCancerSiteTypeText;

    /** NERD Top Accomplishments Research Type text */
    @FindBy(xpath = "//h4[contains(text(),'Research Type')]")
    public WebElement nerdTopAccomplishmentsResearchTypeText;

    /** NERD Top Accomplishments Special Topic text */
    @FindBy(xpath = "//h4[contains(text(),'Special Topic')]")
    public WebElement nerdTopAccomplishmentsSpecialTopicText;

    /** NERD Top Accomplishments References text */
    @FindBy(xpath = "(//h4[contains(text(),'References')])[1]")
    public WebElement nerdTopAccomplishmentsReferencesText;

    /** NERD Top Accomplishments Other References text */
    @FindBy(xpath = "//h4[contains(text(),'Other References')]")
    public WebElement nerdTopAccomplishmentsOtherReferencesText;

    /** NERD Top Accomplishments Collaborations text */
    @FindBy(xpath = "//h4[contains(text(),'Collaborations')]")
    public WebElement nerdTopAccomplishmentsCollaborationsText;

    /** NERD Top Accomplishments Fiscal Year text */
    @FindBy(xpath = "//h4[contains(text(),'Fiscal Year')]")
    public WebElement nerdTopAccomplishmentsFiscalYearText;

    /** NERD Top Accomplishments Point of Contact text */
    @FindBy(xpath = "(//h4[contains(text(),'Point of Contact')])[1]")
    public WebElement nerdTopAccomplishmentsPointOfContactText;

    /** NERD Top Accomplishments Point of Contact Email text */
    @FindBy(xpath = "//h4[contains(text(),'Point of Contact Email')]")
    public WebElement nerdTopAccomplishmentsPointOfContactEmailText;

    /** NERD Top Accomplishments CRS Contact text */
    @FindBy(xpath = "//h4[contains(text(),'CRS Contact')]")
    public WebElement nerdTopAccomplishmentsCRSContactText;

    /** NERD Top Accomplishments Author text */
    @FindBy(xpath = "//h4[contains(text(),'Author')]")
    public WebElement nerdTopAccomplishmentsAuthorText;

    /** NERD CRS Knowledge Base NCI Staff Member Top Accomplishments
     * Submit to Doc Planning Submit Pop Up Yes Button */
    @FindBy(xpath = "//button[@ng-click='c.submitSubmission()']")
    public WebElement nerdTopAccomplishmentsSubmitToDocPlanningPopUpYesButton;

    public NERDCRSTopAccomplishmentsPage() {
    PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
