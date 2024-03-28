package ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Steps;

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
                    .setViewportSize(1445, 839));
            Page page = context.newPage();
            page.navigate("https://service-test.nci.nih.gov/side_door.do");
            page.getByLabel("User name").click();
            page.getByLabel("User name").fill("CBIITTestAccount");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("curlbylawdighalvekinlarswould");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.navigate("https://service-test.nci.nih.gov/ncisp?id=nci_home");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Biz Services")).first().click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Offboarding").setExact(true)).click();
            page.locator("#catItemTop").getByRole(AriaRole.PARAGRAPH).click();
            assertThat(page.locator("#catItemTop")).containsText("This form is used to initiate and offboarding/transfer request for any employee (Federal, Contractor, Volunteer, Fellow etc.) that is leaving CBIIT. They could be going to another Division, Office or Center (DOC) or leaving NIH all together. Supervisor’s or Contract POC’s should initiate this request and fill in all relevant information. You will likely have to schedule a time to turn in your badge and all equipment. Contact the CBIIT HR Task Force with any questions or concerns (NCICBIITHRTaskforce@mail.nih.gov).");
        }
    }
}