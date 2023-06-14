package ServiceNow.NERD.StepsImplementation;

import ServiceNow.NERD.Constants.CRSReviewers_Constants;
import ServiceNow.NERD.Pages.NERDCRSTOtherAccomplishmentsPage;
import ServiceNow.NERD.Pages.NERDKnowledgebasePage;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NERD_CRS_ReviewersStepImplementation extends PageInitializer {

    public String topAccomplishmentsAccordion;

    public static void aCRSReviewerIsLoggedIntoNERDsCRSKnowledgeManagementSystem() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        NERDApplicationStepsImplementation.userIsOnSubmissionsPage("NERD");
    }

    public static void theFollowingCheckBoxOptionsAreAlsoAvailable(String administrationTransitionMaterial,
                                                                   String congressionalJustification, String hhsRequests, String antiHarrassmentCivilityMaterial,
                                                                   String donnasBlog, String furloughPlanning, String equityAndInclusionProgram,
                                                                   String covid19LeadershipMessages) {
        NERDApplicationStepsImplementation.verifyingOfOM_CheckBoxes(administrationTransitionMaterial,
                congressionalJustification, hhsRequests, antiHarrassmentCivilityMaterial, donnasBlog,
                furloughPlanning,
                equityAndInclusionProgram, covid19LeadershipMessages);
    }

    public static void aCRSReviewerIsOnTheNERDKnowledgeBasePage() throws TestingException {
        nerdLoginStepsImplementation.loginToNerd();
        nativeViewImpersonateUser.impersonateToCRSReviewer();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
        MiscUtils.sleep(8000);
        CucumberLogUtils.logScreenShot();
    }

    public static void clicksTheFilter(String SpecialTopic) {
        CommonUtils.assertTrue(
                nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.getText()
                        .contentEquals(SpecialTopic));
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD);
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollDown(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theFieldOptionsAre(String All, String BigdataDataSharing, String COVID19, String EarlyDetection,
                                          String Metastatic, String MinorityhealthHealthdisparities, String Moonshot, String Pediatric,
                                          String Rare,
                                          String TrainingWorkforcedevelopment, String Womenshealth) {
        MiscUtils.sleep(1000);
        String[] expectedValues = {All, BigdataDataSharing, COVID19, EarlyDetection, Metastatic,
                MinorityhealthHealthdisparities, Moonshot, Pediatric, Rare,
                TrainingWorkforcedevelopment, Womenshealth};
        String[] actualValue = new String[expectedValues.length];
        for (int i = 0; i < actualValue.length; i++) {
            actualValue[i] = nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues.get(i)
                    .getText().trim()
                    .split("\\(")[0].replaceAll("&nbsp;", "").trim();
        }
        for (int i = 0; i < actualValue.length; i++) {
            System.out.println(expectedValues[i]);
            System.out.println(actualValue[i]);
            CommonUtils.assertEquals(expectedValues[i], actualValue[i]);
        }
        MiscUtils.sleep(1000);
    }

    public static void aCRSReviewerAndEmailIOnTheNERDHomePage(String crsReviewer, String approvedEmail) throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateToAnyCRSReviewerNerd(crsReviewer, approvedEmail);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1500);
        CucumberLogUtils.logScreenShot("--- A CRS REVIEWER IS ON THE NERD HOME PAGE ---");
    }

    public static void aCRSReviewerIsOnTheNERDHomePage() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateToAnyCRSReviewerNerd(CRSReviewers_Constants.CRS_REVIEWER_NAME, CRSReviewers_Constants.CRS_REVIEWER_EMAIL);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1500);
        CucumberLogUtils.logScreenShot("--- A CRS REVIEWER IS ON THE NERD HOME PAGE ---");
    }

    public static void thereAreThreeKnowledgeBasesCalledAnd(String nerd, String rock, String moonshotEvaluation) {
        CommonUtils.assertEquals(nerd, nerdHomePage.nerdKnowledgeBaseText.getText());
        CommonUtils.assertEquals(rock, nerdHomePage.rockKnowledgeBaseText.getText());
        CommonUtils.assertEquals(moonshotEvaluation,
                nerdHomePage.moonshotEvaluationKnowledgeBaseText.getText());
        JavascriptUtils.drawBlueBorder(nerdHomePage.nerdKnowledgeBaseText);
        JavascriptUtils.drawBlueBorder(nerdHomePage.rockKnowledgeBaseText);
        JavascriptUtils.drawBlueBorder(nerdHomePage.moonshotEvaluationKnowledgeBaseText);
        CucumberLogUtils.logScreenShot(
                "--- THERE ARE THREE KNOWLEDGE BASES CALLED NERD, ROCK, and MOONSHOT EVALUTATION");
    }

    public static void theUserClicksTheNERDKnowledgeBase() {
        nerdHomePage.nerdKnowledgeBaseText.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot("--- THE USER CLICKS THE NERD KNOWLEDGE BASE ---");
    }

    public static void theUserIsRedirectedToTheKnowledgeBaseViewPage() {
        CommonUtils.assertTrue(nerdKnowledgeBasePage.nerdKnowledgeBaseViewText.isDisplayed());
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot("--- THE USER IS REDIRECTED TO THE KNOWLEDGE BASE VIEW PAGE ---");
    }

    public static void thereIsACollapsedAccordionWithRheHeaderLabeled(String topAccomplishmentsAccordionText) {
        boolean isTopAccomplishmentAccordionDisplayed = NERDKnowledgebasePage
                .dynamicAccordion(topAccomplishmentsAccordionText).getText()
                .contains(topAccomplishmentsAccordionText);
        CommonUtils.assertTrue(isTopAccomplishmentAccordionDisplayed);
        CucumberLogUtils.logScreenShot("--- THERE IS A COLLAPSED ACCORDION ---");
    }

    public static void theUserClicksTheAccordionHeader(String topAccomplishmentsAccordion) {
        NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).click();
        CucumberLogUtils.logScreenShot("--- WHEN THE USER CLICKS THE ACCORDION HEADER ---");
    }

    public static void theAccordionExpands(String itemsPerPageAccordionText) {
        CucumberLogUtils.logScreenShot();
        boolean isTopAccomplishmentsAccordionItemPerPageDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseAccordionItemsPerPageText(itemsPerPageAccordionText)
                .isDisplayed();
        CommonUtils.assertTrue(isTopAccomplishmentsAccordionItemPerPageDisplayed);
        CucumberLogUtils.logScreenShot("--- THEN THE ACCORDION EXPANDS ---");
    }

    public static void aListOfAllPublishedRecordsIsVisible(String topAccomplishments) {
        boolean isListForPublishedTopAccomplishmentsDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseAccordionList(topAccomplishments).isDisplayed();
        CommonUtils.assertTrue(isListForPublishedTopAccomplishmentsDisplayed);
        CucumberLogUtils.logScreenShot("--- AND A LIST OF ALL PUBLISHED RECORDS IS VISIBLE ---");
    }

    public void aCRSReviewerIsViewingTheListOfThePublished(String topAccomplishmentsAccordion) throws TestingException {
        this.topAccomplishmentsAccordion = topAccomplishmentsAccordion;
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateToAnyCRSReviewerNerd(CRSReviewers_Constants.CRS_REVIEWER_NAME, CRSReviewers_Constants.CRS_REVIEWER_EMAIL);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1500);
        CucumberLogUtils.logScreenShot();
        nerdHomePage.nerdKnowledgeBaseText.click();
        MiscUtils.sleep(1500);
        CucumberLogUtils.logScreenShot();
    }

    public void thereIsARecordCalled(String publishedArticleTitle) {
        CommonUtils.waitForVisibility(NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion));
        CommonUtils.sendKeysToElement(nerdKnowledgeBasePage.topAccomplishmentsNerdKnowledgeBaseSearchTextBox, publishedArticleTitle);
        MiscUtils.sleep(500);
        CommonUtils.clickOnElement(nerdKnowledgeBasePage.topAccomplishmentsNerdKnowledgeBaseSearchButton);
        MiscUtils.sleep(1000);
        System.out.println("TEXT:" + NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).getText());
        NERDKnowledgebasePage.dynamicXpathNERDKnowledgeBaseAccordion(topAccomplishmentsAccordion).click();
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(500);
        boolean isArticleDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(publishedArticleTitle)
                .getText()
                .contentEquals(publishedArticleTitle);
        CommonUtils.assertTrue(isArticleDisplayed);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserClicksTheTitleOfTheRecord(String titleOfPublishedArticle)
            throws InterruptedException {
        CommonUtils.waitForVisibility(NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(titleOfPublishedArticle));
        CommonUtils.clickOnElement(NERDKnowledgebasePage
                .dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(titleOfPublishedArticle));
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserIsRedirectedToTheArticleViewOfTheRecord(String titleOfPublishedArticle) {
        CommonUtils.switchToAnotherWindow();
        MiscUtils.sleep(1000);
        boolean isPublishedArticleDisplayed = NERDKnowledgebasePage
                .dynamicXpathNERDAccordian(titleOfPublishedArticle).getText()
                .contentEquals(titleOfPublishedArticle);
        CommonUtils.assertTrue(isPublishedArticleDisplayed);
        CucumberLogUtils.logScreenShot();
    }

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
        CucumberLogUtils.logScreenShot();
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
        CucumberLogUtils.logScreenShot();
    }

    public static void theFollowingFieldsAndTheirAssociatedDataAreVisibleForTopAccomplishments(String category,
                                                                                               String rank, String title, String doc, String description, String cancerSiteType,
                                                                                               String researchType,
                                                                                               String specialTopic, String references, String otherReferences, String collaborations,
                                                                                               String fiscalYear,
                                                                                               String pointOfContact,
                                                                                               String pointOfContactEmail, String crsContact, String author) {
        CucumberLogUtils.logScreenShot();
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
        CucumberLogUtils.logScreenShot();
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

    public static void theFollowingFieldsAndTheirAssociatedDataAreVisibleForOtherAccomplishments(String category, String doc, String otherAccomplishmentType, String description, String cancerSiteType,
                                                                                                 String researchType, String specialTopic, String references, String otherReferences, String collaborations,
                                                                                                 String fiscalYear, String pointOfContact, String crsContact, String author) {
        CucumberLogUtils.logScreenShot();
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
        CucumberLogUtils.logScreenShot();
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
