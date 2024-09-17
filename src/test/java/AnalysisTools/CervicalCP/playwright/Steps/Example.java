package AnalysisTools.CervicalCP.playwright.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 738));
            Page page = context.newPage();
            page.navigate("https://globalcxca-qa.cancer.gov/#/run-scenario");
            page.getByPlaceholder("Enter Value").click();
            page.getByPlaceholder("Enter Value").fill("10000");
            page.getByPlaceholder("Enter 1 -").fill("1");
            page.getByLabel("Cervical screening test chosen").selectOption("pap");
            page.getByLabel("Percent screening coverage").fill("100");
            page.getByLabel("Triage").check();
            page.getByRole(AriaRole.SLIDER, new Page.GetByRoleOptions().setName("Percent of screen positives")).fill("100");
            page.locator("#triageTestSensitivity").nth(1).fill("100");
            page.locator("#triageTestSpecificity").nth(1).fill("100");
            page.getByLabel("Colposcopy").check();
            page.locator("#percentTriaged").nth(2).fill("100");
            page.locator("#diagnosticTestSensitivity").nth(2).fill("100");
            page.locator("#diagnosticTestSpecificity").nth(2).fill("100");
            page.getByLabel("Percent of diagnostic test").fill("100");
            MiscUtils.sleep(1000);
            assertThat(page.locator("#tab1Content")).containsText("0.0%");
            assertThat(page.locator("#tab1Content")).containsText("0.0%");
            page.getByLabel("Expand").nth(1).click();
            page.locator("#triageTestSensitivity").nth(2).fill("50");
            MiscUtils.sleep(1000);
            assertThat(page.locator("#tab1Content")).containsText("42.9%");
            assertThat(page.locator("#tab1Content")).containsText("0.0%");
            page.locator("#triageTestSensitivity").nth(2).fill("100");
            page.locator("#diagnosticTestSensitivity").nth(3).fill("50");
            MiscUtils.sleep(1000);
            assertThat(page.locator("#tab1Content")).containsText("0.0%");
            assertThat(page.locator("#tab1Content")).containsText("42.9%");
        }
    }
}
