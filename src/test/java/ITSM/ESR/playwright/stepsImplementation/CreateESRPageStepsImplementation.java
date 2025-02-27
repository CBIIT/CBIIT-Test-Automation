package ITSM.ESR.playwright.stepsImplementation;

import APPS_COMMON.Pages.Playwright_Common_Locators;
import ITSM.ESR.playwright.pages.CreateESRPage;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class CreateESRPageStepsImplementation {

    /**
     * Navigates to the Create ESR page in Native View.
     */
    public static void navigateToCreateESRPage() {
        page.getByPlaceholder(CreateESRPage.filterBoxNativeView).click();
        page.getByPlaceholder(CreateESRPage.filterBoxNativeView).fill(CreateESRPage.ESRText);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CreateESRPage.createESRText)).click();
        CommonUtils.sleep(2000);
    }

    /**
     * Verifies if the given customer details text and project details text are displayed on the create ESR page in Native View.
     *
     * @param customerDetailsText The text to verify for customer details.
     * @param projectDetailsText  The text to verify for project details.
     * @param teamDetailsText     The text to verify for team details.
     */
    public static void verifyTextOnCreateESRPage(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).getByLabel(CreateESRPage.fullESRText)).containsText(customerDetailsText);
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).getByLabel(CreateESRPage.fullESRText)).containsText(projectDetailsText);
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).getByLabel(CreateESRPage.fullESRText)).containsText(teamDetailsText);
    }

    /**
     * Navigates to the NCI At Your Service page from Native View
     */
    public static void navigateToNCIPortalView() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.getByPlaceholder(CreateESRPage.filterBoxNativeView).click();
        page.getByPlaceholder(CreateESRPage.filterBoxNativeView).fill(CreateESRPage.NCIAtYourServiceText);
        page.getByLabel(CreateESRPage.NCIAtYourServiceText, new Page.GetByLabelOptions().setExact(true)).click();
    }

    /**
     * Navigates to the Engineering Support Requests module and Create ESR page from Portal View
     */
    public static void navigateToCreateESRPortalView() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(CreateESRPage.searchBoxPortalView)).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(CreateESRPage.searchBoxPortalView)).fill(CreateESRPage.fullESRText);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CreateESRPage.fullESRTextIcon)).click();
    }

    /**
     * Verifies if the given customer details text and project details text are displayed on the create ESR page on the portal view.
     *
     * @param customerDetailsText The text to verify for customer details.
     * @param projectDetailsText  The text to verify for project details.
     * @param teamDetailsText     The text to verify for team details.
     */
    public static void verifyTextOnESRPage(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        assertThat(page.locator(CreateESRPage.customerDetailsContainer)).containsText(customerDetailsText);
        assertThat(page.locator(CreateESRPage.projectDetailsContainer)).containsText(projectDetailsText);
        assertThat(page.locator(CreateESRPage.teamDetailsContainer)).containsText(teamDetailsText);
    }

    /**
     * Fills in all information required for the creation of an ESR-Q ticket
     */
    public static void fillRequiredInfoForESRQCreation() {
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).fill("Test Project");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).fill("Test Description");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).fill("Cybersecurity");
        page.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-12 form-field input_controls sc-form-field ']/select)[1]").selectOption("Q-Branch");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).fill("Alex Nordan");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).fill("Business Owner");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Assignment Group")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Assignment Group")).press("CapsLock");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Assignment Group")).fill("CHARMS Technical Support");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).fill("123");
        page.onceDialog(dialog -> {
            System.out.println(String.format("Dialog message: %s", dialog.message()));
            dialog.dismiss();
        });
        page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Submit", new FrameLocator.GetByLabelOptions().setExact(true)).click();
    }

    /**
     * Navigates into newly created ESR-Q ticket and validates it as a Q-Branch ticket
     */
    public static void clickOnNewESRQTicket() {
        page.frameLocator(CreateESRPage.iframeSelector).locator(CreateESRPage.newESRTicketSelector).click();
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-12 form-field input_controls sc-form-field ']/select)[1]")).containsText("Q-Branch");
    }

    /**
     * Fills in all information required for the creation of an ESR-I ticket in Native View
     */
    public static void fillRequiredInfoForESRICreation() {
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).fill("Test Project");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).fill("Test Description");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).fill("Cybersecurity");
        page.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-12 form-field input_controls sc-form-field ']/select)[1]").selectOption("Implementation");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).fill("Alex Nordan");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).fill("Business Owner");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Assignment Group")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Assignment Group")).press("CapsLock");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Assignment Group")).fill("CHARMS Technical Support");
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).click();
        page.frameLocator(CreateESRPage.iframeSelector).getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).fill("123");
        page.onceDialog(dialog -> {
            System.out.println(String.format("Dialog message: %s", dialog.message()));
            dialog.dismiss();
        });
        page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Submit", new FrameLocator.GetByLabelOptions().setExact(true)).click();
    }

    /**
     * Navigates into newly created ESR-I ticket and validates it as a Implementation ticket
     */
    public static void clickOnNewESRITicket() {
        page.frameLocator(CreateESRPage.iframeSelector).locator(CreateESRPage.newESRTicketSelector).click();
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-12 form-field input_controls sc-form-field ']/select)[1]")).containsText("Implementation");
    }

    /**
     * Fills in all information required for the creation of an ESR-Q ticket in Portal View
     */
    public static void fillRequiredInfoForESRQPortal() {
        page.getByLabel("Phone").click();
        page.getByLabel("Phone").fill("000");
        page.getByLabel("Project Name").click();
        page.getByLabel("Project Name").fill("Test Project - Portal View");
        page.locator("#s2id_sp_formfield_phase a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Q-Branch")).click();
        page.locator("#s2id_sp_formfield_it_service_area").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Cybersecurity")).click();
        page.getByLabel("Project Description").click();
        page.getByLabel("Project Description").fill("Test Description");
        page.locator("#s2id_sp_formfield_ocio_federal_lead").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText("Alex Nordan").click();
        page.locator("#s2id_sp_formfield_assignment_group_esr").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("CHARMS Technical Support")).click();
        page.locator("#s2id_sp_formfield_business_owner").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText("Aaron Bell").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true)).click();
    }

    /**
     * Navigates into newly created ESR-Q ticket from Portal View and validates it as a Q-Branch ticket
     */
    public static void verifyESRQPortalCreation() {
        page.navigate("https://service-test.nci.nih.gov/ncisp?id=nci_home");
        page.locator("(//div[@role='button'])[3]").click();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("ESR-Q");
        Page page1 = page.waitForPopup(() -> {
            page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]//a").click();
        });
        CommonUtils.sleep(2000);
        assertThat(page1.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-12 form-field input_controls sc-form-field ']/select)[1]")).containsText("Q-Branch");
    }

    /**
     * Fills in all information required for the creation of an ESR-I ticket in Portal View
     */
    public static void fillRequiredInfoForESRIPortal() {
        page.getByLabel("Phone").click();
        page.getByLabel("Phone").fill("000");
        page.getByLabel("Project Name").click();
        page.getByLabel("Project Name").fill("Test Project - Portal View");
        page.locator("#s2id_sp_formfield_it_service_area").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Cybersecurity")).click();
        page.getByLabel("Project Description").click();
        page.getByLabel("Project Description").fill("Test Description");
        page.locator("#s2id_sp_formfield_ocio_federal_lead").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText("Alex Nordan").click();
        page.locator("#s2id_sp_formfield_assignment_group_esr").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("CHARMS Technical Support")).click();
        page.locator("#s2id_sp_formfield_business_owner").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText("Aaron Bell").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true)).click();
    }

    /**
     * Navigates into newly created ESR-I ticket from Portal View and validates it as a Implementation ticket
     */
    public static void verifyESRIPortalCreation() {
        page.navigate("https://service-test.nci.nih.gov/ncisp?id=nci_home");
        page.locator("(//div[@role='button'])[3]").click();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("Implementation");
        Page page1 = page.waitForPopup(() -> {
            page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]//a").click();
        });
        CommonUtils.sleep(2000);
        assertThat(page1.frameLocator(CreateESRPage.iframeSelector).locator("(//div[@class='col-xs-12 form-field input_controls sc-form-field ']/select)[1]")).containsText("Implementation");
    }

    /**
     * Navigates to the newly created ESR-I ticket from ESR-Q ticket
     */
    public static void navigateToGeneratedESRITicket() {

        assertThat(Playwright_Common_Locators.iframeLocator().locator("//tbody/tr[6]/td[1]/div[1]/div[1]/div[1]/div[2]/select[1]")).containsText("Proceed to Implementation");
        Playwright_Common_Locators.iframeLocator().locator("//nav[@role='navigation']//div//div//span//span//span//button[@value='sysverb_update_and_stay']").click();
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_section").getByText("Notes").click();
        CommonUtils.sleep(6000); // System takes a bit of time to generate new ticket
        assertThat(Playwright_Common_Locators.iframeLocator().locator("#sn_form_inline_stream_entries")).containsText("System");
        Playwright_Common_Locators.iframeLocator().locator("//nav[@role='navigation']//div//div//span//span//span//button[@value='sysverb_update_and_stay']").click();
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Requested Items (1)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[52]").click();
    }

    /**
     * Validates that an ESR-I ticket was created from an ESR-Q ticket
     */
    public static void verifyESRITicketCreationFromESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_section").getByText("Notes").click();
        assertThat(Playwright_Common_Locators.iframeLocator().locator("#sn_form_inline_stream_entries")).containsText("This request was generated from");
    }
}
