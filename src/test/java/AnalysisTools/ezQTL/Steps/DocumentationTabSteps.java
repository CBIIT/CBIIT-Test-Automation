package AnalysisTools.ezQTL.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.*;
import appsCommon.PageInitializers.PageInitializer;

public class DocumentationTabSteps extends PageInitializer {

        @Given("The user is on the ezQTL Documentation page")
        public void the_user_is_on_the_ezQTL_Documentation_page() throws TestingException {
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ezQTL"));
                CommonUtils.clickOnElement(ezQTLHomePage.documentationTabButton);
                MiscUtils.sleep(2000);
        }

        @Then("the values {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} are displayed")
        public void the_values_are_displayed(String releaseHistory, String inputFileFormatOfEzqtl,
                        String qtlAssociationData, String quantificationData, String genotypeData,
                        String ldMatrixData, String gwasData, String publicDataSource,
                        String relationshipBetweenInputDatasetsAndModuleFunctions, String colocalizationAnalysis,
                        String comparisonBetweenEzqtlAndOtherTools,
                        String frequentlyAskedQuestions) {
                CommonUtils.assertEquals(ezQTLDocumentationPage.releaseHistoryLink.getText(), releaseHistory);
                CommonUtils.assertEquals(ezQTLDocumentationPage.inputFileFormatOfEzqtlLink.getText(), inputFileFormatOfEzqtl);
                CommonUtils.assertEquals(ezQTLDocumentationPage.qtlAssociationDataLink.getText(), qtlAssociationData);
                CommonUtils.assertEquals(ezQTLDocumentationPage.quantificationDataLink.getText(), quantificationData);
                CommonUtils.assertEquals(ezQTLDocumentationPage.genotypeDataLink.getText(), genotypeData);
                CommonUtils.assertEquals(ezQTLDocumentationPage.ldMatrixDataLink.getText(), ldMatrixData);
                CommonUtils.assertEquals(ezQTLDocumentationPage.gwasDataLink.getText(), gwasData);
                CommonUtils.assertEquals(ezQTLDocumentationPage.publicDataSourceLink.getText(), publicDataSource);
                CommonUtils.assertEquals(ezQTLDocumentationPage.relationshipBetweenInputDatasetsAndModuleFunctionsLink.getText(), relationshipBetweenInputDatasetsAndModuleFunctions);
                CommonUtils.assertEquals(ezQTLDocumentationPage.colocalizationAnalysisLink.getText(), colocalizationAnalysis);
                CommonUtils.assertEquals(ezQTLDocumentationPage.comparisonBetweenEzqtlAndOtherToolsLink.getText(), comparisonBetweenEzqtlAndOtherTools);
                CommonUtils.assertEquals(ezQTLDocumentationPage.frequentlyAskedQuestionsLink.getText(), frequentlyAskedQuestions);
        }
}