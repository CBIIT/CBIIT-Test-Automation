package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class AligningExpectationsPage extends CommonUtils {

	/* ------ Description button ------ */
	@FindBy(id = "field-AE-01")
	public WebElement description;
	
	/* ------ Radio button for NO additional commets ------ */
	@FindBy(id = "toDiscussNoradio")
	public WebElement additionalCommentNoRadioButton;

	/* ------ Save Button ------ */
	@FindBy(id = "btnSave")
	public WebElement saveButton;

	/* ------ Successful submission message ------ */
	@FindBy(css = ".alert.alert-success h4")
	public WebElement successMessage;

	/* ------ Review and Take action button ------ */
	@FindBy(xpath = "//span[text()='REVIEW & TAKE ACTION']//parent::a")
	public WebElement reviewAndTakeActionButton;

	/* ------ Send IDP to Trainee Button ------ */
	@FindBy(css = "a[onclick='form_submit()']")
	public WebElement sendIDPToTraineeButton;

	/* ------ IDP Renewal option button ------ */
	@FindBy(id="344")
	public WebElement renewalOption;
	
	/* ------ Text to verify Renewal year updates ------ */
	@FindBy(id="updatesForRenewalYear")
	public WebElement updatesForRenewalYearText;
	
	/* ------ Save and Previous button ------ */
	@FindBy(id="saveAndPreviousBtn")
	public WebElement saveAndPreviousBtn;
    
	/* ------ On Hold Text message ------ */
	@FindBy(css = "#OnHoldModal .modal-body h4")
	public WebElement onHoldMessage;

	/* ------ Checkbox to verify meeting ------ */
	@FindBy(id = "isMeetingVerified")
	public WebElement verifyMeetingCheckBox;
	
	public AligningExpectationsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}