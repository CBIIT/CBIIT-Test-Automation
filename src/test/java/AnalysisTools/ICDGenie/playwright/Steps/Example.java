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
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("API Access")).click();
            page.getByLabel("post /api/search").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Try it out")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Execute")).click();
            assertThat(page.getByText("https://icdgenie-qa.cancer.gov/api/search", new Page.GetByTextOptions().setExact(true))).isVisible();
            assertThat(page.locator("#operations-Search-post_api_search")).containsText("https://icdgenie-qa.cancer.gov/api/search");
            assertThat(page.getByRole(AriaRole.TABLE)).containsText("200");
        }
    }
}