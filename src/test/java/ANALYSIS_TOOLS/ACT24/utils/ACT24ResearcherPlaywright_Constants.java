package ANALYSIS_TOOLS.ACT24.utils;

import com.microsoft.playwright.Page;
import com.nci.automation.web.PlaywrightUtils;

public class ACT24ResearcherPlaywright_Constants {

    /***
     * ACCESSIBILITY PAGE TITLE
     */
    public static String ACCESSIBILITY_PAGE_TITLE = "Accessibility Policy - NCI";

    /***
     * DISCLAIMER PAGE TITLE
     */
    public static String DISCLAIMER_PAGE_TITLE = "Disclaimer - NCI";

    /***
     * FOIA PAGE TITLE
     */
    public static String FOIA_PAGE_TITLE = "Freedom of Information Act - NCI";

    /***
     * HHS POLICY PAGE LINK
     */
    public static String HHS_POLICY_PAGE_LINK = "https://www.hhs.gov/vulnerability-disclosure-policy/index.html";

    /***
     * PRIVACY AND POLICY PAGE TITLE
     */
    public static String PRIVACY_PAGE_TITLE = "Privacy and Security - NCI";

    /***
     * HHS PAGE LINK
     */
    public static String HHS_PAGE_LINK = "https://www.hhs.gov/";

    /***
     * NIH PAGE TITLE
     */
    public static String NIH_PAGE_TITLE = "National Institutes of Health (NIH) | Turning Discovery Into Health";

    /***
     * NIC PAGE TITLE
     */
    public static String NCI_PAGE_TITLE = "Comprehensive Cancer Information - NCI";

    /***
     * USA GOV PAGE LINK
     */
    public static String USA_GOV_PAGE = "https://www.usa.gov/";

    /***
     * NEW PAGE CONTEXT
     */
    public static Page newPage1 = PlaywrightUtils.context.newPage();
}