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
        } else if (position.equals("Scientific Executive")) {
            CommonUtils.clickOnElement(owmVacancyPage.positionClassificationDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.positionSeniorScientificOfficer);
        } else {
            ;
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
            ;
            CommonUtils.clickOnElement(owmVacancyPage.orgFieldDropdown);
            CommonUtils.clickOnElement(owmVacancyPage.orgHNC14);
        }
    }

    public void clickButton(String button) {
        if (button.equals("Create vacancy")) {
            CommonUtils.waitForVisibility(owmVacancyPage.createVacancyButton);
            CommonUtils.clickOnElement(owmVacancyPage.createVacancyButton);
        } else {
            CommonUtils.waitForVisibility(owmVacancyPage.saveButton);
            CommonUtils.clickOnElement(owmVacancyPage.saveButton);
        }
    }
}