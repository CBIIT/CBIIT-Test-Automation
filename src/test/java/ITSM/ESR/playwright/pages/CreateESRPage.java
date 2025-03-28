package ITSM.ESR.playwright.pages;

public class CreateESRPage {

    /* ESR TEXT TO SEARCH IN FILTER */
    public static String ESRText = "ESR";

    /* LOCATES CREATE ESR MODULE */
    public static String createESRText = "Create ESR";

    /* FILTER TEXTBOX INSIDE THE ALL TAB IN NATIVE VIEW */
    public static String filterBoxNativeView = "Filter";

    /* FRAME SELECTOR IN NATIVE VIEW PAGES OR APPLICATIONS */
    public static String iframeSelector = "iframe[name=\"gsft_main\"]";

    /* ENGINEERING SUPPORT REQUESTS MODULE */
    public static String fullESRText = "Engineering Support Request";

    /* ENGINEERING SUPPORT REQUESTS SELECTION ON PORTAL VIEW SEARCH BAR */
    public static String fullESRTextIcon = " Engineering Support Request";

    /* LOCATES NCI AT YOUR SERVICE PORTAL WHICH NAVIGATES TO PORTAL VIEW */
    public static String NCIAtYourServiceText = "NCI at Your Service Portal";

    /* LOCATES NCI AT YOUR SERVICE PORTAL ICON WHICH NAVIGATES TO PORTAL VIEW */
    public static String NCIAtYourServiceIcon = "NCI at Your Service Portal 1 of";

    /* MAIN SEARCH BOX IN PORTAL VIEW */
    public static String searchBoxPortalView = "Start here! Search for";

    /* CUSTOMER DETAILS SECTION SELECTOR IN PORTAL VIEW */
    public static String customerDetailsContainer = "#container_customer_details_start";

    /* PROJECT DETAILS SECTION SELECTOR IN PORTAL VIEW */
    public static String projectDetailsContainer = "#container_request_details";

    /* TEAM DETAILS SECTION SELECTOR IN PORTAL VIEW */
    public static String teamDetailsContainer = "#container_roles_and_assignments";

    /* NEWLY CREATED ESR TICKET SELECTOR */
    public static String newESRTicketSelector = "//tbody/tr/td/a[1]";
}
