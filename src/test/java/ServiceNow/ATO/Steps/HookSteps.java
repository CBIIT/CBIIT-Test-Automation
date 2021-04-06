package ServiceNow.ATO.Steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookSteps {
	public static String foldeName = "";

	@Before(order = 0)
	public void before() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		String basePath = System.getProperty("user.dir") + "/Screenshots/";
		File directory = new File(basePath);
		if (!directory.exists()) {
			directory.mkdir();
		}
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String newPath = basePath + "Report-" + dateName + "/";
		File directory1 = new File(newPath);
		directory1.mkdir();
		foldeName = directory1.toString();
	}

	@After(order = 0)
	public void tearDown() {
		// DriverObjectFactory.closeDriver();
	}

}
