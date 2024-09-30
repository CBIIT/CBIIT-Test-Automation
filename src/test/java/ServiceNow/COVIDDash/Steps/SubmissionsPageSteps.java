package ServiceNow.COVIDDash.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import appsCommon.Utils.PageCache;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Then;

public class SubmissionsPageSteps {

	private static PageCache pageCache = PageCache.getInstance();

	@Then("the Reviewer is directed to the Submissions page")
	public void the_Reviewer_is_directed_to_the_Submissions_page()  {
		pageCache.getNativeViewDashboardPageImpl().impersonateUser("Sharon Savage");
	}

	@Then("is able to see two tables names {string} and {string}")
	public void is_able_to_see_two_tables_names_and(String pendingStudies, String rejectedStudies) {
		CommonUtils.sleep(2000);
		pageCache.getSubmissionsPageImpl().verifySubmissionsTablesExists(pendingStudies, rejectedStudies);
		CucumberLogUtils.logScreenshot();
	}

	@Then("the submitted study is displayed and options to Approve or Reject are available")
	public void the_submitted_study_is_displayed_and_options_to_Approve_or_Reject_are_available()  {
		pageCache.getNativeViewDashboardPageImpl().impersonateUser("Sharon Savage");
		CommonUtils.sleep(3000);
		pageCache.getSubmissionsPage().verifyApproveRejectButton();
		CucumberLogUtils.logScreenshot();

	}
}
