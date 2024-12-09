package GRANTS.EM.playwright.pages;

public class EM_Page {

    /* JUST ONE PAGE WILL BE CREATED FOR ALL EM PAGES DUE TO LACK OF AUTOMATION RESOURCES */

    /**
     * @author JUAREZDS
     */

    /**
     * LOCATOR FOR THE COMMON I2E ROLE DROP-DOWN VALUES
     */
    public static String commonI2ERoleDropDownValuesLocator = "//html/body/span/span/span[2]/ul/li/span/b";

    /**
     * GM ACTION MANAGER ROLE TEXT
     */
    public static String gmActionManagerRoleText = "(//*[text()='GM Action Manager'])[1]//ancestor::tr/td[5]/span";
}
