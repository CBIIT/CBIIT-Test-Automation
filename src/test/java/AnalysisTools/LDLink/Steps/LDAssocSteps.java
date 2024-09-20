package AnalysisTools.LDLink.Steps;

import java.io.File;
import org.junit.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class LDAssocSteps extends PageInitializer {

    @When("the user clicks on the LDassoc module")
    public void the_user_clicks_on_the_LDassoc_module() {
        CommonUtils.clickOnElement(ldLinkHomePage.ldAssocWindow);
    }

    @When("the user calculates example GWAS data on the LDassoc page")
    public void the_user_calculates_example_GWAS_data_on_the_LDassoc_page() {
        CommonUtils.clickOnElement(ldAssocPage.useExampleButton);
        CommonUtils.waitForClickability(ldAssocPage.submitOnLDassoc);
        CommonUtils.clickOnElement(ldAssocPage.submitOnLDassoc);
    }

    @Then("the {string} text displays")
    public void the_text_displays(String associationResultsText) {
        CommonUtils.waitForVisibility(ldAssocPage.associationResultsText);
        CommonUtils.scrollIntoView(ldAssocPage.associationResultsText);
        String actualAssociationText = ldAssocPage.associationResultsText.getText();
        Assert.assertEquals(associationResultsText, actualAssociationText);
        Assert.assertTrue(ldAssocPage.associationResultsText.isDisplayed());
    }

    @When("the user uploads {string}, selects Variant drop down, enters {string} and YRI population and calculates")
    public void the_user_uploads_selects_Variant_drop_down_enters_and_YRI_population_and_calculates(String ldAssocFile,
            String ldAssocRsNumber) {
        CommonUtils.sleep(3000);
        File ldAssocInputFile = new File(ldAssocFile);
        JavascriptUtils.sendKeysByJS(ldAssocPage.fileUploadInputBox, ldAssocInputFile.getAbsolutePath());
        CommonUtils.sendKeys(ldAssocPage.fileUploadInputBox, ldAssocFile);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(ldAssocPage.variantDropDown);
        CommonUtils.clickOnElement(ldAssocPage.variantDropDownValue);
        CommonUtils.sendKeys(ldAssocPage.rsNumberInputOnVariantDropDown,
                ldAssocRsNumber);
        CommonUtils.clickOnElement(ldAssocPage.populationDropDown);
        CommonUtils.clickOnElement(ldAssocPage.populationYriDropDownValue);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(ldAssocPage.submitOnLDassoc);
    }
}