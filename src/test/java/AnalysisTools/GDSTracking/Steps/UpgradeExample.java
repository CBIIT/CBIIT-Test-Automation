package AnalysisTools.GDSTracking.Steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class UpgradeExample {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1512, 738));
            Page page = context.newPage();
            page.navigate("https://gds-stage.nci.nih.gov/gds/search/home.action");
            MiscUtils.sleep(12000);
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Create New Submission")).click();
            page.getByLabel("Project", new Page.GetByLabelOptions().setExact(true)).check();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next ")).nth(1).click();
            page.getByLabel("Project Submission Title [Max").click();
            page.getByLabel("Project Submission Title [Max").fill("Stage Project Test 4");
            page.getByText("Required by GDS Policy").click();
            page.locator("#programBranch").selectOption("CBIIT");
            page.locator("#cancerActivity").click();
            page.locator("#cancerActivity").fill("can");
            page.locator("#extramural_fnPI").click();
            page.locator("#extramural_fnPI").fill("Kevin");
            page.locator("#extramural_lnPI").click();
            page.locator("#extramural_lnPI").fill("Mata");
            page.locator("#extramural_piEmail").click();
            page.locator("#extramural_piEmail").fill("kevin.matarodriguez@nih.gov");
            page.locator("#extramural_PIInstitute").click();
            page.locator("#extramural_PIInstitute").fill("NIH");
            page.locator("#extramural_fnPC").click();
            page.locator("#extramural_fnPC").fill("Second");
            page.locator("#extramural_lnPC").click();
            page.locator("#extramural_lnPC").fill("Contact");
            page.locator("#extramural_PCemail").click();
            page.locator("#extramural_PCemail").fill("matakevin1777@gmail.com");
            page.locator("input[name=\"extramuralGrant\\.pdFirstName\"]").click();
            page.locator("input[name=\"extramuralGrant\\.pdFirstName\"]").fill("KevinDirector");
            page.locator("input[name=\"extramuralGrant\\.pdLastName\"]").click();
            page.locator("input[name=\"extramuralGrant\\.pdLastName\"]").fill("MataDirector");
            page.locator("#projectStartDate").click();
            page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("1").setExact(true)).first().click();
            page.locator("#pEndDate > .input-group > .input-group-addon > .glyphicon").click();
            page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("30")).nth(1).click();
            page.getByText("Are there any additional").click();
            page.getByLabel("Yes").check();
            page.locator("#grants_0_grantsContractNum").click();
            page.locator("#grants_0_grantsContractNum").click();
            page.locator("#grants_0_grantsContractNum").fill("CA261201000211P-0-0-0");
            page.locator("#grants_0_div").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Search")).click();
            page.getByRole(AriaRole.RADIO).check();
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next ")).nth(1).click();
            MiscUtils.sleep(2000);
            page.locator("#gComments").click();
            MiscUtils.sleep(2000);
            page.locator("#gComments").fill("Comments");
            page.locator("button[name=\"action\\:saveGeneralInfoAndNext\"]").click();
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("Yes")).check();
            page.locator("[id=\"\\35 \"]").check();
            page.locator("#exceptionMemoDiv").getByText("Choose File").click();
            MiscUtils.sleep(20000);
            //MANUALLY ADD THE FILE
//            page.locator("body").setInputFiles(Paths.get("/Users/matarodriguezko/CBIIT-Test-Automation/src/test/java/AnalysisTools/GDSTracking/Resources/GDS Tracking DUL IC upload.docx"));
            MiscUtils.sleep(2000);
            page.locator("[id=\"\\39 \"]").check();
            page.getByLabel("Human", new Page.GetByLabelOptions().setExact(true)).check();
            page.getByLabel("Individual").check();
            page.getByLabel("Controlled").check();
            page.locator("[id=\"\\32 7\"]").check();
            page.getByLabel("Upload a document").check();
            MiscUtils.sleep(2000);
            page.locator("#dataSharingPlanDiv").getByText("Choose File").click();
            MiscUtils.sleep(5000);
            //MANUALLY ADD THE FILE
//            page.locator("body").setInputFiles(Paths.get("/Users/matarodriguezko/CBIIT-Test-Automation/src/test/java/AnalysisTools/GDSTracking/Resources/GDS Tracking DUL IC upload.docx"));
            page.locator("#gdsPlanComments").click();
            page.locator("#gdsPlanComments").fill("comments");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Study")).click();
            MiscUtils.sleep(2000);
            page.getByPlaceholder("Enter Study Name").click();
            page.getByPlaceholder("Enter Study Name").fill("Study Name 1 QA Test");
            page.getByPlaceholder("Full Name of Institution").click();
            page.getByPlaceholder("Full Name of Institution").fill("Institution QA Test ");
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save Study ")).nth(1).click();
            MiscUtils.sleep(2000);
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Study Name 1 QA Test")).getByRole(AriaRole.LINK).nth(3).click();
            page.getByText("Choose File").click();
            MiscUtils.sleep(5000);
            //MANUALLY ADD THE FILE
//            page.locator("body").setInputFiles(Paths.get("/Users/matarodriguezko/CBIIT-Test-Automation/src/test/java/AnalysisTools/GDSTracking/Resources/GDS Tracking DUL IC upload.docx"));
            MiscUtils.sleep(2000);
            page.getByPlaceholder("IC Project Title").click();
            page.getByPlaceholder("IC Project Title").fill("IC Project Title");
            page.getByLabel("Provisional or Final?").selectOption("23");
            page.getByLabel("IC Type").selectOption("63");
            page.locator("#icsamplesdateext_0").selectOption("67");
            page.getByLabel("Approved by GPA").selectOption("18");
            page.getByLabel("IC Memo for Use in Future").selectOption("24");
            page.getByLabel("GenomicSummary Results (GSR)").selectOption("76");
            page.getByLabel("Controlled Access GSR").click();
            page.getByLabel("Controlled Access GSR").fill("Controlled Access GSR Explanation Text");
            page.getByLabel("Comments (4000 Characters):").click();
            page.getByLabel("Comments (4000 Characters):").fill("Comments");
            page.locator("#subIC-pageNav_bottom").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Save & Go to Dashboard ")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            page.getByLabel("Yes").check();
            page.getByText("Choose File").click();
            MiscUtils.sleep(5000);
            //MANUALLY ADD THE FILE
//            page.locator("body").setInputFiles(Paths.get("/Users/matarodriguezko/CBIIT-Test-Automation/src/test/java/AnalysisTools/GDSTracking/Resources/GDS Tracking DUL IC upload.docx"));
            MiscUtils.sleep(2000);
            page.locator("#bsiComments").click();
            page.locator("#bsiComments").fill("Comments");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            page.locator("#repositoryDate span i").click();
            page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("30")).nth(1).click();
            page.locator("#submissionLinkAddBtn").click();
            MiscUtils.sleep(1000);
            page.getByPlaceholder("Submission processing status").click();
            page.getByPlaceholder("Submission processing status").fill("https://www.google.com/");
            MiscUtils.sleep(1000);
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Link")).click();
            page.getByPlaceholder("Public study link").click();
            page.getByPlaceholder("Public study link").fill("https://www.google.com/");
            MiscUtils.sleep(2000);
            page.getByLabel("Registration Status").selectOption("10");
            page.getByLabel("Data Submission Status").selectOption("14");
            page.getByLabel("Study Released?").selectOption("16");
            page.getByLabel("Accession Number").click();
            page.getByLabel("Accession Number").fill("1");
            page.getByLabel("Comments (4000 Characters):").click();
            page.getByLabel("Comments (4000 Characters):").fill("Comments");
            MiscUtils.sleep(1000);
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save & Next ")).nth(1).click();
            MiscUtils.sleep(20000);
            page.navigate("https://gds-test.nci.nih.gov/gds/manage/navigateToSubmissionDetail.action?projectId=834");
        }

//            /**
//             * THIS IS THE SUB PROJECT FLOW FOR THE GDS TRACKING STUFF
//             */


    }
}