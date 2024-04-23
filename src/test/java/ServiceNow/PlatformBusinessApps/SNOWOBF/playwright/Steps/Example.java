package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1374, 878));
            Page page = context.newPage();
            page.navigate("https://service-test.nci.nih.gov/side_door.do");
            page.getByLabel("User name").click();
            page.getByLabel("User name").click();
            page.getByLabel("User name").click();
            page.getByLabel("User name").fill("CBIITTestAccount");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("curlbylawdighalvekinlarswould");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.navigate("https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/%24pa_dashboard.do");

            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").fill("OBF Systems Support");
            page.getByPlaceholder("Filter").press("Enter");
            assertThat(page.locator(".sn-polaris-nav-body")).isVisible();
            page.evaluate("document.getElementById('targetElement').style.border = '2px solid blue';");
            page.evaluate(".sn-polaris-nav-body");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("All Tickets")).click();
            assertThat(page.getByRole(AriaRole.LIST)).containsText("All Tickets");
            assertThat(page.getByRole(AriaRole.LIST)).containsText("Open Tickets");
            assertThat(page.getByRole(AriaRole.LIST)).containsText("Closed Tickets");
            assertThat(page.getByRole(AriaRole.LIST)).containsText("OneStream/BUS");
            page.locator(".sn-polaris-nav-body").click();
            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").click();
        }
    }
}