package appsCommon.Utils;

import appsCommon.PageInitializers.NativeView_SideDoor_PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Pages.ServiceNow_NCISP_Page;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

public class ServiceNow_Common_Methods extends NativeView_SideDoor_PageInitializer {

    /***
     * USE THIS METHOD TO IMPERSONATE ANY USER
     * @param user
     */
    public static void impersonateAnyUser(String user) {

        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.profileButton);
        try {
            boolean impersonateUser = NativeView_SideDoor_Dashboard_Page.impersonateUserButton.getText().contentEquals("Impersonate user");
            if (impersonateUser) {
                System.out.println(NativeView_SideDoor_Dashboard_Page.impersonateUserButton.getText());
                MiscUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserButton);
            } else {
                System.out.println(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton.getText());
                MiscUtils.sleep(2000);
                CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton);
            }
            MiscUtils.sleep(2000);
            CommonUtils.sendKeysToElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox, user);
            MiscUtils.sleep(2000);
            NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox.sendKeys(Keys.ENTER);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserWindowButton);
            MiscUtils.sleep(3000);
            System.out.println(ServiceNow_NCISP_Page.nativeViewLink.getText());
            MiscUtils.sleep(2000);
            CommonUtils.clickOnElement(ServiceNow_NCISP_Page.nativeViewLink);
        } catch (NoSuchElementException e) {
            System.out.println(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton.getText());
            MiscUtils.sleep(2000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateAnotherUserButton);
            MiscUtils.sleep(2000);
            CommonUtils.sendKeysToElement(NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox, user);
            MiscUtils.sleep(2000);
            NativeView_SideDoor_Dashboard_Page.impersonateSearchTextBox.sendKeys(Keys.ENTER);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.impersonateUserWindowButton);
            MiscUtils.sleep(3000);
            System.out.println(ServiceNow_NCISP_Page.nativeViewLink.getText());
            MiscUtils.sleep(2000);
            CommonUtils.clickOnElement(ServiceNow_NCISP_Page.nativeViewLink);
        }
    }

    /**
     * USE THIS METHOD TO SEARCH THE FILTER NAVIGATOR AND CLICK ON ANY MODULE
     * THE FIRST STRING ARGUMENT IS TO SEARCH THE FILTER NAVIGATOR
     * THE SECOND STRING ARGUMENT IS TO SELECT ON THE DESIRED MODULE - AN EXACT TEXT MATCH NEEDS TO BE PARAMETERIZED
     * THIS METHOD ALSO SWITCHES TO THE NATIVE VIEW IFRAME AFTER CLICKING ON A MODULE
     * TO INTERACT WITH ELEMENTS IN A TABLE
     *
     * @param text
     */
    public static void filterNavigatorSearch(String text) {
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allTab);
        NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys(text);
        CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.dynamicFilterNavigatorTextSearch(text));
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
    }
}
