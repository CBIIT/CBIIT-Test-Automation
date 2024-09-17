package AnalysisTools.GDSTracking.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;

public class UpgradeSubProject {

    /**
     * THIS IS THE SUB PROJECT FLOW FOR THE GDS TRACKING STUFF
     */

    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 738));
            Page page = context.newPage();
            page.navigate("https://gds-test.nci.nih.gov/gds/search/home.action");
            MiscUtils.sleep(12000);
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Create New Submission")).click();
            page.getByLabel("Sub-Project", new Page.GetByLabelOptions().setExact(true)).check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next ")).nth(1).click();
            MiscUtils.sleep(5000);
            page.getByLabel("Submission from:").selectOption("60");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Search")).click();
            page.locator("tr:nth-child(8) > .dt-center > input").check();
            page.locator("#search-form_2").click();
            page.locator("button[name=\"action\\:saveGeneralInfoAndNext\"]").click();
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Institutional Certifications (1)")).click();
            page.locator("#ic643").check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            page.getByLabel("Yes").check();
            page.getByText("Choose File").click();
            MiscUtils.sleep(10000);
            //MANUALLY ADD FILE
//                page.locator("body").setInputFiles(Paths.get("GDS Tracking DUL IC upload.docx"));
            page.locator("#bsiComments").click();
            page.locator("#bsiComments").fill("subproject comment");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            MiscUtils.sleep(2000);
            page.locator("#repositoryDate span i").click();
            page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("25")).nth(1).click();
            page.locator("#submissionLinkAddBtn").click();
            page.getByPlaceholder("Submission processing status").click();
            page.getByPlaceholder("Submission processing status").fill("google.com");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Link")).click();
            page.getByPlaceholder("Public study link").click();
            page.getByPlaceholder("Public study link").fill("google.com");
            page.locator("#selected_0").check();
            page.getByLabel("Registration Status").selectOption("10");
            page.getByLabel("Data Submission Status").selectOption("14");
            page.getByLabel("Study Released?").selectOption("16");
            page.getByLabel("Accession Number").click();
            page.getByLabel("Accession Number").fill("17");
            page.getByLabel("Comments (4000 Characters):").click();
            page.getByLabel("Comments (4000 Characters):").fill("subproject comment");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            MiscUtils.sleep(10000);
            page.navigate("https://gds-test.nci.nih.gov/gds/manage/navigateToSubmissionDetail.action?projectId=864");
        }
    }
}