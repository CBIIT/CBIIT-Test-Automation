package ServiceNow.ESR.Selenium.StepsImplementation;

import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CreateESRPageStepsImplementation extends PageInitializer {

    public static void nativeViewSideDoorLogInHomePage(String appID) {
        WebDriverUtils.webDriver.get("");
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
    }

    public static void clickCreateTicketAndSwitchToFrame() {
        nciNativeViewPage.createTicketForESR.click();
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
    }

    public static void textConfirmedOnCreateESRPage(String expectedOrganizationalAffiliationTextForESR, String expectedShoppingCartTextESR) {
        CommonUtils.waitForVisibility(nciNativeViewPage.organizationalAffiliationTextForESR);
        String actualOrganizationalAffiliationTextForESR = nciNativeViewPage.organizationalAffiliationTextForESR.getText();
        CommonUtils.assertEquals(expectedOrganizationalAffiliationTextForESR, actualOrganizationalAffiliationTextForESR);
        String actualShoppingCartTextESR = nciNativeViewPage.shoppingCartTextESR.getText();
        CommonUtils.assertEquals(expectedShoppingCartTextESR, actualShoppingCartTextESR);
    }
}
