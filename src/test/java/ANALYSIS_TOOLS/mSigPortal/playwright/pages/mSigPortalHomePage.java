package ANALYSIS_TOOLS.mSigPortal.playwright.pages;

public class mSigPortalHomePage {

    /***
     * MSIG PORTAL NAVBAR LOCATOR
     */
    public static String mSigPortalHomeNavBar = "//div[@class='mx-auto']//a[@id='Home-navbar']";

    /***
     * LEARN MORE ABOUT MSIGPORTAL BUTTON LOCATOR
     */
    public static String learnMoreMsigButton = "//div[@class='homepage-title-right']//div[@class='msigportal-home-title-right'][normalize-space()='Learn more about mSigportal >']";

    /***
     * CATALOG CARD
     */
    public static String catalogueCard = "//div[contains(@class,'d-none d-lg-block')]//div[@id='Catalog']//div[contains(@class,'mb-3')]//span[1]";

    /***
     * VISUALISATION CARD
     */
    public static String visualizationCard = "//div[contains(@class,'d-none d-lg-block')]//div[@id='Visualization']//div[contains(@class,'mb-3')]//span[1]";

    /***
     * EXPLORATION CARD
     */
    public static String explorationCard = "//div[contains(@class,'d-none d-lg-block')]//div[@id='Exploration']//div[contains(@class,'mb-3')]//span[1]";

    /***
     * ASSOCIATION CARD
     */
    public static String associationCard = "//div[contains(@class,'d-none d-lg-block')]//div[@id='Association']//div[contains(@class,'mb-3')]//span[1]";
}