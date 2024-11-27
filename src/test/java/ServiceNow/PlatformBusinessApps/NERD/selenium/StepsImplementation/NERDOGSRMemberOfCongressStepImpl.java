package ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.NERDOGSRMemberOfCongress_Constants;
import ServiceNow.PlatformBusinessApps.NERD.selenium.Pages.NERDOGCRAddNewEntryPage;
import ServiceNow.PlatformBusinessApps.NERD.selenium.Pages.NativeViewMembersOfCongressPage;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class NERDOGSRMemberOfCongressStepImpl extends PageInitializer {

    public static List<String> formCongressPeopleList = new ArrayList<>();

    /**
     * This method logs in as OGCR admin group user.
     *
     * @param oGCRUser The username of the user to log in.
     */
    public static void aUserIsInTheOgcrAdminGroup(String oGCRUser) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(oGCRUser);
        WebDriverUtils.webDriver.get(getNerdUrl());
    }

    /**
     * This method will navigate a OGSR user to the database
     *
     */
    public static void theUserGoesToTheOgcrKnowledgeBase() {
        CommonUtils.waitForVisibility(nerdHomePage.ogcrKnowledgeBaseText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nerdHomePage.ogcrKnowledgeBaseText);
    }
    /**
     * This method will navigate the OGSR new entry form
     *
     */
    public static void theOgcrUserClicksTheButton() {
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageOGCRCreateNewSubmissionLink);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageOGCRCreateNewSubmissionLink);
    }

    /**
     * This method will retrieve all Congress People from the OGSR new entry form and store them in a list
     *
     */
    public static void newEntryMemberOfCongressDropDownValues() {
        CommonUtils.waitForVisibility(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown);
        CommonUtils.sendKeys(nERDOGCRAddNewEntryPage.nerdOgcrNewEntryMemberOfCongressDropDown, Keys.ENTER);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
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
     * This method will compare the active Congress People from native view with the list of Congress People from OGCR new entry form
     *
     */
    public static void newEntryMemberOfCongressNativeViewVerification(String active) {
        CommonUtils.waitForVisibility(nativeViewImpersonateUserPage.nativeViewNameButton);
        CommonUtils.clickOnElement(nativeViewImpersonateUserPage.nativeViewNameButton);
        CommonUtils.waitForVisibility(nativeViewImpersonateUserPage.nativeViewLogOutButton);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(nativeViewImpersonateUserPage.nativeViewLogOutButton);
        CommonUtils.sleep(1000);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        if(NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.getAttribute("class").equals("sn-global-typeahead-input -global")){
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.allTab);
            NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("Members of Congress");
            CommonUtils.sleep(3000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.filterNavigationMembersOfCongress);
            CommonUtils.sleep(3000);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.sleep(2000);
        }else {
            NativeView_SideDoor_Dashboard_Page.filterNavigatorTextBox.sendKeys("Members of Congress");
            CommonUtils.sleep(3000);
            CommonUtils.clickOnElement(NativeView_SideDoor_Dashboard_Page.filterNavigationMembersOfCongress);
            CommonUtils.sleep(3000);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.sleep(2000);
        }
        CommonUtils.sleep(2000);
        CommonUtils.waitForClickability(nativeViewMembersOfCongressPage.membersOfCongressFilterIcon);
        CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongressFilterIcon);
        CommonUtils.sleep(5000);
        CommonUtils.waitForClickability(nativeViewMembersOfCongressPage.membersOfCongressActiveFiled);
        CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongressActiveFiled);
        CommonUtils.waitForVisibility(nativeViewMembersOfCongressPage.membersOfCongressActiveTextFiled);
        CommonUtils.sendKeys(nativeViewMembersOfCongressPage.membersOfCongressActiveTextFiled, active);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeys(nativeViewMembersOfCongressPage.membersOfCongressActiveTextFiled, Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongressRunButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
       while (nativeViewMembersOfCongressPage.membersOfCongresNextPageButton.isEnabled()){
             CommonUtils.sleep(1500);
             for (int jl = 2 ; jl < 21; jl++) {String actualNativeViewCongressPersonName = NativeViewMembersOfCongressPage.nativeViewCongressPersonFirstName("" + jl).getText() + " " + NativeViewMembersOfCongressPage.nativeViewCongressPersonLastName("" + jl).getText();
                 int vl = 0;
                     for (int nl = 0; nl < formCongressPeopleList.size(); nl++){
                         if(actualNativeViewCongressPersonName.equals(formCongressPeopleList.get(nl))){
                             vl++;
                         }
                     }
                     CommonUtils.assertTrue(vl == 1);
                 }
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(1000);
            CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongresNextPageButton);
            CommonUtils.sleep(1000);
           }
           boolean congressNameNumber = false;
           int j = 2;
           CommonUtils.sleep(1500);
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
           CucumberLogUtils.logScreenshot();
           CommonUtils.sleep(1000);
           CommonUtils.clickOnElement(nativeViewMembersOfCongressPage.membersOfCongresNextPageButton);
    }
}