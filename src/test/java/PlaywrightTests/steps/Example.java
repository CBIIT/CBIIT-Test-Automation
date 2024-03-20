package PlaywrightTests.steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import org.testng.Assert;

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


            page.navigate("https://authtest.nih.gov/CertAuthV3/forms/PIVandUserPass.aspx?TYPE=33554433&REALMOID=06-cafe548e-775f-4e1b-bc39-eb2581ec9d39&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-Wt08rZnBzwy8eZ3kL%2baRB37XZ8h49hnXtdwdBk6G4o88Qtxs5t6yLHqZNXN1Vjxb&TARGET=-SM-https%3a%2f%2fi2e--test%2enci%2enih%2egov%2fem%2f");
            page.locator("#USER").click();
            page.locator("#USER").fill("juarezds");
            page.locator("#USER").press("Tab");
            page.locator("#PASSWORD").fill("Avengersassemble99?");
            page.locator("#PASSWORD").press("Enter");



            page.getByLabel("Name", new Page.GetByLabelOptions().setExact(true)).click();
            page.getByLabel("Name", new Page.GetByLabelOptions().setExact(true)).fill("rodriguez");
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Mata Rodriguez, Kevin Osmaldo")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();


            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit")).click();

            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("GM Action Manager OFFICE OF")).getByRole(AriaRole.BUTTON).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Role")).click();
            page.locator("app-i2e-role-dropdown").getByLabel("").click();
            page.getByRole(AriaRole.SEARCHBOX).fill("GM Ac");
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("GM Action Manager Allows to")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Role")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save Changes")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Role")).click();
            page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("All")).click();
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Administrative Facilitates")).click();
            page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();

            MiscUtils.sleep(1000);

            String actualeGrantsAccessRepresentativeRoleAndDescriptionText = page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("eGrants Access Representative")).innerText();
            Assert.assertEquals(actualeGrantsAccessRepresentativeRoleAndDescriptionText, "eGrants Access Representative\n" +
                    "Allows to process eGrants Provisioning and Deprovisioning requests in NEAR. Role can be assigned to Office of Grants Administration (OGA) staff only.");

            String actuali2eCoordinatorRoleAndDescriptionText = page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("I2E Coordinator Allows to process grant management access requests, manage I2E user accounts, roles, and cancer activities, and complete annual accounts audit tasks.").setExact(true)).innerText();
            Assert.assertEquals(actuali2eCoordinatorRoleAndDescriptionText, "I2E Coordinator\n" +
                    "Allows to process grant management access requests, manage I2E user accounts, roles, and cancer activities, and complete annual accounts audit tasks.");


            String actuali2eTechnicalSupportRoleAndDescriptionText = page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("I2E Technical Support Allows")).innerText();
            Assert.assertEquals(actuali2eTechnicalSupportRoleAndDescriptionText, "I2E Technical Support\n" +
                    "Allows to utilize \"Change User\" functionality to troubleshoot I2E modules. Role can be assigned to CBIIT staff only.");

            String actualPrimaryi2eCoordinatorRoleAndDescriptionText = page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Primary I2E Coordinator")).innerText();
            Assert.assertEquals(actualPrimaryi2eCoordinatorRoleAndDescriptionText, "Primary I2E Coordinator\n" +
                    "Allows to process grant management access requests, manage I2E user accounts, roles, and cancer activities, and complete annual accounts audit tasks as well as to administer I2E Enterprise Maintenance Module.");
            page.getByText("Allows to process eGrants").click();
            page.getByLabel("×eGrants Access Representative").getByText("×").click();
            page.getByTitle("Remove all items").click();
            page.getByText("Add Role×").click();
        }
    }
}