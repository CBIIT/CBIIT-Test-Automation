package GrantsApps.GPMATS.Steps;

import com.microsoft.playwright.ElementHandle;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import static com.nci.automation.web.PlaywrightUtils.page;

public class GPMATS_Common_Methods {

    public String processDropDownMenuItems = "//div[@class='dropdown-menu dropdown-menu-right show']/a";
    public String processDropDownButton = "(//div[@class='dropdown']/button)[1]";
    public String putOnHoldOption = "//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Put on Hold']";
    public String grantNumber = page.locator("(//div//a[@ngbtooltip='Click to View Grant Details'])[1]").innerText();
    public String actionSpecialistName = page.locator("(//*[@id='gDt']/tbody/tr/td[15])[1]").innerText();
    public String assignOption = "//div[@class='dropdown-menu dropdown-menu-right show']/a[normalize-space()='Assign']";
    //static GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();

    /**
     * Verifies the actual process options against the expected process options.
     * It compares the list of actual process options obtained from the page with the expected process options,
     * and asserts if they match. After the verification, it performs additional actions like clicking on an element
     * and introducing a short delay for further processing.
     */
    public static void verifyingActualProcessOptions(){
        GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();
        List<ElementHandle> actualProcessOptions = page.querySelectorAll(gpmatsCommonMethods.processDropDownMenuItems);
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
        CommonUtils.sleep(1000);
    }

    /**
     * Waits for the process drop-down button to be visible on the page,
     * clicks on the process drop-down button, and then waits for 2 seconds.
     * This method is used to simulate clicking on the process button of the first action
     * in a given page or user interface.
     */
    public static void clickOnProcessButtonOfFirstAction(){
        GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();
        page.waitForSelector(gpmatsCommonMethods.processDropDownButton);
        page.locator(gpmatsCommonMethods.processDropDownButton).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Generates a boundary test string.
     *
     * @return The generated boundary test string.
     */
    public static String generateBoundaryTestString() {
        String baseString = "THIS IS AN AUTOMATED TEST FOR BOUNDARY TESTING ";
        String repeatedString = baseString.repeat((2001 / baseString.length()) + 1);
        return repeatedString.substring(0, 2001);
    }

    /**
     * Clicks on the "Put on Hold" option of the first action in the process drop-down menu.
     * This method waits for the process drop-down button to be visible on the page,
     * clicks on the process drop-down button, and then waits for the "Put on Hold" option to be visible.
     * Finally, it clicks on the "Put on Hold" option.
     */
    public static void clickOnHoldOptionOfFirstAction(){
        GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();
        page.waitForSelector(gpmatsCommonMethods.processDropDownButton);
        page.locator(gpmatsCommonMethods.processDropDownButton).click();
        page.locator(gpmatsCommonMethods.putOnHoldOption).click();
    }

    /**
     * Verifies that the status comments text box does not allow more than 2000 characters.
     */
    public static void verifyingStatusCommentsTextBoxDoesNotAllowMoreThan2000Characters(){
        page.waitForSelector("//textarea");
        page.locator("//textarea").fill(generateBoundaryTestString());
        String actualValue = page.inputValue("//textarea");
        Assert.assertTrue(actualValue.length() <= 2000, "- - - TEXTBOX ALLOWS MORE THAN 2000 CHARACTERS. - - -");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the action on hold by performing the following checks:
     * 1. Verifies if the grant number is included in the success message text.
     * 2. Verifies if the status of the action is "Hold" after putting it on hold.
     * 3. Verifies if the date of the action is today's date after putting it on hold.
     */
    public static void verifyActionOnHold() {
        GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();
        System.out.println("GRANT NUMBER: " + gpmatsCommonMethods.grantNumber);
        Assert.assertTrue(page.locator("//div[@id='submitMessage']/span").innerText().contains(gpmatsCommonMethods.grantNumber), "- - - VERIFYING THE GRANT NUMBER IS INCLUDED IN THE SUCCESS MESSAGE TEXT.- - -");
        Assert.assertEquals(page.locator("//div[normalize-space()='Hold']").innerText().trim(), "Hold", "- - - VERIFYING THE STATUS OF THE ACTION AFTER PUTTING IT ON HOLD - - -");
        Assert.assertEquals(page.locator("(//td[@class='sorting_3']/app-current-status)[1]/div[2]").innerText(), CommonUtils.getTodayDate(), "- - - VERIFYING THE DATE OF THE ACTION AFTER PUTTING IT ON HOLD - - -");
    }

    /**
     * Clicks the "Cancel" button on the page.
     * This method locates the "Cancel" button using a specific XPath selector and clicks on it.
     * After clicking the button, it waits for the page to finish loading.
     */
    public static void clickCancelButton() {
        page.locator("//button[normalize-space()='Cancel']").click();
        page.waitForLoadState();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks the "OK" button on the page.
     * This method locates the "OK" button using a specific XPath selector and clicks on it.
     * After clicking the button, it waits for the page to finish loading.
     */
    public static void clickOkButton(){
        page.locator("//input[@value='OK']").click();
        page.waitForLoadState();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the action is not displayed in the results table.
     */
    public static void verifyingGrantNumberOfActionIsNotDisplayedOnGMSpecialistResultsTable(){
        page.click("//span[@aria-hidden='true'][normalize-space()='×']");
        page.waitForLoadState();
        CucumberLogUtils.playwrightScreenshot(page);
        GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();
        if (!gpmatsCommonMethods.actionSpecialistName.isEmpty()) {
            page.locator("#change-user-dropdown").click();
            CucumberLogUtils.playwrightScreenshot(page);
            page.getByText("Enter Last Name, First Name").click();
            CucumberLogUtils.playwrightScreenshot(page);
            System.out.println("NAME IS:" + gpmatsCommonMethods.actionSpecialistName);
            page.locator("(//input[@role='searchbox'])[11]").fill(gpmatsCommonMethods.actionSpecialistName);
            page.waitForSelector("//li[@role='option']");
            page.locator("(//li[@role='option'])[1]").click();
            CucumberLogUtils.playwrightScreenshot(page);
            page.waitForSelector("(//button[contains(@class,'btn btn-info')])[1]");
            page.locator("(//button[contains(@class,'btn btn-info')])[1]").click();
            CucumberLogUtils.playwrightScreenshot(page);
            page.waitForLoadState();
            List<ElementHandle> grantNumbers = page.querySelectorAll("//div/a[@ngbtooltip='Click to View Grant Details']");
            for (ElementHandle grantNumberInSpecialistQue : grantNumbers) {
                Assert.assertFalse(grantNumberInSpecialistQue.innerText().contains(gpmatsCommonMethods.grantNumber), "- - - VERIFYING THE GRANT NUMBER OF THE ACTION IS NOT DISPLAYED IN THE RESULTS TABLE - - -");
            }
            page.waitForLoadState();
        }
    }

    /**
     * Assigns a specialist if not assigned.
     */
    public static void assignSpecialistIfNotAssigned() {
        GPMATS_Common_Methods gpmatsCommonMethods = new GPMATS_Common_Methods();
        if (gpmatsCommonMethods.actionSpecialistName.isEmpty()) {
            page.locator("(//div[@class='dropdown']/button)[1]").click();
            page.locator(gpmatsCommonMethods.assignOption).click();
            Assert.assertEquals(page.locator("//div[contains(@class,'text-center')]").innerText().trim(), "Please select GMS before proceeding.", "- - - VERIFYING PLEASE SELECT GMS BEFORE PROCEEDING. TEXT IF ACTION DID NOT HAVE AN ACTION SPECIALIST ASSIGNED  - - -");
            page.locator("//button[normalize-space()='OK']").click();
            page.waitForLoadState();
            page.locator("//button[normalize-space()='Edit']").click();
            page.click("//ng-select2[@class='ng-untouched ng-pristine ng-invalid']//span[@role='combobox']");
            page.locator("//ul[@class='select2-results__options']/li[1]").click();
            page.locator("//button[normalize-space()='Save']").click();
            page.locator("//button[normalize-space()='OK']").click();
        }
    }

    /**
     * Verifies the acknowledgement special instructions and acknowledges them.
     */
    public static void verifying_Acknowledge_Special_Instructions_And_Acknowledging(){
        Assert.assertEquals(page.locator("//span[@class='modal-title']").innerText().trim(), "Please acknowledge all Special Instruction(s) before processing the action.", "- - - VERIFYING PLEASE ACKNOWLEDGE ALL SPECIAL INSTRUCTIONS BEFORE PROCESSING THE ACTION. TEXT IF ACTION HAD SPECIAL INSTRUCTIONS THAT WERE NOT ACKNOWLEDGED - - -");
        page.locator("//button[normalize-space()='Acknowledge']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on the "Change History" button of the first action.
     */
    public static void clicking_On_Change_History_Of_FirstAction(){
        page.waitForSelector("(//i[@ngbtooltip='View Change History'])[1]");
        page.locator("(//i[@ngbtooltip='View Change History'])[1]").click();
        page.waitForLoadState();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}