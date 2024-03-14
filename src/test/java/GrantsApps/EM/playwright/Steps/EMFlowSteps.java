package GrantsApps.EM.playwright.Steps;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;

public class EMFlowSteps {

    @Given("User is logged in as Primary ITwoE Coordinator {string} - PW")
    public void user_is_logged_in_as_primary_i_two_e_coordinator_pw(String string) {
        //PlaywrightUtils.page.navigate("https://authtest.nih.gov/CertAuthV3/forms/PIVandUserPass.aspx?TYPE=33554433&REALMOID=06-cafe548e-775f-4e1b-bc39-eb2581ec9d39&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-Wt08rZnBzwy8eZ3kL%2baRB37XZ8h49hnXtdwdBk6G4o88Qtxs5t6yLHqZNXN1Vjxb&TARGET=-SM-https%3a%2f%2fi2e--test%2enci%2enih%2egov%2fem%2f");
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("EM"));
        PlaywrightUtils.page.locator("#USER").click();
        PlaywrightUtils.page.locator("#USER").fill("juarezds");
        PlaywrightUtils.page.locator("#USER").press("Tab");
        PlaywrightUtils.page.locator("#PASSWORD").fill("Avengersassemble99?");
        PlaywrightUtils.page.locator("#PASSWORD").press("Enter");
    }
}
