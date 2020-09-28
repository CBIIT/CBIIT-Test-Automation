package AnalysisTools.LDLink.Steps;

import org.junit.Assert;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.*;

public class LDLinkExpressSteps extends PageInitializer{
	

	@Then("user verify the LDExpress screen opened with header {string}")
	public void user_verify_present_on_the_screen(String expectedText) {
		  MiscUtils.sleep(2000);
		  String actualText = ldLinkExpressPage.getLDExpressHeaderText();
		  Assert.assertEquals("Verifying LDLink landing page Users sees LDLink hyperlink",
					expectedText, actualText);
	}
	
	@When("user enter snp value as {string}")
	public void enterSnpTextBox(String value) {
		ldLinkExpressPage.enterValueSnpTextBox(value);
	}
	
	@When("user select population")
	public void selectPopulation() {
		ldLinkExpressPage.selectPopulation();
	}
	
	@When("use click calculate button on LdExpress screen")
	public void clickCalculateButton() {
		ldLinkExpressPage.clickCalculateButton();
	}

}
