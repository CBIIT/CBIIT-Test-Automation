package AnalysisTools.ICDGenie.playwright.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Example {
    public static void main(String[] args) {
try (Playwright playwright = Playwright.create()) {
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
            .setHeadless(false));
    BrowserContext context = browser.newContext(new Browser.NewContextOptions()
            .setViewportSize(1512, 738));
    Page page = context.newPage();
    page.navigate("https://icdgenie-qa.cancer.gov/");
    page.locator("#app-navbar").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Getting Started")).click();
    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("TUTORIALS")).click();
    assertThat(page.frameLocator("iframe[title=\"formatting\"]").locator("vb-overlay-play-controls div").first()).isVisible();
    assertThat(page.frameLocator("iframe[title=\"batch\"]").locator("vb-overlay-play-controls div").first()).isVisible();
}
    }
}