package ServiceNow.ATO.StepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import ServiceNow.ATO.Pages.ContingencyPlanPage;

public class ContingencyPlanStepsImpl extends ContingencyPlanPage{

	public ContingencyPlanStepsImpl() {
		super();
	}
	
	public void enterContingencyPlanData() {
		int size = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<size; i++) {
			driver.switchTo().frame(i);
			driver.findElement(By.cssSelector(".mce-content-body ")).sendKeys("test");
			driver.switchTo().defaultContent();
		}
	}
	
	public void selectFirstContact(String contactName) {
		enterTextInIFrame(firstContactInput, contactName + Keys.TAB);
		
	}
	
	public void selectSecondContact(String contactName) {
		enterTextInIFrame(secondContactInput, contactName + Keys.TAB);
		
	}
	
	public void selectThirdContact(String contactName) {
		enterTextInIFrame(thirdContactInput, contactName + Keys.TAB);
		
	}
}
