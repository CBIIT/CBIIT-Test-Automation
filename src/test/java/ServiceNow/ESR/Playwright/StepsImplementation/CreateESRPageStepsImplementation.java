package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CreateESRPageStepsImplementation {

    /**
     * Navigates to the Create ESR page.
     */
    public static void navigateToCreateESRPage() {
        PlaywrightUtils.page.getByPlaceholder(CreateESRPage.filterBoxNativeView).click();
        PlaywrightUtils.page.getByPlaceholder(CreateESRPage.filterBoxNativeView).fill(CreateESRPage.ESRText);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CreateESRPage.createESRText)).click();
        MiscUtils.sleep(2000);
    }

    /**
     * Verifies if the given customer details text and project details text are displayed on the create ESR page.
     *
     * @param customerDetailsText The text to verify for customer details.
     * @param projectDetailsText  The text to verify for project details.
     */
    public static void verifyTextOnCreateESRPage(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        assertThat(PlaywrightUtils.page.frameLocator(CreateESRPage.iframeSelector).getByLabel(CreateESRPage.fullESRText)).containsText(customerDetailsText);
        assertThat(PlaywrightUtils.page.frameLocator(CreateESRPage.iframeSelector).getByLabel(CreateESRPage.fullESRText)).containsText(projectDetailsText);
        assertThat(PlaywrightUtils.page.frameLocator(CreateESRPage.iframeSelector).getByLabel(CreateESRPage.fullESRText)).containsText(teamDetailsText);
    }

    public static void navigateToNCIPortalView() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        PlaywrightUtils.page.getByPlaceholder(CreateESRPage.filterBoxNativeView).click();
        PlaywrightUtils.page.getByPlaceholder(CreateESRPage.filterBoxNativeView).fill(CreateESRPage.NCIAtYourServiceText);
        PlaywrightUtils.page.getByLabel(CreateESRPage.NCIAtYourServiceText, new Page.GetByLabelOptions().setExact(true)).click();
    }

    public static void navigateToCreateESRPortalView() {
        PlaywrightUtils.page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(CreateESRPage.searchBoxPortalView)).click();
        PlaywrightUtils.page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(CreateESRPage.searchBoxPortalView)).fill(CreateESRPage.fullESRText);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CreateESRPage.fullESRTextIcon)).click();
    }

    public static void verifyTextOnESRPage(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        assertThat(PlaywrightUtils.page.locator(CreateESRPage.customerDetailsContainer)).containsText(customerDetailsText);
        assertThat(PlaywrightUtils.page.locator(CreateESRPage.projectDetailsContainer)).containsText(projectDetailsText);
        assertThat(PlaywrightUtils.page.locator(CreateESRPage.teamDetailsContainer)).containsText(teamDetailsText);
    }

    public static void fillRequiredInfoForESRQCreation() {
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).fill("Test Project");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).fill("Test Description");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).fill("Cybersecurity");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").locator("select[name=\"IO\\:803573521be92110f360a681f54bcb36\"]").selectOption("Q-Branch");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).fill("Alex Nordan");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).fill("Business Owner");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Lead Assignment Group")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Lead Assignment Group")).press("CapsLock");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Lead Assignment Group")).fill("CHARMS Technical Support");
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).click();
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).fill("123");
        PlaywrightUtils.page.onceDialog(dialog -> {
            System.out.println(String.format("Dialog message: %s", dialog.message()));
            dialog.dismiss();
        });
        PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Submit", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        MiscUtils.sleep(3000);
    }

}
