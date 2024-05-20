package PlaywrightHooks;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.asserts.SoftAssert;

public class PlaywrightHooks extends PlaywrightUtils {

    private AssertionError assertionError;  // to hold any assertion error during the test
    static SoftAssert softAssert;

    @Before
    public void start(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        setUp();
        softAssert = new SoftAssert();
        assertionError = null;  // reset the assertion error at the start of each test
    }

    @After
    public void end() {
        try {
            softAssert.assertAll();
        } catch (AssertionError error) {
            assertionError = error;
        } finally {
            CucumberLogUtils.playwrightScreenshot(page);
            tearDown();  // tearDown() will be always executed
        }

        if (assertionError != null) {
            throw assertionError;  // re-throw the assertion error after tearDown()
        }
    }
}