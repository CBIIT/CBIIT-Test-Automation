package ServiceNow.ESR.Pages;

import appsCommon.PageInitializer;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCINativeViewPage {

    public NCINativeViewPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Filter navigator in Native View NCI Home Page */
    @FindBy(xpath = "//input[@placeholder='Filter navigator']")
    public WebElement nativeViewFilterNavigator;

    /** Create ESR Button under the Engineering Service Request section */
    @FindBy(xpath = "//ul[@aria-label='Modules for Application: ESR - Engineering Support Request']//li[6]//div[1]//div[1]//a[1]")
    public WebElement createTicketForESR;

    /** Shopping Cart text in ESR */
    @FindBy(xpath = "//strong[contains(text(),'Shopping Cart')]")
    public WebElement shoppingCartTextESR;

    /** Organizational Affiliation text in ESR */
    @FindBy(xpath = "//span[@aria-label='Organizational Affiliation']")
    public WebElement organizationalAffiliationTextForESR;
}
