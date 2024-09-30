package AnalysisTools.NIFESubmit.playwright.StepsImplementation;

import AnalysisTools.NIFESubmit.playwright.Pages.NIFESubmitPage;
import AnalysisTools.NIFESubmit.playwright.Utils.NIFESubmit_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import java.nio.file.Paths;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getNifeUrl;

public class NIFESubmitStepsImpl extends PageInitializer {

    /**
     * CLICK HOME TAB
     */
    public static void clickHomeTab() {
        PlaywrightUtils.page.locator(NIFESubmitPage.homeTabElement).click();
        CommonUtils.sleep(2000);
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
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(NIFESubmitPage.homeTabElement).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NIFESubmitPage.viewImagesLink)).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.navigate(getNifeUrl());
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
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NIFESubmitPage.studyInfoText))).isVisible();
    }

    /**
     * IMPORT EXCEL FILE
     */
    public static void importExcelFile() {
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.getByLabel(NIFESubmitPage.importExcelFile).setInputFiles(Paths.get(NIFESubmit_Constants.UPLOAD_FILE_PATH));
        CommonUtils.sleep(2000);
    }

    /**
     * VERIFY NCI LINK
     */
    public static void verifyNCILink() {
        Page newPage1 = PlaywrightUtils.context.waitForPage(() -> {
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NIFESubmitPage.NCIPage).setExact(true)).click();});
        CommonUtils.sleep(2000);
        assertThat(newPage1).hasURL(NIFESubmit_Constants.NCI_LINK);newPage1.close();
    }

    /**
     * CLICK LINK AND ASSERT THE TITLE OF NEW PAGE
     */
    public static void clickAndAssertNewPageTitle() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.cdblMicroscopyCore,NIFESubmit_Constants.CCR_MICROSCOPY_CORE_TITLE);
        CommonUtils.sleep(2000);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.cdblMicroscopyCore,NIFESubmit_Constants.CDBL_MICROSCOPY_CORE_TITLE);
        CommonUtils.sleep(2000);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.lcpglMicroscopyCore,NIFESubmit_Constants.LCPG_MICROSCOPY_CORE_TITLE);
    }
}