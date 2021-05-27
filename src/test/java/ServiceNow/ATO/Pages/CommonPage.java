package ServiceNow.ATO.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends BasePage{
	
	/**New button to create a package */
	@FindBy(id= "sysverb_new")
	private WebElement newButton;
	
	/**save button */
	@FindBy(id= "sysverb_update")
	private WebElement saveButton;
	
	/**Submit button */
	@FindBy(id = "sysverb_insert_bottom")
	private WebElement submitButton;
	
	/**Cancel ato button */
	@FindBy(id = "cancel_package")
	private WebElement cancelAtoButton;
	
	@FindBy(id = "sysverb_update_bottom")
	private WebElement updateButton;
	
	
	private WebElement sharedAccountsTab;

	/**This method uses dynamic xpath value to click on any tab,  hence not changing the logic of element
	 * identifier to annotation based one */
	public void clickOnTabByName(String tabName) {
		switchToFrame();
		clickOnElement(driver.findElement(By.xpath("//span[contains(text(), '" + tabName +"')][@class='tab_caption_text']")));
		switchToDefaultFrame();
	}
	
	public void clickOnTabOnFastAto(String tabName) {
		clickOnElement(driver.findElement(By.xpath("//div[contains(text(), '" + tabName + "')]")));
	}
	
	
	public void clickOnUpdateButton() {
		clickOnElementInIFrame(updateButton);
	}
	
	public void clickOnNewButton() {
		clickOnElementInIFrame(newButton);
	}
	
	public void clickOnSaveButton() {
		clickOnElementInIFrame(saveButton);
	}
	
<<<<<<< HEAD
	public void clickOnSaveButtonNonFrame() {
		clickOnElement(saveButton);
	}
	
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	public void clickOnSubmitButton() {
		clickOnElementInIFrame(submitButton);
	}
	
<<<<<<< HEAD
	public void switchToFrme(String frameId) {
		driver.switchTo().frame(frameId);
	}
	
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	public void clickOnCancelAtoButton() {
		switchToFrame();
		clickOnElement(cancelAtoButton);
		driver.switchTo().alert().accept();
		switchToDefaultFrame();
	}
	
	public void clickOnLoginInToGetStartedButton() {
		clickOnElement(driver.findElement(By.cssSelector(".login-btn")));
	}
}
