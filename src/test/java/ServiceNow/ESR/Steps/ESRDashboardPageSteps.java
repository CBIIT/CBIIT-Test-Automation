package ServiceNow.ESR.Steps;

import ServiceNow.ESR.Pages.NCINativeViewPage;
import appsCommon.NativeViewHomePage;
import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ESRDashboardPageSteps extends PageInitializer {

    @Given("a user logs in with valid credentials for Native View on the NCI at your service page {string}")
    public void a_user_logs_in_with_valid_credentials_for_native_view_on_the_nci_at_your_service_page(String appID) {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(appID));
        loginImpl.loginToNativeViewSideDoor();
    }

    @And("user searches {string} in the filter bar")
    public void user_searches_in_the_filter_bar(String searchValue) {
        nciNativeViewPage.nativeViewFilterNavigator.sendKeys(searchValue);
    }

    @And("the user clicks on create ESR")
    public void the_user_clicks_on_create_esr() {
        nciNativeViewPage.createTicketForESR.click();
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
//        MiscUtils.sleep(5000);
    }

    @Then("user is directed to the create ESR page where {string} and {string} are displayed")
    public void user_is_directed_to_the_create_esr_page_where_and_are_displayed(String expectedOrganizationalAffiliationTextForESR, String expectedShoppingCartTextESR) {
        CommonUtils.waitForVisibility(nciNativeViewPage.organizationalAffiliationTextForESR);
        String actualOrganizationalAffiliationTextForESR = nciNativeViewPage.organizationalAffiliationTextForESR.getText();
        System.out.println("text" + nciNativeViewPage.organizationalAffiliationTextForESR.getText());
        CommonUtils.assertEquals(expectedOrganizationalAffiliationTextForESR, actualOrganizationalAffiliationTextForESR);

        String actualShoppingCartTextESR = nciNativeViewPage.shoppingCartTextESR.getText();
        CommonUtils.assertEquals(expectedShoppingCartTextESR, actualShoppingCartTextESR);


    }

}
