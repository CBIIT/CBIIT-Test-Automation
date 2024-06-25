package ServiceNow.PlatformBusinessApps.NERD.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdHoc_Data_Call_Submissions_Page {

    /**
     * ------------ AD HIC DATA CALL SUBMISSION PAGE -----------
     */

    /** AD HOC DATA CALL SUBMISSION ACCORDION LINK */
    @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[5]")
    public WebElement adHocDataCallSubmissionAccordionLink;

    /** AD HOC DATA CALL CREATE NEW SUBMISSION LINK BUTTON */
    @FindBy(xpath = "(//a[@ng-click='c.gotoNewSubmission(tab.tmpl,$event)'][normalize-space()='+ Create new Submission'])[5]")
    public WebElement adHocDataCallCreateNewSubmissionButton;

    /** AD HOC DATA CALL SUBMISSION - Point of Contact Text Box */
    @FindBy(xpath = "//input[@id='x_26385_crs_kd_u_kb_poc']")
    public WebElement adHocDataCallSubmissionPOCTextBox;

    public AdHoc_Data_Call_Submissions_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}