package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.impl.PlaywrightImpl;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ESRTaskStepsImplementation {

    /**
     * Clicks on the catalog task called Intake Preparation in the ESR ticket
     */
    public static void clickOnIntakePreparationCatalogTask() {
        Playwright_Common_Locators.iframeLocator().locator(CreateESRPage.newESRTicketSelector).click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
    }

    /**
     * Fills out all required information in the ESR-Q Intake Preparation catalog task
     */
    public static void fillOutAllRequiredInformationForESRQIntakePreparation() {
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByText("Cost Optimization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Innovation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Automation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Process Improvement").click();
        Playwright_Common_Locators.iframeLocator().getByText("Modernization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Standardization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Security Posture").click();
        Playwright_Common_Locators.iframeLocator().getByText("Staff Productivity").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other Business Justification").click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).fill("Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select)[1]").selectOption("CBIIT");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").first().click();
        Playwright_Common_Locators.iframeLocator().getByText("Labor").click();
        Playwright_Common_Locators.iframeLocator().getByText("Software licensing").click();
        Playwright_Common_Locators.iframeLocator().getByText("Hardware").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other", new FrameLocator.GetByTextOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Fills out all required information in the ESR-I Intake Preparation catalog task
     */
    public static void fillOutAllRequiredInformationForESRIIntakePreparation() {
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Operational Readiness")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Operational Readiness")).fill("Sue Pan");
        Playwright_Common_Locators.iframeLocator().getByText("Cost Optimization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Innovation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Automation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Process Improvement").click();
        Playwright_Common_Locators.iframeLocator().getByText("Modernization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Standardization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Security Posture").click();
        Playwright_Common_Locators.iframeLocator().getByText("Staff Productivity").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other Business Justification").click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).fill("Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select)[1]").selectOption("CBIIT");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").first().click();
        Playwright_Common_Locators.iframeLocator().getByText("Labor").click();
        Playwright_Common_Locators.iframeLocator().getByText("Software licensing").click();
        Playwright_Common_Locators.iframeLocator().getByText("Hardware").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other", new FrameLocator.GetByTextOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).fill("Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@style='width: 100%; line-height: 32px;']/span)[7]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//div[@style='width: 100%; line-height: 32px;']/span)[9]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Confirms that the Intake Preparation catalog task is completed by moving to the next stage
     */
    public static void confirmIntakePreparationTaskIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Federal Lead Intake Approval");
    }

    /**
     * Completes the ESR Board Intake Review catalog task
     */
    public static void completeESRBoardIntakeReviewCatalogTask() {
        CommonUtils.sleep(3000);
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (2)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").fill("Kui Wu");
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Confirms that the ESR Board Intake Review catalog task is completed
     */
    public static void confirmESRBoardIntakeReviewCatalogTaskIsCompleted() {

    }
}