package ServiceNow.SCSS.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class OWMVacancyStepsImplementation extends PageInitializer {
    public void selectOpenCloseDate(String openDate, String closeDate) {
        JavascriptUtils.scrollIntoView(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.waitForVisibility(owmVacancyPage.openCalendarTableInBasicVacancySection);
        CommonUtils.clickOnElement(owmVacancyPage.openCalendarTableInBasicVacancySection);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(Integer.parseInt(openDate)));
        JavascriptUtils.scrollIntoView(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        CommonUtils.waitForVisibility(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        CommonUtils.clickOnElement(owmVacancyPage.closeCalendarTableInBasicVacancySection);
        JavascriptUtils.clickByJS(owmVacancyPage.calendarDatePicker.get(Integer.parseInt(closeDate)));
    }

    public void selectPositionClassification(String position) {
        if (position.equals("Scientific Executive")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionScientificExecutive);
        } else if (position.equals("Senior Scientific Officer")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionSeniorScientificOfficer);
        } else if (position.equals("Senior Investigator")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(stadtmanVacancyPage.positionSeniorInvestigator);
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
        } else if (code.equals("HNA")) {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(stadtmanVacancyPage.orgHNA);
        } else {
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC14);
        }
    }

    public void clickButton(String button) {
        if (button.equals("Create vacancy")) {
            CommonUtils.waitForVisibility(owmVacancyPage.createVacancyButton);
            CommonUtils.clickOnElement(owmVacancyPage.createVacancyButton);
        } else if (button.equals("Save")) {
            CommonUtils.waitForVisibility(owmVacancyPage.saveButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveButton);
        } else {
            CommonUtils.waitForVisibility(owmVacancyPage.saveAndFinalizeButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveAndFinalizeButton);
        }
    }

    public void addChair(String person) {
                CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
                CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
                CommonUtils.clickOnElement(owmVacancyPage.committeeMember(person));
                CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
    }

    public void addExecutiveSecretary(String member) {
                CommonUtils.clickOnElement(owmVacancyPage.addMemberButton);
                CommonUtils.clickOnElement(owmVacancyPage.selectComMemberDropdown);
                CommonUtils.clickOnElement(owmVacancyPage.committeeMember(member));
                CommonUtils.clickOnElement(owmVacancyPage.roleDropdownMemberVoting);
                CommonUtils.clickOnElement(owmVacancyPage.exeSecretaryRole);
                CommonUtils.clickOnElement(owmVacancyPage.actionSaveButton);
    }
}