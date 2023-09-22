package ServiceNow.ESR.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESRShortDescriptionPage {

    public ESRShortDescriptionPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** ESR ID field in short description on RITM */
    @FindBy(xpath = "//label[@for='sys_readonly.sc_req_item.u_esr_correlation_id']//span[@data-html='false']")
    public WebElement esrIDFieldText;

    /** Stage field in short description on RITM */
    @FindBy(xpath = "//label[@for='sys_readonly.sc_req_item.u_esr_correlation_id']//span[@data-html='false']")
    public WebElement stageFieldText;

    /** Project Name field in short description */
    @FindBy(xpath = "//span[@aria-label='Project Name']")
    public WebElement projectNameFieldText;
}
