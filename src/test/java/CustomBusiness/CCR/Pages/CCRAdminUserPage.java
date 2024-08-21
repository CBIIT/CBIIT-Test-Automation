package CustomBusiness.CCR.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

       public class CCRAdminUserPage extends CommonUtils {

        public CCRAdminUserPage() {
            PageFactory.initElements(WebDriverUtils.webDriver, this);
        }

        /** Positions tab**/
        @FindBy(xpath = "//li//a[.=' Positions ']")
        public WebElement tabPositions;

        /**  button Add Position**/
        @FindBy(xpath = "//a[@class='btn btn-default btn-sm border-0 mt-0 mb-0 ng-scope']")
        public WebElement buttonAddPosition;

        /**  field Position Title**/
        @FindBy(xpath = "//input[@id='title']")
        public WebElement fieldPositionTitle;

        /**  field Description**/
        @FindBy(xpath = "//body[@data-id='description']//p")
        public WebElement fieldDescription;

        /**  Todays Date Actiev Datepicker Choice**/
        @FindBy(xpath = "//button[@class='btn btn-default btn-sm active']")
        public WebElement todaysDateActiveField;

        /**  Open Date Calendar**/
        @FindBy(xpath = "(//i[@class='fa fa-calendar'])[1]")
        public WebElement openDateCalendar;

        /**  Description text box iframe**/
        @FindBy(xpath = "//iframe[@id='description_ifr']")
        public WebElement descriptionTextBoxIframe;

        /**  button Save position**/
        @FindBy(xpath = "(//div[@class='text-center']//button[.=' Save '])[1]")
        public WebElement buttonSaveNewPosition;


}
