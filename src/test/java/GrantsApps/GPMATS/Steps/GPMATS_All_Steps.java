package GrantsApps.GPMATS.Steps;

import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
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
    public void for_the_action_status_drop_down_selects_option(String text) {
        Playwright_Common_Utils.scrollIntoView("(//span[@role='combobox'])[20]");
        page.locator("app-action-status-dropdown").getByRole(AriaRole.LIST).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(text)).click();
    }

    @Given("clicks on the Search button")
    public void clicks_on_the_search_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).nth(1).click();
    }

    @Given("* * THIS TEST STEP INCLUDES ALL CODE FOR THIS TEST CASEE * * *")
    public void this_test_step_includes_all_code_for_this_test_casee() {
        // Constants
        String processDropDownMenuItems = "//div[@class='dropdown-menu dropdown-menu-right show']/a";
        String processDropDownButton = "(//div[@class='dropdown']/button)[1]";
        String putOnHoldOption = "//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Put on Hold']";

        // click on the Process button
        page.waitForSelector(processDropDownButton);
        page.locator(processDropDownButton).click();
        MiscUtils.sleep(2000);

        // Verify Process drop down options
        List<ElementHandle> actualProcessOptions = page.querySelectorAll(processDropDownMenuItems);
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
        String actionSpecialistName = page.locator("(//*[@id='gDt']/tbody/tr/td[15])[1]").innerText();

        // Retrieve the grant number for the first action
        String grantNumber = page.locator("(//div//a[@ngbtooltip='Click to View Grant Details'])[1]").innerText();

        // Retrieve the actual class attribute value of the View Notes bubble for the first action
        String actualClassAttributeValueOfViewNotes = page.locator("(//div[@class='grant-icons']/div/div/span)[1]").getAttribute("class");

        String baseString = "THIS IS AN AUTOMATED TEST FOR BOUNDARY TESTING ";
        String repeatedString = baseString.repeat((2001 / baseString.length()) + 1);
        String inputString = repeatedString.substring(0, 2001);

        // Perform the following if the View Notes bubble has a red check mark with or without a green dot
        if (actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(putOnHoldOption).click();

            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to put this action On Hold?']").innerText().trim(), "Are you sure you want to put this action On Hold?", "- - - VERIFYING ARE YOU SURE YOU WANT TO PUT ON HOLD THIS ACTION? TEXT - - -");
            // click cancel to perform previous steps again
            page.locator("//button[normalize-space()='Cancel']").click();
            page.waitForLoadState();

            // Performing previous steps again
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(putOnHoldOption).click();
            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to put this action On Hold?']").innerText().trim(), "Are you sure you want to put this action On Hold?", "- - - VERIFYING ARE YOU SURE YOU WANT TO PUT ON HOLD THIS ACTION? TEXT - - -");

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();

            // Verifying success message with grants number, status and date
            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Hold']").innerText().trim(), "Hold", "- - - VERIFYING THE STATUS OF THE ACTION AFTER PUTTING IT ON HOLD - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER PUTTING IT ON HOLD - - -");
        }

        // Perform the following if the View Notes bubble is blank with or without green dot
        if (actualClassAttributeValueOfViewNotes.contentEquals("note-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-blank")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(putOnHoldOption).click();

            //  And the system will display warning message "Are you sure you want to put this action On Hold?" with optional comments box (2000 char max)
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to put this action On Hold?']").innerText().trim(), "Are you sure you want to put this action On Hold?", "- - - VERIFYING ARE YOU SURE YOU WANT TO PUT ON HOLD THIS ACTION? TEXT - - -");

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();
        }

        // Verifying success message with grants number, status and date
        Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
        Assert.assertEquals(page.locator("//div[normalize-space()='Hold']").innerText().trim(), "Hold", "- - - VERIFYING THE STATUS OF THE ACTION AFTER PUTTING IT ON HOLD - - -");
        Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER PUTTING IT ON HOLD - - -");

        // And the changes will be reflected in the "Change History" section along with any comments provided
        page.waitForSelector("(//i[@ngbtooltip='View Change History'])[1]");
        page.locator("(//i[@ngbtooltip='View Change History'])[1]").click();
        page.waitForLoadState();
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING CHANGE HISTORY DATE OF PRE-ASSIGNING ACTION IS TODAY - - -");
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]").innerText(), "Hold", "- - - VERIFYING CHANGE HISTORY STATUS OF PRE-ASSIGN - - -");
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]").innerText(), "Baker, Bryan", "- - - VERIFYING CHANGE HISTORY ACTION SPECIALIST OF PRE-ASSIGN - - -");
        String changeHistoryComments = page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]").innerText();
        Assert.assertTrue(changeHistoryComments.length() <= 2000, "- - - VERIFYING CHANGE HISTORY COMMENTS OF PRE-ASSIGN HAS NO MORE THAN 2000 CHARACTERS - - -");

        // Verifying special instruction notes
        page.click("//span[@aria-hidden='true'][normalize-space()='×']");
        page.waitForLoadState();

        page.click("(//div//div[@ngbtooltip='View Notes'])[1]");
        page.waitForLoadState();

        // Verifying Special Instruction header is displayed
        Assert.assertEquals(page.locator("//h5[normalize-space()='Special Instructions']").innerText(), "Special Instructions", "- - - VERIFYING SPECIAL INSTRUCTIONS HEADER - - -");

        // Verifying Special instructions notes header contains grants number
        Assert.assertTrue(page.locator("//div[@class='notes-header']/div/h3").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE NOTES HEADER - - -");

        // Verifying Special instructions contains today's date stamp
        Assert.assertTrue(page.locator("//div[@class='special-inst-grid mb-2']/div[2]/div[1]").innerText().contains(CommonUtils.getTodayDate()), "- - - VERIFYING THE DATE OF THE SPECIAL INSTRUCTIONS IS TODAY's DATE - - -");

        // Verifying Special instructions contains the name of the user who entered the comment
        Assert.assertTrue(page.locator("//div[@class='special-inst-grid mb-2']/div[2]/div[1]").innerText().contains("Bryan Baker"), "- - - VERIFYING THE NAME OF THE USER WHO ENTERED THE SPECIAL INSTRUCTIONS - - -");

        // Verifying Special instructions contains the HOLD status
        Assert.assertTrue(page.locator("//div[@class='special-inst-grid mb-2']/div[2]/div[1]").innerText().contains("HOLD"), "- - - VERIFYING THE STATUS OF THE SPECIAL INSTRUCTIONS IS HOLD - - -");
    }

    @Given("* * THIS TEST STEP INCLUDES ALL CODE FOR THIS TEST CASE - * * *")
    public void this_test_step_includes_all_code_for_this_test_case() {
        // Constants
        String processDropDownMenuItems = "//div[@class='dropdown-menu dropdown-menu-right show']/a";
        String processDropDownButton = "(//div[@class='dropdown']/button)[1]";
        String preAssignOption = "//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Pre-assign']";

        // click on the Process button
        page.waitForSelector(processDropDownButton);
        page.locator(processDropDownButton).click();
        MiscUtils.sleep(2000);

        // Verify Process drop down options
        List<ElementHandle> actualProcessOptions = page.querySelectorAll(processDropDownMenuItems);
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
        String actionSpecialistName = page.locator("(//*[@id='gDt']/tbody/tr/td[15])[1]").innerText();

        // Retrieve the grant number for the first action
        String grantNumber = page.locator("(//div//a[@ngbtooltip='Click to View Grant Details'])[1]").innerText();

        // Retrieve the actual class attribute value of the View Notes bubble for the first action
        String actualClassAttributeValueOfViewNotes = page.locator("(//div[@class='grant-icons']/div/div/span)[1]").getAttribute("class");

        String baseString = "THIS IS AN AUTOMATED TEST FOR BOUNDARY TESTING ";
        String repeatedString = baseString.repeat((2001 / baseString.length()) + 1);
        String inputString = repeatedString.substring(0, 2001);

        if (actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(preAssignOption).click();

            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Pre-assign this action?']").innerText().trim(), "Are you sure you want to Pre-assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO ASSIGN THIS ACTION? TEXT - - -");
            // click cancel to perform previous steps again
            page.locator("//button[normalize-space()='Cancel']").click();
            page.waitForLoadState();

            // Performing previous steps again
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(preAssignOption).click();
            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Pre-assign this action?']").innerText().trim(), "Are you sure you want to Pre-assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO ASSIGN THIS ACTION? TEXT - - -");

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();

            // Verifying success message with grants number, status and date
            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Pre-Assigned']").innerText().trim(), "Pre-Assigned", "- - - VERIFYING THE STATUS OF THE ACTION AFTER ASSIGNING IT - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER ASSIGNING IT - - -");
        }

        // Perform the following if the View Notes bubble is blank with or without green dot
        if (actualClassAttributeValueOfViewNotes.contentEquals("note-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-blank")) {
            // click on pre-assign option
            page.locator(processDropDownButton).click();
            page.click(preAssignOption);

            //  And the system will display warning message "Are you sure you want to Pre-assign this action?" with optional comments box (2000 char max)
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Pre-assign this action?']").innerText().trim(), "Are you sure you want to Pre-assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO PRE-ASSIGN THIS ACTION? TEXT - - -");

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");

            // And the user will be able to click "Cancel" on the warning message pop-up -
            // the warning message will be closed, no changes will be made
            page.locator("//button[normalize-space()='Cancel']").click();

            // Performing previous steps again
            page.locator(processDropDownButton).click();
            page.click(preAssignOption);
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Pre-assign this action?']").innerText().trim(), "Are you sure you want to Pre-assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO PRE-ASSIGN THIS ACTION? TEXT - - -");

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            // Clicks OK
            page.locator("//input[@value='OK']").click();

            // Verifying success message with grants number, status and date
            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Pre-Assigned']").innerText().trim(), "Pre-Assigned", "- - - VERIFYING THE STATUS OF THE ACTION AFTER PRE-ASSIGNING IT - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER PRE-ASSIGNING IT - - -");

        }

        // And the changes will be reflected in the "Change History" section along with any comments provided
        page.waitForSelector("(//i[@ngbtooltip='View Change History'])[1]");
        page.locator("(//i[@ngbtooltip='View Change History'])[1]").click();
        page.waitForLoadState();
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING CHANGE HISTORY DATE OF PRE-ASSIGNING ACTION IS TODAY - - -");
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]").innerText(), "Pre-Assigned", "- - - VERIFYING CHANGE HISTORY STATUS OF PRE-ASSIGN - - -");
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]").innerText(), "Baker, Bryan", "- - - VERIFYING CHANGE HISTORY ACTION SPECIALIST OF PRE-ASSIGN - - -");
        String changeHistoryComments = page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]").innerText();
        Assert.assertTrue(changeHistoryComments.length() <= 2000, "- - - VERIFYING CHANGE HISTORY COMMENTS OF PRE-ASSIGN HAS NO MORE THAN 2000 CHARACTERS - - -");

        // And the assigned GM Specialist will NOT see the action on their tab, when logged in
        page.click("//span[@aria-hidden='true'][normalize-space()='×']");
        page.waitForLoadState();

        if (!actionSpecialistName.isEmpty()) {
            actionSpecialistName = page.locator("(//*[@id='gDt']/tbody/tr/td[15])[1]").innerText();
            page.locator("#change-user-dropdown").click();
            page.getByText("Enter Last Name, First Name").click();
            System.out.println("NAME IS:" + actionSpecialistName);
            page.locator("(//input[@role='searchbox'])[11]").fill(actionSpecialistName);
            page.waitForSelector("//li[@role='option']");
            page.locator("(//li[@role='option'])[1]").click();
            page.waitForSelector("(//button[contains(@class,'btn btn-info')])[1]");
            page.locator("(//button[contains(@class,'btn btn-info')])[1]").click();
            page.waitForLoadState();
            List<ElementHandle> grantNumbers = page.querySelectorAll("//div/a[@ngbtooltip='Click to View Grant Details']");
            for (ElementHandle grantNumberInSpecialistQue : grantNumbers) {
                Assert.assertFalse(grantNumberInSpecialistQue.innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER OF THE ACTION PRE-ASSIGNED IS NOT DISPLAYED IN THE RESULTS TABLE - - -");
            }
            page.waitForLoadState();
        }
    }

    @When("test step with all code for this test case")
    public void test_step() {

        // Constants
        String processDropDownMenuItems = "//div[@class='dropdown-menu dropdown-menu-right show']/a";
        String processDropDownButton = "(//div[@class='dropdown']/button)[1]";
        String assignOption = "//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Assign']";

        page.waitForSelector(processDropDownButton);
        // click on the Process button
        page.locator(processDropDownButton).click();
        MiscUtils.sleep(2000);
        List<ElementHandle> actualProcessOptions = page.querySelectorAll(processDropDownMenuItems);
        List<String> expectedProcessOptions = new ArrayList<>();
        expectedProcessOptions.add("Assign");
        expectedProcessOptions.add("Cancel");
        expectedProcessOptions.add("Pre-assign");
        expectedProcessOptions.add("Put on Hold");
        List<String> valuesToBeComparedWith = new ArrayList<>();
        for (ElementHandle processOption : actualProcessOptions) {
            valuesToBeComparedWith.add(processOption.innerText());
        }
        // Verify Process drop down options
        Assert.assertEquals(valuesToBeComparedWith, expectedProcessOptions, "- - - VERIFYING PROCESS OPTIONS - - -");
        page.waitForSelector("(//i[contains(@class,'bi bi-dash-circle')])[1]");
        page.locator("(//i[contains(@class,'bi bi-dash-circle')])[1]").click();
        MiscUtils.sleep(1000);

        // Retrieve the name of the action specialist for the first action
        String actionSpecialistName = page.locator("(//*[@id='gDt']/tbody/tr/td[15])[1]").innerText();

        // Retrieve the grant number for the first action
        String grantNumber = page.locator("(//div//a[@ngbtooltip='Click to View Grant Details'])[1]").innerText();

        // Perform the following if action does not have a specialist assigned
        if (actionSpecialistName.isEmpty()) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(assignOption).click();
            Assert.assertEquals(page.locator("//div[contains(@class,'text-center')]").innerText().trim(), "Please select GMS before proceeding.", "- - - VERIFYING PLEASE SELECT GMS BEFORE PROCEEDING. TEXT IF ACTION DID NOT HAVE AN ACTION SPECIALIST ASSIGNED  - - -");
            page.locator("//button[normalize-space()='OK']").click();
            page.waitForLoadState();
            page.locator("//button[normalize-space()='Edit']").click();
            page.click("//ng-select2[@class='ng-untouched ng-pristine ng-invalid']//span[@role='combobox']");
            page.locator("//ul[@class='select2-results__options']/li[1]").click();
            page.locator("//button[normalize-space()='Save']").click();
            page.locator("//button[normalize-space()='OK']").click();
        }

        // Retrieve the actual class attribute value of the View Notes bubble for the first action
        String actualClassAttributeValueOfViewNotes = page.locator("(//div[@class='grant-icons']/div/div/span)[1]").getAttribute("class");

        String baseString = "THIS IS AN AUTOMATED TEST FOR BOUNDARY TESTING ";
        String repeatedString = baseString.repeat((2001 / baseString.length()) + 1);
        String inputString = repeatedString.substring(0, 2001);
        // Perform the following if the View Notes bubble has a red check mark with or without a green dot
        if (actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-red-checked")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(assignOption).click();

            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Assign this action?']").innerText().trim(), "Are you sure you want to Assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO ASSIGN THIS ACTION? TEXT - - -");
            // click cancel to perform previous steps again
            page.locator("//button[normalize-space()='Cancel']").click();
            page.waitForLoadState();

            // Performing previous steps again
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(assignOption).click();
            Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
            page.locator("//button[normalize-space()='Acknowledge']").click();
            Assert.assertEquals(page.locator("//label[normalize-space()='Are you sure you want to Assign this action?']").innerText().trim(), "Are you sure you want to Assign this action?", "- - - VERIFYING ARE YOU SURE YOU WANT TO ASSIGN THIS ACTION? TEXT - - -");

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();

            // Verifying success message with grants number, status and date
            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Awaiting GM Review']").innerText().trim(), "Awaiting GM Review", "- - - VERIFYING THE STATUS OF THE ACTION AFTER ASSIGNING IT - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER ASSIGNING IT - - -");
        }

        // Perform the following if the View Notes bubble is blank with or without green dot
        if (actualClassAttributeValueOfViewNotes.contentEquals("note-green-dot") || actualClassAttributeValueOfViewNotes.contentEquals("note-blank")) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(assignOption).click();

            // Verifying that the text box allows only 2000 characters
            page.waitForSelector("//textarea");
            page.locator("//textarea").fill(inputString);
            String actualValue = page.inputValue("//textarea");
            Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
            page.locator("//input[@value='OK']").click();
            page.waitForLoadState();

            // Verifying success message with grants number, status and date
            Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
            Assert.assertEquals(page.locator("//div[normalize-space()='Awaiting GM Review']").innerText().trim(), "Awaiting GM Review", "- - - VERIFYING THE STATUS OF THE ACTION AFTER ASSIGNING IT - - -");
            Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER ASSIGNING IT - - -");
        }
        // And the changes will be reflected in the "Change History" section along with any comments provided
        page.waitForSelector("(//i[@ngbtooltip='View Change History'])[1]");
        page.locator("(//i[@ngbtooltip='View Change History'])[1]").click();
        page.waitForLoadState();
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING CHANGE HISTORY DATE OF ASSIGNING ACTION IS TODAY - - -");
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]").innerText(), "Awaiting GM Review", "- - - VERIFYING CHANGE HISTORY STATUS OF ASSIGNING ACTION IS AWAITING GM REVIEW - - -");
        Assert.assertEquals(page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]").innerText(), "Baker, Bryan", "- - - VERIFYING CHANGE HISTORY ACTION SPECIALIST OF ASSIGNING ACTION IS BAKER, BRYAN [OD OM OGA] - - -");
        String changeHistoryComments = page.locator("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-action-chnage-history-modal[1]/div[2]/app-action-status-history[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]").innerText();
        Assert.assertTrue(changeHistoryComments.length() <= 2000, "- - - VERIFYING CHANGE HISTORY COMMENTS OF ASSIGNING ACTION HAS NO MORE THAN 2000 CHARACTERS - - -");

        // And the assigned GM Specialist will see the action on their tab, when logged in
        page.click("//span[@aria-hidden='true'][normalize-space()='×']");
        page.waitForLoadState();
        actionSpecialistName = page.locator("(//*[@id='gDt']/tbody/tr/td[15])[1]").innerText();
        page.locator("#change-user-dropdown").click();
        page.getByText("Enter Last Name, First Name").click();
        System.out.println("NAME IS:" + actionSpecialistName);
        page.locator("(//input[@role='searchbox'])[11]").fill(actionSpecialistName);
        page.waitForSelector("//li[@role='option']");
        page.locator("(//li[@role='option'])[1]").click();

        // Clicking on My Specialist Que and verifying that the action assigned is displayed in the results table
        page.waitForSelector("//button[contains(@class,'btn btn-info')]");
        page.locator("//button[contains(@class,'btn btn-info')]").click();
        page.waitForLoadState();
        List<ElementHandle> grantNumbers = page.querySelectorAll("//div/a[@ngbtooltip='Click to View Grant Details']");
        for (ElementHandle grantNumberInSpecialistQue : grantNumbers) {
            Assert.assertTrue(grantNumberInSpecialistQue.innerText().contains(grantNumber), "- - - VERIFYING THE GRANT NUMBER OF THE ACTION ASSIGNED TO THE SPECIALIST IS DISPLAYED IN THE RESULTS TABLE - - -");
        }
        page.waitForLoadState();
    }

    @Then("search results with the New Actions status display")
    public void search_results_with_the_new_actions_status_display() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("automated test retrieves the Action Specialist Name, Grant Number, and the attribute value of the View Notes bubble of the first action for testing")
    public void automated_test_retrieves_the_action_specialist_name_grant_number_and_the_attribute_value_of_the_view_notes_bubble_of_the_first_action_for_testing() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("clicks on the Process button for any Action")
    public void clicks_on_the_process_button_for_any_action() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the following options are displayed:")
    public void the_following_options_are_displayed(io.cucumber.datatable.DataTable dataTable) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("* * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED * * *")
    public void perform_the_following_steps_only_if_an_action_has_no_specialist_assigned() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("if the user clicks on Assign option to an action that has no specialist assigned")
    public void if_the_user_clicks_on_assign_option_to_an_action_that_has_no_specialist_assigned() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the following message displays if no GMS is selected: {string}")
    public void the_following_message_displays_if_no_gms_is_selected(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("in order to proceed with assigning an action for an action that had no specialist assigned, the user has to edit the action by selecting an Action specialist from the Action Specialist drop-down and saves")
    public void in_order_to_proceed_with_assigning_an_action_for_an_action_that_had_no_specialist_assigned_the_user_has_to_edit_the_action_by_selecting_an_action_specialist_from_the_action_specialist_drop_down_and_saves() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("* * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE HAS A RED CHECK MARK WITH OUR WITHOUT A GREEN DOT * * *")
    public void perform_the_following_steps_only_if_an_action_has_a_specialist_assigned_and_the_view_notes_bubble_has_a_red_check_mark_with_our_without_a_green_dot() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble has a red check mark with or without a green dot")
    public void if_the_user_clicks_on_assign_option_to_an_action_that_has_a_specialist_assigned_and_the_view_notes_bubble_has_a_red_check_mark_with_or_without_a_green_dot() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the user sees message {string} and cancels the acknowledgement to verify that the previous step can be performed again with the same action")
    public void the_user_sees_message_and_cancels_the_acknowledgement_to_verify_that_the_previous_step_can_be_performed_again_with_the_same_action(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble has a red check mark with or without a green dot again")
    public void if_the_user_clicks_on_assign_option_to_an_action_that_has_a_specialist_assigned_and_the_view_notes_bubble_has_a_red_check_mark_with_or_without_a_green_dot_again() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the user sees message {string}")
    public void the_user_sees_message(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("the user acknowledges then user sees message {string}")
    public void the_user_acknowledges_then_user_sees_message(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("user can enter comments in the Status Comments field and verifies that the field does not allow more than {int} characters and clicks OK")
    public void user_can_enter_comments_in_the_status_comments_field_and_verifies_that_the_field_does_not_allow_more_than_characters_and_clicks_ok(Integer int1) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("verifies the confirmation message displays: Success! Workflow has been successfully processed for 'GPMATS action's grant number'")
    public void verifies_the_confirmation_message_displays_success_workflow_has_been_successfully_processed_for_gpmats_action_s_grant_number() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("verifies the Status changes from New to {string} for the action")
    public void verifies_the_status_changes_from_new_to_for_the_action(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("verifies the date stamp of the action is today's date")
    public void verifies_the_date_stamp_of_the_action_is_today_s_date() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("* * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS A SPECIALIST ASSIGNED AND THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT * * *")
    public void perform_the_following_steps_only_if_an_action_has_a_specialist_assigned_and_the_view_notes_bubble_is_blank_or_just_has_a_green_dot() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("if the user clicks on Assign option to an action that has a specialist assigned and the View Notes bubble is blank or just has a green dot")
    public void if_the_user_clicks_on_assign_option_to_an_action_that_has_a_specialist_assigned_and_the_view_notes_bubble_is_blank_or_just_has_a_green_dot() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("optional comments can be entered in the Status Comments field which should not allow more than {int} characters and clicks ok")
    public void optional_comments_can_be_entered_in_the_status_comments_field_which_should_not_allow_more_than_characters_and_clicks_ok(Integer int1) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("* * THE FOLLOWING STEPS APPLY TO ALL SCENARIOS ABOVE * * *")
    public void the_following_steps_apply_to_all_scenarios_above() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the changes will be reflected in the Change History section such as the date being today's date, the status, GM Action Manager along with any comments provided in the previous step")
    public void the_changes_will_be_reflected_in_the_section_along_with_any_comments_provided() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the assigned GM Specialist will see the action on {string} tab, when logged in")
    public void the_assigned_gm_specialist_will_see_the_action_on_tab_when_logged_in(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("* * PERFORM THE FOLLOWING STEPS ONLY IF AN ACTION HAS NO SPECIALIST ASSIGNED OR IF THE VIEW NOTES BUBBLE IS BLANK OR JUST HAS A GREEN DOT  * * *")
    public void perform_the_following_steps_only_if_an_action_has_no_specialist_assigned_or_if_the_view_notes_bubble_is_blank_or_just_has_a_green_dot() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the user is able to select {string} option")
    public void the_user_is_able_to_select_option(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the system will display warning message {string} with optional comments box \\({int} char max)")
    public void the_system_will_display_warning_message_with_optional_comments_box_char_max(String string, Integer int1) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the user will be able to click {string} on the warning message pop-up - the warning message will be closed, no changes will be made")
    public void the_user_will_be_able_to_click_on_the_warning_message_pop_up_the_warning_message_will_be_closed_no_changes_will_be_made(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("the user clicks on the {string} option again")
    public void the_user_clicks_on_the_option_again(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the user will be able to click {string} on the warning message pop-up")
    public void the_user_will_be_able_to_click_on_the_warning_message_pop_up(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the assigned GM Specialist \\(if any) will NOT see the action on {string} tab, when logged in")
    public void the_assigned_gm_specialist_if_any_will_not_see_the_action_on_tab_when_logged_in(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("the user clicks on the {string} option for an action, and the {string} bubble has a red check mark, either with or without a green dot.")
    public void the_user_clicks_on_the_option_for_an_action_and_the_bubble_has_a_red_check_mark_either_with_or_without_a_green_dot(String string, String string2) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("the user clicks on the {string} option for an action, and the {string} bubble has a red check mark, either with or without a green dot. again")
    public void the_user_clicks_on_the_option_for_an_action_and_the_bubble_has_a_red_check_mark_either_with_or_without_a_green_dot_again(String string, String string2) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @When("the user acknowledges and sees message {string}")
    public void the_user_acknowledges_and_sees_message(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("verifies that the following confirmation message is displayed: 'Success! The workflow for the 'GPMATS action's grant number' has been successfully processed.'")
    public void verifies_that_the_following_confirmation_message_is_displayed_success_the_workflow_for_the_gpmats_action_s_grant_number_has_been_successfully_processed() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }

    @Then("the system will display warning message {string}")
    public void the_system_will_display_warning_message(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @When("the user clicks on {string} option again for the same action again")
    public void the_user_clicks_on_option_again_for_the_same_action_again(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @When("the user selects the {string} bubble for an action that was put on hold")
    public void the_user_selects_the_bubble_for_an_action_that_was_put_on_hold(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @Then("the user should see a header in the Notes section that contains the grant number of the current action")
    public void the_user_should_see_a_header_in_the_notes_section_that_contains_the_grant_number_of_the_current_action() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @Then("the {string} header is visible to the user")
    public void the_header_is_visible_to_the_user(String string) {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @Then("the user observes that the latest note header displays the date when the note was added")
    public void the_user_observes_that_the_latest_note_header_displays_the_date_when_the_note_was_added() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @Then("the user observes that the latest note header shows the name of the user who contributed the note")
    public void the_user_observes_that_the_latest_note_header_shows_the_name_of_the_user_who_contributed_the_note() {
        CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
    @Then("an indication that an action was put on hold is shown to the user via a {string} label next to the author's name in the most recent note header.")
    public void an_indication_that_an_action_was_put_on_hold_is_shown_to_the_user_via_a_label_next_to_the_author_s_name_in_the_most_recent_note_header(String string) {
      CucumberLogUtils.scenario.log("* * * THE CODE OF THIS STEP IS COVERED IN THE TEST STEP WITH ALL CODE * * *");
    }
}
