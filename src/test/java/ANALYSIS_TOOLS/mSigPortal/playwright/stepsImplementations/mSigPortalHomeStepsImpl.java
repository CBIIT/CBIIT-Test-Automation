package ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations;

import ANALYSIS_TOOLS.mSigPortal.playwright.pages.mSigPortalHomePage;
import ANALYSIS_TOOLS.mSigPortal.playwright.utils.mSigPortalHome_Constants;
import com.microsoft.playwright.Locator;
import com.nci.automation.web.PlaywrightUtils;
import static Hooks.Hooks.softAssert;

public class mSigPortalHomeStepsImpl {

    /**
     * VERIFYING HOME NAVBAR SELECTION
     */
    public static void verifyHomeNavBarSelection() {
        String str = PlaywrightUtils.page.locator("//div[@class='col-md-12 col-sm-12']//h1[@class='msigportal-home-title']").innerText();
        softAssert.assertEquals(str, mSigPortalHome_Constants.M_SIG_PORTAL_HOME_PAGE_TITLE);
        Locator homeNavItem = PlaywrightUtils.page.locator(mSigPortalHomePage.mSigPortalHomeNavBar);
        boolean isActive = homeNavItem.getAttribute("class").contains("active-navlinks");
        softAssert.assertTrue(isActive);
    }

    /**
     * VERIFYING ABOUT NAVBAR SELECTION
     */
    public static void verifyAboutNavBarSelection() {
        Locator aboutNavItem = PlaywrightUtils.page.locator("//div[@class='mx-auto']//div[@class='mx-auto']//a[@id='About-navbar']");
        boolean isActive = aboutNavItem.getAttribute("class").contains("active-navlinks");
        softAssert.assertTrue(isActive);
    }

    /**
     * VERIFYING CATALOGUE NAVBAR SELECTION
     */
    public static void verifyCatalogueNavBarSelection() {
        Locator catalogueNavItem = PlaywrightUtils.page.locator("//div[contains(@class,'d-inline-block')]//a[@id='Catalog-navbar']");
        boolean isActive = catalogueNavItem.getAttribute("class").contains("active-navlinks");
        softAssert.assertTrue(isActive);
        PlaywrightUtils.page.locator("//div[contains(@class,'d-inline-block')]//a[@id='Home-navbar']").click();
    }

    /**
     * VERIFYING VISUALISATION NAVBAR SELECTION
     */
    public static void verifyVisualisationNavBarSelection() {
        Locator visualisationNavItem = PlaywrightUtils.page.locator("//div[@class='d-inline-block']//a[@id='Visualization-navbar']");
        boolean isActive = visualisationNavItem.getAttribute("class").contains("active-navlinks");
        softAssert.assertTrue(isActive);
        PlaywrightUtils.page.locator("//div[contains(@class,'d-inline-block')]//a[@id='Home-navbar']").click();
    }

    /**
     * VERIFYING EXPLORATION NAVBAR SELECTION
     */
    public static void verifyExplorationNavBarSelection() {
        Locator visualisationNavItem = PlaywrightUtils.page.locator("//div[@class='d-inline-block']//a[@id='Exploration-navbar']");
        boolean isActive = visualisationNavItem.getAttribute("class").contains("active-navlinks");
        softAssert.assertTrue(isActive);
        PlaywrightUtils.page.locator("//div[contains(@class,'d-inline-block')]//a[@id='Home-navbar']").click();
    }

    /**
     * VERIFYING ASSOCIATION NAVBAR SELECTION
     */
    public static void verifyAssociationNavBarSelection() {
        Locator visualisationNavItem = PlaywrightUtils.page.locator("//div[@class='d-inline-block']//a[@id='Association-navbar']");
        boolean isActive = visualisationNavItem.getAttribute("class").contains("active-navlinks");
        softAssert.assertTrue(isActive);
        PlaywrightUtils.page.locator("//div[contains(@class,'d-inline-block')]//a[@id='Home-navbar']").click();
    }
}