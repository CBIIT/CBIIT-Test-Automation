package ServiceNow.NERD.Steps;

import java.util.Set;
import ServiceNow.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRS_Reviewers_Steps extends PageInitializer {

    @Given("a CRS reviewer is logged into NERDs CRS Knowledge Management System")
    public void a_CRS_reviewer_is_logged_into_NERDs_CRS_Knowledge_Management_System() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        NERDApplicationStepsImplementation.userIsOnSubmissionsPage("NERD");
    }

    @When("adding a new OM entry")
    public void adding_a_new_OM_entry() {
        NERDApplicationStepsImplementation.addingNewOM_Entry();
    }

    @Then("OM Content Type {string} displays")
    public void om_Content_Type_displays(String omContentType) {
        NERDApplicationStepsImplementation.verifyingOM_ContentType(omContentType);
    }

    @Then("the following check box options are also available, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_check_box_options_are_also_available(String administrationTransitionMaterial,
                                                                   String congressionalJustification, String hhsRequests, String antiHarrassmentCivilityMaterial,
                                                                   String donnasBlog, String furloughPlanning, String equityAndInclusionProgram,
                                                                   String covid19LeadershipMessages) {

        NERDApplicationStepsImplementation.verifyingOfOM_CheckBoxes(administrationTransitionMaterial, congressionalJustification, hhsRequests, antiHarrassmentCivilityMaterial, donnasBlog, furloughPlanning, equityAndInclusionProgram, covid19LeadershipMessages);
    }

    @Then("when selecting Other {string}")
    public void when_selecting_Other(String otherOmContent) {
NERDApplicationStepsImplementation.selectingOfOtherOM_Content(otherOmContent);
    }

    @Then("the If Other is selected above, please specify {string} field displays")
    public void the_If_Other_is_selected_above_please_specify_field_displays(String omContentTypeOtherPleaseSpecify) {
NERDApplicationStepsImplementation.pleaseSpecifyFieldIsDisplayed(omContentTypeOtherPleaseSpecify);
    }

    @Given("a CRS Reviewer is on the NERD Knowledge Base page")
    public void a_CRS_Reviewer_is_on_the_NERD_Knowledge_Base_page() throws TestingException {
        nerdLoginStepsImplementation.loginToNerd();
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        MiscUtils.sleep(8000);
        CucumberLogUtils.logScreenShot();
    }

    @Given("clicks the {string} filter")
    public void clicks_the_filter(String SpecialTopic) {
        Assert.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.getText().contentEquals(SpecialTopic));

        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD);
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollDown(2000);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the field options are {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string}, {string}")
    public void the_field_options_are(String All, String BigdataDataSharing, String COVID19, String EarlyDetection,
                                      String Metastatic, String MinorityhealthHealthdisparities, String Moonshot, String Pediatric, String Rare,
                                      String TrainingWorkforcedevelopment, String Womenshealth) {
        MiscUtils.sleep(1000);
        String[] expectedValues = {All, BigdataDataSharing, COVID19, EarlyDetection, Metastatic,
                MinorityhealthHealthdisparities, Moonshot, Pediatric, Rare,
                TrainingWorkforcedevelopment, Womenshealth};

        String[] actualValue = new String[expectedValues.length];

        for (int i = 0; i < actualValue.length; i++) {
            actualValue[i] = nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues.get(i).getText().trim()
                    .split("\\(")[0].replaceAll("&nbsp;", "").trim();
        }

        for (int i = 0; i < actualValue.length; i++) {
            System.out.println(expectedValues[i]);
            System.out.println(actualValue[i]);
            Assert.assertEquals(expectedValues[i], actualValue[i]);
        }
        MiscUtils.sleep(1000);
    }

}

