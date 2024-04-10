package ServiceNow.PlatformBusinessApps.NERD.selenium.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Covid19ActivitiesSubmissionsPage extends CommonUtils {

    /**
     * ------------ COVID-19 ACTIVITIES SUBMISSION PAGE -----------
     */

    /** COVID-19 ACTIVITIES SUBMISSION Link */
    @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[4]")
    public WebElement covid19ActivitiesSubmissionLink;

    /** NIH COVID--19 STRATEGIC PLAN CHECK BOXES**/
    @FindBy(xpath = "//*[@id='x_26385_crs_kd_u_kb_nih_covid_19_strategic_plan']/div[2]/div")
    public List<WebElement> nihCovid19StrategicPlanCheckBoxes;

    /** NIH COVID--19 STRATEGIC PLAN CHECK BOXES AS A SINGLE ELEMENT DYNAMIC XPATH**/
    public static WebElement nihCovid19StrategicPlanCheckBoxesSingleElement(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//md-checkbox[@aria-label='" + value + "']//div[@class='md-container md-ink-ripple']"));
    }

    /** NIH COVID--19 SPECIAL TOPIC COVID-19 CHECK BOX**/
    @FindBy(xpath = "//md-checkbox[@aria-label='COVID-19']//div[@class='md-container md-ink-ripple']")
    public WebElement nihCovid19SpecialTopicCovid19CheckBox;

    /** NIH COVID--19 SPECIAL TOPIC BIG DATA/DATA SHARING CHECK BOX**/
    @FindBy(xpath = "//md-checkbox[@aria-label='Big data/Data sharing']//div[@class='md-container md-ink-ripple']")
    public WebElement nihCovid19SpecialTopicBigDataDataSharingCheckBox;

    /** NIH COVID--19 STRATEGIC PLAN PRIORITY 1 CHECK BOX **/
    @FindBy(xpath = "//md-checkbox[contains(@aria-label,'Priority 1: Improve Fundamental Knowledge')]//div[contains(@class,'md-container md-ink-ripple')]")
    public WebElement nihCovid19StrategicPlanPriority1CheckBox;

    /** NIH COVID--19 CATEGORY SUBMISSION SAVE BUTTON **/
    @FindBy(xpath = "//button[contains(@ng-show,'c.save')]")
    public WebElement nihCovid19CategorySubmissionSaveButton;

    /** NIH COVID--19 CATEGORY SUBMISSION OK BUTTON **/
    @FindBy(xpath = "//button[normalize-space()='Ok']")
    public WebElement nihCovid19CategorySubmissionOkButton;

    /** NIH COVID--19 CATEGORY SUBMISSION ALL RECORDS LIST **/
    @FindAll({@FindBy(xpath = "//div[contains(@class,'panel-default panel ng-scope ng-isolate-scope panel-open')]//ul[contains(@class,'list-group ng-scope')]//li//child::div[2]//child::a")})
    public List<WebElement> nihCovid19CategorySubmissionAllRecordsList;

    /** NERD COVID-19 SUBMISSIONS LAST Button */
    @FindBy(xpath = "(//ul[contains(@class,'pagination-sm pagination ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-dirty ng-valid-parse')]//a[contains(@class,'ng-binding')][normalize-space()='Last']")
    public WebElement nerdOCovid19SubmissionLastButton;

    /** NERD COVID-19 SUBMISSIONS ITEM PER PAGE TEXT */
    @FindBy(xpath = "(//div[contains(@class,'panel-body')])[5]//child::div//child::div[2]")
    public WebElement nerdOCovid19SubmissionItemsPerPageText;

    /** NERD Other Accomplishments Button */
    @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[2]")
    public WebElement nerdOtherAccomplishmentsButton;

    /** ------------ CREATE NEW OTHER ACCOMPLISHMENTS SECTION ----------- */

    public Covid19ActivitiesSubmissionsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}