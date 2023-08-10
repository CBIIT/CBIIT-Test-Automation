package ServiceNow.SCSS.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class OWMVacancyStepsImplementation extends PageInitializer {
    public void selectOpenCloseDate(int openDate, int closeDate) {
        JavascriptUtils.scrollIntoView(owmVacancyPage.openCalendarTableInBasicVacancySection);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(owmVacancyPage.openCalendarTableInBasicVacancySection);
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(openDate));
        MiscUtils.sleep(3000);
        JavascriptUtils.scrollIntoView(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        MiscUtils.sleep(3000);
        CommonUtils.clickOnElement(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        MiscUtils.sleep(3000);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(closeDate));
        MiscUtils.sleep(3000);
    }

    public void selectPositionClassification(String position) {
        if (position.equals("Scientific Executive")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionScientificExecutive);
        } else if (position.equals("Senior Scientific Officer")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionSeniorScientificOfficer);
        } else {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionScientificDirector);
        }
    }

    public void selectOrganizationalCode(String code) {
        if (code.equals("HNC")) {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC);
        } else if (code.equals("HNC1")) {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC1);
        } else {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC14);
        }
    }

    public void clickButton(String button) {
        if (button.equals("Create vacancy")) {
            CommonUtils.waitForVisibility(owmVacancyPage.createVacancyButton);
            CommonUtils.clickOnElement(owmVacancyPage.createVacancyButton);
            MiscUtils.sleep(2000);
        } else if (button.equals("Save")) {
            CommonUtils.waitForVisibility(owmVacancyPage.saveButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveButton);
            MiscUtils.sleep(2000);
        } else {
            CommonUtils.waitForVisibility(owmVacancyPage.saveAndFinalizeButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveAndFinalizeButton);
            MiscUtils.sleep(2000);
        }
    }

    public void addChair(String person) {
        switch (person) {
            case "David Rampulla":
                CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
                CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
                CommonUtils.clickOnElement(owmVacancyPage.committeeMember(person));
                CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
                MiscUtils.sleep(2000);
                break;
        }
    }

    public void addExecutiveSecretary(String person) {
        switch (person) {
            case "Jason Levine":
                CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
                CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
                CommonUtils.clickOnElement(owmVacancyPage.committeeMember(person));
                CommonUtils.clickOnElement(owmVacancyPage.roleDropdownMemberVoting);
                CommonUtils.clickOnElement(owmVacancyPage.exeSecretaryRole);
                CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
                break;
        }
    }
}