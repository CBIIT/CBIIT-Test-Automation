package ServiceNow.ATO.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import ServiceNow.ATO.Pages.AtoPage;

public class AtoStepsImpl extends AtoPage {

	public AtoStepsImpl() {
		super();
	}

	protected void switchToFrame() {
		List<WebElement> f = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
	}

	public void clickOnFirstPackage() {
		switchToFrame();
		clickOnElementByXpath((firstPackage));
	}

	public void clickOnAudiAccountability() {
		clickOnElementByXpath((auditAndAccoLink));
	}
	
	public void clickConfigurationManagLink() {
		clickOnElementByXpath((ConfigurationManagLink));
	}
	
	public void clickcontigencyLink() {
		clickOnElementByXpath((contigencyLink));
	}
	
	public void clickeAuthenticationLink() {
		clickOnElementByXpath((eAuthenticationLink));
	}
	
	public void clickFIPS199Link() {
		clickOnElementByXpath((FIPS199Link));
	}
	
	public void clickIdentityandAccessManagementLink() {
		clickOnElementByXpath((IdentityandAccessManagementLink));
	}
	
	public void clickIncidentResponseContactListLink() {
		clickOnElementByXpath((IncidentResponseContactListLink));
	}
	
	
	public void clickSecurityPlan() {
		clickOnElementByXpath(SystemSecurityPlan);
	}
	public void clickOnUpdateButton() {
		clickOnElementByXpath((updateButton));
	}
	
	public void clickOnSignAto() {
		clickOnElementByXpath(signATOButton);
		clickOnElementByXpath(OKButton);
	}
	
	public void setOnlineTransactionsAsNo() {
		try {
			selectOption(find(onlineTxnDropdown),"No");
		}catch(Exception e) {
			throw e;
		}
	}

	
	
	public void setFormStatusToIssoPending() {
		try{
			waitForElementIgnoreStaleException(formControlDropdown);
			selectOption(find(formControlDropdown),"Pending ISSO Review");
		}catch(Exception e) {
			throw e;
		}
	}
	
	public void setFormStatusToIssoPendingFSecond() {
		try{
			waitForElementIgnoreStaleException(By.xpath("//*[@name=\"x_g_nci_atoaas_system_security_plan.form_status\"]"));
			selectOption(find(By.xpath("//*[@name=\"x_g_nci_atoaas_system_security_plan.form_status\"]")),"Pending ISSO Review");
		}catch(Exception e) {
			throw e;
		}
	}

}
