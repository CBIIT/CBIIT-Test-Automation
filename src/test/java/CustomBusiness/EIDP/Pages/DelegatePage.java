package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.Constants.DelegationTypes;

public class DelegatePage extends CommonUtils {

	/* ------ Delegate added success message ------ */
	@FindBy(xpath = "//*[@id=\"delegateSuccessMsg\"]")
	public WebElement deleteSuccessMsg;

	/* ------ Delegate delete button ------ */
	@FindBy(id = "delete-delegate-btn")
	public WebElement deleteButton;

	/* ------ Delegate deleted success message ------ */
	@FindBy(id = "delegateSuccessMsg")
	public WebElement delegateDeleteSuccessMsg;

	/***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS
     * @param name
     * @return
     */
    public static WebElement dalegatedynamicLocator(String name) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + name + "']//ancestor::tr//*[@aria-label='Delete']"));
    }

	public void selectDelegationType(DelegationTypes type) throws Exception {
		String idVal = "";
		if (type.equals(DelegationTypes.TEMPORARY)) {
			idVal = "temp";
		} else if (type.equals(DelegationTypes.PERMANENT)) {
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
		dalegatedynamicLocator(name).click();
		clickOnDeleteButton();
	}

	public void clickOnDeleteButton() {
		CommonUtils.click(deleteButton);
	}

	public String getDeleteMessage() {
		CommonPage.waitForVisibility(delegateDeleteSuccessMsg);
		 return delegateDeleteSuccessMsg.getText();
	}
}
