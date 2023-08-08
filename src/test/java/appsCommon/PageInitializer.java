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
import AnalysisTools.ICRP.Pages.ICRPSearchDatabasePage;
import AnalysisTools.JPSurv.Pages.JPSurvHomePage;
import AnalysisTools.LDLink.Pages.LDLinkHomePage;
import AnalysisTools.LDLink.Pages.AnalysisToolsLandingPage;
import AnalysisTools.LDLink.Pages.LDAssocPage;
import AnalysisTools.LDLink.Pages.LDExpressPage;
import AnalysisTools.PLCO.Pages.BrowsePhenotypePage;
import AnalysisTools.PLCO.Pages.ExploreGWASPage;
import AnalysisTools.PLCO.Pages.InformationPage;
import AnalysisTools.ezQTL.Pages.EZQTLAnalysesPage;
import AnalysisTools.ezQTL.Pages.EZQTLDocumentationPage;
import AnalysisTools.ezQTL.Pages.EZQTLHomePage;
import AnalysisTools.ezQTL.Pages.EZQTLPublicDataSourcePage;
import AnalysisTools.cProSite.Pages.CProSiteExplorePage;
import AnalysisTools.mSigPortal.Pages.CatalogPages;
import AnalysisTools.mSigPortal.Pages.MSigPortalHomePage;
import AnalysisTools.mSigPortal.Pages.SignatureExplorerPages;
import AnalysisTools.mSigPortal.Pages.SignatureVisualizationsPage;
import CustomBusiness.CCR.Pages.CCRApplicationPage;
import CustomBusiness.CCR.Pages.CCRDynamicXpaths;
import CustomBusiness.CCR.Pages.CCRLandingPage;
import CustomBusiness.CCR.StepsImplementation.CCRStepsImplementation;
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
import CustomBusiness.EIDP.StepsImplementation.AlignExpectionsStepImpl;
import CustomBusiness.EIDP.StepsImplementation.CareerGoalAndActiveStepImpl;
import CustomBusiness.EIDP.StepsImplementation.EIDPLoginStepImpl;
import CustomBusiness.EIDP.StepsImplementation.GeneralInformationStepImpl;
import CustomBusiness.EIDP.StepsImplementation.ProjectRelatedDeliverableStepImpl;
import CustomBusiness.EIDP.StepsImplementation.SearchStepImpl;
import CustomBusiness.ETD.Pages.ETDAdminNCIPage;
import CustomBusiness.ETD.Pages.ETDBasePage;
import CustomBusiness.ETD.StepsImplementation.ETDFlowStepsImpl;
import GrantsApps.ChangePassword.Pages.ChangePasswordPage;
import GrantsApps.ChangePassword.StepsImplementation.ChangePasswordStepsImpl;
import GrantsApps.EM.Pages.ManageI2EUsersPage;
import GrantsApps.EM.StepImplementation.EMStepsImplementation;
import ServiceNow.CHARMS.Constants.RASScreenerScenario1_Constants;
import ServiceNow.CHARMS.Pages.*;
import ServiceNow.CHARMS.ScenariosData.TestDataManagerScenario1;
import ServiceNow.CHARMS.StepsImplementation.CHARMSHomePageImp;
import ServiceNow.CHARMS.StepsImplementation.RASSurveyStepsImpl;
import ServiceNow.CHARMS.StepsImplementation.RasScreenerScenario1StepsImpl;
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
import ServiceNow.ETracking.Pages.EtrackAssetsRecords_NativeViewPage;
import ServiceNow.GCP.Pages.GCPNotifications_NativeViewPage;
import ServiceNow.ESR.Pages.NCINativeViewPage;
import ServiceNow.NERD.Pages.Covid19ActivitiesSubmissionsPage;
import ServiceNow.NERD.Pages.CreateNewSubmissionPage;
import ServiceNow.NERD.Pages.NERDCRSTCollaborationsPage;
import ServiceNow.NERD.Pages.NERDCRSTOtherAccomplishmentsPage;
import ServiceNow.NERD.Pages.NERDCRSTopAccomplishmentsPage;
import ServiceNow.NERD.Pages.NERDDOCCollaborationsPage;
import ServiceNow.NERD.Pages.NERDDynamicXPATHS;
import ServiceNow.NERD.Pages.NERDHomePage;
import ServiceNow.NERD.Pages.NERDKnowledgebasePage;
import ServiceNow.NERD.Pages.NERDOGCRAddNewEntryPage;
import ServiceNow.NERD.Pages.NERDSubmissionsPage;
import ServiceNow.NERD.Pages.NativeViewImpersonateUserPage;
import ServiceNow.NERD.Pages.NativeViewMembersOfCongressPage;
import ServiceNow.NERD.StepsImplementation.NERDLoginStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NativeViewImpersonateUser;
import ServiceNow.SCSS.Pages.OWMVacancyPage;
import ServiceNow.SCSS.Pages.StadtmanVacancyPage;
import ServiceNow.SCSS.StepsImplementation.OWMVacancyStepsImplementation;
import ServiceNow.SCSS.StepsImplementation.SCSSLoginStepsImplementation;
import ServiceNow.SCSS.StepsImplementation.StadtmanVacancyStepsImplementation;
import ServiceNow.SEER.Pages.NativeViewAccessRequestPage;
import ServiceNow.SEER.Pages.NativeViewCustomersPage;
import ServiceNow.SEER.Pages.NativeViewEmailsPage;
import ServiceNow.SEER.Pages.NativeViewSentViewPage;
import ServiceNow.SEER.Pages.SEERDataAccessRequestPage;
import ServiceNow.SEER.Pages.SEERExistingAccountPage;
import ServiceNow.SEER.Pages.SEERIncidenceDatabaseDetailsPage;
import ServiceNow.SEER.Pages.SEERLandingPage;
import ServiceNow.SEER.Pages.SEERUserRegistrationPage;
import ServiceNow.SEER.StepsImplementation.SEERDataAccessRequestPageStepsImpl;
import CustomBusiness.EIDP.StepsImplementation.TraineeReviewStepsImpl;

/**
 * This an initializer class which will initialize all pages classes. Once pages
 * class created, create an object of it here inside the constructor
 */
public class PageInitializer {

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
    public static CHARMSHomePageImp charmsHomePageImpl;
    public static ClinicalGeneticsBranchPage clinicalGeneticsBranchPage;
    public static ProbandScreenerPage probandScreenerPage;
    public static MyRASLoginPage myRASLoginPage;
    public static MyRASHomePage myRASHomePage;
    public static RASopathyQuestionnairePage rasopathyQuestionnairePage;
    public static MyRASIIQFormPage myRASIIQFormPage;
    public static RasScreenerScenario1StepsImpl rasScreenerScenario1StepsImpl;
    public static RASScreenerScenario1_Constants rASScreenerScenario1_Constants;
    public static TestAccountResetPage testAccountResetPage;
    public static MyRASStudyConsentPage myRasStudyConsentPage;
    public static CGBIIQPage cgbIIQPage;
    public static CGBIIQPages cGBIIQPages;
    public static RAS_Survey_Page rASSurveyPage;
    public static RASSurveyStepsImpl rASSurveyStepsImpl;
    public static FHQSurveyPage fHQSurveyPage;
    public static FHQSurveyPortalPage fHQSurveyPortalPage;
    public static TestDataManagerScenario1 testDataManagerScenario1;
    public static ParticipantDetailsPage participantDetailsPage;
    public static ScreenerRecordTablePage screenerRecordTablePage;

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
    public static StadtmanVacancyStepsImplementation stadtmanVacancyStepsImplementation;
    public static OWMVacancyStepsImplementation oWMVacancyStepsImplementation;
    public static SCSSLoginStepsImplementation sCCSLoginStepsImplementation;

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

    /** Analysis Tools Landing Page instances */
    public static AnalysisToolsLandingPage analysisToolsLandingPage;

    /** LDLink instances **/
    public static LDLinkHomePage ldLinkHomePage;
    public static LDAssocPage ldAssocPage;
    public static LDExpressPage ldExpressPage;

    /** ezQTL instances **/
    public static EZQTLHomePage ezQTLHomePage;
    public static EZQTLAnalysesPage ezQTLAnalysesPage;
    public static EZQTLDocumentationPage ezQTLDocumentationPage;
    public static EZQTLPublicDataSourcePage ezQTLPublicDataSourcePage;

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

        /** CHARMS Instance Variables */
        charmsNativeViewPage = new CHARMSNativeViewPage();
        testAccountResetImpl = new TestAccountResetImpl();
        charmsHomePage = new CHARMSHomePage();
        oktaLoginPage = new OKTAloginPage();
        charmsHomePageImpl = new CHARMSHomePageImp();
        clinicalGeneticsBranchPage = new ClinicalGeneticsBranchPage();
        probandScreenerPage = new ProbandScreenerPage();
        myRASLoginPage = new MyRASLoginPage();
        myRASHomePage = new MyRASHomePage();
        rasScreenerScenario1StepsImpl = new RasScreenerScenario1StepsImpl();
        rasopathyQuestionnairePage = new RASopathyQuestionnairePage();
        rASScreenerScenario1_Constants = new RASScreenerScenario1_Constants();
        testAccountResetPage = new TestAccountResetPage();
        myRasStudyConsentPage = new MyRASStudyConsentPage();
        testDataManagerScenario1 = new TestDataManagerScenario1();
        cgbIIQPage = new CGBIIQPage();
        cGBIIQPages = new CGBIIQPages();
        rASSurveyPage = new RAS_Survey_Page();
        rASSurveyStepsImpl = new RASSurveyStepsImpl();
        fHQSurveyPortalPage = new FHQSurveyPortalPage();
        fHQSurveyPage = new FHQSurveyPage();
        participantDetailsPage = new ParticipantDetailsPage();
        screenerRecordTablePage = new ScreenerRecordTablePage();
        myRASIIQFormPage = new MyRASIIQFormPage();
        ras_survey_native_view = new RAS_Survey_Native_View_Page();

        /** Melanoma and Spitzoid Tumor instances */
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
        oWMVacancyStepsImplementation = new OWMVacancyStepsImplementation();
        stadtmanVacancyStepsImplementation = new StadtmanVacancyStepsImplementation();
        sCCSLoginStepsImplementation = new SCSSLoginStepsImplementation();

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

        /** Analysis Tools Landing Page Variables **/
        analysisToolsLandingPage = new AnalysisToolsLandingPage();

        /** LDLink Instance Variables **/
        ldLinkHomePage = new LDLinkHomePage();
        ldExpressPage = new LDExpressPage();
        ldAssocPage = new LDAssocPage();

        /** ezQTL Instance Variables **/
        ezQTLHomePage = new EZQTLHomePage();
        ezQTLAnalysesPage = new EZQTLAnalysesPage();
        ezQTLDocumentationPage = new EZQTLDocumentationPage();
        ezQTLPublicDataSourcePage = new EZQTLPublicDataSourcePage();

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
