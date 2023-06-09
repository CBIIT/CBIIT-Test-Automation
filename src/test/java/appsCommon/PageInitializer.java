package appsCommon;

import AnalysisTools.CEDCD.Pages.CEDCDAdminPage;
import AnalysisTools.CEDCD.Pages.CEDCDBiospecimenCountsPage;
import AnalysisTools.CEDCD.Pages.CEDCDCohortPage;
import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import AnalysisTools.CEDCD.Steps.CEDCDStartUps;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDAlphabetizedSelectTypesStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchCohortNewPageLayOutStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSearchFemaleCohortsStepImp;
import AnalysisTools.CEDCD.StepsImplementation.CEDCDSelectAllCohortsStepImp;
import AnalysisTools.Comets2.Pages.Comets2Page;
import AnalysisTools.ICRP.Pages.ICRPHomePage;
import AnalysisTools.ICRP.Pages.ICRPSearchDatabase;
import AnalysisTools.JPSurv.Pages.JPSurvHomePage;
import AnalysisTools.LDLink.Pages.LDLinkHomePage;
import AnalysisTools.LDLink.Pages.LDLinkLandingPage;
import AnalysisTools.PLCO.Pages.BrowsePhenotypePage;
import AnalysisTools.PLCO.Pages.ExploreGWASPage;
import AnalysisTools.PLCO.Pages.InformationPage;
import AnalysisTools.mSigPortal.Pages.CatalogPages;
import AnalysisTools.mSigPortal.Pages.MSigPortalHomePage;
import AnalysisTools.mSigPortal.Pages.SignatureExplorerPages;
import AnalysisTools.mSigPortal.Pages.SignatureVisualizationsPage;
import ServiceNow.CHARMS.NativeView.Pages.CHARMSNativeViewPage;
import ServiceNow.CHARMS.Pages.CGBIIQPage;
import ServiceNow.CHARMS.Pages.CGBIIQPages;
import ServiceNow.CHARMS.Pages.CHARMSHomePage;
import ServiceNow.CHARMS.Pages.ClinicalGeneticsBranchPage;
import ServiceNow.CHARMS.Pages.FHQSurveyPage;
import ServiceNow.CHARMS.Pages.FHQSurveyPortalPage;
import ServiceNow.CHARMS.Pages.MelanomaHomePage;
import ServiceNow.CHARMS.Pages.MelanomaLoginPage;
import ServiceNow.CHARMS.Pages.MelanomaQuestionnairePage;
import ServiceNow.CHARMS.Pages.MyRASHomePage;
import ServiceNow.CHARMS.Pages.MyRASLoginPage;
import ServiceNow.CHARMS.Pages.MyRASStudyConsentPage;
import ServiceNow.CHARMS.Pages.OKTAloginPage;
import ServiceNow.CHARMS.Pages.ProbandScreenerPage;
import ServiceNow.CHARMS.Pages.RASSurveyPage;
import ServiceNow.CHARMS.Pages.RASopathyQuestionnairePage;
import ServiceNow.CHARMS.Pages.TestAccountResetPage;
import ServiceNow.CHARMS.StepsImplementation.CHARMSHomePageImp;
import ServiceNow.CHARMS.StepsImplementation.RASSurveyStepsImpl;
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
import ServiceNow.NERD.Pages.NERDCRSTCollaborationsPage;
import ServiceNow.NERD.Pages.NERDCRSTopAccomplishmentsPage;
import ServiceNow.NERD.Pages.NERDDOCCollaborationsPage;
import ServiceNow.NERD.Pages.NERDDynamicXPATHS;
import ServiceNow.NERD.Pages.NERDHomePage;
import ServiceNow.NERD.Pages.NERDKnowledgebasePage;
import ServiceNow.NERD.Pages.NERDSubmissionsPage;
import ServiceNow.NERD.StepsImplementation.NERDLoginStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NativeViewImpersonateUser;
import ServiceNow.SEER.Pages.NativeViewSentViewPage;
import ServiceNow.SEER.Pages.SEERDataAccessRequestPage;
import ServiceNow.SEER.Pages.SEERExistingAccountPage;
import ServiceNow.SEER.Pages.SEERIncidenceDatabaseDetailsPage;
import ServiceNow.SEER.Pages.SEERLandingPage;
import ServiceNow.SEER.Pages.SEERUserRegistrationPage;
import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import CustomBusiness.DCEG.Pages.AdminFlowPage;
import CustomBusiness.DCEG.Pages.BranchAdminPage;
import CustomBusiness.DCEG.Pages.CreateCRPage;
import CustomBusiness.DCEG.Pages.DirectSubmitterPage;
import CustomBusiness.DCEG.Pages.RegularUserFlowPage;
import CustomBusiness.DCEG.Steps.RegularUserFlowSteps;
import CustomBusiness.DCEG.StepsImplementation.FlowStepsImplementation;
import CustomBusiness.EIDP.Pages.AligningExpectationsPage;
import CustomBusiness.EIDP.Pages.BasePage;
import CustomBusiness.EIDP.Pages.CareerGoalAndActivePage;
import CustomBusiness.EIDP.Pages.CoPrimaryMentorPage;
import CustomBusiness.EIDP.Pages.CommonPage;
import CustomBusiness.EIDP.Pages.DashboardPage;
import CustomBusiness.EIDP.Pages.DelegatePage;
import CustomBusiness.EIDP.Pages.GeneralInformationPage;
import CustomBusiness.EIDP.Pages.IDPAwaitingResponsePage;
import CustomBusiness.EIDP.Pages.LoginPage;
import CustomBusiness.EIDP.Pages.ProjectRelatedDeliverablePage;
import CustomBusiness.EIDP.Pages.SearchPage;
import CustomBusiness.EIDP.Pages.TraineeReviewPage;
import CustomBusiness.EIDP.StepsImplementation.TraineeReviewStepsImpl;
import CustomBusiness.EIDP.StepsImplementation.AlignExpectionsStepImpl;
import CustomBusiness.EIDP.StepsImplementation.CareerGoalAndActiveStepImpl;
import CustomBusiness.EIDP.StepsImplementation.EIDPLoginStepImpl;
import CustomBusiness.EIDP.StepsImplementation.GeneralInformationStepImpl;
import CustomBusiness.EIDP.StepsImplementation.ProjectRelatedDeliverableStepImpl;
import CustomBusiness.EIDP.StepsImplementation.SearchStepImpl;
import CustomBusiness.ETD.Pages.ETDAdminNCIPage;
import CustomBusiness.ETD.Pages.ETDBasePage;
import CustomBusiness.ETD.StepsImplementation.ETDFlowStepsImpl;

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
	protected static NativeViewImpersonateUser nativeViewImpersonateUser;
	protected static NativeViewSideDoorLoginPage nativeViewSideDoorLoginPage;

	/** CHARMS instances */
	protected static CHARMSNativeViewPage charmsNativeViewPage;
	protected static TestAccountResetImpl testAccountResetImpl;
	protected static CHARMSHomePage charmsHomePage;
	protected static OKTAloginPage oktaLoginPage;
	protected static CHARMSHomePageImp charmsHomePageImpl;
	protected static ClinicalGeneticsBranchPage clinicalGeneticsBranchPage;
	protected static ProbandScreenerPage probandScreenerPage;
	protected static MyRASLoginPage myRASLoginPage;
	protected static MyRASHomePage myRASHomePage;
	protected static RASopathyQuestionnairePage rasopathyQuestionnairePage;
	protected static TestAccountResetPage testAccountResetPage;
	protected static MyRASStudyConsentPage myRasStudyConsentPage;
	protected static CGBIIQPage cgbIIQPage;
	protected static CGBIIQPages cGBIIQPages;
	protected static RASSurveyPage rASSurveyPage;
	protected static RASSurveyStepsImpl rASSurveyStepsImpl;
	protected static FHQSurveyPage fHQSurveyPage;
	protected static FHQSurveyPortalPage fHQSurveyPortalPage;

	/** LDLink instances **/
	protected static LDLinkHomePage ldLinkHomePage;
	protected static LDLinkLandingPage ldLinkLandingPage;

	/** PLCO instances **/
	protected static ExploreGWASPage exploreGWASPage;
	protected static BrowsePhenotypePage browsePhenotypePage;
	protected static InformationPage informationPage;

	/** ServiceNow DevOps instances */
	protected static DevOpsLoginPage devOpsLoginPage;
	protected static DevOpsNativeViewPage devOpsNativeViewPage;
	protected static DevOpsAutomatedBuildStepsImplementation devOpsAutomatedBuildStepsImplementation;

	/** CEDCD instances */
	protected static CEDCDCohortPage cedcdCohortPage;
	protected static CEDCDSearchCohortsPage cedcdSearchCohortsPage;
	protected static CEDCDAdminPage cedcdAdminPage;
	protected static CEDCDSearchFemaleCohortsStepImp cedcdSearchFemaleCohortsStepImp;
	protected static CEDCDSelectAllCohortsStepImp cedcdSelectAllCohortsStepImp;
	protected static CEDCDBiospecimenCountsPage cedcdBiospecimenCountsPage;
	protected static CEDCDSearchCohortNewPageLayOutStepImp cedcdSearchCohortNewPageLayOutStepImp;
	protected static CEDCDAlphabetizedSelectTypesStepImp cedcdAlphabetizedSelectTypesStepImp;
	protected static CEDCDStartUps cedcdStartUps;
	protected static CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp;
	protected static CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp;

	/** SEER instances */
	protected static SEERLandingPage seerLandingPage;
	protected static SEERUserRegistrationPage seerUserRegistrationPage;
	protected static SEERDataAccessRequestPage seerDataAccessRequestPage;
	protected static NativeViewSentViewPage nativeViewSentViewPage;
	protected static SEERIncidenceDatabaseDetailsPage seerIncidenceDatabaseDetailsPage;
	protected static SEERExistingAccountPage seerExistingAccountPage;
	protected static SEERDataAccessRequestPageStepsImpl seerDataAccessRequestPageStepsImpl;

	/** NERD instances */
	protected static NERDLoginStepsImplementation nerdLoginStepsImplementation;
	protected static NERDSubmissionsPage nerdCrsKnowledgeDatabaseSubmissionsPage;
	protected static CreateNewSubmissionPage createNewSubmissionPage;
	protected static NERDDynamicXPATHS nerdDynamicXpaths;
	protected static NERDHomePage nerdHomePage;
	protected static NERDKnowledgebasePage nerdKnowledgeBasePage;
	protected static NERDCRSTopAccomplishmentsPage nerdCRSTopAccomplishmentsPage;
	protected static NERDCRSTCollaborationsPage nerdCRSTCollaborationsPage;
	protected static NERDDOCCollaborationsPage nerdDOCCollaborationsPage;

	/** Comets 2.0 Instances */
	protected static Comets2Page comets2Page;

	/** mSigPortal Instances */
	protected static SignatureVisualizationsPage signatureVisualizationsPage;
	protected static MSigPortalHomePage mSigPortalHomePage;
	protected static SignatureExplorerPages signatureExplorerPages;
	protected static CatalogPages catalogPages;

	/** ICRP instances **/
	protected static ICRPHomePage icrpHomePage;
	protected static ICRPSearchDatabase icrpSearchDatabase;

	/** JPSurv instances **/
	protected static JPSurvHomePage jpsurvHomePage;

	/** Melanoma and Spitzoid Tumor instances **/
	protected static MelanomaLoginPage melanomaLoginPage;
	protected static MelanomaHomePage melanomaHomePage;
	protected static MelanomaQuestionnairePage melanomaQuestionnairePage;

	/** Custom Business App Instances */
	protected static AligningExpectationsPage aligningExpectationsPage;
	protected static DashboardPage eidpDashboardPage;
	protected static CommonPage eidpCommonPage;
	protected static LoginPage nihLoginPage;
	protected static BasePage eidpBasePage;
	protected static EIDPLoginStepImpl eidpLoginStepImpl;
	protected static AlignExpectionsStepImpl aligningExpectationsStepImpl;
	protected static GeneralInformationPage generalInformationPage;
	protected static GeneralInformationStepImpl generalInformationStepImpl;
	protected static CustomBusiness.EIDP.StepsImplementation.DashboardStepImpl eidpDashboardStepImpl;
	protected static SearchPage searchPage;
	protected static SearchStepImpl searchStepimpl;
	protected static CareerGoalAndActivePage careerGoalAndActivePage;
	protected static CareerGoalAndActiveStepImpl careerGoalAndActiveStepImpl;
	protected static ProjectRelatedDeliverablePage projectRelatedDeliverablePage;
	protected static ProjectRelatedDeliverableStepImpl projectRelatedDeliverableStepImpl;
	protected static DelegatePage delegatePage;
	protected static IDPAwaitingResponsePage iDPAwaitingResponsePage;
	protected static TraineeReviewPage traineeReviewPage;
	protected static TraineeReviewStepsImpl traineeReviewStepImpl;
	protected static CoPrimaryMentorPage coPrimaryMentorPage;
	protected static CreateCRPage createCRPage;
	protected static FlowStepsImplementation flowStepsImplementation;
	protected static DirectSubmitterPage directSubmitterPage;
	protected static AdminFlowPage adminFlowPage;
	protected static RegularUserFlowSteps regularUserFlowSteps;
	protected static BranchAdminPage branchAdminPage;
	protected static RegularUserFlowPage regularUserFlowPage;
	protected static ETDFlowStepsImpl etdFlowStepsImpl;
	protected static ETDAdminNCIPage etdAdminNCIPage;
	protected static ETDBasePage etdBasePage;

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
		devOpsLoginPage = new DevOpsLoginPage();
		devOpsNativeViewPage = new DevOpsNativeViewPage();
		devOpsAutomatedBuildStepsImplementation = new DevOpsAutomatedBuildStepsImplementation();
		signOutVerificationStepImp = new SignOutVerificationStepImp();
		cedcdSearchCohortsPage = new CEDCDSearchCohortsPage();
		cedcdSearchFemaleCohortsStepImp = new CEDCDSearchFemaleCohortsStepImp();
		cedcdSelectAllCohortsStepImp = new CEDCDSelectAllCohortsStepImp();
		cedcdBiospecimenCountsPage = new CEDCDBiospecimenCountsPage();
		cedcdSearchCohortNewPageLayOutStepImp = new CEDCDSearchCohortNewPageLayOutStepImp();
		cedcdAlphabetizedSelectTypesStepImp = new CEDCDAlphabetizedSelectTypesStepImp();
		cedcdStartUps = new CEDCDStartUps();
		cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp = new CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp();
		cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp = new CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp();
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
		nativeViewImpersonateUser = new NativeViewImpersonateUser();
		nerdDynamicXpaths = new NERDDynamicXPATHS();
		browsePhenotypePage = new BrowsePhenotypePage();
		informationPage = new InformationPage();
		cedcdAdminPage = new CEDCDAdminPage();
		cedcdCohortPage = new CEDCDCohortPage();
		icrpHomePage = new ICRPHomePage();
		icrpSearchDatabase = new ICRPSearchDatabase();
		comets2Page = new Comets2Page();
		signatureVisualizationsPage = new SignatureVisualizationsPage();
		mSigPortalHomePage = new MSigPortalHomePage();
		signatureExplorerPages = new SignatureExplorerPages();
		catalogPages = new CatalogPages();
		myRASLoginPage = new MyRASLoginPage();
		myRASHomePage = new MyRASHomePage();
		rasopathyQuestionnairePage = new RASopathyQuestionnairePage();
		testAccountResetPage = new TestAccountResetPage();
		myRasStudyConsentPage = new MyRASStudyConsentPage();
		cgbIIQPage = new CGBIIQPage();
		cGBIIQPages = new CGBIIQPages();
		rASSurveyPage = new RASSurveyPage();
		rASSurveyStepsImpl = new RASSurveyStepsImpl();
		fHQSurveyPortalPage = new FHQSurveyPortalPage();

		/** Native View instance */
		nativeViewImpersonateUser = new NativeViewImpersonateUser();
		nativeViewSideDoorLoginPage = new NativeViewSideDoorLoginPage();
		fHQSurveyPage = new FHQSurveyPage();

		jpsurvHomePage = new JPSurvHomePage();
		melanomaLoginPage = new MelanomaLoginPage();
		melanomaHomePage = new MelanomaHomePage();
		melanomaQuestionnairePage = new MelanomaQuestionnairePage();
		nerdHomePage = new NERDHomePage();
		nerdKnowledgeBasePage = new NERDKnowledgebasePage();
		nerdCRSTopAccomplishmentsPage = new NERDCRSTopAccomplishmentsPage();
		nerdDOCCollaborationsPage = new NERDDOCCollaborationsPage();
		nerdCRSTCollaborationsPage = new NERDCRSTCollaborationsPage();

		seerExistingAccountPage = new SEERExistingAccountPage();
		seerDataAccessRequestPageStepsImpl = new SEERDataAccessRequestPageStepsImpl();

		/*custom Business App */
		nativeViewLoginImpl = new NativeViewLoginImpl();
		nativeViewHomePage = new NativeViewHomePage();
		aligningExpectationsPage = new AligningExpectationsPage();
		eidpDashboardPage = new DashboardPage();
		eidpCommonPage = new CommonPage();
		nihLoginPage = new LoginPage();
		eidpBasePage = new BasePage();
		eidpLoginStepImpl = new EIDPLoginStepImpl();
		aligningExpectationsStepImpl = new AlignExpectionsStepImpl();
		generalInformationPage = new GeneralInformationPage();
		searchPage = new SearchPage();
		searchStepimpl = new SearchStepImpl();
		generalInformationStepImpl = new GeneralInformationStepImpl();
		careerGoalAndActivePage = new CareerGoalAndActivePage();
		careerGoalAndActiveStepImpl = new CareerGoalAndActiveStepImpl();
		projectRelatedDeliverablePage = new ProjectRelatedDeliverablePage();
		projectRelatedDeliverableStepImpl = new ProjectRelatedDeliverableStepImpl();
		delegatePage = new DelegatePage();
		iDPAwaitingResponsePage = new IDPAwaitingResponsePage();
		traineeReviewPage = new TraineeReviewPage();
		traineeReviewStepImpl = new TraineeReviewStepsImpl();
		coPrimaryMentorPage = new CoPrimaryMentorPage();
		eidpDashboardStepImpl = new CustomBusiness.EIDP.StepsImplementation.DashboardStepImpl();
		createCRPage = new CreateCRPage();
		flowStepsImplementation = new FlowStepsImplementation();
		directSubmitterPage = new DirectSubmitterPage();
		adminFlowPage = new AdminFlowPage();
		regularUserFlowSteps = new RegularUserFlowSteps();
		branchAdminPage = new BranchAdminPage();
		regularUserFlowPage = new RegularUserFlowPage();
		/**ETD **/
		etdFlowStepsImpl = new ETDFlowStepsImpl();
		etdAdminNCIPage  = new ETDAdminNCIPage();
		etdBasePage = new ETDBasePage();
	}
}
