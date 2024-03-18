package ServiceNow.SSJ.selenium.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StadtmanVacancyPage extends CommonUtils {

    public StadtmanVacancyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Enable Focus Area checkbox **/
    @FindBy(xpath = "//input[@id='BasicInfo_requireFocusArea']")
    public WebElement enableFocusAreaCheckbox;

    /** Position Classification Dropdown  Senior Investigator **/
    @FindBy(xpath = "(//div[contains(text(),'Senior Investigator')])[3]")
    public WebElement positionSeniorInvestigator;

    /** Organizational Code HNA **/
    @FindBy(xpath = "//div[@title='HNA']")
    public WebElement orgHNA;
}
