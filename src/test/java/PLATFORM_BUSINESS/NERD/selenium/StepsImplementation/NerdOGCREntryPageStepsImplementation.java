package PLATFORM_BUSINESS.NERD.selenium.StepsImplementation;

import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.Constants.NERDOGSRMemberOfCongress_Constants;
import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.Pages.NERDOGCRAddNewEntryPage;
import APPS_COMMON.PageInitializers.PageInitializer;
import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDOGSRMemberOfCongressStepImpl;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;

public class NerdOGCREntryPageStepsImplementation extends PageInitializer {

    public static List<String> formPortalCongressPeopleList = new ArrayList<>();
    public static List<String> formCongressPeopleList = new ArrayList<>();

    /**
     * Sets the drop-down values for the new entry special topic field and verifies the values.
     *
     * @param DDValuePayline          The value for the DDValuePayline option.
     * @param bigDataDataSharing     The value for the bigDataDataSharing option.
     * @param CCDI                            The value for the CCDI option.
     * @param COVID19                  The value for the COVID19 option.
     * @param healthDisparities The value for the healthDisparities option.
     * @param lowDoseRadiation      The value for the lowDoseRadiation option.
     * @param mCDEarlyDetection The value for the mCDEarlyDetection option.
     * @param moonshot                   The value for the moonshot option.
     * @param pediatric                     The value for the pediatric option.
     * @param rare                               The value for the rare option.
     * @param sTARAct                          The value for the sTARAct option.
     * @param survivorship                 The value for the survivorship option.
     */
    public static void newEntrySpecialTopicDropDownValues(String DDValuePayline, String bigDataDataSharing,
                                                          String CCDI, String COVID19, String healthDisparities, String lowDoseRadiation,
                                                          String mCDEarlyDetection, String moonshot, String pediatric, String rare, String sTARAct, String survivorship) {
        String[] expectedSpecialTopicValues = {DDValuePayline, bigDataDataSharing, CCDI, COVID19, healthDisparities,
                lowDoseRadiation, mCDEarlyDetection, moonshot, pediatric, rare, sTARAct, survivorship};
        String[] actualSpecialTopicValue = new String[expectedSpecialTopicValues.length];
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopic);
        CommonUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopic);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDown, Keys.ENTER);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        for (int i = 1; i < actualSpecialTopicValue.length - 1; i++) {
            actualSpecialTopicValue[i - 1] = NERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDownValues("" + i).getText();
        }
        for (int j = 1; j < actualSpecialTopicValue.length - 1; j++) {
            JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDownValues("" + j ));
            CommonUtils.assertEqualsWithMessage(expectedSpecialTopicValues[j - 1], actualSpecialTopicValue[j - 1], "Verify NERD OGCR new Entry Special Topic Drop Down Values");
        }
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Sets the drop-down values for the new entry OGCR Content Type field and verifies the values.
     *
     * @param none                          The value for the "None" option.
     * @param billSummaryText               The value for the "Bill Summary Text" option.
     * @param biography                     The value for the "Biography" option.
     * @param brainBrief                    The value for the "Brain Brief" option.
     * @param cACR                          The value for the "CACR" option.
     * @param formalCorrespondence          The value for the "Formal Correspondence" option.
     * @param gAOOIG                        The value for the "GAOOIG" option.
     * @param hearingBriefingVisitSummary   The value for the "Hearing Briefing Visit Summary" option.
     * @param informalCorrespondence        The value for the "Informal Correspondence" option.
     * @param preparatoryDocument           The value for the "Preparatory Document" option.
     * @param presentationLegislativeUpdate The value for the "Presentation Legislative Update" option.
     * @param qFR                           The value for the "QFR" option.
     * @param significantItem               The value for the "Significant Item" option.
     * @param technicalAssistance           The value for the "Technical Assistance" option.
     * @param other                         The value for the "Other" option.
     */
    public static void newEntryOGCRContentTypeDropDownValues(String none, String billSummaryText, String biography, String brainBrief, String cACR,
                                                             String formalCorrespondence, String gAOOIG, String hearingBriefingVisitSummary, String informalCorrespondence, String preparatoryDocument,
                                                             String presentationLegislativeUpdate, String qFR, String significantItem, String technicalAssistance, String other) {
        String[] expectedOGCRContentTypeValues = {none, billSummaryText, biography, brainBrief, cACR,
                formalCorrespondence, gAOOIG, hearingBriefingVisitSummary, informalCorrespondence, preparatoryDocument,
                presentationLegislativeUpdate, qFR, significantItem, technicalAssistance, other};
        String[] actualOGCRContentTypeValue = new String[expectedOGCRContentTypeValues.length];
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentType);
        CommonUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentType);
        CommonUtils.waitForClickability(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentTypeDropDown);
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentTypeDropDown);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        for (int i = 1; i < actualOGCRContentTypeValue.length - 1; i++) {
            actualOGCRContentTypeValue[i - 1] = NERDOGCRAddNewEntryPage.nerdOgcrNewEntryGCRContentTypeDropDownValues("" + i).getText();
        }
        for (int j = 1; j < actualOGCRContentTypeValue.length - 1; j++) {
            JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgcrNewEntryGCRContentTypeDropDownValues("" + j ));
            CommonUtils.assertEqualsWithMessage(expectedOGCRContentTypeValues[j - 1], actualOGCRContentTypeValue[j - 1], "Verify NERD OGCR new Entry OGCR Content Type Drop Down Values");
        }
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clicks the drop-down filter for the member of congress.
     *
     * @param memberOfCongress The value for the member of congress filter.
     */
    public static void clicksTheDropDownFilter(String memberOfCongress) {
        CommonUtils.sleep(5000);
        CommonUtils.assertTrue(
                nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilter.getText()
                        .contentEquals(memberOfCongress));
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilter);
        JavascriptUtils.scrollDown(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Sets the drop-down values for the "Member of Congress Info" field in the "Add New Entry" form page.
     * This method selects the option from the drop-down menu, retrieves the congress person's information,
     * and adds it to the congress people list.
     */
    public static void newEntryMemberOfCongressInfoDropDownValues() {
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, Keys.ENTER);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        boolean congressNumber = false;
        int i = 1;
        while (!congressNumber) {
            try {
                String actualCongressPersonInfo = NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressPersonInfo("" + i).getText();
                JavascriptUtils.scrollIntoView(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressPersonInfo("" + i));
                System.out.println(actualCongressPersonInfo);
                i++;
                formCongressPeopleList.add(actualCongressPersonInfo);
            } catch (NoSuchElementException e) {
                congressNumber = true;
            }
        }
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, Keys.ENTER);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, NERDOGSRMemberOfCongress_Constants.NERD_OGCR_MEMBER_OF_CONGRESS_SENATOR);
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressSerchDropDown);
        JavascriptUtils.scrollIntoView(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressSerchDropDown);
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressSerchDropDown);
        CommonUtils.assertEquals(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 1).getText(), (NERDOGSRMemberOfCongress_Constants.NERD_OGCR_MEMBER_OF_CONGRESS_REPRESENTATIVE));
        CommonUtils.assertEquals(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 2).getText(), (NERDOGSRMemberOfCongress_Constants.NERD_OGCR_MEMBER_OF_CONGRESS_SENATOR));
        JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 1));
        JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 2));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1000);
    }

    /**
     * This method verifies that all the drop-down field options in the "Add New Entry" form page
     * for a Member of COngress field are the same as the drop-down options in the corresponding field in the
     * portal page. It retrieves the drop-down values in both pages, compares them, and logs screenshots
     * for verification purposes.
     */
    public static void allDropDownFieldOptionsAreSameAsTheAddNewEntryFormPageForTheField() {
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilter);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        boolean congressNumber = false;
        int i = 2;
        while (!congressNumber) {
            try {
                String actualPortalCongressPersonInfo = NERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilterDropDownValues("" + i).getText();
                String[] portalCongressPerson = actualPortalCongressPersonInfo.split("\\)");
                JavascriptUtils.scrollIntoView(NERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilterDropDownValues("" + i));
                formPortalCongressPeopleList.add(portalCongressPerson[0].trim() + ")");
                System.out.println(portalCongressPerson[0].trim() + ")");
                JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilterDropDownValues("" + i));
                i++;
            } catch (NoSuchElementException e) {
                congressNumber = true;
            }
        }
        JavascriptUtils.scrollIntoView(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressSelectAll);
        CommonUtils.waitForClickability(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressSelectAll);
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressSelectAll);
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressSelectedFieldArea);
        JavascriptUtils.drawBlueBorder(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressSelectedFieldArea);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressSelectAll);
        CucumberLogUtils.logScreenshot();
        NERDOGSRMemberOfCongressStepImpl.theOgcrUserClicksTheButton();
        newEntryMemberOfCongressInfoDropDownValues();
        for(int a = 0 ; a < formPortalCongressPeopleList.size(); a++ ){
            int v = 0;
            if(formCongressPeopleList.get(a).equals(formPortalCongressPeopleList.get(a))){
                v++;
            }
            CommonUtils.assertTrue(v == 1);
            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
    }
}