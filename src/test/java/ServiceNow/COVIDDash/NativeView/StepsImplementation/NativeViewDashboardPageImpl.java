package ServiceNow.COVIDDash.NativeView.StepsImplementation;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageCache;
import appsCommon.PageInitializer;

public class NativeViewDashboardPageImpl extends PageInitializer {

	private static PageCache pageCache = PageCache.getInstance();

	public void impersonateUser(String approver) throws TestingException {

		WebDriverUtils.webDriver.navigate().to(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(1800);
		pageCache.getNativeViewDashboardPage().clickNativeViewLink();
		MiscUtils.sleep(1000);
		pageCache.getNativeViewDashboardPage().clickUserDropDown();
		MiscUtils.sleep(1000);
		pageCache.getNativeViewDashboardPage().clickImpersonateUserLink();
		MiscUtils.sleep(500);
		pageCache.getNativeViewDashboardPage().clickImpersonateSearchDD();
		MiscUtils.sleep(500);
		pageCache.getNativeViewDashboardPage().enterTextImpersonateSearchBox(approver);
		MiscUtils.sleep(1000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("covid19dashboard"));
	}

}
