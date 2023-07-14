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

    /** NERD OGCR NEW ENTRY PAGE SPECIAL TOPIC DROP DOWN */
    @FindBy(xpath = "//span[normalize-space()='Special Topic']")
    public WebElement nerdOgcrNewEntrySpecialTopic;

    /** NERD OGCR NEW ENTRY PAGE SPECIAL TOPIC DROP DOWN */
    @FindBy(xpath = "//*[@id='s2id_autogen16']")
    public WebElement nerdOgcrNewEntrySpecialTopicDropDown;

    /** NERD OGCR New Entry Congress Person First Name */
    public static WebElement nerdOgcrNewEntrySpecialTopicDropDownValues(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//*[@id='s2id_autogen16_results']/li[" + value + "]"));
    }

    public NERDOGCRAddNewEntryPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
