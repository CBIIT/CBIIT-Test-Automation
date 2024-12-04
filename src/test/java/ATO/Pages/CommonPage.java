package ATO.Pages;

import ServiceNow.ATO.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonPage extends BasePage {

	/** New button to create a package */
	@FindBy(id = "sysverb_new")
	private WebElement newButton;

	/** save button */
	@FindBy(id = "sysverb_update")
	private WebElement saveButton;

	/** Submit button */
	@FindBy(id = "sysverb_insert_bottom")
	private WebElement submitButton;

	/** Cancel ato button */
	@FindBy(id = "cancel_package")
	private WebElement cancelAtoButton;

	@FindBy(id = "sysverb_update_bottom")
	private WebElement updateButton;

	private WebElement sharedAccountsTab;
	
	/**
	 * This method uses dynamic xpath value to click on any tab, hence not changing
	 * the logic of element identifier to annotation based one
	 */
	public void clickOnTabByName(String tabName) {
		switchToFrame();
		clickOnElement(
				driver.findElement(By.xpath("//span[contains(text(), '" + tabName + "')][@class='tab_caption_text']")));
		switchToDefaultFrame();
	}

	public void clickOnTabOnFastAto(String tabName) {
		clickOnElement(driver.findElement(By.xpath("//div[contains(text(), '" + tabName + "')]")));
	}

	public void clickOnElement(By locator) {
		clickOnElement(driver.findElement(locator));
	}

	public void setTextInLocator(By locator, String text) {
		setText(locator, text);
	}

	public void clickOnUpdateButton() {
		//clickOnElementInIFrame(updateButton);
		switchToFrame();
		
		updateButton.click();
		switchToDefaultFrame();
	}

	public void clickOnNewButton() {
		//clickOnElementInIFrame(newButton);
switchToFrame();
		
newButton.click();
		switchToDefaultFrame();
	}

	public void clickOnSaveButton() {
		clickOnElementInIFrame(saveButton);
	}

	public void clickOnSaveButtonNonFrame() {
		clickOnElement(saveButton);
	}

	public void clickOnSubmitButton() {
		//clickOnElementInIFrame(submitButton);
		switchToFrame();
		
		submitButton.click();
				switchToDefaultFrame();
		
	}
	
	public void clickSubmitButton() {
		//clickOnElementInIFrame(submitButton);
		
		
		submitButton.click();
			
		
	}

	public void switchToFrme(String frameId) {
		try {
			driver.switchTo().frame(frameId);
		} catch (Exception e) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			String currentFrame = (String) jsExecutor.executeScript("return self.name");
			System.out.println("Current frame was==>" + currentFrame);
			throw e;
		}
	}

	public void clickOnCancelAtoButton() {
		switchToFrame();
		clickOnElement(cancelAtoButton);
		driver.switchTo().alert().accept();
		switchToDefaultFrame();
	}

	public void clickOnLoginInToGetStartedButton() {
		clickOnElement(driver.findElement(By.cssSelector(".login-btn")));
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

}