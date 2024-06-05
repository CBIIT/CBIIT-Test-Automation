package ServiceNow.PlatformBusinessApps.NERD.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class NERDDynamicXPATHS extends CommonUtils {

	/**
	 * TOP ACCOMPLISHMENT TITLE
	 * @param value
	 * @return
	 */
	public WebElement topAccomplishmentSubmissionTitle(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']"));
	}

	/**
	 * ------------ COLLABORATION SUBMISSIONS BY DOC PLANNING CONTACT -----------
	 */

	/** Submit to CRS Button */
	public WebElement submitToCRSButton(String value) {
		return WebDriverUtils.webDriver
				.findElement(By.xpath("//a[contains(text(),'" + value + "')]/following::button[1]"));
	}

	/** Edit Button */
	public WebElement editButton(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[contains(text(),'" + value + "')]/following::button/span[contains(text(),'Edit')])[1]"));
	}

	/** Delete Button */
	public WebElement deleteButton(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//a[text()='" + value + "']/following::button/span[contains(text(),'Delete')])[1]"));
	}

	/** DOC Planning Submissions Categories */
	public WebElement docPlanningSubmissionCategories(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//div[contains(@class,'panel-default panel ng-isolate-scope')])[" + value + "]//child::div//child::h4"));
	}

	/** DOC Planning Top Accomplishments Published texts */
    public static List<WebElement> docPlaningPublishedSubmissions(String value) {
	List<WebElement> docPlanningPublishedList = WebDriverUtils.webDriver.findElements(By.xpath("(//div[contains(@class,'panel-default panel ng-isolate-scope')])[" + value + "]//child::div//child::h4//parent::span//parent::a//parent::h4//parent::div//parent::div//child::div[2]//child::div//child::md-content//child::md-content//child::md-list//child::md-list-item//child::div//child::div[3]//child::div[3]"));
	return docPlanningPublishedList;
    }

	/** Return Button to Staff */
	public WebElement returnButtonToStaff(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[2]"));
	}

	/** Return Button to DOC */
	public WebElement returnButtonToDOC(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/../../following-sibling::div/button[2][@class='md-raised md-secondary md-button md-ink-ripple']"));
	}

	/** Returned to Staff Member Text */
	public WebElement returnedToStaffMemberText(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::div[3]"));
	}

	/** Returned to Staff Member Text Verification */
	public WebElement returnedToStaffMemberTextVerification(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'"+value+"')]/../../following-sibling::div/div[contains(text(),'Returned to Staff Member')]"));
	}

	/** Author Text */
	public WebElement authorTextDocSubmission(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::div[1]"));
	}

	/** CollaborationAutomationTest link */
	public WebElement collaborationAutomationTestLink(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'" + value + "')]"));
	}

	/**
	 * ------------THE END OF COLLABORATION SUBMISSIONS BY DOC PLANNING CONTACT
	 * -----------
	 */

	/** ------------ CRS BUTTONS ------------ */
	/**
	 * This locators will work on CRS pages for staff member
	 * with all links such as: Top Accomplishments, Collaborations and etc
	 * For Submit button - we can use Submit to CRS Button locator.
	 * 
	 */

	/** Edit to CRS Button */
	public WebElement eiditCRSButton(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[2]"));
	}

	/** Delete to CRS Button */
	public WebElement deleteCRSButton(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[3]"));
	}

	/** ------------ THE END OF CRS BUTTONS ---------- */

	/** ------------ COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER ----------- */

	/** Publish to NERD Button */
	public WebElement publishToNERDButton(String value) {
		return WebDriverUtils.webDriver
				.findElement(By.xpath("//a[contains(text(),'" + value + "')]/following::button[1]"));
	}

	/** Return Button */
	public WebElement returnButton(String value) {
		return WebDriverUtils.webDriver
				.findElement(By.xpath("//a[contains(text(),'" + value + "')]/following::button[2]"));

	}

	/** Returned to DOC text */
	public WebElement returnedToDOCText(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='" + value + "']//parent::h3//parent::div//parent::div//child::div[3]/child::div"));
	}

	/**
	 * CRS Knowledge Management System Home Page => NERD => Collaborations List
	 * value
	 */
	public WebElement publishedCollaboration(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']"));
	}

	/** Returned to DOC text */
	public WebElement returnedToDOCTextCRS(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'NCI Cancer Data Standards Repository and Registry (caDSR)')]/../../following-sibling::div/div[contains(text(),'" + value + "')]"));
	}

	/**
	 * ------------ THE END OF COLLABORATION SUBMISSIONS BY CRS REVIEWER -----------
	 */

	/** ------------ COLLABORATION SUBMISSIONS BY STAFF MEMBER ----------- */

	/** Edit Button Returned to Staff Member */
	public WebElement editButtonReturnedToStaffMember(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[2]"));
	}

	/** Delete Button Returned to Staff Member */
	public WebElement deleteButtonReturnedToStaffMember(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[3]"));
	}

	/** Submit Button Returned to Staff Member */
	public WebElement submitButton(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[1]"));
	}

	/** Under Review Text */
	public WebElement underReviewText(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::div[2]"));
	}

	/** Submit Button To DOC Planning Contact */
	public WebElement submitButtonToDOCPlanningContact(String value) {
		return WebDriverUtils.webDriver
				.findElement(By.xpath("//a[contains(text(),'" + value + "')]/following::button[1]"));
	}

	/** Delete Button */
	public WebElement deleteButtonByStaffMember(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']/following::button[3]"));
	}

	/**
	 * ------------ THE END OF COLLABORATION SUBMISSIONSIONS BY STAFF MEMBER
	 * -----------
	 */

	/** ------------ COVID-19 ACTIVITIES SUBMISSIONS BY SUPER USER / STAFF MEMBER ----------- */

	/**
	 * CRS Knowledge Management System Home Page => NERD => COVID-19 ACTIVITIES List view
	 * value
	 */
	public WebElement publishedCovid19Activities(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + value + "']"));
	}

	/**
	 * CRS Knowledge Management System Home Page => NERD => View: NERD COVID-19 ACTIVITIES Submission
	 * Page Numbers
	 */
	public WebElement viewPublishedCovid19ActivitiesPageNumbers(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//ul[contains(@class,'pagination-sm pagination ng-untouched ng-valid ng-isolate-scope ng-not-empty ng-dirty ng-valid-parse')]//a[contains(@class,'ng-binding')][normalize-space()='" + value + "']"));
	}

	/**
	 * CRS Knowledge Management System Home Page => NERD => View: NERD COVID-19 ACTIVITIES Submission
	 * Page Numbers
	 */
	public WebElement viewPublishedCovid19ActivitiesPageButtons(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("(//div[contains(@class,'panel-body')])[5]//child::div//child::ul//child::li[" + value + "]//child::a"));
	}

	/**
	 * CRS Knowledge Management System Home Page => NERD => View: NERD COVID-19 ACTIVITIES Submission
	 * Page Iterator
	 */
	public WebElement viewPublishedCovid19ActivitiesPageIterator(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='accordiongroup-135-3625-panel']/div/div/ul/li['" + value + "']/a"));
	}

	/**
	 * CRS Knowledge Management System Home Page => NERD => View: NERD COVID-19 ACTIVITIES Submission Headers
	 * value
	 */
	public WebElement viewPublishedCovid19ActivitiesHeaders(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//h4[normalize-space()='" + value + "']"));
	}

	/**
	 * CRS Knowledge Management System Home Page => NERD => View: NERD COVID-19 ACTIVITIES Submission
	 * Text value
	 */
	public WebElement viewPublishedCovid19ActivitiesText(String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//div[normalize-space()='" + value + "']"));
	}
	/**
	 * ------------ THE END OF COVID-19 ACTIVITIES SUBMISSIONS BY SUPER USER OR STAFF MEMBER
	 * -----------
	 */
	}