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

        /**  field 1 required documents**/
        @FindBy(xpath = "//input[@id='upload_0']")
        public WebElement fielOneReqDocuments;

        /**  field 2 required documents**/
        @FindBy(xpath = "//input[@id='upload_1']")
        public WebElement fielTwoReqDocuments;

        /**  field Position Title**/
        @FindBy(xpath = "//input[@id='title']")
        public WebElement fieldPositionTitle;

        /**  field Description**/
        @FindBy(xpath = "//body[@data-id='description']//p")
        public WebElement fieldDescription;

        /**  Todays Date Active Datepicker Choice**/
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

        /**  button Remove newly created position**/
        @FindBy(xpath = "(//button[@class='btn btn-sm btn-danger m-0'])[1]")
        public WebElement buttonRemoveNewlyCreatedPosition;

        /**  button Ok Removing Position Modal**/
        @FindBy(xpath = "(//button[@ng-click='buttonClicked(button)'])[2]")
        public WebElement buttonOkRemovingPositionModal;

        /**  Position was removed Confirmation Message**/
        @FindBy(xpath = "//p[.='The position and all associated applicant data have been removed from the system.']")
        public WebElement confirmationMessagePositionWasRemoved;

        /**  Acknowledge Position was removed Confirmation Modal**/
        @FindBy(xpath = "//button[@ng-click='buttonClicked(button)']")
        public WebElement acknowledgeConfirmationModalPositionWasRemoved;
       }
