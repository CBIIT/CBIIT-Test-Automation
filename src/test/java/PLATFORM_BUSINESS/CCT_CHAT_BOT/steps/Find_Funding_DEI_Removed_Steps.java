package PLATFORM_BUSINESS.CCT_CHAT_BOT.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import PLATFORM_BUSINESS.CCT_CHAT_BOT.constants.CCT_CHAT_BOT_Constants;
import PLATFORM_BUSINESS.CCT_CHAT_BOT.pages.CCT_CHAT_BOT_Page;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Find_Funding_DEI_Removed_Steps {

    public static Page cctChatBotWindow;
    public static String firstTabUrl;

    /**
     * A user logs in to the application.
     */
    @Given("I am a user trying to access to Diversity Funding opportunities \\(DEI) Programs")
    public void i_am_a_user_trying_to_access_to_diversity_funding_opportunities_dei_programs() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    /**
     * Method for a user trying to access Diversity Funding opportunities (DEI) Programs.
     * @param URL
     */
    @When("I click on diversity program link {string}")
    public void i_click_on_diversity_program_link(String URL) {
        page.navigate(URL);
    }

    /**
     * Method to verify that the link is broken and goes to error page.
     * @param error404
     */
    @Then("I verify that the link is broken and goes to {string} error page")
    public void i_verify_that_the_link_is_broken_and_goes_to_error_page(String error404) {
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Not Found"))).isVisible();
        assertThat(page.getByRole(AriaRole.HEADING)).containsText("Not Found");
        assertThat(page.getByText("HTTP Error 404. The requested")).isVisible();
        assertThat(page.getByRole(AriaRole.PARAGRAPH)).containsText("HTTP Error 404. The requested resource is not found.");
        assertThat(page.getByRole(AriaRole.PARAGRAPH)).containsText(error404);
    }

    /**
     * Removes the DEI statement and question from the chatbot by interacting with the chatbot window.
     * Verifies that the DEI statement and question have been successfully removed.
     */
    @Then("the DEI statement and question should be removed from the chatbot")
    public void the_dei_statement_and_question_should_be_removed_from_the_chatbot() {
        page.navigate("https://service-test.nci.nih.gov/ncisp?id=nci_home");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Native View")).click();
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).click();
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).fill(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).press("Enter");
        assertThat(page.getByLabel(CCT_CHAT_BOT_Page.nv_Search_Filter_All_Menu_Label, new Page.GetByLabelOptions().setExact(true))).containsText(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator("//label[@id='active-filter-label']").isVisible();
        CommonUtils.sleep(5000);    //wait for the page to load
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID).selectOption(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).isVisible();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).hasValue(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator("//div[@id='root']").isVisible();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_CCT_CHATBOT_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Find_Funding_CCT_ChatBot_Selected)).click();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Header_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_VIRTUAL_AGENT_DESIGNER_TAB_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Topic_Name_Test_ID)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_BOX_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Language_Panel_Tab_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_LANGUAGES_TAB_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Languages_Tab)).click();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Language_Tab_Page_Test_Link_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_LANGUAGES_TAB_TEST_LINK_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        firstTabUrl =  page.url();
        cctChatBotWindow = page.waitForPopup(() -> {
            page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Language_Tab_Test_Link)).click();
        });
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        CommonUtils.sleep(5000); //wait for pop-up CCT ChatBot Window
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.PARAGRAPH)).containsText("NCI offers fellowships, research career development awards and education and training grants in all areas of cancer research. Each opportunity has certain eligibility criteria. May I help you find funding opportunities you could apply for?");
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Yes")).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText("Select the career stage most applicable to you.");
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 4 of")).containsText("Established Investigator");
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 4 of")).isVisible();
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 4 of").click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText("Let's start with where do you plan to conduct your cancer research training?");
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of 2")).containsText("USA");
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of 2")).isVisible();
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of 2").click();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText("USA");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);

        CucumberLogUtils.scenario.log("----- THIS DEI STATEMENT QUESTION AND TEXT IS REMOVED AS PER NEW ENHANCEMENT - VERIFYING THAT IS HAS BEEN REMOVED-----");
        String chatWindowText = cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").textContent();
        boolean textPresent = chatWindowText.contains("Do you consider yourself to belong to an underrepresented group in the biomedical research workforce?");
        Assert.assertFalse(textPresent, "---- VERIFY THAT THE TEXT IS NOT PRESENT IN THE CHAT WINDOW.----");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Method for simulating a user who is using the Find Funding Chat Bot.
     */
    @Given("I am a user who is using the Find Funding Chat Bot,")
    public void i_am_a_user_who_is_using_the_find_funding_chat_bot() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).click();
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).fill(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).press("Enter");
        assertThat(page.getByLabel(CCT_CHAT_BOT_Page.nv_Search_Filter_All_Menu_Label, new Page.GetByLabelOptions().setExact(true))).containsText(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator("//label[@id='active-filter-label']").isVisible();
        CommonUtils.sleep(5000);    //wait for the page to load
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID).selectOption(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).isVisible();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).hasValue(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator("//div[@id='root']").isVisible();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_CCT_CHATBOT_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Find_Funding_CCT_ChatBot_Selected)).click();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Header_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_VIRTUAL_AGENT_DESIGNER_TAB_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Topic_Name_Test_ID)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_BOX_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Language_Panel_Tab_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_LANGUAGES_TAB_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Languages_Tab)).click();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Language_Tab_Page_Test_Link_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_LANGUAGES_TAB_TEST_LINK_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        firstTabUrl =  page.url();
        cctChatBotWindow = page.waitForPopup(() -> {
            page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Language_Tab_Test_Link)).click();
        });
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        CommonUtils.sleep(5000); //wait for pop-up CCT ChatBot Window
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.PARAGRAPH)).containsText("NCI offers fellowships, research career development awards and education and training grants in all areas of cancer research. Each opportunity has certain eligibility criteria. May I help you find funding opportunities you could apply for?");
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Yes")).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Clicks on "Pre-Doctoral" the career stage option specified.
     *
     * @param preDoctoral The career stage option to be clicked.
     */
    @When("I click the career stage option: {string}")
    public void i_click_the_career_stage_option(String preDoctoral) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText("Select the career stage most applicable to you.");
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of")).containsText(preDoctoral);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of")).isVisible();
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of").click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Selects the specified option to the given question in the chatbot window.
     *
     * @param usa The option to be selected.
     * @param let_s_start_with_where_do_you_plan_to_conduct_your_cancer_research_training The question to answer.
     */
    @Then("I select option {string} to the question {string}")
    public void i_select_option_to_the_question(String usa, String let_s_start_with_where_do_you_plan_to_conduct_your_cancer_research_training) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(let_s_start_with_where_do_you_plan_to_conduct_your_cancer_research_training);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of 2")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of 2")).containsText(usa);
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 1 of 2").click();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText("USA");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Selects the specified option to the given question in the chatbot window.
     *
     * @param yes The option to be selected.
     * @param are_you_a_citizen The question to answer.
     */
    @Then("I select {string} to the question {string}")
    public void i_select_to_the_question(String yes, String are_you_a_citizen ) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("p").filter(new Locator.FilterOptions().setHasText("Are you a citizen of the USA"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("p").filter(new Locator.FilterOptions().setHasText("Are you a citizen of the USA"))).containsText(are_you_a_citizen);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(are_you_a_citizen);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Option 1 of"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(yes);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Option 1 of"))).containsText(yes);
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Option 1 of")).click();
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByText("Yes", new FrameLocator.GetByTextOptions().setExact(true)).nth(4).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByText("Yes", new FrameLocator.GetByTextOptions().setExact(true)).nth(4)).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByText("Yes", new FrameLocator.GetByTextOptions().setExact(true)).nth(4)).containsText(yes);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(yes);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the specified text is visible on top of the following links in the chatbot window.
     *
     * @param you_may_be_eligible_for_the_following_programs The text to verify on top of the links
     */
    @Then("I should see the text on top of the following links: {string}")
    public void i_should_see_the_text_on_top_of_the_following_links(String you_may_be_eligible_for_the_following_programs) {
        cctChatBotWindow.frameLocator("iframe[title='Conversation Preview Pane']").locator("now-chat-window").getByText("You may be eligible for the").scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByText("You may be eligible for the")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(you_may_be_eligible_for_the_following_programs);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the first link displayed in the chatbot window matches the provided link text.
     *
     * @param individual_Predoctoral_MDPhD_Degree_Fellows_F30_Link The expected text of the first link.
     */
    @Then("first of the links is {string}")
    public void first_of_the_links_is(String individual_Predoctoral_MDPhD_Degree_Fellows_F30_Link) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Individual Predoctoral MD/PhD"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(individual_Predoctoral_MDPhD_Degree_Fellows_F30_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the visibility and text content of the second link in the chatbot window.
     *
     * @param individual_Predoctoral_Fellows_F31_Link The text content of the second link to be verified.
     */
    @Then("second of the link is {string}")
    public void second_of_the_link_is(String individual_Predoctoral_Fellows_F31_Link) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(individual_Predoctoral_Fellows_F31_Link))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(individual_Predoctoral_Fellows_F31_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the third link in the chatbot window and takes a screenshot of the chat window.
     *
     * @param predoctoral_to_Postdoctoral_Fellow_Transition_Award_F99_K00_Link The text content of the third link to be verified.
     */
    @Then("third of the link is {string}")
    public void third_of_the_link_is(String predoctoral_to_Postdoctoral_Fellow_Transition_Award_F99_K00_Link) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Predoctoral to Postdoctoral"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(predoctoral_to_Postdoctoral_Fellow_Transition_Award_F99_K00_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the visibility and content of the fourth link in the chatbot window.
     *
     * @param institutional_Research_Training_Grant_T32_trainee_Link The text content of the fourth link to be verified.
     */
    @Then("fourth of the link is {string}")
    public void fourth_of_the_link_is(String institutional_Research_Training_Grant_T32_trainee_Link) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(institutional_Research_Training_Grant_T32_trainee_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Selects the specified option to the given question in the chatbot window.
     *
     * @param no The option to be selected.
     * @param are_you_a_citizen The question to answer.
     */
    @Then("I select the option {string} to the question {string}")
    public void i_select_the_option_to_the_question(String no, String are_you_a_citizen) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(are_you_a_citizen);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(no);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Option 2 of"))).isVisible();
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Option 2 of")).click();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(no);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the visibility and content of the one link in the chatbot window. for second flow of the predoctoral option
     * @param predoctoral_to_Postdoctoral_Fellow_Transition_Award_F99_K00_Link
     */
    @Then("the link for second flow is {string}")
    public void the_link_for_second_flow_is(String predoctoral_to_Postdoctoral_Fellow_Transition_Award_F99_K00_Link) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Predoctoral to Postdoctoral"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(predoctoral_to_Postdoctoral_Fellow_Transition_Award_F99_K00_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Clicks on the restart button in the chatbot window to start the next flow of the conversation.
     * This method waits for the previous flow to be completed, clicks on the restart button,
     * and verifies the new content loaded in the chatbot window for the next flow.
     */
    @Then("I click on restart button to start the next flow")
    public void i_click_on_restart_button_to_start_the_next_flow() {

        CucumberLogUtils.scenario.log("----- RESTARTING THE CHATBOT TO START THE NEXT FLOW -----");
        CommonUtils.sleep(1000); //wait for the previous flow to be completed
        assertThat(cctChatBotWindow.getByLabel("Restart", new Page.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(cctChatBotWindow.getByLabel("Restart", new Page.GetByLabelOptions().setExact(true))).containsText("Restart");
        cctChatBotWindow.getByLabel("Restart", new Page.GetByLabelOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        CommonUtils.sleep(5000); //wait for pop-up CCT ChatBot Window to load the next flow
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.PARAGRAPH)).containsText("NCI offers fellowships, research career development awards and education and training grants in all areas of cancer research. Each opportunity has certain eligibility criteria. May I help you find funding opportunities you could apply for?");
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Yes")).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Selects the "Outside the USA" option to the question "Let's start with where do you plan to conduct your cancer research training?"
     *
     * @param outsideTheUSA The option to be selected.
     * @param let_s_start_with_where_do_you_plan_to_conduct_your_cancer_research_training The question to answer.
     */
    @Then("I select the second option {string} to the question {string}")
    public void i_select_the_second_option_to_the_question(String outsideTheUSA, String let_s_start_with_where_do_you_plan_to_conduct_your_cancer_research_training) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(let_s_start_with_where_do_you_plan_to_conduct_your_cancer_research_training);
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 2 of 2")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 2 of 2")).containsText(outsideTheUSA);
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 2 of 2").click();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(outsideTheUSA);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the specified text is visible on top of the following links in the chatbot window.
     *
     * @param i_could_not_find_any_programs_that_you_may_be_eligible_for_but_please_check_this_page_for_other_resources The text to verify on top of the links
     */
    @Then("I should see the text for third flow on top of the following links: {string}")
    public void i_should_see_the_text_for_third_flow_on_top_of_the_following_links(String i_could_not_find_any_programs_that_you_may_be_eligible_for_but_please_check_this_page_for_other_resources) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByText("I could not find any programs")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(i_could_not_find_any_programs_that_you_may_be_eligible_for_but_please_check_this_page_for_other_resources);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the link for the third flow in the chatbot window.
     *
     * @param cancer_Funding_Resources The text content of the link to be verified.
     */
    @Then("the link for third flow is {string}")
    public void the_link_for_third_flow_is(String cancer_Funding_Resources) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Cancer funding resources ("))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(cancer_Funding_Resources);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Asserts that the first link displayed for the fourth flow is visible and contains the specified text.
     *
     * @param individualPredoctoral_MD_PhD_Degree_Fellows_F30 The text to verify in the link
     */
    @Then("the first link for fourth flow is {string}")
    public void the_first_link_for_fourth_flow_is(String individualPredoctoral_MD_PhD_Degree_Fellows_F30) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Individual Predoctoral MD/PhD"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(individualPredoctoral_MD_PhD_Degree_Fellows_F30);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the second link for the fourth flow in the chatbot window and contains the specified text.
     *
     * @param individual_Predoctoral_Fellows_F31_Link The text that should be present in the second link for the fourth flow.
     */
    @Then("the second link for fourth flow is {string}")
    public void the_second_link_for_fourth_flow_is(String individual_Predoctoral_Fellows_F31_Link) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Individual Predoctoral Fellows (F31) (opens in new tab)"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(individual_Predoctoral_Fellows_F31_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Clicks on "Post-Doctoral" the career stage option in the chatbot interface.
     *
     * @param postDoctoral The text representing the second career stage option to click on.
     */
    @When("I click the career stage second option {string}")
    public void i_click_the_career_stage_second_option(String postDoctoral) {
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 2 of")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 2 of")).containsText(postDoctoral);
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().getByLabel("Option 2 of").click();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(postDoctoral);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls into view and validates the visibility and text of the first link related to post-Doctoral category.
     *
     * @param nCI_Mentored_Research_Scientist_Development_Award_K01 The text to be validated within the link
     */
    @Then("first link of post-Doctoral first flow is {string}")
    public void first_link_of_post_doctoral_first_flow_is(String nCI_Mentored_Research_Scientist_Development_Award_K01) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Mentored_Research_Scientist_Development_Award_K01);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to the second link of the post-Doctoral first flow, verifies its visibility,
     * and checks if it contains the specified text.
     *
     * @param nCI_Pathway_to_Independence_Award_K99_R00 The text to check in the second link
     */
    @Then("second link of post-Doctoral first flow is {string}")
    public void second_link_of_post_doctoral_first_flow_is(String nCI_Pathway_to_Independence_Award_K99_R00) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Pathway_to_Independence_Award_K99_R00);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to and validates the visibility of the third link present in the post-Doctoral first flow window,
     * which has a specific role and name. Also checks if the link contains the provided text.
     *
     * @param national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32
     *        The text expected to be contained in the third link
     */
    @Then("third link of post-Doctoral first flow is {string}")
    public void third_link_of_post_doctoral_first_flow_is(String national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies the presence and text of the fourth link in the post-Doctoral first flow.
     *
     * @param career_Development_Award_for_Clinical_Oncology_K12_Scholar The name of the Career Development Award for Clinical Oncology K12 Scholar link to validate
     */
    @Then("fourth link of post-Doctoral first flow is {string}")
    public void fourth_link_of_post_doctoral_first_flow_is(String career_Development_Award_for_Clinical_Oncology_K12_Scholar) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(career_Development_Award_for_Clinical_Oncology_K12_Scholar);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to and validates the visibility of the fifth link of post-Doctoral first flow in the chat window.
     *
     * @param nCI_Transition_Career_Development_Award_K22 the text to validate in the link
     */
    @Then("fifth link of post-Doctoral first flow is {string}")
    public void fifth_link_of_post_doctoral_first_flow_is(String nCI_Transition_Career_Development_Award_K22) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Transition Career")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Transition Career"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Transition_Career_Development_Award_K22);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to and verifies the visibility of the sixth link of the post-Doctoral first flow.
     *
     * @param mentored_Quantitative_Research_Career_Award_K25 The text to be verified in the link.
     */
    @Then("sixth link of post-Doctoral first flow is {string}")
    public void sixth_link_of_post_doctoral_first_flow_is(String mentored_Quantitative_Research_Career_Award_K25) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Quantitative")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Quantitative"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(mentored_Quantitative_Research_Career_Award_K25);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to the seventh link of the post-Doctoral first flow and validates its visibility and text.
     *
     * @param nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00 the expected text of the link
     */
    @Then("seventh link of post-Doctoral first flow is {string}")
    public void seventh_link_of_post_doctoral_first_flow_is(String nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to the eighth link of the post-Doctoral first flow in the chat window and verifies its visibility
     * and text content.
     *
     * @param institutional_Research_Training_Grant_T32_trainee_Link the text content of the eighth link
     */
    @Then("eighth link of post-Doctoral first flow is {string}")
    public void eighth_link_of_post_doctoral_first_flow_is(String institutional_Research_Training_Grant_T32_trainee_Link) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(institutional_Research_Training_Grant_T32_trainee_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls into view and verifies the visibility and text of the link for the fourth flow of post-Doctoral.
     *
     * @param national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32 The text to verify in the link.
     */
    @Then("the link for fourth flow of post-Doctoral is {string}")
    public void the_link_for_fourth_flow_of_post_doctoral_is(String national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Clicks on the third option "Clinical Fellow" for selecting career stage in the chat interface.
     *
     * @param clinical_Fellow The label of the career stage option to click on.
     */
    @When("I click the career stage third option: {string}")
    public void i_click_the_career_stage_third_option(String clinical_Fellow) {
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 3 of")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 3 of")).containsText(clinical_Fellow);
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 3 of").click();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(clinical_Fellow);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the first link of Clinical Fellow first flow is displayed and contains the specified text.
     *
     * @param nCI_Mentored_Research_Scientist_Development_Award_K01 The text to be checked in the first link
     */
    @Then("first link of Clinical Fellow first flow is {string}")
    public void first_link_of_clinical_fellow_first_flow_is(String nCI_Mentored_Research_Scientist_Development_Award_K01) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Mentored_Research_Scientist_Development_Award_K01);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the second link displayed in the Clinical Fellow first flow is the expected link with the given text.
     *
     * @param nCI_Pathway_to_Independence_Award_K99_R00 the text of the link to verify
     */
    @Then("second link of Clinical Fellow first flow is {string}")
    public void second_link_of_clinical_fellow_first_flow_is(String nCI_Pathway_to_Independence_Award_K99_R00) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Mentored Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Pathway_to_Independence_Award_K99_R00);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Method to verify if the third link of the Clinical Fellow first flow is displayed and contains the specified text.
     *
     * @param national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32 The text to search for in the link.
     */
    @Then("third link of Clinical Fellow first flow is {string}")
    public void third_link_of_clinical_fellow_first_flow_is(String national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the fourth link of Clinical Fellow first flow is visible and contains the specified text.
     *
     * @param mentored_Clinical_Scientist_Research_Career_Development_Award_K08 the text to verify in the fourth link
     */
    @Then("fourth link of Clinical Fellow first flow is {string}")
    public void fourth_link_of_clinical_fellow_first_flow_is(String mentored_Clinical_Scientist_Research_Career_Development_Award_K08) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Clinical Scientist")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Clinical Scientist"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(mentored_Clinical_Scientist_Research_Career_Development_Award_K08);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to and verifies the visibility of the fifth link in the Clinical Fellow first flow.
     *
     * @param career_Development_Award_for_Clinical_Oncology_K12_Scholar String value representing the link to be verified
     */
    @Then("fifth link of Clinical Fellow first flow is {string}")
    public void fifth_link_of_clinical_fellow_first_flow_is(String career_Development_Award_for_Clinical_Oncology_K12_Scholar) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(career_Development_Award_for_Clinical_Oncology_K12_Scholar);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies if the sixth link of the Clinical Fellow first flow is displayed and contains the specified text.
     *
     * @param nCI_Transition_Career_Development_Award_K22 the text to verify within the sixth link
     */
    @Then("sixth link of Clinical Fellow first flow is {string}")
    public void sixth_link_of_clinical_fellow_first_flow_is(String nCI_Transition_Career_Development_Award_K22) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Transition Career")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Transition Career"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Transition_Career_Development_Award_K22);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies if the seventh link of the Clinical Fellow first flow matches the specified text.
     *
     * @param nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00 The text to be verified for the seventh link
     */
    @Then("seventh link of Clinical Fellow first flow is {string}")
    public void seventh_link_of_clinical_fellow_first_flow_is(String nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the eighth link of the Clinical Fellow first flow is displayed and contains the specified text.
     *
     * @param institutional_Research_Training_Grant_T32_trainee_Link the text to be verified within the eighth link
     */
    @Then("eighth link of Clinical Fellow first flow is {string}")
    public void eighth_link_of_clinical_fellow_first_flow_is(String institutional_Research_Training_Grant_T32_trainee_Link) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(institutional_Research_Training_Grant_T32_trainee_Link);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to and verifies the visibility of the first link for the second flow in the chat window.
     * This method applies to Post-Doctoral and Clinical Fellow second flow
     *
     * @param nCI_Pathway_to_Independence_Award_K99_R00 The name of the link to be verified.
     */
    @Then("the first link for second flow is {string}")
    public void the_first_link_for_second_flow_is(String nCI_Pathway_to_Independence_Award_K99_R00) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award (K99/R00) (opens in new tab)")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award (K99/R00) (opens in new tab)"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Pathway_to_Independence_Award_K99_R00);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Finds and validates the second link for Post-Doctoral and Clinical Fellow second flow with the specified text.
     *
     * @param nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00
     *        The text used to locate and validate the second link for Post-Doctoral and Clinical Fellow  second flow.
     */
    @Then("the second link for second flow is {string}")
    public void the_second_link_for_second_flow_is(String nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(nCI_Pathway_to_Independence_Award_for_Outstanding_Early_Stage_Postdoctoral_Researchers_K99_R00);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    @Then("the link for fourth flow is {string}")
    public void the_link_for_fourth_flow_is(String national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("National Research Service"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(national_Research_Service_Award_NRSA_for_Individual_Postdoctoral_Fellows_F32);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the second link for Clinical Fellow fourth flow is displayed and contains the specified text.
     *
     * @param mentored_Clinical_Scientist_Research_Career_Development_Award_K08 The text to verify within the second link
     */
    @Then("the second link for Clinical Fellow fourth flow is {string}")
    public void the_second_link_for_clinical_fellow_fourth_flow_is(String mentored_Clinical_Scientist_Research_Career_Development_Award_K08) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Clinical Scientist")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Clinical Scientist"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(mentored_Clinical_Scientist_Research_Career_Development_Award_K08);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Clicks on the career stage fourth option Established_Investigator in the chatbot window.
     *
     * @param established_Investigator The text of the fourth option representing an established investigator.
     */
    @When("I click the career stage fourth option: {string}")
    public void i_click_the_career_stage_fourth_option(String established_Investigator) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of").scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of")).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of")).containsText(established_Investigator);
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of").click();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(established_Investigator);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls to the first link of Established Investigator specified by the provided name,
     * validates its visibility, and checks if it contains the specified text.
     *
     * @param career_Development_Award_for_Community_Oncology_and_Prevention_Research_K12_PI the name of the link to be validated
     */
    @Then("first link of Established Investigator is {string}")
    public void first_link_of_established_investigator_is(String career_Development_Award_for_Community_Oncology_and_Prevention_Research_K12_PI) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for Community Oncology and Prevention Research (K12)")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for Community Oncology and Prevention Research (K12)"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(career_Development_Award_for_Community_Oncology_and_Prevention_Research_K12_PI);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scrolls the chat window to the second link of Established Investigator, verifies its visibility,
     * and checks if it contains the specified text.
     *
     * @param career_Development_Award_for_Clinical_Oncology_K12_PI The text content to check within the link.
     */
    @Then("second link of Established Investigator is {string}")
    public void second_link_of_established_investigator_is(String career_Development_Award_for_Clinical_Oncology_K12_PI) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for Clinical Oncology (K12) PI (opens in new tab)")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Career Development Award for Clinical Oncology (K12) PI (opens in new tab)"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(career_Development_Award_for_Clinical_Oncology_K12_PI);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies and interacts with the third link of the Established Investigator flow.
     *
     * @param mentored_Quantitative_Research_Career_Award_K25 the text of the third link to be checked
     */
    @Then("third link of Established Investigator flow is {string}")
    public void third_link_of_established_investigator_flow_is(String mentored_Quantitative_Research_Career_Award_K25) {
        cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Quantitative")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Mentored Quantitative"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title='Conversation Preview Pane']").contentFrame().locator("now-chat-window")).containsText(mentored_Quantitative_Research_Career_Award_K25);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the fourth link of the Established Investigator flow is displayed and contains specific text.
     *
     * @param cancer_Research_Education_Grants_Program_R25 The expected text of the link
     */
    @Then("fourth link of Established Investigator flow is {string}")
    public void fourth_link_of_established_investigator_flow_is(String cancer_Research_Education_Grants_Program_R25) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Cancer Research Education")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Cancer Research Education"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(cancer_Research_Education_Grants_Program_R25);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Scroll to and validate the visibility of the fifth link in the Established Investigator flow.
     *
     * @param institutional_Research_Training_Grant_T32_PI The text to be validated in the fifth link
     */
    @Then("fifth link of Established Investigator flow is {string}")
    public void fifth_link_of_established_investigator_flow_is(String institutional_Research_Training_Grant_T32_PI) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Institutional Research"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText(institutional_Research_Training_Grant_T32_PI);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies if the specified link appears in the chat window.
     *
     * @param globalResearchTrainingD43 the text of the link to be verified
     */
    @Then("the following link should appear {string}")
    public void the_following_link_should_appear(String globalResearchTrainingD43) {
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Global Research Training (D43")).scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Global Research Training (D43"))).isVisible();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText("Global Research Training (D43)");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }
}