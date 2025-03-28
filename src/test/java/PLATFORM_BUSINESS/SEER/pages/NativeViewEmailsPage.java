package PLATFORM_BUSINESS.SEER.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewEmailsPage extends CommonUtils {

    /** --------------- NATIVE VIEW EMAILS PAGE --------------- */

    /**NativeView Emails Button */
    @FindBy(xpath = "//*[@id='8d620b63c611227b008368697b0b8d7b']/div/div")
    public WebElement nativeViewAccessEmailsButton;

    /**Native View Emails Dropdown Menu*/
    @FindBy(xpath = "//*[@id=\'list_nav_sys_email\']/div/div[1]/h1/a")
    public WebElement emailsMenu;

    /**Native View Emails Preview Verify Email I icon*/
    @FindBy(xpath = "//td[normalize-space()='Your SEER Data Access Request has been rejected']//parent::tr//child::td[2]//child::a")
    public WebElement nativeViewEmailsPreviewVerifyEmailIcon;

    /**NativeView Emails Button */
    @FindBy(xpath = "//button[@id='sys_email_filter_toggle_image']")
    public WebElement nativeViewEmailPageFilterButton;

    /**NativeView Emails Filter Search Option Row 1 Field 1 To Search*/
    @FindBy(xpath = "//a[@class='select2-choice']")
    public WebElement nativeViewEmailPageFilterOptionRow1Field1ToSearch;

    /**NativeView Emails Filter Search Option Row 1 Field 1 Input To Search*/
    @FindBy(xpath = "//input[@id='s2id_autogen2_search']")
    public WebElement nativeViewEmailPageFilterOptionRow1Field1InputToSearch;

    /**NativeView Emails Filter Search Operator for Condition 1 ROW 1 To Search For Recipients Only*/
    @FindBy(xpath = "//td[@id='oper']")
    public WebElement nativeViewEmailPageFilterSearchConditionRow1ToSearchForRecipientsOnly;

    /**NativeView Emails Filter Search Operator for Condition 1 ROW 1 To Select IS For Recipients Only*/
    @FindBy(xpath = "//option[@value='=']")
    public WebElement nativeViewEmailPageFilterSearchConditionRow1ToSelectIsForRecipientsOnly;

    /**NativeView Emails Filter Search Operator for INPUT ROW 1 To Search For Recipients Only*/
    @FindBy(xpath = "//input[@aria-label='Recipients']")
    public WebElement nativeViewEmailPageFilterSearchINPUTRow1ToSearchForRecipientsOnly;

    /**NativeView Emails Filter Search Option Row 1 AND Bottun */
    @FindBy(xpath = "//button[@name='and-button']")
    public WebElement nativeViewEmailPageFilterRow1AndButton;

    /**NativeView Emails Filter Search Option Row 2 Field 1 To Search For Subject */
    @FindBy(xpath = "//div[@id='s2id_autogen408']")
    public WebElement nativeViewEmailPageFilterOptionRow2Field1ToSearchSubject;

    /**NativeView Emails Filter Search Option Row 2 Field 1 To Select Arrow For Subject */
    @FindBy(xpath = "//div[@id='s2id_autogen3']//span[@class='select2-arrow']")
    public WebElement nativeViewEmailPageFilterOptionRow2Field1ToSelectArrowToInputSubject;

    /**NativeView Emails Filter Search Option Row 2 Field 1 Input To Enter Subject */
    @FindBy(xpath = "//input[@id='s2id_autogen4_search']")
    public WebElement nativeViewEmailPageFilterOptionRow2Field1SelectSubjectToSearch;

    /**NativeView Emails Filter Search Operator for Condition 2 ROW 2 To select Contains */
    @FindBy(xpath = "//tr[@type='string_full_utf8']//td[@id='oper']")
    public WebElement nativeViewEmailPageFilterSearchConditionRow2ToSelectContains;

    /**NativeView Emails Filter Search Operator for Condition 1 ROW 2 To Select Contains For Recipients Only*/
    @FindBy(xpath = "//option[@value='=']")
    public WebElement nativeViewEmailPageFilterSearchConditionRow2ToSelectContainsForSubject;

    /**NativeView Emails Filter Search Operator for INPUT ROW 2 To Search For Approved Email Subject */
    @FindBy(xpath = "//input[@aria-label='Subject']")
    public WebElement nativeViewEmailPageFilterSearchINPUTRow2ToSearchForApprovedEmailSubject;

    /**NativeView Emails Filter Search Run Button to Search */
    @FindBy(xpath = "//button[@id='test_filter_action_toolbar_run']")
    public WebElement nativeViewEmailPageFilterRunButton;

    /**Native View Emails Preview Verify Email I icon for Approved Email */
    @FindBy(xpath = "//a[@aria-label='Preview record: Your SEER Data Access Request has been approved - SAR0097535']")
    public WebElement nativeViewEmailsPreviewVerifyEmailIconForApprovedEmail;

    public NativeViewEmailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}