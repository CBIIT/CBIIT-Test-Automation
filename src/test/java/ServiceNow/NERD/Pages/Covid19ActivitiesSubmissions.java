package ServiceNow.NERD.Pages;

import com.nci.automation.web.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Covid19ActivitiesSubmissions extends CommonUtils {

    /**
     * ------------ COVID-19 ACTIVITIES SUBMISSION PAGE -----------
     */

    /** NIH COVID--19 STRATEGIC PLAN CHECK BOXES**/
    @FindBy(xpath = "//*[@id=\"x_26385_crs_kd_u_kb_nih_covid_19_strategic_plan\"]/div[2]/div")
    public WebElement nihCovid19StrategicPlanCheckBoxes;
}
