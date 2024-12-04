package PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.Steps;

import PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.stepsImpl.Travel_Request_NV_StepImpl;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Travel_Request_NV_Steps {

    @When("I search {string}, in the filter navigator,")
    public void i_search_in_the_filter_navigator(String travelPlanningSystem) {
        Travel_Request_NV_StepImpl.i_search_in_the_filter_navigator(travelPlanningSystem);
    }

    @Then("I will see Modules created for the {string}, {string}, {string},and {string} underneath Travel Planning System Application")
    public void i_will_see_modules_created_for_the_and_underneath_travel_planning_system_application(String travelRequest, String assignedToMe, String assignedToMyGroup, String myApprovals) {
        Travel_Request_NV_StepImpl.i_will_see_modules_created_for_the_and_underneath_application(travelRequest, assignedToMe, assignedToMyGroup, myApprovals);
    }

    @Given("that I am logged into ServiceNow Native View")
    public void that_i_am_logged_into_service_now_native_view() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    /**
     * Searches for a Group under System Security.
     */
    @When("I search for Group under System Security")
    public void i_search_for_group_under_system_security() {

        CucumberLogUtils.scenario.log("---- SEARCH THE SYSTEM SECURITY IN FILTER NAVIGATION NATIVE VIEW ----");
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("System Security");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        assertThat(page.getByPlaceholder("Filter")).hasValue("System Security");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- LOOK FOR THE GROUPS UNDER \"USERS AND GROUPS\" AND CLICK ON GROUPS ----");
        assertThat(page.locator("li").filter(new Locator.FilterOptions().setHasText("Users and GroupsUsersEdit"))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Groups").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Searches for a group by name.
     *
     * @param nciCGHTravelRequestBranchDirectors The name of the group to search for.
     */
    @When("I search for {string} group Name")
    public void i_search_for_group_name(String nciCGHTravelRequestBranchDirectors) {

        CucumberLogUtils.scenario.log("---- SEARCH FOR THE \"NCI CGH - TRAVEL REQUEST BRANCH DIRECTORS\" GROUP AND OPEN THE GROUP RECORD ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(nciCGHTravelRequestBranchDirectors);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).containsText(nciCGHTravelRequestBranchDirectors);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CLICK ON THE MOST TOP RECORD AND CLICK ON OPEN RECORD BUTTON ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: NCI CGH - Travel Request Branch Directors']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Name", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(nciCGHTravelRequestBranchDirectors);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the associated users are listed under the Group Members tab.
     *
     * @param dimetriaBranch    the name of the first associated user
     * @param kalinaDuncan      the name of the second associated user
     * @param markParascandola  the name of the third associated user
     */
    @When("I verify the associated users {string}, {string} and {string} are listed under the Group Members tab")
    public void i_verify_the_associated_users_and_are_listed_under_the_group_members_tab(String dimetriaBranch, String kalinaDuncan, String markParascandola) {

        CucumberLogUtils.scenario.log("---- CLICKS ON GROUP MEMBERS TAB ON THE BOTTOM OF THE PAGE AND VERIFY GROUP MEMBERS ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (3)")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (3)").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members (3)Show").locator("b")).containsText("Group = NCI CGH - Travel Request Branch Directors");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(dimetriaBranch);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(kalinaDuncan);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(markParascandola);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Go back to Groups page and search for the specified group name.
     * Opens the group record if found.
     *
     * @param nciCGHTravelRequestTravelPlanners The name of the group to search for.
     */
    @When("I go back to Groups and search for {string} group Name")
    public void i_go_back_to_groups_and_search_for_group_name(String nciCGHTravelRequestTravelPlanners) {

        CucumberLogUtils.scenario.log("---- GO BACK TO GROUPS PAGE AND SEARCH FOR THE \"NCI CGH - TRAVEL REQUEST TRAVEL PLANNERS\" GROUP AND OPEN THE GROUP RECORD ----");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Back").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(nciCGHTravelRequestTravelPlanners);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).containsText(nciCGHTravelRequestTravelPlanners);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CLICK ON THE MOST TOP RECORD AND CLICK ON OPEN RECORD BUTTON ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: NCI CGH - Travel Request Travel Planners']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Name", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(nciCGHTravelRequestTravelPlanners);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the associated users are listed under the Group Members tab.
     *
     * @param brianDavis   the name of the first associated user
     * @param dimetriaBranch   the name of the second associated user
     * @param jenniferBridges   the name of the third associated user
     * @param karenGrady   the name of the fourth associated user
     * @param ravenCoit   the name of the fifth associated user
     * @param susanGiuliani   the name of the sixth associated user
     */
    @When("I verify that the associated users {string}, {string}, {string} , {string}, {string} and {string} are listed under the Group Members tab")
    public void i_verify_that_the_associated_users_and_are_listed_under_the_group_members_tab(String brianDavis, String dimetriaBranch, String jenniferBridges, String karenGrady, String ravenCoit, String susanGiuliani) {

        CucumberLogUtils.scenario.log("---- CLICKS ON GROUP MEMBERS TAB ON THE BOTTOM OF THE PAGE AND VERIFY GROUP MEMBERS ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (6)")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (6)").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members (6)Show").locator("b")).containsText("Group = NCI CGH - Travel Request Travel Planners");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(brianDavis);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(dimetriaBranch);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(jenniferBridges);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(karenGrady);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(ravenCoit);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(susanGiuliani);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Go back again and search for the specified group name.
     * Opens the group record if found.
     *
     * @param nciCGHTravelRequestProxyUsers The name of the group to search for.
     */
    @When("I go back again and search for {string} group Name")
    public void i_go_back_again_and_search_for_group_name(String nciCGHTravelRequestProxyUsers) {

        CucumberLogUtils.scenario.log("---- GO BACK TO GROUPS PAGE AND SEARCH FOR THE \"NCI CGH - TRAVEL REQUEST PROXY USERS\" GROUP AND OPEN THE GROUP RECORD ----");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Back").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(nciCGHTravelRequestProxyUsers);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).containsText(nciCGHTravelRequestProxyUsers);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CLICK ON THE RECORD AND CLICK ON OPEN RECORD BUTTON ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: NCI CGH - Travel Request Proxy users']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Name", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(nciCGHTravelRequestProxyUsers);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the associated users are listed under the Group Members tab.
     *
     * @param dimetriaBranch    the name of the first associated user
     * @param kalinaDuncan      the name of the second associated user
     * @param markParascandola  the name of the third associated user
     */
    @Then("I verify that the associated users {string}, {string} and {string} should be listed under the Group Members tab")
    public void i_verify_that_the_associated_users_and_should_be_listed_under_the_group_members_tab(String dimetriaBranch, String kalinaDuncan, String markParascandola) {

        CucumberLogUtils.scenario.log("---- CLICKS ON GROUP MEMBERS TAB ON THE BOTTOM OF THE PAGE AND VERIFY GROUP MEMBERS ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (3)")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (3)").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members (3)Show").locator("b")).containsText("Group = NCI CGH - Travel Request Proxy users");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(dimetriaBranch);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(kalinaDuncan);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(markParascandola);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Searches for a Group under System Security.
     *
     * @param nciCGHTravelManagers The name of the group to search for.
     */
    @When("I search for {string} Group under System Security")
    public void i_search_for_group_under_system_security(String nciCGHTravelManagers) {

        CucumberLogUtils.scenario.log("---- SEARCH THE SYSTEM SECURITY IN FILTER NAVIGATION NATIVE VIEW ----");
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("System Security");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        assertThat(page.getByPlaceholder("Filter")).hasValue("System Security");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- LOOK FOR THE GROUPS UNDER \"USERS AND GROUPS\" AND CLICK ON GROUPS ----");
        assertThat(page.locator("li").filter(new Locator.FilterOptions().setHasText("Users and GroupsUsersEdit"))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Groups").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SEARCH FOR THE \"NCI CGH - TRAVEL MANAGER\" GROUP AND OPEN THE GROUP RECORD ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(nciCGHTravelManagers);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).containsText(nciCGHTravelManagers);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CLICK ON THE GROUP RECORD AND CLICK ON OPEN RECORD BUTTON ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: NCI CGH - Travel Managers']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Name", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(nciCGHTravelManagers);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the given string should be listed under the Group Member tab.
     *
     * @param dimetriaBranch The string to be verified.
     */
    @Then("I verify that {string} should be listed under the Group Member tab")
    public void i_verify_that_should_be_listed_under_the_group_member_tab(String dimetriaBranch) {

        CucumberLogUtils.scenario.log("---- CLICKS ON GROUP MEMBERS TAB ON THE BOTTOM OF THE PAGE AND VERIFY GROUP MEMBERS ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (1)")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (1)").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members (1)Show").locator("b")).containsText("Group = NCI CGH - Travel Managers");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(dimetriaBranch);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Searches for the "NCI CGH - Travel Request Branch Directors" group under System Security.
     *
     * @param nciCGHTravelRequestBranchDirectors The name of the group to search for
     */
    @When("I search for the {string} Groups under System Security")
    public void i_search_for_the_groups_under_system_security(String nciCGHTravelRequestBranchDirectors) {

        CucumberLogUtils.scenario.log("---- SEARCH THE SYSTEM SECURITY IN FILTER NAVIGATION NATIVE VIEW ----");
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("System Security");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        assertThat(page.getByPlaceholder("Filter")).hasValue("System Security");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- LOOK FOR THE GROUPS UNDER \"USERS AND GROUPS\" AND CLICK ON GROUPS ----");
        assertThat(page.locator("li").filter(new Locator.FilterOptions().setHasText("Users and GroupsUsersEdit"))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Groups").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SEARCH FOR THE \"\"NCI CGH - TRAVEL REQUEST BRANCH DIRECTORS\" GROUP AND OPEN THE GROUP RECORD ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(nciCGHTravelRequestBranchDirectors);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).containsText(nciCGHTravelRequestBranchDirectors);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CLICK ON THE GROUP RECORD AND CLICK ON OPEN RECORD BUTTON ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: NCI CGH - Travel Request Branch Directors']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Name", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(nciCGHTravelRequestBranchDirectors);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on Group members Tab on the bottom of the page and verifies that the Dimetria Branch is added to the CGH Branch Director Assignment Group.
     *
     * @param dimetriaBranch the name of the user to be verified in the group
     */
    @Then("I will see user {string} added to the CGH Branch Director Assignment Group.")
    public void i_will_see_user_added_to_the_cgh_branch_director_assignment_group(String dimetriaBranch) {

        CucumberLogUtils.scenario.log("---- CLICKS ON GROUP MEMBERS TAB ON THE BOTTOM OF THE PAGE AND VERIFY THAT DIMETRIA BRANCH IS ALSO ADDED TO THE GROUP ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (3)")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (3)").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members (3)Show").locator("b")).containsText("Group = NCI CGH - Travel Request Branch Directors");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(dimetriaBranch);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Searches for "NCI CGH - Travel Request Travel Planners" group under System Security.
     *
     * @param nciCGHTravelRequestTravelPlanners The name of the group to search for.
     */
    @When("I search for {string} Groups under System Security:")
    public void i_search_for_groups_under_system_security(String nciCGHTravelRequestTravelPlanners) {

        CucumberLogUtils.scenario.log("---- SEARCH THE SYSTEM SECURITY IN FILTER NAVIGATION NATIVE VIEW ----");
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("System Security");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        assertThat(page.getByPlaceholder("Filter")).hasValue("System Security");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- LOOK FOR THE GROUPS UNDER \"USERS AND GROUPS\" AND CLICK ON GROUPS ----");
        assertThat(page.locator("li").filter(new Locator.FilterOptions().setHasText("Users and GroupsUsersEdit"))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Groups").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SEARCH FOR THE \"\"NCI CGH - TRAVEL REQUEST BRANCH DIRECTORS\" GROUP AND OPEN THE GROUP RECORD ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(nciCGHTravelRequestTravelPlanners);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: NCI CGH - Travel")).containsText(nciCGHTravelRequestTravelPlanners);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CLICK ON THE GROUP RECORD AND CLICK ON OPEN RECORD BUTTON ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: NCI CGH - Travel Request Travel Planners']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Name", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(nciCGHTravelRequestTravelPlanners);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the Karen Grady is added to the NCI CGH - Travel Request Travel Planners Group.
     *
     * @param karenGrady The name of the user to be verified in the group.
     */
    @Then("I will see user {string} added to the CGH Travel Planners Assignment Group.")
    public void i_will_see_user_added_to_the_cgh_travel_planners_assignment_group(String karenGrady) {

        CucumberLogUtils.scenario.log("---- CLICKS ON GROUP MEMBERS TAB ON THE BOTTOM OF THE PAGE AND VERIFY THAT KAREN GRADY IS ALSO ADDED TO THE GROUP ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (6)")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Group Members (6)").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members (6)Show").locator("b")).containsText("Group = NCI CGH - Travel Request Travel Planners");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Group Members.").locator("tbody")).containsText(karenGrady);
        CucumberLogUtils.playwrightScreenshot(page);
    }
}