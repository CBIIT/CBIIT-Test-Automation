package ANALYSIS_TOOLS.ezQTL.steps;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.*;
import APPS_COMMON.PageInitializers.PageInitializer;
import static com.nci.automation.web.TestProperties.getEzQTLUrl;

public class HomeTabSteps extends PageInitializer {

    @Given("The user is on the ezQTL Home page")
    public void the_user_is_on_the_ezQTL_Home_page()  {
        WebDriverUtils.webDriver.get(getEzQTLUrl());
        CommonUtils.clickOnElement(ezQTLHomePage.homeTabButton);
        CommonUtils.sleep(2000);
    }

    @Then("the values {string}, {string}, {string} and {string} are displayed")
    public void the_values_and_are_displayed(String homeTabText, String analysesTabText, String publicDataSourceTabText,
            String documentationTabText) {
        CommonUtils.assertEquals(ezQTLHomePage.homeTabButton.getText(), homeTabText);
        CommonUtils.assertEquals(ezQTLHomePage.analysesTabButton.getText(), analysesTabText);
        CommonUtils.assertEquals(ezQTLHomePage.publicDataSourceTabButton.getText(), publicDataSourceTabText);
        CommonUtils.assertEquals(ezQTLHomePage.documentationTabButton.getText(), documentationTabText);
    }

    @Then("the credits section contains {string}, {string}, and {string}")
    public void the_credits_section_contains_and(String tongwuZhangName,
            String jiyeonChoiName, String kevinBrownName) {
        CommonUtils.scrollIntoView(ezQTLHomePage.dcegFooterElement);
        CommonUtils.assertEquals(ezQTLHomePage.tongwuZhangNameElement.getText(), tongwuZhangName);
        CommonUtils.assertEquals(ezQTLHomePage.jiyeonChoiNameElement.getText(), jiyeonChoiName);
        CommonUtils.assertEquals(ezQTLHomePage.kevinBrownNameElement.getText(), kevinBrownName);
    }
}