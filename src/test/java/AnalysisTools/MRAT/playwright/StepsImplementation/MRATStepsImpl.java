package AnalysisTools.MRAT.playwright.StepsImplementation;

import AnalysisTools.MRAT.playwright.Pages.MRATPage;
import AnalysisTools.MRAT.playwright.Utils.MRAT_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class MRATStepsImpl extends PageInitializer {

    /**
     * CLICKS ON THE SKIN CANCER LINK
     */
    public static void clickSkinCancerLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.clickSkinCancerLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.SKIN_CANCER);
    }

    /**
     * CLICKS ON THE MELANOMA VS MOLE LINK
     */
    public static void clickMelanomaVsMoleLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.clickMelanomaVsMoleLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.MELANOMA_VS_MOLE);
    }

    /**
     * CLICKS ON THE COMMON MOLES LINK
     */
    public static void clickCommonMolesLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.clickCommonMolesLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.COMMON_MOLES);
    }

    /**
     * CLICKS ON THE CCT MELANOMA PREVENTION LINK
     */
    public static void clickCCTMelanomaPreventionLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.clickCCTMelanomePreventionLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.CCT_MELANOMA_PREVENTION);
    }

    /**
     * CLICKS ON THE WHAT DOES MELANOMA LOOK LIKE LINK
     */
    public static void clickWhatDoesMelanomaLookLikeLink() {
        PlaywrightUtils.page.goBack();
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(MRATPage.clickWhatDoesMelanomaLookLocator)).click();
        CommonUtils.sleep(2000);
        assertThat(PlaywrightUtils.page).hasTitle(MRAT_Constants.WHAT_DOES_MELANOMA_LOOK_LIKE);
    }
}