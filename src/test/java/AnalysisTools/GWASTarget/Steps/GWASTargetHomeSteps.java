package AnalysisTools.GWASTarget.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class GWASTargetHomeSteps extends PageInitializer {

    @When("the user is on the GWAS Target home page")
    public void the_user_is_on_the_gwas_target_home_page() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("GWASTarget"));
    }
    @Then("the home page {string}, {string} and {string} text is displayed")
    public void the_home_page_and_text_is_displayed(String firstPassageTexts, String secondPassageTexts, String thirdPassageTexts) {
        System.out.println(gwasTargetHomePages.firstPassageText.getText());
        Assert.assertTrue(gwasTargetHomePages.firstPassageText.getText().contentEquals(firstPassageTexts));
        System.out.println(gwasTargetHomePages.secondPassageText.getText());
        Assert.assertTrue(gwasTargetHomePages.secondPassageText.getText().contentEquals(secondPassageTexts));
        System.out.println(gwasTargetHomePages.thirdPassageText.getText());
        Assert.assertTrue(gwasTargetHomePages.thirdPassageText.getText().contentEquals(thirdPassageTexts));
    }
}