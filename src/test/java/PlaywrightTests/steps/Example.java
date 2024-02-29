package PlaywrightTests.steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 772));
            Page page = context.newPage();
            page.navigate("https://service-test.nci.nih.gov/side_door.do");
            page.getByLabel("User name").click();
            page.getByLabel("User name").fill("CBIITTestAccount");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("curlbylawdighalvekinlarswould");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.navigate("https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/%24pa_dashboard.do");
            assertThat(page.getByLabel("StartNow Implementation", new Page.GetByLabelOptions().setExact(true))).containsText("StartNow Implementation");
            assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText("StartNow Homepage");
            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").fill("CHARMS");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dashboard")).click();
            Page page1 = page.waitForPopup(() -> {
                page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Eligibility Review Needed, Total number of records is:").click();
            });
        }
    }
}