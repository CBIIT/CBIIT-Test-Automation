package ServiceNow.ITPG.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ITPG.Utils.CommonUtils;

public class PortalViewPage extends BasePage {

	public PortalViewPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	@FindBy(id = "sysverb_new")
	public WebElement newIdeaButton;

	@FindBy(id = "filter")
	private WebElement filterMenu;

	/** Left navigation filtered list */
	@FindAll({ @FindBy(css = "[aria-label='Submodules for Module: Idea'] li") })
	public List<WebElement> filteredIdeasList;

	@FindAll({ @FindBy(css = "[aria-label='Submodules for Module: Business Case'] li") })
	public List<WebElement> filteredBusinessList;

	@FindBy(id = "x_g_nci_itpg_idea.idea_description")
	public WebElement ideaTextBox;

	@FindBy(id = "sp_formfield_comments")
	public WebElement commentBox;

	@FindBy(id = "label.ni.x_g_nci_itpg_idea.programmatic_support")
	public WebElement programaticSuport;

	@FindBy(css = ".icon-locked:nth-child(1)")
	public WebElement FITARAlock;

	public By FITARATextBoxInput = By.id("choice.x_g_nci_itpg_idea.fitara_categories");

	public By docDirectorInput = By.xpath("//input[@id='s2id_autogen4_search']");

	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	public WebElement docDirectorFirstResult;

	@FindBy(id = "sys_display.x_g_nci_itpg_idea.doc_director")
	public WebElement docDirectorTextBox;

	@FindBy(xpath = "//button[text()='Save & Continue']")
	public WebElement saveContinue;

	@FindBy(xpath = "//button[text()='Submit Request']")
	public WebElement submitRequest;
	
	@FindBy(linkText = "Pending")
	public WebElement pending;

	@FindBy(xpath = "//td[3]/a")
	public WebElement firstIdeaCase;

	@FindBy(xpath = "//td[3]/div/div[2]/a")
	public WebElement firstBusinessCase;

	@FindBy(xpath = "//button[text()='Approve']")
	public WebElement approveRequest;
	
	@FindBy(id = "approve_bottom")
	public WebElement approveButton;

	@FindBy(id = "sys_readonly.x_g_nci_itpg_idea.state")
	public WebElement state;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	@FindBy(id = "sys_display.x_g_nci_itpg_case.business_owner")
	public WebElement businessOwner;

	@FindBy(xpath = "(//*[contains(@id,'s2id_autogen') and contains(@id,'search')])[7]")
	public WebElement businessOwnerTextBox;

	@FindBy(id = "label.ni.x_g_nci_itpg_case.programmatic_support")
	public WebElement programmaticCHeckBox;
	
	@FindBy(xpath = "//div[@id='tabs2_section']/span[3]/span/span[2]")
	public WebElement AlternativeAndAnalysis;
	
	@FindBy(xpath = "//div[@id='tabs2_section']/span[4]/span/span[2]")
	public WebElement AcquisitionAndFunding;

	@FindBy(id = "465850e91b31f0146daea681f54bcb3b")
	public WebElement submitBusinessCaseRequest;
	
	@FindBy(xpath = "//span[@class='sr-only' and text()='User menu']/following-sibling::span[2]")
	public WebElement userMenu;

	@FindBy(xpath = "//a[@sn-modal-show=\"elevateRoles\"]")
	public WebElement elevateRolesButton;

	@FindBy(xpath = "//input[@name=\"elevated_role\"]")
	public WebElement elevatedRoleCheckBox;

	@FindBy(xpath = "//button[@ng-click=\"updateElevatedRoles()\"]")
	public WebElement confirmRoleUpdate;

	public void clickOnNativeView() {
		clickOnElement(nativeviewLink);
	}

	public void clickOnAllIdeas() {
		// Filter System Logs from side menu
		setText(filterMenu, "Idea");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredIdeasList.size(); i++) {
			if (filteredIdeasList.get(i).getText().contains("All")) {
				filteredIdeasList.get(i).click();
			}
		}

	}

	public void startANewIdea() {
		switchToFrame();
		clickOnElement(newIdeaButton);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void fillIDeaBox(String textToEnter) {
		switchToFrame();
		setText(ideaTextBox, textToEnter);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void enterComments(String textToEnter) {
		switchToFrame();
		setText(commentBox, textToEnter);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void programaticSUpportCheckBox() {
		switchToFrame();
		clickOnElement(programaticSuport);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void fillFITARATextBox() throws InterruptedException {
		switchToFrame();
		clickOnElement(FITARAlock);
		WebElement dropdown = driver.findElement(FITARATextBoxInput);
		dropdown.findElement(By.xpath("//option[. = 'Software']")).click();
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void selectDocDirector(String inputText) {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(docDirectorTextBox);
		setText(docDirectorTextBox, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		docDirectorTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		docDirectorTextBox.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void saveContinueButton() {
		switchToFrame();
		clickOnElement(saveContinue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickOnElement(submitRequest);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void clickOnFirstIdeaCase() {
		switchToFrame();
		clickOnElement(firstIdeaCase);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void clickOnFirstBusinessCase() {
		switchToFrame();
		clickOnElement(firstBusinessCase);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void approveRequest() {
		switchToFrame();
		clickOnElement(approveRequest);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public String getState() throws Exception {
		switchToFrame();
		String State = getText(state);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		return (State);

	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("AtoTestUrl"));
	}

	public void clickOnAllBusiness() {
		// Filter System Logs from side menu
		filterMenu.clear();
		setText(filterMenu, "Business Case");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredBusinessList.size(); i++) {
			if (filteredBusinessList.get(i).getText().contains("All")) {
				filteredBusinessList.get(i).click();
			}
		}

	}

	public void enterTextInBusinessNeedBox(String textBoxData) throws InterruptedException {
		driver.switchTo().frame(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setText(businessOwner, "Justin Campany");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		businessOwner.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		businessOwner.sendKeys(Keys.RETURN);
		clickOnElement(programmaticCHeckBox);
		enterText(textBoxData);
		
		
		  driver.switchTo().defaultContent(); 
		  switchToDefaultFrame();
		  driver.switchTo().defaultContent(); 
		  switchToFrame();
		  
		  clickOnElement(AlternativeAndAnalysis); 
		  enterTexts(textBoxData);
		  
		  driver.switchTo().defaultContent(); 
		  switchToDefaultFrame();
		  driver.switchTo().defaultContent(); 
		  switchToFrame();
		  
		  clickOnElement(AcquisitionAndFunding); 
		  enterTextss(textBoxData);
		 
		
		driver.switchTo().defaultContent();
		  switchToDefaultFrame(); 
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(0);
		  clickOnElement(submitBusinessCaseRequest);
		  

		Thread.sleep(2000);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void enterTextss(String allData) {
		
		//driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		
		for (int i = 0; i < 6; i++) {
			try {
				
				List<WebElement> allElements = driver.findElements(By.xpath("//html//body[@id='tinymce']"));
				System.out.println("Printing Value of I" +i);
				//e1.sendKeys(allData);
				
				  for (WebElement e1 : allElements) { if (e1.isDisplayed()) {
					  driver.switchTo().frame(i);
					  e1.sendKeys(allData);
				  
				  }
				  
				  }
				 
				driver.switchTo().defaultContent();
				//switchToDefaultFrame();
				//driver.switchTo().parentFrame();
				driver.switchTo().frame(0);
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}
	
	}
	
public void enterTexts(String allData) {
		
		//driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		
		for (int i = 0; i < 3; i++) {
			try {
				driver.switchTo().frame(i);
				WebElement e1 = driver.findElement(By.xpath("//html//body[@id='tinymce']"));
				e1.sendKeys(allData);
				/*
				 * for (WebElement e1 : allElements) { if (e1.isDisplayed()) {
				 * e1.sendKeys(allData);
				 * 
				 * }
				 * 
				 * }
				 */
				driver.switchTo().defaultContent();
				//switchToDefaultFrame();
				//driver.switchTo().parentFrame();
				driver.switchTo().frame(0);
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}
	
	}
	
public void enterText(String allData) {
		
		//driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		
		for (int i = 0; i < 2; i++) {
			try {
				driver.switchTo().frame(i);
				WebElement e1 = driver.findElement(By.xpath("//html//body[@id='tinymce']"));
				e1.sendKeys(allData);
				/*
				 * for (WebElement e1 : allElements) { if (e1.isDisplayed()) {
				 * e1.sendKeys(allData);
				 * 
				 * }
				 * 
				 * }
				 */
				driver.switchTo().defaultContent();
				//switchToDefaultFrame();
				//driver.switchTo().parentFrame();
				driver.switchTo().frame(0);
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}
	
	}
	
	public void approveRequestForm() throws InterruptedException {
		switchToFrame();
		Thread.sleep(2000);
		clickOnElement(pending);
		//clickOnPendingRequest();
		
		Thread.sleep(2000);
		clickOnElement(approveButton);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}
	
	public void clickOnPendingRequest() {
		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr"));
		System.out.println("Total rows are :" + rows.size());

		for (int i = 0; i < rows.size(); i++) {
			String state = driver.findElement(By.xpath(
					"//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr[" + (i + 1) + "]/td/span"))
					.getText();
			System.out.println(state);
			if (state.equals("Pending")) {
				driver.findElement(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr["
						+ (i + 1) + "]/td/span")).click();
				break;
			}

		}
	}
	
	public void elevateButton() throws InterruptedException {
		clickOnElement(userMenu);
		clickOnElement(elevateRolesButton);
		clickOnElement(elevatedRoleCheckBox);
		clickOnElement(confirmRoleUpdate);
		Thread.sleep(5000);
	}

}
