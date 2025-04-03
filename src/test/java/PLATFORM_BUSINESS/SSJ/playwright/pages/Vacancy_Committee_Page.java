package PLATFORM_BUSINESS.SSJ.playwright.pages;

public class Vacancy_Committee_Page {

    /**
     * VACANCY COMMITTEE MEMBER ROLE DROP DOWN
     */
    public static String vacancyCommitteeMemberRoleDropDown = "//span[@title='Member']";

    /**
     * VACANCY COMMITTEE MEMBER DROP DOWN
     */
    public static String vacancyCommitteeMemberDropDown = "//tbody/tr/td[@record='[object Object]']/div/div/div/div/div/div/div/div[1]";
//    public static String vacancyCommitteeMemberDropDown = "(//span[@title='Member'])[1]";

    /**
     * AT LEAST ONE COMMITTEE MEMBER MUST BE OF THE ROLE 'EXECUTIVE SECRETARY'
     */
    public static String atLeastOneCommitteeMemberMustBeOfTheRoleExecutiveSecretaryMessage = "//div[@role='alert']//div";

    /**
     * VACANCY COMMITTEE MEMBER ROLE CHAIR DROP DOWN
     */
    public static String vacancyCommitteeChairRoleDropDown = "//span[@title='Chair']";

    /**
     * VACANCY COMMITTEE MEMBER DROP DOWN WHEN SELECTING A DUPLICATE MEMBER
     */
    public static String duplicateVacancyCommitteeMemberDropdown = "//div[@class=' css-1hwfws3']";
}
