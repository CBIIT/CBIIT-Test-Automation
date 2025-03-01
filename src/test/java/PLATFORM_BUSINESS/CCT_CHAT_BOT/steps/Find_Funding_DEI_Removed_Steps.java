package PLATFORM_BUSINESS.CCT_CHAT_BOT.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import PLATFORM_BUSINESS.CCT_CHAT_BOT.constants.CCT_CHAT_BOT_Constants;
import PLATFORM_BUSINESS.CCT_CHAT_BOT.pages.CCT_CHAT_BOT_Page;
import com.microsoft.playwright.FrameLocator;
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
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByRole(AriaRole.PARAGRAPH)).containsText("NCI offers fellowships, research career development awards and education and training grants in all areas of cancer research. Each opportunity has certain eligibility criteria. May I help you find funding opportunities you could apply for?");
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Yes")).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText("Select the career stage most applicable to you.");
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of")).containsText("Established Investigator");
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of")).isVisible();
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 4 of").click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText("Let's start with where do you plan to conduct your cancer research training?");
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 1 of 2")).containsText("USA");
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 1 of 2")).isVisible();
        cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().getByLabel("Option 1 of 2").click();
        assertThat(cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window")).containsText("USA");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);

        CucumberLogUtils.scenario.log("----- THIS DEI STATEMENT QUESTION AND TEXT IS REMOVED AS PER NEW ENHANCEMENT - VERIFYING THAT IS HAS BEEN REMOVED-----");
        String chatWindowText = cctChatBotWindow.locator("iframe[title=\"Conversation Preview Pane\"]").contentFrame().locator("now-chat-window").textContent();
        boolean textPresent = chatWindowText.contains("Do you consider yourself to belong to an underrepresented group in the biomedical research workforce?");
        Assert.assertFalse(textPresent, "---- VERIFY THAT THE TEXT IS NOT PRESENT IN THE CHAT WINDOW.----");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }
}