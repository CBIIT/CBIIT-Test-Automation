package ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.Constants.NERDOGSRMemberOfCongress_Constants;
import ServiceNow.PlatformBusinessApps.NERD.Pages.NERDOGCRAddNewEntryPage;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import java.util.ArrayList;
import java.util.List;

public class NerdOGCREntryPageStepsImplementation extends PageInitializer {

    public static List<String> formPortalCongressPeopleList = new ArrayList<>();
    public static List<String> formCongressPeopleList = new ArrayList<>();

    public static void newEntrySpecialTopicDropDownValues(String DDValuePayline, String bigDataDataSharing,
                                                          String CCDI, String COVID19, String healthDisparities, String lowDoseRadiation,
                                                          String mCDEarlyDetection, String moonshot, String pediatric, String rare, String sTARAct, String survivorship) {
        String[] expectedSpecialTopicValues = {DDValuePayline, bigDataDataSharing, CCDI, COVID19, healthDisparities,
                lowDoseRadiation, mCDEarlyDetection, moonshot, pediatric, rare, sTARAct, survivorship};
        String[] actualSpecialTopicValue = new String[expectedSpecialTopicValues.length];
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopic);
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopic);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntrySpecialTopicDropDown, Keys.ENTER);
        MiscUtils.sleep(1000);
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

    public static void newEntryOGCRContentTypeDropDownValues(String none, String billSummaryText, String biography, String brainBrief, String cACR,
                                                             String formalCorrespondence, String gAOOIG, String hearingBriefingVisitSummary, String informalCorrespondence, String preparatoryDocument,
                                                             String presentationLegislativeUpdate, String qFR, String significantItem, String technicalAssistance, String other) {
        String[] expectedOGCRContentTypeValues = {none, billSummaryText, biography, brainBrief, cACR,
                formalCorrespondence, gAOOIG, hearingBriefingVisitSummary, informalCorrespondence, preparatoryDocument,
                presentationLegislativeUpdate, qFR, significantItem, technicalAssistance, other};
        String[] actualOGCRContentTypeValue = new String[expectedOGCRContentTypeValues.length];
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentType);
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentType);
        CommonUtils.waitForClickability(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentTypeDropDown);
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryOGCRContentTypeDropDown);
        MiscUtils.sleep(1000);
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

    public static void clicksTheDropDownFilter(String memberOfCongress) {
        MiscUtils.sleep(5000);
        CommonUtils.assertTrue(
                nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilter.getText()
                        .contentEquals(memberOfCongress));
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilter);
        JavascriptUtils.scrollDown(2000);
        CucumberLogUtils.logScreenshot();
    }

    public static void newEntryMemberOfCongressInfoDropDownValues() throws TestingException {
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, Keys.ENTER);
        MiscUtils.sleep(1000);
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
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, NERDOGSRMemberOfCongress_Constants.NERD_OGCR_MEMBER_OF_CONGRESS_SENATOR);
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressSerchDropDown);
        JavascriptUtils.scrollIntoView(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressSerchDropDown);
        CommonUtils.clickOnElement(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressSerchDropDown);
        CommonUtils.assertEquals(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 1).getText(), (NERDOGSRMemberOfCongress_Constants.NERD_OGCR_MEMBER_OF_CONGRESS_REPRESENTATIVE));
        CommonUtils.assertEquals(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 2).getText(), (NERDOGSRMemberOfCongress_Constants.NERD_OGCR_MEMBER_OF_CONGRESS_SENATOR));
        JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 1));
        JavascriptUtils.drawBlueBorder(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressSelectedDropDown("" + 2));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
    }

    public static void allDropDownFieldOptionsAreSameAsTheAddNewEntryFormPageForTheField() throws TestingException {
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrPortalPageMemberOfCongressFilter);
        MiscUtils.sleep(1000);
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
        MiscUtils.sleep(1000);
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
//            CucumberLogUtils.logScreenshot();
        }
        CucumberLogUtils.logScreenshot();
    }
}
