package PlaywrightTests.steps;
import com.google.errorprone.annotations.MustBeClosed;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.MiscUtils;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
public class SSJ {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 755));
            Page page = context.newPage();



            page.navigate("https://service-test.nci.nih.gov/side_door.do");
            page.getByLabel("User name").click();
            page.getByLabel("User name").fill("CBIITTestAccount");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("curlbylawdighalvekinlarswould");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.getByLabel("Avatar: available, user").click();
            page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Impersonate user")).click();
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select a user")).click();
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select a user")).fill("Abhishek Desai");
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("Abhishek Desai Abhishek Desai")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Impersonate user")).click();
            page.navigate("https://service-test.nci.nih.gov/nci-scss.do#/");


            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Profile")).click();


//            page.getByLabel("First Name").click();

//            page.getByLabel("First Name").fill("Diego");

//            page.getByLabel("Last Name").click();

//            page.getByLabel("Last Name").fill("Juarez");

//            page.getByLabel("Email").click();

//            page.getByLabel("Email").fill("juarezds@nih.gov");

//            page.getByLabel("Phone", new Page.GetByLabelOptions().setExact(true)).click();

//            page.getByLabel("Phone", new Page.GetByLabelOptions().setExact(true)).fill("7036875816");
//            page.getByLabel("Highest Level of Education").click();
//            page.getByTitle("Bachelors").locator("div").click();

//            page.getByLabel("Yes").check();
//            page.getByLabel("Address").click();
//            page.getByLabel("Address").fill("9520 Burning Branch Road");
//            page.getByLabel("City").click();
//            page.getByLabel("City").fill("Burke");
//            page.getByLabel("State/Province").click();
//            page.getByLabel("State/Province").fill("VA");
//            page.getByLabel("Country").click();
//            page.getByLabel("Country").fill("USA");
//            page.getByLabel("Zip/Postal Code").click();
//            page.getByLabel("Zip/Postal Code").fill("22015");
//            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
            assertThat(page.locator("#root")).containsText("9520 Burning Branch RoadBurke, VA 22015 USA");
            assertThat(page.locator("#root")).containsText("juarezds@nih.gov");
            assertThat(page.locator("#root")).containsText("Bachelors");
            assertThat(page.locator("#root")).containsText("Yes");
            assertThat(page.locator("#root")).containsText("+1 (703) 687 - 5816");
            MiscUtils.sleep(2000);
        }
    }
}
