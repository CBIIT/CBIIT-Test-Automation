package APPS_COMMON.Utils;

import com.nci.automation.utils.CucumberLogUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.NativeView_SideDoor_PageInitializer;
import APPS_COMMON.Pages.NativeViewHomePage;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Pages.ServiceNow_NCISP_Page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class ServiceNow_Common_Methods extends NativeView_SideDoor_PageInitializer {

    /***
     * USE THIS METHOD TO IMPERSONATE ANY USER AND LAND IN NATIVE VIEW
     * @param user
     */
    public static void impersonateAnyUser(String user) {
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.profileButton);
        try {
            boolean impersonateUser = NativeView_SideDoor_Dashboard_Page.impersonateUserButton.getText().contentEquals("Impersonate user");
            if (impersonateUser) {
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserButton);
            } else {
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton);
            }
            CommonUtils.sleep(2000);
            CommonUtils.sendKeysToElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox, user);
            CommonUtils.sleep(2000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchFirstValue);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserWindowButton);
            CommonUtils.sleep(3000);
            Boolean nativeViewIsPresent = ServiceNow_NCISP_Page.allPresentNativeViewLinks.size() > 0;
            if (nativeViewIsPresent == true) {
                System.out.println(ServiceNow_NCISP_Page.nativeViewLink.getText());
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(ServiceNow_NCISP_Page.nativeViewLink);
                CommonUtils.sleep(2000);
            }
        } catch (NoSuchElementException e) {
            System.out.println(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton.getText());
            CommonUtils.sleep(2000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton);
            CommonUtils.sleep(2000);
            CommonUtils.sendKeysToElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox, user);
            CommonUtils.sleep(2000);
            NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox.sendKeys(Keys.ENTER);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserWindowButton);
            CommonUtils.sleep(3000);
            CommonUtils.clickOnElement(ServiceNow_NCISP_Page.nativeViewLink);
            CommonUtils.sleep(2000);
        }
    }

    /**
     * USE THIS METHOD TO IMPERSONATE ANY USER WITHOUT LANDING IN NATIVE VIEW
     * @param user
     */
    public static void impersonate_Any_User_Without_Landing_In_Native_View(String user){
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.profileButton);
        try {
            boolean impersonateUser = NativeView_SideDoor_Dashboard_Page.impersonateUserButton.getText().contentEquals("Impersonate user");
            if (impersonateUser) {
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserButton);
            } else {
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton);
            }
            CommonUtils.sleep(2000);
            CommonUtils.sendKeysToElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox, user);
            CommonUtils.sleep(2000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchFirstValue);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserWindowButton);
            CommonUtils.sleep(2000);
        } catch (NoSuchElementException e) {
            boolean impersonateUser = NativeView_SideDoor_Dashboard_Page.impersonateUserButton.getText().contentEquals("Impersonate user");
            if (impersonateUser) {
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserButton);
            } else {
                CommonUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton);
            }
            CommonUtils.sleep(2000);
            CommonUtils.sendKeysToElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox, user);
            CommonUtils.sleep(2000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchFirstValue);
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserWindowButton);
            CommonUtils.sleep(2000);
            CommonUtils.clickOnElement(ServiceNow_NCISP_Page.nativeViewLink);
        }
    }

    /**
     * USE THIS METHOD TO CLICK ON ALL TAB AND SEARCH THE FILTER NAVIGATOR AND CLICK ON ANY MODULE
     * THE FIRST STRING ARGUMENT IS TO SEARCH THE FILTER NAVIGATOR
     * THE SECOND STRING ARGUMENT IS TO SELECT ON THE DESIRED MODULE - AN EXACT TEXT MATCH NEEDS TO BE PARAMETERIZED
     * THIS METHOD ALSO SWITCHES TO THE NATIVE VIEW IFRAME AFTER CLICKING ON A MODULE
     * TO INTERACT WITH ELEMENTS IN A TABLE
     *
     * @param text
     */
    public static void filterNavigatorSearchWithAllTabString(String text) {
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allTab);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(text);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.assetsMenuButton);
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
    }

    /**
     * USE THIS METHOD TO SEARCH THE FILTER NAVIGATOR WITHOUT CLICKING ON THE ALL TAB
     * @param text
     */
    public static void filterNavigatorSearch(String text){
        if(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.getAttribute("class").equals("sn-global-typeahead-input -global")){
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allTab);
            NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(text);
            CommonUtils.sleep(3000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.assetsMenuButton);
            CommonUtils.sleep(3000);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.sleep(2000);
        }else {
            NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(text);
            CommonUtils.sleep(3000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.assetsMenuButton);
            CommonUtils.sleep(3000);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.sleep(2000);
        }
        CommonUtils.sleep(3000);
    }   
    public static void filterNavigatorSearchForFHQ(String text){
    	if(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.getAttribute("class").equals("sn-global-typeahead-input -global")){
    		CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allTab);
    		NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(text + Keys.ENTER);
    		CommonUtils.sleep(3000);       
    		CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.nVFHQFilterMatchLink);
    		CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
    		CommonUtils.sleep(2000);
    	}else {
    		NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(text);
    		CommonUtils.sleep(1000);
    		NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(Keys.ENTER);;
    		CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
    		CommonUtils.sleep(1000);
    	}      
    }

    /***
     * USE THIS METHOD TO LOG OUT OF NATIVE VIEW
     */
    public static void logOutOfNativeView() {
        WebDriverUtils.webDriver.get(getNCISPUrl());
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(NativeViewHomePage.profileModule);
        CommonUtils.clickOnElement(NativeViewHomePage.logOutButton);
        CucumberLogUtils.logScreenshot();
    }
}