package ServiceNow.NERD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;

public class NERDDynamicXPATHS extends PageInitializer {
	
	
	/** ------------ COLLABORATION SUBMISSIONSIONS BY DOC PLANNING CONTACT   -----------*/
	
	
	/**Submit to CRS Button */
	public  WebElement submitToCRSButton (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'"+value+"')]/following::button[1]"));
	}
	
	/**Edit Button */
	public  WebElement editButton (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::button[3]"));
	}
	
	/**Delete Button */
	public  WebElement deleteButton (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::button[4]"));
	}

	/**Return Button to Staff */
	public  WebElement returnButtonToStaff (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::button[2]"));
	}
	
	/**Returned to Staff Member Text*/
	public  WebElement returnedToStaffMemberText (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::div[3]"));
	}
	
	
	/** ------------THE END OF  COLLABORATION SUBMISSIONSIONS BY DOC PLANNING CONTACT   -----------*/
	
	/** ------------ COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER   -----------*/
	

	/**Publish to NERD Button */
	public  WebElement publishToNERDButton (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'"+value+"')]/following::button[1]"));
	}
	/**Return Button */
	public  WebElement returnButton (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'"+value+"')]/following::button[2]"));
		
	}
	
	/**Returned to DOC text*/	
	public  WebElement returnedToDOCText (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::div[3]"));
		}
		
	
	/** ------------ THE END OF COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER   -----------*/
	
	/** ------------ COLLABORATION SUBMISSIONSIONS BY STAFF MEMBER   -----------*/
	
	/**Edit Button Returned to Staff Member*/
	public  WebElement editButtonReturnedToStaffMember (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::button[2]"));
	}
	
	/**Delete Button Returned to Staff Member */
	public  WebElement deleteButtonReturnedToStaffMember (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::button[3]"));
	}
	
	/**Submit Button Returned to Staff Member */
	public  WebElement submitButtonReturnedToStaffMember (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='"+value+"']/following::button[1]"));
	}
	
	/**Under Review Text */
	public  WebElement underReviewText (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'"+value+"')]/following::div[2]"));
	}
	
	/**Submit Button To DOC Planning Contact */
	public  WebElement submitButtonToDOCPlanningContact (String value) {
		return WebDriverUtils.webDriver.findElement(By.xpath("//a[contains(text(),'"+value+"')]/following::button[1]"));
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
