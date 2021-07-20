package CustomBusinessApp.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class AligningExpectationsPage extends CommonUtils {

	@FindBy(how =  How.ID, id = "field-AE-01")
	public WebElement description;
	
	@FindBy(how = How.ID, id = "toDiscussNoradio")
	public WebElement additionalCommentNoRadioButton;
	
	@FindBy(how = How.ID, id = "btnSave")
	public WebElement saveButton;
	
	@FindBy(how = How.CSS, css = ".alert.alert-success h4")
	public WebElement successMessage;
	
	@FindBy(how = How.XPATH, xpath = "//span[text()='REVIEW & TAKE ACTION']//parent::a")
	public WebElement reviewAndTakeActionButton;
	
	@FindBy(css = "a[onclick='form_submit()']")
	public WebElement sendIDPToTraineeButton;

	@FindBy(css = "#OnHoldModal .modal-body h4")
	public WebElement onHoldMessage;
	
	public AligningExpectationsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
