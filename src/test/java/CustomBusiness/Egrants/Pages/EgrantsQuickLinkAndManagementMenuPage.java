package CustomBusiness.Egrants.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EgrantsQuickLinkAndManagementMenuPage {

	/**
	 * myOGA link
	 */
	@FindBy (xpath = "//a[text()='myOGA']")
	public WebElement myOGALink;

	/**
	 * eRA GM link
	 */
	@FindBy (xpath = "//a[text()='eRA GM']")
	public WebElement eRAGMLink;

	/**
	 * PMS link
	 */
	@FindBy (xpath = "//a[text()='PMS']")
	public WebElement pMSLink;


	public static WebElement dynamicUserTextLocator(String user) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//p[contains(text(),'" + user + "')]"));
	}
	/*public static WebElement dynamicUserTextLocator(String user) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//p[contains(text(),'Logged in as:"+ user + "')]"));
	}*/

	public static WebElement dynamicLinkLocator(String text) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + text + "']"));
	}

	public EgrantsQuickLinkAndManagementMenuPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}