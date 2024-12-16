package CUSTOM_BUSINESS.Oasys.StepsImplementation;

import CUSTOM_BUSINESS.Oasys.Pages.I_Trust_Page;
import APPS_COMMON.Pages.Playwright_Common_Locators;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.*;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Oasys_Steps_Implementation {

    /**
     * User is logged into OASYS
     */
    public static void user_is_logged_in_oasys() {
        page.navigate(getOasysUrl());
        page.locator(I_Trust_Page.usernameTextBox).fill(I_TRUST_USERNAME);
        page.locator(I_Trust_Page.passwordTextBox).fill(EncryptionUtils.decrypt(I_TRUST_PASSWORD));
        page.locator(I_Trust_Page.passwordTextBox).press("Enter");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("ACCEPT")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}
/*
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1920, 1080));
            Page page = context.newPage();
           /* page.navigate("https://oasys-qa.cancer.gov/#/dashboard-overview");
            //page.locator("#USER").click();
            page.locator("#USER").fill("nesarh2");
            page.locator("#USER").press("Tab");
            page.locator("#PASSWORD").fill("BaadShah@HuN2019$$");
            page.locator("#PASSWORD").press("Enter");
            page.navigate("https://oasys-qa.cancer.gov/#/");
            page.navigate("https://oasys-qa.cancer.gov/#/dashboard-overview");
            Page page1 = page.waitForPopup(() -> {
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("https://oasys.cancer.gov")).click();
            });
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("ACCEPT")).click();
            page.navigate("https://oasys-qa.cancer.gov/#/dashboard-overview");
            //page.navigate("https://authtest.nih.gov/CertAuthV3/forms/PIVandUserPass.aspx?TYPE=33554433&REALMOID=06-12992667-b602-4bb4-b971-53b3d51fb16a&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-kvDVr74xG8OcotVxtca6R6Vj0Minyg7UKpAdNWrL%2b8o3XgMTIciquCNkMDuQ7FGd&TARGET=-SM-HTTPS%3a%2f%2ffcas--qa%2ecancer%2egov%2f");
            page.locator(ITrust_Page.usernameTextBox).fill(TestProperties.I_TRUST_USERNAME);
            page.locator(ITrust_Page.passwordTextBox).fill(EncryptionUtils.decrypt(TestProperties.I_TRUST_PASSWORD));
            page.locator(ITrust_Page.passwordTextBox).press("Enter");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("ACCEPT")).click();


            page.getByText("Contract Administrationkeyboard_arrow_down").click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contract").setExact(true)).click();
            page.getByText("NCCIH 2018 Bulk Mac Laptop").click();
            page.getByRole(AriaRole.REGION, new Page.GetByRoleOptions().setName("Contract Information")).getByRole(AriaRole.BUTTON).click();
            page.getByText("OtherSeverability").click();
            page.getByText("Severable", new Page.GetByTextOptions().setExact(true)).click();
            page.getByText("YesIT Related *").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No")).locator("span").click();
            page.locator("#mat-select-value-15").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).locator("span").click();
            page.locator("#mat-select-value-19").click();
            page.getByText("Time and Materials").click();
            page.getByLabel("Procurment Mechanism *").getByText("Procurment Mechanism *").click();
            page.getByText("Open Market").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();






           // page.getByText("Contract Administrationkeyboard_arrow_down").click();
         //   page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contract").setExact(true)).click();
           // page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("IT Commodities and Solutions HHSN316201500067W Other SWORD & SHIELD ENTERPRISE")).locator("div").first().click();
           // page.getByRole(AriaRole.REGION, new Page.GetByRoleOptions().setName("Contract Information")).getByRole(AriaRole.BUTTON).click();


            page.getByText("OtherSeverability").click();
            page.getByText("Severable", new Page.GetByTextOptions().setExact(true)).click();
            page.locator("#mat-select-value-11").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No")).locator("span").click();
            page.locator("#mat-select-value-13").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).locator("span").click();
            page.getByLabel("Internal Issuing Agency").getByText("Internal Issuing Agency").click();
            page.getByText("NITAAC").click();
            page.getByLabel("NITAAC").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Other")).locator("span").click();
            page.getByLabel("External Issuing Agency").getByText("External Issuing Agency").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Other")).locator("span").click();
            page.getByLabel("Services Rendered for Federal").getByText("Services Rendered for Federal").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Other")).locator("span").click();
            page.getByText("-Multiple Year", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).locator("span").click();
            page.getByLabel("Funded Through Date").click();
            page.getByLabel("Next month").click(new Locator.ClickOptions()
                    .setClickCount(3));
            page.getByText("31", new Page.GetByTextOptions().setExact(true)).click();
            page.getByLabel("Will funding need to be added").getByText("Will funding need to be added").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).locator("span").click();
            page.getByLabel("Does the COR Advise Continued").getByText("Does the COR Advise Continued").click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).locator("span").click();
            page.locator("#mat-select-value-41").click();
            page.getByText("Partial Stop Work").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        }
    }
}*/
