package ServiceNow.COVIDDash.StepsImplementation;

import java.util.List;
import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import APPS_COMMON.Utils.PageCache;
import APPS_COMMON.PageInitializers.PageInitializer;

public class SubmissionsPageImpl extends PageInitializer {

	private static PageCache pageCache = PageCache.getInstance();

	public void findIbrNumberAndclickRejectButton(String ExptdIbrNumber) {
		List<WebElement> ibrList = submissionPage.getPendingApprovalIBRNumbersList();
		for (int i = 0; i < ibrList.size(); i++) {
			String actualIbrNumber = ibrList.get(i).getText().trim();

			if (actualIbrNumber.equals(ExptdIbrNumber)) {
				CommonUtils.sleep(2000);
				submissionPage.getRejectButtonsList().get(i).click();
				CommonUtils.sleep(1000);
				submissionPage.enterRejectionReasonClickConfirm();
				break;
			} else {
				CommonUtils.sleep(1000);
				submissionPage.clickPendingApprovalNextButton();
			}
		}

	}

	public void rejectStudyUsingIbrNumber(String approver, String ibrNumber)  {
		CommonUtils.sleep(3000);
		pageCache.getNativeViewDashboardPageImpl().impersonateUser(approver);
		pageCache.getSubmissionsPageImpl().findIbrNumberAndclickRejectButton(ibrNumber);
	}

	public void verifySubmissionsTablesExists(String pendingStudies, String rejectedStudies) {
		CommonUtils.sleep(2000);
		boolean pdngTExists = submissionPage.getPendingApprovalTableText().contains(pendingStudies);
		Assert.assertTrue(pdngTExists);
		boolean rjctTExists = submissionPage.getRejectedStudiesTableText().contains(rejectedStudies);
		Assert.assertTrue(rjctTExists);
		CucumberLogUtils.logScreenshot();
	}

}
