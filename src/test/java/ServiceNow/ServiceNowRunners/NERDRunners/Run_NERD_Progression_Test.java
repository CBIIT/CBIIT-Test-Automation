package ServiceNow.ServiceNowRunners.NERDRunners;

import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.web.ConfUtils;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty"}
        , features="src/test/java/ServiceNow/NERD/Features"
        , glue="ServiceNow.NERD.Steps"
        , tags="@Progression"
        , dryRun = false
        , monochrome=true
        , strict = true
)

/**
* This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
*  @author sohilz2
*/

public class Run_NERD_Progression_Test {
    @BeforeClass
    public static void runSetup() {

        String reportsOutput = LocalConfUtils.getRootDir() + File.separator + "html-reports";
        ConfUtils.setBaseResultsDir(reportsOutput);
        System.out.println("Starting Test Execution...");
    }
}