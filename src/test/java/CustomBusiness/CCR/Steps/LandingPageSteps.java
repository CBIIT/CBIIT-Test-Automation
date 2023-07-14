package CustomBusiness.CCR.Steps;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import java.util.Map;

public class LandingPageSteps extends PageInitializer {
    @Given("User is on CCR Landing page and user is {string}")
    public void user_is_on_ccr_landing_page_and_user_is(String user) throws TestingException {
        switch (user) {
            case "internal user":
                cCRLogInStepsImplementation.ccrLogin();
                break;
        }
    }
    @Given("User can see tabs displayed")
    public void user_can_see_tabs_displayed(io.cucumber.datatable.DataTable data) {
        Map<String, String> options = CommonUtil.getMapFromDataTable(data);
        Assert.assertTrue(options.get("Option1"),cCRLandingPage.homeTab.isDisplayed());
        Assert.assertTrue(options.get("Option2"),cCRLandingPage.positionsTab.isDisplayed());
    }
}