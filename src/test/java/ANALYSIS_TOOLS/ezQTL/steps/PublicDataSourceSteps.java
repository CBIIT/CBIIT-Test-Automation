package ANALYSIS_TOOLS.ezQTL.steps;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.nci.automation.web.TestProperties.getEzQTLUrl;

public class PublicDataSourceSteps extends PageInitializer {

    @Given("The user is on the ezQTL Public Data Source page")
    public void the_user_is_on_the_ezQTL_Public_Data_Source_page()  {
        WebDriverUtils.webDriver.get(getEzQTLUrl());
        CommonUtils.clickOnElement(ezQTLHomePage.publicDataSourceTabButton);
        CommonUtils.sleep(2000);
    }

    @Then("the columns displayed are {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void the_columns_displayed_are_and(String datasetColumn, String typeColumn, String populationColumn,
            String genomeBuildColumn,
            String journalColumn, String yearColumn, String titleColumn, String studyWebsiteColumn) {
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.datasetColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.datasetColumnElement.getText(), datasetColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.typeColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.typeColumnElement.getText(), typeColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.populationColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.populationColumnElement.getText(), populationColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.genomeBuildColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.genomeBuildColumnElement.getText(), genomeBuildColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.journalColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.journalColumnElement.getText(), journalColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.yearColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.yearColumnElement.getText(), yearColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.titleColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.titleColumnElement.getText(), titleColumn);
        CommonUtils.assertTrue(ezQTLPublicDataSourcePage.studyWebsiteColumnElement.isDisplayed());
        CommonUtils.assertEquals(ezQTLPublicDataSourcePage.studyWebsiteColumnElement.getText(), studyWebsiteColumn);
    }
}