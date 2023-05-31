package AnalysisTools.LDLink.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LDAssocSteps extends PageInitializer {

    @When("the user clicks on the LDassoc module")
    public void the_user_clicks_on_the_LDassoc_module() {
        CommonUtils.click(ldLinkHomePage.ldAssocWindow);
    }

    @When("the user calculates example GWAS data on the LDassoc page")
    public void the_user_calculates_example_GWAS_data_on_the_LDassoc_page() {
        CommonUtils.click(ldAssocPage.useExampleButton);
        CommonUtils.waitForClickability(ldAssocPage.submitOnLDassoc);
        CommonUtils.click(ldAssocPage.submitOnLDassoc);
    }

    @Then("the {string} text displays")
    public void the_text_displays(String associationResultsText) {
        CommonUtils.waitForVisibility(ldAssocPage.associationResultsText);
        CommonUtils.scrollIntoView(ldAssocPage.associationResultsText);
        String actualAssociationText = ldAssocPage.associationResultsText.getText();
        Assert.assertEquals(associationResultsText, actualAssociationText);
        Assert.assertTrue(ldAssocPage.associationResultsText.isDisplayed());
        CucumberLogUtils.logScreenShot();
    }

}
