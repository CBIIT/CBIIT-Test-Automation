package CustomBusinessApp.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.Constants.DelegationTypes;



public class DelegatePage extends CommonUtils{

	
	
	
	public void selectDelegationType(DelegationTypes type) throws Exception {
		String idVal = "";
		if(type.equals(DelegationTypes.TEMPORARY)) {
			idVal = "temp";
		} else if(type.equals(DelegationTypes.PERMANENT)) {
			idVal = "perm";
		} else {
			throw new Exception("Invlid delegation type");
		}
		WebDriverUtils.getWebDriver().findElement(By.id(idVal)).click();
	}
	
	public void selectName(String name) {
		WebDriverUtils.getWebDriver().findElement(By.id("select2-select-delegate-container")).click();
		WebElement selectSearchInput = WebDriverUtils.getWebDriver().findElement(By.className("select2-search__field"));
		selectSearchInput.click();
		selectSearchInput.sendKeys(name);
		CommonUtil.waitBrowser(3000);
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector("li[role='treeitem']")));
		
	}
	
	public void selectStartDate(String date) {
		WebDriverUtils.getWebDriver().findElement(By.id("startDate")).sendKeys(date);
	}
	
	public void selectEndDate(String date) {
		WebDriverUtils.getWebDriver().findElement(By.id("endDate")).sendKeys(date);
	}
	
	public void clickOnAddbutton() {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector("[title='Add']")));
	}
	
	public void clickOnPermanentDelegateAddButton() {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("add-delegate-perm")));
	}
	
	public Boolean isDelegatePresentInTable(String name) {
		return WebDriverUtils.getWebDriver().findElements(By.linkText(name)).size() > 0;
	}
	
	public void deleteDelegator(String name) {
		String xpathVal = "//a[text()='" + name + "']//ancestor::tr//*[@aria-label='Delete']";
		WebDriverUtils.getWebDriver().findElement(By.xpath(xpathVal)).click();
	}
	
	public void clickOnDeleteButton() {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("delete-delegate-btn")));
		
	}
	
	public String getDeleteMessage()  {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), 30);
		wait.until(ExpectedConditions.textToBePresentInElement(WebDriverUtils.getWebDriver().findElement(By.id("delegateSuccessMsg")), 
				"Delegate deleted successfully."));
		return WebDriverUtils.getWebDriver().findElement(By.id("delegateSuccessMsg")).getText();
	}
}
