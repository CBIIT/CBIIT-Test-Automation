package CustomBusiness.EIDP.StepsImplementation;

import java.util.List;

import CustomBusiness.EIDP.Steps.HooksSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;

public class SearchStepImpl extends PageInitializer {
    public String getInitiateTraineeAnotherName() {
        return searchPage.initiateTraineeAnotherName.getAttribute("value");
    }

    public void selectSearchForDropdown(String searchOption) {
        CommonUtils.waitForVisibility(searchPage.searchForDropdown);
        eidpBasePage.selectOption(searchPage.searchForDropdown, searchOption);
    }

    public void selectStatus(String statusOption, String dropDownName) {
        if (dropDownName.equalsIgnoreCase("Current IDP Status")) {
            CommonUtils.clickOnElement(searchPage.currentIDPStatusDropdown);
        } else if (dropDownName.equalsIgnoreCase("IDP Type")) {
            CommonUtils.clickOnElement(searchPage.idpType);
        } else {
            CommonUtils.clickOnElement(searchPage.currentIDPStatusDropdown);
        }
        CommonUtils.clickOnElement(searchPage.searchBoxInput);
        CommonUtils.sendKeys(searchPage.searchBoxInput,statusOption);
        CommonUtils.clickOnElement(searchPage.statusOption(statusOption));
        CommonUtils.clickOnElement(searchPage.searchButton);
    }

    public void checkTraineeWithoutIDPCheckbox() {
        CommonUtils.clickOnElement(searchPage.traineesWithoutIDPCheckbox);
    }

    public void selectClassificationType(String type) {
        CommonUtils.clickOnElement(searchPage.classificationTypeInput);
        CommonUtils.clickOnElement(searchPage.classificationType(type));
        CommonUtils.clickOnElement(searchPage.trainneLastName);
        CommonUtils.clickOnElement(searchPage.searchButton);
    }

    public void selectActiveCompletedIDP() throws Exception {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(searchPage.advancedSearchResults);
        Boolean isSelected = false;
        while (!isSelected) {
            if (searchPage.activeButtons.size() > 0) {
                CommonUtils.clickOnElement(searchPage.activeButtons.get(0));
                isSelected = true;
            } else {
                searchPage.nextButton.click();
                MiscUtils.sleep(3000);
            }
        }
    }

    public void selectReleaseHoldIDP() {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(searchPage.advancedSearchResults);
        Boolean isSelected = false;
        while (!isSelected) {
            if (searchPage.holdIDPActiveButtons.size() > 0) {
                CommonUtils.clickOnElement(searchPage.holdIDPActiveButtons.get(0));
                isSelected = true;
            } else {
                if (searchPage.nextButton.isEnabled()) {
                    CommonUtils.waitForClickability(searchPage.nextButton);
                    searchPage.nextButton.click();
                    MiscUtils.sleep(3000);
                }
            }
        }
    }

    public void selectCancelIDP() {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(searchPage.advancedSearchResults);
        Boolean isSelected = false;
        while (!isSelected) {
            if (searchPage.cancelIDPActiveButtons.size() > 0) {
                CommonUtils.clickOnElement(searchPage.cancelIDPActiveButtons.get(0));
                isSelected = true;
            } else {
                if (searchPage.nextButton.isEnabled()) {
                    searchPage.nextButton.click();
                    MiscUtils.sleep(5000);
                }
            }
        }
    }

    public void selectUndoCancelIDP() {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(searchPage.advancedSearchResults);
        Boolean isSelected = false;
        while (!isSelected) {
            if (searchPage.undoIDPActiveButtons.size() > 0) {
                CommonUtils.clickOnElement(searchPage.undoIDPActiveButtons.get(0));
                isSelected = true;
            } else {
                if (searchPage.nextButton.isEnabled()) {
                    searchPage.nextButton.click();
                    MiscUtils.sleep(5000);
                }
            }
        }
    }

    public void selectExistSurveyIDP() {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(searchPage.advancedSearchResults);
        Boolean isSelected = false;
        while (!isSelected) {
            if (searchPage.exitSurveyIDPActiveButtons.size() > 0) {
                CommonUtils.clickOnElement(searchPage.exitSurveyIDPActiveButtons.get(0));
                isSelected = true;
            } else {
                if (searchPage.nextButton.isEnabled()) {
                    searchPage.nextButton.click();
                    MiscUtils.sleep(5000);
                }
            }
        }
    }

    public String getPrimaryMentorNameFromHoldConformationWindow() {
        return WebDriverUtils.webDriver.findElement(By.cssSelector("#primaryMentorInfo a")).getText();
    }

    public String getTrainneeNameFromHoldConfirmationWindow() {
        return WebDriverUtils.webDriver.findElement(By.cssSelector(".modal.modal-lg.fade.in .traineeDetails > a"))
                .getText();
    }

    public String getTraineeeNameFromCancelIdpConformationWindow() {
        return WebDriverUtils.webDriver.findElement(By.cssSelector("#cancelModalUserInfo")).getText();
    }

    public String getTrainneNameFromReviseIDPConfirmationPopUp() {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='bootbox-body']/b[1]")).getText();
    }

    public String getTraineeeNameFromUndoCancelIdpConformationWindow() {
        return WebDriverUtils.webDriver.findElement(By.cssSelector("#undoCancelModalUserInfo")).getText();
    }

    public void enterReleaseHoldComments() {
        WebDriverUtils.webDriver.findElement(By.id("releaseHoldComments")).sendKeys("Release hold comment");
    }

    public void enterCancelIdpComments(String comments) {
        WebDriverUtils.webDriver.findElement(By.id("cancellationComment")).sendKeys(comments);
    }

    public void enterUndoCancelIdpComments(String comments) {
        WebDriverUtils.webDriver.findElement(By.id("undoCancellationComment")).sendKeys(comments);
    }

    public void clickOnUndoCancelYesButton() {
        WebDriverUtils.webDriver.findElement(By.id("btnUndoCancelModalOK")).click();
    }

    public void clickOnReleaseHoldOkbutton() {
        WebDriverUtils.webDriver.findElement(By.id("release-hold-button")).click();
    }

    public void selectActiveTraineeNHGRI() throws Exception {

        Thread.sleep(8000);
        List<WebElement> searchResults = WebDriverUtils.webDriver.findElement(By.id("advanced_search_results"))
                .findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        WebElement buttonEl;
        Boolean isSelected = false;
        while (true) {
            for (int i = 0; i < searchResults.size(); i++) {
                buttonEl = searchResults.get(i).findElement(By.tagName("button"));
                if (buttonEl.isEnabled()) {
                    SharedData.traineeName = searchResults.get(i).findElement(By.tagName("a")).getText();
                    buttonEl.click();
                    Thread.sleep(2000);
                    if (!searchPage.saveAndSendEmailButton.isDisplayed()) {
                        continue;
                    } else {
                        isSelected = true;
                        break;
                    }
                }
            }
            if (isSelected) {
                break;
            } else {
                searchPage.nextButton.click();
                Thread.sleep(8000);
                searchResults = WebDriverUtils.webDriver.findElement(By.id("advanced_search_results"))
                        .findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
            }
        }
    }

    public void selectActiveTrainee() throws Exception {
        MiscUtils.sleep(8000);
        List<WebElement> searchResults = WebDriverUtils.webDriver.findElement(By.id("advanced_search_results"))
                .findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        WebElement buttonEl;
        Boolean isSelected = false;
        while (true) {
            for (int i = 2; i < searchResults.size(); i++) {
                buttonEl = searchResults.get(i).findElement(By.tagName("button"));
                if (buttonEl.isEnabled()) {
                    SharedData.traineeName = searchResults.get(i).findElement(By.tagName("a")).getText();
                    buttonEl.click();
                    MiscUtils.sleep(2000);
                    if (!searchPage.saveAndSendEmailButton.isDisplayed() && !searchPage.yesButtonforRenewal.isDisplayed()) {
                        continue;
                    } else {
                        isSelected = true;
                        break;
                    }
                }
            }
            if (isSelected) {
                break;
            } else {
                searchPage.nextButton.click();
                MiscUtils.sleep(8000);
                searchResults = WebDriverUtils.webDriver.findElement(By.id("advanced_search_results"))
                        .findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
            }
        }
    }

    public void selectReviewExistingIDP() throws Exception {

        MiscUtils.sleep(8000);
        List<WebElement> searchResults = WebDriverUtils.webDriver.findElement(By.id("advanced_search_results"))
                .findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        WebElement buttonEl;
        Boolean isSelected = false;
        while (true) {
            for (int i = 0; i < searchResults.size(); i++) {
                buttonEl = searchResults.get(i).findElement(By.tagName("button"));
                if (buttonEl.isEnabled()) {
                    SharedData.traineeName = searchResults.get(i).findElement(By.tagName("a")).getText();
                    buttonEl.click();
                    isSelected = true;
                    break;
                }
            }
            if (isSelected) {
                break;
            } else {
                searchPage.nextButton.click();
                MiscUtils.sleep(8000);
                searchResults = WebDriverUtils.webDriver.findElement(By.id("advanced_search_results"))
                        .findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
            }
        }
    }

    public Boolean isIDPFormDisplayed() {
        CommonUtils.waitForVisibility(searchPage.saveAndSendEmailButton);
        return searchPage.saveAndSendEmailButton.isDisplayed();
    }

    public void clickOnCloseButton() {
        CommonUtils.clickOnElement(searchPage.closeButton);
    }

    public void clickOnSaveAndSendMailButton() {
        CommonUtils.clickOnElement(searchPage.saveAndSendEmail);
    }

    public void clickOnOkButton() {
        CommonUtils.waitForVisibility(searchPage.okButton);
        CommonUtils.clickOnElement(searchPage.okButton);
    }

    public void clickYesButtonForRenewal() {
        CommonUtils.waitForVisibility(searchPage.yesButtonforRenewal);
        CommonUtils.clickOnElement(searchPage.yesButtonforRenewal);
    }

    public void selectNCITrainingOrganization(String optionText) {
        eidpBasePage.selectOption(searchPage.nciTrainingOrganizationDropdown, optionText);
    }

    public void selectTrainneTitle(String title) {
        try {
            CommonUtils.clickOnElement(searchPage.fellowTrainingTitleDropdownClick);
            CommonUtils.sendKeys(searchPage.fellowTrainingTitleDropdown, title);
            CommonUtils.clickOnElement(searchPage.fellowTrainingTitleSelections);
        } catch (Exception e) {
            throw e;
        }
    }

    public void resonForReviseIDP(String idpReason) {
        if (idpReason.contains("Primary")) {
            WebDriverUtils.webDriver
                    .findElement(By.xpath("//span[@id=\"forStartedLegend\"]/following-sibling::div/label[1]")).click();
            return;
        }
        if (idpReason.contains("Lab")) {
            WebDriverUtils.webDriver
                    .findElement(By.xpath("//span[@id=\"forStartedLegend\"]/following-sibling::div/label[2]")).click();
            return;
        }
        if (idpReason.contains("follow")) {
            WebDriverUtils.webDriver
                    .findElement(By.xpath("//span[@id=\"forStartedLegend\"]/following-sibling::div/label[3]")).click();
            return;
        }
        if (idpReason.contains("Other")) {
            WebDriverUtils.webDriver
                    .findElement(By.xpath("//span[@id=\"forStartedLegend\"]/following-sibling::div/label[4]")).click();
            WebDriverUtils.webDriver.findElement(By.id("another-idp-reason-other")).sendKeys("Automation");
            return;
        }
    }

    public void selectCurrentIDPStatus(String optionText) {
        eidpBasePage.selectOption(searchPage.nciCurrentIDPStatus, optionText);
    }

    public String getTraineeName() {
        return searchPage.traineeName.getText();
    }

    public Boolean isIDPInitationSuccess() throws Exception {
        Thread.sleep(12000);
        CommonUtils.waitForVisibility(searchPage.idpInitiationMessage);
        Thread.sleep(1000);

        return searchPage.idpInitiationMessage.isDisplayed();
    }

    public void clickOnButton(String buttonName) {
        String xpath = "//button[text()='" + buttonName + "']";
        WebDriverUtils.webDriver.findElement(By.xpath(xpath)).click();
    }

    public void selectCheckBox(String value) {
        String xpath = "//label[normalize-space()='" + value + "']//input[@type='checkbox']";
        WebDriverUtils.webDriver.findElement(By.xpath(xpath)).click();
    }

    public void clickOnButtonInGrid(String button) {
        String xpath = "//button[@data-original-title='" + button + "']";
        WebDriverUtils.webDriver.findElement(By.xpath(xpath)).click();
    }

    public void clickOnPopUpYesButton() {
        String xpath = "//button[text()='Yes' and not(@id)]";
        WebDriverUtils.webDriver.findElement(By.xpath(xpath)).click();
    }

    public void clickOnSearchButton() {
        CommonUtils.waitForClickability(searchPage.searchButton);
        CommonUtils.clickOnElement(searchPage.searchButton);
    }

    public void setTraineesWithoutIDP() {
        CommonUtils.clickOnElement(searchPage.traineeWithoutIDPCHeckBox);
    }

    // Method for IDPCheckbox
    public void checkTraineeWithIDPCheckbox() {
        CommonUtils.clickOnElement(searchPage.traineesWithIDPCheckbox);
    }

    public void enterTraineeFirstName(String enterName) {
        searchPage.TraineeFirstName.sendKeys(enterName);
    }

    public void enterTraineeLastName(String enterName) {
        searchPage.trainneLastName.sendKeys(enterName);
    }

    public void verifyFirmlyExpectedName(String expectedFirstName, String expectedLastName) {
        String expectedFullName = expectedLastName + ", " + expectedFirstName;
        String actualFullName = searchPage.searchResultTableFirstRowFirstCell.getText();
        Assert.assertEquals(expectedFullName, actualFullName);
    }

    public void verifyFirmlyClassificationType(String expectedClassificationType) {
        String actualClassificationType = searchPage.searchResultTableFirstRowThirdCell.getText();
        Assert.assertEquals(expectedClassificationType.toUpperCase(), actualClassificationType);
    }

    public void selectPrimaryMentorName() {
        CommonUtils.clickOnElement(searchPage.selectPrimaryMentor);
    }

    public void verifyTraineeUnderPrimaryMentor(String primaryMentor) {
        eidpBasePage.selectOption(searchPage.choosePrimaryMentor, primaryMentor);
        clickOnSearchButton();
        MiscUtils.sleep(3000);
        for (WebElement row : searchPage.rowsPM) {
            row.click();
            eidpBasePage.scrollToElement(searchPage.traineeNameText);
            String actualName = searchPage.traineeNameText.getText();
            Assert.assertEquals(primaryMentor, actualName);
            CucumberLogUtils.logScreenshot();
            row.click();
            MiscUtils.sleep(5000);
        }
    }

    public void clickOnSearchButtonGloriaCalloway() {
        CommonUtils.clickOnElement(searchPage.searchButtonCallowayGloria);
    }

    public void verifyGloriaCallowayExpectedName(String expectedFirstName, String expectedLastName) {
        String expectedFullName = expectedLastName + ", " + expectedFirstName;
        String actualFullName = searchPage.searchResultTableFirstRowThirdCellCalloway.getText();
        Assert.assertEquals(expectedFullName, actualFullName);
    }

    public void selectClassificationTypeGloriaCalloway(String type) {
        CommonUtils.clickOnElement(searchPage.classificationTypeInput);
        CommonUtils.selectDropDownValue(type, searchPage.classificationTypeDropDownGloriaGalloway);
    }

    public void selectPrimaryMentorName(String nameMentor) {
        CommonUtils.clickOnElement(searchPage.selectPrimaryMentor);
        CommonUtils.selectDropDownValue(nameMentor, searchPage.choosePrimaryMentor);
        CommonUtils.clickOnElement(searchPage.selectPrimaryMentor);
    }

    public void selectTrainingOrganization(String organizationName) {
        CommonUtils.clickOnElement(searchPage.selectTrainingOrganizationDropdown);
    }

    public void verifyTraineeOrganization(String nameOrg) {
        eidpBasePage.selectOption(searchPage.chooseCBIIT, nameOrg);
        MiscUtils.sleep(3000);
        clickOnSearchButton();
        MiscUtils.sleep(3000);
        List<WebElement> rows = WebDriverUtils.webDriver.findElements(By.cssSelector("td.sorting_2"));
        for (WebElement each : rows) {
            WebElement nameOrgList = WebDriverUtils.webDriver
                    .findElement(By.xpath("//table[@id='advanced_search_results']//tbody//tr[1]//td[4]"));
            eidpBasePage.scrollToElement(nameOrgList);
            if (each.getText().equals(nameOrg)) {
                Assert.assertTrue(each.getText().equals(nameOrg));
                MiscUtils.sleep(3000);
            }
        }
    }

    public void verifyClassificationType(String type) {
        for (WebElement eachRow : searchPage.rowsVerificationType) {
            eachRow.click();
            MiscUtils.sleep(1000);     
            eidpBasePage.scrollToElement(searchPage.classificationTypeText);
            String actualType = searchPage.classificationTypeText.getText();
            Assert.assertEquals(type.toUpperCase(), actualType);
            CucumberLogUtils.logScreenshot();
            eachRow.click();
        }
    }

    public void selectDropdownNIHSACGloriaCalloway(String SACname) {
        CommonUtils.selectDropDownValue(searchPage.chooseDropdownNIHSACGloriaCalloway, SACname);
    }

    public void verifyNIHSAAC(String name) {
        List<WebElement> rows = WebDriverUtils.webDriver
                .findElements(By.cssSelector("sorting_1 dtr-control::before"));
        for (WebElement each : rows) {
            WebElement nameofList = WebDriverUtils.webDriver
                    .findElement(By.xpath("//table[@id ='search-results']//tbody//tr[1]//td[5]"));
            eidpBasePage.scrollToElement(nameofList);
            if (each.getText().contains(name)) {
                Assert.assertTrue(each.getText().contains(name));
            } else {
                Assert.fail("RESULT DOES NOT EXIST" + name);
            }
        }
    }
}