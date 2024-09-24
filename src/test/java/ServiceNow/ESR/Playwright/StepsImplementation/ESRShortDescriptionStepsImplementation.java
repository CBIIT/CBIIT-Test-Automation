package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class ESRShortDescriptionStepsImplementation {

    // Add Java Docs
    public static void validateFieldsForESR() {
        page.frameLocator(CreateESRPage.iframeSelector).locator(CreateESRPage.newESRTicketSelector).click();
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("[id=\"label\\.sc_req_item\\.u_esr_correlation_id\"]")).containsText("ESR ID");
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("[id=\"label\\.sc_req_item\\.stage\"]")).containsText("Stage");
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("[id=\"label\\.sc_req_item\\.short_description\"]")).containsText("Short description");
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Variables form section")).containsText("Project Name");
    }
}
