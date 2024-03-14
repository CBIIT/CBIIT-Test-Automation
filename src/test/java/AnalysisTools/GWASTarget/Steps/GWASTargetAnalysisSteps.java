package AnalysisTools.GWASTarget.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class GWASTargetAnalysisSteps extends PageInitializer {

    @Given("the user is on the GWAS Target Analysis page")
    public void the_user_is_on_the_gwas_target_analysis_page() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("GWASTarget"));
        CommonUtils.clickOnElement(gwasTargetHomePages.analysisPageTab);
        MiscUtils.sleep(10000);
    }
    @When("the user submits the sample job")
    public void the_user_submits_the_sample_job() {
        CommonUtils.scrollIntoView(gwasTargetAnalysisPages.submitButton);
        CommonUtils.clickOnElement(gwasTargetAnalysisPages.submitButton);
    }
    @Then("the {string} text and the {string} tab are displayed")
    public void the_text_and_the_tab_are_displayed(String successfulJobSubmissionText, String geneAnalysisTab) {
        MiscUtils.sleep(3000);
        CommonUtils.scrollIntoView(gwasTargetHomePages.analysisPageTab);
        Assert.assertTrue(gwasTargetAnalysisPages.analysisSuccessfullySubmittedText.isDisplayed());
        MiscUtils.sleep(180000);
        Assert.assertTrue(gwasTargetAnalysisPages.geneAnalysisTab.isDisplayed());
    }

    @When("the user submits the sample job to the queue with {string} as job name and {string} as queue email")
    public void the_user_submits_the_sample_job_to_the_queue_with_as_job_name_and_as_queue_email(String jobName, String queueEmailAddress) {
        CommonUtils.clickOnElement(gwasTargetAnalysisPages.queueCheckbox);
        CommonUtils.clickOnElement(gwasTargetAnalysisPages.queueEmailTextBox);
        CommonUtils.sendKeys(gwasTargetAnalysisPages.jobNameTextBox, jobName);
        CommonUtils.sendKeys(gwasTargetAnalysisPages.queueEmailTextBox, queueEmailAddress);
        CommonUtils.clickOnElement(gwasTargetAnalysisPages.submitButton);
        MiscUtils.sleep(5000);
    }
    @Then("the {string} successful queue submission prompt is displayed")
    public void the_successful_queue_submission_prompt_is_displayed(String successfulQueueSubmissionPrompt) {
        Assert.assertTrue(gwasTargetAnalysisPages.queueSuccessfulSubmissionPrompt.isDisplayed());
        Assert.assertTrue(gwasTargetAnalysisPages.queueSuccessfulSubmissionPrompt.getText().contentEquals(successfulQueueSubmissionPrompt));
    }

}
