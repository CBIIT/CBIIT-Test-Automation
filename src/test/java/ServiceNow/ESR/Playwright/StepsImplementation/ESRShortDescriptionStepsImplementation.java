package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;

import static com.nci.automation.web.PlaywrightUtils.page;

public class ESRShortDescriptionStepsImplementation {

    public static void validateFieldsForESR() {
        page.frameLocator(CreateESRPage.iframeSelector).locator("//tbody/tr/td/a[1]").click();
    }
}
