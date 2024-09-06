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
            page.getByLabel("User name").press("Tab");
            page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill("Tester123@");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
            page.getByPlaceholder("Filter").click();
            page.getByPlaceholder("Filter").fill("ESR");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Create ESR")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Name")).fill("Test Project");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Description")).fill("Test Description");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitIT Service Area")).fill("Cybersecurity");
            page.frameLocator("iframe[name=\"gsft_main\"]").locator("select[name=\"IO\\:803573521be92110f360a681f54bcb36\"]").selectOption("Q-Branch");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitOCIO Federal Lead")).fill("Alex Nordan");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitBusiness Owner")).fill("Business Owner");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Lead Assignment Group")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Lead Assignment Group")).press("CapsLock");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitProject Lead Assignment Group")).fill("CHARMS Technical Support");
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Mandatory - must be populated before SubmitPhone")).fill("123");
            page.onceDialog(dialog -> {
                System.out.println(String.format("Dialog message: %s", dialog.message()));
                dialog.dismiss();
            });
            page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Submit", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        }
    }
}