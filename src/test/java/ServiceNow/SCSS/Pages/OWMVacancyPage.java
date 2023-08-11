package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OWMVacancyPage  extends CommonUtils {

    public OWMVacancyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** SCSS Landing Page title **/
    @FindBy(xpath = "//div//h1[contains(text(),'Specialized Scientific Jobs')]")
    public WebElement scssLandingPageTitle;
}
