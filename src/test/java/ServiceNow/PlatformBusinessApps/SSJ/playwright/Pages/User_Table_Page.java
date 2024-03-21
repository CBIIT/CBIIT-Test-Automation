package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class User_Table_Page {

    public static String dynamicUserLocator(String userName){
        return "(//*[text()='"+ userName + "']/parent::tr/td)[3]/a";
    }


}
