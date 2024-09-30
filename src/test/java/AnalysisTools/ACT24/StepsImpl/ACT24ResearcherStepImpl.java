package AnalysisTools.ACT24.StepsImpl;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import java.text.SimpleDateFormat;

public class ACT24ResearcherStepImpl extends PageInitializer {

    /**
     * THIS WILL LOGIN USER USING EMAIL AND PASSWORD
     * @param userEmail
     * @param userPassword
     */
    public void researcherLogin (String userEmail, String userPassword){
        CommonUtils.sendKeys(act24ResearcherPortalPage.email, userEmail);
        CommonUtils.sendKeys(act24ResearcherPortalPage.password, userPassword);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.loginButton);
    }

    /**
     * THIS CREATES A NEW STUDY AS A RESEARCHER WITH THE FOLLOWING PARAMETERS
     * @param studyName
     * @param studyDescription
     * @param studyAbbreviation
     * @param expectedParticipants
     * @param recallPerParticipant
     * @param studyStartDate
     * @param studyEndDate
     */
    public void createNewStudy(String studyName, String studyDescription, String studyAbbreviation, String expectedParticipants, String recallPerParticipant, String studyStartDate, String studyEndDate){
        String timeStamp = new SimpleDateFormat("MMdd").format(new java.util.Date());
        CommonUtils.clickOnElement(act24ResearcherPortalPage.createNewStudyLink);
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(act24ResearcherPortalPage.actualFieldStudyRadioButton);
        CommonUtils.sendKeys(act24ResearcherPortalPage.studyNameTextBox, studyName);
        CommonUtils.sendKeys(act24ResearcherPortalPage.studyDescriptionTextBox, studyDescription);
        CommonUtils.sendKeys(act24ResearcherPortalPage.abbreviationTextBox, studyAbbreviation+timeStamp);
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