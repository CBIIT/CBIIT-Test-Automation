package AnalysisTools.LDLink.Steps;

import java.io.File;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    @When("the user uploads {string}, selects Variant drop down, enters {string} and YRI population and calculates")
    public void the_user_uploads_selects_Variant_drop_down_enters_and_YRI_population_and_calculates(String ldAssocFile,
            String ldAssocRsNumber) {
        MiscUtils.sleep(3000);
        File ldAssocInputFile = new File(ldAssocFile);
        JavascriptUtils.sendKeysByJS(ldAssocPage.fileUploadInputBox, ldAssocInputFile.getAbsolutePath());
        CommonUtils.sendKeys(ldAssocPage.fileUploadInputBox, ldAssocFile);
        MiscUtils.sleep(2000);
        CommonUtils.click(ldAssocPage.variantDropDown);
        CommonUtils.click(ldAssocPage.variantDropDownValue);
        CommonUtils.sendKeys(ldAssocPage.rsNumberInputOnVariantDropDown,
                ldAssocRsNumber);
        CommonUtils.click(ldAssocPage.populationDropDown);
        CommonUtils.click(ldAssocPage.populationYriDropDownValue);
        MiscUtils.sleep(2000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.click(ldAssocPage.submitOnLDassoc);
    }

}
