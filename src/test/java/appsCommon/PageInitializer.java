package appsCommon;

import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import AnalysisTools.CEDCD.Steps.CEDCDBiospecimenCountsSelectAllCohortsSteps;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDMaleDiscrepancyOnSearchCohortsStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchCohortAlcoholConsumptionStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchFemaleCohortsStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSelectAllCohortsStepImp;
import AnalysisTools.LDLink.Pages.LDLinkHomePage;
import AnalysisTools.LDLink.Pages.LDLinkLandingPage;
import AnalysisTools.PLCO.Pages.BrowsePhenotypePage;
import AnalysisTools.PLCO.Pages.ExploreGWASPage;
import ServiceNow.CHARMS.NativeView.Pages.CHARMSNativeViewPage;
import ServiceNow.CHARMS.Pages.CHARMSHomePage;
import ServiceNow.CHARMS.Pages.ClinicalGeneticsBranchPage;
import ServiceNow.CHARMS.Pages.OKTAloginPage;
import ServiceNow.CHARMS.Pages.ProbandScreenerPage;
import ServiceNow.CHARMS.StepsImplementation.CHARMSHomePageImp;
import ServiceNow.CHARMS.StepsImplementation.ProbandScreenerSubmissionImpl;
import ServiceNow.CHARMS.StepsImplementation.TestAccountResetImpl;
import ServiceNow.CICDBuild.Pages.DevOpsLoginPage;
import ServiceNow.CICDBuild.Pages.DevOpsNativeViewPage;
import ServiceNow.CICDBuild.StepsImplementation.DevOpsAutomatedBuildStepsImplementation;
import ServiceNow.COVIDCode.Pages.COVIDCodeLoginPage;
import ServiceNow.COVIDCode.Pages.EnrollmentQuestionnairePage;
import ServiceNow.COVIDCode.Pages.FollowUpFormPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentViewPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentsPage;
import ServiceNow.COVIDCode.Pages.ServicePortalQuestionnairePage;
import ServiceNow.COVIDCode.Pages.ServicePortalSurveyPage;
import ServiceNow.COVIDCode.StepsImplementation.COVIDCodeLoginStepsImpl;
import ServiceNow.COVIDCode.StepsImplementation.DashboardStepImpl;
import ServiceNow.COVIDCode.StepsImplementation.FollowUpFormPageImpl;
import ServiceNow.COVIDCode.StepsImplementation.NativeViewStepsImpl;
import ServiceNow.COVIDCode.StepsImplementation.ServicePortalEQPageImpl;
import ServiceNow.COVIDCode.StepsImplementation.ServicePortalQuestionnairePageImp;
import ServiceNow.COVIDCode.StepsImplementation.SignOutVerificationStepImp;
import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.COVIDDash.Pages.COVIDHomePage;
import ServiceNow.COVIDDash.Pages.SubmissionsPage;
import ServiceNow.COVIDDash.StepsImplementation.COVIDHomePageImpl;
import ServiceNow.NERD.Pages.CreateNewSubmissionPage;
import ServiceNow.NERD.Pages.NERDDynamicXPATHS;
import ServiceNow.NERD.Pages.NERDSubmissionsPage;
import ServiceNow.NERD.StepsImplementation.NERDLoginStepsImplementation;
import ServiceNow.SEER.Pages.NativeViewSentViewPage;
import ServiceNow.SEER.Pages.SEERDataAccessRequestPage;
import ServiceNow.SEER.Pages.SEERIncidenceDatabaseDetailsPage;
import ServiceNow.SEER.Pages.SEERLandingPage;
import ServiceNow.SEER.Pages.SEERUserRegistrationPage;

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
	protected static ServicePortalEQPageImpl covidCodeEQPageImpl;
	protected static NativeViewEnrollmentsPage nativeViewEnrollementsPage;
	protected static NativeViewEnrollmentViewPage nativeViewEnrollmentViewPage;
	protected static NativeViewStepsImpl nativeViewStepsImpl;
	protected static FollowUpFormPage followUpFormPage;
	protected static FollowUpFormPageImpl followUpFormPageImpl;
	protected static COVIDCodeLoginStepsImpl covidCodeLoginStepsImpl;
	protected static ServicePortalSurveyPage servicePortalSurveyPage;
	protected static SignOutVerificationStepImp signOutVerificationStepImp;
	protected static ServicePortalQuestionnairePage servicePortalQuestionnairePage;
	protected static ServicePortalQuestionnairePageImp servicePortalQuestionnairePageImp;
	protected static DashboardStepImpl dashboardStepImpl;

	/** Native View instance */
	protected static NativeViewLoginImpl nativeViewLoginImpl;
	protected static NativeViewHomePage nativeViewHomePage;

	/** CHARMS instances */
	protected static CHARMSNativeViewPage charmsNativeViewPage;
	protected static TestAccountResetImpl testAccountResetImpl;
	protected static CHARMSHomePage charmsHomePage;
	protected static OKTAloginPage oktaLoginPage;
	protected static CHARMSHomePageImp charmsHomePageImpl;
	protected static ClinicalGeneticsBranchPage clinicalGeneticsBranchPage;
	protected static ProbandScreenerPage probandScreenerPage;
	protected static ProbandScreenerSubmissionImpl probandScreenerSubmissionImpl;

	/** LDLink instances **/
	protected static LDLinkHomePage ldLinkHomePage;
	protected static LDLinkLandingPage ldLinkLandingPage;

	/** PLCO instances **/
	protected static ExploreGWASPage exploreGWASPage;
	protected static BrowsePhenotypePage browsePhenotypePage;
   
	/** ServiceNow DevOps instances */
	protected static DevOpsLoginPage devOpsLoginPage;
	protected static DevOpsNativeViewPage devOpsNativeViewPage;
	protected static DevOpsAutomatedBuildStepsImplementation devOpsAutomatedBuildStepsImplementation;

	/** CEDCD instances */
	protected static CEDCDSearchCohortsPage cedcdSearchCohortsPage;
	protected static CEDCDSearchFemaleCohortsStepImp cedcdSearchFemaleCohortsStepImp;
	protected static CEDCDMaleDiscrepancyOnSearchCohortsStepImp cedcdMaleDiscrepancyOnSearchCohortsStepImp;
	protected static CEDCDSelectAllCohortsStepImp cedcdSelectAllCohortsStepImp;
	protected static CEDCDBiospecimenCountsSelectAllCohortsSteps cedcdBiospecimenCountsSelectAllCohortsSteps;
	protected static CEDCDSearchCohortAlcoholConsumptionStepImp cedcdSearchCohortAlcoholConsumptionStepImp;

	/** SEER instances */
	protected static SEERLandingPage seerLandingPage;
	protected static SEERUserRegistrationPage seerUserRegistrationPage;
	protected static SEERDataAccessRequestPage seerDataAccessRequestPage;
	protected static NativeViewSentViewPage nativeViewSentViewPage;
	protected static SEERIncidenceDatabaseDetailsPage seerIncidenceDatabaseDetailsPage;
	
	/** NERD instances */
	protected static NERDLoginStepsImplementation nerdLoginStepsImplementation;
	protected static NERDSubmissionsPage nerdCrsKnowledgeDatabaseSubmissionsPage;
	protected static CreateNewSubmissionPage createNewSubmissionPage;
	protected static NERDDynamicXPATHS nerdDynamicXpaths;

	

	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		loginImpl = new ITrustLoginPageImpl();
		covidHomePage = new COVIDHomePage();
		submissionPage = new SubmissionsPage();
		nativeViewDashPage = new NativeViewDashboardPage();
		covidHomePageImpl = new COVIDHomePageImpl();
		covidCodeEQPage = new EnrollmentQuestionnairePage();
		covidCodeEQPageImpl = new ServicePortalEQPageImpl();
		covidCodeLoginPage = new COVIDCodeLoginPage();
		nativeViewEnrollementsPage = new NativeViewEnrollmentsPage();
		nativeViewEnrollmentViewPage = new NativeViewEnrollmentViewPage();
		followUpFormPage = new FollowUpFormPage();
		followUpFormPageImpl = new FollowUpFormPageImpl();
		covidCodeLoginStepsImpl = new COVIDCodeLoginStepsImpl();
		nativeViewLoginImpl = new NativeViewLoginImpl();
		nativeViewHomePage = new NativeViewHomePage();
		charmsNativeViewPage = new CHARMSNativeViewPage();
		testAccountResetImpl = new TestAccountResetImpl();
		servicePortalSurveyPage = new ServicePortalSurveyPage();
		ldLinkLandingPage = new LDLinkLandingPage();
		ldLinkHomePage = new LDLinkHomePage();
		exploreGWASPage = new ExploreGWASPage();
		charmsHomePage = new CHARMSHomePage();
		oktaLoginPage = new OKTAloginPage();
		charmsHomePageImpl = new CHARMSHomePageImp();
		clinicalGeneticsBranchPage = new ClinicalGeneticsBranchPage();
		probandScreenerPage = new ProbandScreenerPage();
		probandScreenerSubmissionImpl = new ProbandScreenerSubmissionImpl();
		devOpsLoginPage = new DevOpsLoginPage();
		devOpsNativeViewPage = new DevOpsNativeViewPage();
		devOpsAutomatedBuildStepsImplementation = new DevOpsAutomatedBuildStepsImplementation();
		signOutVerificationStepImp = new SignOutVerificationStepImp();
		cedcdSearchCohortsPage = new CEDCDSearchCohortsPage();
		cedcdSearchFemaleCohortsStepImp = new CEDCDSearchFemaleCohortsStepImp();
		cedcdMaleDiscrepancyOnSearchCohortsStepImp = new CEDCDMaleDiscrepancyOnSearchCohortsStepImp();
		cedcdSelectAllCohortsStepImp = new CEDCDSelectAllCohortsStepImp();
		cedcdBiospecimenCountsSelectAllCohortsSteps = new CEDCDBiospecimenCountsSelectAllCohortsSteps();
		cedcdSearchCohortAlcoholConsumptionStepImp = new CEDCDSearchCohortAlcoholConsumptionStepImp();
		servicePortalQuestionnairePage = new ServicePortalQuestionnairePage();
		servicePortalQuestionnairePageImp = new ServicePortalQuestionnairePageImp();
		dashboardStepImpl = new DashboardStepImpl();
		nativeViewStepsImpl = new NativeViewStepsImpl();
		seerLandingPage = new SEERLandingPage();
		seerUserRegistrationPage = new SEERUserRegistrationPage();
		seerDataAccessRequestPage = new SEERDataAccessRequestPage();
		nativeViewSentViewPage = new NativeViewSentViewPage();
		seerIncidenceDatabaseDetailsPage = new SEERIncidenceDatabaseDetailsPage();
		nerdLoginStepsImplementation = new NERDLoginStepsImplementation();
		nerdCrsKnowledgeDatabaseSubmissionsPage = new NERDSubmissionsPage();
		createNewSubmissionPage = new CreateNewSubmissionPage();
		nerdDynamicXpaths = new NERDDynamicXPATHS();
	}
}