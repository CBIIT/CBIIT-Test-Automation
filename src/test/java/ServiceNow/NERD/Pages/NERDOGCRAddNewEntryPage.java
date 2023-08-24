package ServiceNow.NERD.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NERDOGCRAddNewEntryPage {

    /** NERD OGCR New Entry Member of Congress Drop Down */
    @FindBy(xpath = "//*[@id='s2id_autogen15']")
    public WebElement nerdOgcrNewEntryMemberOfCongressDropDown;

    /** NERD OGCR New Congressman search Drop Down */
    @FindBy(xpath = "//*[@id='select2-drop']//child::ul//child::li[1]//child::div")
    public WebElement nerdOgcrNewEntryMemberOfCongressSerchDropDown;

    /** NERD OGCR New Entry Congress Selected Drop Down */
    public static WebElement nerdOgsrNewEntryCongressSelectedDropDown(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='s2id_sp_formfield_member_of_congress']//child::ul//child::li[" + value + "]"));
    }

    /** NERD OGCR New Entry Congress Person Info */
    public static WebElement nerdOgsrNewEntryCongressPersonInfo(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='s2id_autogen15_results']/li[" + value + "]//child::div//child::div[1]"));
    }

    /** NERD OGCR New Entry Congress Person First Name */
    public static WebElement nerdOgsrNewEntryCongressPersonFirstName(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='s2id_autogen15_results']/li[" + value + "]//child::div//child::div[2]"));
    }

    /** NERD OGCR New Entry Congress Person Last Name */
    public static WebElement nerdOgsrNewEntryCongressPersonLasttName(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='s2id_autogen15_results']/li[" + value + "]//child::div//child::div[3]"));
    }

    /** NERD OGCR NEW ENTRY PAGE SPECIAL TOPIC */
    @FindBy(xpath = "//span[normalize-space()='Special Topic']")
    public WebElement nerdOgcrNewEntrySpecialTopic;

    /** NERD OGCR NEW ENTRY PAGE SPECIAL TOPIC DROP DOWN */
    @FindBy(xpath = "//*[@id='s2id_autogen16']")
    public WebElement nerdOgcrNewEntrySpecialTopicDropDown;

    /** NERD OGCR NEW ENTRY PAGE SPECIAL TOPIC DROP DOWN VALUES */
    public static WebElement nerdOgcrNewEntrySpecialTopicDropDownValues(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='s2id_autogen16_results']/li[" + value + "]"));
    }

    /** NERD OGCR NEW ENTRY PAGE OGCR CContent Type */
    @FindBy(xpath = "//span[normalize-space()='OGCR Content Type']")
    public WebElement nerdOgcrNewEntryOGCRContentType;

    /** NERD OGCR NEW ENTRY PAGE OGCR CContent Type DROP DOWN */
    @FindBy(xpath = "//*[@id='select2-chosen-1']")
    public WebElement nerdOgcrNewEntryOGCRContentTypeDropDown;

    /** NERD OGCR NEW ENTRY PAGE OGCR CContent Type DROP DOWN VALUES */
    public static WebElement nerdOgcrNewEntryGCRContentTypeDropDownValues(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='select2-results-1']/li[" + value + "]"));
    }

    /** NERD OGCR Portal Page Member Of Congress Filter */
    @FindBy(xpath = "//*[@id='memberOfCongressFilter']/button")
    public WebElement nerdOgcrPortalPageMemberOfCongressFilter;

    /** NERD OGCR Portal Page Member Of Congress Select All */
    @FindBy(xpath = "//*[@id='selectAll_memberOfCongress']")
    public WebElement nerdOgcrPortalPageMemberOfCongressSelectAll;

    /** NERD OGCR Portal Page Member Of Congress Selected Fields Area*/
    @FindBy(xpath = "//*[@id='categoryRow']")
    public WebElement nerdOgcrPortalPageMemberOfCongressSelectedFieldArea;

    /** NERD OGCR Portal Page Member of Congress Filter Drop Down Values */
    public static WebElement nerdOgcrPortalPageMemberOfCongressFilterDropDownValues(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='memberOfCongressFilter']/ul//child::li[" + value + "]"));
    }

    public NERDOGCRAddNewEntryPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
