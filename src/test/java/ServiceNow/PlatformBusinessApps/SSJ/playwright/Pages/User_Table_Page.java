package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class User_Table_Page {

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ANY USER ON THE USERS TABLE
     * @param userName
     * @return
     */
    public static String dynamicUserLocator(String userName){
        return "(//*[text()='"+ userName + "']/parent::tr/td)[3]/a";
    }

    /**
     * DELETE BUTTON
     */
    public static String deleteButton = "(//*[contains(text(),'Delete')])[1]";

    /**
     * MODAL DIALOG DELETE BUTTON
     */
    public static String modalDialogDeleteButton = "(//*[contains(text(),'Delete')])[6]";

    /**
     * USERS DROPDOWN
     */
    public static String usersDropDown = "//select[@aria-label='Search a specific field of the Users list']";

}
