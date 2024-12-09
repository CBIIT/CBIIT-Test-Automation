package PLATFORM_BUSINESS.NERD.playwright.StepImplementation;

import com.microsoft.playwright.FrameLocator;
import com.nci.automation.web.CommonUtils;
import java.nio.file.Paths;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Top_Accomplishment_New_Submission_StepImpl {

    /**
     * Method to upload the Pdf attachment to Top Accomplishment Submission
     */
    public static void uploadAttachmentInNativeView() {
        String uploadAttchment = System.getProperty("user.dir") + "/src/test/java/CHARMS/Resources/Family Cohort Study Consent.pdf";
        page.frameLocator("iframe[name='gsft_main']").locator("#add_attachment").waitFor();
        page.frameLocator("iframe[name='gsft_main']").locator("#add_attachment").click();
        CommonUtils.sleep(2000);
        page.frameLocator("iframe[name='gsft_main']").locator("input[aria-hidden='true'][id='attachFile']").setInputFiles(Paths.get(uploadAttchment));
        CommonUtils.sleep(2000);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Close", new FrameLocator.GetByLabelOptions().setExact(true)).click();
    }
}