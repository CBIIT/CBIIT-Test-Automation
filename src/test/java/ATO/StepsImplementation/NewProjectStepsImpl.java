package ATO.StepsImplementation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ATO.Pages.NewProjectPage;
import ATO.Utils.CommonUtils;

public class NewProjectStepsImpl extends NewProjectPage {

	public NewProjectStepsImpl() {
		super();
	}

	public void selectSystem(String system) throws InterruptedException {
		switchToFrame();
		enterText(systemSearchBox, system + Keys.TAB);
		switchToDefaultFrame();
	}

	public void selectApplicationHosting(String hostigSolution) {
		switchToFrame();
		selectOption(applicationHostDropdown, hostigSolution);
		switchToDefaultFrame();
	}

	public void clickOnContactTab() throws InterruptedException {
		String xpath = TAB_HEADER.replace("tabMame", "Contacts");
		Thread.sleep(5000);
		clickOnElementByXpath(xpath);
		// TODO : Capture screenshot
	}

	public void clickOnTab(String tabName) {
		try {
			clickOnElement(getElementByCssText(tabs, tabName));
		} catch (Exception nullPException) {
			try {
				switchToFrame();
				clickOnElement(getElementByCssText(tabs, tabName));
				switchToDefaultFrame();
			} catch (Exception e) {
				throw e;
			}
		}
	}

	public void setDates() throws InterruptedException {
		clickOnTab("Dates");
	//	 switchToFrame();
		selectTodayDate(startDate);
		selectTodayDate(approvedDate);
		selectTodayDate(renewalDate);
		selectTodayDateTime(attestedDate);
		selectTodayDateTime(verifiedDate);
	//	 switchToDefaultFrame();
	}
	
	public void setDate() throws InterruptedException {
		clickOnTab("Dates");
		 switchToFrame();
		selectTodayDate(startDate);
		selectTodayDate(approvedDate);
		selectTodayDate(renewalDate);
		selectTodayDateTime(attestedDate);
		selectTodayDateTime(verifiedDate);
		 switchToDefaultFrame();
	}
	
	public void enterDates() throws InterruptedException {
		clickOnTab("Dates");
		// switchToFrame();
		selectTodayDate(startDate);
		selectTodayDate(approvedDate);
		selectTodayDate(renewalDate);
		selectTodayDateTime(attestedDate);
		selectTodayDateTime(verifiedDate);
		// switchToDefaultFrame();
	}

	public void clickOnFIrstPackage() {
		try {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickOnElement(firstPackageLink);
		} catch (Exception e) {
			throw e;
		}
	}

	public void verifyChange() {
		//switchToFrame();
		clickOnElement(verifyChange);
		//switchToDefaultFrame();
	}

	public void deletePackage() {
		clickOnElement(deleteButton);
	}

	public void signAto() {
		clickOnElementByXpath("//*[@id='sign_ato']");
		clickOnElementByXpath("//*[@id='ok_button']");
	}

	public void renewPackage() {
		clickOnElementByXpath("//button[text()='Renew']");

	}

	public void verifyAAReviewForFIPSFOrm() {
		clickOnElementByXpath("(//a[@class='linked formlink'])[1]");
		clickOnElementByXpath("//button[text()='A&A Sign off']");

	}

	public void verifyAAReviewForeAuthenticationFOrm() {
		clickOnElementByXpath("(//a[@class='linked formlink'])[2]");
		selectOption(onlineTxnDropdown, "No");
		clickOnElementByXpath("//button[text()='A&A Sign off']");
	}

	public void validatePendingAAForms() {
		clickOnElementByXpath("(//a[@class='linked formlink'])[3]");
		clickOnElementByXpath("//button[text()='A&A Sign off']");
		clickOnElementByXpath("(//a[@class='linked formlink'])[4]");
		clickOnElementByXpath("//button[text()='A&A Sign off']");
		clickOnElementByXpath("(//a[@class='linked formlink'])[5]");
		clickOnElementByXpath("//button[text()='A&A Sign off']");
		clickOnElementByXpath("(//a[@class='linked formlink'])[6]");
		clickOnElementByXpath("//button[text()='A&A Sign off']");
		clickOnElementByXpath("(//a[@class='linked formlink'])[7]");
		clickOnElementByXpath("//button[text()='A&A Sign off']");
	}

	public void openALlFormsAndUpdateAASignOff() {
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='linked formlink']"));
		for (int i = 1; i <= allLinks.size(); i++) {
			clickOnElementByXpath(("(//a[@class='linked formlink'])[" + i + "]"));
			clickOnElementByXpath(("//button[text()='A&A Sign off']"));
		}
	}

	public void gobackToAllPackages() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElementByXpath("//button[@data-original-title=\"Back\"]");
	}

	public void sortPackages() throws InterruptedException {
		clickOnElementByXpath("//*[@id=\"hdr_x_g_nci_atoaas_package\"]/th[9]/span/a");
		Thread.sleep(2000);
		clickOnElementByXpath("//*[@id=\"hdr_x_g_nci_atoaas_package\"]/th[9]/span/a");
		//clickOnElementByXpath("(//span[text()='Sorted in ascending order']/parent::a[contains(text(),'Updated')])[1]");
		//clickOnElementByXpath("(//span[text()='Sorted in descending order']/parent::a[contains(text(),'Updated')])[1]");
	}

	public String getStatus() {
		return getText(driver.findElement(By.xpath("//tbody[@class=\"list2_body\"][1]/tr[3]/td[4]")));
	}

	public void setNotes(String notes) throws InterruptedException {
		try {
			clickOnTab("Notes");
			enterText(workNotes, notes);
		} catch (Exception e) {
			try {
				clickOnTab("Notes");
				switchToFrame();
				enterText(workNotes, notes);
				switchToDefaultFrame();
			} catch (Exception e1) {
				throw e1;
			}
		}
	}

	public void clickOnPackageCode(String packageCode) throws InterruptedException {
		switchToFrame();
		clickOnElementByXpath("//table[contains(@id,'package_table')]//a[text()='" + packageCode + "']");
		CommonUtils.waitBrowser(3000);
		switchToDefaultFrame();
	}

	public void getFirstPackageCode() {
		switchToFrame();
		packageCode = getText(firstPackageLink);
		switchToDefaultFrame();
	}

	public void clickPopUpOkButton() {
		driver.switchTo().alert().accept();
	}

	public void setValue(String approvername) throws InterruptedException {
		setText(By.xpath("//input[@id='sys_display.x_g_nci_atoaas_package.approved_by']"), approvername);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sys_display.x_g_nci_atoaas_package.approved_by']"))
		.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='sys_display.x_g_nci_atoaas_package.approved_by']"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}


}
