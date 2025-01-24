package ServiceNow.AwardNomination.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardNominationPage {

    /**x Services tab*/
    @FindBy(xpath = "//*[@id='fresponsive']/li[1]/a")
    public WebElement tabServices;

    /**x General subtab*/
    @FindBy(xpath = "//*[.=' General ']")
    public WebElement subTabGeneral;

    /**x option  VIBE Peer-to-Peer Appreciation Program*/
    @FindBy(xpath = "(//*[@id='menu-cat']/li[8]/a)[4]")
    public WebElement optionVIBE;

    /**VIBE page title"*/
    @FindBy(xpath = "//h1[.='VIBE Peer-to-Peer Appreciation Program']")
    public WebElement pageTitleVIBE;

    /**field What is your name"*/
    @FindBy(xpath = "//span[@id='select2-chosen-2']")
    public WebElement fieldWhatIsYourName;

    /** dropdown Would you like your appreciation to be anonymous?"*/
    @FindBy(xpath = "//span[@id='select2-chosen-1']")
    public WebElement dropdownAppreciationAnonymous;

    /**  option YES dropdown Would you like your appreciation to be anonymous?"*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[1]")
    public WebElement optionYesDropdownAppreciationAnonymous;

    /**  field What is the name of the colleague or colleagues you want to appreciate?"*/
    @FindBy(xpath = "//input[@id='s2id_autogen3']")
    public WebElement fieldColleagueName;

    /**  Chosen person*/
    @FindBy(xpath = "//div[@role='option']")
    public WebElement chosenPerson;

    /**  text field Share Appreciation*/
    @FindBy(xpath = "//textarea[@id='sp_formfield_share_your_appreciation']")
    public WebElement textFieldShareAppreciation;

    /**  section Header Optional Responses*/
    @FindBy(xpath = "(//span[.='Optional Responses'])[1]")
    public WebElement sectionHeaderOptionalResponses;

    /**  section Header Which value best reflects your appreciation? (Select one or more)*/
    @FindBy(xpath = "//span[.='Which value best reflects your appreciation? (Select one or more)']")
    public WebElement sectionHeaderWhichValueBestReflectsYourAppreciation;

    /**  add Attachment Option*/
    @FindBy(xpath = "//span[.='Add attachments']")
    public WebElement addAttachmentOption;

    /**  Submit button */
    @FindBy(xpath = "(//button[.='Submit'])[1]")
    public WebElement buttonSubmit;

    /**  section Tickets */
    @FindBy(xpath = "//span[.=' Tickets ']")
    public WebElement sectionTickets;

    /**  confirmation We have received your request */
    @FindBy(xpath = "//h2[.='We have received your request.']")
    public WebElement confWeHaveReceivedYourRequest;

    /**  Last submitted VIBE Ticket */
    @FindBy(xpath = "(//h4[.='VIBE Peer-to-Peer Appreciation Program'])[1]")
    public WebElement lastSubmittedVIBETicket;

    /**  ticket status Page View */
    @FindBy(xpath = "//div[contains(text(),' Work in Progress')]")
    public WebElement ticketsStatusPageView;

    /**  approval status Page View */
    @FindBy(xpath = "//div[contains(text(),' Requested')]")
    public WebElement approvalStatusPageView;

    /**  Cancel button */
    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    /**  Cancel Modal Cancel button */
    @FindBy(xpath = "(//span[contains(text(),'Cancel')])[1]")
    public WebElement cancelButtonCancelModal;

    /**  Add Watchers button */
    @FindBy(xpath = "//span[contains(text(),'Add Watchers')]")
    public WebElement addWatchersButton;

    /**  Add Attachment button */
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-paperclip'])[2]")
    public WebElement addAttachmentButton;

    /**  choose file button */
    @FindBy(xpath = "//div[@class='sn-file-drop-zone__drag-info ng-binding ng-scope']//input")
    public WebElement chooseFileButton;

    /**  Cancel My Ticket modal */
    @FindBy(xpath = "//h3[.='Cancel My Ticket']")
    public WebElement modalCancelMyTicket;

    /**  text Field Add Watchers */
    @FindBy(xpath = "//input[@class='select2-input select2-default']")
    public WebElement textFieldAddWatchers;

    /**  Save Changes confirmation modal button */
    @FindBy(xpath = "//span[contains(text(),'Save Changes')]")
    public WebElement saveChangesConfModalButton;

    /**  Watch list field */
    @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[5]")
    public WebElement watchListField;

    /**  attachment Added */
    @FindBy(xpath = "//a[@title='Download AWARD_NOMINATION.docx']")
    public WebElement attachmentAdded;

    /**  chosen watcher */
    @FindBy(xpath = "//div[@class='select2-result-label']")
    public WebElement chosenWatcher;

    /**  Optional Response: Going Above and Beyond—They go the extra mile and provide excellent service */
    @FindBy(xpath = "//span[contains(text(),'Going Above and Beyond—They go the extra mile and provide excellent service.')]")
    public WebElement optResponseSectionGoingAboveBeyondOption;

    /**  Optional Response: Building Our Community—They foster inclusivity and build relationships. */
    @FindBy(xpath = "//span[contains(text(),'Building Our Community—They foster inclusivity and build relationships.')]")
    public WebElement optResponseSectionBuildingOurCommunityOption;

    /**  Optional Response: Working Behind the Scenes—They perform important tasks without being in the spotlight. */
    @FindBy(xpath = "//span[contains(text(),'Working Behind the Scenes—They perform important tasks without being in the spotlight.')]")
    public WebElement optResponseSectionWorkingBehindScenesOption;

    /**  Optional Response: Making It Happen—They achieve results despite challenges.*/
    @FindBy(xpath = "//span[contains(text(),'Making It Happen—They achieve results despite challenges.')]")
    public WebElement optResponseSectionMakingItHappenOption;

    /**  Optional Response: Finding Creative Solutions—They use creative problem-solving and embrace a growth mindset.*/
    @FindBy(xpath = "//span[contains(text(),'Finding Creative Solutions—They use creative problem-solving and embrace a growth mindset.')]")
    public WebElement optResponseSectionFindingCreativeSolutionsOption;

    /**  Optional Response: Brightening the Day—Their positive attitude makes work more enjoyable.*/
    @FindBy(xpath = "//span[contains(text(),'Brightening the Day—Their positive attitude makes work more enjoyable.')]")
    public WebElement optResponseSectionBrighteningDaysOption;

    /**  Optional Response: Leading the Charge—They take initiative on challenging tasks.*/
    @FindBy(xpath = "//span[contains(text(),'Leading the Charge—They take initiative on challenging tasks.')]")
    public WebElement optResponseSectionLeadingChargeOption;

    /**  Optional Response: Leading the Charge—They take initiative on challenging tasks.*/
    @FindBy(xpath = "//span[contains(text(),'Collaborating on a Project—They are key partners on projects.')]")
    public WebElement optResponseSectionCollaboratingOnProjectOption;

    /**  Optional Response: In My Own Words - A text box will appear below when checked.*/
    @FindBy(xpath = "//span[contains(text(),'In My Own Words - A text box will appear below when checked.')]")
    public WebElement optResponseSectionInMyOwnWordsOption;

    /**  Which value best reflects your appreciation: Breaking Down Barriers—They actively work to dismantle all forms of discrimination.*/
    @FindBy(xpath = "//span[contains(text(),'Breaking Down Barriers—')]")
    public WebElement whichValueSectionBreakingDownBarriersOption;

    /**  Which value best reflects your appreciation: Using Evidence—They base decisions on data and feedback to promote equity.*/
    @FindBy(xpath = "//span[contains(text(),'Using Evidence—They base decisions on data and feedback to promote equity')]")
    public WebElement whichValueSectionUsingEvidenceOption;

    /**  Which value best reflects your appreciation: Empowering Others—They help foster a sense of belonging and inclusivity.*/
    @FindBy(xpath = "//span[contains(text(),'Empowering Others—They help foster a sense of belonging and inclusivity.')]")
    public WebElement whichValueSectionEmpoweringOthersOption;

    /**  Which value best reflects your appreciation: Being trustworthy*/
    @FindBy(xpath = "//span[contains(text(),'Being Trustworthy and Accountable')]")
    public WebElement whichValueSectionBeingTrustworthyOption;

    /**  Which value best reflects your appreciation: Fostering Belonging and Respect—They cultivate a respectful environment where everyone feels valued.*/
    @FindBy(xpath = "//span[contains(text(),'Fostering Belonging and Respect—They cultivate a respectful environment where everyone feels valued.')]")
    public WebElement whichValueSectionFosteringBelongingOption;

    /**  Which value best reflects your appreciation: Promoting Transparency—They ensure that diversity, equity, and inclusion processes are clear and accessible.*/
    @FindBy(xpath = "//span[contains(text(),'Promoting Transparency')]")
    public WebElement whichValueSectionPromotingTransparencyOption;

    /**  Which value best reflects your appreciation: Being an Ally—They advocate for marginalized or excluded colleagues.*/
    @FindBy(xpath = "//span[contains(text(),'Being an Ally')]")
    public WebElement whichValueSectionBeingAllyOption;

    /**  Which value best reflects your appreciation: In My Own Words - A text box will appear below when checked.*/
    @FindBy(xpath = "//span[contains(text(),'In My Own Words - A text box will appear below when checked.')]")
    public WebElement whichValueSectionInMyOwnWordsOption;

    /**  group manager*/
    @FindBy(xpath = "//*[@id='sys_display.sys_user_group.manager']")
    public WebElement groupManagerTextField;

    /**  tab Admin Group Members*/
    @FindBy(xpath = "//span[.='Group Members (3)']")
    public WebElement tabAdminGroupMembers;

    /** Admin Group Member One*/
    @FindBy(xpath = "//a[@sys_id='4d77a2986fc54e001c857eeeae3ee41b']")
    public WebElement adminGroupMemberOne;

    /** Admin Group Member Two*/
    @FindBy(xpath = "//a[@sys_id='b73b214a6f0671002b0d58622e3ee445']")
    public WebElement adminGroupMemberTwo;

    /** Admin Group Member Three*/
    @FindBy(xpath = "//a[@sys_id='3793a3691be6a190550143bae54bcb28']")
    public WebElement adminGroupMemberThree;

    public AwardNominationPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}