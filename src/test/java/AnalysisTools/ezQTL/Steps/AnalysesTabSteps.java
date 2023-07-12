package AnalysisTools.ezQTL.Steps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnalysesTabSteps extends PageInitializer {

    @When("the user submits a job to the queue")
    public void the_user_submits_a_job_to_the_queue() {

    }

    @When("the user submits {string}, {string}, {string}, {string}, {string}. {string}, {string} {string}, {string}")
    public void the_user_submits(String associationData, String gwasData, String quantificationData,
            String genotypeData, String ldData,
            String qtlDistance, String snpNumber, String jobName, String queueEmail) {

        CommonUtils.sendKeys(ezQTLAnalysesPage.associationDataFileInput, associationData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.gwasDataFileInput, gwasData);
        CommonUtils.click(ezQTLAnalysesPage.addQtlRawDataButton);
        CommonUtils.sendKeys(ezQTLAnalysesPage.quantificationDataFileInput, quantificationData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.genotypeDataFileInput, genotypeData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.ldDataFileInput, ldData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.qtlDistanceInput, qtlDistance);
        CommonUtils.sendKeys(ezQTLAnalysesPage.snpNumberInput, snpNumber);
        CommonUtils.click(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, jobName);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, queueEmail);
        MiscUtils.sleep(5000);
        CommonUtils.click(ezQTLAnalysesPage.submitButton);
    }

    @Then("the {string} text is displayed")
    public void the_text_is_displayed(String submittedConfirmation) {
        System.out.println(ezQTLAnalysesPage.queueSubmissionConfirmationMessage.getText());
        Assert.assertEquals(ezQTLAnalysesPage.queueSubmissionConfirmationMessage.getText(), submittedConfirmation);
        MiscUtils.sleep(5000);
    }

    @When("the user searches using public data")
    public void the_user_searches_using_public_data() {

        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicAssociationDataCheckBox);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicGwasSourceDataCheckBox);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicLdPublicDataCheckBox);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectChromosomeDropDown);
        CommonUtils.click(ezQTLAnalysesPage.selectChromosomeDropDown);
        CommonUtils.click(ezQTLAnalysesPage.selectChromosomeDropDown21Value);
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.positionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, "Automation Job");
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, "kevin.matarodriguez@nih.gov");
        MiscUtils.sleep(2000);
        CommonUtils.click(ezQTLAnalysesPage.submitButton);

    }

    @When("the user clicks on the Load Sample Data link")
    public void the_user_clicks_on_the_Load_Sample_Data_link() {
        CommonUtils.click(ezQTLAnalysesPage.loadSampleDataLink);
    }

    @Then("the {string}, {string}, {string}, {string}, {string}, {string}, {string} text is displayed")
    public void the_text_is_displayed(String locusQC, String locusLD, String locusAlignment, String locusColocalization,
            String locusTable,
            String locusQuantification, String locusDownload) {
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusQcTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusQcTab.getText(), locusQC);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusLdTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusLdTab.getText(), locusLD);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusAlignmentTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusAlignmentTab.getText(), locusAlignment);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusColocalizationTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusColocalizationTab.getText(), locusColocalization);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusTableTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusTableTab.getText(), locusTable);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusQuantificationTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusQuantificationTab.getText(), locusQuantification);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.locusDownloadTab);
        CommonUtils.assertEquals(ezQTLAnalysesPage.locusDownloadTab.getText(), locusDownload);

    }

}
