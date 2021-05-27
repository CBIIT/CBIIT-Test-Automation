package ServiceNow.ATO.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import ServiceNow.ATO.Pages.SecurityFormPage;
import ServiceNow.ATO.Utils.CommonUtil;
import ServiceNow.ATO.Utils.Constants;
import ServiceNow.ATO.Utils.ReportUtil;

public class SecurityFormStepsImpl extends SecurityFormPage{

	public SecurityFormStepsImpl() {
		super();
	}

	public void clickOnSystemAssetTab() {
		switchToFrame();
		clickOnElement(systemAssetTab);
		switchToDefaultFrame();
	}
	
	public void clickOnPortsProtocalAndServices() {
		switchToFrame();
		clickOnElement(portsProtocolsAndServicesTab);
		switchToDefaultFrame();
	}
	
	public void clickOnSystemInterconnectionsTab() {
		switchToFrame();
		clickOnElement(systemInterconnectionsTab);
		switchToDefaultFrame();
	}

	/** This method clicks on form link based on the given name, In order to 
	 * keep the dynamic behavior not moving the element into annotated varaible */
	public void clickOnFormName(String formName) {
		switchToFrame();
		clickOnElementByXpath("//a[text()='" + formName + "']");
		switchToDefaultFrame();
		CommonUtil.waitBrowser(2000);
	}
	
	public void selectFormStatus(String status) {
		selectOptionInIFrame(formStatusDropdown, status);
	}
	

	public void assignForm(String user) {
		enterTextInIFrame(assignToSearchBox, user + Keys.TAB);
	}
	
	
	public void selectState(String optionVal) {
		switchToFrame();
		selectOption(driver.findElement(By.cssSelector("[id='x_g_nci_atoaas_package.state']")), optionVal);
		driver.switchTo().defaultContent();
	}
	
	public void selectStateWithoutFrameSwicth(String optionVal) {
		//switchToFrame();
		selectOption(driver.findElement(By.cssSelector("[id='x_g_nci_atoaas_package.state']")), optionVal);
		//driver.switchTo().defaultContent();
	}
	
	
	
	public void selectRenewalDueDate(String dateStr) throws Exception {
		String DATE_FIELD_NAME = "//a[contains(@name,'fieldName')]";
		if("today".equalsIgnoreCase(dateStr)) {
			switchToFrame();
			WebElement renewalDue = driver.findElement(By.xpath(DATE_FIELD_NAME.replace("fieldName", "renewal_due")));
			selectTodayDate(renewalDue);
			driver.switchTo().defaultContent();
		}
	}
	
	public void setRenewalDueDateAsToday() throws InterruptedException {
		selectDatesTab();
		String DATE_FIELD_NAME = "//a[contains(@name,'fieldName')]";
		WebElement renewalDue = driver.findElement(By.xpath(DATE_FIELD_NAME.replace("fieldName", "renewal_due")));
		selectTodayDate(renewalDue);
	}

	public void goToTab(String tabName) throws InterruptedException {
		switchToFrame();
		switch(tabName) {
		case "Approval":
			clickOnElement(approvalTab);
			break;
		case "Assurance Levels":
			clickOnElement(assuranceLevelsTab);
			break;
		}
		switchToDefaultFrame();
	}

	public void fillApprovalDetais() throws InterruptedException {
		switchToFrame();
		enterText(verifiedByInput, "Satya Gugulothu" + Keys.TAB);
		selectTodayDateTime(verifiedOnDatePicker);
		enterText(approvedByInput, "Satya Gugulothu" + Keys.TAB);
		selectTodayDate(approvedOnDatePicker);
		switchToDefaultFrame();
	}

	public void fillSecurityCategoryImpactLevel() {
		switchToFrame();
		enterText(informationTypeSearchInput, "Global Trade Information Type" + Keys.TAB);
		selectOption(confidentialityAdjustDropdown, "Low");
		selectOption(integrityAdjustDropdown, "Low");
		selectOption(availabilityAdjustDropdown, "Low");
		enterText(rationaleTextArea, "Test Automation Rationale");
		switchToDefaultFrame();
	}

	

	public void filleAuthenticationDetails() {
		switchToFrame();
		selectOption(isStandaloneSystemDropdown, "No");
		selectOption(involvesOnlineTransactionsDropdown, "No");
		switchToDefaultFrame();
	}

	public void fillAssuranceLevels() throws InterruptedException {
		switchToFrame();
		String xpath = "//input[contains(@id,'assurance_level_deviates')]";
		String isSelected = getElementByXpath(xpath).getAttribute("value");
		if (isSelected.equals("false")) {
			getElementByXpath(xpath).click();
			Thread.sleep(2000);
		}

		selectOptionInField("Deviated IAL", "IAL1");
		selectOptionInField("Deviated AAL", "AAL1");
		selectOptionInField("Deviated FAL", "FAL1");

		String justificationXpath = "//textarea[contains(@id,'justification')]";
		getElementByXpath(justificationXpath).sendKeys("Test Automation Justification");
		switchToDefaultFrame();
	}

	public void fillSystemSecurityPlan() throws InterruptedException {
		
		switchToFrame();
		clickOnElement(newButton);
		selectOption(controlTypeDropdown, "Common");
		selectOption(implementationStatusDropdown, "Planned");
		enterText(implementationDescriptionTextarea, "Automation - Implementation description");
		captureScreenshot("System Security Plan");
		
		switchToDefaultFrame();
		
//		clickOnButtonInIframe("Save");
	}

	private void clickOnBackButton() {
		String backButtonXpath  = "//button[@data-original-title='Back']";
		clickOnElementByXpath(backButtonXpath);
	}
	
	public void clickOnDisplayedNewButton() {
		for(int i=0; i<newButtons.size(); i++) {
			if(newButtons.get(i).isDisplayed()) {
				newButtons.get(i).click();
				break;
			}
		}
	}

	public void fillSystemAsset() throws InterruptedException {
		
		switchToFrame();
		clickOnElement(newButton);
		enterText(nameInput, "test");
		enterText(productInput, "Pen drive");
		enterText(modelInput, "New");
		enterText(hostnameInput, "Automation");
		selectOption(assetTypeDropdown, "Network");
		enterText(descriptionInput, "Test description");
		enterText(vendorInput, "Test Vendor");
		enterText(versionInput, "1.0.0");
		enterText(iPAddressInput,  "localhost");
		enterText(subnetInput, "subnet test");
		enterText(locationInput, "Online");
		switchToDefaultFrame();
	}

	public void fillPortsProtocolsAndServices() throws InterruptedException {
		switchToFrame();
		clickOnDisplayedNewButton();
		enterText(serviceNameInput, "Test");
		selectOption(protocolDropdown, "HTTP");
		enterText(portInput, "8080");
		enterText(descriptionInput, "test");
		switchToDefaultFrame();	
	}

	public void fillSystemInterConnections() throws InterruptedException {
		switchToFrame();
		clickOnDisplayedNewButton();
		enterText(systemNameInput, "Test");
		enterText(securityCategorizationInput, "Test");
		enterText(organizationInput, "Test");
		enterText(connectionTypeInput, "Test connection");
		enterText(authorizationStatusInput, "Test");
		enterText(authorizingOfficialInput, "Test official");
		selectOption(agreementTypeDropdown, "ISA");
		selectTodayDate(dateOfAgreement);
		switchToDefaultFrame();	
	}
	
	public void clickOnAtoSystem(String name) {
		List<WebElement> eles = driver.findElements(By.xpath("//div[contains(text(), '" + name + "')]"));
		clickOnElementInIFrame(eles.get(eles.size() - 1));
	}

	public void clickOnFirstPackage() {
		clickOnElement(find(By.xpath("//div[@ng-click=\"openPackage(package)\"][1]")));
	}
	
	public void clickOnPackageLink(String name) {
		CommonUtil.waitBrowser(5000);
		List<WebElement> eles = driver.findElements(By.xpath("//*[text()='" + name +"']"));
		clickOnElementInIFrame(eles.get(eles.size() - 1));
	}
	
	/**
	 * This method will verify all the available verify details sections dynamically.
	 * In application in order to do verification, while doing farward & backward navigation
	 * we need to reload the verify details elements hence using findElements method instead of 
	 * @FindBys
	 */
	public void verifyAllSystemDetails() {
		List<WebElement> verifyDetailsEles = driver.findElements(By.xpath("//*[contains(text(), 'Verify Details →')]"));
		if(verifyDetailsEles.size() > 0) {
			clickOnElement(verifyDetailsEles.get(0));
			WebElement verifyAndSubmitButton = driver.findElement(By.cssSelector(".certify-btn"));
			clickOnElement(verifyAndSubmitButton);
			while(true) {
				CommonUtil.waitBrowser(3000);
				verifyDetailsEles = driver.findElements(By.xpath("//*[contains(text(), 'Verify Details →')]"));
				if(verifyDetailsEles.size() > 0) {
					clickOnElement(verifyDetailsEles.get(0));
					verifyAndSubmitButton = driver.findElement(By.cssSelector(".certify-btn"));
					clickOnElement(verifyAndSubmitButton);
				} else {
					break;
				}
			}
			
			WebElement startAttestationEle = driver.findElement(By.xpath("//*[contains(text(), 'Start Attestation')]"));
			clickOnElement(startAttestationEle);
			clickOnElement(driver.findElement(By.cssSelector(".sa-btn")));
			CommonUtil.waitBrowser(2000);
			if(isElementVisible(By.xpath("//*[contains(text(), 'View')]"))) {
			clickOnElement(driver.findElement(By.xpath("//*[contains(text(), 'View')]")));}
			clickOnElement(driver.findElement(By.xpath("//*[contains(text(), 'View')]")));
			ReportUtil.takeScreenShot(scenario, "System view");
		}
	}
	
	public void changeSystemOwner(String ownerName) throws Exception{
		switchToFrame();
		Constants.packageName = driver.findElement(By.xpath("//table[@id='x_g_nci_atoaas_package_table']//tbody//tr//td[6]//a[not(text()='Satya Gugulothu')]//..//..//td[3]//div[@class='composite_field_first']")).getText();
		Constants.packageLinkText = driver.findElement(By.xpath("//table[@id='x_g_nci_atoaas_package_table']//tbody//tr//td[6]//a[not(text()='Satya Gugulothu')]//..//..//td[3]//a")).getText();
		WebElement packageLink = driver.findElement(By.xpath("//table[@id='x_g_nci_atoaas_package_table']//tbody//tr//td[6]//a[not(text()='Satya Gugulothu')]//..//..//td[3]//a"));
		packageLink.click();
		CommonUtil.waitBrowser(4000);
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(), 'Dates')][@class='tab_caption_text']")));
		WebElement approvedByEle = driver.findElement(By.cssSelector("[id='sys_display.x_g_nci_atoaas_package.approved_by']"));
		//enterText(approvedByEle, "Satya Gugulothu" + Keys.TAB);
		CommonUtil.waitBrowser(4000);
		approvedByEle.clear();
		approvedByEle.sendKeys("Satya Gugulothu");
		CommonUtil.waitBrowser(2000);
		approvedByEle.sendKeys(Keys.ENTER);
		CommonUtil.waitBrowser(2000);
		driver.findElement(By.cssSelector("[id='sysverb_update']")).click();
		CommonUtil.waitBrowser(2000);
		String xpath = "//ul[contains(@aria-label,'ATO')]//div[text()='In Progress']";
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		clickOnElementByXpath(xpath);
		Thread.sleep(5000);
		switchToFrame();
		WebElement ele = driver.findElement(By.xpath("//table[@id='x_g_nci_atoaas_package_table']//tbody//tr//td[6]//a[not(text()='Satya Gugulothu')]//..//..//td[4]"));
		ele.click();
		CommonUtil.waitBrowser(2000);
		ele.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		CommonUtil.waitBrowser(2000);
		driver.findElement(By.cssSelector(".list-edit-input")).clear();
		driver.findElement(By.cssSelector(".list-edit-input")).sendKeys(ownerName);
		CommonUtil.waitBrowser(2000);
		driver.findElement(By.id("cell_edit_ok")).click();
		CommonUtil.waitBrowser(4000);
		

		driver.switchTo().defaultContent();
	}
	
}
