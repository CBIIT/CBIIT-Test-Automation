package ServiceNow.ESR.Playwright.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.MiscUtils;

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
            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").fill("esr");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Create ESR")).click();
            MiscUtils.sleep(3000);
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).fill("Test");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).fill("Test");
            page.frameLocator("iframe[name=\"gsft_main\"]").locator("select[name=\"IO\\:803573521be92110f360a681f54bcb36\"]").selectOption("Q-Branch");
            Page page1 = page.waitForPopup(() -> {
                page.frameLocator("iframe[name=\"gsft_main\"]").locator("span").filter(new Locator.FilterOptions().setHasText("Project Details Project Name")).getByRole(AriaRole.BUTTON).nth(1).click();
            });
            page1.close();
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cybersecurity")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).fill("Test");
            Page page2 = page.waitForPopup(() -> {
                page.frameLocator("iframe[name=\"gsft_main\"]").locator("#question_container_995832691b6be910f360a681f54bcbee").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Lookup using list")).first().click();
            });
            page2.close();
            page2.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Alex Nordan")).click();
            Page page3 = page.waitForPopup(() -> {
                page.frameLocator("iframe[name=\"gsft_main\"]").locator("#question_container_995832691b6be910f360a681f54bcbee td").filter(new Locator.FilterOptions().setHasText("Project Lead Assignment")).getByRole(AriaRole.BUTTON).click();
            });
            page3.close();
            page3.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CHARMS Technical Support")).click();
            Page page4 = page.waitForPopup(() -> {
                page.frameLocator("iframe[name=\"gsft_main\"]").locator("#question_container_995832691b6be910f360a681f54bcbee").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Lookup using list")).nth(3).click();
            });
            page4.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).fill("Business");
            page4.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).press("Enter");
            page4.close();
            page4.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Business Owner")).click();
            page.navigate("https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/%2Fsc_req_item_list.do%3Fsysparm_query%3Dactive%253Dtrue%255Ecat_item%253D43b0335e1ba92110f360a681f54bcb25%255Eopened_byDYNAMIC90d1921e5f510100a9ad2572f2b477fe%255EORDERBYDESCopened_at%26sysparm_first_row%3D1%26sysparm_view%3Desr");
            page.navigate("https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/sc_req_item_list.do%3Fsysparm_query%3Dactive%253Dtrue%255Ecat_item%253D43b0335e1ba92110f360a681f54bcb25%255Eopened_byDYNAMIC90d1921e5f510100a9ad2572f2b477fe%255EORDERBYDESCopened_at%26sysparm_first_row%3D1%26sysparm_view%3Desr");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("ESR-Q-1000021 Test - Open").click();
            assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("select[name=\"ni\\.VEc293f48287581650ad46326d3fbb3570\"]")).containsText("Q-Branch");
        }
    }
}