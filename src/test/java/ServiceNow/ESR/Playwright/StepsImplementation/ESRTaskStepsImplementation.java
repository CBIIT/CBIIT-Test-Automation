package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class ESRTaskStepsImplementation {

    /**
     * Clicks on the catalog task called Intake Preparation in the ESR ticket
     */
    public static void clickOnIntakePreparationCatalogTask() {
        page.frameLocator(CreateESRPage.iframeSelector).locator(CreateESRPage.newESRTicketSelector).click();
        page.frameLocator(CreateESRPage.iframeSelector).locator("(//td[@class='vt']/a)[1]").click();
    }

    /**
     * Fills out all required information in the ESR-Q Intake Preparation catalog task
     */
    public static void fillOutAllRequiredInformationForESRQIntakePreparation() {
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("CBIIT Test Account");
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Cost Optimization").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Innovation").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Automation").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Process Improvement").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Modernization").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Standardization").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Security Posture").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Staff Productivity").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Other Business Justification").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).fill("Test");
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).fill("Test");
            page.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select)[1]").selectOption("CBIIT");
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Yes").first().click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Labor").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Software licensing").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Hardware").click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Other", new FrameLocator.GetByTextOptions().setExact(true)).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).fill("Test");
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Yes").nth(1).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByText("Yes").nth(2).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(1).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(2).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).fill("Test");
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).fill("Test");
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).click();
            page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).fill("Test");
            page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
            page.frameLocator(CreateESRPage.iframeSelector).locator("#sysverb_update").click();
    }

    /**
     * Fills out all required information in the ESR-I Intake Preparation catalog task
     */
    public static void fillOutAllRequiredInformationForESRIIntakePreparation() {
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("CBIIT Test Account");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Operational Readiness")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Operational Readiness")).fill("Sue Pan");
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Cost Optimization").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Innovation").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Automation").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Process Improvement").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Modernization").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Standardization").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Security Posture").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Staff Productivity").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Other Business Justification").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).fill("Test");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).fill("Test");
        page.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select)[1]").selectOption("CBIIT");
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Yes").first().click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Labor").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Software licensing").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Hardware").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Other", new FrameLocator.GetByTextOptions().setExact(true)).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).fill("Test");
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Yes").nth(1).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByText("Yes").nth(2).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(1).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(2).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).fill("Test");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).fill("Test");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).fill("Test");
        page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        page.frameLocator(CreateESRPage.iframeSelector).locator("#sysverb_update").click();
    }

    /**
     * Confirms that the Intake Preparation catalog task is completed by moving to the next stage
     */
    public static void confirmIntakePreparationTaskIsCompleted() {
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("//select[@aria-label='Stage']")).containsText("Federal Lead Intake Approval");
    }
}
