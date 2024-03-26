package AnalysisTools.ACT24.StepsImpl;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;

public class ACT24ResearcherStepImpl extends PageInitializer {
    public void researcherLogin (String userEmail, String userPassword){
        CommonUtils.sendKeys(act24ResearcherPortalPage.email, userEmail);
        CommonUtils.sendKeys(act24ResearcherPortalPage.password, userPassword);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.loginButton);
    }
    public void createNewStudy(String studyName, String studyDescription, String studyAbbreviation, String expectedParticipants, String recallPerParticipant, String studyStartDate, String studyEndDate){
        CommonUtils.clickOnElement(act24ResearcherPortalPage.createNewStudyLink);
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.actualFieldStudyRadioButton);
        CommonUtils.sendKeys(act24ResearcherPortalPage.studyNameTextBox, studyName);
        CommonUtils.sendKeys(act24ResearcherPortalPage.studyDescriptionTextBox, studyDescription);
        CommonUtils.sendKeys(act24ResearcherPortalPage.abbreviationTextBox, studyAbbreviation);
        CommonUtils.sendKeys(act24ResearcherPortalPage.participantCountTextBox, expectedParticipants);
        CommonUtils.sendKeys(act24ResearcherPortalPage.recallCountTextBox, recallPerParticipant);
        CommonUtils.sendKeys(act24ResearcherPortalPage.startDateTextBox, studyStartDate);
        CommonUtils.sendKeys(act24ResearcherPortalPage.endDateTextBox, studyEndDate);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.noFundingRadioButton);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.personalizedHyperLinks);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.accessAcknowledgementCheckBox);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.researcherAgreementAcceptRadioButton);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.submitButton);
    }
}