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
    @FindBy(xpath = "//textarea[@id='sp_formfield_reason_for_your_appreciations']")
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

    public AwardNominationPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
