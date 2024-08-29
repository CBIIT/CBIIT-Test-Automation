package GrantsApps.GPMATS.Steps;

import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.nci.automation.web.PlaywrightUtils.page;

public class GPMATS_All_Steps {

    @Given("a user is logged in with the role of GM Action Manager")
    public void a_user_is_logged_in_with_the_role_of_gm_action_manager() {
        page.navigate(EnvUtils.getApplicationUrl("GPMATS"));
        Playwright_Common_Utils.iTrustLogin();
        page.waitForLoadState();
        page.locator("#change-user-dropdown").click();
        page.getByText("Enter Last Name, First Name").click();
        page.getByRole(AriaRole.SEARCHBOX).fill("Baker");
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Baker, Bryan [OD OM OGA]")).click();
    }

    @And("clicks on Show Advanced Filters link")
    public void clicks_on_show_advanced_filters_link() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Show Advanced Filters")).click();
    }

    @Given("for the Action Status drop-down selects {string} option")
    public void for_the_action_status_drop_down_selects_option(String string) {
        Playwright_Common_Utils.scrollIntoView("(//span[@role='combobox'])[20]");
        page.locator("app-action-status-dropdown").getByRole(AriaRole.LIST).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("New")).click();
    }

    @Given("clicks on the Search button")
    public void clicks_on_the_search_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).nth(1).click();
    }

    @Then("search results with the New Actions status display")
    public void search_results_with_the_new_actions_status_display() {
        page.waitForSelector("//div[normalize-space()='New']");

        List<ElementHandle> values = page.querySelectorAll("//div[normalize-space()='New']");


    }

    @When("test step")
    public void test_step() {

        page.waitForSelector("(//div[@class='grant-icons']/div/div/span)[1]");
        page.locator("(//div[@class='dropdown']/button)[1]").click();
        MiscUtils.sleep(2000);
        List<ElementHandle> actualProcessOptions = page.querySelectorAll("//div[@class='dropdown-menu dropdown-menu-right show']/a");
        List<String> expectedProcessOptions = new ArrayList<>();
        expectedProcessOptions.add("Assign");
        expectedProcessOptions.add("Cancel");
        expectedProcessOptions.add("Pre-assign");
        expectedProcessOptions.add("Put on Hold");
        List<String> valuesToBeComparedWith = new ArrayList<>();
        for (ElementHandle processOption : actualProcessOptions) {
            valuesToBeComparedWith.add(processOption.innerText());
        }
        Assert.assertEquals(valuesToBeComparedWith, expectedProcessOptions, "- - - VERIFYING PROCESS OPTIONS - - -");
        page.waitForSelector("(//i[contains(@class,'bi bi-dash-circle')])[1]");
        page.locator("(//i[contains(@class,'bi bi-dash-circle')])[1]").click();
        MiscUtils.sleep(1000);

        // Retrieve the name of the action specialist for the first action
        String actionSpecialistName = page.locator("(//*[@id=\"gDt\"]/tbody/tr/td[15])[1]").innerText();

        // Retrieve the grant number for the first action
        String grantNumber = page.locator("(//div//a[@ngbtooltip='Click to View Grant Details'])[1]").innerText();

        if (actionSpecialistName.isEmpty()) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator("//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Assign']").click();
            Assert.assertEquals(page.locator("//div[contains(@class,'text-center')]").innerText().trim(), "Please select GMS before proceeding.", "- - - VERIFYING PLEASE SELECT GMS BEFORE PROCEEDING. TEXT IF ACTION DID NOT HAVE AN ACTION SPECIALIST ASSIGNED  - - -");
            page.locator("//button[normalize-space()='OK']").click();
            page.waitForLoadState();
            page.locator("//button[normalize-space()='Edit']").click();
            page.click("//ng-select2[@class='ng-untouched ng-pristine ng-invalid']//span[@role='combobox']");
            page.locator("//ul[@class='select2-results__options']/li[1]").click();
            page.locator("//button[normalize-space()='Save']").click();
            page.locator("//button[normalize-space()='OK']").click();
        }

        String actualClassAttributeValueOfViewNotes = page.locator("(//div[@class='grant-icons']/div/div/span)[1]").getAttribute("class");

        if (actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator("//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Assign']").click();
            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Assign this action?']").innerText().trim(), "Are you sure you want to Assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO ASSIGN THIS ACTION? TEXT - - -");
            // click cancel
            page.locator("//button[normalize-space()='Cancel']").click();
            page.waitForLoadState();

            // do again
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator("//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Assign']").click();
            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Assign this action?']").innerText().trim(), "Are you sure you want to Assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO ASSIGN THIS ACTION? TEXT - - -");
            String inputString = "a".repeat(2001);
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();

            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Awaiting GM Review']").innerText().trim(), "Awaiting GM Review", "- - - VERIFYING THE STATUS OF THE ACTION AFTER ASSIGNING IT - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER ASSIGNING IT - - -");
        }

        if (actualClassAttributeValueOfViewNotes.contentEquals("note-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-blank")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator("//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Assign']").click();
            String inputString = "a".repeat(2001);
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();
            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Awaiting GM Review']").innerText().trim(), "Awaiting GM Review", "- - - VERIFYING THE STATUS OF THE ACTION AFTER ASSIGNING IT - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER ASSIGNING IT - - -");
        }
    }
}
