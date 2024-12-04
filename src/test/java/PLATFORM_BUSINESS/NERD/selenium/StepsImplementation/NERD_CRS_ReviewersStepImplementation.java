package PLATFORM_BUSINESS.NERD.selenium.StepsImplementation;

import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.Pages.NERDCRSTOtherAccomplishmentsPage;
import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.Pages.NERDKnowledgebasePage;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class NERD_CRS_ReviewersStepImplementation extends PageInitializer {

    public String topAccomplishmentsAccordion;

    /**
     * Logs in as a CRS reviewer into the NERDs CRS Knowledge Management System.
     *
     * @param crsReviewer The username of the CRS reviewer.
     */
    public static void aCRSReviewerIsLoggedIntoNERDsCRSKnowledgeManagementSystem(String crsReviewer) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(crsReviewer);
        ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.userIsOnSubmissionsPage("NERD");
    }

    /**
     * Verifies that the following checkbox options are also available:
     *
     * @param administrationTransitionMaterial              The administration transition material checkbox option.
     * @param congressionalJustification                    The congressional justification checkbox option.
     * @param hhsRequests                                   The HHS requests checkbox option.
     * @param antiHarrassmentCivilityMaterial                The anti-harassment civility material checkbox option.
     * @param donnasBlog                                    The Donna's blog checkbox option.
     * @param furloughPlanning                              The furlough planning checkbox option.
     * @param equityAndInclusionProgram                     The equity and inclusion program checkbox option.
     * @param covid19LeadershipMessages                     The COVID-19 leadership messages checkbox option.
     */
    public static void theFollowingCheckBoxOptionsAreAlsoAvailable(String administrationTransitionMaterial,
                                                                   String congressionalJustification, String hhsRequests, String antiHarrassmentCivilityMaterial,
                                                                   String donnasBlog, String furloughPlanning, String equityAndInclusionProgram,
                                                                   String covid19LeadershipMessages) {
        ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.verifyingOfOM_CheckBoxes(administrationTransitionMaterial,
                congressionalJustification, hhsRequests, antiHarrassmentCivilityMaterial, donnasBlog,
                furloughPlanning,
                equityAndInclusionProgram, covid19LeadershipMessages);
    }

    /**
     * Verifies that the following checkbox option is displayed.
     *
     * @param covid19LeadershipMessages The COVID-19 leadership messages checkbox option.
     */
    public static void theFollowingCheckBoxOptionIsDisplayed(String covid19LeadershipMessages) {
        NERDApplicationStepsImplementation.verifyingOfOM_CheckBox(covid19LeadershipMessages);
    }

    /**
     * Clicks the given special topic filter
     *
     * @param SpecialTopic The special topic to filter on.
     */
    public static void clicksTheFilter(String SpecialTopic) {
        CommonUtils.sleep(5000);
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.getText()
                        .contentEquals(SpecialTopic));
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD);
        JavascriptUtils.scrollDown(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Validates that the field options in the knowledge database page match the expected values.
     *
     * @param all                              The expected value for the 'All' field option.
     * @param bigDataDataSharing               The expected value for the 'Big Data Data Sharing' field option.
     * @param covid19                          The expected value for the 'COVID-19' field option.
     * @param communications                   The expected value for the 'Communications' field option.
     * @param earlyDetection                   The expected value for the 'Early Detection' field option.
     * @param metastatic                       The expected value for the 'Metastatic' field option.
     * @param minorityHealthHealthDisparities  The expected value for the 'Minority Health Health Disparities' field option.
     * @param moonshot                         The expected value for the 'Moonshot' field option.
     * @param partnerships                     The expected value for the 'Partnerships' field option.
     * @param pediatric                        The expected value for the 'Pediatric' field option.
     * @param rare                             The expected value for the 'Rare' field option.
     * @param reportGuidancePolicy             The expected value for the 'Report Guidance Policy' field option.
     * @param sexGenderDifferences             The expected value for the 'Sex Gender Differences' field option.
     * @param trainingWorkforceDevelopment     The expected value for the 'Training Workforce Development' field option.
     * @param womensHealth                     The expected value for the 'Women's Health' field option.
     * @param workforce                        The expected value for the 'Workforce' field option.
     */
    public static void theFieldOptionsAre(String all ,String bigDataDataSharing, String covid19, String communications, String earlyDetection,
                                          String metastatic, String minorityHealthHealthDisparities, String moonshot, String partnerships, String pediatric,
                                          String rare, String reportGuidancePolicy, String sexGenderDifferences, String trainingWorkforceDevelopment, String womensHealth, String workforce) {
        String[] expectedValues = {all, bigDataDataSharing, covid19, communications, earlyDetection,
                metastatic, minorityHealthHealthDisparities, moonshot, partnerships, pediatric, rare,
                reportGuidancePolicy, sexGenderDifferences, trainingWorkforceDevelopment, womensHealth, workforce};
        String[] actualValue = new String[expectedValues.length];
        for (int i = 0; i < actualValue.length; i++) {
            actualValue[i] = nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues.get(i)
                    .getText().trim();
            actualValue[i]=actualValue[i] .split("\\(")[0].replaceAll("&nbsp;", "").trim();
        }
        for (int j = 0; j < actualValue.length; j++) {
            JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues.get(j));
            CommonUtils.assertEquals(expectedValues[j], actualValue[j]);
        }
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to navigate a CRS reviewer to the NERD Home Page.
     *
     * @param crsReviewer The username of the CRS reviewer.
     */
    public static void aCRSReviewerIsOnTheNERDHomePage(String crsReviewer) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(crsReviewer);
        CommonUtils.sleep(1500);
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that three knowledge bases called Nerd, Rock, and Moonshot Evaluation have the expected values.
     *
     * @param nerd               The expected value for the Nerd knowledge base text.
     * @param rock               The expected value for the Rock knowledge base text.
     * @param moonshotEvaluation The expected value for the Moonshot Evaluation knowledge base text.
     */
    public static void thereAreThreeKnowledgeBasesCalledAnd(String nerd, String rock, String moonshotEvaluation) {
        CommonUtils.assertEquals(nerd, nerdHomePage.nerdKnowledgeBaseText.getText());
        CommonUtils.assertEquals(rock, nerdHomePage.rockKnowledgeBaseText.getText());
        CommonUtils.assertEquals(moonshotEvaluation,
                nerdHomePage.moonshotEvaluationKnowledgeBaseText.getText());
        JavascriptUtils.drawBlueBorder(nerdHomePage.nerdKnowledgeBaseText);
        JavascriptUtils.drawBlueBorder(nerdHomePage.rockKnowledgeBaseText);
        JavascriptUtils.drawBlueBorder(nerdHomePage.moonshotEvaluationKnowledgeBaseText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method navigates the user to the NERD Knowledge Base page.
     */
    public static void theUserClicksTheNERDKnowledgeBase() {
        nerdHomePage.nerdKnowledgeBaseText.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();;
    }

    /**
     * Redirects the user to the Knowledge Base view page and performs validation.
     */
    public static void theUserIsRedirectedToTheKnowledgeBaseViewPage() {
        CommonUtils.assertTrue(nerdKnowledgeBasePage.nerdKnowledgeBaseViewText.isDisplayed());
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();;
    }

    /**
     * Verifies the presence of a collapsed accordion with the specified header label.
     *
     * @param topAccomplishmentsAccordionText The text of the header label for the accordion.
     */
    public static void thereIsACollapsedAccordionWithRheHeaderLabeled(String topAccomplishmentsAccordionText) {
        CommonUtils.sleep(20000); //THIS SLEEP TIME IS NEEDED FOR THE NERD PAGE TO LOAD THE RECORDS
        CommonUtils.waitForVisibility(NERDKnowledgebasePage
                .dynamicAccordion(topAccomplishmentsAccordionText));
        boolean isTopAccomplishmentAccordionDisplayed = NERDKnowledgebasePage
                .dynamicAccordion(topAccomplishmentsAccordionText).getText()
                .contains(topAccomplishmentsAccordionText);
        CommonUtils.assertTrue(isTopAccomplishmentAccordionDisplayed);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The user clicks the header of the accordion to expand or collapse it.
     *
     * @param topAccomplishmentsAccordion The label of the accordion header.
     */
    public static void theUserClicksTheAccordionHeader(String topAccomplishmentsAccordion) {
        NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Expands the accordion with the provided header label.
     *
     * @param itemsPerPageAccordionText The text of the header label for the accordion to expand.
     */
    public static void theAccordionExpands(String itemsPerPageAccordionText) {
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1500);
        boolean isTopAccomplishmentsAccordionItemPerPageDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseAccordionItemsPerPageText(itemsPerPageAccordionText)
                .isDisplayed();
        CommonUtils.assertTrue(isTopAccomplishmentsAccordionItemPerPageDisplayed);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies if the list of all published records is visible.
     *
     * @param topAccomplishments The top accomplishments to verify visibility for.
     */
    public static void aListOfAllPublishedRecordsIsVisible(String topAccomplishments) {
        boolean isListForPublishedTopAccomplishmentsDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseAccordionList(topAccomplishments).isDisplayed();
        CommonUtils.assertTrue(isListForPublishedTopAccomplishmentsDisplayed);
        CucumberLogUtils.logScreenshot();;
    }

    /**
     * a CRS reviewer views the list of published records.
     *
     * @param crsReviewer                The username of the CRS reviewer.
     * @param topAccomplishmentsAccordion The label of the accordion header.
     */
    public void aCRSReviewerIsViewingTheListOfThePublished(String crsReviewer, String topAccomplishmentsAccordion) {
        this.topAccomplishmentsAccordion = topAccomplishmentsAccordion;
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(crsReviewer);
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1500);
        CucumberLogUtils.logScreenshot();
        nerdHomePage.nerdKnowledgeBaseText.click();
        CommonUtils.sleep(1500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method searches for a record with the given published article title in the NERD Knowledgebase page.
     *
     * @param publishedArticleTitle the title of the published article to search for
     */
    public void thereIsARecordCalled(String publishedArticleTitle) {
        CommonUtils.sleep(20000); //THIS SLEEP TIME IS NEEDED FOR THE NERD PAGE TO LOAD THE RECORDS
        CommonUtils.waitForVisibility(NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion));
        CommonUtils.sendKeysToElement(nerdKnowledgeBasePage.topAccomplishmentsNerdKnowledgeBaseSearchTextBox, publishedArticleTitle);
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(nerdKnowledgeBasePage.topAccomplishmentsNerdKnowledgeBaseSearchButton);
        CommonUtils.sleep(1000);
        NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(500);
        boolean isArticleDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(publishedArticleTitle)
                .getText()
                .contains(publishedArticleTitle);
        CommonUtils.assertTrue(isArticleDisplayed);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The user clicks the title of the published record in the NERD Knowledgebase page.
     *
     * @param titleOfPublishedArticle The title of the published article to click.
     */
    public static void theUserClicksTheTitleOfTheRecord(String titleOfPublishedArticle) {
        CommonUtils.sleep(5000);
        CommonUtils.waitForVisibility(NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(titleOfPublishedArticle));
        CommonUtils.clickOnElement(NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(titleOfPublishedArticle));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Redirects the user to the published article view of the record with the given title.
     *
     * @param titleOfPublishedArticle the title of the published article
     */
    public static void theUserIsRedirectedToTheArticleViewOfTheRecord(String titleOfPublishedArticle) {
        CommonUtils.switchToAnotherWindow();
        CommonUtils.sleep(1000);
        boolean isPublishedArticleDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDAccordian(titleOfPublishedArticle).getText()
                .contentEquals(titleOfPublishedArticle);
        CommonUtils.assertTrue(isPublishedArticleDisplayed);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The following fields and their associated data are visible if the Research Resource is selected above Specify Type.
     *
     * @param category                                             The category of the collaboration
     * @param pleaseSpecify                                        The text to specify more information
     * @param acronym                                              The acronym of the collaboration
     * @param fiscalYear                                           The fiscal year of the collaboration
     * @param description                                          The description of the collaboration
     * @param websiteURLs                                          The website URLs associated with the collaboration
     * @param fyTheCollaborativeActivityOriginated                 The fiscal year when the collaborative activity originated
     * @param leadDOC                                              The lead Department of Commerce (DOC) for the collaboration
     * @param otherDOCs                                            Other departments of commerce for the collaboration
     * @param poc                                                  The point of contact for the collaboration
     * @param references                                           The references for the collaboration
     * @param nihICsODCollaborators                                The NIH ICs/OD collaborators for the collaboration
     * @param hhsAgencyCollaborators                               The HHS agency collaborators for the collaboration
     * @param otherFederalAgencyCollaborators                      The other federal agency collaborators for the collaboration
     * @param tribalStateLocalGovernmentCollaborators              The tribal/state/local government collaborators for the collaboration
     * @param foreignGovernmentCollaborators                       The foreign government collaborators for the collaboration
     * @param nonGovernmentalCollaborators                         The non-governmental collaborators for the collaboration
     * @param otherCollaborators                                   Other collaborators for the collaboration
     * @param selectTypeOfCollaborativeActivity                    The type of collaborative activity
     * @param ifCommiteeIsSelectedAboveIsThisAFacaCommittee        If the committee is selected, is this a FACA committee?
     * @param isThisCollaborationRelatedToaRegulatoryActivity      Is this collaboration related to a regulatory activity?
     * @param wasNihFundingProvidedForThisActivity                 Was NIH funding provided for this activity?
     * @param productsOutputs                                      The products/outputs of the collaboration
     * @param ifResearchResourceIsSelectedAboveSpecifyType         The type of research resource to specify
     * @param nihStrategicAlignment                                The NIH strategic alignment
     * @param hhsStrategicPlanAlignment                            The HHS strategic plan alignment
     * @param author                                               The author of the collaboration
     */
    public static void theFollowingFieldsAndTheirAssociatedDataAreVisibleIfResearchResourceIsSelectedAboveSpecifyTypeNihStrategicAlignmentHhsStrategicPlanAlignmentAuthor(
            String category, String pleaseSpecify, String acronym, String fiscalYear, String description,
            String websiteURLs,
            String fyTheCollaborativeActivityOriginated, String leadDOC, String otherDOCs, String poc,
            String references,
            String nihICsODCollaborators, String hhsAgencyCollaborators,
            String otherFederalAgencyCollaborators, String tribalStateLocalGovernmentCollaborators,
            String foreignGovernmentCollaborators,
            String nonGovernmentalCollaborators, String otherCollaborators,
            String selectTypeOfCollaborativeActivity, String ifCommiteeIsSelectedAboveIsThisAFacaCommittee,
            String isThisCollaborationRelatedToaRegulatoryActivity,
            String wasNihFundingProvidedForThisActivity, String productsOutputs,
            String ifResearchResourceIsSelectedAboveSpecifyType, String nihStrategicAlignment,
            String hhsStrategicPlanAlignment, String author) {
        CucumberLogUtils.logScreenshot();
        boolean isCategoryTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsCategoryText.getText()
                .contentEquals(category);
        CommonUtils.assertTrue(isCategoryTextDisplayed);
        boolean isPleaseSpecifyTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsPleaseSpecifyText
                .getText().contentEquals(pleaseSpecify);
        CommonUtils.assertTrue(isPleaseSpecifyTextDisplayed);
        boolean isAcronymTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsAcronymText.getText()
                .contentEquals(acronym);
        CommonUtils.assertTrue(isAcronymTextDisplayed);
        boolean isFiscalYearTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsFiscalYearText
                .getText().contentEquals(fiscalYear);
        CommonUtils.assertTrue(isFiscalYearTextDisplayed);
        boolean isDescriptionTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsDescriptionText
                .getText().contentEquals(description);
        CommonUtils.assertTrue(isDescriptionTextDisplayed);
        boolean isWebsiteURLsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsWebsiteURLsText
                .getText().contentEquals(websiteURLs);
        CommonUtils.assertTrue(isWebsiteURLsTextDisplayed);
        boolean isfyTheCollaborativeActivityOriginatedTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsFYtheCollaboorativeActivityOriginatedText
                .getText().contentEquals(fyTheCollaborativeActivityOriginated);
        CommonUtils.assertTrue(isfyTheCollaborativeActivityOriginatedTextDisplayed);
        boolean isLeadDocTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsLeadDOCText.getText()
                .contentEquals(leadDOC);
        CommonUtils.assertTrue(isLeadDocTextDisplayed);
        boolean isOtherDocsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsOtherDOCsText.getText()
                .contentEquals(otherDOCs);
        CommonUtils.assertTrue(isOtherDocsTextDisplayed);
        boolean isPOCTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsPOCText.getText()
                .contentEquals(poc);
        CommonUtils.assertTrue(isPOCTextDisplayed);
        boolean isReferencesTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsReferencesText
                .getText().contentEquals(references);
        CommonUtils.assertTrue(isReferencesTextDisplayed);
        boolean isnihICsODCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsNihICsODCollaboratorsText
                .getText().contentEquals(nihICsODCollaborators);
        CommonUtils.assertTrue(isnihICsODCollaboratorsTextDisplayed);
        boolean isHHSAgencyCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsHhsAgencyCollaboratorsText
                .getText().contentEquals(hhsAgencyCollaborators);
        CommonUtils.assertTrue(isHHSAgencyCollaboratorsTextDisplayed);
        boolean isOtherFederalAgencyCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsOtherFederalAgencyCollaboratorsText
                .getText().contentEquals(otherFederalAgencyCollaborators);
        CommonUtils.assertTrue(isOtherFederalAgencyCollaboratorsTextDisplayed);
        boolean isTribalStateLocalGovernmentCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsTribalStateLocalGovernmentCollaboratorsText
                .getText().contentEquals(tribalStateLocalGovernmentCollaborators);
        CommonUtils.assertTrue(isTribalStateLocalGovernmentCollaboratorsTextDisplayed);
        boolean isForeignGovernmentCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsForeginGovernmentCollaboratorsText
                .getText().contentEquals(foreignGovernmentCollaborators);
        CommonUtils.assertTrue(isForeignGovernmentCollaboratorsTextDisplayed);
        boolean isNonGovernmentalCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsNonGovernmentalCollaboratorsText
                .getText().contentEquals(nonGovernmentalCollaborators);
        CommonUtils.assertTrue(isNonGovernmentalCollaboratorsTextDisplayed);
        boolean isOtherCollaboratorsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsOtherCollaboratorsText
                .getText().contentEquals(otherCollaborators);
        CommonUtils.assertTrue(isOtherCollaboratorsTextDisplayed);
        boolean isSelectTypeOfCollaborativeActivityTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsSelectTypeOfCollaborativeActivityText
                .getText().contentEquals(selectTypeOfCollaborativeActivity);
        CommonUtils.assertTrue(isSelectTypeOfCollaborativeActivityTextDisplayed);
        boolean isifCommiteeIsSelectedAboveIsThisAFacaCommitteeTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsIfCommitteeIsSelectedAboveIsThisAFacaCommitteeText
                .getText().contentEquals(ifCommiteeIsSelectedAboveIsThisAFacaCommittee);
        CommonUtils.assertTrue(isifCommiteeIsSelectedAboveIsThisAFacaCommitteeTextDisplayed);
        boolean isisThisCollaborationRelatedToaRegulatoryActivityTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsIsThisCollaborationRelatedToARegulatoryActivityText
                .getText().contentEquals(isThisCollaborationRelatedToaRegulatoryActivity);
        CommonUtils.assertTrue(isisThisCollaborationRelatedToaRegulatoryActivityTextDisplayed);
        boolean iswasNihFundingProvidedForThisActivityTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsWasNihFundingProvidedForThisActivityText
                .getText().contentEquals(wasNihFundingProvidedForThisActivity);
        CommonUtils.assertTrue(iswasNihFundingProvidedForThisActivityTextDisplayed);
        boolean isProductsOutputsTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsProductsOutputsText
                .getText().contentEquals(productsOutputs);
        CommonUtils.assertTrue(isProductsOutputsTextDisplayed);
        boolean isifResearchResourcesIsSelectedAboveSpecifyTypeTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsIfResearchResourceIsSelectedAboveSpecifyTypeText
                .getText().contentEquals(ifResearchResourceIsSelectedAboveSpecifyType);
        CommonUtils.assertTrue(isifResearchResourcesIsSelectedAboveSpecifyTypeTextDisplayed);
        boolean isnihStrategicAlignmentTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsNihStrategicAlignmentText
                .getText().contentEquals(nihStrategicAlignment);
        CommonUtils.assertTrue(isnihStrategicAlignmentTextDisplayed);
        boolean ishhsStrategicPlanAlignmentTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsHhsStrategicPlanAlignmentText
                .getText().contentEquals(hhsStrategicPlanAlignment);
        CommonUtils.assertTrue(ishhsStrategicPlanAlignmentTextDisplayed);
        boolean isAuthorTextDisplayed = nerdCRSTCollaborationsPage.nerdCollaborationsAuthorText.getText()
                .contentEquals(author);
        CommonUtils.assertTrue(isAuthorTextDisplayed);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Checks if the following fields and their associated data are visible for top accomplishments:
     *
     * @param category              The category of the top accomplishment
     * @param rank                  The rank of the top accomplishment
     * @param title                 The title of the top accomplishment
     * @param doc                   The document of the top accomplishment
     * @param description           The description of the top accomplishment
     * @param cancerSiteType        The cancer site type of the top accomplishment
     * @param researchType          The research type of the top accomplishment
     * @param specialTopic          The special topic of the top accomplishment
     * @param references            The references of the top accomplishment
     * @param otherReferences       The other references of the top accomplishment
     * @param collaborations        The collaborations of the top accomplishment
     * @param fiscalYear            The fiscal year of the top accomplishment
     * @param pointOfContact        The point of contact of the top accomplishment
     * @param pointOfContactEmail   The email of the point of contact of the top accomplishment
     * @param crsContact            The CRS contact of the top accomplishment
     * @param author                The author of the top accomplishment
     */
    public static void theFollowingFieldsAndTheirAssociatedDataAreVisibleForTopAccomplishments(String category,
                                                                                               String rank, String title, String doc, String description, String cancerSiteType,
                                                                                               String researchType,
                                                                                               String specialTopic, String references, String otherReferences, String collaborations,
                                                                                               String fiscalYear,
                                                                                               String pointOfContact,
                                                                                               String pointOfContactEmail, String crsContact, String author) {
        CucumberLogUtils.logScreenshot();
        boolean isCategoryDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCategoryText.getText()
                .contentEquals(category);
        CommonUtils.assertTrue(isCategoryDisplayed);
        boolean isRankDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsRankText.getText()
                .contentEquals(rank);
        CommonUtils.assertTrue(isRankDisplayed);
        boolean isTitleDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsTitleText.getText()
                .contentEquals(title);
        CommonUtils.assertTrue(isTitleDisplayed);
        boolean isDOCDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsDOCText.getText()
                .contentEquals(doc);
        CommonUtils.assertTrue(isDOCDisplayed);
        boolean isDescriptionDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsDescriptionText
                .getText()
                .contentEquals(description);
        CommonUtils.assertTrue(isDescriptionDisplayed);
        boolean isCancerSiteType = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCancerSiteTypeText
                .getText()
                .contentEquals(cancerSiteType);
        CommonUtils.assertTrue(isCancerSiteType);
        boolean isResearchType = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsResearchTypeText.getText()
                .contentEquals(researchType);
        CommonUtils.assertTrue(isResearchType);
        boolean isSpecialTopicDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSpecialTopicText
                .getText()
                .contentEquals(specialTopic);
        CommonUtils.assertTrue(isSpecialTopicDisplayed);
        JavascriptUtils.scrollIntoView(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSpecialTopicText);
        CucumberLogUtils.logScreenshot();
        boolean isReferencesDislpayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsReferencesText
                .getText()
                .contentEquals(references);
        CommonUtils.assertTrue(isReferencesDislpayed);
        boolean isOtherReferencesDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsOtherReferencesText
                .getText().contentEquals(otherReferences);
        CommonUtils.assertTrue(isOtherReferencesDisplayed);
        boolean isCollaborationsDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCollaborationsText
                .getText().contentEquals(collaborations);
        CommonUtils.assertTrue(isCollaborationsDisplayed);
        boolean isFiscalYearDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsFiscalYearText
                .getText()
                .contentEquals(fiscalYear);
        CommonUtils.assertTrue(isFiscalYearDisplayed);
        boolean isPointOfContactDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsPointOfContactText
                .getText().contentEquals(pointOfContact);
        CommonUtils.assertTrue(isPointOfContactDisplayed);
        boolean isPointOfContactEmailDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsPointOfContactEmailText
                .getText().contentEquals(pointOfContactEmail);
        CommonUtils.assertTrue(isPointOfContactEmailDisplayed);
        boolean isCRSContactDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCRSContactText
                .getText()
                .contentEquals(crsContact);
        CommonUtils.assertTrue(isCRSContactDisplayed);
        boolean isAuthorDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAuthorText.getText()
                .contentEquals(author);
        CommonUtils.assertTrue(isAuthorDisplayed);
    }

    /**
     * Verifies if the following fields and their associated data are visible for other accomplishments:
     *
     * @param category                The category of the accomplishment
     * @param doc                     The document associated with the accomplishment
     * @param otherAccomplishmentType The type of the other accomplishment
     * @param description             The description of the accomplishment
     * @param cancerSiteType          The type of the cancer site
     * @param researchType            The type of research
     * @param specialTopic            The special topic associated with the accomplishment
     * @param references              The references of the accomplishment
     * @param otherReferences         The other references of the accomplishment
     * @param collaborations          The collaborations associated with the accomplishment
     * @param fiscalYear              The fiscal year of the accomplishment
     * @param pointOfContact          The point of contact for the accomplishment
     * @param crsContact              The CRS contact for the accomplishment
     * @param author                  The author of the accomplishment
     */
    public static void theFollowingFieldsAndTheirAssociatedDataAreVisibleForOtherAccomplishments(String category, String doc, String otherAccomplishmentType, String description, String cancerSiteType,
                                                                                                 String researchType, String specialTopic, String references, String otherReferences, String collaborations,
                                                                                                 String fiscalYear, String pointOfContact, String crsContact, String author) {
        CucumberLogUtils.logScreenshot();
        boolean isCategoryDisplayed = NERDCRSTOtherAccomplishmentsPage.otherAccomplishmentsFieldName(category).getText()
                .contentEquals(category);
        CommonUtils.assertTrue(isCategoryDisplayed);
        boolean isOtherAccomplishmentTypeDisplayed = NERDCRSTOtherAccomplishmentsPage.otherAccomplishmentsFieldName(otherAccomplishmentType).getText()
                .contentEquals(otherAccomplishmentType);
        CommonUtils.assertTrue(isOtherAccomplishmentTypeDisplayed);
        boolean isDOCDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsDOCText.getText()
                .contentEquals(doc);
        CommonUtils.assertTrue(isDOCDisplayed);
        boolean isDescriptionDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsDescriptionText
                .getText()
                .contentEquals(description);
        CommonUtils.assertTrue(isDescriptionDisplayed);
        boolean isCancerSiteType = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCancerSiteTypeText
                .getText()
                .contentEquals(cancerSiteType);
        CommonUtils.assertTrue(isCancerSiteType);
        boolean isResearchType = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsResearchTypeText.getText()
                .contentEquals(researchType);
        CommonUtils.assertTrue(isResearchType);
        boolean isSpecialTopicDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSpecialTopicText
                .getText()
                .contentEquals(specialTopic);
        CommonUtils.assertTrue(isSpecialTopicDisplayed);
        JavascriptUtils.scrollIntoView(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSpecialTopicText);
        CucumberLogUtils.logScreenshot();
        boolean isReferencesDislpayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsReferencesText
                .getText()
                .contentEquals(references);
        CommonUtils.assertTrue(isReferencesDislpayed);
        boolean isOtherReferencesDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsOtherReferencesText
                .getText().contentEquals(otherReferences);
        CommonUtils.assertTrue(isOtherReferencesDisplayed);
        boolean isCollaborationsDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCollaborationsText
                .getText().contentEquals(collaborations);
        CommonUtils.assertTrue(isCollaborationsDisplayed);
        boolean isFiscalYearDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsFiscalYearText
                .getText()
                .contentEquals(fiscalYear);
        CommonUtils.assertTrue(isFiscalYearDisplayed);
        boolean isPointOfContactDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsPointOfContactText
                .getText().contentEquals(pointOfContact);
        CommonUtils.assertTrue(isPointOfContactDisplayed);
        boolean isCRSContactDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsCRSContactText
                .getText()
                .contentEquals(crsContact);
        CommonUtils.assertTrue(isCRSContactDisplayed);
        boolean isAuthorDisplayed = nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAuthorText.getText()
                .contentEquals(author);
        CommonUtils.assertTrue(isAuthorDisplayed);
    }
}