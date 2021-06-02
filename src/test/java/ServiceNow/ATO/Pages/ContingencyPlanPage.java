package ServiceNow.ATO.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Utils.DriverObjectFactory;

public class ContingencyPlanPage extends BasePage{
	
	
	@FindBy(css = "input[id$='first_contact'][class*='element_reference_input']")
	public WebElement firstContactInput;
	
	@FindBy(css = "input[id$='second_contact'][class*='element_reference_input']")
	public WebElement secondContactInput;
	
	@FindBy(css = "input[id$='third_contact'][class*='element_reference_input']")
	public WebElement thirdContactInput;

	public ContingencyPlanPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
	}
	
	
	
}
