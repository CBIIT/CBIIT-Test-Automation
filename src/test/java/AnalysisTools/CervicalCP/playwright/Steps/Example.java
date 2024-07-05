package AnalysisTools.CervicalCP.playwright.Steps;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 738));
            Page page = context.newPage();
            page.navigate("https://globalcxca-qa.cancer.gov/");
            assertThat(page.getByLabel("Select Language:")).isVisible();
        }
    }
}
