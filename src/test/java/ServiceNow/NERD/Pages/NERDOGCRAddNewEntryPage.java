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

    public NERDOGCRAddNewEntryPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
