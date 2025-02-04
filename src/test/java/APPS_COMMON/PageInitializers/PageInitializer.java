package APPS_COMMON.PageInitializers;

import ANALYSIS_TOOLS.ACT24.pages.*;
import ANALYSIS_TOOLS.ACT24.stepsImpl.ACT24ParticipantStepImpl;
import ANALYSIS_TOOLS.ACT24.stepsImpl.ACT24ResearcherStepImpl;
import ANALYSIS_TOOLS.CometsExplorer.pages.*;
import ANALYSIS_TOOLS.CometsAnalytics.pages.*;
import ANALYSIS_TOOLS.CometsAnalytics.stepsImplementation.*;
import ANALYSIS_TOOLS.GDSTracking.pages.*;
import ANALYSIS_TOOLS.GWASExplorer.pages.*;
import ANALYSIS_TOOLS.GWASTarget.pages.*;
import ANALYSIS_TOOLS.ICRP.pages.*;
import ANALYSIS_TOOLS.JPSurv.stepsImplementations.JPSurvHomePageStepImp;
import ANALYSIS_TOOLS.ezQTL.pages.*;
import ANALYSIS_TOOLS.cProSite.pages.*;
import ANALYSIS_TOOLS.CEDCD.pages.*;
import ANALYSIS_TOOLS.CEDCD.steps.*;
import ANALYSIS_TOOLS.CEDCD.stepsImplementation.*;
import ANALYSIS_TOOLS.JPSurv.pages.*;
import ANALYSIS_TOOLS.LDLink.pages.*;
import ANALYSIS_TOOLS.MCAExplorer.pages.MCAExplorerPage;
import ANALYSIS_TOOLS.MCAExplorer.stepsImplementations.MCAExplorerStepImp;
import ANALYSIS_TOOLS.ThreeDVizSNP.pages.ThreeDVizSNPPage;
import ANALYSIS_TOOLS.mSigPortal.pages.*;
import ANALYSIS_TOOLS.scAtlas.pages.SCAtlasCohortsPage;
import ANALYSIS_TOOLS.scAtlas.pages.SCAtlasHomePage;
import CHARMS.scenariosData.*;
import CUSTOM_BUSINESS.CCR.pages.*;
import CUSTOM_BUSINESS.CCR.stepsImplementation.*;
import CUSTOM_BUSINESS.DCEG.pages.*;
import CUSTOM_BUSINESS.DCEG.steps.*;
import CUSTOM_BUSINESS.DCEG.stepsImplementation.*;
import CUSTOM_BUSINESS.EIDP.pages.*;
import CUSTOM_BUSINESS.EIDP.pages.BasePage;
import CUSTOM_BUSINESS.EIDP.stepsImplementation.*;
import CUSTOM_BUSINESS.ETD.pages.*;
import CUSTOM_BUSINESS.ETD.stepsImplementation.*;
import CUSTOM_BUSINESS.Egrants.pages.EgrantsQuickLinkAndManagementMenuPage;
import CUSTOM_BUSINESS.Egrants.pages.EgrantsSearchAndFileManagementScenariosPage;
import CUSTOM_BUSINESS.Egrants.stepsImplementation.EgrantsStepImplementation;
import GRANTS.ChangePassword.pages.*;
import GRANTS.ChangePassword.stepsImplementation.*;
import GRANTS.EM.selenium.pages.AccountDetailsPage;
import GRANTS.EM.selenium.pages.CreateNewAccountPage;
import GRANTS.EM.selenium.pages.ManageI2EUsersPage;
import GRANTS.EM.selenium.pages.ModifyAccountPage;
import GRANTS.EM.selenium.stepImplementation.EMStepsImplementation;
import ServiceNow.AwardNomination.Pages.AwardNominationPage;
import ServiceNow.AwardNomination.StepsImplementation.AwardNominationStepsImplementation;
import CHARMS.constants.*;
import CHARMS.nativeView.pages.CHARMSParticipantDetailsPage;
import CHARMS.pages.*;
import CHARMS.stepsImplementation.*;
import CHARMS.stepsImplementation.RASStudy.*;
import DEPRECATED.COVIDCode.Pages.*;
import DEPRECATED.COVIDCode.StepsImplementation.*;
import DEPRECATED.COVIDCode.StepsImplementation.DashboardStepImpl;
import DEPRECATED.COVIDDash.NativeView.Pages.*;
import DEPRECATED.COVIDDash.Pages.*;
import DEPRECATED.COVIDDash.StepsImplementation.*;
import ITSM.ESR.selenium.pages.ESRShortDescriptionPage;
import ITSM.ESR.selenium.pages.ESRTicketCreationPage;
import ITSM.ESR.selenium.pages.NCINativeViewPage;
import PLATFORM_BUSINESS.NCCR.pages.NCCRPage;
import PLATFORM_BUSINESS.NCCR.stepsImplementation.NCCRStepsImplementation;
import PLATFORM_BUSINESS.OA_Intake.pages.OAIntakePage;
import PLATFORM_BUSINESS.OA_Intake.stepsImplementation.OAIntakeStepsImplementation;
import PLATFORM_BUSINESS.ETracking.pages.EtrackAssetsRecords_NativeViewPage;
import PLATFORM_BUSINESS.CTRP_CTRO.pages.CTRPCTRO_NV_Page;
import PLATFORM_BUSINESS.GDC.pages.GDC_Workflow_NativeView_Page;
import PLATFORM_BUSINESS.GCP.pages.GCPNotifications_NativeViewPage;
import PLATFORM_BUSINESS.NERD.selenium.Pages.*;
import PLATFORM_BUSINESS.SEER.pages.*;
import PLATFORM_BUSINESS.SEER.stepsImplementation.SEERDataAccessRequestPageStepsImpl;
import CUSTOM_BUSINESS.EIDP.stepsImplementation.TraineeReviewStepsImpl;
import PLATFORM_BUSINESS.SSJ.selenium.Pages.*;
import PLATFORM_BUSINESS.SSJ.selenium.StepsImplementation.*;
import APPS_COMMON.Pages.ITrustLoginPage;
import APPS_COMMON.Pages.NativeViewHomePage;
import APPS_COMMON.Pages.ServiceNow_NCISP_Page;
import APPS_COMMON.StepsImplementation.ITrustLoginPageImpl;
import com.nci.automation.web.WebDriverUtils;

/**
 * This an initializer class which will initialize all pages classes. Once pages
 * class created, create an object of it here inside the constructor
 */
public class PageInitializer extends WebDriverUtils {

	/** --------------- APPSCOMMON INSTANCES --------------- */
	// declare public static variables of types of all the pages
	/** iTrust instances */
	public static APPS_COMMON.Pages.ITrustLoginPage iTrustloginPage;
	public static ITrustLoginPageImpl iTrustLoginPageImpl;
	public static ServiceNow_NCISP_Page serviceNow_ncisp_page;

	/** --------------- GRANTS INSTANCES --------------- */
	public static ChangePasswordPage changePasswordPage;
	public static ChangePasswordStepsImpl changePasswordStepsImpl;
	public static EMStepsImplementation emStepsImplementation;
	public static ManageI2EUsersPage manageI2EUsersPage;
	public static CreateNewAccountPage createNewAccountPage;
	public static AccountDetailsPage accountDetailsPage;
	public static ModifyAccountPage modifyAccountPage;

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
	public static RAS_Screener_Page rasopathyQuestionnairePage;
	public static MyRASIIQFormPage myRASIIQFormPage;
	public static RAS_Screener_Submissions_StepsImpl ras_screenerSubmissions_stepsImpl;
	public static RasScenario2StepsImpl rasScenario2StepsImpl;
	public static RasScenario3StepsImpl rasScenario3StepsImpl;
	public static RasScenario4StepsImpl rasScenario4StepsImpl;
	public static RAS_Scenario_Five_StepsImpl ras_scenario_five_stepsImpl;
	public static RAS_Screener_Constants ras_Screener_Constants;
	public static RAS_Survey_Constants ras_Survey_Constants;
	public static IIQ_Constants iiq_Constants;
	public static TestAccountResetPage testAccountResetPage;
	public static MyRASStudyConsentPage myRasStudyConsentPage;
	public static MyRASStudyAssentPage myRASStudyAssentPage;
	public static MyRASPhysicalActivitiesSurvey myRASPhysicalActivitiesSurvey;
	public static MyRASSmokingSurveyPage myRASSmokingSurveyPage;
	public static CGBIIQPage cgbIIQPage;
	public static CGBIIQPages cGBIIQPages;
	public static RAS_Survey_Page rAS_Survey_Page;
	public static RASSurveyStepsImpl rASSurveyStepsImpl;
	public static FHQSurveyPage fHQSurveyPage;
	public static FHQSurveyPortalPage fHQSurveyPortalPage;
	public static FHQSubmissionPage fHQSubmissionPage;
	public static FHQSubmissionStepsImpl fHQSubmissionStepsImpl;
	public static FHQConstants fHQConstants;
	public static FHQ_TestDataManager fHQ_TestDataManager;
	public static RAS_Screener_TestDataManager ras_Screener_TestDataManager;
	public static RAS_NV_Consent_Record_TestDataManager ras_NV_Consent_Record_TestDataManager;
	public static RAS_Survey_TestDataManager ras_Survey_TestDataManager;
	public static RAS_Survey_Smoking_Survey_TestDataManager ras_Survey_Smoking_Survey_TestDataManager;
	public static RAS_Physical_Activities_Survey_TestDataManager ras_Physical_Activities_Survey_TestDataManager;
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

	/** OA Intake instances */
	public static OAIntakeStepsImplementation oaIntakeStepsImplementation;
	public static OAIntakePage oaIntakePage;

	/** NCCR instances */
	public static NCCRStepsImplementation nccrStepsImplementation;
	public static NCCRPage nccrPage;

	/** AWARD NOMINATION instances */
	public static AwardNominationStepsImplementation awardNominationStepsImplementation;
	public static AwardNominationPage awardNominationPage;

	/** SEER instances */
	public static SEERLandingPage seerLandingPage;
	public static SEERUserRegistrationPage seerUserRegistrationPage;
	public static SEERDataAccessRequestPage seerDataAccessRequestPage;
	public static SEERIncidenceDatabaseDetailsPage seerIncidenceDatabaseDetailsPage;
	public static SEERExistingAccountPage seerExistingAccountPage;
	public static SEERDataAccessRequestPageStepsImpl seerDataAccessRequestPageStepsImpl;

	/** NERD instances */
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
	public static AdHoc_Data_Call_Submissions_Page adHoc_data_call_submissions_page;

	/** SSJ instances */
	public static OWMVacancyPage owmVacancyPage;
	public static UnauthenticatedApplicantPage unauthenticatedApplicantPage;
	public static StadtmanVacancyPage stadtmanVacancyPage;
	public static ApplicantFlowPage applicantFlowPage;
	public static StadtmanVacancyStepsImplementation stadtmanVacancyStepsImplementation;
	public static OWMVacancyStepsImplementation oWMVacancyStepsImplementation;
	public static SSJLoginStepsImplementation sSJLoginStepsImplementation;
	public static ApplicantFlowStepsImplementation applicantFlowStepsImplementation;
	public static UnauthenticatedApplicantFlowStepsImplementation unauthenticatedApplicantFlowStepsImplementation;

	/** eTracking instances */
	public static EtrackAssetsRecords_NativeViewPage etrackAssetsRecords_NativeViewPage;

	/** CTRP/CTRO instances */
	public static CTRPCTRO_NV_Page ctrpCTRO_NativeViewPage;

	/** GCP instances */
	public static GCPNotifications_NativeViewPage gCPNotifications_NativeViewPage;

	/** GDC instances */
	public static GDC_Workflow_NativeView_Page gDC_Workflow_NativeView_Page;

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
	public static CUSTOM_BUSINESS.EIDP.stepsImplementation.DashboardStepImpl eidpDashboardStepImpl;
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

	/** Analysis Tools Landing Page instances */
	public static AnalysisToolsLandingPage analysisToolsLandingPage;

	/** GDS Tracking instances **/
	public static GDSLoginPage gdsLoginPage;

	/** LDLink instances **/
	public static LDLinkHomePage ldLinkHomePage;
	public static LDAssocPage ldAssocPage;
	public static LDExpressPage ldExpressPage;
	public static LDLinkAPIAccessPage ldLinkAPIAccessPage;

	/** scAtlas instances **/
	public static SCAtlasHomePage scAtlasHomePage;
	public static SCAtlasCohortsPage scAtlasCohortsPage;

	/** ezQTL instances **/
	public static EZQTLHomePage ezQTLHomePage;
	public static EZQTLAnalysesPage ezQTLAnalysesPage;
	public static EZQTLDocumentationPage ezQTLDocumentationPage;
	public static EZQTLPublicDataSourcePage ezQTLPublicDataSourcePage;
	/** GWAS Explorer instances **/
	public static ExploreGWASPage exploreGWASPage;
	public static BrowsePhenotypesPage browsePhenotypesPage;
	public static GwasExplorerHomePage gwasExplorerHomePage;

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
	public static JPSurvHomePageStepImp jpsurvHomePageStepImp;

	/** CProSite instances **/
	public static CProSiteExplorePage cProSiteExplorePage;

	/** ACT24 instances **/
	public static ACT24ParticipantPortalPage act24ParticipantPortalPage;
	public static ACT24ResearcherPortalPage act24ResearcherPortalPage;
	public static ACT24ResearcherStepImpl act24ResearcherStepImpl;
	public static ACT24ParticipantStepImpl act24ParticipantStepImpl;

	/** GWAS Target instances **/
	public static GWASTargetHomePages gwasTargetHomePages;
	public static GWASTargetAnalysisPages gwasTargetAnalysisPages;

	/** CCR instances **/
	public static CCRLandingPage cCRLandingPage;
	public static CCRStepsImplementation cCRStepsImplementation;
	public static CCRDynamicXpaths cCRDynamicXpaths;
	public static CCRApplicantPage cCRApplicantPage;
	public static CCRAdminUserPage cCRAdminUserPage;

	/** ESR INSTANCES */
	public static NCINativeViewPage nciNativeViewPage;
	public static ESRTicketCreationPage esrTicketCreationPage;
	public static ESRShortDescriptionPage esrShortDescriptionPage;

	/** --------------- NATIVE VIEW INSTANCES --------------- */
	public static NativeViewHomePage nativeViewHomePage;
	public static NativeViewImpersonateUserPage nativeViewImpersonateUserPage;
	public static NativeViewEnrollmentsPage nativeViewEnrollementsPage;
	public static NativeViewEnrollmentViewPage nativeViewEnrollmentViewPage;
	public static NativeViewStepsImpl nativeViewStepsImpl;
	public static NativeViewSSJReportsPage nativeViewSSJReportsPage;
	public static NativeViewCustomersPage nativeViewCustomersPage;
	public static NativeViewSentViewPage nativeViewSentViewPage;
	public static NativeViewAccessRequestPage nativeViewAccessRequestPage;
	public static NativeViewEmailsPage nativeViewEmailsPage;
	public static NativeViewDashboardPage nativeViewDashPage;
	public static NativeViewMembersOfCongressPage nativeViewMembersOfCongressPage;
	public static NativeViewCHARMSDashboardPage nativeViewCHARMSDashboardPage;
	public static NativeViewCHARMSParticipantDetailsPage nativeViewCHARMSParticipantDetailsPage;
	public static NativeViewCHARMSParticipantConsentPage nativeViewCHARMSParticipantConsentPage;
	public static NativeViewCHARMSParticipantStudyPage nativeViewCHARMSParticipantStudyPage;
	public static NativeViewCHARMSPatientSmokingHistoryPage nativeViewCHARMSPatientSmokingHistoryPage;
	public static NativeViewCHARMSPhysicalActivitiesSurveyPage nativeViewCHARMSPhysicalActivitiesSurveyPage;
	public static NativeViewCHARMSAddNewParticipantPage nativeViewCHARMSAddNewParticipantPage;
	public static NativeViewCHARMSSubjectFlagsPage nativeViewCHARMSSubjectFlagsPage;
	public static NativeViewCGBIIQPage nativeViewCGBIIQPage;

	/** --------------- EGRANTS INSTANCES --------------- */
	public static EgrantsQuickLinkAndManagementMenuPage egrantsQuickLinkAndManagementMenuPage;
	public static EgrantsStepImplementation egrantsStepImplementation;
	public static EgrantsSearchAndFileManagementScenariosPage egrantsSearchandFileManagementScenariosPage;

	/** ------------ MCA EXPLORER INSTANCES ------------*/
	public static MCAExplorerPage mcaExplorerPage;
	public static MCAExplorerStepImp mcaExplorerStepImp;

	/** --------------- THREEDVIZSNP INSTANCES --------*/
	public static ThreeDVizSNPPage threeDVizSNPPage;

	/** ----------------- COMETS ANALYTICS INSTANCES -----*/
	public static CometsAnalyticsPage cometsAnalyticsPage;
	public static CometsAnalyticsStepImp cometsAnalyticsStepImp;

	public static void initializeAllPages() {
		/** --------------- APPSCOMMON INSTANCE VARIABLES --------------- */
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		iTrustLoginPageImpl = new ITrustLoginPageImpl();
		serviceNow_ncisp_page = new ServiceNow_NCISP_Page();

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

		/** OA Intake Instance Variables */
		oaIntakePage =  new OAIntakePage();
		oaIntakeStepsImplementation = new OAIntakeStepsImplementation();

		/** NCCR Instance Variables */
		nccrPage =  new NCCRPage();
		nccrStepsImplementation = new NCCRStepsImplementation();

		/** CHARMS Instance Variables **/
		charmsNativeViewPage = new CHARMSNativeViewPage();
		testAccountResetImpl = new TestAccountResetImpl();
		charmsHomePage = new CHARMSHomePage();
		oktaLoginPage = new OKTAloginPage();
		clinicalGeneticsBranchPage = new ClinicalGeneticsBranchPage();
		probandScreenerPage = new ProbandScreenerPage();
		myRASLoginPage = new MyRASLoginPage();
		myRASHomePage = new MyRASHomePage();
		ras_screenerSubmissions_stepsImpl = new RAS_Screener_Submissions_StepsImpl();
		rasScenario2StepsImpl = new RasScenario2StepsImpl();
		rasScenario3StepsImpl = new RasScenario3StepsImpl();
		rasScenario4StepsImpl = new RasScenario4StepsImpl();
		ras_scenario_five_stepsImpl = new RAS_Scenario_Five_StepsImpl();
		rasopathyQuestionnairePage = new RAS_Screener_Page();
		ras_Screener_Constants = new RAS_Screener_Constants();
		ras_Survey_Constants = new RAS_Survey_Constants();
		iiq_Constants = new IIQ_Constants();
		testAccountResetPage = new TestAccountResetPage();
		myRasStudyConsentPage = new MyRASStudyConsentPage();
		myRASStudyAssentPage = new MyRASStudyAssentPage();
		myRASPhysicalActivitiesSurvey = new MyRASPhysicalActivitiesSurvey();
		myRASSmokingSurveyPage = new MyRASSmokingSurveyPage();
		ras_Screener_TestDataManager = new RAS_Screener_TestDataManager();
		ras_NV_Consent_Record_TestDataManager = new RAS_NV_Consent_Record_TestDataManager();
		ras_Survey_TestDataManager = new RAS_Survey_TestDataManager();
		ras_Survey_Smoking_Survey_TestDataManager = new RAS_Survey_Smoking_Survey_TestDataManager();
		ras_Physical_Activities_Survey_TestDataManager = new RAS_Physical_Activities_Survey_TestDataManager();
		iiq_TestDataManager = new IIQ_TestDataManager();
		cgbIIQPage = new CGBIIQPage();
		cGBIIQPages = new CGBIIQPages();
		rAS_Survey_Page = new RAS_Survey_Page();
		rASSurveyStepsImpl = new RASSurveyStepsImpl();
		fHQSurveyPortalPage = new FHQSurveyPortalPage();
		fHQSurveyPage = new FHQSurveyPage();
		fHQSubmissionPage = new FHQSubmissionPage();
		fHQSubmissionStepsImpl = new FHQSubmissionStepsImpl();
		fHQ_TestDataManager = new FHQ_TestDataManager();
		fHQConstants = new FHQConstants();
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

		/** SEER Instance Variables */
		seerLandingPage = new SEERLandingPage();
		seerUserRegistrationPage = new SEERUserRegistrationPage();
		seerDataAccessRequestPage = new SEERDataAccessRequestPage();
		seerIncidenceDatabaseDetailsPage = new SEERIncidenceDatabaseDetailsPage();
		seerExistingAccountPage = new SEERExistingAccountPage();
		seerDataAccessRequestPageStepsImpl = new SEERDataAccessRequestPageStepsImpl();

		/** NERD Instance Variables */
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
		adHoc_data_call_submissions_page = new AdHoc_Data_Call_Submissions_Page();
		nERDOGCRAddNewEntryPage = new NERDOGCRAddNewEntryPage();

		/** ESR INSTANCE VARIABLES */
		nciNativeViewPage = new NCINativeViewPage();
		esrTicketCreationPage = new ESRTicketCreationPage();
		esrShortDescriptionPage = new ESRShortDescriptionPage();

		/** SSJ Instance Variables */
		owmVacancyPage = new OWMVacancyPage();
		stadtmanVacancyPage = new StadtmanVacancyPage();
		applicantFlowPage = new ApplicantFlowPage();
		unauthenticatedApplicantPage = new UnauthenticatedApplicantPage();
		oWMVacancyStepsImplementation = new OWMVacancyStepsImplementation();
		stadtmanVacancyStepsImplementation = new StadtmanVacancyStepsImplementation();
		sSJLoginStepsImplementation = new SSJLoginStepsImplementation();
		applicantFlowStepsImplementation = new ApplicantFlowStepsImplementation();
		unauthenticatedApplicantFlowStepsImplementation = new UnauthenticatedApplicantFlowStepsImplementation();

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
		eidpDashboardStepImpl = new CUSTOM_BUSINESS.EIDP.stepsImplementation.DashboardStepImpl();
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
		ldLinkHomePage = new LDLinkHomePage();

		/** --------------- ANALYSIS TOOLS INSTANCE VARIABLES --------------- */

		/** Analysis Tools Landing Page Variables **/
		analysisToolsLandingPage = new AnalysisToolsLandingPage();

		/** GDS Tracking Instance Variables **/
		gdsLoginPage = new GDSLoginPage();

		/** LDLink Instance Variables **/
		ldLinkHomePage = new LDLinkHomePage();
		ldExpressPage = new LDExpressPage();
		ldAssocPage = new LDAssocPage();
		ldLinkAPIAccessPage = new LDLinkAPIAccessPage();

		/** scAtlas Instance Variables **/
		scAtlasHomePage = new SCAtlasHomePage();
		scAtlasCohortsPage = new SCAtlasCohortsPage();

		/** ezQTL Instance Variables **/
		ezQTLHomePage = new EZQTLHomePage();
		ezQTLAnalysesPage = new EZQTLAnalysesPage();
		ezQTLDocumentationPage = new EZQTLDocumentationPage();
		ezQTLPublicDataSourcePage = new EZQTLPublicDataSourcePage();

		/** ACT24 Instance Variables **/
		act24ParticipantPortalPage = new ACT24ParticipantPortalPage();
		act24ResearcherPortalPage = new ACT24ResearcherPortalPage();
		act24ResearcherStepImpl = new ACT24ResearcherStepImpl();
		act24ParticipantStepImpl = new ACT24ParticipantStepImpl();

		/** GWAS Explorer Instance Variables **/
		exploreGWASPage = new ExploreGWASPage();
		browsePhenotypesPage = new BrowsePhenotypesPage();
		gwasExplorerHomePage = new GwasExplorerHomePage();

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
		jpsurvHomePageStepImp = new JPSurvHomePageStepImp();

		/** CProSite Instance Variables **/
		cProSiteExplorePage = new CProSiteExplorePage();

		/** GWS Target Instance Variables **/
		gwasTargetHomePages = new GWASTargetHomePages();
		gwasTargetAnalysisPages = new GWASTargetAnalysisPages();

		/** CCR Instance Variables **/
		cCRLandingPage = new CCRLandingPage();
		cCRStepsImplementation = new CCRStepsImplementation();
		cCRStepsImplementation = new CCRStepsImplementation();
		cCRDynamicXpaths = new CCRDynamicXpaths();
		cCRApplicantPage = new CCRApplicantPage();
		cCRAdminUserPage = new CCRAdminUserPage();

		/** --------------- NATIVE VIEW INSTANCE VARIABLES --------------- */
		nativeViewHomePage = new NativeViewHomePage();
		nativeViewImpersonateUserPage = new NativeViewImpersonateUserPage();
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
		nativeViewCHARMSParticipantStudyPage = new NativeViewCHARMSParticipantStudyPage();
		nativeViewCHARMSAddNewParticipantPage = new NativeViewCHARMSAddNewParticipantPage();
		nativeViewCHARMSPatientSmokingHistoryPage = new NativeViewCHARMSPatientSmokingHistoryPage();
		nativeViewCHARMSPhysicalActivitiesSurveyPage = new NativeViewCHARMSPhysicalActivitiesSurveyPage();
		nativeViewSSJReportsPage = new NativeViewSSJReportsPage();
		nativeViewCHARMSSubjectFlagsPage = new NativeViewCHARMSSubjectFlagsPage();
		nativeViewCGBIIQPage = new NativeViewCGBIIQPage();

		/****** GRANTS INSTANCES *******/
		/** Grants ChangePassword app **/
		changePasswordPage = new ChangePasswordPage();
		changePasswordStepsImpl = new ChangePasswordStepsImpl();
		accountDetailsPage = new AccountDetailsPage();

		/** GRANTS ENTERPRISE MAINTENANCE **/
		emStepsImplementation = new EMStepsImplementation();
		manageI2EUsersPage = new ManageI2EUsersPage();
		createNewAccountPage = new CreateNewAccountPage();
		modifyAccountPage = new ModifyAccountPage();

		/** eTracking INSTANCE VARIABLES */
		etrackAssetsRecords_NativeViewPage = new EtrackAssetsRecords_NativeViewPage();

		/** CTRP/CTRO INSTANCE VARIABLES */
		ctrpCTRO_NativeViewPage = new CTRPCTRO_NV_Page();

		/** Grants ChangePassword app **/
		changePasswordPage = new ChangePasswordPage();
		changePasswordStepsImpl = new ChangePasswordStepsImpl();
		emStepsImplementation = new EMStepsImplementation();
		manageI2EUsersPage = new ManageI2EUsersPage();

		/** eTracking INSTANCE VARIABLES */
		etrackAssetsRecords_NativeViewPage = new EtrackAssetsRecords_NativeViewPage();

		/** GCP INSTANCE VARIABLES */
		gCPNotifications_NativeViewPage = new GCPNotifications_NativeViewPage();

		/** EGRANTS INSTANCE VARIABLES */
		egrantsQuickLinkAndManagementMenuPage = new EgrantsQuickLinkAndManagementMenuPage();
		egrantsSearchandFileManagementScenariosPage = new EgrantsSearchAndFileManagementScenariosPage();
		egrantsStepImplementation = new EgrantsStepImplementation();

		/** GDC INSTANCE VARIABLES */
		gDC_Workflow_NativeView_Page = new GDC_Workflow_NativeView_Page();

		/** MCAEXPLORER INSTANCE VARIABLES */
		mcaExplorerPage = new MCAExplorerPage();
		mcaExplorerStepImp = new MCAExplorerStepImp();

		/** THREEDVIZSNP INSTANCE VARIABLES  */
		threeDVizSNPPage =  new ThreeDVizSNPPage();

		/** COMETS ANALYTICS INSTANCE VARIABLES */
		cometsAnalyticsPage = new CometsAnalyticsPage();
		cometsAnalyticsStepImp = new CometsAnalyticsStepImp();
		NativeView_SideDoor_PageInitializer.initialize_Side_Door_Pages();

		/** AWARD NOMINATION variables */
		awardNominationPage = new AwardNominationPage();
		awardNominationStepsImplementation = new AwardNominationStepsImplementation();
	}
}