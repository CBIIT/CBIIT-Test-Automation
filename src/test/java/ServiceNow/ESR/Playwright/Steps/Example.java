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
                    .setViewportSize(1512, 738));
            Page page = context.newPage();
            page.navigate("https://service-test.nci.nih.gov/side_door.do");
            page.getByLabel("User name").click();
            page.getByLabel("User name").fill("CBIITTestAccount");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("Tester123@");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").fill("NCI At Your Service");
            page.getByLabel("NCI at Your Service Portal", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Start here! Search for")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Start here! Search for")).fill("Engineering Support Request");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Engineering Support Request")).click();
            assertThat(page.locator("#container_customer_details_start")).containsText("Customer Details");
            page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Project Details")).click();
            page.getByLabel("Project Details").getByText("Project Name").click();
            assertThat(page.locator("#project_name")).containsText("Project Name");
            assertThat(page.locator("#container_roles_and_assignments")).containsText("Team Details");
        }
    }
}