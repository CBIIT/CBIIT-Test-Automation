package ServiceNow.COVIDDash.StepsImplementation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageCache;
import appsCommon.PageInitializer;




public class SubmissionsPageImpl extends PageInitializer {
	
	private static PageCache pageCache = PageCache.getInstance();

	
	public void findIbrNumberAndclickRejectButton(String ExptdIbrNumber) {
		List<WebElement> ibrList = submissionPage.getPendingApprovalIBRNumbersList();
		for (int i = 0; i < ibrList.size(); i++) {
			String actualIbrNumber = ibrList.get(i).getText().trim();
			
			if (actualIbrNumber.equals(ExptdIbrNumber)) {
				MiscUtils.sleep(2000);
				submissionPage.getRejectButtonsList().get(i).click();
				MiscUtils.sleep(1000);
				submissionPage.enterRejectionReasonClickConfirm();
				break;
			}else {
				MiscUtils.sleep(1000);
				submissionPage.clickPendingApprovalNextButton();
			}
		}

	}
	
	public void rejectStudyUsingIbrNumber(String approver, String ibrNumber) throws TestingException {
		MiscUtils.sleep(3000);
		pageCache.getSubmissionsPageImpl().findIbrNumberAndclickRejectButton(ibrNumber);
	}

	
	public void verifySubmissionsTablesExists(String pendingStudies, String rejectedStudies) {		
		MiscUtils.sleep(2000);
		boolean pdngTExists = submissionPage.getPendingApprovalTableText().contains(pendingStudies);		
		Assert.assertTrue(pdngTExists);			
		boolean rjctTExists = submissionPage.getRejectedStudiesTableText().contains(rejectedStudies);		
		Assert.assertTrue(rjctTExists);
		CucumberLogUtils.logScreenShot();
	}
	
}
