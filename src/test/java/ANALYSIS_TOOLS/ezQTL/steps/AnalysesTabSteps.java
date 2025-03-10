package ANALYSIS_TOOLS.ezQTL.steps;

import org.junit.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.*;
import APPS_COMMON.PageInitializers.PageInitializer;
import static com.nci.automation.web.TestProperties.getEzQTLUrl;

public class AnalysesTabSteps extends PageInitializer {

    @Given("The user is on the ezQTL Analyses page")
    public void the_user_is_on_the_ezQTL_Analyses_page() {
        WebDriverUtils.webDriver.get(getEzQTLUrl());
        CommonUtils.clickOnElement(ezQTLHomePage.analysesTabButton);
        CommonUtils.sleep(2000);
    }

    @When("the user submits a job to the queue")
    public void the_user_submits_a_job_to_the_queue() {
    }

    @When("the user submits {string}, {string}, {string}, {string}, {string}. {string}, {string} {string}, {string}")
    public void the_user_submits(String associationData, String gwasData, String quantificationData, String genotypeData, String ldData, String qtlDistance, String snpNumber, String jobName, String queueEmail) {
        CommonUtils.sendKeys(ezQTLAnalysesPage.associationDataFileInput, associationData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.gwasDataFileInput, gwasData);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.addQtlRawDataButton);
        CommonUtils.sendKeys(ezQTLAnalysesPage.quantificationDataFileInput, quantificationData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.genotypeDataFileInput, genotypeData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.ldDataFileInput, ldData);
        CommonUtils.sendKeys(ezQTLAnalysesPage.qtlDistanceInput, qtlDistance);
        CommonUtils.sendKeys(ezQTLAnalysesPage.snpNumberInput, snpNumber);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, jobName);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, queueEmail);
        CommonUtils.sleep(5000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitButton);
    }

    @Then("the {string} texts is displayed")
    public void the_texts_is_displayed(String submittedConfirmation) {
        System.out.println(ezQTLAnalysesPage.queueSubmissionConfirmationMessage.getText());
        Assert.assertEquals(ezQTLAnalysesPage.queueSubmissionConfirmationMessage.getText(), submittedConfirmation);
        CommonUtils.sleep(5000);
    }

    @Then("the {string} text is displayed")
    public void the_text_is_displayed(String submittedConfirmation) {
        CommonUtils.sleep(2000);
        System.out.println(ezQTLAnalysesPage.queueSubmissionConfirmationMessage.getText());
        Assert.assertEquals(ezQTLAnalysesPage.queueSubmissionConfirmationMessage.getText(), submittedConfirmation);
        CommonUtils.sleep(5000);
    }

    @When("the user searches using public data")
    public void the_user_searches_using_public_data() {
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicAssociationDataCheckBox);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicGwasSourceDataCheckBox);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicLdPublicDataCheckBox);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown21Value);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.firstPositionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, "Automation Job");
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, "kevin.matarodriguez@nih.gov");
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitButton);
    }

    @When("the user clicks on the Load Sample Data link")
    public void the_user_clicks_on_the_Load_Sample_Data_link() {
        CommonUtils.clickOnElement(ezQTLAnalysesPage.loadSampleDataLink);
        CommonUtils.sleep(1000);
    }

    @Then("the {string}, {string}, {string}, {string}, {string}, {string}, {string} texts is displayed")
    public void the_texts_is_displayed(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
    }

    @Then("the {string}, {string}, {string}, {string}, {string}, {string}, {string} text is displayed")
    public void the_text_is_displayed(String locusQC, String locusLD, String locusAlignment, String locusColocalization, String locusTable, String locusQuantification, String locusDownload) {
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

    @When("the user searches using public data and five locus parameters")
    public void the_user_searches_using_public_data_and_five_locus_parameters() {
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicAssociationDataCheckBox);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicGwasSourceDataCheckBox);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.publicLdPublicDataCheckBox);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown21Value);
        CommonUtils.sleep(2000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.firstPositionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.addLocusButton);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectSecondChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectSecondChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectSecondChromosomeDropDown);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectSecondChromosomeDropDown21Value);
        CommonUtils.sleep(2000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.secondPositionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.addLocusButton);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectThirdChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectThirdChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectThirdChromosomeDropDown);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectThirdChromosomeDropDown21Value);
        CommonUtils.sleep(2000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.thirdPositionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.addLocusButton);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectFourthChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectFourthChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFourthChromosomeDropDown);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFourthChromosomeDropDown21Value);
        CommonUtils.sleep(2000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.fourthPositionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.addLocusButton);
        CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectFifthChromosomeDropDown);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.selectFifthChromosomeDropDown);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFifthChromosomeDropDown);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFifthChromosomeDropDown21Value);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(ezQTLAnalysesPage.fifthPositionTextBox, "42743496");
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, "Automation Job");
        CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, "kevin.matarodriguez@nih.gov");
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(ezQTLAnalysesPage.submitButton);
    }

    @Then("the both download links are clickable")
    public void the_both_download_links_are_clickable() {
        CommonUtils.clickOnElement(ezQTLAnalysesPage.locusDownloadTab);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.downloadResultsButton);
        Assert.assertTrue(ezQTLAnalysesPage.downloadResultsButton.isDisplayed());
        CommonUtils.waitForClickability(ezQTLAnalysesPage.downloadExampleReadMeInformationButton);
        Assert.assertTrue(ezQTLAnalysesPage.downloadExampleReadMeInformationButton.isDisplayed());
    }

    @When("recalculates on the Locus LD")
    public void recalculates_on_the_Locus_LD() {
        CommonUtils.clickOnElement(ezQTLAnalysesPage.locusLdTab);
        CommonUtils.waitForClickability(ezQTLAnalysesPage.ldAssociationDataDropDrop);
        CommonUtils.sleep(5000);
        JavascriptUtils.sendKeysByJS(ezQTLAnalysesPage.ldAssociationDataDropDrop, "qtl");
        CommonUtils.sleep(5000);
        CommonUtils.sleep(5000);
    }

    @Then("the {string} link is displayed")
    public void the_link_is_displayed(String string) {
    }

    @When("the user submits {string}, {string}, {string}, {string}, {string}, {int} times")
    public void the_user_submits_times(String ezQTLAssociationData, String qtlDistance, String position, String jobName, String jobEmail, int loops) {
        for (int i = 1; i <= loops; i++) {
            CommonUtils.sendKeys(ezQTLAnalysesPage.associationDataFileInput, ezQTLAssociationData);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.publicGwasSourceDataCheckBox);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.publicGwasSourceDataProjectTextbox);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.educationalAttainmentOkBay2016ValueOnGwasDropdown);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.publicLdPublicDataCheckBox);
            CommonUtils.sendKeys(ezQTLAnalysesPage.qtlDistanceInput, qtlDistance);
            CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectEducationalFirstChromosomeDropDown);
            CommonUtils.waitForClickability(ezQTLAnalysesPage.selectEducationalFirstChromosomeDropDown);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.selectEducationalFirstChromosomeDropDown);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown8Value);
            CommonUtils.sleep(2000);
            CommonUtils.sendKeys(ezQTLAnalysesPage.firstPositionTextBox, position);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
            CommonUtils.sleep(1000);
            CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, jobName + " " + i);
            CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, jobEmail);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.submitButton);
            CommonUtils.sleep(5000);
            if (i <= loops) {
                CommonUtils.waitForClickability(ezQTLAnalysesPage.queueSubmissionConfirmationMessageCloseButton);
                CommonUtils.clickOnElement(ezQTLAnalysesPage.queueSubmissionConfirmationMessageCloseButton);
                CommonUtils.clickOnElement(ezQTLAnalysesPage.resetButton);
                CommonUtils.sleep(1000);
            } else {
                System.err.println("SOMETHING ELSE WENT WRONG");
            }
        }
    }

    @Then("the user submits {string}, {string}, {string}, {string}, {int} times")
    public void the_user_submits_times(String qtlDistance, String position, String jobName, String jobEmail, int loops) {
        for (int i = 1; i <= loops; i++) {
            CommonUtils.clickOnElement(ezQTLAnalysesPage.publicAssociationDataCheckBox);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.publicGwasSourceDataCheckBox);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.publicLdPublicDataCheckBox);
            CommonUtils.sendKeys(ezQTLAnalysesPage.qtlDistanceInput, qtlDistance);
            CommonUtils.scrollIntoView(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
            CommonUtils.waitForClickability(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.selectFirstChromosomeDropDown21Value);
            CommonUtils.sleep(2000);
            CommonUtils.sendKeys(ezQTLAnalysesPage.firstPositionTextBox, position);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.submitJobtoQueueCheckbox);
            CommonUtils.sleep(1000);
            CommonUtils.sendKeys(ezQTLAnalysesPage.queueJobName, jobName + " " + i);
            CommonUtils.sendKeys(ezQTLAnalysesPage.queueEmail, jobEmail);
            CommonUtils.clickOnElement(ezQTLAnalysesPage.submitButton);
            CommonUtils.sleep(5000);
            if (i <= loops) {
                CommonUtils.waitForClickability(ezQTLAnalysesPage.queueSubmissionConfirmationMessageCloseButton);
                CommonUtils.clickOnElement(ezQTLAnalysesPage.queueSubmissionConfirmationMessageCloseButton);
                CommonUtils.clickOnElement(ezQTLAnalysesPage.resetButton);
                CommonUtils.sleep(1000);
            } else {
                System.err.println("SOMETHING ELSE WENT WRONG");
            }
        }
    }
}