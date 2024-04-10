package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.NCISP_Portal_Page;
import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Pages.OBF_NCI_Portal_Form_Page;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OBF_NCI_Portal_Form_StepImpl {

    /**
     * THIS METHOD NAVIGATES TO OBF Systems Support PORTAL PAGE
     */
    public static void i_navigate_to_the_nci_service_now_homepage_portal_form(String obfSupportSystem) {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("ServiceNow NCISP"));
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.servicesLink).setExact(true)).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.cbiit_BusinessServicesLink)).first().click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.administrative_BusinessServicesLink)).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop).getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(NCISP_Portal_Page.obf_SystemsSupportLink)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TitleOnTheTop)).containsText(obfSupportSystem);
    }

    /**
     * THIS METHOD VERIFIES ALL FIELDS ON OBF SYSTEMS SUPPORT FORM
     *
     * AND SUBMITS THE OBF SYSTEMS SUPPORT FORM ON PORTAL
     */
    public static void i_should_see_that_i_can_navigate_to_the_obf_systems_support_application() {
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldLabel)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldTitle);
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldLabel).highlight();
        PlaywrightUtils.page.screenshot();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SupervisorName)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerFieldLabel)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerFieldTitleName);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeOfficerName)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorFieldLabel)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorFieldTitleName);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorField).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorFieldTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorName);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_AdministrativeResourceDirectorName)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldName);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldName).click();
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldName).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_OrganizationalAffiliationFieldTextBoxInput);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailField);
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailField, new Page.GetByLabelOptions().setExact(true)).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_EmailFieldInput);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneField);
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneField).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_PhoneFieldInput);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationField);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_ApplicationFieldDropDownSelectOneStreamBus)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicField);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOne)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOne))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOne);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo))).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionTwo);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionThree)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionThree))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionThree);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFour);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD, new Locator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELDLOCATOR)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_AccessRequestedForFIELD);
        assertThat(PlaywrightUtils.page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetAnalystRadioButtonSelectOptionFIELD)).click();
        assertThat(PlaywrightUtils.page.getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetSupervisorRadioButtonSelectOptionFIELD)).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_RadioButtonsSelectOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_BudgetSupervisorRadioButtonSelectOptionFIELD)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD)).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELD);
        PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).click();
        assertThat(PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox)).isVisible();
        PlaywrightUtils.page.getByPlaceholder(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBox).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_WhatDocsDoesTheUserNeedFIELDTextBoxInput);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFive)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFive))).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionFive);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOther)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).isVisible();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_TopicFieldDropDownOptionOther);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator).getByText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField);
        PlaywrightUtils.page.getByLabel(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionField).fill(OBF_NCI_Portal_Form_Page.obf_Request_Form_DescriptionFieldInput);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityField);
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionOne)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionOne))).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionOne)).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionTwo)).click();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownLocator).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionThree)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionThree))).isVisible();
        PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionsLocator).filter(new Locator.FilterOptions().setHasText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionThree)).click();
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionFour)).click();
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_PriorityFieldDropDownOptionFour);
        assertThat(PlaywrightUtils.page.locator(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitFieldLocator)).containsText(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField);
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmitField)).click();
        PlaywrightUtils.page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(OBF_NCI_Portal_Form_Page.obf_Request_Form_SubmittedText)).click();
    }
}
