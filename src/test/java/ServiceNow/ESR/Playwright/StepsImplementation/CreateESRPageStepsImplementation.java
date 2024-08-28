package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
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

}
