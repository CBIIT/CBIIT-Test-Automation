package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class AligningExpectationsPage extends CommonUtils {

	@FindBy(id = "field-AE-01")
	public WebElement description;
	
	@FindBy(id = "toDiscussNoradio")
	public WebElement additionalCommentNoRadioButton;

	@FindBy(id = "btnSave")
	public WebElement saveButton;

	@FindBy(css = ".alert.alert-success h4")
	public WebElement successMessage;

	@FindBy(xpath = "//span[text()='REVIEW & TAKE ACTION']//parent::a")
	public WebElement reviewAndTakeActionButton;

	@FindBy(css = "a[onclick='form_submit()']")
	public WebElement sendIDPToTraineeButton;

	@FindBy(id="344")
	public WebElement renewalOption;
	
	@FindBy(id="updatesForRenewalYear")
	public WebElement updatesForRenewalYearText;
	
	@FindBy(id="saveAndPreviousBtn")
	public WebElement saveAndPreviousBtn;
    
	@FindBy(css = "#OnHoldModal .modal-body h4")
	public WebElement onHoldMessage;

	@FindBy(id = "isMeetingVerified")
	public WebElement verifyMeetingCheckBox;
	
	public AligningExpectationsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}