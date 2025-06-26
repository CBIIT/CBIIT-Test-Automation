package PLATFORM_BUSINESS.NERD.playwright.StepImplementation;

import com.microsoft.playwright.FrameLocator;
import com.nci.automation.web.CommonUtils;
import java.nio.file.Paths;
import static APPS_COMMON.Pages.Playwright_Common_Locators.iframeLocator;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Top_Accomplishment_New_Submission_StepImpl {

    /**
     * Method to upload the Pdf attachment to Top Accomplishment Submission
     */
    public static void uploadAttachmentInNativeView() {
        String uploadAttachment = System.getProperty("user.dir") + "/src/test/java/CHARMS/Resources/Family Cohort Study Consent.pdf";
        page.frameLocator(iframeLocator).locator("#add_attachment").waitFor();
        page.frameLocator(iframeLocator).locator("#add_attachment").click();
        CommonUtils.sleep(2000);
        page.frameLocator(iframeLocator).locator("input[aria-hidden='true'][id='attachFile']").setInputFiles(Paths.get(uploadAttachment));
        CommonUtils.sleep(2000);
        page.frameLocator(iframeLocator).getByLabel("Close", new FrameLocator.GetByLabelOptions().setExact(true)).click();
    }
}