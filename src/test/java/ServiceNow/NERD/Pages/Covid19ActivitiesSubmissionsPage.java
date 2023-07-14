package ServiceNow.NERD.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Covid19ActivitiesSubmissionsPage extends CommonUtils {

    /**
     * ------------ COVID-19 ACTIVITIES SUBMISSION PAGE -----------
     */

    /** NIH COVID--19 STRATEGIC PLAN CHECK BOXES**/
    @FindBy(xpath = "//*[@id='x_26385_crs_kd_u_kb_nih_covid_19_strategic_plan']/div[2]/div")
    public List<WebElement> nihCovid19StrategicPlanCheckBoxes;

    /** NIH COVID--19 STRATEGIC PLAN CHECK BOXES AS A SINGLE ELEMENT DYNAMIC XPATH**/
    public static WebElement nihCovid19StrategicPlanCheckBoxesSingleElement(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//md-checkbox[@aria-label='" + value + "']//div[@class='md-container md-ink-ripple']"));
    }
    public Covid19ActivitiesSubmissionsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}