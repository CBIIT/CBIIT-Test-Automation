package ServiceNow.CICDBuild.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class DevOpsNativeViewPage extends CommonUtils {

	/** Native View application selector drop down */
//            @FindBy (xpath = "//*[@id='application_picker_select']")
//            public WebElement applicationSelectorDropDown;

	/** Native View application selector drop down */
	@FindBy(xpath = "/html/body/div[5]/div/div/header/div[1]/div/div[2]/div/div[1]/application-picker/div/div/span/select")
	// @FindBy(xpath = "//select[@id='application_picker_select']")
	public WebElement applicationSelectorDropDown;

	/** Drop down applications */
	@FindBy(xpath = "//*[@id='application_picker_select']/option")
	public List<WebElement> dropDownApplications;

	/** Show selected application button */
	@FindBy(xpath = "(//div[@class='form-group']/a)[2]")
	public WebElement showSelectedApplicationButton;

	/** Native View sandbox iFrame */
	@FindBy(id = "gsft_main")
	public WebElement nativeViewSandboxIframe;

	/** Build this application button */
	@FindBy(xpath = "//button[@id='cicd_run_build']")
	public WebElement buildThisApplicationButton;

	/** Select deployment type drop down */
	@FindBy(xpath = "//select[@id='categorySelect']")
	public WebElement selectDeploymentDropDown;

	/** Build button */
	@FindBy(xpath = "//input[@name='Build']")
	public WebElement buildButton;

	/** List of sets pending code review list */
	@FindBy(xpath = "//*[contains(text(),'code_review')]")
	public List<WebElement> listOfSetsPendingCodeReview;

	/** List of sets pending code review list after being rejected */
	@FindBy(xpath = "//*[contains(text(),'code_review_rejected')]")
	public List<WebElement> listOfSetsPendingCodeReviewAfterRejected;

	/** Move right button */
	@FindBy(xpath = "(//div[@id='addRemoveButtons']/a)[1]")
	public WebElement moveRightButton;

	/** CICD_Dev_Ops - - in progress options */
	@FindBy(xpath = "//option[starts-with(@title,'CICD_Dev_Ops') and contains(text(),'in progress')]")
	public List<WebElement> listOfCICDDevOpsInProgress;

	public DevOpsNativeViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
