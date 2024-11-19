package ServiceNow.PlatformBusinessApps.SNOWOBF.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOWOBF.Pages.OBF_NCI_Portal_Form_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.Pages.NCISP_Portal_Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class OBF_NCI_Portal_Form_StepImpl {

    /**
     * THIS METHOD NAVIGATES TO OBF Systems Support PORTAL PAGE
     * @param obfSupportSystemTitle
     */
    public static void i_navigate_to_the_nci_service_now_homepage_portal_form(String obfSupportSystemTitle) {
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.servicesLink);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.servicesLink).setExact(true)).click();
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.cbiit_BusinessServicesLink);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.cbiit_BusinessServicesLink)).first().click();
        assertThat(page.locator(NCISP_Portal_Page.administrative_BusinessServicesLinkLocator)).containsText(NCISP_Portal_Page.administrative_BusinessServicesLink);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.administrative_BusinessPageLink)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        page.getByText(NCISP_Portal_Page.obf_SystemsSupportPageLink).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(NCISP_Portal_Page.nciPageLinksLocator)).containsText(NCISP_Portal_Page.obf_SystemsSupportLink);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop).getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop)).containsText(obfSupportSystemTitle);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * THIS METHOD VERIFIES ALL FIELDS ON OBF SYSTEMS SUPPORT FORM
     * AND SUBMITS THE OBF SYSTEMS SUPPORT FORM ON PORTAL
     */
    public static void i_should_see_that_i_can_navigate_to_the_obf_systems_support_application() {
        assertThat(page.getByLabel("Required - Supervisor")).containsText("Supervisor");
        page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldLabel).highlight();
        page.screenshot();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorField).click();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName)).click();
        assertThat(page.locator("//span[@aria-label='Required - Administrative Officer (AO)']")).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerFieldTitleName);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerField).click();
        page.locator("#s2id_autogen7_search").click();
        page.locator("#s2id_autogen7_search").fill("Ann Davidson");
        page.getByText("Ann Davidson").click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldName);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldName).click();
        page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldName).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldTextBoxInput);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailField);
        page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailField, new Page.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailFieldInput);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneField);
        page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneField).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneFieldInput);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationField);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownSelectOneStreamBus)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicField);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOne)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOne))).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOne);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo);
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionThree)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionThree))).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionThree);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour))).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD);
        assertThat(page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).click();
        assertThat(page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetSupervisorRadioButtonSelectOptionFIELD)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetSupervisorRadioButtonSelectOptionFIELD)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD)).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD);
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).click();
        assertThat(page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox)).isVisible();
        page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBoxInput);
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//span[@aria-label='Administrative Resource Director (ARC)']")).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCFieldTitleName);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCField).click();
        page.locator("//input[@id='s2id_autogen8_search']").fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCName);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorARCName)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFive)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFive))).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFive);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOther)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).isVisible();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOther);
        assertThat(page.locator("#other_topic").getByText("Other Topic")).isVisible();
        assertThat(page.locator("#other_topic")).containsText("Other Topic");
        page.getByLabel("Other Topic").click();
        page.getByLabel("Other Topic").fill("Other");
        page.getByLabel("Other Topic").press("Enter");
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField);
        page.getByLabel("Description", new Page.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityField);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionOne)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionOne))).isVisible();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionOne)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionTwo)).click();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionThree)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionThree))).isVisible();
        page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionThree)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionFour)).click();
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionFour);
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField);
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmittedText)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.nativeViewLink)).click();
        OBF_NCI_NV_Form_StepImpl.deleteTheOBFTicketAutomationRecord();
    }

    /**
     * THIS METHOD VERIFIES THE TEXT ON TOP OF OBF SYSTEMS SUPPORT FORM
     * @param expectedText
     */
    public static void i_show_see_the_following_text_at_the_top_of_the_catalog_item(String expectedText) {
        assertThat(page.locator(OBF_NCI_Portal_Form_Page.obf_TextOnTheTop)).containsText(expectedText);
        CucumberLogUtils.playwrightScreenshot(page);
    }
}