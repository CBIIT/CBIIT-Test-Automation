package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CreateESRPageStepsImplementation {

    /**
     * Navigates to the Create ESR page.
     */
    public static void navigateToCreateESRPage() {
        PlaywrightUtils.page.getByPlaceholder("Filter").click();
        PlaywrightUtils.page.getByPlaceholder("Filter").fill(CreateESRPage.ESRText);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CreateESRPage.createESRText)).click();
    }

    /**
     * Verifies if the given customer details text and project details text are displayed on the create ESR page.
     *
     * @param customerDetailsText The text to verify for customer details.
     * @param projectDetailsText  The text to verify for project details.
     */
    public static void verifyTextOnCreateESRPage(String customerDetailsText, String projectDetailsText) {
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel(CreateESRPage.fullESRText)).containsText(customerDetailsText);
        assertThat(PlaywrightUtils.page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel(CreateESRPage.fullESRText)).containsText(projectDetailsText);
    }

}
