package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.Covid19ActivitiesSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Constants.Other_Accomplishments_Submissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Pages.Covid19ActivitiesSubmissionsPage;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class Covid19ActivitiesSubmissionsStepImplementation extends PageInitializer {

    static String parentWindow;
    static Set<String> allCovid19SubmissionRecords = new HashSet<String>();
    public static void userIsOnTheCOVID19ActivitiesSubmissionsPage(){
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CreateNewSubmissionButton);
    }

    /**
     * This method will verify that Checkbox options are Displayed
     *
     * @param priority1ImproveFundamentalKnowledge
     * @param priority2AdvanceResearchToImproveDetection
     * @param priority3SupportToAdvanceTreatment
     * @param priority4AccelerateResearchToImprovePrevention
     * @param priority5PreventAndRedressPoorCOVID19Outcomes
     * @param other
     */
    public static void covid19StrategicPlanCheckBoxOptionsAreAlsoDisplayed(String priority1ImproveFundamentalKnowledge, String priority2AdvanceResearchToImproveDetection,
                                                                           String priority3SupportToAdvanceTreatment, String priority4AccelerateResearchToImprovePrevention,
                                                                           String priority5PreventAndRedressPoorCOVID19Outcomes, String other) {
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlanText);
        String[] expectedCheckBoxesValues = {priority1ImproveFundamentalKnowledge, priority2AdvanceResearchToImproveDetection, priority3SupportToAdvanceTreatment,
                priority4AccelerateResearchToImprovePrevention, priority5PreventAndRedressPoorCOVID19Outcomes, other};
        String[] actualCheckBoxesValue = new String[expectedCheckBoxesValues.length];
        for (int i = 0; i < actualCheckBoxesValue.length; i++) {
            actualCheckBoxesValue[i] = covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanCheckBoxes.get(i).getText();
            CommonUtils.clickOnElement(Covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanCheckBoxesSingleElement(actualCheckBoxesValue[i]));
        }
        for (int j = 0; j < actualCheckBoxesValue.length; j++) {
            JavascriptUtils.drawBlueBorder(covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanCheckBoxes.get(j));
            CommonUtils.assertEquals(expectedCheckBoxesValues[j], actualCheckBoxesValue[j]);
        }
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to perform the necessary steps for a Super User to navigate to the Knowledge Base page in the NERD application.
     */
    public static void nerduserIsOnTheKnowledgeBasePageAsSuperUser(String superUser) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(superUser);
        NERDApplicationStepsImplementation.userIsOnSubmissionsPage("NERD");
    }

    /**
     * This method submits the COVID-19 Activities submission by Super User and
     * when the user is on COVID-19 Activities Submission then Category is 'COVID-19 Activities'
     */
    public static void selectTheCovid19ActivitiesCategory() {
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.superUserCovid19CreateNewSubmissionButton);
        CommonUtils.waitForVisibility(createNewSubmissionPage.titleTextBox);
        CommonUtils.sendKeys(createNewSubmissionPage.titleTextBox, Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX);
        CommonUtils.waitForVisibility(createNewSubmissionPage.dOCDropDown);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.dOCDropDown,Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_DOC_DROP_DOWN);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nCIActivitiesDropDown, Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_NCI_ACTIVITIES_DROP_DOWN);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19SpecialTopicCovid19CheckBox);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19SpecialTopicBigDataDataSharingCheckBox);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanPriority1CheckBox);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanPriority1CheckBox);
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionSaveButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionOkButton);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCovid19Activities(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        nerdDynamicXpaths.publishedCovid19Activities(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).click();
        CommonUtils.switchToAnotherWindow();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actualCategoryValue = nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE).getText();
        CommonUtils.assertEqualsWithMessage(actualCategoryValue, Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE,
                "Verify that when the user is on COVID-19 Activities Submission then Category is 'COVID-19 Activities'");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_FILTER_VALUE));
        String actualSpecialTopicValue = nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_FILTER_VALUE).getText();
        String specialTopicFilterCovid19Value = Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_COVID19_FILTER_VALUE;
        CommonUtils.assertTrue(!actualSpecialTopicValue.equals(specialTopicFilterCovid19Value));
        CommonUtils.assertTrue(actualSpecialTopicValue.equals(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_FILTER_VALUE));
        CommonUtils.sleep(1000);
        CommonUtils.assertEqualsWithMessage(actualSpecialTopicValue,Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_FILTER_VALUE,
                "Verify that special topic filter is not 'COVID-19' for COVID-19 Activities Category submission ");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.switchToAnotherTabWindow();
        CommonUtils.sleep(2000);
        otherAccomplishmentsSubmissionBySuperUser();
    }

    /**
     * This method submits the Other Accomplishments submission by a Super User
     */
    public static void otherAccomplishmentsSubmissionBySuperUser() {
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.superUserOtherAccomplishmentsCreateNewSubmissionButton);
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.superUserOtherAccomplishmentsCreateNewSubmissionButton);
        CommonUtils.waitForVisibility(createNewSubmissionPage.titleTextBox);
        CommonUtils.sendKeys(createNewSubmissionPage.titleTextBox, Covid19ActivitiesSubmissions_Constants.OTHER_ACCOMPLISHMENTS_NEW_SUBMISSION_TITLE_TEXT_BOX);
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.nihCovid19SpecialTopicCovid19CheckBox);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19SpecialTopicCovid19CheckBox);
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionSaveButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionOkButton);
        CommonUtils.waitForVisibility(nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton);
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCovid19Activities(Covid19ActivitiesSubmissions_Constants.OTHER_ACCOMPLISHMENTS_NEW_SUBMISSION_TITLE_TEXT_BOX));
        nerdDynamicXpaths.publishedCovid19Activities(Covid19ActivitiesSubmissions_Constants.OTHER_ACCOMPLISHMENTS_NEW_SUBMISSION_TITLE_TEXT_BOX).click();
        CommonUtils.sleep(20000);
        parentWindow = webDriver.getWindowHandle();
        CommonUtils.switchToAnotherWindow();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSIONS_PAGE_CATEGORY_VALUE));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actualCategoryValue = nerdDynamicXpaths.submissionsCategory(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSIONS_PAGE_CATEGORY_VALUE).getText();
        CommonUtils.assertEqualsWithMessage(actualCategoryValue, Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSIONS_PAGE_CATEGORY_VALUE,
                "Verify that when the user is on Other Accomplishments Submission then Category is 'Other Accomplishments'");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_FILTER_VALUE));
        String actualSpecialTopicValue = nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_FILTER_VALUE).getText();
        String specialTopicFilterCovid19Value = Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_SPECIAL_TOPIC_COVID19_FILTER_VALUE;
        CommonUtils.assertTrue(actualSpecialTopicValue.equals(specialTopicFilterCovid19Value));
        CommonUtils.sleep(1000);
    }

    /**
     * This method is used to display only the Covid19 Activities category submissions results.
     */
    public static void onlyCovid19ActivitiesCategoryResultsAreDisplayed() {
        webDriver.switchTo().window(parentWindow);
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(covid19ActivitiesSubmissionsPage.nerdOCovid19SubmissionItemsPerPageText);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.nerdOCovid19SubmissionItemsPerPageText);
        if (nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons("8").isEnabled()){
                try {
                    for (int i = 3 ; i < 6 ; i ++){
                        for (WebElement recordOne:covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionAllRecordsList) {
                            String covidRecordsOne = recordOne.getText();
                            if (covidRecordsOne != ""){
                                allCovid19SubmissionRecords.add(covidRecordsOne);
                            }
                        }
                        String ipage = i + "";
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons(ipage));
                    }
                    while (nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons("8").isEnabled()) {
                        String pageNumberIterator = nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons("6").getText();
                        for (WebElement recordTwo:covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionAllRecordsList) {
                            String covidRecordsTwo = recordTwo.getText();
                            if (covidRecordsTwo != ""){
                                allCovid19SubmissionRecords.add(covidRecordsTwo);
                            }
                        }
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons("6"));
                        for (WebElement recordThree:covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionAllRecordsList) {
                            String covidRecordsThree = recordThree.getText();
                            if (covidRecordsThree != ""){
                                allCovid19SubmissionRecords.add(covidRecordsThree);
                            }
                        }
                        String pageNumberIteratorTwo = nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons("5").getText();
                            if (!pageNumberIterator.equals(pageNumberIteratorTwo)){
                                CucumberLogUtils.logScreenshot();
                                CommonUtils.clickOnElement(nerdDynamicXpaths.viewPublishedCovid19ActivitiesPageButtons("7"));
                                for (WebElement recordFour:covid19ActivitiesSubmissionsPage.nihCovid19CategorySubmissionAllRecordsList) {
                                    String covidRecordsFour = recordFour.getText();
                                    if (covidRecordsFour != ""){
                                        allCovid19SubmissionRecords.add(covidRecordsFour);
                                    }
                                }
                     break;
                            }
                    }
                    }catch (NoSuchElementException e) {
                }
        }
        List<String> covid19Records = new ArrayList<>();
        for (String singleCovid19SubmissionRecord:allCovid19SubmissionRecords){
            if (singleCovid19SubmissionRecord == Covid19ActivitiesSubmissions_Constants.OTHER_ACCOMPLISHMENTS_NEW_SUBMISSION_TITLE_TEXT_BOX){
                covid19Records.add(singleCovid19SubmissionRecord);
            }
        }
        CommonUtils.assertTrue(covid19Records.size() == 0);
        CucumberLogUtils.logScreenshot();
        System.out.println(allCovid19SubmissionRecords.size());
   }
}