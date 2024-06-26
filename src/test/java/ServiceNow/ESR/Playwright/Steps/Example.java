package ServiceNow.ESR.Playwright.Steps;



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
                    .setViewportSize(1920, 849));
            Page page = context.newPage();
            page.navigate("https://service-test.nci.nih.gov/side_door.do");
            page.getByLabel("User name").click();
            page.getByLabel("User name").dblclick();
            page.getByLabel("User name").click();
            page.getByLabel("User name").click();
            page.getByLabel("User name").click();
            page.getByLabel("User name").fill("CBIITTestAccount");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("Tester123@");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.navigate("https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/%24pa_dashboard.do");
            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").fill("ESR");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Create ESR")).click();
            assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Engineering Support Request")).containsText("Project Details");
            assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Engineering Support Request")).containsText("Project Details");
        }
    }
}
