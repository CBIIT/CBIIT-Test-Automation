package ServiceNow.ATO.StepsImplementation;

import org.openqa.selenium.Keys;

import ServiceNow.ATO.Pages.NewProjectPage;
import ServiceNow.ATO.Utils.CommonUtil;

public class NewProjectStepsImpl extends NewProjectPage{

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
		selectOption(applicationHostDropdown , hostigSolution);
		switchToDefaultFrame();
	}

	public void clickOnContactTab() throws InterruptedException {
		String xpath = TAB_HEADER.replace("tabMame", "Contacts");
		Thread.sleep(5000);
		clickOnElementByXpath(xpath);
		//TODO : Capture screenshot
	}
	
	public void clickOnTab(String tabName) {
		switchToFrame();
		clickOnElement(getElementByCssText(tabs, tabName));
		switchToDefaultFrame();
	}
	
	

	public void setDates() throws InterruptedException {
		clickOnTab("Dates");
		switchToFrame();
		selectTodayDate(startDate);
		selectTodayDate(approvedDate);
		selectTodayDate(renewalDate);
		selectTodayDateTime(attestedDate);
		selectTodayDateTime(verifiedDate);
		switchToDefaultFrame();
	}
<<<<<<< HEAD
	
	public void gobackToAllPackages() {
		clickOnElementByXpath("//button[@data-original-title=\"Back\"]");
	}
	
	public void sortPackages() {
		clickOnElementByXpath("//span[text()='Sort in ascending order']/parent::a");
		clickOnElementByXpath("//span[text()='Sort in descending order']/parent::a");
	}
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8

	public void setNotes(String notes) throws InterruptedException {
		clickOnTab("Notes");
		switchToFrame();
		enterText(workNotes, notes);
		switchToDefaultFrame();
	}

	public void clickOnPackageCode(String packageCode) throws InterruptedException {
		switchToFrame();
		clickOnElementByXpath("//table[contains(@id,'package_table')]//a[text()='" + packageCode +"']");
		CommonUtil.waitBrowser(3000);
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

}
