package ANALYSIS_TOOLS.BCRAT.playwright.stepsImplementation;

import ANALYSIS_TOOLS.BCRAT.playwright.pages.BCRATPage;
import ANALYSIS_TOOLS.BCRAT.playwright.utils.BCRAT_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class BCRATStepsImpl extends PageInitializer {

    /**
     * CLICKS ON PATIENT ELIGIBILITY AND OK BUTTON
     */
    public static void checksPatientEligibility() {
        PlaywrightUtils.page.getByLabel("Does the woman have a medical").getByRole(AriaRole.RADIO, new Locator.GetByRoleOptions().setName("Yes")).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
    }

    /**
     * CLICKS ON THE BREAST CANCER-HEALTH PROFESSIONAL VERSION LINK
     */
    public static void clickHealthProfessionalLink() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(BCRATPage.bcHealthProfessionalLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.BREAST_CANCER_HEALTH_PROFESSIONAL_VERSION);
    }

    /**
     * CLICKS ON THE BREAST CANCER-HEALTH RISK LINK
     */
    public static void clickBCRiskLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(BCRATPage.bcHealthRiskLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.BREAST_CANCER_HEALTH_RISK);
    }

    /**
     * CLICKS ON THE CCT BREAST CANCER-SCREENING LINK
     */
    public static void clickCCTBCScreeningLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(BCRATPage.cctBreastCancerScreeningLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.CCT_BREAST_CANCER_SCREENING);
    }

    /**
     * CLICKS ON THE CCT BREAST CANCER-PREVENTION LINK
     */
    public static void clickCCTBCPreventionLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(BCRATPage.cctBreastCancerPreventionLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.CCT_BREAST_CANCER_PREVENTION);
    }

    /**
     * CLICKS ON THE CCT BREAST CANCER-TREATMENT LINK
     */
    public static void clickCCTBCTreatmentLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(BCRATPage.cctBreastCancerTreatmentLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(BCRAT_Constants.CCT_BREAST_CANCER_TREATMENT);
    }

    /**
     * ENTERS DATA FOR DEMOGRAPHICS WITH ELIGIBILITY AND HISTORY
     */
    public static void enterAllDataForRiskCalculator() {
        PlaywrightUtils.page.getByLabel("Does the woman have a medical").getByRole(AriaRole.RADIO, new Locator.GetByRoleOptions().setName("No")).click();
        PlaywrightUtils.page.getByLabel("Does the woman have a mutation in either the BRCA1 or BRCA2 gene, or a").getByRole(AriaRole.RADIO, new Locator.GetByRoleOptions().setName("No").setExact(true)).click();
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.getByLabel("What is the patient’s age?").selectOption("36");
        PlaywrightUtils.page.getByLabel("What is the patient’s race/").selectOption("Asian");
        PlaywrightUtils.page.getByLabel("What is the sub race/").selectOption("Asian");
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.getByLabel("Has the patient ever had a breast biopsy with a benign (not cancer) diagnosis?").getByRole(AriaRole.RADIO, new Locator.GetByRoleOptions().setName("No").setExact(true)).click();
        PlaywrightUtils.page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("or older")).click();
        PlaywrightUtils.page.getByLabel("What was the woman’s age when").selectOption("1");
        PlaywrightUtils.page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("None")).click();
    }

    /**
     * CLICKS ON THE RISK CALCULATOR TAB
     */
    public static void clickRiskCalculatorTab() {
        PlaywrightUtils.page.locator(BCRATPage.calculateRiskTabLocator).click();
        CommonUtils.sleep(2000);
    }
}