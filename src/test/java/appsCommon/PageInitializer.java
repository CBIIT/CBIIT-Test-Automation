package appsCommon;

import AnalysisTools.CEDCD.Pages.*;
import AnalysisTools.CEDCD.Steps.*;
import AnalysisTools.CEDCD.StepsImplementation.*;
import AnalysisTools.Comets2.Pages.*;
import AnalysisTools.ICRP.Pages.*;
import AnalysisTools.JPSurv.Pages.*;
import AnalysisTools.LDLink.Pages.*;
import AnalysisTools.PLCO.Pages.*;
import AnalysisTools.cProSite.Pages.*;
import AnalysisTools.mSigPortal.Pages.*;
import CustomBusiness.CCR.Pages.*;
import CustomBusiness.CCR.StepsImplementation.*;
import CustomBusiness.DCEG.Pages.*;
import CustomBusiness.DCEG.Steps.*;
import CustomBusiness.DCEG.StepsImplementation.*;
import CustomBusiness.EIDP.Pages.*;
import CustomBusiness.EIDP.Pages.BasePage;
import CustomBusiness.EIDP.StepsImplementation.*;
import CustomBusiness.ETD.Pages.*;
import CustomBusiness.ETD.StepsImplementation.*;
import GrantsApps.ChangePassword.Pages.*;
import GrantsApps.ChangePassword.StepsImplementation.*;
import GrantsApps.EM.Pages.*;
import GrantsApps.EM.StepImplementation.*;
import ServiceNow.CHARMS.Constants.*;
import ServiceNow.CHARMS.NativeView.Pages.CHARMSParticipantDetailsPage;
import ServiceNow.CHARMS.Pages.*;
import ServiceNow.CHARMS.ScenariosData.*;
import ServiceNow.CHARMS.StepsImplementation.*;
import ServiceNow.CICDBuild.Pages.*;
import ServiceNow.CICDBuild.StepsImplementation.*;
import ServiceNow.COVIDCode.Pages.*;
import ServiceNow.COVIDCode.StepsImplementation.*;
import ServiceNow.COVIDCode.StepsImplementation.DashboardStepImpl;
import ServiceNow.COVIDDash.NativeView.Pages.*;
import ServiceNow.COVIDDash.Pages.*;
import ServiceNow.COVIDDash.StepsImplementation.*;
import ServiceNow.ETracking.Pages.*;
import ServiceNow.GCP.Pages.*;
import ServiceNow.ESR.Pages.*;
import ServiceNow.NERD.Pages.*;
import ServiceNow.NERD.StepsImplementation.*;
import ServiceNow.SCSS.Pages.*;
import ServiceNow.SCSS.StepsImplementation.*;
import ServiceNow.SEER.Pages.*;
import ServiceNow.SEER.StepsImplementation.*;
import CustomBusiness.EIDP.StepsImplementation.TraineeReviewStepsImpl;
import com.nci.automation.web.WebDriverUtils;

/**
 * This an initializer class which will initialize all pages classes. Once pages
 * class created, create an object of it here inside the constructor
 */
public class PageInitializer extends WebDriverUtils {

	/** --------------- APPSCOMMON INSTANCES --------------- */
	// declare public static variables of types of all the pages
	/** iTrust instances */
	public static ITrustLoginPage iTrustloginPage;
	public static ITrustLoginPageImpl loginImpl;

	/** --------------- GRANTS INSTANCES --------------- */
	public static ChangePasswordPage changePasswordPage;
	public static ChangePasswordStepsImpl changePasswordStepsImpl;
	public static EMStepsImplementation emStepsImplementation;
	public static ManageI2EUsersPage manageI2EUsersPage;

	/** --------------- SERVICENOW INSTANCES --------------- */
	/** COVIDDash instances */
	public static COVIDHomePage covidHomePage;
	public static SubmissionsPage submissionPage;
	public static COVIDHomePageImpl covidHomePageImpl;

	/** COVIDcode instances */
	public static COVIDCodeLoginPage covidCodeLoginPage;
	public static EnrollmentQuestionnairePage covidCodeEQPage;
	public static ServicePortalEQPageImpl covidCodeEQPageImpl;
	public static FollowUpFormPage followUpFormPage;
	public static FollowUpFormPageImpl followUpFormPageImpl;
	public static COVIDCodeLoginStepsImpl covidCodeLoginStepsImpl;
	public static ServicePortalSurveyPage servicePortalSurveyPage;
	public static SignOutVerificationStepImp signOutVerificationStepImp;
	public static ServicePortalQuestionnairePage servicePortalQuestionnairePage;
	public static ServicePortalQuestionnairePageImp servicePortalQuestionnairePageImp;
	public static DashboardStepImpl dashboardStepImpl;

	/** CHARMS instances */
	public static CHARMSNativeViewPage charmsNativeViewPage;
	public static TestAccountResetImpl testAccountResetImpl;
	public static CHARMSHomePage charmsHomePage;
	public static OKTAloginPage oktaLoginPage;
	public static ClinicalGeneticsBranchPage clinicalGeneticsBranchPage;
	public static ProbandScreenerPage probandScreenerPage;
	public static MyRASLoginPage myRASLoginPage;
	public static MyRASHomePage myRASHomePage;
	public static RASopathyQuestionnairePage rasopathyQuestionnairePage;
	public static MyRASIIQFormPage myRASIIQFormPage;
	public static RasScenario1StepsImpl rasScenario1StepsImpl;
	public static RasScenario2StepsImpl rasScenario2StepsImpl;
	public static RasScenario3StepsImpl rasScenario3StepsImpl;
	public static RasScenario4StepsImpl rasScenario4StepsImpl;
	public static RAS_Screener_Constants ras_Screener_Constants;
	public static RAS_Survey_Constants ras_Survey_Constants;
	public static IIQ_Constants iiq_Constants;
	public static TestAccountResetPage testAccountResetPage;
	public static MyRASStudyConsentPage myRasStudyConsentPage;
	public static CGBIIQPage cgbIIQPage;
	public static CGBIIQPages cGBIIQPages;
	public static RAS_Survey_Page rAS_Survey_Page;
	public static RASSurveyStepsImpl rASSurveyStepsImpl;
	public static FHQSurveyPage fHQSurveyPage;
	public static FHQSurveyPortalPage fHQSurveyPortalPage;
	public static RAS_Screener_TestDataManager ras_Screener_TestDataManager;
	public static RAS_Survey_TestDataManager ras_Survey_TestDataManager;
	public static IIQ_TestDataManager iiq_TestDataManager;
	public static ParticipantDetailsPage participantDetailsPage;
	public static ReferralTablePage referralTablePage;
	public static FanconiEligibilityQuestionnairePage fanconiEligibilityQuestionnairePage;
	public static FanconiScreenerNVPage fanconiScreenerNVPage;
	public static FanconiLoginPage fanconiLoginPage;
	public static CHARMSParticipantDetailsPage cHARMSParticipantDetailsPage;
	public static FanconiEligibilityQuestionnaireStepsImpl fanconiEligibilityQuestionnaireStepsImpl;
	public static ScreenerRecordTablePage screenerRecordTablePage;
	public static MyRASSurveyPage myRASSurveyPage;
	public static RAS_Survey_Native_View_Page ras_survey_native_view;
	// Melanoma and Spitzoid Tumor instances
	public static MelanomaLoginPage melanomaLoginPage;
	public static MelanomaHomePage melanomaHomePage;
	public static MelanomaQuestionnairePage melanomaQuestionnairePage;

	/** CICDBuild instances */
	// ServiceNow DevOps instances
	public static DevOpsLoginPage devOpsLoginPage;
	public static DevOpsNativeViewPage devOpsNativeViewPage;
	public static DevOpsAutomatedBuildStepsImplementation devOpsAutomatedBuildStepsImplementation;

	/** SEER instances */
	public static SEERLandingPage seerLandingPage;
	public static SEERUserRegistrationPage seerUserRegistrationPage;
	public static SEERDataAccessRequestPage seerDataAccessRequestPage;
	public static SEERIncidenceDatabaseDetailsPage seerIncidenceDatabaseDetailsPage;
	public static SEERExistingAccountPage seerExistingAccountPage;
	public static SEERDataAccessRequestPageStepsImpl seerDataAccessRequestPageStepsImpl;

	/** NERD instances */
	public static NERDLoginStepsImplementation nerdLoginStepsImplementation;
	public static NERDSubmissionsPage nerdCrsKnowledgeDatabaseSubmissionsPage;
	public static CreateNewSubmissionPage createNewSubmissionPage;
	public static NERDDynamicXPATHS nerdDynamicXpaths;
	public static NERDHomePage nerdHomePage;
	public static NERDKnowledgebasePage nerdKnowledgeBasePage;
	public static NERDCRSTopAccomplishmentsPage nerdCRSTopAccomplishmentsPage;
	public static NERDCRSTCollaborationsPage nerdCRSTCollaborationsPage;
	public static NERDDOCCollaborationsPage nerdDOCCollaborationsPage;
	public static NERDCRSTOtherAccomplishmentsPage nerdcrstOtherAccomplishmentsPage;
	public static NERDOGCRAddNewEntryPage nERDOGCRAddNewEntryPage;
	public static Covid19ActivitiesSubmissionsPage covid19ActivitiesSubmissionsPage;

	/** SCSS instances */
	public static OWMVacancyPage owmVacancyPage;
	public static StadtmanVacancyPage stadtmanVacancyPage;
	public static ApplicantFlowPage applicantFlowPage;
	public static StadtmanVacancyStepsImplementation stadtmanVacancyStepsImplementation;
	public static OWMVacancyStepsImplementation oWMVacancyStepsImplementation;
	public static SCSSLoginStepsImplementation sCCSLoginStepsImplementation;
	public static ApplicantFlowStepsImplementation applicantFlowStepsImplementation;

	/** eTracking instances */
	public static EtrackAssetsRecords_NativeViewPage etrackAssetsRecords_NativeViewPage;

	/** GCP instances */
	public static GCPNotifications_NativeViewPage gCPNotifications_NativeViewPage;

	/** --------------- CUSTOM BUSINESS APP INSTANCES --------------- */
	/** EIDP instances */
	public static AligningExpectationsPage aligningExpectationsPage;
	public static DashboardPage eidpDashboardPage;
	public static CommonPage eidpCommonPage;
	public static LoginPage nihLoginPage;
	public static BasePage eidpBasePage;
	public static EIDPLoginStepImpl eidpLoginStepImpl;
	public static AlignExpectionsStepImpl aligningExpectationsStepImpl;
	public static GeneralInformationPage generalInformationPage;
	public static GeneralInformationStepImpl generalInformationStepImpl;
	public static CustomBusiness.EIDP.StepsImplementation.DashboardStepImpl eidpDashboardStepImpl;
	public static SearchPage searchPage;
	public static SearchStepImpl searchStepimpl;
	public static CareerGoalAndActivePage careerGoalAndActivePage;
	public static CareerGoalAndActiveStepImpl careerGoalAndActiveStepImpl;
	public static ProjectRelatedDeliverablePage projectRelatedDeliverablePage;
	public static ProjectRelatedDeliverableStepImpl projectRelatedDeliverableStepImpl;
	public static DelegatePage delegatePage;
	public static IDPAwaitingResponsePage iDPAwaitingResponsePage;
	public static TraineeReviewPage traineeReviewPage;
	public static CoPrimaryMentorPage coPrimaryMentorPage;
	public static TraineeReviewStepsImpl traineeReviewStepsImpl;

	/** DCEG instances */
	public static CreateCRPage createCRPage;
	public static FlowStepsImplementation flowStepsImplementation;
	public static DirectSubmitterPage directSubmitterPage;
	public static AdminFlowPage adminFlowPage;
	public static RegularUserFlowSteps regularUserFlowSteps;
	public static BranchAdminPage branchAdminPage;
	public static RegularUserFlowPage regularUserFlowPage;

	/** ETD instances */
	public static ETDFlowStepsImpl etdFlowStepsImpl;
	public static ETDAdminNCIPage etdAdminNCIPage;
	public static ETDBasePage etdBasePage;

	/** --------------- ANALYSIS TOOLS INSTANCES --------------- */
	/** LDLink instances **/
	public static LDLinkHomePage ldLinkHomePage;
	public static LDLinkLandingPage ldLinkLandingPage;

	/** PLCO instances **/
	public static ExploreGWASPage exploreGWASPage;
	public static BrowsePhenotypePage browsePhenotypePage;
	public static InformationPage informationPage;

	/** CEDCD instances */
	public static CEDCDCohortPage cedcdCohortPage;
	public static CEDCDSearchCohortsPage cedcdSearchCohortsPage;
	public static CEDCDAdminPage cedcdAdminPage;
	public static CEDCDSearchFemaleCohortsStepImp cedcdSearchFemaleCohortsStepImp;
	public static CEDCDSelectAllCohortsStepImp cedcdSelectAllCohortsStepImp;
	public static CEDCDBiospecimenCountsPage cedcdBiospecimenCountsPage;
	public static CEDCDSearchCohortNewPageLayOutStepImp cedcdSearchCohortNewPageLayOutStepImp;
	public static CEDCDAlphabetizedSelectTypesStepImp cedcdAlphabetizedSelectTypesStepImp;
	public static CEDCDStartUps cedcdStartUps;
	public static CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp;
	public static CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp;
	public static CEDCD_Public_Site_Steps_Impl cedcd_public_site_steps_impl;

	/** Comets 2.0 Instances */
	public static Comets2Page comets2Page;

	/** mSigPortal Instances */
	public static SignatureVisualizationsPage signatureVisualizationsPage;
	public static MSigPortalHomePage mSigPortalHomePage;
	public static SignatureExplorerPages signatureExplorerPages;
	public static CatalogPages catalogPages;

	/** ICRP instances **/
	public static ICRPHomePage icrpHomePage;
	public static ICRPSearchDatabasePage icrpSearchDatabasePage;

	/** JPSurv instances **/
	public static JPSurvHomePage jpsurvHomePage;

	/** CProSite instances **/
	public static CProSiteExplorePage cProSiteExplorePage;

	/** CCR instances **/
	public static CCRLandingPage cCRLandingPage;
	public static CCRStepsImplementation cCRStepsImplementation;
	public static CCRDynamicXpaths cCRDynamicXpaths;
	public static CCRApplicationPage cCRApplicationPage;

	/** ESR INSTANCES */
	public static NCINativeViewPage nciNativeViewPage;

	/** --------------- NATIVE VIEW INSTANCES --------------- */
	public static NativeViewLoginImpl nativeViewLoginImpl;
	public static NativeViewHomePage nativeViewHomePage;
	public static NativeViewImpersonateUser nativeViewImpersonateUser;
	public static NativeViewImpersonateUserPage nativeViewImpersonateUserPage;
	public static NativeViewSideDoorLoginPage nativeViewSideDoorLoginPage;
	public static NativeViewEnrollmentsPage nativeViewEnrollementsPage;
	public static NativeViewEnrollmentViewPage nativeViewEnrollmentViewPage;
	public static NativeViewStepsImpl nativeViewStepsImpl;
	public static NativeViewCustomersPage nativeViewCustomersPage;
	public static NativeViewSentViewPage nativeViewSentViewPage;
	public static NativeViewAccessRequestPage nativeViewAccessRequestPage;
	public static NativeViewEmailsPage nativeViewEmailsPage;
	public static NativeViewDashboardPage nativeViewDashPage;
	public static NativeViewMembersOfCongressPage nativeViewMembersOfCongressPage;
	public static NativeViewCHARMSDashboardPage nativeViewCHARMSDashboardPage;
	public static NativeViewCHARMSParticipantDetailsPage nativeViewCHARMSParticipantDetailsPage;
	public static NativeViewCHARMSParticipantConsentPage nativeViewCHARMSParticipantConsentPage;

	public static void initializeAllPages() {
		/** --------------- APPSCOMMON INSTANCE VARIABLES --------------- */
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		loginImpl = new ITrustLoginPageImpl();

		/** --------------- SERVICENOW INSTANCE VARIABLES --------------- */
		/** COVIDDash Instance Variables */
		covidHomePage = new COVIDHomePage();
		submissionPage = new SubmissionsPage();
		covidHomePageImpl = new COVIDHomePageImpl();

		/** COVIDcode Instance Variables */
		covidCodeEQPage = new EnrollmentQuestionnairePage();
		covidCodeEQPageImpl = new ServicePortalEQPageImpl();
		covidCodeLoginPage = new COVIDCodeLoginPage();
		followUpFormPage = new FollowUpFormPage();
		followUpFormPageImpl = new FollowUpFormPageImpl();
		servicePortalSurveyPage = new ServicePortalSurveyPage();
		covidCodeLoginStepsImpl = new COVIDCodeLoginStepsImpl();
		signOutVerificationStepImp = new SignOutVerificationStepImp();
		servicePortalQuestionnairePage = new ServicePortalQuestionnairePage();
		servicePortalQuestionnairePageImp = new ServicePortalQuestionnairePageImp();
		dashboardStepImpl = new DashboardStepImpl();

		/** CHARMS Instance Variables **/
		charmsNativeViewPage = new CHARMSNativeViewPage();
		testAccountResetImpl = new TestAccountResetImpl();
		charmsHomePage = new CHARMSHomePage();
		oktaLoginPage = new OKTAloginPage();
		clinicalGeneticsBranchPage = new ClinicalGeneticsBranchPage();
		probandScreenerPage = new ProbandScreenerPage();
		myRASLoginPage = new MyRASLoginPage();
		myRASHomePage = new MyRASHomePage();
		rasScenario1StepsImpl = new RasScenario1StepsImpl();
		rasScenario2StepsImpl = new RasScenario2StepsImpl();
		rasScenario3StepsImpl = new RasScenario3StepsImpl();
		rasScenario4StepsImpl = new RasScenario4StepsImpl();
		rasopathyQuestionnairePage = new RASopathyQuestionnairePage();
		ras_Screener_Constants = new RAS_Screener_Constants();
		ras_Survey_Constants = new RAS_Survey_Constants();
		iiq_Constants = new IIQ_Constants();
		testAccountResetPage = new TestAccountResetPage();
		myRasStudyConsentPage = new MyRASStudyConsentPage();
		ras_Screener_TestDataManager = new RAS_Screener_TestDataManager();
		ras_Survey_TestDataManager = new RAS_Survey_TestDataManager();
		iiq_TestDataManager = new IIQ_TestDataManager();
		cgbIIQPage = new CGBIIQPage();
		cGBIIQPages = new CGBIIQPages();
		rAS_Survey_Page = new RAS_Survey_Page();
		rASSurveyStepsImpl = new RASSurveyStepsImpl();
		fHQSurveyPortalPage = new FHQSurveyPortalPage();
		fHQSurveyPage = new FHQSurveyPage();
		participantDetailsPage = new ParticipantDetailsPage();
		referralTablePage = new ReferralTablePage();
		fanconiLoginPage = new FanconiLoginPage();
		fanconiEligibilityQuestionnairePage = new FanconiEligibilityQuestionnairePage();
		fanconiScreenerNVPage = new FanconiScreenerNVPage();
		cHARMSParticipantDetailsPage = new CHARMSParticipantDetailsPage();
		fanconiEligibilityQuestionnaireStepsImpl = new FanconiEligibilityQuestionnaireStepsImpl();
		screenerRecordTablePage = new ScreenerRecordTablePage();
		myRASIIQFormPage = new MyRASIIQFormPage();
		ras_survey_native_view = new RAS_Survey_Native_View_Page();
		myRASSurveyPage = new MyRASSurveyPage();
		melanomaLoginPage = new MelanomaLoginPage();
		melanomaHomePage = new MelanomaHomePage();
		melanomaQuestionnairePage = new MelanomaQuestionnairePage();

		/** CICDBuild Instance Variables */
		// ServiceNow DevOps instances
		devOpsLoginPage = new DevOpsLoginPage();
		devOpsNativeViewPage = new DevOpsNativeViewPage();
		devOpsAutomatedBuildStepsImplementation = new DevOpsAutomatedBuildStepsImplementation();

		/** SEER Instance Variables */
		seerLandingPage = new SEERLandingPage();
		seerUserRegistrationPage = new SEERUserRegistrationPage();
		seerDataAccessRequestPage = new SEERDataAccessRequestPage();
		seerIncidenceDatabaseDetailsPage = new SEERIncidenceDatabaseDetailsPage();
		seerExistingAccountPage = new SEERExistingAccountPage();
		seerDataAccessRequestPageStepsImpl = new SEERDataAccessRequestPageStepsImpl();

		/** NERD Instance Variables */
		nerdLoginStepsImplementation = new NERDLoginStepsImplementation();
		nerdCrsKnowledgeDatabaseSubmissionsPage = new NERDSubmissionsPage();
		createNewSubmissionPage = new CreateNewSubmissionPage();
		nerdDynamicXpaths = new NERDDynamicXPATHS();
		nerdHomePage = new NERDHomePage();
		nerdKnowledgeBasePage = new NERDKnowledgebasePage();
		nerdCRSTopAccomplishmentsPage = new NERDCRSTopAccomplishmentsPage();
		nerdDOCCollaborationsPage = new NERDDOCCollaborationsPage();
		nerdCRSTCollaborationsPage = new NERDCRSTCollaborationsPage();
		nerdcrstOtherAccomplishmentsPage = new NERDCRSTOtherAccomplishmentsPage();
		covid19ActivitiesSubmissionsPage = new Covid19ActivitiesSubmissionsPage();
		nERDOGCRAddNewEntryPage = new NERDOGCRAddNewEntryPage();

		/** ESR INSTANCE VARIABLES */
		nciNativeViewPage = new NCINativeViewPage();

		/** SCSS Instance Variables */
		owmVacancyPage = new OWMVacancyPage();
		stadtmanVacancyPage = new StadtmanVacancyPage();
		applicantFlowPage = new ApplicantFlowPage();
		oWMVacancyStepsImplementation = new OWMVacancyStepsImplementation();
		stadtmanVacancyStepsImplementation = new StadtmanVacancyStepsImplementation();
		sCCSLoginStepsImplementation = new SCSSLoginStepsImplementation();
		applicantFlowStepsImplementation = new ApplicantFlowStepsImplementation();

		/** --------------- CUSTOM BUSINESS APP INSTANCE VARIABLES --------------- */
		/** EIDP Instance Variables */
		aligningExpectationsPage = new AligningExpectationsPage();
		eidpDashboardPage = new DashboardPage();
		eidpCommonPage = new CommonPage();
		nihLoginPage = new LoginPage();
		eidpBasePage = new BasePage();
		eidpLoginStepImpl = new EIDPLoginStepImpl();
		aligningExpectationsStepImpl = new AlignExpectionsStepImpl();
		generalInformationPage = new GeneralInformationPage();
		generalInformationStepImpl = new GeneralInformationStepImpl();
		searchPage = new SearchPage();
		eidpDashboardStepImpl = new CustomBusiness.EIDP.StepsImplementation.DashboardStepImpl();
		searchStepimpl = new SearchStepImpl();
		careerGoalAndActivePage = new CareerGoalAndActivePage();
		careerGoalAndActiveStepImpl = new CareerGoalAndActiveStepImpl();
		projectRelatedDeliverablePage = new ProjectRelatedDeliverablePage();
		projectRelatedDeliverableStepImpl = new ProjectRelatedDeliverableStepImpl();
		delegatePage = new DelegatePage();
		iDPAwaitingResponsePage = new IDPAwaitingResponsePage();
		traineeReviewPage = new TraineeReviewPage();
		coPrimaryMentorPage = new CoPrimaryMentorPage();
		traineeReviewStepsImpl = new TraineeReviewStepsImpl();

		/** DCEG Instance Variables */
		createCRPage = new CreateCRPage();
		flowStepsImplementation = new FlowStepsImplementation();
		directSubmitterPage = new DirectSubmitterPage();
		adminFlowPage = new AdminFlowPage();
		regularUserFlowSteps = new RegularUserFlowSteps();
		branchAdminPage = new BranchAdminPage();
		regularUserFlowPage = new RegularUserFlowPage();

		/** ETD Instance Variables */
		etdFlowStepsImpl = new ETDFlowStepsImpl();
		etdAdminNCIPage = new ETDAdminNCIPage();
		etdBasePage = new ETDBasePage();

		/** --------------- ANALYSIS TOOLS INSTANCE VARIABLES --------------- */
		/** LDLink Instance Variables **/
		ldLinkLandingPage = new LDLinkLandingPage();
		ldLinkHomePage = new LDLinkHomePage();

		/** PLCO Instance Variables **/
		exploreGWASPage = new ExploreGWASPage();
		browsePhenotypePage = new BrowsePhenotypePage();
		informationPage = new InformationPage();

		/** CEDCD Instance Variables */
		cedcdCohortPage = new CEDCDCohortPage();
		cedcdSearchCohortsPage = new CEDCDSearchCohortsPage();
		cedcdAdminPage = new CEDCDAdminPage();
		cedcdSearchFemaleCohortsStepImp = new CEDCDSearchFemaleCohortsStepImp();
		cedcdSelectAllCohortsStepImp = new CEDCDSelectAllCohortsStepImp();
		cedcdBiospecimenCountsPage = new CEDCDBiospecimenCountsPage();
		cedcdSearchCohortNewPageLayOutStepImp = new CEDCDSearchCohortNewPageLayOutStepImp();
		cedcdAlphabetizedSelectTypesStepImp = new CEDCDAlphabetizedSelectTypesStepImp();
		cedcdStartUps = new CEDCDStartUps();
		cedcdSearchCohortsCategoriesOfDataOfDataSortedStepImp = new CEDCDSearchCohortsCategoriesOfDataOfDataSortedStepImp();
		cedcdBiospecimenCountsAlphabeticalCancerTypeStepImp = new CEDCDBiospecimenCountsAlphabeticalCancerTypeStepImp();
		cedcd_public_site_steps_impl = new CEDCD_Public_Site_Steps_Impl();

		/** Comets 2.0 Instance Variables */
		comets2Page = new Comets2Page();

		/** mSigPortal Instance Variables */
		signatureVisualizationsPage = new SignatureVisualizationsPage();
		mSigPortalHomePage = new MSigPortalHomePage();
		signatureExplorerPages = new SignatureExplorerPages();
		catalogPages = new CatalogPages();

		/** ICRP Instance Variables **/
		icrpHomePage = new ICRPHomePage();
		icrpSearchDatabasePage = new ICRPSearchDatabasePage();

		/** JPSurv Instance Variables **/
		jpsurvHomePage = new JPSurvHomePage();

		/** CProSite Instance Variables **/
		cProSiteExplorePage = new CProSiteExplorePage();

		/** CCR Instance Variables **/
		cCRLandingPage = new CCRLandingPage();
		cCRStepsImplementation = new CCRStepsImplementation();
		cCRStepsImplementation = new CCRStepsImplementation();
		cCRDynamicXpaths = new CCRDynamicXpaths();
		cCRApplicationPage = new CCRApplicationPage();

		/** --------------- NATIVE VIEW INSTANCE VARIABLES --------------- */
		nativeViewLoginImpl = new NativeViewLoginImpl();
		nativeViewHomePage = new NativeViewHomePage();
		nativeViewImpersonateUser = new NativeViewImpersonateUser();
		nativeViewImpersonateUserPage = new NativeViewImpersonateUserPage();
		nativeViewSideDoorLoginPage = new NativeViewSideDoorLoginPage();
		nativeViewEnrollementsPage = new NativeViewEnrollmentsPage();
		nativeViewEnrollmentViewPage = new NativeViewEnrollmentViewPage();
		nativeViewCustomersPage = new NativeViewCustomersPage();
		nativeViewStepsImpl = new NativeViewStepsImpl();
		nativeViewSentViewPage = new NativeViewSentViewPage();
		nativeViewAccessRequestPage = new NativeViewAccessRequestPage();
		nativeViewEmailsPage = new NativeViewEmailsPage();
		nativeViewDashPage = new NativeViewDashboardPage();
		nativeViewMembersOfCongressPage = new NativeViewMembersOfCongressPage();
		nativeViewCHARMSDashboardPage = new NativeViewCHARMSDashboardPage();
		nativeViewCHARMSParticipantDetailsPage = new NativeViewCHARMSParticipantDetailsPage();
		nativeViewCHARMSParticipantConsentPage = new NativeViewCHARMSParticipantConsentPage();

		/** Grants ChangePassword app **/
		changePasswordPage = new ChangePasswordPage();
		changePasswordStepsImpl = new ChangePasswordStepsImpl();
		emStepsImplementation = new EMStepsImplementation();
		manageI2EUsersPage = new ManageI2EUsersPage();

		/** eTracking INSTANCE VARIABLES */
		etrackAssetsRecords_NativeViewPage = new EtrackAssetsRecords_NativeViewPage();

		/** GCP INSTANCE VARIABLES */
		gCPNotifications_NativeViewPage = new GCPNotifications_NativeViewPage();
	}
}