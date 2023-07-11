package ServiceNow.NERD.StepsImplementation;

import ServiceNow.NERD.Pages.NERDOGCRAddNewEntryPage;
import ServiceNow.NERD.Pages.NativeViewMembersOfCongressPage;
import ServiceNow.NERD.Steps.HooksSteps;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;

public class NERDOGSRMemberOfCongressStepImpl extends PageInitializer {

    public static List<String> formCongressPeopleList = new ArrayList<>();

    /**
     * This method will log in a OGSR user
     *
     */
    public static void aUserIsInTheOgcrAdminGroup() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateOGCRUser();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
    }

    /**
     * This method will navigate a OGSR user to the database
     *
     */
    public static void theUserGoesToTheOgcrKnowledgeBase() {
        MiscUtils.sleep(500);
        CommonUtils.waitForVisibility(nerdHomePage.ogcrKnowledgeBaseText);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(nerdHomePage.ogcrKnowledgeBaseText);
    }
    /**
     * This method will navigate the OGSR new entry form
     *
     */
    public static void theOgcrUserClicksTheOutton() {
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageOGCRCreateNewSubmissionLink);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageOGCRCreateNewSubmissionLink);
    }

    /**
     * This method will retrieve all Congress People from the OGSR new entry form and store them in a list
     *
     */
    public static void newEntryMemberOfCongressDropDownValues() throws TestingException {
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, Keys.ENTER);
        MiscUtils.sleep(1000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        boolean congressNumber = false;
        int i = 1;
        while (!congressNumber) {
            try {
                String actualCongressPersonFirstName = NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressPersonFirstName("" + i).getText();
                String actualCongressPersonLastName = NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressPersonLasttName("" + i).getText();
                JavascriptUtils.scrollIntoView(NERDOGCRAddNewEntryPage.nerdOgsrNewEntryCongressPersonLasttName("" + i));
                i++;
                formCongressPeopleList.add(actualCongressPersonFirstName + " " + actualCongressPersonLastName);
            } catch (NoSuchElementException e) {
                congressNumber = true;
            }
        }
    }

    /**
     * This method will compare the active Congress People from native view with the list of Congress People from OGCR new entry form
     *
     */
    public static void newEntryMemberOfCongressNativeViewVerification(String active) throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        CommonUtils.waitForVisibility(nativeViewImpersonateUserPage.nativeViewNameButton);
        CommonUtils.clickOnElement(nativeViewImpersonateUserPage.nativeViewNameButton);
        CommonUtils.waitForVisibility(nativeViewImpersonateUserPage.nativeViewLogOutButton);
        CommonUtils.clickOnElement(nativeViewImpersonateUserPage.nativeViewLogOutButton);
        nativeViewLoginImpl.sideDoorAccountLogin();
        MiscUtils.sleep(1000);
        if(nativeViewEnrollementsPage.filterNavigatorIconButton.isDisplayed()){
            CommonUtils.clickOnElement(nativeViewEnrollementsPage.filterNavigatorIconButton);
            CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        }
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(500);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("Congress");
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewMembersOfCongressPage.nativeViewMembersOfCongressButton);
        JavascriptUtils.clickByJS(nativeViewMembersOfCongressPage.nativeViewMembersOfCongressButton);
        MiscUtils.sleep(1000);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewMembersOfCongressPage.membersOfCongressMenu.getText()
                .contains("Congress"));
        CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongressFilterIcon);
        MiscUtils.sleep(500);
        CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongressActiveFiled);
        CommonUtils.waitForVisibility(nativeViewMembersOfCongressPage.membersOfCongressActiveTextFiled);
        CommonUtils.sendKeys(nativeViewMembersOfCongressPage.membersOfCongressActiveTextFiled, active);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.sendKeys(nativeViewMembersOfCongressPage.membersOfCongressActiveTextFiled, Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongressRunButton);
        MiscUtils.sleep(500);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
       while (nativeViewMembersOfCongressPage.membersOfCongresNextPageButton.isEnabled()){
             MiscUtils.sleep(1500);
             for (int jl = 2 ; jl < 21; jl++) {String actualNativeViewCongressPersonName = NativeViewMembersOfCongressPage.nativeViewCongressPersonFirstName("" + jl).getText() + " " + NativeViewMembersOfCongressPage.nativeViewCongressPersonLastName("" + jl).getText();
                 int vl = 0;
                     for (int nl = 0; nl < formCongressPeopleList.size(); nl++){
                         if(actualNativeViewCongressPersonName.equals(formCongressPeopleList.get(nl))){
                             vl++;
                         }
                     }
                     CommonUtils.assertTrue(vl == 1);
                 }
            CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongresNextPageButton);
            MiscUtils.sleep(1000);
        }
           boolean congressNameNumber = false;
           int j = 2;
           MiscUtils.sleep(1500);
           while (!congressNameNumber) {
               try {
                   String actualNativeViewCongressPersonName = NativeViewMembersOfCongressPage.nativeViewCongressPersonFirstName("" + j).getText() + " " + NativeViewMembersOfCongressPage.nativeViewCongressPersonLastName("" + j).getText();
                   j++;
                   int v = 0;
                   for (int n = 0; n < formCongressPeopleList.size(); n++) {
                       if (actualNativeViewCongressPersonName.equals(formCongressPeopleList.get(n))) {
                           v++;
                       }
                   }
                   CommonUtils.assertTrue(v == 1);
               } catch (NoSuchElementException e) {
                   congressNameNumber = true;
               }
           }
           CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
           MiscUtils.sleep(1000);
           CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongresNextPageButton);
    }
}
