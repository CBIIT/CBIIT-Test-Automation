package CustomBusiness.EIDP.Steps;

import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import appsCommon.Utils.Dynamic_Locators;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.regex.Pattern;

import static com.nci.automation.web.PlaywrightUtils.page;

public class EIDP_All_Steps {


    @Given("a user logs in to EIDP {string}")
    public void a_user_logs_in_to_eidp(String url) {
        page.navigate(EnvUtils.getApplicationUrl(url));
        Playwright_Common_Utils.iTrustLogin();
    }

    @Given("changes user to {string}")
    public void changes_user_to(String user) {
        page.waitForLoadState();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Change User")).click();
        page.getByText("Enter Last Name, First Name").click();
        MiscUtils.sleep(1000);
        page.locator("//input[@role='textbox']").fill(user);
        page.locator("//*[contains(text(), '" + user + "')]").click();
    }

    @When("user searches for any IDP created")
    public void user_searches_for_any_idp_created() {
        page.waitForLoadState();
        page.waitForSelector(".portfolio-wrapper");
        page.locator("div:nth-child(3) > .portfolio-wrapper > .rollover-label > .rollover-label-bg").click();
    }

    @When("checks Trainees without IDP")
    public void checks_trainees_without_idp() {
        page.waitForLoadState();
        page.getByText("Trainees without IDP").click();
    }

    @When("selects Fellow for Classification Type")
    public void selects_fellow_for_classification_type() {
        page.getByPlaceholder("Select Trainee Classification").click();
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName("Fellow")).click();
    }

    @When("clicks {string} button")
    public void clicks_button(String buttonText) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(buttonText).setExact(true)).click();
        MiscUtils.sleep(2000);
    }

    @Then("user verifies the search results display")
    public void user_verifies_the_search_results_display() {
        page.waitForLoadState();
        Playwright_Common_Utils.scrollIntoView("//th[@aria-label='Trainee Name: activate to sort column ascending']");
        Assert.assertTrue(page.locator("//th[@aria-label='Trainee Name: activate to sort column ascending']").isVisible(), "- - - VERIFYING IDP SEARCH RESULTS DISPLAY - - -");

        boolean isEnabledButtonFound = false; // Flag to identify when we've found a clickable button
        do {
            List<ElementHandle> buttons = page.querySelectorAll("//tbody/tr[*]/td[24]/button[1]");
            for (ElementHandle button : buttons) {
                if (button.isEnabled()) {
                    button.click();
                    isEnabledButtonFound = true; // an enabled button is found
                    break;
                }
            }
            if (isEnabledButtonFound) {
                break;
            }
            // Assuming the next button's id is "nextButton"
            ElementHandle nextButton = page.querySelector("(//a[@href='#'][normalize-space()='Next'])[2]");
            if (nextButton == null || !nextButton.isEnabled()) {
                break;
            }
            nextButton.click();
            // Wait until page loads
            page.waitForLoadState(); // delay for 2 seconds
        } while (true); // continue the loop until a button is clicked or no more "next" pages exist

        MiscUtils.sleep(3000);
    }
}