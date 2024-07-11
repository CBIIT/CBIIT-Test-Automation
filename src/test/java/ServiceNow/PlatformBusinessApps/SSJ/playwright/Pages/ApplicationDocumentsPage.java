package ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages;

public class ApplicationDocumentsPage {

    public static String dynamicDocLocator(String text){
        return "//*[text()='"+ text + "']//following-sibling::div/div/div/div/div/div/span/div/span/input";
    }
}
