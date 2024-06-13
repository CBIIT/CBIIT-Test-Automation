package AnalysisTools.NIFESubmit.playwright.StepsImplementation;

import AnalysisTools.NIFESubmit.playwright.Pages.NIFESubmitPage;
import AnalysisTools.NIFESubmit.playwright.Utils.NIFESubmit_Constants;
import AnalysisTools.Soccer.playwright.Pages.SoccerPage;
import AnalysisTools.Soccer.playwright.Utils.Soccer_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class NIFESubmitStepsImpl extends PageInitializer {

    /**
     * CLICK HOME TAB
     */
    public static void clickHomeTab() {
        PlaywrightUtils.page.locator(NIFESubmitPage.homeTabElement).click();
        MiscUtils.sleep(2000);

    }

    /**
     * VERIFY TITLE
     */
    public static void verifyTitle() {
        assertThat(PlaywrightUtils.page).hasTitle(NIFESubmitPage.NIFEPageTitle);

    }

    /**
     * CLICK ON SUBMIT METADATA AND VIEW IMAGES
     */
    public static void clickSubmitMetadataAndViewImages() {
        PlaywrightUtils.page.locator(NIFESubmitPage.submitMetadata).click();
        MiscUtils.sleep(2000);
        PlaywrightUtils.page.locator(NIFESubmitPage.homeTabElement).click();
        MiscUtils.sleep(2000);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NIFESubmitPage.viewImagesLink)).click();
        MiscUtils.sleep(2000);
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("NIFESubmit"));

    }

    /**
     * CLICK SUBMIT METADATA
     */
    public static void clickSubmitMetaData() {
        PlaywrightUtils. page.locator(NIFESubmitPage.submitMetadataTab).click();

    }

    /**
     * VERIFY SUBMIT METADATA TAB
     */
    public static void verifySubmitMetadata() {
        assertThat(PlaywrightUtils.page.getByText(NIFESubmitPage.importExcelFile)).isVisible();
        MiscUtils.sleep(2000);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NIFESubmitPage.studyInfoText))).isVisible();

    }

    /**
     * IMPORT EXCEL FILE
     */
    public static void importExcelFile() {
        MiscUtils.sleep(2000);
        PlaywrightUtils.page.getByLabel(NIFESubmitPage.importExcelFile).setInputFiles(Paths.get(NIFESubmit_Constants.uploadFilePath));
        MiscUtils.sleep(2000);

    }

    /**
     * VERIFY NCS LINK
     */
    public static void verifyNCSLink() {
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NIFESubmitPage.NCS).setExact(true)).click();});
        MiscUtils.sleep(2000);
        assertThat(newPage1).hasURL(NIFESubmit_Constants.ncsLink);newPage1.close();

    }



}
