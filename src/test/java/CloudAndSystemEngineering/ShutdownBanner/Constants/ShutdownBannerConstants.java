package CloudAndSystemEngineering.ShutdownBanner.Constants;

public class ShutdownBannerConstants {
    public static final String WEBSITE_URL = "https://bannertestnonprod.nci.nih.gov/";
    public static final String BANNER_URL_LIST_PRPD = System.getProperty("user.dir") + "/src/test/java/CloudAndSystemEngineering/ShutdownBanner/Resources/BannerUrlListProd.xlsx";
    public static final String BANNER_URL_LIST_PROD_SHEET_NAME = "Sheet1";
    public static final String TEST_URL = "https://ldlink.nih.gov/?tab=home";
    public static final String MESSAGE_BODY_SPANISH = "Ante la falta de fondos del gobierno, no se actualizará este sitio web y la organización no responderá a transacciones ni consultas hasta que se aprueben los fondos. El Centro Clínico de los Institutos Nacionales de la Salud (NIH), el hospital de investigación, permanecerá abierto. Consulte cc.nih.gov (en inglés). Infórmese sobre el funcionamiento del gobierno federal y el reinicio de las actividades en OPM.gov.";
    public static final String MESSAGE_TITLE_SPANISH = "La falta de fondos del gobierno federal";
    public static final String MESSAGE_BODY_ENGLISH = "Because of a lapse in government funding, the information on this website may not be up to date, transactions submitted via the website may not be processed, and the agency may not be able to respond to inquiries until appropriations are enacted. The NIH Clinical Center (the research hospital of NIH) is open. For more details about its operating status, please visit cc.nih.gov. Updates regarding government operating status and resumption of normal operations can be found at OPM.gov.";
    public static final String MESSAGE_TITLE_ENGLISH = "Government Funding Lapse";
    public static final String SITEMAP_FILE = System.getProperty("user.dir") + "/src/test/java/CloudAndSystemEngineering/ShutdownBanner/Resources/Sitemap file_ https___ntp.niehs.nih.gov_sitemap.xml_page=1.xml";
}