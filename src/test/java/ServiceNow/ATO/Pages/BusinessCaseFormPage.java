package ServiceNow.ATO.Pages;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.ATO.Utils.CommonUtils;
import ServiceNow.ATO.Utils.DriverObjectFactory;

public class BusinessCaseFormPage extends BasePage {

	public BusinessCaseFormPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	public static String startDate = "//input[@aria-label='Start date']";

	@FindBy(css = ".list2_body tr .composite_field_link")
	public WebElement firstPackageLink;

	@FindBy(xpath = "//a[normalize-space(text())='Quick Links']")
	public WebElement quickLinkDropdown;

	@FindBy(xpath = "(//button[@name='new'])[1]")
	public WebElement newIdeaButton;

	@FindBy(xpath = "//a[@class='select2-choice select2-default form-control']")
	public WebElement docDirectorTextBox;

	@FindBy(xpath = "(//a[@class='select2-choice select2-default form-control'])[1]")
	public WebElement businessOwner;

	@FindBy(xpath = "(//*[contains(@id,'s2id_autogen') and contains(@id,'search')])[7]")
	public WebElement businessOwnerTextBox;

	public By docDirectorInput = By.xpath("//input[@id='s2id_autogen4_search']");

	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	public WebElement docDirectorFirstResult;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_fitara_categories']")
	public WebElement FITARATextBox;

	@FindBy(id = "sp_formfield_idea_description")
	public WebElement ideaTextBox;

	@FindBy(id = "sp_formfield_comments")
	public WebElement commentBox;

	@FindBy(id = "sp_formfield_feedback")
	public WebElement feedbackBox;

	@FindBy(id = "sp_formfield_programmatic_support")
	public WebElement programaticSuport;

	@FindBy(xpath = "//button[text()='Save & Continue']")
	public WebElement saveContinue;

	@FindBy(xpath = "//button[text()='Submit Request']")
	public WebElement submitRequest;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_state']/a/span")
	public WebElement state;

	@FindBy(xpath = "//h2[text()='Activity']/parent::div")
	public WebElement expandActivity;

	public By commentBoxLocator = By.xpath("//small[@class='text-muted journal-type ng-binding']");

	@FindBy(xpath = "//button[text()='Approve']")
	public WebElement approveRequest;

	@FindBy(xpath = "//button[text()='Reject']")
	public WebElement rejectRequest;

	@FindBy(id = "sp_formfield_comments")
	public WebElement rejectComment;

	@FindBy(xpath = "//button[text()='More Information Needed']")
	public WebElement needMoreInfo;

	@FindBy(xpath = "(//span[@class=\"select2-chosen\"])[3]")
	public WebElement statusOfIdea;

	public By FITARATextBoxInput = By.xpath("//div[@id='s2id_sp_formfield_fitara_categories']//input");

	@FindBy(xpath = "(//th[@role='columnheader']//div[@aria-label=\"Created\"])[2]")
	public WebElement createdDataForBusinessCases;

	@FindBy(xpath = "(//span[@ng-if=\"$first\"])[6]")
	public WebElement firstBusinessCase;

	@FindBy(id = "tinymce")
	public WebElement businessNeedTextBox;

	@FindBy(xpath = "//button[3]")
	public WebElement submitBusinessCaseRequest;

	@FindBy(xpath = "//input[@name=\"programmatic_support\"]")
	public WebElement programmaticCHeckBox;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	@FindBy(xpath = "//span[@class='sr-only' and text()='User menu']/following-sibling::span[2]")
	public WebElement userMenu;

	@FindBy(xpath = "//a[@sn-modal-show=\"elevateRoles\"]")
	public WebElement elevateRolesButton;

	@FindBy(xpath = "//input[@name=\"elevated_role\"]")
	public WebElement elevatedRoleCheckBox;

	@FindBy(xpath = "//button[@ng-click=\"updateElevatedRoles()\"]")
	public WebElement confirmRoleUpdate;

	@FindBy(xpath = "//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr/td/span")
	private WebElement requestBuutton;
	
	@FindBy(xpath = "//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr[2]/td/span")
	private WebElement pendingApproval;
	
	//*[@id="x_g_nci_itpg_approval"]/div/div/div/div[2]/table/thead/tr/th[1]/div
	
	public void approveRequestForm() {
		clickOnPendingRequest();
		//clickOnElement(requestBuutton);
		clickOnElement(approveRequest);
	}

	public void approvePendingRequest() {
		clickOnElement(pendingApproval);
		clickOnElement(approveRequest);
	}

	public void rejectRequestForm() {
		clickOnPendingRequest();
		//clickOnElement(requestBuutton);
		clickOnElement(rejectRequest);
		try {
			Thread.sleep(1000);
		} catch (Exception ee) {

		}
		setText(rejectComment, "Rejection comment for the idea");
		clickOnElement(rejectRequest);
		try {
			Thread.sleep(15000);
		} catch (Exception ee) {

		}
		System.out.println("=============>" + getText(statusOfIdea));
	}

	public void askForMoreInfoOnRequestForm() {
		clickOnPendingRequest();
		//clickOnElement(requestBuutton);
		clickOnElement(needMoreInfo);
		try {
			Thread.sleep(15000);
		} catch (Exception ee) {

		}
		setText(rejectComment, "Need more info comment for the idea");
		clickOnElement(needMoreInfo);
		try {
			Thread.sleep(15000);
		} catch (Exception ee) {

		}
		System.out.println("=============>" + getText(statusOfIdea));
	}

	public void elevateButton() {
		clickOnElement(userMenu);
		clickOnElement(elevateRolesButton);
		clickOnElement(elevatedRoleCheckBox);
		clickOnElement(confirmRoleUpdate);
	}

	public void clickOnNativeView() {
		clickOnElement(nativeviewLink);
	}
	
	public void clickOnPendingRequest() {
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr"));
		System.out.println("Total rows are :"+rows.size());
		
		for(int i=0; i<rows.size();i++) {
			String state = driver.findElement(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td/span")).getText();
		System.out.println(state);
		if(state.equals("Pending")) {
			driver.findElement(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td/span")).click();
			break;
		}
		
		}
	}

	public void enterTextInBusinessNeedBox(String textBoxData) throws InterruptedException {
		clickOnElement(businessOwner);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setText(businessOwnerTextBox, "Justin Cam");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickOnElement(docDirectorFirstResult);
		clickOnElement(programmaticCHeckBox);
		enterText(textBoxData);

		driver.switchTo().parentFrame();

		Thread.sleep(5000);
		clickOnElement(submitBusinessCaseRequest);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sortCreatedDateForBusinessCasesInDecendingOrder() {
		clickOnElement(createdDataForBusinessCases);
		clickOnElement(createdDataForBusinessCases);
	}

	public void clickOnFirstBusinessCase() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(firstBusinessCase);
	}

	public void enterText(String allData) {
		driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < allFrames; i++) {
			try {
				driver.switchTo().frame(i);
				List<WebElement> allElements = driver.findElements(By.xpath("//html//body[@id='tinymce']"));
				for (WebElement e1 : allElements) {
					if (e1.isDisplayed()) {
						e1.sendKeys(allData);
					}
					driver.switchTo().defaultContent();
				}
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}
	}

	public void saveContinueButton() {
		clickOnElement(saveContinue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickOnElement(submitRequest);
	}

	public void verifyIfCommentIsThere() throws Exception {
		try {
			if (!isElementPresent(commentBoxLocator)) {
				throw new Exception("Comment Box is not available");
			}
		} catch (Exception e) {
			throw new Exception("Comment Box is not available");
		}
	}

	public String getState() throws Exception {
		return (getText(state));
	}

	public void enterFeedback(String feedback) {
		setText(feedbackBox, feedback);
	}

	public void expandActivity() {
		clickOnElement(expandActivity);
	}

	public void approveRequest() {
		clickOnElement(approveRequest);
	}

	public void rejectRequest() {
		clickOnElement(rejectRequest);
	}

	public void needMoreInfoOnRequest() {
		clickOnElement(needMoreInfo);
	}

	public void fillIDeaBox(String textToEnter) {
		setText(ideaTextBox, textToEnter);
	}

	public void enterComments(String textToEnter) {
		setText(commentBox, textToEnter);
	}

	public void programaticSUpportCheckBox() {
		clickOnElement(programaticSuport);
	}

	public void fillFITARATextBox() throws InterruptedException {
		clickOnElement(FITARATextBox);
		setText(FITARATextBoxInput, "Software");
		Thread.sleep(2000);
		driver.findElement(FITARATextBoxInput).sendKeys(Keys.TAB);
	}

	public void selectDocDirector(String inputText) {
		clickOnElement(docDirectorTextBox);
		setText(docDirectorInput, inputText);
		clickOnElement(docDirectorFirstResult);
	}

	public void startANewIdea() {
		clickOnElement(newIdeaButton);
	}

	public String quickLinkOptionXpath = "//a[@href=\"/ncisp?id=itpg_home_page\"]";

	public void selectOptionFromQuickLink(String optionText) {
		try {
			try {
				Thread.sleep(3000);
			} catch (Exception ee) {

			}
			clickOnElement(quickLinkDropdown);
			clickOnElementByXpath(quickLinkOptionXpath);

			// Link was changed again, adding a reliable way to navigate to the page
			// String currentURL = driver.getCurrentUrl();
			// driver.navigate().to(currentURL + "?id=itpg_home_page");
		} catch (Exception e) {
			throw e;
		}
	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("AtoTestUrl"));
	}
}
