package ServiceNow.PlatformBusinessApps.NERD.playwright.Steps;

import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.TopAccomplishmentsSubmission_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example extends PageInitializer {

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
            page.navigate("https://service-test.nci.nih.gov/nerd");
//            page.locator("#single-button").first().click();
//            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Signed in as CBIIT Test")).click();

            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Submissions")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Top Accomplishments (4) +")).click();
            Page page1 = page.waitForPopup(() -> {
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Top Accomplishments (4) +")).locator("a").click();
            });
            page1.getByLabel("2019").click();
            page1.locator("input[name=\"x_26385_crs_kd_u_kb_title\"]").fill("Title Top Accomplishments");
            page1.locator("select[name=\"x_26385_crs_kd_u_kb_doc\"]").selectOption("CCCT");
//            page1.frameLocator("#ui-tinymce-528_ifr").locator("html").click();
            // Switch to the form's context (optional)
            // Locate the form element
            CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
//            page1.frameLocator("#ui-tinymce-5461_ifr").locator("html").click();
//            page1.frameLocator("#ui-tinymce-5461_ifr").getByLabel("Rich Text Area. Press ALT-0").fill("Test");
            createNewSubmissionPage.DescriptionTextBox.sendKeys(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_DESCRIPTION_TEXT_BOX);
            MiscUtils.sleep(2000);
            WebDriverUtils.webDriver.switchTo().defaultContent();
            MiscUtils.sleep(2000);

//            const formElement = await page1.$('form');
//            await page1.focus('form');
//            page1.frameLocator("#ui-tinymce-528_ifr").getByRole(AriaRole.PARAGRAPH).click();
//            page1.frameLocator("#ui-tinymce-8544_ifr").getByLabel("Rich Text Area. Press ALT-0").fill("Description");
            page1.locator("select[name=\"x_26385_crs_kd_u_kb_research_type\"]").selectOption("Cancer Control");
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes")).click();
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Ok")).click();

        }
    }

}
