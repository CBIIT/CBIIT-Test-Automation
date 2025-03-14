package ANALYSIS_TOOLS.NIFESubmit.playwright.stepsImplementation;

import ANALYSIS_TOOLS.NIFESubmit.playwright.pages.NIFESubmitPage;
import ANALYSIS_TOOLS.NIFESubmit.playwright.utils.NIFESubmit_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import java.nio.file.Paths;
import java.util.regex.Pattern;
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
            PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NIFESubmitPage.NCIPage).setExact(true)).click();
        });
        CommonUtils.sleep(2000);
        assertThat(newPage1).hasURL(NIFESubmit_Constants.NCI_LINK);
        newPage1.close();
    }

    /**
     * CLICK LINK AND ASSERT THE TITLE OF NEW PAGE
     */
    public static void clickAndAssertNewPageTitle() {
        CommonUtils.sleep(2000);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.ccrMicroscopyCore, NIFESubmit_Constants.CCR_MICROSCOPY_CORE_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.cdblMicroscopyCore, NIFESubmit_Constants.CDBL_MICROSCOPY_CORE_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.lcpglMicroscopyCore, NIFESubmit_Constants.LCPG_MICROSCOPY_CORE_TITLE);
        CommonUtils.sleep(2000);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.spatialImagingTechnology, NIFESubmit_Constants.SPATIAL_IMAGING_TECHNOLOGY_RESOURCE_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.nciImagingFacility, NIFESubmit_Constants.NCI_HIGH_THROUGHPUT_IMAGING_FACILITY_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.biologyAndGeneLab, NIFESubmit_Constants.LABORATORY_OF_RECEPTOR_BIOLOGY_AND_GENE_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.cancerGenomicsResearchLab, NIFESubmit_Constants.CANCER_GENOMICS_RESEARCH_LABORATORY_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.opticalMicroscopyImage, NIFESubmit_Constants.OPTICAL_MICROSCOPY_IMAGE_TITLE);
        Playwright_Common_Utils.clickAndAssertNewPageTitle(NIFESubmitPage.volumeElectronMicroscopy, NIFESubmit_Constants.VOLUME_ELECTRON_MICROSCOPY_TITLE);
        CommonUtils.sleep(2000);
    }

    /**
     * ENTER ALL REQUIRED DETAILS IN STUDY INFORMATION SECTION
     */
    public static void enterRequiredDetails() {
        PlaywrightUtils.page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Imaging FacilitySelect Imaging Facility$"))).locator("svg").click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("CCR Confocal Microscopy Core")).click();
        PlaywrightUtils.page.locator(NIFESubmitPage.principalInvestigator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("ACHARYA, JAIRAJ")).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.nameLocator).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.nameLocator).fill("Doe John");
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.emailLocator).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.emailLocator).fill("xyz@gmail.com");
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.dataSetId).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.dataSetId).fill("76476");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Imaging MethodSelect Imaging Method$"))).locator("svg").click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Airyscan Super-Resolution")).click();
        CommonUtils.sleep(6000);
    }

    /**
     * VERIFY ERROR MESSAGE ON CLICKING SUBMIT BUTTON WITHOUT ENTERING ALL REQUIRED DETAILS
     */
    public static void verifyErrorMessageOnSubmmitAfterReset() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NIFESubmitPage.submitButtonLocator).setExact(true)).click();
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText("Please fill out all required fields.");
    }

    /**
     * CLICK DOWNLOAD BUTTON
     */
    public static void clickDownloadButton() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NIFESubmitPage.downloadLocator).setExact(true)).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(NIFESubmitPage.excelFormat).click();
        CommonUtils.sleep(2000);
    }

    /**
     * ADD ALL REQUIRED DETAILS IN BIOSAMPLE SECTION
     */
    public static void addAllRequiredDetailsInBiosample() {
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.enterBioSampleId).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.enterBioSampleId).fill("765874");
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.biosampleDescription).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.biosampleDescription).fill("Biosample description");
        PlaywrightUtils.page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^OrganismSelect Organism$"))).locator("svg").click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Mouse").setExact(true)).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Biosample TypeSelect Biosample Type$"))).locator("svg").click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Embryo")).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.enterSpecies).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.enterSpecies).fill("Species");
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.enterEmbryoStage).click();
        PlaywrightUtils.page.getByPlaceholder(NIFESubmitPage.enterEmbryoStage).fill("embryo stage");
        CommonUtils.sleep(6000);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Biosample 1 copy close")).click();
    }

    /**
     * CLICK ON THE ADD BIOSAMPLE
     */
    public static void addBiosample() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NIFESubmitPage.biosampleButton)).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NIFESubmitPage.enlageBiosample)).click();
    }
}