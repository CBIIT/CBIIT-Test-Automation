package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class Vacancy_Committee_Page {

    /**
     * VACANCY COMMITTEE MEMBER ROLE DROP DOWN
     */
    public static String vacancyCommitteeMemberRoleDropDown = "//span[@title='Member']";

    /**
     * VACANCY COMMITTEE MEMBER DROP DOWN
     */
    public static String vacancyCommitteeMemberDropDown = "//tbody/tr/td[@record='[object Object]']/div/div/div/div/div/div/div/div[1]";

    /**
     * AT LEAST ONE COMMITTEE MEMBER MUST BE OF THE ROLE 'EXECUTIVE SECRETARY'
     */
    public static String atLeastOneCommitteeMemberMustBeOfTheRoleExecutiveSecretaryMessage = "//div[@role='alert']//div";
}
