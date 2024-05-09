package PlaywrightTests_sandbox.steps;

import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PlaywrightHooks extends PlaywrightUtils {

    @Before
    public void start(){
        setUp();
    }

    @After
    public void end(){
        tearDown();
    }
}
