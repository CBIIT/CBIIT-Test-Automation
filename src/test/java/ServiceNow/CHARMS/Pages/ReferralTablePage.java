package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferralTablePage {

    /* REFERRAL PREVIEW BUTTON */
    @FindBy(xpath = "//button[@id='viewr.x_naci_family_coho_family_history_details.proband_screener']")
    public WebElement referralPreviewButton;

    /* OPEN RECORD BUTTON */
    @FindBy(xpath = "//a[contains(text(),'Open Record')]")
    public WebElement openRecordButton;
    public ReferralTablePage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
