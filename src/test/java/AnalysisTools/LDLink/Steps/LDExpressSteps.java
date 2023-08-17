package AnalysisTools.LDLink.Steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LDExpressSteps extends PageInitializer {
    @When("the user clicks on the LDexpress module")
    public void the_user_clicks_on_the_LDexpress_module() {
        CommonUtils.clickOnElement(ldLinkHomePage.ldExpressWindow);
    }

    @When("the user calculates using RS numbers {string}, {string}, {string},{string} and GRCh38 High Coverage for genome build, CHB for population and Brain for tissue, and clicks on Variants with Warnings Link")
    public void the_user_calculates_using_RS_numbers_and_GRCh38_High_Coverage_for_genome_build_CHB_for_population_and_Brain_for_tissue_and_clicks_on_Variants_with_Warnings_Link(
            String rsNum1, String rsNum2, String rsNum3, String rsNum4) {
        CommonUtils.waitForVisibility(ldExpressPage.genomeBuildSelector);
        CommonUtils.clickOnElement(ldExpressPage.genomeBuildSelector);
        CommonUtils.waitForVisibility(ldExpressPage.grCh38HighCoverageValueFromDropDown);
        CommonUtils.clickOnElement(ldExpressPage.grCh38HighCoverageValueFromDropDown);
        CommonUtils.sendKeys(ldExpressPage.rsNumberInputTextBox,
                rsNum1 + Keys.ENTER + rsNum2 + Keys.ENTER + rsNum3 + Keys.ENTER + rsNum4);
        CommonUtils.waitForClickability(ldExpressPage.selectPopulationDropDown);
        CommonUtils.clickOnElement(ldExpressPage.selectPopulationDropDown);
        CommonUtils.clickOnElement(ldExpressPage.chbOptionOnPopulationDropDown);
        CommonUtils.clickOnElement(ldExpressPage.rsNumberInputTextBox);
        CommonUtils.waitForClickability(ldExpressPage.selectTissueDropDown);
        CommonUtils.clickOnElement(ldExpressPage.selectTissueDropDown);
        CommonUtils.clickOnElement(ldExpressPage.brainAmygdalaOptionOnTissueDropDown);
        CommonUtils.clickOnElement(ldExpressPage.submitOnLdExpress);
        MiscUtils.sleep(15000);
        CommonUtils.waitForVisibility(ldExpressPage.variantsWithWarningsLink);
        CommonUtils.clickOnElement(ldExpressPage.variantsWithWarningsLink);
    }

    @Then("the {string} and {string} warning messages display")
    public void the_and_warning_messages_display(String warning1, String warning2) {
        CommonUtils.waitForVisibility(ldExpressPage.warning1Text);
        CommonUtils.scrollIntoView(ldExpressPage.warning1Text);
        String warningText1 = ldExpressPage.warning1Text.getText();
        String warningText2 = ldExpressPage.warning2Text.getText();
        Assert.assertEquals(warning1, warningText1);
        Assert.assertEquals(warning2, warningText2);
        MiscUtils.sleep(1000);
    }
}