package AnalysisTools.CervicalCP.playwright.Steps;

import io.cucumber.java.en.Given;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class CCPHomeStepsPW {
    @Given("the user is on the CCP home page")
    public void the_user_is_on_the_ccp_home_page() {
//        page.navigate(EnvUtils.getApplicationUrl("CervicalCP"));
        page.navigate("https://globalcxca-qa.cancer.gov/");
        assertThat(page.getByLabel("Select Language:")).isVisible();
    }
}