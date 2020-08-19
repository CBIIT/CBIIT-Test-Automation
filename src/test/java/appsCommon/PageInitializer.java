package appsCommon;

import ServiceNow.COVIDCode.Pages.COVIDCodeLoginPage;
import ServiceNow.COVIDCode.Pages.EnrollmentQuestionnairePage;
import ServiceNow.COVIDCode.Pages.FollowUpFormPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentViewPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentsPage;
import ServiceNow.COVIDCode.StepsImplementation.EnrollmentQuestionnairePageImpl;
import ServiceNow.COVIDCode.StepsImplementation.FollowUpFormPageImpl;
import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.COVIDDash.Pages.COVIDHomePage;
import ServiceNow.COVIDDash.Pages.SubmissionsPage;
import ServiceNow.COVIDDash.StepsImplementation.COVIDHomePageImpl;

/**
 * This an initializer class which will initialize all pages classes. Once pages
 * class created, create an object of it here inside the constructor
 */
public class PageInitializer {

	// declare protected static variables of types of all the pages
	/** iTrust instances */
	protected static ITrustLoginPage iTrustloginPage;
	protected static ITrustLoginPageImpl loginImpl;

	/** COVID19 Dashboard instances */
	protected static COVIDHomePage covidHomePage;
	protected static SubmissionsPage submissionPage;
	protected static NativeViewDashboardPage nativeViewDashPage;
	protected static COVIDHomePageImpl covidHomePageImpl;

	/** COVIDcode instances */
	protected static COVIDCodeLoginPage covidCodeLoginPage;
	protected static EnrollmentQuestionnairePage covidCodeEQPage;
	protected static EnrollmentQuestionnairePageImpl covidCodeEQPageImpl;
	protected static NativeViewEnrollmentsPage nativeViewEnrollementsPage;
	protected static NativeViewEnrollmentViewPage nativeViewEnrollmentViewPage;
	protected static FollowUpFormPage followUpFormPage;
	protected static FollowUpFormPageImpl followUpFormPageImpl;

	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		loginImpl = new ITrustLoginPageImpl();
		covidHomePage = new COVIDHomePage();
		submissionPage = new SubmissionsPage();
		nativeViewDashPage = new NativeViewDashboardPage();
		covidHomePageImpl = new COVIDHomePageImpl();
		covidCodeEQPage = new EnrollmentQuestionnairePage();
		covidCodeEQPageImpl = new EnrollmentQuestionnairePageImpl();
		covidCodeLoginPage = new COVIDCodeLoginPage();
		nativeViewEnrollementsPage = new NativeViewEnrollmentsPage();
		nativeViewEnrollmentViewPage = new NativeViewEnrollmentViewPage();
		followUpFormPage = new FollowUpFormPage();
		followUpFormPageImpl = new FollowUpFormPageImpl();
	}

}
