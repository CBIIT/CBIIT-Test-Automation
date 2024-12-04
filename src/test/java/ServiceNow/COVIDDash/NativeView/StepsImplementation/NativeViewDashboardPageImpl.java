package ServiceNow.COVIDDash.NativeView.StepsImplementation;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.Utils.PageCache;
import APPS_COMMON.PageInitializers.PageInitializer;

public class NativeViewDashboardPageImpl extends PageInitializer {

	private static PageCache pageCache = PageCache.getInstance();

	public void impersonateUser(String approver)  {

		WebDriverUtils.webDriver.navigate().to("");
		CommonUtils.sleep(1800);
		pageCache.getNativeViewDashboardPage().clickNativeViewLink();
		CommonUtils.sleep(1000);
		pageCache.getNativeViewDashboardPage().clickUserDropDown();
		CommonUtils.sleep(1000);
		pageCache.getNativeViewDashboardPage().clickImpersonateUserLink();
		CommonUtils.sleep(500);
		pageCache.getNativeViewDashboardPage().clickImpersonateSearchDD();
		CommonUtils.sleep(500);
		pageCache.getNativeViewDashboardPage().enterTextImpersonateSearchBox(approver);
		CommonUtils.sleep(1000);
		WebDriverUtils.webDriver.get("");
	}

}
