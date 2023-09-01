package ServiceNow.ESR.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class ESRDefaultNotificationsStepsImplementation extends PageInitializer {

    public static void completeRequiredInformationForESRCreation(String projectName, String projectDescription, String federalLead, String projectLead, String businessOwner, String phoneNumber) {
        esrTicketCreationPage.phoneNumberTextBox.sendKeys(phoneNumber);
        esrTicketCreationPage.projectNameTextBoxESR.sendKeys(projectName);
        CommonUtils.selectDropDownValue(esrTicketCreationPage.itServiceAreaDropdownESR,2);
        esrTicketCreationPage.projectDescriptionESR.sendKeys(projectDescription);
        esrTicketCreationPage.businessJustificationCheckBox.click();
        esrTicketCreationPage.federalLeadTextBox.sendKeys(federalLead);
        esrTicketCreationPage.projectLeadTextBox.sendKeys(projectLead);
        esrTicketCreationPage.businessOwnerTextBox.sendKeys(businessOwner);
        MiscUtils.sleep(3000);
        esrTicketCreationPage.submitButtonForESR.click();
        CucumberLogUtils.logScreenshot();
    }

    public static void defaultNotificationConfirmation() {
        esrTicketCreationPage.linkToNewESRTicket.click();
        esrTicketCreationPage.notesTabESRTicket.click();
        CucumberLogUtils.logScreenshot();
    }

    public static void selectFirstCatalogTask() {
        esrTicketCreationPage.linkToNewESRTicket.click();
        CommonUtils.scrollIntoView(esrTicketCreationPage.catalogTaskTitle);
        esrTicketCreationPage.catalogTaskItem.click();
    }

    public static void completeFirstCatalogTaskInformation(String docText) {
        CommonUtils.selectDropDownValue(esrTicketCreationPage.approvalDropdownCatalogTask, 3);
        esrTicketCreationPage.docSelectionBox.sendKeys(docText);
        esrTicketCreationPage.getBusinessJustificationCheckBox.click();
        CommonUtils.selectDropDownValue(esrTicketCreationPage.overallPriorityDropdown, 1);
        esrTicketCreationPage.startDateButton.click();
        esrTicketCreationPage.selectPresentDate.click();
        esrTicketCreationPage.endDateButton.click();
        esrTicketCreationPage.selectPresentDate.click();
        esrTicketCreationPage.scopeTextBox.sendKeys(docText);
        esrTicketCreationPage.definitionDoneTextBox.sendKeys(docText);
        esrTicketCreationPage.risksTextBox.sendKeys(docText);
        esrTicketCreationPage.updateButton.click();
        esrTicketCreationPage.notesTabESRTicket.click();
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(3000);
    }
}
